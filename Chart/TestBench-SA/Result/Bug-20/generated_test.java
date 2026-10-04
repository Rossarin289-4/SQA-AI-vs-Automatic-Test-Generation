package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getValue", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getOutlineStroke", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.ValueMarker", "equals", "java.lang.Object", "<s:>"}, {"org.jfree.chart.plot.ValueMarker", "removeChangeListener", "org.jfree.chart.event.MarkerChangeListener", "<sample:4>"}, {"org.jfree.chart.plot.ValueMarker", "setValue", "double", "0.0"}}, 2), new String[][]{{"getMiterLimit", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("10.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "addChangeListener", "org.jfree.chart.event.MarkerChangeListener", "<sample:12>"}, {"org.jfree.chart.plot.ValueMarker", "removeChangeListener", "org.jfree.chart.event.MarkerChangeListener", "<sample:6>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getAlpha", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getValue", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getAlpha", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getValue", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getAlpha", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getValue", new String[]{}, new String[]{}, false, 10, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getValue", new String[]{}, new String[]{}, false, 11, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.0, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getValue", new String[]{}, new String[]{}, false, 12, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getValue", new String[]{}, new String[]{}, false, 13, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getValue", new String[]{}, new String[]{}, false, 15, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getValue", new String[]{}, new String[]{}, false, 16, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getPaint", new String[]{}, new String[]{}, false, 13, new String[][]{}, 2), new String[][]{{"getTransparency", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getPaint", new String[]{}, new String[]{}, false, 10, new String[][]{}, 2), new String[][]{{"getTransparency", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelTextAnchor", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setLabelOffset", "org.jfree.chart.util.RectangleInsets", "<sample:7>"}, {"org.jfree.chart.plot.ValueMarker", "getLabelOffsetType", ""}, {"org.jfree.chart.plot.ValueMarker", "notifyListeners", "org.jfree.chart.event.MarkerChangeEvent", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.text.TextAnchor", actual.getClass().getName());
  assertEquals("TextAnchor.CENTER", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelTextAnchor", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setLabelOffset", "org.jfree.chart.util.RectangleInsets", "<sample:7>"}, {"org.jfree.chart.plot.ValueMarker", "getLabelOffsetType", ""}, {"org.jfree.chart.plot.ValueMarker", "notifyListeners", "org.jfree.chart.event.MarkerChangeEvent", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.text.TextAnchor", actual.getClass().getName());
  assertEquals("TextAnchor.CENTER", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelTextAnchor", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setLabelOffset", "org.jfree.chart.util.RectangleInsets", "<sample:7>"}, {"org.jfree.chart.plot.ValueMarker", "getLabelOffsetType", ""}, {"org.jfree.chart.plot.ValueMarker", "notifyListeners", "org.jfree.chart.event.MarkerChangeEvent", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.text.TextAnchor", actual.getClass().getName());
  assertEquals("TextAnchor.CENTER", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelTextAnchor", new String[]{}, new String[]{}, false, 25, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setLabelOffset", "org.jfree.chart.util.RectangleInsets", "<sample:7>"}, {"org.jfree.chart.plot.ValueMarker", "getLabelOffsetType", ""}, {"org.jfree.chart.plot.ValueMarker", "notifyListeners", "org.jfree.chart.event.MarkerChangeEvent", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.text.TextAnchor", actual.getClass().getName());
  assertEquals("TextAnchor.CENTER", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelTextAnchor", new String[]{}, new String[]{}, false, 26, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setLabelOffset", "org.jfree.chart.util.RectangleInsets", "<sample:7>"}, {"org.jfree.chart.plot.ValueMarker", "getLabelOffsetType", ""}, {"org.jfree.chart.plot.ValueMarker", "notifyListeners", "org.jfree.chart.event.MarkerChangeEvent", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.text.TextAnchor", actual.getClass().getName());
  assertEquals("TextAnchor.CENTER", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.0, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getStroke", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelOffset", ""}}, 2);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getStroke", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelOffset", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.awt.BasicStroke", actual.getClass().getName());
  assertEquals("{getDashArray=null, getDashPhase=0.0, getEndCap=2, getLineJoin=0, getLineWidth=0.5, getMiterLimit=10.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getStroke", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelOffset", ""}}, 2);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setAlpha", new String[]{"float"}, new String[]{"-Infinity"}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelAnchor", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleAnchor", actual.getClass().getName());
  assertEquals("RectangleAnchor.TOP_LEFT", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelAnchor", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleAnchor", actual.getClass().getName());
  assertEquals("RectangleAnchor.TOP_LEFT", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelAnchor", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleAnchor", actual.getClass().getName());
  assertEquals("RectangleAnchor.TOP_LEFT", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelAnchor", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleAnchor", actual.getClass().getName());
  assertEquals("RectangleAnchor.TOP_LEFT", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelAnchor", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleAnchor", actual.getClass().getName());
  assertEquals("RectangleAnchor.TOP_LEFT", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelAnchor", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getStroke", ""}, {"org.jfree.chart.plot.ValueMarker", "setLabelAnchor", "org.jfree.chart.util.RectangleAnchor", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleAnchor", actual.getClass().getName());
  assertEquals("null", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelTextAnchor", new String[]{"org.jfree.chart.text.TextAnchor"}, new String[]{"<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getValue", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setStroke", "java.awt.Stroke", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setStroke", "java.awt.Stroke", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setStroke", "java.awt.Stroke", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setStroke", "java.awt.Stroke", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.plot.ValueMarker", "clone", ""}, {"org.jfree.chart.plot.ValueMarker", "setStroke", "java.awt.Stroke", "<null>"}, {"org.jfree.chart.plot.ValueMarker", "getPaint", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getValue", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jfree.chart.plot.ValueMarker", "clone", ""}, {"org.jfree.chart.plot.ValueMarker", "setStroke", "java.awt.Stroke", "<null>"}, {"org.jfree.chart.plot.ValueMarker", "getPaint", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getValue", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jfree.chart.plot.ValueMarker", "clone", ""}, {"org.jfree.chart.plot.ValueMarker", "setStroke", "java.awt.Stroke", "<null>"}, {"org.jfree.chart.plot.ValueMarker", "getPaint", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getValue", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jfree.chart.plot.ValueMarker", "clone", ""}, {"org.jfree.chart.plot.ValueMarker", "setStroke", "java.awt.Stroke", "<null>"}, {"org.jfree.chart.plot.ValueMarker", "getPaint", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.0, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabel", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setLabelFont", "java.awt.Font", "<sample:2>"}, {"org.jfree.chart.plot.ValueMarker", "setOutlineStroke", "java.awt.Stroke", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setOutlinePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:0>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setOutlinePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setLabelPaint", "java.awt.Paint", "<sample:5>"}, {"org.jfree.chart.plot.ValueMarker", "setValue", "double", "NaN"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setOutlinePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:5>"}, false, 6, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelAnchor", new String[]{"org.jfree.chart.util.RectangleAnchor"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setLabelTextAnchor", "org.jfree.chart.text.TextAnchor", "<sample:5>"}, {"org.jfree.chart.plot.ValueMarker", "setLabel", "java.lang.String", "Tittle"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=Tittle, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelAnchor", new String[]{"org.jfree.chart.util.RectangleAnchor"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setLabelTextAnchor", "org.jfree.chart.text.TextAnchor", "<sample:5>"}, {"org.jfree.chart.plot.ValueMarker", "setLabel", "java.lang.String", "Tit4tle"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=Tit4tle, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setAlpha", new String[]{"float"}, new String[]{"-5.959"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getAlpha", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getAlpha", ""}, {"org.jfree.chart.plot.ValueMarker", "getAlpha", ""}, {"org.jfree.chart.plot.ValueMarker", "setPaint", "java.awt.Paint", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getAlpha", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getAlpha", ""}, {"org.jfree.chart.plot.ValueMarker", "getAlpha", ""}, {"org.jfree.chart.plot.ValueMarker", "setPaint", "java.awt.Paint", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getAlpha", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getAlpha", ""}, {"org.jfree.chart.plot.ValueMarker", "getAlpha", ""}, {"org.jfree.chart.plot.ValueMarker", "setPaint", "java.awt.Paint", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getAlpha", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getAlpha", ""}, {"org.jfree.chart.plot.ValueMarker", "getAlpha", ""}, {"org.jfree.chart.plot.ValueMarker", "setPaint", "java.awt.Paint", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getAlpha", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getAlpha", ""}, {"org.jfree.chart.plot.ValueMarker", "getAlpha", ""}, {"org.jfree.chart.plot.ValueMarker", "setPaint", "java.awt.Paint", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getAlpha", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getAlpha", ""}, {"org.jfree.chart.plot.ValueMarker", "setPaint", "java.awt.Paint", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.0, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getAlpha", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getAlpha", ""}, {"org.jfree.chart.plot.ValueMarker", "setPaint", "java.awt.Paint", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getOutlinePaint", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setOutlinePaint", "java.awt.Paint", "<sample:4>"}, {"org.jfree.chart.plot.ValueMarker", "setLabelAnchor", "org.jfree.chart.util.RectangleAnchor", "<sample:1>"}}, 1), new String[][]{{"getTransparency", "", "1"}, {"getTransparency", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setAlpha", new String[]{"float"}, new String[]{"-1.7014117E38"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelPaint", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getPaint", ""}, {"org.jfree.chart.plot.ValueMarker", "notifyListeners", "org.jfree.chart.event.MarkerChangeEvent", "<sample:6>"}}, 3), new String[][]{{"darker", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=0] {getAlpha=255, getBlue=0, getGreen=0, getRGB=-16777216, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelPaint", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getPaint", ""}, {"org.jfree.chart.plot.ValueMarker", "notifyListeners", "org.jfree.chart.event.MarkerChangeEvent", "<sample:6>"}}, 3), new String[][]{{"darker", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=0] {getAlpha=255, getBlue=0, getGreen=0, getRGB=-16777216, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelPaint", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getPaint", ""}, {"org.jfree.chart.plot.ValueMarker", "notifyListeners", "org.jfree.chart.event.MarkerChangeEvent", "<sample:6>"}}, 3), new String[][]{{"darker", "", "4"}, {"getAlpha", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("255", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelPaint", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getPaint", ""}, {"org.jfree.chart.plot.ValueMarker", "notifyListeners", "org.jfree.chart.event.MarkerChangeEvent", "<sample:3>"}}, 3), new String[][]{{"darker", "", "4"}, {"getAlpha", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("255", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelPaint", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getPaint", ""}, {"org.jfree.chart.plot.ValueMarker", "notifyListeners", "org.jfree.chart.event.MarkerChangeEvent", "<sample:3>"}}, 3), new String[][]{{"darker", "", "4"}, {"getAlpha", "", "5"}, {"getColorComponents", "float[]", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelPaint", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getPaint", ""}, {"org.jfree.chart.plot.ValueMarker", "notifyListeners", "org.jfree.chart.event.MarkerChangeEvent", "<sample:3>"}}, 3), new String[][]{{"darker", "", "4"}, {"getAlpha", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("255", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelPaint", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getPaint", ""}, {"org.jfree.chart.plot.ValueMarker", "notifyListeners", "org.jfree.chart.event.MarkerChangeEvent", "<sample:3>"}}, 3), new String[][]{{"darker", "", "4"}, {"getAlpha", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("255", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabel", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setLabel", "java.lang.String", "a b"}, {"org.jfree.chart.plot.ValueMarker", "getLabelFont", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a b", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=a b, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabel", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setLabel", "java.lang.String", "a b"}, {"org.jfree.chart.plot.ValueMarker", "getLabelFont", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a b", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=a b, getValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabel", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setLabel", "java.lang.String", "a b"}, {"org.jfree.chart.plot.ValueMarker", "getLabelFont", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a b", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=a b, getValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabel", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelFont", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getOutlineStroke", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1), new String[][]{{"createStrokedShape", "java.awt.Shape", "6"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getOutlineStroke", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelOffsetType", ""}}, 1), new String[][]{{"getMiterLimit", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("10.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getOutlineStroke", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelOffsetType", ""}}, 1), new String[][]{{"createStrokedShape", "java.awt.Shape", "6"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getOutlineStroke", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelOffsetType", ""}}, 1), new String[][]{{"getMiterLimit", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("10.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getOutlineStroke", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1), new String[][]{{"getMiterLimit", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("10.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getOutlineStroke", new String[]{}, new String[]{}, false, 9, new String[][]{}, 1), new String[][]{{"getMiterLimit", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("10.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getOutlineStroke", new String[]{}, new String[]{}, false, 12, new String[][]{}, 1), new String[][]{{"getMiterLimit", "", "6"}, {"getLineJoin", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getOutlineStroke", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setValue", "double", "Infinity"}}, 1), new String[][]{{"getMiterLimit", "", "6"}, {"getLineJoin", "", "6"}, {"createStrokedShape", "java.awt.Shape", "7"}});
  assertNotNull(actual);
  assertEquals("java.awt.geom.Path2D$Double", actual.getClass().getName());
  assertEquals("{getWindingRule=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getOutlineStroke", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setValue", "double", "Infinity"}}, 1), new String[][]{{"createStrokedShape", "java.awt.Shape", "6"}, {"getPathIterator", "java.awt.geom.AffineTransform", "6"}, {"currentSegment", "double[]", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getOutlineStroke", new String[]{}, new String[]{}, false, 16, new String[][]{}, 1), new String[][]{{"createStrokedShape", "java.awt.Shape", "6"}, {"getPathIterator", "java.awt.geom.AffineTransform", "6"}, {"currentSegment", "double[]", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getOutlineStroke", new String[]{}, new String[]{}, false, 17, new String[][]{}, 1), new String[][]{{"createStrokedShape", "java.awt.Shape", "6"}, {"getPathIterator", "java.awt.geom.AffineTransform", "6"}, {"currentSegment", "double[]", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getOutlineStroke", new String[]{}, new String[]{}, false, 22, new String[][]{}, 1), new String[][]{{"createStrokedShape", "java.awt.Shape", "6"}, {"getPathIterator", "java.awt.geom.AffineTransform", "6"}, {"currentSegment", "double[]", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getValue", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getValue", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getValue", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getValue", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getPaint", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=128,g=128,b=128] {getAlpha=255, getBlue=128, getGreen=128, getRGB=-8355712, getRed=128, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getPaint", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getPaint", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"getTransparency", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getPaint", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"getTransparency", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getPaint", new String[]{}, new String[]{}, false, 9, new String[][]{}), new String[][]{{"getComponents", "float[]", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getPaint", new String[]{}, new String[]{}, false, 10, new String[][]{}), new String[][]{{"getTransparency", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getPaint", new String[]{}, new String[]{}, false, 11, new String[][]{}), new String[][]{{"getTransparency", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.0, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getPaint", new String[]{}, new String[]{}, false, 13, new String[][]{}), new String[][]{{"getTransparency", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getPaint", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getListeners", "java.lang.Class", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=128,g=128,b=128] {getAlpha=255, getBlue=128, getGreen=128, getRGB=-8355712, getRed=128, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getPaint", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"getTransparency", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getPaint", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"getTransparency", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setStroke", new String[]{"java.awt.Stroke"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelTextAnchor", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.text.TextAnchor", actual.getClass().getName());
  assertEquals("TextAnchor.CENTER", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelTextAnchor", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.text.TextAnchor", actual.getClass().getName());
  assertEquals("TextAnchor.CENTER", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelTextAnchor", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.text.TextAnchor", actual.getClass().getName());
  assertEquals("TextAnchor.CENTER", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelTextAnchor", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.text.TextAnchor", actual.getClass().getName());
  assertEquals("TextAnchor.CENTER", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelTextAnchor", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.text.TextAnchor", actual.getClass().getName());
  assertEquals("TextAnchor.CENTER", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelFont", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelPaint", ""}});
  assertNotNull(actual);
  assertEquals("java.awt.Font", actual.getClass().getName());
  assertEquals("java.awt.Font[family=SansSerif,name=SansSerif,style=plain,size=9] {getAvailableAttributes=[java.awt.font.TextAttribute(family), java.awt.font.TextAttr.., getFamily=SansSerif, getFontName=SansSerif.pla...#449#-808513352", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelFont", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelPaint", ""}});
  assertNotNull(actual);
  assertEquals("java.awt.Font", actual.getClass().getName());
  assertEquals("java.awt.Font[family=SansSerif,name=SansSerif,style=plain,size=9] {getAvailableAttributes=[java.awt.font.TextAttribute(family), java.awt.font.TextAttr.., getFamily=SansSerif, getFontName=SansSerif.pla...#449#-808513352", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelFont", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelPaint", ""}});
  assertNotNull(actual);
  assertEquals("java.awt.Font", actual.getClass().getName());
  assertEquals("java.awt.Font[family=SansSerif,name=SansSerif,style=plain,size=9] {getAvailableAttributes=[java.awt.font.TextAttribute(family), java.awt.font.TextAttr.., getFamily=SansSerif, getFontName=SansSerif.pla...#449#-808513352", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelFont", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelPaint", ""}});
  assertNotNull(actual);
  assertEquals("java.awt.Font", actual.getClass().getName());
  assertEquals("java.awt.Font[family=SansSerif,name=SansSerif,style=plain,size=9] {getAvailableAttributes=[java.awt.font.TextAttribute(family), java.awt.font.TextAttr.., getFamily=SansSerif, getFontName=SansSerif.pla...#449#-808513352", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setOutlinePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getAlpha", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "removeChangeListener", new String[]{"org.jfree.chart.event.MarkerChangeListener"}, new String[]{"<sample:4>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "removeChangeListener", new String[]{"org.jfree.chart.event.MarkerChangeListener"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setValue", "double", "1.7976931348623157E308"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getStroke", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelOffset", ""}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getStroke", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelOffset", ""}});
  assertNotNull(actual);
  assertEquals("java.awt.BasicStroke", actual.getClass().getName());
  assertEquals("{getDashArray=null, getDashPhase=0.0, getEndCap=2, getLineJoin=0, getLineWidth=0.5, getMiterLimit=10.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getStroke", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelOffset", ""}});
  assertNotNull(actual);
  assertEquals("java.awt.BasicStroke", actual.getClass().getName());
  assertEquals("{getDashArray=null, getDashPhase=0.0, getEndCap=2, getLineJoin=0, getLineWidth=0.5, getMiterLimit=10.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelOffset", new String[]{"org.jfree.chart.util.RectangleInsets"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "clone", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setAlpha", new String[]{"float"}, new String[]{"-1.0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setAlpha", new String[]{"float"}, new String[]{"0.85"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.85, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setAlpha", new String[]{"float"}, new String[]{"1.0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setAlpha", new String[]{"float"}, new String[]{"0.985"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.985, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "notifyListeners", "org.jfree.chart.event.MarkerChangeEvent", "<sample:0>"}, {"org.jfree.chart.plot.ValueMarker", "equals", "java.lang.Object", "<i:2>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.ValueMarker", actual.getClass().getName());
  assertEquals("{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.plot.ValueMarker", "notifyListeners", "org.jfree.chart.event.MarkerChangeEvent", "<sample:0>"}, {"org.jfree.chart.plot.ValueMarker", "equals", "java.lang.Object", "<i:2>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.ValueMarker", actual.getClass().getName());
  assertEquals("{getAlpha=1.0, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelTextAnchor", ""}, {"org.jfree.chart.plot.ValueMarker", "notifyListeners", "org.jfree.chart.event.MarkerChangeEvent", "<sample:0>"}, {"org.jfree.chart.plot.ValueMarker", "equals", "java.lang.Object", "<i:2>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.ValueMarker", actual.getClass().getName());
  assertEquals("{getAlpha=1.0, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelTextAnchor", ""}, {"org.jfree.chart.plot.ValueMarker", "notifyListeners", "org.jfree.chart.event.MarkerChangeEvent", "<sample:0>"}, {"org.jfree.chart.plot.ValueMarker", "equals", "java.lang.Object", "<i:2>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.ValueMarker", actual.getClass().getName());
  assertEquals("{getAlpha=0.8, getLabel=null, getValue=Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelTextAnchor", ""}, {"org.jfree.chart.plot.ValueMarker", "notifyListeners", "org.jfree.chart.event.MarkerChangeEvent", "<sample:0>"}, {"org.jfree.chart.plot.ValueMarker", "equals", "java.lang.Object", "<i:2>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.ValueMarker", actual.getClass().getName());
  assertEquals("{getAlpha=1.0, getLabel=null, getValue=-Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "clone", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelTextAnchor", ""}, {"org.jfree.chart.plot.ValueMarker", "notifyListeners", "org.jfree.chart.event.MarkerChangeEvent", "<sample:2>"}, {"org.jfree.chart.plot.ValueMarker", "equals", "java.lang.Object", "<i:-2>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.ValueMarker", actual.getClass().getName());
  assertEquals("{getAlpha=0.8, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelAnchor", ""}, {"org.jfree.chart.plot.ValueMarker", "getOutlineStroke", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelOffset", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleInsets", actual.getClass().getName());
  assertEquals("RectangleInsets[t=3.0,l=3.0,b=3.0,r=3.0] {getBottom=3.0, getLeft=3.0, getRight=3.0, getTop=3.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelOffset", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleInsets", actual.getClass().getName());
  assertEquals("RectangleInsets[t=3.0,l=3.0,b=3.0,r=3.0] {getBottom=3.0, getLeft=3.0, getRight=3.0, getTop=3.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelOffset", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleInsets", actual.getClass().getName());
  assertEquals("RectangleInsets[t=3.0,l=3.0,b=3.0,r=3.0] {getBottom=3.0, getLeft=3.0, getRight=3.0, getTop=3.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelOffset", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"createInsetRectangle", "java.awt.geom.Rectangle2D", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelPaint", new String[]{"java.awt.Paint"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:7>"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelTextAnchor", new String[]{"org.jfree.chart.text.TextAnchor"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelTextAnchor", new String[]{"org.jfree.chart.text.TextAnchor"}, new String[]{"<sample:6>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getAlpha", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getAlpha", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getAlpha", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getAlpha", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getAlpha", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getAlpha", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelOffset", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelOffset", new String[]{"org.jfree.chart.util.RectangleInsets"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setLabelTextAnchor", "org.jfree.chart.text.TextAnchor", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelOffsetType", new String[]{"org.jfree.chart.util.LengthAdjustmentType"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getAlpha", ""}, {"org.jfree.chart.plot.ValueMarker", "setLabelFont", "java.awt.Font", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelOffsetType", new String[]{"org.jfree.chart.util.LengthAdjustmentType"}, new String[]{"<sample:7>"}, false, 7, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setPaint", "java.awt.Paint", "<sample:5>"}, {"org.jfree.chart.plot.ValueMarker", "getAlpha", ""}, {"org.jfree.chart.plot.ValueMarker", "setLabelFont", "java.awt.Font", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getValue", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelAnchor", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getValue", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelAnchor", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getValue", new String[]{}, new String[]{}, false, 11, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.0, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getOutlinePaint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "addChangeListener", "org.jfree.chart.event.MarkerChangeListener", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=128,g=128,b=128] {getAlpha=255, getBlue=128, getGreen=128, getRGB=-8355712, getRed=128, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getOutlinePaint", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.plot.ValueMarker", "addChangeListener", "org.jfree.chart.event.MarkerChangeListener", "<sample:3>"}, {"org.jfree.chart.plot.ValueMarker", "setLabelAnchor", "org.jfree.chart.util.RectangleAnchor", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setValue", new String[]{"double"}, new String[]{"-1.0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setValue", new String[]{"double"}, new String[]{"-1.47"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.47}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setValue", new String[]{"double"}, new String[]{"-1.4699999999999998"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.4699999999999998}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setValue", new String[]{"double"}, new String[]{"-1.1899999999999997"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.1899999999999997}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setValue", new String[]{"double"}, new String[]{"5.210000000000001"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=5.210000000000001}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelAnchor", new String[]{"org.jfree.chart.util.RectangleAnchor"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setPaint", "java.awt.Paint", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelAnchor", new String[]{"org.jfree.chart.util.RectangleAnchor"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setPaint", "java.awt.Paint", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "addChangeListener", new String[]{"org.jfree.chart.event.MarkerChangeListener"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelAnchor", new String[]{"org.jfree.chart.util.RectangleAnchor"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setLabelTextAnchor", "org.jfree.chart.text.TextAnchor", "<null>"}, {"org.jfree.chart.plot.ValueMarker", "setLabel", "java.lang.String", "Title"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=Title, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelAnchor", new String[]{"org.jfree.chart.util.RectangleAnchor"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setLabelTextAnchor", "org.jfree.chart.text.TextAnchor", "<sample:5>"}, {"org.jfree.chart.plot.ValueMarker", "setLabel", "java.lang.String", "Tittle"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=Tittle, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setAlpha", new String[]{"float"}, new String[]{"0.0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.0, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getOutlinePaint", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setOutlinePaint", "java.awt.Paint", "<sample:4>"}, {"org.jfree.chart.plot.ValueMarker", "setLabelAnchor", "org.jfree.chart.util.RectangleAnchor", "<sample:1>"}}), new String[][]{{"getTransparency", "", "1"}, {"getTransparency", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getOutlinePaint", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setOutlinePaint", "java.awt.Paint", "<sample:4>"}, {"org.jfree.chart.plot.ValueMarker", "setLabelAnchor", "org.jfree.chart.util.RectangleAnchor", "<sample:1>"}}), new String[][]{{"getTransparency", "", "1"}, {"getTransparency", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelPaint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getValue", ""}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=0] {getAlpha=255, getBlue=0, getGreen=0, getRGB=-16777216, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelPaint", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setValue", "double", "-1.0"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=0] {getAlpha=255, getBlue=0, getGreen=0, getRGB=-16777216, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelPaint", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setValue", "double", "-1.0"}, {"org.jfree.chart.plot.ValueMarker", "getPaint", ""}}), new String[][]{{"getColorComponents", "float[]", "5"}});
  assertNotNull(actual);
  assertEquals("[F", actual.getClass().getName());
  assertEquals("[0.0, 0.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelPaint", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setValue", "double", "-3.0"}, {"org.jfree.chart.plot.ValueMarker", "getPaint", ""}}), new String[][]{{"getColorComponents", "float[]", "5"}});
  assertNotNull(actual);
  assertEquals("[F", actual.getClass().getName());
  assertEquals("[0.0, 0.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=-3.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelPaint", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setValue", "double", "NaN"}, {"org.jfree.chart.plot.ValueMarker", "getPaint", ""}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=0] {getAlpha=255, getBlue=0, getGreen=0, getRGB=-16777216, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelPaint", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getPaint", ""}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=0] {getAlpha=255, getBlue=0, getGreen=0, getRGB=-16777216, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabel", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelFont", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabel", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelFont", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabel", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setLabel", "java.lang.String", "a b"}, {"org.jfree.chart.plot.ValueMarker", "getLabelFont", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a b", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=a b, getValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabel", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setLabel", "java.lang.String", "a b"}, {"org.jfree.chart.plot.ValueMarker", "getLabelFont", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a b", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=a b, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabel", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setLabel", "java.lang.String", "a b"}, {"org.jfree.chart.plot.ValueMarker", "getLabelFont", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a b", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=a b, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabel", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setLabel", "java.lang.String", "a b"}, {"org.jfree.chart.plot.ValueMarker", "getLabelFont", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a b", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=a b, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getOutlineStroke", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.awt.BasicStroke", actual.getClass().getName());
  assertEquals("{getDashArray=null, getDashPhase=0.0, getEndCap=2, getLineJoin=0, getLineWidth=0.5, getMiterLimit=10.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getOutlineStroke", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getOutlineStroke", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"createStrokedShape", "java.awt.Shape", "6"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getListeners", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setLabelPaint", "java.awt.Paint", "<sample:6>"}, {"org.jfree.chart.plot.ValueMarker", "removeChangeListener", "org.jfree.chart.event.MarkerChangeListener", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelTextAnchor", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getOutlinePaint", ""}, {"org.jfree.chart.plot.ValueMarker", "setLabelTextAnchor", "org.jfree.chart.text.TextAnchor", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.text.TextAnchor", actual.getClass().getName());
  assertEquals("null", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setPaint", new String[]{"java.awt.Paint"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setPaint", "java.awt.Paint", "<sample:5>"}, {"org.jfree.chart.plot.ValueMarker", "notifyListeners", "org.jfree.chart.event.MarkerChangeEvent", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setPaint", "java.awt.Paint", "<sample:5>"}, {"org.jfree.chart.plot.ValueMarker", "notifyListeners", "org.jfree.chart.event.MarkerChangeEvent", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getStroke", ""}, {"org.jfree.chart.plot.ValueMarker", "setPaint", "java.awt.Paint", "<sample:7>"}, {"org.jfree.chart.plot.ValueMarker", "notifyListeners", "org.jfree.chart.event.MarkerChangeEvent", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setLabelPaint", "java.awt.Paint", "<sample:1>"}, {"org.jfree.chart.plot.ValueMarker", "setOutlinePaint", "java.awt.Paint", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelFont", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.awt.Font", actual.getClass().getName());
  assertEquals("java.awt.Font[family=SansSerif,name=SansSerif,style=plain,size=9] {getAvailableAttributes=[java.awt.font.TextAttribute(family), java.awt.font.TextAttr.., getFamily=SansSerif, getFontName=SansSerif.pla...#449#-808513352", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelFont", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"isTransformed", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 3, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setLabel", "java.lang.String", "\u00e9"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=\u00e9, getValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 5, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setLabel", "java.lang.String", "\u00e9"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=\u00e9, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setValue", new String[]{"double"}, new String[]{"NaN"}, false, 11, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.0, getLabel=null, getValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setValue", new String[]{"double"}, new String[]{"NaN"}, false, 10, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setValue", new String[]{"double"}, new String[]{"NaN"}, false, 3, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelAnchor", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setValue", new String[]{"double"}, new String[]{"-0.1"}, false, 3, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelAnchor", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-0.1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setValue", new String[]{"double"}, new String[]{"Infinity"}, false, 3, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelAnchor", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setValue", new String[]{"double"}, new String[]{"-1.0"}, false, 3, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getOutlinePaint", ""}, {"org.jfree.chart.plot.ValueMarker", "getLabelAnchor", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setValue", new String[]{"double"}, new String[]{"-6.2"}, false, 3, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getOutlinePaint", ""}, {"org.jfree.chart.plot.ValueMarker", "getLabelAnchor", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-6.2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setValue", new String[]{"double"}, new String[]{"-7.800000000000001"}, false, 3, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getOutlinePaint", ""}, {"org.jfree.chart.plot.ValueMarker", "getLabelAnchor", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-7.800000000000001}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setValue", new String[]{"double"}, new String[]{"-3.9000000000000004"}, false, 3, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getOutlinePaint", ""}, {"org.jfree.chart.plot.ValueMarker", "getLabelAnchor", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-3.9000000000000004}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setValue", new String[]{"double"}, new String[]{"-1.9500000000000002"}, false, 3, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getOutlinePaint", ""}, {"org.jfree.chart.plot.ValueMarker", "getLabelAnchor", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.9500000000000002}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelAnchor", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleAnchor", actual.getClass().getName());
  assertEquals("RectangleAnchor.TOP_LEFT", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelAnchor", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleAnchor", actual.getClass().getName());
  assertEquals("RectangleAnchor.TOP_LEFT", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelAnchor", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleAnchor", actual.getClass().getName());
  assertEquals("RectangleAnchor.TOP_LEFT", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelAnchor", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleAnchor", actual.getClass().getName());
  assertEquals("RectangleAnchor.TOP_LEFT", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelAnchor", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleAnchor", actual.getClass().getName());
  assertEquals("RectangleAnchor.TOP_LEFT", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabel", new String[]{"java.lang.String"}, new String[]{"abc"}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelAnchor", ""}, {"org.jfree.chart.plot.ValueMarker", "setStroke", "java.awt.Stroke", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=abc, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabel", new String[]{"java.lang.String"}, new String[]{"abc1.1234567"}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelAnchor", ""}, {"org.jfree.chart.plot.ValueMarker", "setStroke", "java.awt.Stroke", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=abc1.1234567, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabel", new String[]{"java.lang.String"}, new String[]{"bbc1.1234567"}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelAnchor", ""}, {"org.jfree.chart.plot.ValueMarker", "setStroke", "java.awt.Stroke", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=bbc1.1234567, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabel", new String[]{"java.lang.String"}, new String[]{"bpbc1.1234567"}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelAnchor", ""}, {"org.jfree.chart.plot.ValueMarker", "setStroke", "java.awt.Stroke", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=bpbc1.1234567, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabel", new String[]{"java.lang.String"}, new String[]{"bpbc1.12345 67"}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelAnchor", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=bpbc1.12345 67, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelTextAnchor", new String[]{"org.jfree.chart.text.TextAnchor"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setAlpha", "float", "NaN"}, {"org.jfree.chart.plot.ValueMarker", "notifyListeners", "org.jfree.chart.event.MarkerChangeEvent", "<sample:7>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=NaN, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelTextAnchor", new String[]{"org.jfree.chart.text.TextAnchor"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setAlpha", "float", "-1.0"}, {"org.jfree.chart.plot.ValueMarker", "notifyListeners", "org.jfree.chart.event.MarkerChangeEvent", "<sample:6>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelTextAnchor", new String[]{"org.jfree.chart.text.TextAnchor"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setAlpha", "float", "-1.0"}, {"org.jfree.chart.plot.ValueMarker", "notifyListeners", "org.jfree.chart.event.MarkerChangeEvent", "<sample:6>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelTextAnchor", new String[]{"org.jfree.chart.text.TextAnchor"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setAlpha", "float", "1.0"}, {"org.jfree.chart.plot.ValueMarker", "notifyListeners", "org.jfree.chart.event.MarkerChangeEvent", "<sample:6>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelTextAnchor", new String[]{"org.jfree.chart.text.TextAnchor"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setAlpha", "float", "0.0"}, {"org.jfree.chart.plot.ValueMarker", "setAlpha", "float", "1.0"}, {"org.jfree.chart.plot.ValueMarker", "notifyListeners", "org.jfree.chart.event.MarkerChangeEvent", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelTextAnchor", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jfree.chart.plot.ValueMarker", "clone", ""}, {"org.jfree.chart.plot.ValueMarker", "addChangeListener", "org.jfree.chart.event.MarkerChangeListener", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.text.TextAnchor", actual.getClass().getName());
  assertEquals("TextAnchor.CENTER", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelTextAnchor", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.jfree.chart.plot.ValueMarker", "clone", ""}, {"org.jfree.chart.plot.ValueMarker", "addChangeListener", "org.jfree.chart.event.MarkerChangeListener", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.text.TextAnchor", actual.getClass().getName());
  assertEquals("TextAnchor.CENTER", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelTextAnchor", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.jfree.chart.plot.ValueMarker", "addChangeListener", "org.jfree.chart.event.MarkerChangeListener", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.text.TextAnchor", actual.getClass().getName());
  assertEquals("TextAnchor.CENTER", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelTextAnchor", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.jfree.chart.plot.ValueMarker", "addChangeListener", "org.jfree.chart.event.MarkerChangeListener", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.text.TextAnchor", actual.getClass().getName());
  assertEquals("TextAnchor.CENTER", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelTextAnchor", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setLabelOffset", "org.jfree.chart.util.RectangleInsets", "<sample:1>"}, {"org.jfree.chart.plot.ValueMarker", "addChangeListener", "org.jfree.chart.event.MarkerChangeListener", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.text.TextAnchor", actual.getClass().getName());
  assertEquals("TextAnchor.CENTER", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelTextAnchor", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getOutlinePaint", ""}, {"org.jfree.chart.plot.ValueMarker", "addChangeListener", "org.jfree.chart.event.MarkerChangeListener", "<null>"}, {"org.jfree.chart.plot.ValueMarker", "clone", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.text.TextAnchor", actual.getClass().getName());
  assertEquals("TextAnchor.CENTER", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelTextAnchor", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getOutlinePaint", ""}, {"org.jfree.chart.plot.ValueMarker", "addChangeListener", "org.jfree.chart.event.MarkerChangeListener", "<null>"}, {"org.jfree.chart.plot.ValueMarker", "clone", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.text.TextAnchor", actual.getClass().getName());
  assertEquals("TextAnchor.CENTER", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelTextAnchor", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getOutlinePaint", ""}, {"org.jfree.chart.plot.ValueMarker", "addChangeListener", "org.jfree.chart.event.MarkerChangeListener", "<sample:6>"}, {"org.jfree.chart.plot.ValueMarker", "clone", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.text.TextAnchor", actual.getClass().getName());
  assertEquals("TextAnchor.CENTER", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelTextAnchor", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getOutlinePaint", ""}, {"org.jfree.chart.plot.ValueMarker", "addChangeListener", "org.jfree.chart.event.MarkerChangeListener", "<sample:6>"}, {"org.jfree.chart.plot.ValueMarker", "clone", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.text.TextAnchor", actual.getClass().getName());
  assertEquals("TextAnchor.CENTER", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelTextAnchor", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getOutlinePaint", ""}, {"org.jfree.chart.plot.ValueMarker", "addChangeListener", "org.jfree.chart.event.MarkerChangeListener", "<sample:6>"}, {"org.jfree.chart.plot.ValueMarker", "setLabelTextAnchor", "org.jfree.chart.text.TextAnchor", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.text.TextAnchor", actual.getClass().getName());
  assertEquals("null", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelTextAnchor", new String[]{}, new String[]{}, false, 11, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.text.TextAnchor", actual.getClass().getName());
  assertEquals("TextAnchor.CENTER", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.0, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setOutlineStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelAnchor", new String[]{"org.jfree.chart.util.RectangleAnchor"}, new String[]{"<sample:3>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelAnchor", new String[]{"org.jfree.chart.util.RectangleAnchor"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "notifyListeners", "org.jfree.chart.event.MarkerChangeEvent", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "addChangeListener", new String[]{"org.jfree.chart.event.MarkerChangeListener"}, new String[]{"<sample:3>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getOutlinePaint", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"getTransparency", "", "1"}, {"getTransparency", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getOutlinePaint", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelTextAnchor", ""}}), new String[][]{{"getTransparency", "", "1"}, {"getTransparency", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelTextAnchor", ""}, {"org.jfree.chart.plot.ValueMarker", "setValue", "double", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setOutlineStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getStroke", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setOutlineStroke", new String[]{"java.awt.Stroke"}, new String[]{"<sample:1>"}, false, 11, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getStroke", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.0, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setAlpha", new String[]{"float"}, new String[]{"NaN"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=NaN, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelAnchor", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setLabelAnchor", "org.jfree.chart.util.RectangleAnchor", "<sample:7>"}, {"org.jfree.chart.plot.ValueMarker", "getListeners", "java.lang.Class", "<empty>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleAnchor", actual.getClass().getName());
  assertEquals("null", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelTextAnchor", new String[]{"org.jfree.chart.text.TextAnchor"}, new String[]{"<sample:5>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelTextAnchor", new String[]{"org.jfree.chart.text.TextAnchor"}, new String[]{"<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelTextAnchor", new String[]{"org.jfree.chart.text.TextAnchor"}, new String[]{"<sample:8>"}, false, 7, new String[][]{{"org.jfree.chart.plot.ValueMarker", "notifyListeners", "org.jfree.chart.event.MarkerChangeEvent", "<sample:1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelTextAnchor", new String[]{"org.jfree.chart.text.TextAnchor"}, new String[]{"<sample:8>"}, false, 6, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setStroke", "java.awt.Stroke", "<sample:5>"}, {"org.jfree.chart.plot.ValueMarker", "notifyListeners", "org.jfree.chart.event.MarkerChangeEvent", "<sample:1>"}, {"org.jfree.chart.plot.ValueMarker", "setLabelOffsetType", "org.jfree.chart.util.LengthAdjustmentType", "<sample:7>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelTextAnchor", new String[]{"org.jfree.chart.text.TextAnchor"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"org.jfree.chart.plot.ValueMarker", "notifyListeners", "org.jfree.chart.event.MarkerChangeEvent", "<sample:1>"}, {"org.jfree.chart.plot.ValueMarker", "setLabelOffsetType", "org.jfree.chart.util.LengthAdjustmentType", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getOutlinePaint", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabel", ""}, {"org.jfree.chart.plot.ValueMarker", "getOutlinePaint", ""}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=128,g=128,b=128] {getAlpha=255, getBlue=128, getGreen=128, getRGB=-8355712, getRed=128, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getOutlinePaint", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabel", ""}, {"org.jfree.chart.plot.ValueMarker", "getOutlinePaint", ""}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getOutlinePaint", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabel", ""}, {"org.jfree.chart.plot.ValueMarker", "getOutlinePaint", ""}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=128,g=128,b=128] {getAlpha=255, getBlue=128, getGreen=128, getRGB=-8355712, getRed=128, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "addChangeListener", new String[]{"org.jfree.chart.event.MarkerChangeListener"}, new String[]{"<sample:0>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelOffset", new String[]{"org.jfree.chart.util.RectangleInsets"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelOffset", new String[]{"org.jfree.chart.util.RectangleInsets"}, new String[]{"<sample:7>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2), new String[][]{{"setLabelPaint", "java.awt.Paint", "7"}, {"setOutlineStroke", "java.awt.Stroke", "4"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.ValueMarker", actual.getClass().getName());
  assertEquals("{getAlpha=1.0, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2), new String[][]{{"setLabelPaint", "java.awt.Paint", "7"}, {"setOutlineStroke", "java.awt.Stroke", "4"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.ValueMarker", actual.getClass().getName());
  assertEquals("{getAlpha=1.0, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2), new String[][]{{"setLabelPaint", "java.awt.Paint", "7"}, {"setOutlineStroke", "java.awt.Stroke", "4"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.plot.ValueMarker", actual.getClass().getName());
  assertEquals("{getAlpha=0.8, getLabel=null, getValue=Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getPaint", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setLabelAnchor", "org.jfree.chart.util.RectangleAnchor", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getPaint", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setLabelAnchor", "org.jfree.chart.util.RectangleAnchor", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getPaint", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setLabelAnchor", "org.jfree.chart.util.RectangleAnchor", "<sample:0>"}}, 1), new String[][]{{"getTransparency", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabel", new String[]{"java.lang.String"}, new String[]{"true"}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "clone", ""}, {"org.jfree.chart.plot.ValueMarker", "setLabelPaint", "java.awt.Paint", "<sample:6>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=true, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabel", new String[]{"java.lang.String"}, new String[]{"drue"}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "clone", ""}, {"org.jfree.chart.plot.ValueMarker", "setLabelPaint", "java.awt.Paint", "<sample:6>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=drue, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabel", new String[]{"java.lang.String"}, new String[]{"due"}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "clone", ""}, {"org.jfree.chart.plot.ValueMarker", "setLabelPaint", "java.awt.Paint", "<sample:6>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=due, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabel", new String[]{"java.lang.String"}, new String[]{"de"}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "clone", ""}, {"org.jfree.chart.plot.ValueMarker", "setLabelPaint", "java.awt.Paint", "<sample:6>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=de, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "addChangeListener", new String[]{"org.jfree.chart.event.MarkerChangeListener"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setStroke", "java.awt.Stroke", "<sample:5>"}, {"org.jfree.chart.plot.ValueMarker", "getOutlineStroke", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelFont", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setOutlineStroke", "java.awt.Stroke", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.awt.Font", actual.getClass().getName());
  assertEquals("java.awt.Font[family=SansSerif,name=SansSerif,style=plain,size=9] {getAvailableAttributes=[java.awt.font.TextAttribute(family), java.awt.font.TextAttr.., getFamily=SansSerif, getFontName=SansSerif.pla...#449#-808513352", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelFont", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setOutlineStroke", "java.awt.Stroke", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.awt.Font", actual.getClass().getName());
  assertEquals("java.awt.Font[family=SansSerif,name=SansSerif,style=plain,size=9] {getAvailableAttributes=[java.awt.font.TextAttribute(family), java.awt.font.TextAttr.., getFamily=SansSerif, getFontName=SansSerif.pla...#449#-808513352", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelFont", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelTextAnchor", ""}, {"org.jfree.chart.plot.ValueMarker", "getPaint", ""}}), new String[][]{{"getFontName", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("SansSerif.plain", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "notifyListeners", new String[]{"org.jfree.chart.event.MarkerChangeEvent"}, new String[]{"<sample:7>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getStroke", new String[]{}, new String[]{}, false), new String[][]{{"getEndCap", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getStroke", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"createStrokedShape", "java.awt.Shape", "1"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getStroke", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"createStrokedShape", "java.awt.Shape", "1"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getStroke", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"getEndCap", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "clone", ""}, {"org.jfree.chart.plot.ValueMarker", "getStroke", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setValue", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setValue", "double", "NaN"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setValue", new String[]{"double"}, new String[]{"-Infinity"}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setValue", "double", "NaN"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setValue", new String[]{"double"}, new String[]{"-Infinity"}, false, 1, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setValue", "double", "NaN"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setOutlinePaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:8>"}, false, 1, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelPaint", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getOutlinePaint", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"getTransparency", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getOutlinePaint", new String[]{}, new String[]{}, false, 10, new String[][]{}), new String[][]{{"getTransparency", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getOutlinePaint", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setValue", "double", "0.1"}}, 2);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=0.1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getOutlinePaint", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setValue", "double", "0.1"}}, 2);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.0, getLabel=null, getValue=0.1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getOutlinePaint", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setValue", "double", "0.1"}, {"org.jfree.chart.plot.ValueMarker", "getLabelAnchor", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=128,g=128,b=128] {getAlpha=255, getBlue=128, getGreen=128, getRGB=-8355712, getRed=128, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=0.1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getOutlinePaint", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setValue", "double", "0.1"}, {"org.jfree.chart.plot.ValueMarker", "getLabelAnchor", ""}}, 2), new String[][]{{"getTransparency", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.0, getLabel=null, getValue=0.1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getOutlinePaint", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setValue", "double", "0.1"}, {"org.jfree.chart.plot.ValueMarker", "getLabelAnchor", ""}}, 2), new String[][]{{"getColorSpace", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.awt.color.ICC_ColorSpace", actual.getClass().getName());
  assertEquals("{getNumComponents=3, getType=5, isCS_sRGB=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=0.1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getOutlinePaint", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setValue", "double", "0.1"}, {"org.jfree.chart.plot.ValueMarker", "getLabelAnchor", ""}}, 2), new String[][]{{"getRGBColorComponents", "float[]", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelOffset", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleInsets", actual.getClass().getName());
  assertEquals("RectangleInsets[t=3.0,l=3.0,b=3.0,r=3.0] {getBottom=3.0, getLeft=3.0, getRight=3.0, getTop=3.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelOffset", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jfree.chart.plot.ValueMarker", "clone", ""}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.RectangleInsets", actual.getClass().getName());
  assertEquals("RectangleInsets[t=3.0,l=3.0,b=3.0,r=3.0] {getBottom=3.0, getLeft=3.0, getRight=3.0, getTop=3.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelOffsetType", ""}, {"org.jfree.chart.plot.ValueMarker", "getPaint", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabel", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setLabelOffsetType", "org.jfree.chart.util.LengthAdjustmentType", "<sample:3>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabel", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setLabelOffsetType", "org.jfree.chart.util.LengthAdjustmentType", "<sample:3>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabel", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setLabelOffsetType", "org.jfree.chart.util.LengthAdjustmentType", "<sample:3>"}, {"org.jfree.chart.plot.ValueMarker", "addChangeListener", "org.jfree.chart.event.MarkerChangeListener", "<sample:2>"}, {"org.jfree.chart.plot.ValueMarker", "getAlpha", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabel", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.plot.ValueMarker", "addChangeListener", "org.jfree.chart.event.MarkerChangeListener", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelPaint", new String[]{"java.awt.Paint"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getPaint", ""}, {"org.jfree.chart.plot.ValueMarker", "getLabelFont", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelPaint", new String[]{"java.awt.Paint"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelFont", ""}, {"org.jfree.chart.plot.ValueMarker", "getAlpha", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelFont", ""}, {"org.jfree.chart.plot.ValueMarker", "getAlpha", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelFont", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"getAvailableAttributes", "", "6"}});
  assertNotNull(actual);
  assertEquals("[Ljava.text.AttributedCharacterIterator$Attribute;", actual.getClass().getName());
  assertEquals("[java.awt.font.TextAttribute(family), java.awt.font.TextAttribute(weight), java.awt.font.TextAttribute(width), java.awt.font.TextAttribute(posture), java.awt.font.TextAttribute(size), java.awt.font.Te...#922#1164699394", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelFont", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"createGlyphVector", "java.awt.font.FontRenderContext,java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("sun.font.StandardGlyphVector", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelFont", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelOffset", ""}, {"org.jfree.chart.plot.ValueMarker", "setLabel", "java.lang.String", "+1"}}, 2), new String[][]{{"createGlyphVector", "java.awt.font.FontRenderContext,java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("sun.font.StandardGlyphVector", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAlpha=0.0, getLabel=+1, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelFont", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelOffset", ""}, {"org.jfree.chart.plot.ValueMarker", "setLabel", "java.lang.String", "+1"}, {"org.jfree.chart.plot.ValueMarker", "getStroke", ""}}, 2), new String[][]{{"createGlyphVector", "java.awt.font.FontRenderContext,java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("sun.font.StandardGlyphVector", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=+1, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelFont", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelOffset", ""}, {"org.jfree.chart.plot.ValueMarker", "setLabel", "java.lang.String", "+1"}, {"org.jfree.chart.plot.ValueMarker", "getStroke", ""}}, 2), new String[][]{{"createGlyphVector", "java.awt.font.FontRenderContext,java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("sun.font.StandardGlyphVector", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=+1, getValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelFont", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelOffset", ""}, {"org.jfree.chart.plot.ValueMarker", "setLabel", "java.lang.String", "+1"}, {"org.jfree.chart.plot.ValueMarker", "getStroke", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.awt.Font", actual.getClass().getName());
  assertEquals("java.awt.Font[family=SansSerif,name=SansSerif,style=plain,size=9] {getAvailableAttributes=[java.awt.font.TextAttribute(family), java.awt.font.TextAttr.., getFamily=SansSerif, getFontName=SansSerif.pla...#449#-808513352", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=+1, getValue=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "getLabelFont", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelOffset", ""}, {"org.jfree.chart.plot.ValueMarker", "getStroke", ""}}, 2), new String[][]{{"createGlyphVector", "java.awt.font.FontRenderContext,java.text.CharacterIterator", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelFont", new String[]{"java.awt.Font"}, new String[]{"<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelFont", new String[]{"java.awt.Font"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setAlpha", "float", "-3.4028235E38"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelFont", new String[]{"java.awt.Font"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setAlpha", "float", "-3.4028235E37"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelFont", new String[]{"java.awt.Font"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setAlpha", "float", "-6.805647E37"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelFont", new String[]{"java.awt.Font"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setLabelOffset", "org.jfree.chart.util.RectangleInsets", "<null>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setStroke", "java.awt.Stroke", "<sample:5>"}, {"org.jfree.chart.plot.ValueMarker", "getLabelPaint", ""}, {"org.jfree.chart.plot.ValueMarker", "getLabelPaint", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=1.0, getLabel=null, getValue=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setLabelPaint", new String[]{"java.awt.Paint"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "setLabelPaint", "java.awt.Paint", "<sample:3>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAlpha=0.8, getLabel=null, getValue=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.plot.ValueMarker", "org.jfree.chart.plot.ValueMarker", "setStroke", new String[]{"java.awt.Stroke"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.chart.plot.ValueMarker", "getLabelAnchor", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
}
