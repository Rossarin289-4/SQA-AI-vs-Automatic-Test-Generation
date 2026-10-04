package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "addChangeListener", new String[]{"org.jfree.chart.event.MarkerChangeListener"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "equals", "java.lang.Object", "<s:ao>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setValue", new String[]{"double"}, new String[]{"-4.9E-324"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=-4.9E-324}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "removeChangeListener", new String[]{"org.jfree.chart.event.MarkerChangeListener"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "addChangeListener", "org.jfree.chart.event.MarkerChangeListener", "<sample:4>"}, {"org.jfree.chart.plot.ValueMarker", "getOutlineStroke", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabel", new String[]{"java.lang.String"}, new String[]{"1234567890123456789012l34577890"}, false, 5, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelTextAnchor", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=1234567890123456789012l34577890, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getListeners", "java.lang.Class", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setOutlinePaint", "java.awt.Paint", "<sample:7>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelTextAnchor", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setOutlinePaint", "java.awt.Paint", "<sample:9>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.text.TextAnchor", actual.getClass().getName());
  assertEquals("TextAnchor.CENTER", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setAlpha", new String[]{"float"}, new String[]{"-Infinity"}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "removeChangeListener", new String[]{"org.jfree.chart.event.MarkerChangeListener"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"org.jfree.chart.plot.ValueMarker", "removeChangeListener", "org.jfree.chart.event.MarkerChangeListener", "<sample:5>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setValue", new String[]{"double"}, new String[]{"NaN"}, false, 5, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "removeChangeListener", new String[]{"org.jfree.chart.event.MarkerChangeListener"}, new String[]{"<sample:6>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelTextAnchor", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelFont", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.text.TextAnchor", actual.getClass().getName());
  assertEquals("TextAnchor.CENTER", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setStroke", "java.awt.Stroke", "<sample:4>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "addChangeListener", new String[]{"org.jfree.chart.event.MarkerChangeListener"}, new String[]{"<sample:5>"}, false, 6, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelOffsetType", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setLabelOffsetType", "org.jfree.chart.util.LengthAdjustmentType", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.LengthAdjustmentType", actual.getClass().getName());
  assertEquals("null", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setPaint", "java.awt.Paint", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelAnchor", new String[]{"org.jfree.chart.util.RectangleAnchor"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelOffset", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelFont", new String[]{"java.awt.Font"}, new String[]{"<sample:6>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelAnchor", new String[]{"org.jfree.chart.util.RectangleAnchor"}, new String[]{"<sample:3>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelTextAnchor", new String[]{"org.jfree.chart.text.TextAnchor"}, new String[]{"<sample:3>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getOutlinePaint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelTextAnchor", ""}}, 2), new String[][]{{"getColorSpace", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.awt.color.ICC_ColorSpace", actual.getClass().getName());
  assertEquals("{getNumComponents=3, getType=5, isCS_sRGB=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelTextAnchor", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelTextAnchor", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.text.TextAnchor", actual.getClass().getName());
  assertEquals("TextAnchor.CENTER", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "notifyListeners", new String[]{"org.jfree.chart.event.MarkerChangeEvent"}, new String[]{"<sample:2>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setOutlineStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:7>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelFont", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"hasUniformLineMetrics", "", "6"}, {"createGlyphVector", "java.awt.font.FontRenderContext,char[]", "4"}});
  assertNotNull(actual);
  assertEquals("sun.font.StandardGlyphVector", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabel", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setOutlineStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:7>"}, false, 2, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelOffset", new String[]{"org.jfree.chart.util.RectangleInsets"}, new String[]{"<sample:1>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelOffsetType", new String[]{"org.jfree.chart.util.LengthAdjustmentType"}, new String[]{"<sample:0>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelFont", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelPaint", ""}, {"org.jfree.chart.plot.ValueMarker", "getListeners", "java.lang.Class", "<sample:2>"}}, 1), new String[][]{{"getItalicAngle", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabel", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "equals", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelTextAnchor", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getListeners", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 5, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelOffsetType", new String[]{"org.jfree.chart.util.LengthAdjustmentType"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "addChangeListener", "org.jfree.chart.event.MarkerChangeListener", "<sample:6>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelFont", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setAlpha", "float", "NaN"}}, 1), new String[][]{{"createGlyphVector", "java.awt.font.FontRenderContext,java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("sun.font.StandardGlyphVector", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAlpha=NaN, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "equals", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelOffset", ""}, {"org.jfree.chart.plot.ValueMarker", "getLabelTextAnchor", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getOutlinePaint", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1), new String[][]{{"getTransparency", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelPaint", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"brighter", "", "5"}, {"getRGBColorComponents", "float[]", "2"}});
  assertNotNull(actual);
  assertEquals("[F", actual.getClass().getName());
  assertEquals("[0.011764706, 0.011764706, 0.011764706]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getPaint", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"getColorComponents", "float[]", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 2, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getAlpha", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelTextAnchor", new String[]{"org.jfree.chart.text.TextAnchor"}, new String[]{"<sample:5>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelOffset", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setLabelTextAnchor", "org.jfree.chart.text.TextAnchor", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleInsets", actual.getClass().getName());
  assertEquals("RectangleInsets[t=3.0,l=3.0,b=3.0,r=3.0] {getBottom=3.0, getLeft=3.0, getRight=3.0, getTop=3.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelFont", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"deriveFont", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.awt.Font", actual.getClass().getName());
  assertEquals("java.awt.Font[family=SansSerif,name=SansSerif,style=plain,size=9] {getAvailableAttributes=[java.awt.font.TextAttribute(family), java.awt.font.TextAttr.., getFamily=SansSerif, getFontName=SansSerif.pla...#449#-808513352", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "clone", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.ValueMarker", actual.getClass().getName());
  assertEquals("{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelFont", new String[]{"java.awt.Font"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "removeChangeListener", "org.jfree.chart.event.MarkerChangeListener", "<sample:1>"}, {"org.jfree.chart.plot.ValueMarker", "getLabel", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getOutlineStroke", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3), new String[][]{{"getEndCap", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setValue", "double", "-Infinity"}}, 1), new String[][]{{"setLabelOffsetType", "org.jfree.chart.util.LengthAdjustmentType", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setLabelFont", "java.awt.Font", "<sample:6>"}, {"org.jfree.chart.plot.ValueMarker", "clone", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelTextAnchor", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setLabelTextAnchor", "org.jfree.chart.text.TextAnchor", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.text.TextAnchor", actual.getClass().getName());
  assertEquals("null", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelPaint", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.ValueMarker", "removeChangeListener", "org.jfree.chart.event.MarkerChangeListener", "<sample:3>"}, {"org.jfree.chart.plot.ValueMarker", "getLabelFont", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=0] {getAlpha=255, getBlue=0, getGreen=0, getRGB=-16777216, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelAnchor", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelTextAnchor", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleAnchor", actual.getClass().getName());
  assertEquals("RectangleAnchor.TOP_LEFT", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelOffsetType", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.LengthAdjustmentType", actual.getClass().getName());
  assertEquals("CONTRACT", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:6>"}, false, 2, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelFont", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "notifyListeners", new String[]{"org.jfree.chart.event.MarkerChangeEvent"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"org.jfree.chart.plot.ValueMarker", "equals", "java.lang.Object", "<s:`o>"}, {"org.jfree.chart.plot.ValueMarker", "getListeners", "java.lang.Class", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelOffset", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2), new String[][]{{"trim", "java.awt.geom.Rectangle2D", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelPaint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelOffsetType", ""}}, 3), new String[][]{{"getAlpha", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("255", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelAnchor", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "addChangeListener", "org.jfree.chart.event.MarkerChangeListener", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleAnchor", actual.getClass().getName());
  assertEquals("RectangleAnchor.TOP_LEFT", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:8>"}, false, 2, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setAlpha", "float", "0.0"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.0, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getAlpha", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.ValueMarker", "removeChangeListener", "org.jfree.chart.event.MarkerChangeListener", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setPaint", new String[]{"java.awt.Paint"}, new String[]{"<null>"}, false, 2, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabel", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setOutlinePaint", "java.awt.Paint", "<sample:9>"}, {"org.jfree.chart.plot.ValueMarker", "getLabel", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setAlpha", new String[]{"float"}, new String[]{"NaN"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=NaN, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelOffset", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelPaint", ""}}, 2), new String[][]{{"calculateBottomInset", "double", "1"}, {"getRight", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelOffsetType", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setOutlinePaint", "java.awt.Paint", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.LengthAdjustmentType", actual.getClass().getName());
  assertEquals("CONTRACT", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelOffset", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.ValueMarker", "equals", "java.lang.Object", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleInsets", actual.getClass().getName());
  assertEquals("RectangleInsets[t=3.0,l=3.0,b=3.0,r=3.0] {getBottom=3.0, getLeft=3.0, getRight=3.0, getTop=3.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabel", new String[]{"java.lang.String"}, new String[]{"-D.5\n"}, false, 6, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=-D.5\n, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getOutlinePaint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "equals", "java.lang.Object", "<d:15.0>"}}, 3), new String[][]{{"getGreen", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("128", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getOutlineStroke", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setStroke", "java.awt.Stroke", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.awt.BasicStroke", actual.getClass().getName());
  assertEquals("{getDashArray=null, getDashPhase=0.0, getEndCap=2, getLineJoin=0, getLineWidth=0.5, getMiterLimit=10.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabel", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c+1"}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "removeChangeListener", "org.jfree.chart.event.MarkerChangeListener", "<sample:3>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=http://example.com/a?b=c+1, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getAlpha", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getAlpha", ""}, {"org.jfree.chart.plot.ValueMarker", "removeChangeListener", "org.jfree.chart.event.MarkerChangeListener", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelFont", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3), new String[][]{{"deriveFont", "int,float", "7"}});
  assertNotNull(actual);
  assertEquals("java.awt.Font", actual.getClass().getName());
  assertEquals("java.awt.Font[family=SansSerif,name=SansSerif,style=plain,size=1] {getAvailableAttributes=[java.awt.font.TextAttribute(family), java.awt.font.TextAttr.., getFamily=SansSerif, getFontName=SansSerif.pla...#449#909966528", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:7>"}, false, 2, new String[][]{{"org.jfree.chart.plot.ValueMarker", "removeChangeListener", "org.jfree.chart.event.MarkerChangeListener", "<null>"}, {"org.jfree.chart.plot.ValueMarker", "equals", "java.lang.Object", "<sample:1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:10>"}, false, 2, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelTextAnchor", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "addChangeListener", new String[]{"org.jfree.chart.event.MarkerChangeListener"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setOutlinePaint", "java.awt.Paint", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelOffsetType", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getAlpha", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.LengthAdjustmentType", actual.getClass().getName());
  assertEquals("CONTRACT", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setValue", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 6, new String[][]{{"org.jfree.chart.plot.ValueMarker", "addChangeListener", "org.jfree.chart.event.MarkerChangeListener", "<sample:7>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabel", new String[]{"java.lang.String"}, new String[]{"TITE"}, false, 6, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=TITE, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:6>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelTextAnchor", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setLabelAnchor", "org.jfree.chart.util.RectangleAnchor", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.text.TextAnchor", actual.getClass().getName());
  assertEquals("TextAnchor.CENTER", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getAlpha", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:3>"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setOutlinePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setLabel", "java.lang.String", "--1TITLE"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=--1TITLE, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getOutlinePaint", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setValue", "double", "-1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=128,g=128,b=128] {getAlpha=255, getBlue=128, getGreen=128, getRGB=-8355712, getRed=128, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelOffset", new String[]{"org.jfree.chart.util.RectangleInsets"}, new String[]{"<sample:4>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setValue", new String[]{"double"}, new String[]{"-0.9999999999999999"}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getStroke", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-0.9999999999999999}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setValue", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.ValueMarker", actual.getClass().getName());
  assertEquals("{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getListeners", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setLabelAnchor", "org.jfree.chart.util.RectangleAnchor", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelOffset", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelPaint", ""}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleInsets", actual.getClass().getName());
  assertEquals("RectangleInsets[t=3.0,l=3.0,b=3.0,r=3.0] {getBottom=3.0, getLeft=3.0, getRight=3.0, getTop=3.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelAnchor", new String[]{"org.jfree.chart.util.RectangleAnchor"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setPaint", "java.awt.Paint", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelOffset", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleInsets", actual.getClass().getName());
  assertEquals("RectangleInsets[t=3.0,l=3.0,b=3.0,r=3.0] {getBottom=3.0, getLeft=3.0, getRight=3.0, getTop=3.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getStroke", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setOutlinePaint", "java.awt.Paint", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.awt.BasicStroke", actual.getClass().getName());
  assertEquals("{getDashArray=null, getDashPhase=0.0, getEndCap=2, getLineJoin=0, getLineWidth=0.5, getMiterLimit=10.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelTextAnchor", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.text.TextAnchor", actual.getClass().getName());
  assertEquals("TextAnchor.CENTER", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelFont", new String[]{"java.awt.Font"}, new String[]{"<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getAlpha", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getOutlineStroke", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.awt.BasicStroke", actual.getClass().getName());
  assertEquals("{getDashArray=null, getDashPhase=0.0, getEndCap=2, getLineJoin=0, getLineWidth=0.5, getMiterLimit=10.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:aol>"}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getOutlinePaint", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelTextAnchor", new String[]{"org.jfree.chart.text.TextAnchor"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelPaint", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelTextAnchor", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getListeners", "java.lang.Class", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.text.TextAnchor", actual.getClass().getName());
  assertEquals("TextAnchor.CENTER", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelOffset", new String[]{"org.jfree.chart.util.RectangleInsets"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabel", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelPaint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setLabelFont", "java.awt.Font", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=0] {getAlpha=255, getBlue=0, getGreen=0, getRGB=-16777216, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setLabelAnchor", "org.jfree.chart.util.RectangleAnchor", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.ValueMarker", actual.getClass().getName());
  assertEquals("{getAlpha=1.0, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelAnchor", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleAnchor", actual.getClass().getName());
  assertEquals("RectangleAnchor.TOP_LEFT", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setOutlineStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "addChangeListener", new String[]{"org.jfree.chart.event.MarkerChangeListener"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setOutlineStroke", "java.awt.Stroke", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "addChangeListener", new String[]{"org.jfree.chart.event.MarkerChangeListener"}, new String[]{"<sample:2>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabel", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFF"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=0xFFFFFFFF, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelOffsetType", new String[]{"org.jfree.chart.util.LengthAdjustmentType"}, new String[]{"<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getOutlinePaint", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelTextAnchor", ""}}), new String[][]{{"darker", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=89,g=89,b=89] {getAlpha=255, getBlue=89, getGreen=89, getRGB=-10921639, getRed=89, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabel", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setAlpha", "float", "2.0"}, {"org.jfree.chart.plot.ValueMarker", "getPaint", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setAlpha", new String[]{"float"}, new String[]{"-Infinity"}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelOffsetType", ""}, {"org.jfree.chart.plot.ValueMarker", "clone", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabel", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.chart.plot.ValueMarker", "notifyListeners", "org.jfree.chart.event.MarkerChangeEvent", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelPaint", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setLabelOffset", "org.jfree.chart.util.RectangleInsets", "<sample:10>"}}), new String[][]{{"getGreen", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getPaint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setStroke", "java.awt.Stroke", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=128,g=128,b=128] {getAlpha=255, getBlue=128, getGreen=128, getRGB=-8355712, getRed=128, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelOffset", new String[]{"org.jfree.chart.util.RectangleInsets"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setLabel", "java.lang.String", "1.25"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=1.25, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelTextAnchor", new String[]{"org.jfree.chart.text.TextAnchor"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setOutlinePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:4>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setValue", new String[]{"double"}, new String[]{"0.5"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelAnchor", new String[]{"org.jfree.chart.util.RectangleAnchor"}, new String[]{"<sample:7>"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelFont", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.awt.Font", actual.getClass().getName());
  assertEquals("java.awt.Font[family=SansSerif,name=SansSerif,style=plain,size=9] {getAvailableAttributes=[java.awt.font.TextAttribute(family), java.awt.font.TextAttr.., getFamily=SansSerif, getFontName=SansSerif.pla...#449#-808513352", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setOutlinePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabel", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "removeChangeListener", new String[]{"org.jfree.chart.event.MarkerChangeListener"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setLabelFont", "java.awt.Font", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelOffset", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleInsets", actual.getClass().getName());
  assertEquals("RectangleInsets[t=3.0,l=3.0,b=3.0,r=3.0] {getBottom=3.0, getLeft=3.0, getRight=3.0, getTop=3.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getOutlinePaint", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=128,g=128,b=128] {getAlpha=255, getBlue=128, getGreen=128, getRGB=-8355712, getRed=128, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelFont", new String[]{"java.awt.Font"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getStroke", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelTextAnchor", new String[]{"org.jfree.chart.text.TextAnchor"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getOutlinePaint", ""}, {"org.jfree.chart.plot.ValueMarker", "removeChangeListener", "org.jfree.chart.event.MarkerChangeListener", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "notifyListeners", new String[]{"org.jfree.chart.event.MarkerChangeEvent"}, new String[]{"<sample:10>"}, false, 2, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelAnchor", ""}, {"org.jfree.chart.plot.ValueMarker", "setStroke", "java.awt.Stroke", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelFont", new String[]{}, new String[]{}, false), new String[][]{{"getTransform", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.AffineTransform", actual.getClass().getName());
  assertEquals("AffineTransform[[1.0, 0.0, 0.0], [0.0, 1.0, 0.0]] {getDeterminant=1.0, getScaleX=1.0, getScaleY=1.0, getShearX=0.0, getShearY=0.0, getTranslateX=0.0, getTranslateY=0.0, getType=0, isIdentity=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setValue", new String[]{"double"}, new String[]{"Infinity"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabel", new String[]{"java.lang.String"}, new String[]{"1E-5"}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "removeChangeListener", "org.jfree.chart.event.MarkerChangeListener", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=1E-5, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setLabelTextAnchor", "org.jfree.chart.text.TextAnchor", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getOutlineStroke", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.awt.BasicStroke", actual.getClass().getName());
  assertEquals("{getDashArray=null, getDashPhase=0.0, getEndCap=2, getLineJoin=0, getLineWidth=0.5, getMiterLimit=10.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelFont", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "notifyListeners", "org.jfree.chart.event.MarkerChangeEvent", "<sample:9>"}}), new String[][]{{"isPlain", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelFont", new String[]{"java.awt.Font"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setLabel", "java.lang.String", "1E-51e10"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=1E-51e10, getValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelTextAnchor", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelTextAnchor", ""}, {"org.jfree.chart.plot.ValueMarker", "setLabel", "java.lang.String", "1234567890123456789012l34577890"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.text.TextAnchor", actual.getClass().getName());
  assertEquals("TextAnchor.CENTER", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=1234567890123456789012l34577890, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getPaint", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setOutlineStroke", "java.awt.Stroke", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:5>"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelOffsetType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.LengthAdjustmentType", actual.getClass().getName());
  assertEquals("CONTRACT", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setValue", new String[]{"double"}, new String[]{"1.0"}, false, 5, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setOutlinePaint", "java.awt.Paint", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setAlpha", "float", "-3.4028235E38"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabel", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setOutlinePaint", "java.awt.Paint", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=1.12345678, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelFont", new String[]{"java.awt.Font"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabel", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "addChangeListener", "org.jfree.chart.event.MarkerChangeListener", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getOutlinePaint", new String[]{}, new String[]{}, false), new String[][]{{"getRed", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("128", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "addChangeListener", new String[]{"org.jfree.chart.event.MarkerChangeListener"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setValue", "double", "-1.0000000000000002"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=-1.0000000000000002}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelFont", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "removeChangeListener", "org.jfree.chart.event.MarkerChangeListener", "<sample:2>"}}), new String[][]{{"getFamily", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("SansSerif", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setOutlineStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:5>"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelFont", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "clone", ""}}), new String[][]{{"getMaxCharBounds", "java.awt.font.FontRenderContext", "0"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Rectangle2D$Float", actual.getClass().getName());
  assertEquals("java.awt.geom.Rectangle2D$Float[x=0.0,y=-8.354004,w=17.0,h=10.4765625] {getCenterX=8.5, getCenterY=-3.11572265625, getHeight=10.4765625, getMaxX=17.0, getMaxY=2.12255859375, getMinX=0.0, getMinY=-8.35...#271#1658686675", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getPaint", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.ValueMarker", "addChangeListener", "org.jfree.chart.event.MarkerChangeListener", "<sample:7>"}}), new String[][]{{"getAlpha", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("255", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelTextAnchor", ""}}), new String[][]{{"getLabelTextAnchor", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.text.TextAnchor", actual.getClass().getName());
  assertEquals("TextAnchor.CENTER", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:7>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getOutlinePaint", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getOutlinePaint", ""}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabel", new String[]{"java.lang.String"}, new String[]{"<a>"}, false, 6, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getListeners", "java.lang.Class", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=<a>, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setOutlineStroke", "java.awt.Stroke", "<sample:2>"}}), new String[][]{{"getLabelAnchor", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleAnchor", actual.getClass().getName());
  assertEquals("RectangleAnchor.TOP_LEFT", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "removeChangeListener", new String[]{"org.jfree.chart.event.MarkerChangeListener"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"org.jfree.chart.plot.ValueMarker", "removeChangeListener", "org.jfree.chart.event.MarkerChangeListener", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelAnchor", new String[]{"org.jfree.chart.util.RectangleAnchor"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "addChangeListener", "org.jfree.chart.event.MarkerChangeListener", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelOffset", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setLabel", "java.lang.String", "2147483648"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleInsets", actual.getClass().getName());
  assertEquals("RectangleInsets[t=3.0,l=3.0,b=3.0,r=3.0] {getBottom=3.0, getLeft=3.0, getRight=3.0, getTop=3.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=2147483648, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getOutlineStroke", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.chart.plot.ValueMarker", "removeChangeListener", "org.jfree.chart.event.MarkerChangeListener", "<sample:0>"}, {"org.jfree.chart.plot.ValueMarker", "equals", "java.lang.Object", "<s:a>"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setValue", "double", "-Infinity"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabel", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.plot.ValueMarker", "notifyListeners", "org.jfree.chart.event.MarkerChangeEvent", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelFont", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.awt.Font", actual.getClass().getName());
  assertEquals("java.awt.Font[family=SansSerif,name=SansSerif,style=plain,size=9] {getAvailableAttributes=[java.awt.font.TextAttribute(family), java.awt.font.TextAttr.., getFamily=SansSerif, getFontName=SansSerif.pla...#449#-808513352", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelOffset", new String[]{"org.jfree.chart.util.RectangleInsets"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setPaint", "java.awt.Paint", "<sample:4>"}, {"org.jfree.chart.plot.ValueMarker", "getLabelTextAnchor", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelFont", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"deriveFont", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.awt.Font", actual.getClass().getName());
  assertEquals("java.awt.Font[family=SansSerif,name=SansSerif,style=plain,size=9] {getAvailableAttributes=[java.awt.font.TextAttribute(family), java.awt.font.TextAttr.., getFamily=SansSerif, getFontName=SansSerif.pla...#449#-808513352", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 3, new String[][]{{"org.jfree.chart.plot.ValueMarker", "addChangeListener", "org.jfree.chart.event.MarkerChangeListener", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "notifyListeners", new String[]{"org.jfree.chart.event.MarkerChangeEvent"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getAlpha", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelOffsetType", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.plot.ValueMarker", "equals", "java.lang.Object", "<s:>"}, {"org.jfree.chart.plot.ValueMarker", "getOutlinePaint", ""}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.LengthAdjustmentType", actual.getClass().getName());
  assertEquals("CONTRACT", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getStroke", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelTextAnchor", ""}}), new String[][]{{"getMiterLimit", "", "2"}, {"getLineWidth", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getStroke", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"getOutlinePaint", "", "3"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabel", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, false, 3, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelFont", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=http://example.com/a?b=c, getValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getOutlinePaint", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setLabel", "java.lang.String", "{\"a\"\n1}"}, {"org.jfree.chart.plot.ValueMarker", "getOutlineStroke", ""}}), new String[][]{{"getTransparency", "", "2"}, {"getTransparency", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel={\"a\"\n1}, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelOffset", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.ValueMarker", "removeChangeListener", "org.jfree.chart.event.MarkerChangeListener", "<null>"}, {"org.jfree.chart.plot.ValueMarker", "getValue", ""}}), new String[][]{{"createAdjustedRectangle", "java.awt.geom.Rectangle2D,org.jfree.chart.util.LengthAdjustmentType,org.jfree.chart.util.LengthAdjustmentType", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getOutlinePaint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getStroke", ""}, {"org.jfree.chart.plot.ValueMarker", "getLabelTextAnchor", ""}}), new String[][]{{"getRGBComponents", "float[]", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelPaint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setLabel", "java.lang.String", "\n"}}), new String[][]{{"getComponents", "float[]", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelFont", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"canDisplayUpTo", "java.text.CharacterIterator,int,int", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelPaint", new String[]{}, new String[]{}, false), new String[][]{{"getRGB", "", "2"}, {"getAlpha", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("255", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelOffsetType", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.ValueMarker", "equals", "java.lang.Object", "<b:false>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.LengthAdjustmentType", actual.getClass().getName());
  assertEquals("CONTRACT", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelOffset", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setPaint", "java.awt.Paint", "<sample:4>"}, {"org.jfree.chart.plot.ValueMarker", "getOutlinePaint", ""}}), new String[][]{{"calculateTopInset", "double", "6"}, {"calculateTopOutset", "double", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelPaint", new String[]{"java.awt.Paint"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setOutlineStroke", "java.awt.Stroke", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getPaint", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setLabelFont", "java.awt.Font", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelOffset", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getPaint", ""}, {"org.jfree.chart.plot.ValueMarker", "getPaint", ""}}), new String[][]{{"extendWidth", "double", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("6.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setAlpha", new String[]{"float"}, new String[]{"0.0"}, false, 3, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setAlpha", "float", "1.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.0, getLabel=null, getValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelOffset", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"extendHeight", "double", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("7.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getListeners", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.jfree.chart.plot.ValueMarker", "clone", ""}, {"org.jfree.chart.plot.ValueMarker", "getLabelFont", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setStroke", new String[]{"java.awt.Stroke"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setValue", "double", "-0.1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getStroke", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setAlpha", "float", "Infinity"}, {"org.jfree.chart.plot.ValueMarker", "getAlpha", ""}}), new String[][]{{"getEndCap", "", "6"}, {"getEndCap", "", "3"}, {"getLineJoin", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelFont", ""}}), new String[][]{{"getLabel", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getAlpha", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "clone", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelFont", ""}}), new String[][]{{"setAlpha", "float", "7"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.ValueMarker", actual.getClass().getName());
  assertEquals("{getAlpha=0.0, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getOutlineStroke", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "equals", "java.lang.Object", "<s:I>"}}), new String[][]{{"getLineWidth", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:7>"}, false, 2, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setLabelTextAnchor", "org.jfree.chart.text.TextAnchor", "<sample:5>"}, {"org.jfree.chart.plot.ValueMarker", "getLabel", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setOutlineStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:4>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelAnchor", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.chart.plot.ValueMarker", "removeChangeListener", "org.jfree.chart.event.MarkerChangeListener", "<sample:3>"}, {"org.jfree.chart.plot.ValueMarker", "getPaint", ""}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleAnchor", actual.getClass().getName());
  assertEquals("RectangleAnchor.TOP_LEFT", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getOutlineStroke", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "equals", "java.lang.Object", "<d:0.75>"}}), new String[][]{{"createStrokedShape", "java.awt.Shape", "7"}, {"getPathIterator", "java.awt.geom.AffineTransform", "3"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Path2D$Double$TxIterator", actual.getClass().getName());
  assertEquals("{getWindingRule=1, isDone=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelOffsetType", new String[]{"org.jfree.chart.util.LengthAdjustmentType"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setLabelOffset", "org.jfree.chart.util.RectangleInsets", "<sample:4>"}, {"org.jfree.chart.plot.ValueMarker", "setStroke", "java.awt.Stroke", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelOffsetType", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setLabelFont", "java.awt.Font", "<sample:0>"}, {"org.jfree.chart.plot.ValueMarker", "getValue", ""}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.LengthAdjustmentType", actual.getClass().getName());
  assertEquals("CONTRACT", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelPaint", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.ValueMarker", "removeChangeListener", "org.jfree.chart.event.MarkerChangeListener", "<sample:1>"}, {"org.jfree.chart.plot.ValueMarker", "equals", "java.lang.Object", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=0] {getAlpha=255, getBlue=0, getGreen=0, getRGB=-16777216, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getOutlinePaint", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=128,g=128,b=128] {getAlpha=255, getBlue=128, getGreen=128, getRGB=-8355712, getRed=128, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelAnchor", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleAnchor", actual.getClass().getName());
  assertEquals("RectangleAnchor.TOP_LEFT", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelAnchor", new String[]{"org.jfree.chart.util.RectangleAnchor"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setLabel", "java.lang.String", "1-5e300"}, {"org.jfree.chart.plot.ValueMarker", "getLabelFont", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=1-5e300, getValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelOffsetType", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.LengthAdjustmentType", actual.getClass().getName());
  assertEquals("CONTRACT", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelAnchor", new String[]{"org.jfree.chart.util.RectangleAnchor"}, new String[]{"<sample:7>"}, false, 2, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelTextAnchor", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getStroke", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getListeners", "java.lang.Class", "<sample:1>"}}), new String[][]{{"createStrokedShape", "java.awt.Shape", "1"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Path2D$Double", actual.getClass().getName());
  assertEquals("{getWindingRule=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelAnchor", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleAnchor", actual.getClass().getName());
  assertEquals("RectangleAnchor.TOP_LEFT", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelOffset", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelOffset", ""}}), new String[][]{{"trimHeight", "double", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelTextAnchor", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.text.TextAnchor", actual.getClass().getName());
  assertEquals("TextAnchor.CENTER", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setValue", new String[]{"double"}, new String[]{"-1.0000000000000002"}, false, 2, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=-1.0000000000000002}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getStroke", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "removeChangeListener", "org.jfree.chart.event.MarkerChangeListener", "<sample:6>"}, {"org.jfree.chart.plot.ValueMarker", "getOutlineStroke", ""}}), new String[][]{{"getMiterLimit", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("10.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setOutlineStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:2>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelFont", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setStroke", "java.awt.Stroke", "<sample:2>"}}), new String[][]{{"canDisplayUpTo", "java.text.CharacterIterator,int,int", "3"}, {"hasUniformLineMetrics", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelAnchor", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.plot.ValueMarker", "removeChangeListener", "org.jfree.chart.event.MarkerChangeListener", "<sample:1>"}, {"org.jfree.chart.plot.ValueMarker", "equals", "java.lang.Object", "<s:a>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleAnchor", actual.getClass().getName());
  assertEquals("RectangleAnchor.TOP_LEFT", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "addChangeListener", new String[]{"org.jfree.chart.event.MarkerChangeListener"}, new String[]{"<sample:11>"}, false, 2, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setValue", "double", "4.9E-324"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=4.9E-324}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getPaint", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.plot.ValueMarker", "equals", "java.lang.Object", "<s:key>"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getOutlinePaint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelPaint", ""}}), new String[][]{{"getColorComponents", "java.awt.color.ColorSpace,float[]", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getOutlineStroke", new String[]{}, new String[]{}, false), new String[][]{{"getMiterLimit", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("10.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelOffset", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2), new String[][]{{"calculateTopInset", "double", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getOutlineStroke", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3), new String[][]{{"createStrokedShape", "java.awt.Shape", "5"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "addChangeListener", new String[]{"org.jfree.chart.event.MarkerChangeListener"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "removeChangeListener", "org.jfree.chart.event.MarkerChangeListener", "<sample:8>"}, {"org.jfree.chart.plot.ValueMarker", "setLabelFont", "java.awt.Font", "<sample:6>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getOutlineStroke", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.plot.ValueMarker", "removeChangeListener", "org.jfree.chart.event.MarkerChangeListener", "<sample:9>"}, {"org.jfree.chart.plot.ValueMarker", "equals", "java.lang.Object", "<i:0>"}}, 2), new String[][]{{"createStrokedShape", "java.awt.Shape", "6"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getOutlineStroke", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getListeners", "java.lang.Class", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.awt.BasicStroke", actual.getClass().getName());
  assertEquals("{getDashArray=null, getDashPhase=0.0, getEndCap=2, getLineJoin=0, getLineWidth=0.5, getMiterLimit=10.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getOutlineStroke", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"createStrokedShape", "java.awt.Shape", "2"}, {"getBounds", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.awt.Rectangle", actual.getClass().getName());
  assertEquals("java.awt.Rectangle[x=0,y=0,width=9,height=10] {getCenterX=4.5, getCenterY=5.0, getHeight=10.0, getMaxX=9.0, getMaxY=10.0, getMinX=0.0, getMinY=0.0, getWidth=9.0, getX=0.0, getY=0.0, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getOutlineStroke", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.awt.BasicStroke", actual.getClass().getName());
  assertEquals("{getDashArray=null, getDashPhase=0.0, getEndCap=2, getLineJoin=0, getLineWidth=0.5, getMiterLimit=10.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelPaint", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.plot.ValueMarker", "equals", "java.lang.Object", "<i:1>"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=0] {getAlpha=255, getBlue=0, getGreen=0, getRGB=-16777216, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getOutlineStroke", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getValue", ""}, {"org.jfree.chart.plot.ValueMarker", "clone", ""}}, 2), new String[][]{{"getEndCap", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getOutlineStroke", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getListeners", "java.lang.Class", "<sample:3>"}}), new String[][]{{"getDashPhase", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setAlpha", new String[]{"float"}, new String[]{"-3.4028235E38"}, false, 4, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelOffsetType", ""}, {"org.jfree.chart.plot.ValueMarker", "removeChangeListener", "org.jfree.chart.event.MarkerChangeListener", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelOffsetType", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.plot.ValueMarker", "notifyListeners", "org.jfree.chart.event.MarkerChangeEvent", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.LengthAdjustmentType", actual.getClass().getName());
  assertEquals("CONTRACT", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getStroke", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setOutlinePaint", "java.awt.Paint", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelOffsetType", new String[]{"org.jfree.chart.util.LengthAdjustmentType"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getPaint", ""}, {"org.jfree.chart.plot.ValueMarker", "getAlpha", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelOffset", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setOutlineStroke", "java.awt.Stroke", "<sample:5>"}}, 1), new String[][]{{"createOutsetRectangle", "java.awt.geom.Rectangle2D", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getStroke", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "removeChangeListener", "org.jfree.chart.event.MarkerChangeListener", "<sample:7>"}}), new String[][]{{"getEndCap", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getPaint", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setLabelTextAnchor", "org.jfree.chart.text.TextAnchor", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelPaint", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=0] {getAlpha=255, getBlue=0, getGreen=0, getRGB=-16777216, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:3>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getOutlineStroke", new String[]{}, new String[]{}, false), new String[][]{{"getLineWidth", "", "7"}, {"getDashArray", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabel", new String[]{"java.lang.String"}, new String[]{"0x123467899"}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "notifyListeners", "org.jfree.chart.event.MarkerChangeEvent", "<sample:3>"}, {"org.jfree.chart.plot.ValueMarker", "getLabelPaint", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=0x123467899, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getOutlineStroke", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.plot.ValueMarker", "notifyListeners", "org.jfree.chart.event.MarkerChangeEvent", "<sample:1>"}, {"org.jfree.chart.plot.ValueMarker", "getLabelTextAnchor", ""}}), new String[][]{{"createStrokedShape", "java.awt.Shape", "3"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:7>"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getOutlineStroke", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setLabelAnchor", "org.jfree.chart.util.RectangleAnchor", "<sample:5>"}, {"org.jfree.chart.plot.ValueMarker", "equals", "java.lang.Object", "<s:L>"}}, 2), new String[][]{{"createStrokedShape", "java.awt.Shape", "6"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:0>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getPaint", new String[]{}, new String[]{}, false), new String[][]{{"getColorSpace", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.awt.color.ICC_ColorSpace", actual.getClass().getName());
  assertEquals("{getNumComponents=3, getType=5, isCS_sRGB=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelOffset", new String[]{"org.jfree.chart.util.RectangleInsets"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"org.jfree.chart.plot.ValueMarker", "equals", "java.lang.Object", "<i:1>"}, {"org.jfree.chart.plot.ValueMarker", "getLabelFont", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "notifyListeners", new String[]{"org.jfree.chart.event.MarkerChangeEvent"}, new String[]{"<sample:6>"}, false, 3, new String[][]{{"org.jfree.chart.plot.ValueMarker", "addChangeListener", "org.jfree.chart.event.MarkerChangeListener", "<sample:4>"}, {"org.jfree.chart.plot.ValueMarker", "getOutlinePaint", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getValue", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelTextAnchor", new String[]{"org.jfree.chart.text.TextAnchor"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setOutlinePaint", "java.awt.Paint", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelAnchor", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelTextAnchor", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleAnchor", actual.getClass().getName());
  assertEquals("RectangleAnchor.TOP_LEFT", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.ValueMarker", "addChangeListener", "org.jfree.chart.event.MarkerChangeListener", "<sample:0>"}, {"org.jfree.chart.plot.ValueMarker", "setLabelFont", "java.awt.Font", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getStroke", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelOffset", ""}});
  assertNotNull(actual);
  assertEquals("java.awt.BasicStroke", actual.getClass().getName());
  assertEquals("{getDashArray=null, getDashPhase=0.0, getEndCap=2, getLineJoin=0, getLineWidth=0.5, getMiterLimit=10.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setValue", new String[]{"double"}, new String[]{"NaN"}, false, 7, new String[][]{{"org.jfree.chart.plot.ValueMarker", "removeChangeListener", "org.jfree.chart.event.MarkerChangeListener", "<sample:4>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelPaint", new String[]{}, new String[]{}, false), new String[][]{{"getColorSpace", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.awt.color.ICC_ColorSpace", actual.getClass().getName());
  assertEquals("{getNumComponents=3, getType=5, isCS_sRGB=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setValue", new String[]{"double"}, new String[]{"Infinity"}, false, 6, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setOutlinePaint", "java.awt.Paint", "<sample:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabel", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabel", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.plot.ValueMarker", "removeChangeListener", "org.jfree.chart.event.MarkerChangeListener", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setStroke", new String[]{"java.awt.Stroke"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelFont", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelFont", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setValue", "double", "1.0"}, {"org.jfree.chart.plot.ValueMarker", "getOutlineStroke", ""}}), new String[][]{{"deriveFont", "java.awt.geom.AffineTransform", "0"}});
  assertNotNull(actual);
  assertEquals("java.awt.Font", actual.getClass().getName());
  assertEquals("java.awt.Font[family=SansSerif,name=SansSerif,style=plain,size=9] {getAvailableAttributes=[java.awt.font.TextAttribute(family), java.awt.font.TextAttr.., getFamily=SansSerif, getFontName=SansSerif.pla...#449#-808513352", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.plot.ValueMarker", "removeChangeListener", "org.jfree.chart.event.MarkerChangeListener", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelOffset", new String[]{"org.jfree.chart.util.RectangleInsets"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelTextAnchor", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelFont", new String[]{"java.awt.Font"}, new String[]{"<sample:6>"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "removeChangeListener", "org.jfree.chart.event.MarkerChangeListener", "<sample:8>"}}, 3), new String[][]{{"getListeners", "java.lang.Class", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "notifyListeners", new String[]{"org.jfree.chart.event.MarkerChangeEvent"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setLabelAnchor", "org.jfree.chart.util.RectangleAnchor", "<sample:7>"}, {"org.jfree.chart.plot.ValueMarker", "getLabelFont", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getPaint", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelAnchor", ""}}, 3), new String[][]{{"getRGBColorComponents", "float[]", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelAnchor", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setLabelOffsetType", "org.jfree.chart.util.LengthAdjustmentType", "<sample:0>"}, {"org.jfree.chart.plot.ValueMarker", "setStroke", "java.awt.Stroke", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleAnchor", actual.getClass().getName());
  assertEquals("RectangleAnchor.TOP_LEFT", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getOutlineStroke", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "equals", "java.lang.Object", "<s:ao>"}, {"org.jfree.chart.plot.ValueMarker", "setValue", "double", "NaN"}}), new String[][]{{"getEndCap", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setOutlineStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelOffsetType", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelOffset", ""}, {"org.jfree.chart.plot.ValueMarker", "getAlpha", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getPaint", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.ValueMarker", "removeChangeListener", "org.jfree.chart.event.MarkerChangeListener", "<sample:7>"}}, 2), new String[][]{{"getTransparency", "", "5"}, {"getTransparency", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabel", new String[]{"java.lang.String"}, new String[]{"12:30:45[1,2]"}, false, 7, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelOffsetType", ""}, {"org.jfree.chart.plot.ValueMarker", "setLabel", "java.lang.String", "1.02345578"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=12:30:45[1,2], getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabel", new String[]{"java.lang.String"}, new String[]{"1.5d"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=1.5d, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "notifyListeners", new String[]{"org.jfree.chart.event.MarkerChangeEvent"}, new String[]{"<sample:1>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setValue", new String[]{"double"}, new String[]{"-Infinity"}, false, 6, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setLabelFont", "java.awt.Font", "<sample:4>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelOffset", new String[]{"org.jfree.chart.util.RectangleInsets"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabel", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelPaint", new String[]{"java.awt.Paint"}, new String[]{"<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:8>"}, false, 3, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setStroke", "java.awt.Stroke", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setAlpha", "float", "-2.0"}, {"org.jfree.chart.plot.ValueMarker", "getListeners", "java.lang.Class", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelOffset", new String[]{"org.jfree.chart.util.RectangleInsets"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getValue", ""}, {"org.jfree.chart.plot.ValueMarker", "setValue", "double", "1.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getOutlineStroke", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "equals", "java.lang.Object", "<i:0>"}, {"org.jfree.chart.plot.ValueMarker", "setValue", "double", "-1.7976931348623157E308"}}, 2), new String[][]{{"getMiterLimit", "", "7"}, {"getMiterLimit", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("10.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "clone", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"setAlpha", "float", "3"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.ValueMarker", actual.getClass().getName());
  assertEquals("{getAlpha=1.0, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setValue", new String[]{"double"}, new String[]{"Infinity"}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setAlpha", "float", "-3.4028235E38"}, {"org.jfree.chart.plot.ValueMarker", "getPaint", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.ValueMarker", actual.getClass().getName());
  assertEquals("{getAlpha=1.0, getLabel=null, getValue=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getOutlinePaint", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"getTransparency", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelAnchor", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setLabelAnchor", "org.jfree.chart.util.RectangleAnchor", "<sample:3>"}, {"org.jfree.chart.plot.ValueMarker", "getAlpha", ""}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleAnchor", actual.getClass().getName());
  assertEquals("null", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelOffsetType", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "addChangeListener", "org.jfree.chart.event.MarkerChangeListener", "<sample:6>"}, {"org.jfree.chart.plot.ValueMarker", "setLabelOffsetType", "org.jfree.chart.util.LengthAdjustmentType", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.LengthAdjustmentType", actual.getClass().getName());
  assertEquals("null", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getOutlineStroke", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setLabel", "java.lang.String", "aaaaaaaaaaabaaaaaaaaaaaaaaaaaa"}}, 1), new String[][]{{"getMiterLimit", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("10.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=aaaaaaaaaaabaaaaaaaaaaaaaaaaaa, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getStroke", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setLabelTextAnchor", "org.jfree.chart.text.TextAnchor", "<sample:3>"}}), new String[][]{{"getMiterLimit", "", "7"}, {"getDashPhase", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelPaint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setValue", "double", "0.0"}}), new String[][]{{"getComponents", "java.awt.color.ColorSpace,float[]", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getPaint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getStroke", ""}}), new String[][]{{"getRed", "", "0"}, {"getColorComponents", "float[]", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getOutlineStroke", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.plot.ValueMarker", "notifyListeners", "org.jfree.chart.event.MarkerChangeEvent", "<sample:1>"}}, 2), new String[][]{{"getDashPhase", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getOutlinePaint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getPaint", ""}}, 3), new String[][]{{"getRGB", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-8355712", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelOffsetType", ""}, {"org.jfree.chart.plot.ValueMarker", "setValue", "double", "-0.5"}}), new String[][]{{"setOutlinePaint", "java.awt.Paint", "5"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.ValueMarker", actual.getClass().getName());
  assertEquals("{getAlpha=0.8, getLabel=null, getValue=-0.5}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setOutlinePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"org.jfree.chart.plot.ValueMarker", "addChangeListener", "org.jfree.chart.event.MarkerChangeListener", "<sample:6>"}, {"org.jfree.chart.plot.ValueMarker", "getStroke", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabel", new String[]{"java.lang.String"}, new String[]{"12:30:450"}, false, 5, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelOffset", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=12:30:450, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setOutlineStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:5>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
}
