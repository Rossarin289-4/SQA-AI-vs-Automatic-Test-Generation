package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setBaseSectionOutlineStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:9>"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setParent", new String[]{"org.jfree.chart.plot.Plot"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.chart.plot.PiePlot", "getSimpleLabelOffset", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getSectionKey", new String[]{"int"}, new String[]{"-67108860"}, false, 0, new String[][]{{"org.jfree.chart.plot.PiePlot", "getShadowXOffset", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-67108860", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getMaximumExplodePercent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.PiePlot", "setDataset", "org.jfree.data.general.PieDataset", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setBaseSectionPaint", new String[]{"java.awt.Paint"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setLabelDistributor", new String[]{"org.jfree.chart.plot.AbstractPieLabelDistributor"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"org.jfree.chart.plot.PiePlot", "equals", "java.lang.Object", "<i:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "drawItem", new String[]{"java.awt.Graphics2D", "int", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.PiePlotState", "int"}, new String[]{"<sample:6>", "2147483647", "<sample:7>", "<sample:5>", "2147483619"}, false, 7, new String[][]{{"org.jfree.chart.plot.PiePlot", "getLabelGenerator", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "lookupSectionOutlinePaint", new String[]{"java.lang.Comparable", "boolean"}, new String[]{"<s:,>", "false"}, false, 0, new String[][]{{"org.jfree.chart.plot.PiePlot", "getSectionOutlinePaint", "java.lang.Comparable", "<s:b>"}}, 1), new String[][]{{"getRGBComponents", "float[]", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getSimpleLabels", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setBaseSectionOutlineStroke", new String[]{"java.awt.Stroke"}, new String[]{"<null>"}, false, 7, new String[][]{{"org.jfree.chart.plot.PiePlot", "getSectionPaint", "java.lang.Comparable", "<s:a>"}, {"org.jfree.chart.plot.PiePlot", "setLabelPadding", "org.jfree.chart.util.RectangleInsets", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setShadowPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jfree.chart.plot.PiePlot", "axisChanged", "org.jfree.chart.event.AxisChangeEvent", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getLegendItems", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.PiePlot", "setShadowYOffset", "double", "0.04"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.LegendItemCollection", actual.getClass().getName());
  assertEquals("{getItemCount=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getURLGenerator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.PiePlot", "setSectionOutlinesVisible", "boolean", "false"}, {"org.jfree.chart.plot.PiePlot", "getExplodePercent", "java.lang.Comparable", "<s:ky>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setExplodePercent", new String[]{"java.lang.Comparable", "double"}, new String[]{"<null>", "1.9999999999999998"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getSectionKey", new String[]{"int"}, new String[]{"-1"}, false, 3, new String[][]{{"org.jfree.chart.plot.PiePlot", "getLegendItems", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setShadowXOffset", new String[]{"double"}, new String[]{"0"}, false, 6, new String[][]{{"org.jfree.chart.plot.PiePlot", "setInteriorGap", "double", "0.25"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.25, getLabelGap=0.0...#406#1515534784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getLabelDistributor", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.plot.PiePlot", "drawLeftLabels", "org.jfree.data.KeyedValues,java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,float,org.jfree.chart.plot.PiePlotState", "<sample:4>", "<sample:3>", "<sample:4>", "<sample:2>", "2.0", "<sample:5>"}, {"org.jfree.chart.plot.PiePlot", "getLabelLinkStroke", ""}}, 3), new String[][]{{"getPieLabelRecord", "int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getSectionKey", new String[]{"int"}, new String[]{"360"}, false, 3, new String[][]{{"org.jfree.chart.plot.PiePlot", "setSectionOutlineStroke", "java.lang.Comparable,java.awt.Stroke", "<s:5ky>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getRootPlot", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.PiePlot", "setCircular", "boolean,boolean", "true", "false"}}), new String[][]{{"getBaseSectionPaint", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=128,g=128,b=128] {getAlpha=255, getBlue=128, getGreen=128, getRGB=-8355712, getRed=128, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getLabelFont", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.PiePlot", "setLabelGenerator", "org.jfree.chart.labels.PieSectionLabelGenerator", "<null>"}, {"org.jfree.chart.plot.PiePlot", "lookupSectionOutlineStroke", "java.lang.Comparable", "<i:-1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.awt.Font", actual.getClass().getName());
  assertEquals("java.awt.Font[family=SansSerif,name=SansSerif,style=plain,size=10] {getAvailableAttributes=[java.awt.font.TextAttribute(family), java.awt.font.TextAttr.., getFamily=SansSerif, getFontName=SansSerif.pl...#452#-637631174", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getLabelOutlinePaint", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.PiePlot", "setLabelFont", "java.awt.Font", "<null>"}, {"org.jfree.chart.plot.PiePlot", "setLabelPaint", "java.awt.Paint", "<sample:8>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=0] {getAlpha=255, getBlue=0, getGreen=0, getRGB=-16777216, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setSimpleLabelOffset", new String[]{"org.jfree.chart.util.RectangleInsets"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jfree.chart.plot.PiePlot", "setLabelLinkStroke", "java.awt.Stroke", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getSectionKey", new String[]{"int"}, new String[]{"2147483647"}, false, 3, new String[][]{{"org.jfree.chart.plot.PiePlot", "getBackgroundPaint", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setCircular", new String[]{"boolean", "boolean"}, new String[]{"true", "true"}, false, 0, new String[][]{{"org.jfree.chart.plot.PiePlot", "setLabelGap", "double", "0.4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.4...#404#183082588", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "drawRightLabels", new String[]{"org.jfree.data.KeyedValues", "java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "java.awt.geom.Rectangle2D", "float", "org.jfree.chart.plot.PiePlotState"}, new String[]{"<sample:5>", "<sample:1>", "<null>", "<sample:5>", "4.0", "<sample:6>"}, false, 0, new String[][]{{"org.jfree.chart.plot.PiePlot", "setInteriorGap", "double", "-0.0025"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setLegendItemShape", new String[]{"java.awt.Shape"}, new String[]{"<sample:9>"}, false, 1, new String[][]{{"org.jfree.chart.plot.PiePlot", "setToolTipGenerator", "org.jfree.chart.labels.PieToolTipGenerator", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setLabelShadowPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"org.jfree.chart.plot.PiePlot", "getLegendLabelToolTipGenerator", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setLegendLabelURLGenerator", new String[]{"org.jfree.chart.urls.PieURLGenerator"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.jfree.chart.plot.PiePlot", "getLabelDistributor", ""}, {"org.jfree.chart.plot.PiePlot", "setSectionPaint", "java.lang.Comparable,java.awt.Paint", "<s:Cy6>", "<sample:6>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setNoDataMessagePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:8>"}, false, 1, new String[][]{{"org.jfree.chart.plot.PiePlot", "setLegendLabelGenerator", "org.jfree.chart.labels.PieSectionLabelGenerator", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getBaseSectionOutlinePaint", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.plot.PiePlot", "setDataset", "org.jfree.data.general.PieDataset", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=128,g=128,b=128] {getAlpha=255, getBlue=128, getGreen=128, getRGB=-8355712, getRed=128, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getSectionKey", new String[]{"int"}, new String[]{"-67108860"}, false, 0, new String[][]{{"org.jfree.chart.plot.PiePlot", "setLabelOutlineStroke", "java.awt.Stroke", "<sample:9>"}, {"org.jfree.chart.plot.PiePlot", "setInteriorGap", "double", "1.7976931348623157E308"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-67108860", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getLabelPadding", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.chart.plot.PiePlot", "getBackgroundAlpha", ""}, {"org.jfree.chart.plot.PiePlot", "isCircular", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleInsets", actual.getClass().getName());
  assertEquals("RectangleInsets[t=2.0,l=2.0,b=2.0,r=2.0] {getBottom=2.0, getLeft=2.0, getRight=2.0, getTop=2.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setLabelDistributor", new String[]{"org.jfree.chart.plot.AbstractPieLabelDistributor"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.jfree.chart.plot.PiePlot", "setMinimumArcAngleToDraw", "double", "0.4000000000000001"}, {"org.jfree.chart.plot.PiePlot", "setURLGenerator", "org.jfree.chart.urls.PieURLGenerator", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setCircular", new String[]{"boolean"}, new String[]{"false"}, false, 6, new String[][]{{"org.jfree.chart.plot.PiePlot", "getSectionOutlinesVisible", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setLabelBackgroundPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:8>"}, false, 3, new String[][]{{"org.jfree.chart.plot.PiePlot", "getDirection", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getLabelPaint", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.chart.plot.PiePlot", "getLegendLabelURLGenerator", ""}}), new String[][]{{"getBlue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setLegendLabelToolTipGenerator", new String[]{"org.jfree.chart.labels.PieSectionLabelGenerator"}, new String[]{"<sample:8>"}, false, 2, new String[][]{{"org.jfree.chart.plot.PiePlot", "draw", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.awt.geom.Point2D,org.jfree.chart.plot.PlotState,org.jfree.chart.plot.PlotRenderingInfo", "<sample:7>", "<sample:6>", "<sample:2>", "<sample:7>", "<sample:4>"}, {"org.jfree.chart.plot.PiePlot", "setPieIndex", "int", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#416#1925200497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setBaseSectionOutlinePaint", new String[]{"java.awt.Paint"}, new String[]{"<null>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getLabelGap", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.PiePlot", "setLabelPadding", "org.jfree.chart.util.RectangleInsets", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.025", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setLegendItemShape", new String[]{"java.awt.Shape"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.jfree.chart.plot.PiePlot", "getBaseSectionOutlineStroke", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "drawRightLabels", new String[]{"org.jfree.data.KeyedValues", "java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "java.awt.geom.Rectangle2D", "float", "org.jfree.chart.plot.PiePlotState"}, new String[]{"<sample:4>", "<sample:0>", "<sample:5>", "<sample:2>", "1.0", "<sample:0>"}, false, 0, new String[][]{{"org.jfree.chart.plot.PiePlot", "setLabelLinkStroke", "java.awt.Stroke", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setExplodePercent", new String[]{"java.lang.Comparable", "double"}, new String[]{"<s:5/ky>", "0.8999999999999999"}, false, 2, new String[][]{{"org.jfree.chart.plot.PiePlot", "setLabelOutlinePaint", "java.awt.Paint", "<sample:6>"}, {"org.jfree.chart.plot.PiePlot", "getLabelShadowPaint", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setStartAngle", new String[]{"double"}, new String[]{"1.5912249320111808E18"}, false, 0, new String[][]{{"org.jfree.chart.plot.PiePlot", "setIgnoreZeroValues", "boolean", "true"}, {"org.jfree.chart.plot.PiePlot", "getNoDataMessageFont", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=true, getInteriorGap=0.08, getLabelGap=0.02...#405#1866386810", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getLabelBackgroundPaint", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.PiePlot", "getToolTipGenerator", ""}}), new String[][]{{"getAlpha", "", "3"}, {"getColorSpace", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.awt.color.ICC_ColorSpace", actual.getClass().getName());
  assertEquals("{getNumComponents=3, getType=5, isCS_sRGB=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setLabelLinkPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"org.jfree.chart.plot.PiePlot", "setSimpleLabels", "boolean", "false"}, {"org.jfree.chart.plot.PiePlot", "getShadowYOffset", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getArcBounds", new String[]{"java.awt.geom.Rectangle2D", "java.awt.geom.Rectangle2D", "double", "double", "double"}, new String[]{"<sample:2>", "<null>", "-361.9", "723.7840000000001", "0.0"}, false, 0, new String[][]{{"org.jfree.chart.plot.PiePlot", "getStartAngle", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getBaseSectionOutlineStroke", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.PiePlot", "setSimpleLabelOffset", "org.jfree.chart.util.RectangleInsets", "<null>"}}), new String[][]{{"getLineJoin", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getLegendLabelGenerator", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.PiePlot", "setDirection", "org.jfree.chart.util.Rotation", "<sample:1>"}, {"org.jfree.chart.plot.PiePlot", "setLegendLabelGenerator", "org.jfree.chart.labels.PieSectionLabelGenerator", "<sample:2>"}}), new String[][]{{"generateSectionLabel", "org.jfree.data.general.PieDataset,java.lang.Comparable", "0"}, {"generateAttributedSectionLabel", "org.jfree.data.general.PieDataset,java.lang.Comparable", "0"}});
  assertNotNull(actual);
  assertEquals("java.text.AttributedString", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getSectionKey", new String[]{"int"}, new String[]{"2147483646"}, false, 4, new String[][]{{"org.jfree.chart.plot.PiePlot", "setLabelPaint", "java.awt.Paint", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483646", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.plot.PiePlot", "getMaximumLabelWidth", ""}}), new String[][]{{"getLegendItems", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.LegendItemCollection", actual.getClass().getName());
  assertEquals("{getItemCount=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getLabelLinkPaint", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.plot.PiePlot", "setLabelLinkMargin", "double", "-0.0025000000000000005"}, {"org.jfree.chart.plot.PiePlot", "lookupSectionOutlinePaint", "java.lang.Comparable,boolean", "<s:key>", "true"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=0] {getAlpha=255, getBlue=0, getGreen=0, getRGB=-16777216, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#423#-928608889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setBaseSectionOutlinePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"org.jfree.chart.plot.PiePlot", "setDirection", "org.jfree.chart.util.Rotation", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setBaseSectionPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"org.jfree.chart.plot.PiePlot", "lookupSectionPaint", "java.lang.Comparable", "<sample:4>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getToolTipGenerator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.PiePlot", "setInteriorGap", "double", "0.08"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setMaximumLabelWidth", new String[]{"double"}, new String[]{"0.0"}, false, 0, new String[][]{{"org.jfree.chart.plot.PiePlot", "getStartAngle", ""}, {"org.jfree.chart.plot.PiePlot", "lookupSectionOutlineStroke", "java.lang.Comparable,boolean", "<sample:2>", "true"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#405#-33105584", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getShadowPaint", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.PiePlot", "setSimpleLabelOffset", "org.jfree.chart.util.RectangleInsets", "<sample:4>"}, {"org.jfree.chart.plot.PiePlot", "setLabelFont", "java.awt.Font", "<sample:0>"}}, 3), new String[][]{{"getRGBColorComponents", "float[]", "2"}});
  assertNotNull(actual);
  assertEquals("[F", actual.getClass().getName());
  assertEquals("[0.5019608, 0.5019608, 0.5019608]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setLabelLinkPaint", new String[]{"java.awt.Paint"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.jfree.chart.plot.PiePlot", "drawPie", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.PlotRenderingInfo", "<sample:8>", "<sample:4>", "<sample:8>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getLegendItems", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.PiePlot", "setSectionPaint", "java.lang.Comparable,java.awt.Paint", "<sample:6>", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.LegendItemCollection", actual.getClass().getName());
  assertEquals("{getItemCount=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getLabelOutlineStroke", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.PiePlot", "setExplodePercent", "java.lang.Comparable,double", "<s:a>", "0.40000000000000013"}});
  assertNotNull(actual);
  assertEquals("java.awt.BasicStroke", actual.getClass().getName());
  assertEquals("{getDashArray=null, getDashPhase=0.0, getEndCap=2, getLineJoin=0, getLineWidth=0.5, getMiterLimit=10.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#422#-697954827", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.PiePlot", "setBackgroundImageAlpha", "float", "1.0E-5"}}, 1), new String[][]{{"getSectionOutlineStroke", "java.lang.Comparable", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=1.0E-5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=...#409#1696764794", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setLabelLinksVisible", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jfree.chart.plot.PiePlot", "setSectionOutlinePaint", "java.lang.Comparable,java.awt.Paint", "<b:false>", "<sample:9>"}, {"org.jfree.chart.plot.PiePlot", "setIgnoreNullValues", "boolean", "true"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=true, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.02...#406#-2085372075", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.plot.PiePlot", "setBackgroundImage", "java.awt.Image", "<sample:10>"}, {"org.jfree.chart.plot.PiePlot", "setLegendLabelToolTipGenerator", "org.jfree.chart.labels.PieSectionLabelGenerator", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.CloneNotSupportedException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setNoDataMessage", new String[]{"java.lang.String"}, new String[]{"a',b+c"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#408#1040001800", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getLabelGenerator", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.labels.StandardPieSectionLabelGenerator", actual.getClass().getName());
  assertEquals("{getLabelFormat={0}}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setLabelGap", new String[]{"double"}, new String[]{"1.5800000000000003"}, false, 0, new String[][]{{"org.jfree.chart.plot.PiePlot", "getBackgroundImageAlpha", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=1.5...#419#-469296409", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "drawRightLabel", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.PiePlotState", "org.jfree.chart.plot.PieLabelRecord"}, new String[]{"<null>", "<sample:4>", "<sample:7>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setDirection", new String[]{"org.jfree.chart.util.Rotation"}, new String[]{"<sample:0>"}, false, 6, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setNoDataMessageFont", new String[]{"java.awt.Font"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"org.jfree.chart.plot.PiePlot", "lookupSectionOutlinePaint", "java.lang.Comparable,boolean", "<s:b>", "true"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getLabelGap", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.PiePlot", "getBaseSectionOutlinePaint", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.025", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getLabelLinkMargin", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.025", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getStartAngle", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.PiePlot", "getIgnoreNullValues", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("90.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getMinimumArcAngleToDraw", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getInsets", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleInsets", actual.getClass().getName());
  assertEquals("RectangleInsets[t=4.0,l=8.0,b=4.0,r=8.0] {getBottom=4.0, getLeft=8.0, getRight=8.0, getTop=4.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getLegendLabelToolTipGenerator", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getPlotType", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.PiePlot", "drawBackgroundImage", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:5>", "<sample:1>"}, {"org.jfree.chart.plot.PiePlot", "getExplodePercent", "java.lang.Comparable", "<d:1.5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Pie Plot", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setLabelOutlinePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:7>"}, false, 7, new String[][]{{"org.jfree.chart.plot.PiePlot", "getBackgroundPaint", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getLabelBackgroundPaint", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=255,g=255,b=192] {getAlpha=255, getBlue=192, getGreen=255, getRGB=-64, getRed=255, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setExplodePercent", new String[]{"java.lang.Comparable", "double"}, new String[]{"<i:-1>", "360.0"}, false, 4, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setInsets", new String[]{"org.jfree.chart.util.RectangleInsets"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.jfree.chart.plot.PiePlot", "fillBackground", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:4>", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setIgnoreZeroValues", new String[]{"boolean"}, new String[]{"true"}, false, 6, new String[][]{{"org.jfree.chart.plot.PiePlot", "getBaseSectionOutlinePaint", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=true, getInteriorGap=0.08, getLabelGap=0.02...#405#1866386810", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setDrawingSupplier", new String[]{"org.jfree.chart.plot.DrawingSupplier"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jfree.chart.plot.PiePlot", "fillBackground", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:1>", "<sample:6>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setCircular", new String[]{"boolean", "boolean"}, new String[]{"true", "true"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getURLGenerator", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.PiePlot", "setBaseSectionPaint", "java.awt.Paint", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "lookupSectionOutlinePaint", new String[]{"java.lang.Comparable", "boolean"}, new String[]{"<s:k,>", "false"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=128,g=128,b=128] {getAlpha=255, getBlue=128, getGreen=128, getRGB=-8355712, getRed=128, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getBackgroundAlpha", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getLegendLabelToolTipGenerator", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "drawLeftLabels", new String[]{"org.jfree.data.KeyedValues", "java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "java.awt.geom.Rectangle2D", "float", "org.jfree.chart.plot.PiePlotState"}, new String[]{"<sample:4>", "<sample:1>", "<sample:10>", "<sample:5>", "-1.0", "<sample:7>"}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "isOutlineVisible", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.PiePlot", "getSimpleLabels", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getMinimumArcAngleToDraw", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.PiePlot", "lookupSectionOutlinePaint", "java.lang.Comparable", "<s:PPey>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "drawRightLabels", new String[]{"org.jfree.data.KeyedValues", "java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "java.awt.geom.Rectangle2D", "float", "org.jfree.chart.plot.PiePlotState"}, new String[]{"<sample:7>", "<sample:2>", "<sample:5>", "<sample:1>", "Infinity", "<sample:6>"}, false, 0, new String[][]{{"org.jfree.chart.plot.PiePlot", "getSectionOutlineStroke", "java.lang.Comparable", "<i:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "datasetChanged", new String[]{"org.jfree.data.general.DatasetChangeEvent"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"org.jfree.chart.plot.PiePlot", "getForegroundAlpha", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getLabelBackgroundPaint", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.PiePlot", "getBackgroundImage", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=255,g=255,b=192] {getAlpha=255, getBlue=192, getGreen=255, getRGB=-64, getRed=255, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getDataset", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.PiePlot", "setBackgroundImageAlpha", "float", "-0.025"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setLabelDistributor", new String[]{"org.jfree.chart.plot.AbstractPieLabelDistributor"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jfree.chart.plot.PiePlot", "setLabelLinkPaint", "java.awt.Paint", "<sample:0>"}, {"org.jfree.chart.plot.PiePlot", "getLabelShadowPaint", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getOutlinePaint", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.PiePlot", "getNoDataMessage", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=128,g=128,b=128] {getAlpha=255, getBlue=128, getGreen=128, getRGB=-8355712, getRed=128, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "lookupSectionOutlinePaint", new String[]{"java.lang.Comparable"}, new String[]{"<i:-60>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=128,g=128,b=128] {getAlpha=255, getBlue=128, getGreen=128, getRGB=-8355712, getRed=128, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getShadowPaint", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.plot.PiePlot", "getInteriorGap", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=128,g=128,b=128] {getAlpha=255, getBlue=128, getGreen=128, getRGB=-8355712, getRed=128, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setIgnoreZeroValues", new String[]{"boolean"}, new String[]{"false"}, false, 3, new String[][]{{"org.jfree.chart.plot.PiePlot", "getSimpleLabelOffset", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "drawBackgroundImage", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:2>", "<sample:6>"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setBaseSectionOutlinePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:6>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "drawNoDataMessage", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:7>", "<sample:6>"}, false, 3, new String[][]{{"org.jfree.chart.plot.PiePlot", "getLegendItemShape", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "drawRightLabel", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.PiePlotState", "org.jfree.chart.plot.PieLabelRecord"}, new String[]{"<sample:2>", "<sample:0>", "<sample:4>"}, false, 0, new String[][]{{"org.jfree.chart.plot.PiePlot", "getBackgroundAlpha", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setDataset", new String[]{"org.jfree.data.general.PieDataset"}, new String[]{"<sample:1>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getInteriorGap", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.PiePlot", "isSubplot", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.08", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getSimpleLabelOffset", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.PiePlot", "initialise", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.PiePlot,java.lang.Integer,org.jfree.chart.plot.PlotRenderingInfo", "<sample:5>", "<sample:9>", "<sample:3>", "77", "<sample:3>"}}, 1), new String[][]{{"calculateRightInset", "double", "4"}, {"calculateRightOutset", "double", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getBackgroundImage", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.plot.PiePlot", "setBackgroundImage", "java.awt.Image", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getShadowXOffset", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getDrawingSupplier", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.DefaultDrawingSupplier", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getLabelLinksVisible", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.chart.plot.PiePlot", "getMaximumLabelWidth", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "lookupSectionOutlineStroke", new String[]{"java.lang.Comparable"}, new String[]{"<i:2>"}, false, 3, new String[][]{{"org.jfree.chart.plot.PiePlot", "drawSimpleLabels", "java.awt.Graphics2D,java.util.List,double,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.PiePlotState", "<sample:0>", "<sample:1>", "-0.0", "<sample:1>", "<sample:4>", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.awt.BasicStroke", actual.getClass().getName());
  assertEquals("{getDashArray=null, getDashPhase=0.0, getEndCap=2, getLineJoin=0, getLineWidth=0.5, getMiterLimit=10.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getOutlinePaint", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2), new String[][]{{"getAlpha", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("255", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getBackgroundImageAlignment", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.PiePlot", "getLegendLabelGenerator", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getLabelLinkPaint", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.PiePlot", "getNoDataMessageFont", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=0] {getAlpha=255, getBlue=0, getGreen=0, getRGB=-16777216, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "isOutlineVisible", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.PiePlot", "setLabelGenerator", "org.jfree.chart.labels.PieSectionLabelGenerator", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setExplodePercent", new String[]{"java.lang.Comparable", "double"}, new String[]{"<b:true>", "-1.0"}, false, 3, new String[][]{{"org.jfree.chart.plot.PiePlot", "getShadowXOffset", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#422#-2118532108", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setLegendLabelToolTipGenerator", new String[]{"org.jfree.chart.labels.PieSectionLabelGenerator"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jfree.chart.plot.PiePlot", "fillBackground", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:6>", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getLabelDistributor", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.chart.plot.PiePlot", "setLabelPadding", "org.jfree.chart.util.RectangleInsets", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.PieLabelDistributor", actual.getClass().getName());
  assertEquals(" {getItemCount=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "drawSimpleLabels", new String[]{"java.awt.Graphics2D", "java.util.List", "double", "java.awt.geom.Rectangle2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.PiePlotState"}, new String[]{"<sample:3>", "<sample:3>", "-7.9561246600559024E16", "<null>", "<sample:5>", "<sample:6>"}, false, 0, new String[][]{{"org.jfree.chart.plot.PiePlot", "getNoDataMessageFont", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getSectionKey", new String[]{"int"}, new String[]{"2147483647"}, false, 2, new String[][]{{"org.jfree.chart.plot.PiePlot", "datasetChanged", "org.jfree.data.general.DatasetChangeEvent", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getDrawingSupplier", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1), new String[][]{{"getNextShape", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Rectangle2D$Double", actual.getClass().getName());
  assertEquals("java.awt.geom.Rectangle2D$Double[x=-3.0,y=-3.0,w=6.0,h=6.0] {getCenterX=0.0, getCenterY=0.0, getHeight=6.0, getMaxX=3.0, getMaxY=3.0, getMinX=-3.0, getMinY=-3.0, getWidth=6.0, getX=-3.0, getY=-3.0, is...#212#-231803158", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getLabelGap", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.chart.plot.PiePlot", "getShadowXOffset", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.025", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getLabelOutlinePaint", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.PiePlot", "getInteriorGap", ""}}, 1), new String[][]{{"getComponents", "float[]", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setLabelLinkStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"org.jfree.chart.plot.PiePlot", "getMaximumExplodePercent", ""}, {"org.jfree.chart.plot.PiePlot", "getLegendItems", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getLabelLinkPaint", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.PiePlot", "getSectionKey", "int", "536875007"}, {"org.jfree.chart.plot.PiePlot", "getLegendLabelURLGenerator", ""}}, 1), new String[][]{{"darker", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=0] {getAlpha=255, getBlue=0, getGreen=0, getRGB=-16777216, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getDatasetGroup", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.plot.PiePlot", "getMinimumArcAngleToDraw", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setSectionPaint", new String[]{"java.lang.Comparable", "java.awt.Paint"}, new String[]{"<b:true>", "<sample:1>"}, false, 7, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getLabelBackgroundPaint", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.PiePlot", "lookupSectionPaint", "java.lang.Comparable", "<s:d>"}}, 3), new String[][]{{"darker", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=178,g=178,b=134] {getAlpha=255, getBlue=134, getGreen=178, getRGB=-5066106, getRed=178, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getSectionPaint", new String[]{"java.lang.Comparable"}, new String[]{"<s:a>"}, false, 1, new String[][]{{"org.jfree.chart.plot.PiePlot", "setLabelLinkMargin", "double", "-7.05"}, {"org.jfree.chart.plot.PiePlot", "getNoDataMessageFont", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#219551087", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "drawNoDataMessage", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:6>", "<sample:8>"}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getBackgroundPaint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.PiePlot", "setLabelLinkPaint", "java.awt.Paint", "<sample:0>"}, {"org.jfree.chart.plot.PiePlot", "setLabelPadding", "org.jfree.chart.util.RectangleInsets", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=192,g=192,b=192] {getAlpha=255, getBlue=192, getGreen=192, getRGB=-4144960, getRed=192, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "fillBackground", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:1>", "<sample:2>"}, false, 0, new String[][]{{"org.jfree.chart.plot.PiePlot", "getLabelGenerator", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setLegendLabelGenerator", new String[]{"org.jfree.chart.labels.PieSectionLabelGenerator"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jfree.chart.plot.PiePlot", "setInsets", "org.jfree.chart.util.RectangleInsets,boolean", "<null>", "false"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setLegendLabelGenerator", new String[]{"org.jfree.chart.labels.PieSectionLabelGenerator"}, new String[]{"<sample:2>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "drawBackground", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:0>", "<sample:4>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "drawPie", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"<sample:8>", "<sample:2>", "<sample:7>"}, false, 0, new String[][]{{"org.jfree.chart.plot.PiePlot", "lookupSectionOutlinePaint", "java.lang.Comparable", "<s:->"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getLabelPadding", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.plot.PiePlot", "setCircular", "boolean,boolean", "false", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleInsets", actual.getClass().getName());
  assertEquals("RectangleInsets[t=2.0,l=2.0,b=2.0,r=2.0] {getBottom=2.0, getLeft=2.0, getRight=2.0, getTop=2.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getNoDataMessagePaint", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.plot.PiePlot", "drawBackground", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:1>", "<sample:0>"}, {"org.jfree.chart.plot.PiePlot", "setURLGenerator", "org.jfree.chart.urls.PieURLGenerator", "<sample:2>"}}, 2), new String[][]{{"darker", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=0] {getAlpha=255, getBlue=0, getGreen=0, getRGB=-16777216, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "drawRightLabel", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.PiePlotState", "org.jfree.chart.plot.PieLabelRecord"}, new String[]{"<sample:1>", "<sample:0>", "<sample:7>"}, false, 2, new String[][]{{"org.jfree.chart.plot.PiePlot", "removeChangeListener", "org.jfree.chart.event.PlotChangeListener", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "lookupSectionOutlinePaint", new String[]{"java.lang.Comparable"}, new String[]{"<sample:2>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=128,g=128,b=128] {getAlpha=255, getBlue=128, getGreen=128, getRGB=-8355712, getRed=128, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getURLGenerator", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.plot.PiePlot", "getParent", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "initialise", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.PiePlot", "java.lang.Integer", "org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"<sample:4>", "<sample:6>", "<sample:7>", "-2147483648", "<sample:6>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.PiePlotState", actual.getClass().getName());
  assertEquals("{getLatestAngle=90.0, getPassesRequired=2, getPieCenterX=0.0, getPieCenterY=0.0, getPieHRadius=0.0, getPieWRadius=0.0, getTotal=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getMinimumArcAngleToDraw", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getLabelGap", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.025", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getInteriorGap", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.08", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "lookupSectionPaint", new String[]{"java.lang.Comparable", "boolean"}, new String[]{"<s:,>", "true"}, false, 0, new String[][]{{"org.jfree.chart.plot.PiePlot", "isSubplot", ""}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=255,g=85,b=85] {getAlpha=255, getBlue=85, getGreen=85, getRGB=-43691, getRed=255, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getLabelShadowPaint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.PiePlot", "getLegendItems", ""}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=151,g=151,b=151] {getAlpha=128, getBlue=151, getGreen=151, getRGB=-2137548905, getRed=151, getTransparency=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getLabelLinkPaint", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.PiePlot", "lookupSectionOutlinePaint", "java.lang.Comparable,boolean", "<b:true>", "false"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=0] {getAlpha=255, getBlue=0, getGreen=0, getRGB=-16777216, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "drawItem", new String[]{"java.awt.Graphics2D", "int", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.PiePlotState", "int"}, new String[]{"<sample:1>", "2147483619", "<sample:4>", "<sample:5>", "1"}, false, 0, new String[][]{{"org.jfree.chart.plot.PiePlot", "getBaseSectionPaint", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "drawLeftLabel", new String[]{"java.awt.Graphics2D", "org.jfree.chart.plot.PiePlotState", "org.jfree.chart.plot.PieLabelRecord"}, new String[]{"<sample:2>", "<sample:1>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getLabelOutlineStroke", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.PiePlot", "getInteriorGap", ""}});
  assertNotNull(actual);
  assertEquals("java.awt.BasicStroke", actual.getClass().getName());
  assertEquals("{getDashArray=null, getDashPhase=0.0, getEndCap=2, getLineJoin=0, getLineWidth=0.5, getMiterLimit=10.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "drawBackground", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:3>", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getRootPlot", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.PiePlot", actual.getClass().getName());
  assertEquals("{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getShadowYOffset", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.plot.PiePlot", "getLabelLinksVisible", ""}, {"org.jfree.chart.plot.PiePlot", "getNoDataMessage", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getLegendLabelToolTipGenerator", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.plot.PiePlot", "lookupSectionPaint", "java.lang.Comparable", "<b:true>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setBackgroundAlpha", new String[]{"float"}, new String[]{"0.546"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=0.546, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0...#408#2049605013", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getPlotType", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.PiePlot", "drawSimpleLabels", "java.awt.Graphics2D,java.util.List,double,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.PiePlotState", "<sample:8>", "<empty>", "Infinity", "<null>", "<sample:5>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Pie Plot", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setLabelLinkMargin", new String[]{"double"}, new String[]{"0.25000000000000006"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#420#498938811", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getBaseSectionOutlineStroke", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.awt.BasicStroke", actual.getClass().getName());
  assertEquals("{getDashArray=null, getDashPhase=0.0, getEndCap=2, getLineJoin=0, getLineWidth=0.5, getMiterLimit=10.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "drawRightLabels", new String[]{"org.jfree.data.KeyedValues", "java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "java.awt.geom.Rectangle2D", "float", "org.jfree.chart.plot.PiePlotState"}, new String[]{"<sample:0>", "<sample:4>", "<sample:6>", "<sample:0>", "0.05", "<sample:4>"}, false, 0, new String[][]{{"org.jfree.chart.plot.PiePlot", "getNoDataMessage", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setLabelShadowPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.jfree.chart.plot.PiePlot", "lookupSectionOutlinePaint", "java.lang.Comparable", "<b:true>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getBackgroundImageAlpha", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.PiePlot", "getPieIndex", ""}, {"org.jfree.chart.plot.PiePlot", "getSectionOutlineStroke", "java.lang.Comparable", "<b:false>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getLegendLabelURLGenerator", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getMaximumLabelWidth", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getDatasetGroup", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.PiePlot", "setShadowYOffset", "double", "9.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getDataset", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.PiePlot", "setLabelFont", "java.awt.Font", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "lookupSectionOutlinePaint", new String[]{"java.lang.Comparable", "boolean"}, new String[]{"<s:bg>", "true"}, false, 5, new String[][]{{"org.jfree.chart.plot.PiePlot", "getLabelBackgroundPaint", ""}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=192,g=192,b=192] {getAlpha=255, getBlue=192, getGreen=192, getRGB=-4144960, getRed=192, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getLabelPadding", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.PiePlot", "setBaseSectionPaint", "java.awt.Paint", "<sample:6>"}, {"org.jfree.chart.plot.PiePlot", "getMaximumExplodePercent", ""}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleInsets", actual.getClass().getName());
  assertEquals("RectangleInsets[t=2.0,l=2.0,b=2.0,r=2.0] {getBottom=2.0, getLeft=2.0, getRight=2.0, getTop=2.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getLabelShadowPaint", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.plot.PiePlot", "getLegendItemShape", ""}}), new String[][]{{"getComponents", "java.awt.color.ColorSpace,float[]", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setShadowXOffset", new String[]{"double"}, new String[]{"0.125"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setLabelFont", new String[]{"java.awt.Font"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.jfree.chart.plot.PiePlot", "lookupSectionOutlineStroke", "java.lang.Comparable,boolean", "<sample:1>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getLabelLinkPaint", new String[]{}, new String[]{}, false), new String[][]{{"getGreen", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getDirection", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.Rotation", actual.getClass().getName());
  assertEquals("Rotation.CLOCKWISE {getFactor=-1.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "drawItem", new String[]{"java.awt.Graphics2D", "int", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.PiePlotState", "int"}, new String[]{"<sample:0>", "10", "<sample:3>", "<sample:0>", "2147483646"}, false, 2, new String[][]{{"org.jfree.chart.plot.PiePlot", "setInteriorGap", "double", "4.000000000000002"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "fillBackground", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:9>", "<sample:2>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getPieIndex", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.plot.PiePlot", "getLabelBackgroundPaint", ""}, {"org.jfree.chart.plot.PiePlot", "lookupSectionPaint", "java.lang.Comparable", "<s:XL,>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setBackgroundPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:0>"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getLabelBackgroundPaint", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=255,g=255,b=192] {getAlpha=255, getBlue=192, getGreen=255, getRGB=-64, getRed=255, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "lookupSectionOutlinePaint", new String[]{"java.lang.Comparable", "boolean"}, new String[]{"<i:2>", "false"}, false), new String[][]{{"getColorSpace", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.awt.color.ICC_ColorSpace", actual.getClass().getName());
  assertEquals("{getNumComponents=3, getType=5, isCS_sRGB=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getBackgroundAlpha", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.PiePlot", "getSectionOutlineStroke", "java.lang.Comparable", "<s:L>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setLabelBackgroundPaint", new String[]{"java.awt.Paint"}, new String[]{"<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getStartAngle", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.PiePlot", "clone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("90.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "isCircular", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "lookupSectionOutlinePaint", new String[]{"java.lang.Comparable", "boolean"}, new String[]{"<b:true>", "false"}, false, 4, new String[][]{{"org.jfree.chart.plot.PiePlot", "setLabelLinkPaint", "java.awt.Paint", "<sample:5>"}}), new String[][]{{"getRGBColorComponents", "float[]", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "drawOutline", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:8>", "<sample:5>"}, false, 5, new String[][]{{"org.jfree.chart.plot.PiePlot", "setLabelBackgroundPaint", "java.awt.Paint", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getLabelBackgroundPaint", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"getBlue", "", "0"}, {"getComponents", "float[]", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getRootPlot", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.plot.PiePlot", "getLabelPadding", ""}}), new String[][]{{"getLegendLabelGenerator", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.labels.StandardPieSectionLabelGenerator", actual.getClass().getName());
  assertEquals("{getLabelFormat={0}}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getOutlineStroke", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.awt.BasicStroke", actual.getClass().getName());
  assertEquals("{getDashArray=null, getDashPhase=0.0, getEndCap=2, getLineJoin=0, getLineWidth=0.5, getMiterLimit=10.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "isOutlineVisible", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setIgnoreZeroValues", new String[]{"boolean"}, new String[]{"false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getForegroundAlpha", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setInsets", new String[]{"org.jfree.chart.util.RectangleInsets"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jfree.chart.plot.PiePlot", "fillBackground", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:1>", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getExplodePercent", new String[]{"java.lang.Comparable"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jfree.chart.plot.PiePlot", "setOutlinePaint", "java.awt.Paint", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getLabelOutlinePaint", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.PiePlot", "getBaseSectionPaint", ""}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=0] {getAlpha=255, getBlue=0, getGreen=0, getRGB=-16777216, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getLegendItemShape", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.plot.PiePlot", "getLabelPaint", ""}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Ellipse2D$Double", actual.getClass().getName());
  assertEquals("{getCenterX=0.0, getCenterY=0.0, getHeight=8.0, getMaxX=4.0, getMaxY=4.0, getMinX=-4.0, getMinY=-4.0, getWidth=8.0, getX=-4.0, getY=-4.0, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getNoDataMessagePaint", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=0] {getAlpha=255, getBlue=0, getGreen=0, getRGB=-16777216, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "lookupSectionOutlinePaint", new String[]{"java.lang.Comparable"}, new String[]{"<s:>"}, false, 7, new String[][]{{"org.jfree.chart.plot.PiePlot", "setToolTipGenerator", "org.jfree.chart.labels.PieToolTipGenerator", "<sample:0>"}}), new String[][]{{"getColorComponents", "float[]", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getRectX", new String[]{"double", "double", "double", "org.jfree.chart.util.RectangleEdge"}, new String[]{"0.139", "0.5800000000000003", "0.7900000000000001", "<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.139", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getSectionKey", new String[]{"int"}, new String[]{"341"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("341", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "drawNoDataMessage", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:5>", "<null>"}, false, 7, new String[][]{{"org.jfree.chart.plot.PiePlot", "setDatasetGroup", "org.jfree.data.general.DatasetGroup", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getParent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.PiePlot", "markerChanged", "org.jfree.chart.event.MarkerChangeEvent", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setSectionPaint", new String[]{"java.lang.Comparable", "java.awt.Paint"}, new String[]{"<i:-1>", "<sample:8>"}, false, 0, new String[][]{{"org.jfree.chart.plot.PiePlot", "getLabelOutlinePaint", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "notifyListeners", new String[]{"org.jfree.chart.event.PlotChangeEvent"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jfree.chart.plot.PiePlot", "getLabelBackgroundPaint", ""}, {"org.jfree.chart.plot.PiePlot", "getOutlineStroke", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "lookupSectionPaint", new String[]{"java.lang.Comparable"}, new String[]{"<s:3ey>"}, false, 4, new String[][]{{"org.jfree.chart.plot.PiePlot", "setSimpleLabelOffset", "org.jfree.chart.util.RectangleInsets", "<sample:8>"}, {"org.jfree.chart.plot.PiePlot", "getLabelGap", ""}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=128,g=128,b=128] {getAlpha=255, getBlue=128, getGreen=128, getRGB=-8355712, getRed=128, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setDrawingSupplier", new String[]{"org.jfree.chart.plot.DrawingSupplier"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jfree.chart.plot.PiePlot", "getLabelPaint", ""}, {"org.jfree.chart.plot.PiePlot", "setShadowYOffset", "double", "Infinity"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:c>"}, false, 4, new String[][]{{"org.jfree.chart.plot.PiePlot", "getParent", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getDataset", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.PiePlot", "drawLeftLabels", "org.jfree.data.KeyedValues,java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,float,org.jfree.chart.plot.PiePlotState", "<sample:4>", "<sample:3>", "<sample:3>", "<sample:4>", "2.0", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setBackgroundImageAlpha", new String[]{"float"}, new String[]{"-0.0"}, false, 2, new String[][]{{"org.jfree.chart.plot.PiePlot", "lookupSectionOutlineStroke", "java.lang.Comparable,boolean", "<d:-1.5>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=-0.0, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0....#407#-1835343675", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getBackgroundImageAlpha", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.PiePlot", "getLegendItems", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "isSubplot", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.plot.PiePlot", "drawItem", "java.awt.Graphics2D,int,java.awt.geom.Rectangle2D,org.jfree.chart.plot.PiePlotState,int", "<sample:0>", "2147483647", "<sample:2>", "<sample:1>", "-359"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setLabelLinkMargin", new String[]{"double"}, new String[]{"-1.0000000000000002"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#420#29096882", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getNoDataMessageFont", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.PiePlot", "drawNoDataMessage", "java.awt.Graphics2D,java.awt.geom.Rectangle2D", "<sample:0>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.awt.Font", actual.getClass().getName());
  assertEquals("java.awt.Font[family=SansSerif,name=SansSerif,style=plain,size=12] {getAvailableAttributes=[java.awt.font.TextAttribute(family), java.awt.font.TextAttr.., getFamily=SansSerif, getFontName=SansSerif.pl...#452#-1676922124", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "fillBackground", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.PlotOrientation"}, new String[]{"<sample:5>", "<sample:3>", "<sample:1>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getBaseSectionOutlineStroke", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.PiePlot", "getRectX", "double,double,double,org.jfree.chart.util.RectangleEdge", "-1.7976931348623157E308", "NaN", "1.5800000000000003", "<sample:4>"}}), new String[][]{{"getLineJoin", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getLabelOutlineStroke", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.plot.PiePlot", "draw", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,java.awt.geom.Point2D,org.jfree.chart.plot.PlotState,org.jfree.chart.plot.PlotRenderingInfo", "<sample:5>", "<sample:5>", "<sample:1>", "<sample:2>", "<sample:7>"}}), new String[][]{{"getDashArray", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "draw", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "java.awt.geom.Point2D", "org.jfree.chart.plot.PlotState", "org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"<sample:6>", "<sample:5>", "<sample:2>", "<sample:6>", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getSimpleLabelOffset", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleInsets", actual.getClass().getName());
  assertEquals("RectangleInsets[t=0.18,l=0.18,b=0.18,r=0.18] {getBottom=0.18, getLeft=0.18, getRight=0.18, getTop=0.18}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setInteriorGap", new String[]{"double"}, new String[]{"0.0025"}, false, 2, new String[][]{{"org.jfree.chart.plot.PiePlot", "getRectY", "double,double,double,org.jfree.chart.util.RectangleEdge", "361.90000000000003", "-1.7976931348623157E308", "-0.20999999999999994", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.0025, getLabelGap=0...#408#-315873472", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getBackgroundImage", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.PiePlot", "getDirection", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setSectionPaint", new String[]{"java.lang.Comparable", "java.awt.Paint"}, new String[]{"<null>", "<sample:1>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setLegendLabelToolTipGenerator", new String[]{"org.jfree.chart.labels.PieSectionLabelGenerator"}, new String[]{"<sample:7>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "lookupSectionOutlinePaint", new String[]{"java.lang.Comparable"}, new String[]{"<s:3ex>"}, false, 3, new String[][]{}), new String[][]{{"getRGB", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-8355712", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "handleClick", new String[]{"int", "int", "org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"90", "4", "<sample:0>"}, false, 5, new String[][]{{"org.jfree.chart.plot.PiePlot", "setLabelBackgroundPaint", "java.awt.Paint", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getRootPlot", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"getLabelLinkMargin", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.025", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getArcBounds", new String[]{"java.awt.geom.Rectangle2D", "java.awt.geom.Rectangle2D", "double", "double", "double"}, new String[]{"<sample:5>", "<sample:1>", "361.9", "0.9", "0.08"}, false, 0, new String[][]{{"org.jfree.chart.plot.PiePlot", "getLabelDistributor", ""}, {"org.jfree.chart.plot.PiePlot", "getIgnoreZeroValues", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getLegendLabelGenerator", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.labels.StandardPieSectionLabelGenerator", actual.getClass().getName());
  assertEquals("{getLabelFormat={0}}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getLabelLinksVisible", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getOutlinePaint", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=128,g=128,b=128] {getAlpha=255, getBlue=128, getGreen=128, getRGB=-8355712, getRed=128, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setBaseSectionOutlinePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"org.jfree.chart.plot.PiePlot", "getLabelBackgroundPaint", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setDatasetGroup", new String[]{"org.jfree.data.general.DatasetGroup"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"org.jfree.chart.plot.PiePlot", "getLabelLinksVisible", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setSectionOutlinesVisible", new String[]{"boolean"}, new String[]{"false"}, false, 7, new String[][]{{"org.jfree.chart.plot.PiePlot", "getShadowYOffset", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getBaseSectionOutlinePaint", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=128,g=128,b=128] {getAlpha=255, getBlue=128, getGreen=128, getRGB=-8355712, getRed=128, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getLabelFont", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.PiePlot", "setLabelFont", "java.awt.Font", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.awt.Font", actual.getClass().getName());
  assertEquals("java.awt.Font[family=Dialog,name=Default,style=plain,size=12] {getAvailableAttributes=[java.awt.font.TextAttribute(family), java.awt.font.TextAttr.., getFamily=Dialog, getFontName=Dialog.plain, getIta...#436#1505035088", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getLegendItemShape", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"getWidth", "", "4"}, {"getMinX", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-4.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getDrawingSupplier", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.PiePlot", "setForegroundAlpha", "float", "-0.109"}, {"org.jfree.chart.plot.PiePlot", "setSectionOutlinesVisible", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.DefaultDrawingSupplier", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=-0.109, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=...#409#1025006285", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setPieIndex", new String[]{"int"}, new String[]{"1073750015"}, false, 3, new String[][]{{"org.jfree.chart.plot.PiePlot", "getURLGenerator", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#415#1230713032", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getBackgroundImageAlignment", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.PiePlot", "getLabelShadowPaint", ""}, {"org.jfree.chart.plot.PiePlot", "getNoDataMessage", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getShadowYOffset", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.PiePlot", "setURLGenerator", "org.jfree.chart.urls.PieURLGenerator", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "lookupSectionPaint", new String[]{"java.lang.Comparable", "boolean"}, new String[]{"<i:-60>", "true"}, false, 5, new String[][]{{"org.jfree.chart.plot.PiePlot", "getLabelLinkStroke", ""}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=255,g=85,b=85] {getAlpha=255, getBlue=85, getGreen=85, getRGB=-43691, getRed=255, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getLegendItems", new String[]{}, new String[]{}, false), new String[][]{{"clone", "", "2"}, {"iterator", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "lookupSectionOutlineStroke", new String[]{"java.lang.Comparable"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.jfree.chart.plot.PiePlot", "setBackgroundImageAlpha", "float", "-1.975"}});
  assertNotNull(actual);
  assertEquals("java.awt.BasicStroke", actual.getClass().getName());
  assertEquals("{getDashArray=null, getDashPhase=0.0, getEndCap=2, getLineJoin=0, getLineWidth=0.5, getMiterLimit=10.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getBackgroundImageAlpha", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.PiePlot", "setSimpleLabels", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setLegendLabelGenerator", new String[]{"org.jfree.chart.labels.PieSectionLabelGenerator"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"org.jfree.chart.plot.PiePlot", "getNoDataMessageFont", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setDrawingSupplier", new String[]{"org.jfree.chart.plot.DrawingSupplier"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jfree.chart.plot.PiePlot", "setPieIndex", "int", "91"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#407#-654097075", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setLabelLinkMargin", new String[]{"double"}, new String[]{"-361.9"}, false, 7, new String[][]{{"org.jfree.chart.plot.PiePlot", "setLabelLinkPaint", "java.awt.Paint", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#407#-1800414740", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setLabelGenerator", new String[]{"org.jfree.chart.labels.PieSectionLabelGenerator"}, new String[]{"<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setStartAngle", new String[]{"double"}, new String[]{"-7.956124660055904E17"}, false, 0, new String[][]{{"org.jfree.chart.plot.PiePlot", "getBaseSectionOutlinePaint", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "drawPie", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"<sample:3>", "<sample:3>", "<sample:8>"}, false, 0, new String[][]{{"org.jfree.chart.plot.PiePlot", "setOutlinePaint", "java.awt.Paint", "<sample:8>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setCircular", new String[]{"boolean", "boolean"}, new String[]{"true", "false"}, false, 7, new String[][]{{"org.jfree.chart.plot.PiePlot", "getRootPlot", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "datasetChanged", new String[]{"org.jfree.data.general.DatasetChangeEvent"}, new String[]{"<sample:6>"}, false, 3, new String[][]{{"org.jfree.chart.plot.PiePlot", "getRectY", "double,double,double,org.jfree.chart.util.RectangleEdge", "1.5800000000000003", "-2.0", "0.0", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getBaseSectionOutlineStroke", new String[]{}, new String[]{}, false), new String[][]{{"getLineJoin", "", "4"}, {"getLineWidth", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setSectionOutlinesVisible", new String[]{"boolean"}, new String[]{"true"}, false, 1, new String[][]{{"org.jfree.chart.plot.PiePlot", "setCircular", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getSectionKey", new String[]{"int"}, new String[]{"359"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("359", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getSimpleLabelOffset", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"createInsetRectangle", "java.awt.geom.Rectangle2D,boolean,boolean", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getNoDataMessage", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getLabelGenerator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.PiePlot", "getMaximumExplodePercent", ""}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.labels.StandardPieSectionLabelGenerator", actual.getClass().getName());
  assertEquals("{getLabelFormat={0}}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setInsets", new String[]{"org.jfree.chart.util.RectangleInsets", "boolean"}, new String[]{"<sample:6>", "false"}, false, 7, new String[][]{{"org.jfree.chart.plot.PiePlot", "setDatasetGroup", "org.jfree.data.general.DatasetGroup", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getLabelDistributor", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.PiePlot", "isSubplot", ""}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.PieLabelDistributor", actual.getClass().getName());
  assertEquals(" {getItemCount=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "initialise", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.PiePlot", "java.lang.Integer", "org.jfree.chart.plot.PlotRenderingInfo"}, new String[]{"<sample:0>", "<null>", "<sample:4>", "-1", "<sample:7>"}, false, 3, new String[][]{{"org.jfree.chart.plot.PiePlot", "setParent", "org.jfree.chart.plot.Plot", "<sample:4>"}, {"org.jfree.chart.plot.PiePlot", "getLegendItems", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getLabelFont", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.PiePlot", "getPieIndex", ""}}), new String[][]{{"isTransformed", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "drawLabels", new String[]{"java.awt.Graphics2D", "java.util.List", "double", "java.awt.geom.Rectangle2D", "java.awt.geom.Rectangle2D", "org.jfree.chart.plot.PiePlotState"}, new String[]{"<sample:3>", "<sample:2>", "-24.105", "<sample:1>", "<sample:3>", "<sample:2>"}, false, 0, new String[][]{{"org.jfree.chart.plot.PiePlot", "getExplodePercent", "java.lang.Comparable", "<s:n>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getLabelLinkMargin", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.025", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setLabelLinkMargin", new String[]{"double"}, new String[]{"0"}, false, 3, new String[][]{{"org.jfree.chart.plot.PiePlot", "getMaximumLabelWidth", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#404#1574611736", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "addChangeListener", new String[]{"org.jfree.chart.event.PlotChangeListener"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"org.jfree.chart.plot.PiePlot", "getBackgroundAlpha", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setURLGenerator", new String[]{"org.jfree.chart.urls.PieURLGenerator"}, new String[]{"<sample:6>"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getLegendLabelGenerator", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"getLabelFormat", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{0}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setExplodePercent", new String[]{"java.lang.Comparable", "double"}, new String[]{"<d:0.15>", "0.08"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#422#-2118532108", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "datasetChanged", new String[]{"org.jfree.data.general.DatasetChangeEvent"}, new String[]{"<sample:7>"}, false, 5, new String[][]{{"org.jfree.chart.plot.PiePlot", "setBackgroundAlpha", "float", "Infinity"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=Infinity, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGa...#411#1512126998", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getSectionKey", new String[]{"int"}, new String[]{"-2"}, false, 3, new String[][]{{"org.jfree.chart.plot.PiePlot", "getLabelLinkMargin", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getLabelPaint", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=0] {getAlpha=255, getBlue=0, getGreen=0, getRGB=-16777216, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getLegendItems", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.plot.PiePlot", "getPieIndex", ""}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.LegendItemCollection", actual.getClass().getName());
  assertEquals("{getItemCount=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getLabelBackgroundPaint", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"getColorComponents", "java.awt.color.ColorSpace,float[]", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getSectionOutlineStroke", new String[]{"java.lang.Comparable"}, new String[]{"<s:>"}, false, 1, new String[][]{{"org.jfree.chart.plot.PiePlot", "getDatasetGroup", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "drawOutline", new String[]{"java.awt.Graphics2D", "java.awt.geom.Rectangle2D"}, new String[]{"<sample:6>", "<sample:0>"}, false, 7, new String[][]{{"org.jfree.chart.plot.PiePlot", "lookupSectionOutlineStroke", "java.lang.Comparable,boolean", "<sample:4>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getToolTipGenerator", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setExplodePercent", new String[]{"java.lang.Comparable", "double"}, new String[]{"<s:,>", "364.88000000000005"}, false, 7, new String[][]{{"org.jfree.chart.plot.PiePlot", "setLegendLabelURLGenerator", "org.jfree.chart.urls.PieURLGenerator", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "datasetChanged", new String[]{"org.jfree.data.general.DatasetChangeEvent"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.jfree.chart.plot.PiePlot", "setIgnoreNullValues", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setBackgroundImageAlignment", new String[]{"int"}, new String[]{"2147483647"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=2147483647, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabe...#414#1018739283", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setDataset", new String[]{"org.jfree.data.general.PieDataset"}, new String[]{"<sample:2>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "markerChanged", new String[]{"org.jfree.chart.event.MarkerChangeEvent"}, new String[]{"<null>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setLegendLabelGenerator", new String[]{"org.jfree.chart.labels.PieSectionLabelGenerator"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.jfree.chart.plot.PiePlot", "initialise", "java.awt.Graphics2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.PiePlot,java.lang.Integer,org.jfree.chart.plot.PlotRenderingInfo", "<sample:5>", "<sample:3>", "<sample:5>", "360", "<sample:8>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getRectY", new String[]{"double", "double", "double", "org.jfree.chart.util.RectangleEdge"}, new String[]{"0", "9.000000000000002", "3648.8000000000006", "<sample:8>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "lookupSectionOutlineStroke", new String[]{"java.lang.Comparable"}, new String[]{"<s:,>"}, false, 1, new String[][]{{"org.jfree.chart.plot.PiePlot", "datasetChanged", "org.jfree.data.general.DatasetChangeEvent", "<sample:0>"}, {"org.jfree.chart.plot.PiePlot", "getNoDataMessageFont", ""}}), new String[][]{{"createStrokedShape", "java.awt.Shape", "1"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Path2D$Double", actual.getClass().getName());
  assertEquals("{getWindingRule=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getParent", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.PiePlot", "getInteriorGap", ""}, {"org.jfree.chart.plot.PiePlot", "setParent", "org.jfree.chart.plot.Plot", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.MeterPlot", actual.getClass().getName());
  assertEquals("{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getDrawBorder=false, getForegroundAlpha=1.0, getMeterAngle=270, getNoDataMessage=null, getPlotType=Meter Plot, get...#297#1725105779", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setOutlineStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"org.jfree.chart.plot.PiePlot", "getBaseSectionPaint", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setSimpleLabelOffset", new String[]{"org.jfree.chart.util.RectangleInsets"}, new String[]{"<sample:1>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getMaximumExplodePercent", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.PiePlot", "setLabelLinkPaint", "java.awt.Paint", "<null>"}, {"org.jfree.chart.plot.PiePlot", "getIgnoreNullValues", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "resolveDomainAxisLocation", new String[]{"org.jfree.chart.axis.AxisLocation", "org.jfree.chart.plot.PlotOrientation"}, new String[]{"<sample:1>", "<sample:6>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getLabelFont", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.PiePlot", "drawLabels", "java.awt.Graphics2D,java.util.List,double,java.awt.geom.Rectangle2D,java.awt.geom.Rectangle2D,org.jfree.chart.plot.PiePlotState", "<sample:9>", "<sample:1>", "-0.0", "<sample:4>", "<sample:5>", "<sample:3>"}}), new String[][]{{"getAttributes", "", "7"}});
  assertNotNull(actual);
  assertEquals("sun.font.AttributeMap", actual.getClass().getName());
  assertEquals("{java.awt.font.TextAttribute(family)=SansSerif, java.awt.font.TextAttribute(posture)=null, java.awt.font.TextAttribute(size)=10.0, java.awt.font.TextAttribute(superscript)=null, java.awt.font.TextAttr...#349#-1700956687", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getOutlinePaint", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.PiePlot", "getToolTipGenerator", ""}}), new String[][]{{"getRed", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("128", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getStartAngle", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.PiePlot", "setPieIndex", "int", "-16"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("90.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#408#1354114937", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getLabelDistributor", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.plot.PiePlot", "getSectionOutlineStroke", "java.lang.Comparable", "<s:b>"}, {"org.jfree.chart.plot.PiePlot", "setForegroundAlpha", "float", "37.0"}}), new String[][]{{"addPieLabelRecord", "org.jfree.chart.plot.PieLabelRecord", "6"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.PieLabelDistributor", actual.getClass().getName());
  assertEquals("Infinity, true\n {getItemCount=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=37.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0....#407#-561359676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setLabelLinkMargin", new String[]{"double"}, new String[]{"0.20999999999999994"}, false, 0, new String[][]{{"org.jfree.chart.plot.PiePlot", "getSectionOutlinesVisible", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#420#772813758", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setIgnoreZeroValues", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jfree.chart.plot.PiePlot", "getLabelLinkStroke", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=true, getInteriorGap=0.08, getLabelGap=0.02...#405#1866386810", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getLegendItems", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"iterator", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setNoDataMessageFont", new String[]{"java.awt.Font"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jfree.chart.plot.PiePlot", "getSectionOutlinePaint", "java.lang.Comparable", "<s:>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getDrawingSupplier", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.DefaultDrawingSupplier", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getDrawingSupplier", new String[]{}, new String[]{}, false), new String[][]{{"getNextFillPaint", "", "6"}, {"getRed", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("255", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getShadowXOffset", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "getSectionPaint", new String[]{"java.lang.Comparable"}, new String[]{"<s:4ky>"}, false, 0, new String[][]{{"org.jfree.chart.plot.PiePlot", "getLegendItems", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.PiePlot", "org.jfree.chart.plot.PiePlot", "setLegendLabelURLGenerator", new String[]{"org.jfree.chart.urls.PieURLGenerator"}, new String[]{"<sample:6>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getBackgroundAlpha=1.0, getBackgroundImageAlignment=15, getBackgroundImageAlpha=0.5, getForegroundAlpha=1.0, getIgnoreNullValues=false, getIgnoreZeroValues=false, getInteriorGap=0.08, getLabelGap=0.0...#406#1662482779", SearchInputFactory_scaffolding.receiverState());
 }
}
