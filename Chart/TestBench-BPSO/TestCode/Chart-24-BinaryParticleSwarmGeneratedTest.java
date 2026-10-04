package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "getPaint", new String[]{"double"}, new String[]{"2.0"}, false);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=255,g=255,b=255] {getAlpha=255, getBlue=255, getGreen=255, getRGB=-1, getRed=255, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getLowerBound=0.0, getUpperBound=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "getUpperBound", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLowerBound=0.0, getUpperBound=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.renderer.GrayPaintScale", actual.getClass().getName());
  assertEquals("{getLowerBound=1.0, getUpperBound=Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getLowerBound=1.0, getUpperBound=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "getLowerBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.GrayPaintScale", "getUpperBound", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLowerBound=0.0, getUpperBound=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "clone", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"clone", "", "4"}, {"clone", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.renderer.GrayPaintScale", actual.getClass().getName());
  assertEquals("{getLowerBound=0.0, getUpperBound=1.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getLowerBound=0.0, getUpperBound=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "getPaint", new String[]{"double"}, new String[]{"255.00000000000003"}, false, 4, new String[][]{{"org.jfree.chart.renderer.GrayPaintScale", "getPaint", "double", "-1.7976931348623157E308"}}), new String[][]{{"getColorComponents", "java.awt.color.ColorSpace,float[]", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "equals", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLowerBound=0.0, getUpperBound=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:T>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLowerBound=0.0, getUpperBound=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "getLowerBound", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLowerBound=0.0, getUpperBound=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "getPaint", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 0, new String[][]{{"org.jfree.chart.renderer.GrayPaintScale", "equals", "java.lang.Object", "<s:,a>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=0] {getAlpha=255, getBlue=0, getGreen=0, getRGB=-16777216, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getLowerBound=0.0, getUpperBound=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLowerBound=1.0, getUpperBound=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "clone", new String[]{}, new String[]{}, false), new String[][]{{"getLowerBound", "", "2"}, {"getUpperBound", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLowerBound=0.0, getUpperBound=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "clone", new String[]{}, new String[]{}, false), new String[][]{{"getPaint", "double", "7"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=0] {getAlpha=255, getBlue=0, getGreen=0, getRGB=-16777216, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getLowerBound=0.0, getUpperBound=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.GrayPaintScale", "getPaint", "double", "-1.7976931348623157E308"}}, 1), new String[][]{{"getLowerBound", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLowerBound=0.0, getUpperBound=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.GrayPaintScale", "clone", ""}}), new String[][]{{"clone", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.renderer.GrayPaintScale", actual.getClass().getName());
  assertEquals("{getLowerBound=0.0, getUpperBound=1.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getLowerBound=0.0, getUpperBound=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "getLowerBound", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLowerBound=1.0, getUpperBound=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 5, new String[][]{{"org.jfree.chart.renderer.GrayPaintScale", "getPaint", "double", "-1.013"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLowerBound=-1.0, getUpperBound=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "getLowerBound", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.renderer.GrayPaintScale", "getLowerBound", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLowerBound=0.0, getUpperBound=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.GrayPaintScale", "getLowerBound", ""}}, 1), new String[][]{{"clone", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.renderer.GrayPaintScale", actual.getClass().getName());
  assertEquals("{getLowerBound=0.0, getUpperBound=1.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getLowerBound=0.0, getUpperBound=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "getLowerBound", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLowerBound=-1.0, getUpperBound=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 3, new String[][]{{"org.jfree.chart.renderer.GrayPaintScale", "getLowerBound", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLowerBound=0.0, getUpperBound=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "getPaint", new String[]{"double"}, new String[]{"2.0"}, false, 3, new String[][]{{"org.jfree.chart.renderer.GrayPaintScale", "equals", "java.lang.Object", "<null>"}}), new String[][]{{"darker", "", "6"}, {"getTransparency", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLowerBound=0.0, getUpperBound=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "getPaint", new String[]{"double"}, new String[]{"2.0"}, false, 3, new String[][]{}), new String[][]{{"getGreen", "", "0"}, {"getRGB", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLowerBound=0.0, getUpperBound=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "getPaint", new String[]{"double"}, new String[]{"-1.7976931348623155E308"}, false, 2, new String[][]{}, 2), new String[][]{{"darker", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=0] {getAlpha=255, getBlue=0, getGreen=0, getRGB=-16777216, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getLowerBound=0.0, getUpperBound=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "getLowerBound", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLowerBound=1.0, getUpperBound=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1), new String[][]{{"getLowerBound", "", "7"}, {"getPaint", "double", "1"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=0] {getAlpha=255, getBlue=0, getGreen=0, getRGB=-16777216, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getLowerBound=0.0, getUpperBound=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "getPaint", new String[]{"double"}, new String[]{"0.5"}, false, 0, new String[][]{{"org.jfree.chart.renderer.GrayPaintScale", "getPaint", "double", "-8.988465674311579E307"}}, 2), new String[][]{{"getAlpha", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("255", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLowerBound=0.0, getUpperBound=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "getPaint", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=255,g=255,b=255] {getAlpha=255, getBlue=255, getGreen=255, getRGB=-1, getRed=255, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getLowerBound=0.0, getUpperBound=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "getPaint", new String[]{"double"}, new String[]{"1.2000000000000002"}, false, 5, new String[][]{{"org.jfree.chart.renderer.GrayPaintScale", "equals", "java.lang.Object", "<s:I>"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=255,g=255,b=255] {getAlpha=255, getBlue=255, getGreen=255, getRGB=-1, getRed=255, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getLowerBound=-1.0, getUpperBound=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2), new String[][]{{"getLowerBound", "", "7"}, {"getLowerBound", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLowerBound=1.0, getUpperBound=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "getPaint", new String[]{"double"}, new String[]{"NaN"}, false, 6, new String[][]{{"org.jfree.chart.renderer.GrayPaintScale", "getUpperBound", ""}}), new String[][]{{"getRGBColorComponents", "float[]", "2"}});
  assertNotNull(actual);
  assertEquals("[F", actual.getClass().getName());
  assertEquals("[0.0, 0.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getLowerBound=0.0, getUpperBound=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "getPaint", new String[]{"double"}, new String[]{"2.0000000000000004"}, false, 0, new String[][]{{"org.jfree.chart.renderer.GrayPaintScale", "equals", "java.lang.Object", "<s:b>"}}), new String[][]{{"getRGBColorComponents", "float[]", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "getLowerBound", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLowerBound=0.0, getUpperBound=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "getPaint", new String[]{"double"}, new String[]{"-0.9999999999999999"}, false, 2, new String[][]{{"org.jfree.chart.renderer.GrayPaintScale", "clone", ""}}, 3), new String[][]{{"getComponents", "java.awt.color.ColorSpace,float[]", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "getPaint", new String[]{"double"}, new String[]{"Infinity"}, false, 7, new String[][]{}, 3), new String[][]{{"getAlpha", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("255", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLowerBound=1.0, getUpperBound=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "getPaint", new String[]{"double"}, new String[]{"NaN"}, false, 7, new String[][]{}, 1), new String[][]{{"getAlpha", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("255", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLowerBound=1.0, getUpperBound=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "getPaint", new String[]{"double"}, new String[]{"20.0"}, false), new String[][]{{"darker", "", "6"}, {"getBlue", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("178", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLowerBound=0.0, getUpperBound=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "getPaint", new String[]{"double"}, new String[]{"-0.5"}, false, 1, new String[][]{}), new String[][]{{"getColorSpace", "", "5"}, {"getNumComponents", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLowerBound=0.0, getUpperBound=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "getPaint", new String[]{"double"}, new String[]{"-0.1"}, false, 7, new String[][]{{"org.jfree.chart.renderer.GrayPaintScale", "getPaint", "double", "2.0"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=0] {getAlpha=255, getBlue=0, getGreen=0, getRGB=-16777216, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getLowerBound=1.0, getUpperBound=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "getPaint", new String[]{"double"}, new String[]{"0.1"}, false, 7, new String[][]{{"org.jfree.chart.renderer.GrayPaintScale", "getLowerBound", ""}}, 2), new String[][]{{"getRed", "", "5"}, {"getColorComponents", "float[]", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "getPaint", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 0, null, 3), new String[][]{{"getComponents", "float[]", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.renderer.GrayPaintScale", actual.getClass().getName());
  assertEquals("{getLowerBound=0.0, getUpperBound=1.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getLowerBound=0.0, getUpperBound=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "equals", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLowerBound=1.0, getUpperBound=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 3, new String[][]{{"org.jfree.chart.renderer.GrayPaintScale", "getPaint", "double", "-1.7976931348623157E308"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLowerBound=0.0, getUpperBound=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "getUpperBound", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLowerBound=0.0, getUpperBound=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.GrayPaintScale", "equals", "java.lang.Object", "<b:false>"}}), new String[][]{{"getLowerBound", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLowerBound=0.0, getUpperBound=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "getPaint", new String[]{"double"}, new String[]{"NaN"}, false, 3, new String[][]{{"org.jfree.chart.renderer.GrayPaintScale", "equals", "java.lang.Object", "<i:0>"}}, 1), new String[][]{{"getRGB", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-16777216", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLowerBound=0.0, getUpperBound=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "getPaint", new String[]{"double"}, new String[]{"0.0"}, false, 0, new String[][]{{"org.jfree.chart.renderer.GrayPaintScale", "clone", ""}}), new String[][]{{"getRed", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLowerBound=0.0, getUpperBound=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "getPaint", new String[]{"double"}, new String[]{"-Infinity"}, false, 0, new String[][]{{"org.jfree.chart.renderer.GrayPaintScale", "getPaint", "double", "Infinity"}}, 1), new String[][]{{"getRGBComponents", "float[]", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "getLowerBound", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.renderer.GrayPaintScale", "clone", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLowerBound=1.0, getUpperBound=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "getUpperBound", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.GrayPaintScale", "equals", "java.lang.Object", "<sample:1>"}, {"org.jfree.chart.renderer.GrayPaintScale", "getUpperBound", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLowerBound=0.0, getUpperBound=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "getUpperBound", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLowerBound=0.0, getUpperBound=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.renderer.GrayPaintScale", "clone", ""}}, 1), new String[][]{{"getPaint", "double", "6"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=0] {getAlpha=255, getBlue=0, getGreen=0, getRGB=-16777216, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getLowerBound=1.0, getUpperBound=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "getLowerBound", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.renderer.GrayPaintScale", "clone", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLowerBound=-1.0, getUpperBound=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "clone", new String[]{}, new String[]{}, false), new String[][]{{"getPaint", "double", "4"}, {"brighter", "", "1"}, {"getRGBColorComponents", "float[]", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLowerBound=-1.0, getUpperBound=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.renderer.GrayPaintScale", "getLowerBound", ""}}), new String[][]{{"getUpperBound", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLowerBound=1.0, getUpperBound=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "getUpperBound", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLowerBound=1.0, getUpperBound=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "getLowerBound", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.renderer.GrayPaintScale", "getLowerBound", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLowerBound=-1.0, getUpperBound=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.renderer.GrayPaintScale", "getUpperBound", ""}}, 2), new String[][]{{"clone", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.renderer.GrayPaintScale", actual.getClass().getName());
  assertEquals("{getLowerBound=1.0, getUpperBound=Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getLowerBound=1.0, getUpperBound=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "getUpperBound", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.renderer.GrayPaintScale", "getPaint", "double", "53.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLowerBound=-1.0, getUpperBound=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLowerBound=1.0, getUpperBound=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"getLowerBound", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLowerBound=-1.0, getUpperBound=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "getPaint", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 3, new String[][]{}, 1), new String[][]{{"getColorComponents", "java.awt.color.ColorSpace,float[]", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.renderer.GrayPaintScale", "getPaint", "double", "Infinity"}, {"org.jfree.chart.renderer.GrayPaintScale", "clone", ""}}, 2), new String[][]{{"getLowerBound", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLowerBound=0.0, getUpperBound=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.renderer.GrayPaintScale", "getUpperBound", ""}}, 1), new String[][]{{"getLowerBound", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLowerBound=1.0, getUpperBound=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1), new String[][]{{"clone", "", "4"}, {"clone", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.renderer.GrayPaintScale", actual.getClass().getName());
  assertEquals("{getLowerBound=-1.0, getUpperBound=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getLowerBound=-1.0, getUpperBound=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "getPaint", new String[]{"double"}, new String[]{"-2.0"}, false, 0, null, 3), new String[][]{{"getRed", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLowerBound=0.0, getUpperBound=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "getLowerBound", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLowerBound=1.0, getUpperBound=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "getUpperBound", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLowerBound=1.0, getUpperBound=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "getPaint", new String[]{"double"}, new String[]{"NaN"}, false, 0, null, 2), new String[][]{{"getColorComponents", "java.awt.color.ColorSpace,float[]", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "clone", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"getPaint", "double", "0"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=0] {getAlpha=255, getBlue=0, getGreen=0, getRGB=-16777216, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getLowerBound=0.0, getUpperBound=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.GrayPaintScale", "equals", "java.lang.Object", "<b:true>"}}, 2), new String[][]{{"getPaint", "double", "2"}, {"getAlpha", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("255", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLowerBound=0.0, getUpperBound=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"clone", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.renderer.GrayPaintScale", actual.getClass().getName());
  assertEquals("{getLowerBound=-1.0, getUpperBound=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getLowerBound=-1.0, getUpperBound=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.renderer.GrayPaintScale", "getUpperBound", ""}}, 3), new String[][]{{"getUpperBound", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLowerBound=0.0, getUpperBound=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "getPaint", new String[]{"double"}, new String[]{"-1.0"}, false, 5, new String[][]{}, 3), new String[][]{{"getGreen", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLowerBound=-1.0, getUpperBound=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.renderer.GrayPaintScale", "getPaint", "double", "Infinity"}}, 2), new String[][]{{"getUpperBound", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLowerBound=1.0, getUpperBound=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "clone", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"getPaint", "double", "0"}, {"getComponents", "float[]", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "getPaint", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 7, new String[][]{}, 3), new String[][]{{"getTransparency", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLowerBound=1.0, getUpperBound=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "getPaint", new String[]{"double"}, new String[]{"-1.0000000000000002"}, false, 3, new String[][]{{"org.jfree.chart.renderer.GrayPaintScale", "getPaint", "double", "-1.9"}}, 3), new String[][]{{"getRGB", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-16777216", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLowerBound=0.0, getUpperBound=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"org.jfree.chart.renderer.GrayPaintScale", "getLowerBound", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLowerBound=1.0, getUpperBound=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 5, new String[][]{{"org.jfree.chart.renderer.GrayPaintScale", "equals", "java.lang.Object", "<d:1.5>"}, {"org.jfree.chart.renderer.GrayPaintScale", "clone", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLowerBound=-1.0, getUpperBound=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "getPaint", new String[]{"double"}, new String[]{"0.05"}, false, 4, new String[][]{{"org.jfree.chart.renderer.GrayPaintScale", "getLowerBound", ""}}, 2), new String[][]{{"getRGB", "", "5"}, {"getRed", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLowerBound=0.0, getUpperBound=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "getPaint", new String[]{"double"}, new String[]{"269.68"}, false, 5, new String[][]{{"org.jfree.chart.renderer.GrayPaintScale", "getUpperBound", ""}}, 1), new String[][]{{"getGreen", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("255", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLowerBound=-1.0, getUpperBound=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "getPaint", new String[]{"double"}, new String[]{"Infinity"}, false, 0, new String[][]{{"org.jfree.chart.renderer.GrayPaintScale", "equals", "java.lang.Object", "<s:Bkey>"}}, 1), new String[][]{{"getColorSpace", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.awt.color.ICC_ColorSpace", actual.getClass().getName());
  assertEquals("{getNumComponents=3, getType=5, isCS_sRGB=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getLowerBound=0.0, getUpperBound=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "getPaint", new String[]{"double"}, new String[]{"-1.0"}, false, 7, new String[][]{}, 1), new String[][]{{"getGreen", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLowerBound=1.0, getUpperBound=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "getPaint", new String[]{"double"}, new String[]{"Infinity"}, false, 3, new String[][]{{"org.jfree.chart.renderer.GrayPaintScale", "equals", "java.lang.Object", "<s:b>"}}, 3), new String[][]{{"getRGB", "", "2"}, {"getColorSpace", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.awt.color.ICC_ColorSpace", actual.getClass().getName());
  assertEquals("{getNumComponents=3, getType=5, isCS_sRGB=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getLowerBound=0.0, getUpperBound=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "getPaint", new String[]{"double"}, new String[]{"NaN"}, false, 4, new String[][]{}, 2), new String[][]{{"getColorSpace", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.awt.color.ICC_ColorSpace", actual.getClass().getName());
  assertEquals("{getNumComponents=3, getType=5, isCS_sRGB=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getLowerBound=0.0, getUpperBound=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "getPaint", new String[]{"double"}, new String[]{"2.0000000000000004"}, false, 3, new String[][]{}, 2), new String[][]{{"getTransparency", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLowerBound=0.0, getUpperBound=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "getPaint", new String[]{"double"}, new String[]{"Infinity"}, false, 1, new String[][]{}, 2), new String[][]{{"getRGBColorComponents", "float[]", "2"}});
  assertNotNull(actual);
  assertEquals("[F", actual.getClass().getName());
  assertEquals("[1.0, 1.0, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getLowerBound=0.0, getUpperBound=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "getPaint", new String[]{"double"}, new String[]{"2.0"}, false, 0, new String[][]{{"org.jfree.chart.renderer.GrayPaintScale", "clone", ""}}, 1), new String[][]{{"getColorSpace", "", "1"}, {"getType", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLowerBound=0.0, getUpperBound=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "clone", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"getUpperBound", "", "2"}, {"getPaint", "double", "4"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=255,g=255,b=255] {getAlpha=255, getBlue=255, getGreen=255, getRGB=-1, getRed=255, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getLowerBound=0.0, getUpperBound=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.renderer.GrayPaintScale", "getPaint", "double", "1.9999999999999998"}}, 3), new String[][]{{"clone", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.renderer.GrayPaintScale", actual.getClass().getName());
  assertEquals("{getLowerBound=-1.0, getUpperBound=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getLowerBound=-1.0, getUpperBound=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.chart.renderer.GrayPaintScale", "getPaint", "double", "1.0"}}, 1), new String[][]{{"getPaint", "double", "1"}, {"getAlpha", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("255", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLowerBound=0.0, getUpperBound=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.renderer.GrayPaintScale", actual.getClass().getName());
  assertEquals("{getLowerBound=1.0, getUpperBound=Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getLowerBound=1.0, getUpperBound=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "getLowerBound", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLowerBound=-1.0, getUpperBound=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "getPaint", new String[]{"double"}, new String[]{"-2.0"}, false, 5, new String[][]{{"org.jfree.chart.renderer.GrayPaintScale", "clone", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=0] {getAlpha=255, getBlue=0, getGreen=0, getRGB=-16777216, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getLowerBound=-1.0, getUpperBound=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.renderer.GrayPaintScale", "getUpperBound", ""}}, 3), new String[][]{{"getUpperBound", "", "2"}, {"clone", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.renderer.GrayPaintScale", actual.getClass().getName());
  assertEquals("{getLowerBound=1.0, getUpperBound=Infinity}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getLowerBound=1.0, getUpperBound=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "getPaint", new String[]{"double"}, new String[]{"1.0"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=0] {getAlpha=255, getBlue=0, getGreen=0, getRGB=-16777216, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getLowerBound=1.0, getUpperBound=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 5, new String[][]{{"org.jfree.chart.renderer.GrayPaintScale", "getPaint", "double", "-1.7976931348623157E308"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLowerBound=-1.0, getUpperBound=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2), new String[][]{{"getPaint", "double", "0"}});
  assertNotNull(actual);
  assertEquals("java.awt.Color", actual.getClass().getName());
  assertEquals("java.awt.Color[r=0,g=0,b=0] {getAlpha=255, getBlue=0, getGreen=0, getRGB=-16777216, getRed=0, getTransparency=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getLowerBound=-1.0, getUpperBound=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.chart.renderer.GrayPaintScale", "getPaint", "double", "-1.7976931348623155E308"}}, 3), new String[][]{{"getLowerBound", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLowerBound=0.0, getUpperBound=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.renderer.GrayPaintScale", "getLowerBound", ""}, {"org.jfree.chart.renderer.GrayPaintScale", "getPaint", "double", "NaN"}}, 1), new String[][]{{"getPaint", "double", "7"}, {"getBlue", "", "7"}, {"getRed", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLowerBound=0.0, getUpperBound=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "getUpperBound", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.renderer.GrayPaintScale", "equals", "java.lang.Object", "<i:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLowerBound=1.0, getUpperBound=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.renderer.GrayPaintScale", "getLowerBound", ""}}, 2), new String[][]{{"getPaint", "double", "6"}, {"getBlue", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLowerBound=0.0, getUpperBound=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.chart.renderer.GrayPaintScale", "getLowerBound", ""}}, 3), new String[][]{{"getPaint", "double", "6"}, {"getColorSpace", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.awt.color.ICC_ColorSpace", actual.getClass().getName());
  assertEquals("{getNumComponents=3, getType=5, isCS_sRGB=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getLowerBound=0.0, getUpperBound=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "getUpperBound", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.renderer.GrayPaintScale", "clone", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLowerBound=1.0, getUpperBound=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "getUpperBound", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.renderer.GrayPaintScale", "getLowerBound", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLowerBound=-1.0, getUpperBound=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "getUpperBound", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLowerBound=-1.0, getUpperBound=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.renderer.GrayPaintScale", "org.jfree.chart.renderer.GrayPaintScale", "getUpperBound", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.renderer.GrayPaintScale", "getLowerBound", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLowerBound=-1.0, getUpperBound=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
}
