package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "getShape", new String[]{"int"}, new String[]{"-1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "setShape", new String[]{"int", "java.awt.Shape"}, new String[]{"10", "<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "setShape", new String[]{"int", "java.awt.Shape"}, new String[]{"-43", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "setShape", new String[]{"int", "java.awt.Shape"}, new String[]{"-104", "<sample:4>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "setShape", new String[]{"int", "java.awt.Shape"}, new String[]{"4194408", "<sample:5>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "get", "int", "-2147483648"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=4194409}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "setShape", new String[]{"int", "java.awt.Shape"}, new String[]{"8388816", "<sample:3>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=8388817}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "setShape", new String[]{"int", "java.awt.Shape"}, new String[]{"10", "<sample:2>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "size", ""}, {"org.jfree.chart.util.ShapeList", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<s:+>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "size", ""}, {"org.jfree.chart.util.ShapeList", "hashCode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "size", ""}, {"org.jfree.chart.util.ShapeList", "size", ""}, {"org.jfree.chart.util.ShapeList", "equals", "java.lang.Object", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "setShape", new String[]{"int", "java.awt.Shape"}, new String[]{"0", "<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "setShape", new String[]{"int", "java.awt.Shape"}, new String[]{"1", "<null>"}, false, 15, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "setShape", new String[]{"int", "java.awt.Shape"}, new String[]{"2147483647", "<null>"}, false, 15, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "setShape", new String[]{"int", "java.awt.Shape"}, new String[]{"0", "<null>"}, false, 15, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"-2147483648", "<s:a>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 4, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "-2147483648", "<sample:5>"}, {"org.jfree.chart.util.ShapeList", "clone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "equals", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "2147483647", "<i:1>"}, {"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "10", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clear", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "0", "<sample:6>"}, {"org.jfree.chart.util.ShapeList", "clone", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"1", "<i:2>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "equals", "java.lang.Object", "<d:1.5>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"0", "<i:-44>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "equals", "java.lang.Object", "<d:1.5>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<i:-30>"}, false, 14, new String[][]{{"org.jfree.chart.util.ShapeList", "clone", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 1, new String[][]{{"org.jfree.chart.util.ShapeList", "clear", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:57>"}, false, 12, new String[][]{{"org.jfree.chart.util.ShapeList", "clear", ""}, {"org.jfree.chart.util.ShapeList", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "hashCode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4699", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "hashCode", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4699", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:-15.0>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "1", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 11, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "1", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 11, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "get", new String[]{"int"}, new String[]{"-1"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "size", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clear", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jfree.chart.util.ShapeList", "clone", ""}, {"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "2147483647", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "getShape", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "getShape", "int", "-1"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "1", "<sample:4>"}, {"org.jfree.chart.util.ShapeList", "equals", "java.lang.Object", "<b:true>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.ShapeList", actual.getClass().getName());
  assertEquals("{size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "setShape", new String[]{"int", "java.awt.Shape"}, new String[]{"9", "<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "setShape", new String[]{"int", "java.awt.Shape"}, new String[]{"11", "<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=12}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "get", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "hashCode", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "get", new String[]{"int"}, new String[]{"50"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "0", "<i:-1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.util.ShapeList", "equals", "java.lang.Object", "<s:>"}, {"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "0", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.util.ShapeList", "size", ""}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.ShapeList", actual.getClass().getName());
  assertEquals("{size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 16, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.ShapeList", actual.getClass().getName());
  assertEquals("{size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 26, new String[][]{}, 1), new String[][]{{"getShape", "int", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 26, new String[][]{}, 1), new String[][]{{"size", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "setShape", new String[]{"int", "java.awt.Shape"}, new String[]{"1", "<null>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "setShape", new String[]{"int", "java.awt.Shape"}, new String[]{"-2147483648", "<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "setShape", new String[]{"int", "java.awt.Shape"}, new String[]{"2147483647", "<null>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "get", "int", "10"}, {"org.jfree.chart.util.ShapeList", "get", "int", "0"}, {"org.jfree.chart.util.ShapeList", "equals", "java.lang.Object", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "setShape", new String[]{"int", "java.awt.Shape"}, new String[]{"0", "<sample:5>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "get", "int", "-2147483648"}, {"org.jfree.chart.util.ShapeList", "equals", "java.lang.Object", "<s:a>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "setShape", new String[]{"int", "java.awt.Shape"}, new String[]{"2", "<sample:6>"}, false, 9, new String[][]{{"org.jfree.chart.util.ShapeList", "get", "int", "-2147483647"}, {"org.jfree.chart.util.ShapeList", "equals", "java.lang.Object", "<s:aa>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "getShape", new String[]{"int"}, new String[]{"-8388607"}, false, 5, new String[][]{{"org.jfree.chart.util.ShapeList", "clear", ""}, {"org.jfree.chart.util.ShapeList", "size", ""}, {"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "1", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "getShape", new String[]{"int"}, new String[]{"-8388607"}, false, 5, new String[][]{{"org.jfree.chart.util.ShapeList", "clear", ""}, {"org.jfree.chart.util.ShapeList", "size", ""}, {"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "1", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "clear", ""}}), new String[][]{{"setShape", "int,java.awt.Shape", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "hashCode", new String[]{}, new String[]{}, false, 16, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4699", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "size", ""}, {"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "1", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.ShapeList", actual.getClass().getName());
  assertEquals("{size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "0", "<sample:4>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"2147483647", "<s:>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"2147483647", "<s:>"}, false, 11, new String[][]{{"org.jfree.chart.util.ShapeList", "clear", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "get", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "indexOf", "java.lang.Object", "<b:true>"}, {"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "1", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"10", "<i:0>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "size", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "setShape", new String[]{"int", "java.awt.Shape"}, new String[]{"0", "<sample:1>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "getShape", "int", "2147483647"}, {"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "1", "<i:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"-1", "<s:bb+\t>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<s:kdy>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "2147483647", "<b:true>"}, {"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "0", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"0", "<i:1>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "equals", "java.lang.Object", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "-1", "<s:a>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "28", "<s:a>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("29", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=29}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.util.ShapeList", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4699", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "get", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"67108839", "<i:-4>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "getShape", "int", "-2147483648"}, {"org.jfree.chart.util.ShapeList", "indexOf", "java.lang.Object", "<d:1.5>"}, {"org.jfree.chart.util.ShapeList", "clone", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=67108840}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"67108843", "<i:-4>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "getShape", "int", "-2147483648"}, {"org.jfree.chart.util.ShapeList", "clone", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=67108844}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"10", "<i:-7>"}, false, 15, new String[][]{{"org.jfree.chart.util.ShapeList", "getShape", "int", "-2147483648"}, {"org.jfree.chart.util.ShapeList", "clone", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "getShape", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "clear", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "equals", new String[]{"java.lang.Object"}, new String[]{"<s::e>"}, false, 11, new String[][]{{"org.jfree.chart.util.ShapeList", "hashCode", ""}, {"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "10", "<s:b>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "get", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "getShape", new String[]{"int"}, new String[]{"1073741816"}, false, 2, new String[][]{{"org.jfree.chart.util.ShapeList", "equals", "java.lang.Object", "<i:-13>"}, {"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "1", "<d:1.5>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"1", "<s:>"}, false, 1, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "1", "<i:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "indexOf", "java.lang.Object", "<s:b>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.ShapeList", actual.getClass().getName());
  assertEquals("{size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "1", "<i:-1>"}, {"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "2147483647", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6435668", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "hashCode", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "1", "<i:-1>"}, {"org.jfree.chart.util.ShapeList", "size", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6435668", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "size", ""}}), new String[][]{{"setShape", "int,java.awt.Shape", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "getShape", new String[]{"int"}, new String[]{"-84"}, false, 10, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.util.ShapeList", "get", "int", "62"}}), new String[][]{{"getShape", "int", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.util.ShapeList", "get", "int", "62"}}, 2), new String[][]{{"getShape", "int", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "getShape", new String[]{"int"}, new String[]{"0"}, false, 3, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "0", "<i:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "getShape", new String[]{"int"}, new String[]{"256"}, false, 14, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "0", "<i:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "getShape", new String[]{"int"}, new String[]{"2147483647"}, false, 8, new String[][]{{"org.jfree.chart.util.ShapeList", "clear", ""}, {"org.jfree.chart.util.ShapeList", "clear", ""}, {"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "10", "<s:b>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "2147483647", "<sample:1>"}}), new String[][]{{"getShape", "int", "2"}, {"size", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-1073741740>"}, false, 7, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "10", "<sample:0>"}, {"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "-16384", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"10", "<d:1.5>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"5", "<d:15.0>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"-5", "<d:15.0>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"1048571", "<d:15.0>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=1048572}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"1", "<sample:1>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "size", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"2", "<sample:1>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "size", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "getShape", "int", "-2147483648"}, {"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "0", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:LMa>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "0", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 16, new String[][]{}, 2), new String[][]{{"setShape", "int,java.awt.Shape", "2"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.ShapeList", actual.getClass().getName());
  assertEquals("{size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 16, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.ShapeList", actual.getClass().getName());
  assertEquals("{size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"2147483647", "<s:key>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "clear", ""}, {"org.jfree.chart.util.ShapeList", "equals", "java.lang.Object", "<i:-1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 2, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "48", "<s:b>"}, {"org.jfree.chart.util.ShapeList", "getShape", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=49}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 9, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "48", "<s:b>"}, {"org.jfree.chart.util.ShapeList", "getShape", "int", "1"}, {"org.jfree.chart.util.ShapeList", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=49}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"2147483647", "<d:1.5>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "setShape", new String[]{"int", "java.awt.Shape"}, new String[]{"-2147483648", "<sample:5>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "equals", "java.lang.Object", "<i:-1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"4", "<s:>"}, false, 2, new String[][]{{"org.jfree.chart.util.ShapeList", "equals", "java.lang.Object", "<s:b>"}, {"org.jfree.chart.util.ShapeList", "getShape", "int", "0"}, {"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "0", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"-1", "<i:-54>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "size", ""}, {"org.jfree.chart.util.ShapeList", "clear", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "0", "<s:>"}, {"org.jfree.chart.util.ShapeList", "getShape", "int", "1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.util.ShapeList", "equals", "java.lang.Object", "<i:5>"}, {"org.jfree.chart.util.ShapeList", "size", ""}, {"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "10", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("238575667", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false), new String[][]{{"clone", "", "6"}, {"clear", "", "7"}, {"setShape", "int,java.awt.Shape", "7"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.ShapeList", actual.getClass().getName());
  assertEquals("{size=5}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 14, new String[][]{}, 3), new String[][]{{"clone", "", "6"}, {"clear", "", "7"}, {"setShape", "int,java.awt.Shape", "7"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.ShapeList", actual.getClass().getName());
  assertEquals("{size=5}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "setShape", new String[]{"int", "java.awt.Shape"}, new String[]{"2147483647", "<sample:1>"}, false, 11, new String[][]{{"org.jfree.chart.util.ShapeList", "equals", "java.lang.Object", "<s:>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 13, new String[][]{{"org.jfree.chart.util.ShapeList", "equals", "java.lang.Object", "<s:7.\"\">"}, {"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "1", "<s:a>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-59>"}, false, 9, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "0", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "0", "<sample:0>"}, {"org.jfree.chart.util.ShapeList", "size", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("173997", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "size", ""}}), new String[][]{{"clone", "", "3"}, {"setShape", "int,java.awt.Shape", "7"}, {"size", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "setShape", new String[]{"int", "java.awt.Shape"}, new String[]{"0", "<sample:1>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "-1", "<s:b>"}, {"org.jfree.chart.util.ShapeList", "indexOf", "java.lang.Object", "<i:-1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.util.ShapeList", "clone", ""}, {"org.jfree.chart.util.ShapeList", "equals", "java.lang.Object", "<d:1.5>"}, {"org.jfree.chart.util.ShapeList", "clone", ""}}, 3), new String[][]{{"setShape", "int,java.awt.Shape", "5"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.ShapeList", actual.getClass().getName());
  assertEquals("{size=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 29, new String[][]{{"org.jfree.chart.util.ShapeList", "clone", ""}, {"org.jfree.chart.util.ShapeList", "equals", "java.lang.Object", "<s:X>"}}, 1), new String[][]{{"setShape", "int,java.awt.Shape", "5"}, {"size", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 30, new String[][]{{"org.jfree.chart.util.ShapeList", "clone", ""}, {"org.jfree.chart.util.ShapeList", "equals", "java.lang.Object", "<s:X>"}}, 3), new String[][]{{"setShape", "int,java.awt.Shape", "5"}, {"size", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 33, new String[][]{{"org.jfree.chart.util.ShapeList", "clone", ""}, {"org.jfree.chart.util.ShapeList", "equals", "java.lang.Object", "<s:X>"}, {"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "10", "<sample:4>"}}), new String[][]{{"setShape", "int,java.awt.Shape", "5"}, {"size", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("11", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 2, new String[][]{{"org.jfree.chart.util.ShapeList", "get", "int", "2147483647"}, {"org.jfree.chart.util.ShapeList", "get", "int", "-65529"}, {"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "1", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:\t\n-?>"}, false, 1, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "9", "<sample:3>"}, {"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "2147483647", "<b:true>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:\ndmo>"}, false, 8, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "20", "<sample:3>"}, {"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "2147483647", "<b:false>"}, {"org.jfree.chart.util.ShapeList", "clone", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=21}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:4.7>"}, false, 8, new String[][]{{"org.jfree.chart.util.ShapeList", "clear", ""}, {"org.jfree.chart.util.ShapeList", "clone", ""}, {"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "10", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "10", "<sample:6>"}, {"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "0", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("11", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "indexOf", "java.lang.Object", "<s:>"}, {"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "0", "<i:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "getShape", new String[]{"int"}, new String[]{"10"}, false, 5, new String[][]{{"org.jfree.chart.util.ShapeList", "getShape", "int", "10"}, {"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "10", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{size=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "get", new String[]{"int"}, new String[]{"536870902"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "10", "<d:1.5>"}, {"org.jfree.chart.util.ShapeList", "equals", "java.lang.Object", "<d:30.0>"}, {"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "-2147483648", "<i:-63>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "get", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "10", "<d:1.5>"}, {"org.jfree.chart.util.ShapeList", "equals", "java.lang.Object", "<d:303.1>"}, {"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "-2147483648", "<i:-63>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "setShape", new String[]{"int", "java.awt.Shape"}, new String[]{"2147483644", "<sample:4>"}, false, 1, new String[][]{{"org.jfree.chart.util.ShapeList", "equals", "java.lang.Object", "<s:0z3>"}, {"org.jfree.chart.util.ShapeList", "getShape", "int", "0"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"1", "<i:1>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "10", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "hashCode", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.jfree.chart.util.ShapeList", "getShape", "int", "2147483587"}, {"org.jfree.chart.util.ShapeList", "equals", "java.lang.Object", "<i:0>"}, {"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "12", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("238676936", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=13}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "0", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.ShapeList", actual.getClass().getName());
  assertEquals("{size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "get", new String[]{"int"}, new String[]{"10"}, false, 2, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "0", "<i:0>"}, {"org.jfree.chart.util.ShapeList", "size", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "1", "<d:1.5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "setShape", new String[]{"int", "java.awt.Shape"}, new String[]{"20", "<sample:7>"}, false, 5, new String[][]{{"org.jfree.chart.util.ShapeList", "getShape", "int", "10"}, {"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "-524285", "<s:a>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=21}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"0", "<s:>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "getShape", "int", "2147483647"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "get", new String[]{"int"}, new String[]{"1073741754"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "hashCode", ""}, {"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "0", "<sample:1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "0", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "0", "<i:1>"}, {"org.jfree.chart.util.ShapeList", "equals", "java.lang.Object", "<i:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.ShapeList", actual.getClass().getName());
  assertEquals("{size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.util.ShapeList", "clear", ""}, {"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "0", "<i:1>"}, {"org.jfree.chart.util.ShapeList", "equals", "java.lang.Object", "<i:0>"}}, 3), new String[][]{{"size", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"0", "<i:2>"}, false, 4, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "0", "<i:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "equals", "java.lang.Object", "<i:0>"}, {"org.jfree.chart.util.ShapeList", "indexOf", "java.lang.Object", "<b:false>"}, {"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "10", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<s:E>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "equals", "java.lang.Object", "<i:0>"}, {"org.jfree.chart.util.ShapeList", "indexOf", "java.lang.Object", "<s:>"}, {"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "20", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=21}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "0", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.util.ShapeList", "getShape", "int", "-1"}, {"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "10", "<s:key>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.ShapeList", actual.getClass().getName());
  assertEquals("{size=11}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{size=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jfree.chart.util.ShapeList", "getShape", "int", "-2"}, {"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "-10", "<s:ky>"}}, 3), new String[][]{{"setShape", "int,java.awt.Shape", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "setShape", new String[]{"int", "java.awt.Shape"}, new String[]{"1", "<sample:2>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "size", ""}, {"org.jfree.chart.util.ShapeList", "get", "int", "2147483647"}, {"org.jfree.chart.util.ShapeList", "clone", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "1", "<b:true>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false, 29, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "2147483647", "<sample:1>"}, {"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "25", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("26", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=26}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jfree.chart.util.ShapeList", "getShape", "int", "-44"}, {"org.jfree.chart.util.ShapeList", "equals", "java.lang.Object", "<s:kPefy>"}}, 2), new String[][]{{"setShape", "int,java.awt.Shape", "7"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.ShapeList", actual.getClass().getName());
  assertEquals("{size=5}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "setShape", new String[]{"int", "java.awt.Shape"}, new String[]{"10", "<sample:1>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "clone", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "setShape", new String[]{"int", "java.awt.Shape"}, new String[]{"32", "<sample:7>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "clone", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=33}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "31", "<sample:1>"}, {"org.jfree.chart.util.ShapeList", "size", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=32}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "1", "<sample:1>"}, {"org.jfree.chart.util.ShapeList", "size", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.util.ShapeList", "get", "int", "0"}, {"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "52", "<sample:7>"}}, 1), new String[][]{{"clear", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.ShapeList", actual.getClass().getName());
  assertEquals("{size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{size=53}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "0", "<sample:2>"}, {"org.jfree.chart.util.ShapeList", "get", "int", "10"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jfree.chart.util.ShapeList", "equals", "java.lang.Object", "<b:true>"}, {"org.jfree.chart.util.ShapeList", "clone", ""}}, 2), new String[][]{{"setShape", "int,java.awt.Shape", "3"}, {"setShape", "int,java.awt.Shape", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.jfree.chart.util.ShapeList", "equals", "java.lang.Object", "<b:true>"}, {"org.jfree.chart.util.ShapeList", "clone", ""}}, 2), new String[][]{{"setShape", "int,java.awt.Shape", "3"}, {"setShape", "int,java.awt.Shape", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "2147483647", "<b:true>"}, {"org.jfree.chart.util.ShapeList", "equals", "java.lang.Object", "<b:true>"}, {"org.jfree.chart.util.ShapeList", "indexOf", "java.lang.Object", "<s:key>"}}, 1), new String[][]{{"setShape", "int,java.awt.Shape", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"32", "<i:-1>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "0", "<sample:5>"}, {"org.jfree.chart.util.ShapeList", "equals", "java.lang.Object", "<s:a>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=33}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"1024", "<i:1>"}, false, 11, new String[][]{{"org.jfree.chart.util.ShapeList", "equals", "java.lang.Object", "<i:-2049>"}, {"org.jfree.chart.util.ShapeList", "size", ""}, {"org.jfree.chart.util.ShapeList", "equals", "java.lang.Object", "<s:b\n>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=1025}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.util.ShapeList", "clone", ""}, {"org.jfree.chart.util.ShapeList", "equals", "java.lang.Object", "<i:-54>"}, {"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "10", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("11", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jfree.chart.util.ShapeList", "clone", ""}, {"org.jfree.chart.util.ShapeList", "equals", "java.lang.Object", "<i:-54>"}, {"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "20", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("21", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=21}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jfree.chart.util.ShapeList", "equals", "java.lang.Object", "<i:-54>"}, {"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "13", "<null>"}, {"org.jfree.chart.util.ShapeList", "hashCode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=14}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jfree.chart.util.ShapeList", "equals", "java.lang.Object", "<i:-54>"}, {"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "13", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=14}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jfree.chart.util.ShapeList", "equals", "java.lang.Object", "<i:-148>"}, {"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "37", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("38", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=38}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.jfree.chart.util.ShapeList", "equals", "java.lang.Object", "<i:-148>"}, {"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "74", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("75", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=75}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false, 25, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "57", "<sample:6>"}, {"org.jfree.chart.util.ShapeList", "equals", "java.lang.Object", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("58", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=58}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "setShape", new String[]{"int", "java.awt.Shape"}, new String[]{"10", "<sample:3>"}, false, 7, new String[][]{{"org.jfree.chart.util.ShapeList", "hashCode", ""}, {"org.jfree.chart.util.ShapeList", "indexOf", "java.lang.Object", "<sample:1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.util.ShapeList", "indexOf", "java.lang.Object", "<sample:0>"}}, 2), new String[][]{{"setShape", "int,java.awt.Shape", "6"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.ShapeList", actual.getClass().getName());
  assertEquals("{size=4}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"setShape", "int,java.awt.Shape", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"8388598", "<s:b>"}, false, 11, new String[][]{{"org.jfree.chart.util.ShapeList", "clone", ""}, {"org.jfree.chart.util.ShapeList", "equals", "java.lang.Object", "<i:-2046>"}, {"org.jfree.chart.util.ShapeList", "getShape", "int", "1"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=8388599}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<i:2147483647>"}, false, 2, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "1", "<sample:3>"}, {"org.jfree.chart.util.ShapeList", "equals", "java.lang.Object", "<i:16>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "2147483647", "<s:b>"}, {"org.jfree.chart.util.ShapeList", "clone", ""}, {"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "10", "<s:a>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("11", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "getShape", new String[]{"int"}, new String[]{"23"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "0", "<s:>"}, {"org.jfree.chart.util.ShapeList", "clone", ""}, {"org.jfree.chart.util.ShapeList", "getShape", "int", "2147483646"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.util.ShapeList", "clear", ""}, {"org.jfree.chart.util.ShapeList", "getShape", "int", "2147483647"}}, 3), new String[][]{{"getShape", "int", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "setShape", new String[]{"int", "java.awt.Shape"}, new String[]{"130", "<sample:0>"}, false, 10, new String[][]{{"org.jfree.chart.util.ShapeList", "getShape", "int", "2147483647"}, {"org.jfree.chart.util.ShapeList", "equals", "java.lang.Object", "<s:a\n>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=131}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.util.ShapeList", "hashCode", ""}, {"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "1", "<null>"}, {"org.jfree.chart.util.ShapeList", "equals", "java.lang.Object", "<i:-10>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "18", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("19", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=19}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "18", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("19", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=19}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.jfree.chart.util.ShapeList", "equals", "java.lang.Object", "<s:b>"}, {"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "1", "<sample:3>"}, {"org.jfree.chart.util.ShapeList", "size", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "equals", "java.lang.Object", "<i:1>"}, {"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "10", "<i:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "equals", "java.lang.Object", "<i:2>"}, {"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "10", "<i:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "2", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "get", new String[]{"int"}, new String[]{"-1"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "clone", ""}, {"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "1", "<sample:1>"}, {"org.jfree.chart.util.ShapeList", "equals", "java.lang.Object", "<s:a>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "get", new String[]{"int"}, new String[]{"-268435449"}, false, 1, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "0", "<sample:3>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "get", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "0", "<s:key>"}, {"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "2147483647", "<s:>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "getShape", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "10", "<s:a>"}, {"org.jfree.chart.util.ShapeList", "hashCode", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "2", "<s:key>"}, {"org.jfree.chart.util.ShapeList", "indexOf", "java.lang.Object", "<i:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "size", ""}, {"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "10", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("11", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.util.ShapeList", "size", ""}, {"org.jfree.chart.util.ShapeList", "size", ""}, {"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "47", "<sample:0>"}}), new String[][]{{"clear", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.ShapeList", actual.getClass().getName());
  assertEquals("{size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{size=48}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "get", new String[]{"int"}, new String[]{"0"}, false, 6, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "0", "<sample:7>"}, {"org.jfree.chart.util.ShapeList", "size", ""}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "getShape", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "equals", "java.lang.Object", "<i:-2147483648>"}, {"org.jfree.chart.util.ShapeList", "hashCode", ""}, {"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "0", "<sample:1>"}}), new String[][]{{"intersects", "java.awt.geom.Rectangle2D", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "28", "<s:b>"}, {"org.jfree.chart.util.ShapeList", "equals", "java.lang.Object", "<b:true>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("29", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=29}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "get", new String[]{"int"}, new String[]{"-1"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "get", "int", "-1"}, {"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "10", "<sample:7>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:B>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "clone", ""}, {"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "1", "<sample:0>"}, {"org.jfree.chart.util.ShapeList", "size", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "get", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "38", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=39}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "get", new String[]{"int"}, new String[]{"48"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "clear", ""}, {"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "38", "<sample:5>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=39}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "get", new String[]{"int"}, new String[]{"-2147483641"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "41", "<sample:5>"}, {"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "10", "<sample:6>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=42}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.util.ShapeList", "equals", "java.lang.Object", "<b:true>"}, {"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "1", "<sample:1>"}, {"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "-60", "<sample:4>"}}, 2), new String[][]{{"clone", "", "4"}, {"clear", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.ShapeList", actual.getClass().getName());
  assertEquals("{size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "26", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.ShapeList", actual.getClass().getName());
  assertEquals("{size=27}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{size=27}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "hashCode", ""}, {"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "10", "<sample:7>"}}, 3), new String[][]{{"clear", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.ShapeList", actual.getClass().getName());
  assertEquals("{size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{size=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "2147483647", "<s:>"}, {"org.jfree.chart.util.ShapeList", "equals", "java.lang.Object", "<s:kx>"}, {"org.jfree.chart.util.ShapeList", "equals", "java.lang.Object", "<sample:1>"}}, 1), new String[][]{{"clone", "", "2"}, {"getShape", "int", "5"}, {"clear", "", "2"}, {"setShape", "int,java.awt.Shape", "6"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.ShapeList", actual.getClass().getName());
  assertEquals("{size=4}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "0", "<sample:6>"}, {"org.jfree.chart.util.ShapeList", "equals", "java.lang.Object", "<d:1.5>"}}, 2), new String[][]{{"clone", "", "2"}, {"getShape", "int", "6"}, {"size", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.jfree.chart.util.ShapeList", "hashCode", ""}, {"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "10", "<s:b>"}, {"org.jfree.chart.util.ShapeList", "equals", "java.lang.Object", "<i:0>"}}, 1), new String[][]{{"setShape", "int,java.awt.Shape", "2"}, {"clone", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.ShapeList", actual.getClass().getName());
  assertEquals("{size=11}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{size=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.jfree.chart.util.ShapeList", "hashCode", ""}, {"org.jfree.chart.util.ShapeList", "equals", "java.lang.Object", "<i:0>"}, {"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "0", "<sample:7>"}}, 1), new String[][]{{"setShape", "int,java.awt.Shape", "2"}, {"clone", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.ShapeList", actual.getClass().getName());
  assertEquals("{size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jfree.chart.util.ShapeList", "clone", ""}, {"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "1", "<sample:1>"}, {"org.jfree.chart.util.ShapeList", "equals", "java.lang.Object", "<i:-1>"}}, 3), new String[][]{{"clear", "", "7"}, {"getShape", "int", "7"}, {"setShape", "int,java.awt.Shape", "3"}, {"setShape", "int,java.awt.Shape", "6"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.ShapeList", actual.getClass().getName());
  assertEquals("{size=4}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "5", "<d:1.5>"}, {"org.jfree.chart.util.ShapeList", "equals", "java.lang.Object", "<b:true>"}}, 1), new String[][]{{"clear", "", "2"}, {"size", "", "0"}, {"getShape", "int", "1"}, {"setShape", "int,java.awt.Shape", "7"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.ShapeList", actual.getClass().getName());
  assertEquals("{size=5}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "20", "<d:-4.55>"}, {"org.jfree.chart.util.ShapeList", "equals", "java.lang.Object", "<b:true>"}, {"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "-1", "<s:a>"}}, 2), new String[][]{{"getShape", "int", "3"}, {"clone", "", "3"}, {"clone", "", "1"}, {"setShape", "int,java.awt.Shape", "7"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.ShapeList", actual.getClass().getName());
  assertEquals("{size=21}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{size=21}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 36, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "20", "<d:-4.55>"}, {"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "12", "<null>"}, {"org.jfree.chart.util.ShapeList", "equals", "java.lang.Object", "<s:a>"}}, 3), new String[][]{{"getShape", "int", "2"}, {"clone", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.ShapeList", actual.getClass().getName());
  assertEquals("{size=21}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{size=21}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 29, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "2", "<i:-23>"}, {"org.jfree.chart.util.ShapeList", "equals", "java.lang.Object", "<null>"}, {"org.jfree.chart.util.ShapeList", "getShape", "int", "-2147483648"}}, 3), new String[][]{{"getShape", "int", "7"}, {"clone", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.ShapeList", actual.getClass().getName());
  assertEquals("{size=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "63", "<i:0>"}, {"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "-1", "<sample:7>"}, {"org.jfree.chart.util.ShapeList", "equals", "java.lang.Object", "<i:12>"}}, 2), new String[][]{{"getShape", "int", "3"}, {"clone", "", "5"}, {"clone", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.ShapeList", actual.getClass().getName());
  assertEquals("{size=64}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{size=64}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "get", new String[]{"int"}, new String[]{"78"}, false, 5, new String[][]{{"org.jfree.chart.util.ShapeList", "hashCode", ""}, {"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "33", "<sample:5>"}, {"org.jfree.chart.util.ShapeList", "size", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=34}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<d:15.0>"}, false, 2, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "1", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "54", "<sample:4>"}, {"org.jfree.chart.util.ShapeList", "equals", "java.lang.Object", "<i:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=55}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "getShape", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "1", "<s:b>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "49", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("50", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=50}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "clone", ""}, {"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "10", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "10", "<i:-1>"}, {"org.jfree.chart.util.ShapeList", "clone", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<i:-4>"}, false, 14, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "2", "<i:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "0", "<s:b>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.chart.util.ShapeList", "getShape", "int", "10"}, {"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "257", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("258", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=258}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "1", "<s:>"}, {"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "65", "<i:-1>"}, {"org.jfree.chart.util.ShapeList", "get", "int", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("66", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=66}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "16777226", "<i:25>"}, {"org.jfree.chart.util.ShapeList", "get", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("16777227", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=16777227}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "16777226", "<i:25>"}, {"org.jfree.chart.util.ShapeList", "get", "int", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("16777227", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=16777227}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "getShape", new String[]{"int"}, new String[]{"10"}, false, 6, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "0", "<s:key>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "getShape", new String[]{"int"}, new String[]{"0"}, false, 6, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "0", "<s:jey>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "10", "<s:>"}, {"org.jfree.chart.util.ShapeList", "size", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "get", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "26", "<d:1.47>"}, {"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "-2147483648", "<sample:4>"}, {"org.jfree.chart.util.ShapeList", "equals", "java.lang.Object", "<i:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=27}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.util.ShapeList", "equals", "java.lang.Object", "<s:b>"}, {"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "0", "<i:-1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "get", new String[]{"int"}, new String[]{"1"}, false, 9, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "1", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "getShape", new String[]{"int"}, new String[]{"1048576"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "1048586", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=1048587}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "getShape", new String[]{"int"}, new String[]{"-1"}, false, 3, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "2147483647", "<i:2>"}, {"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "10", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "getShape", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "20", "<sample:6>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=21}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "get", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "get", "int", "2147483647"}, {"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "0", "<s:key>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "get", new String[]{"int"}, new String[]{"10"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "10", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "get", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "10", "<i:0>"}, {"org.jfree.chart.util.ShapeList", "equals", "java.lang.Object", "<sample:0>"}, {"org.jfree.chart.util.ShapeList", "equals", "java.lang.Object", "<i:-1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "getShape", new String[]{"int"}, new String[]{"-2147221503"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "indexOf", "java.lang.Object", "<s:b>"}, {"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "29", "<sample:2>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=30}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "getShape", new String[]{"int"}, new String[]{"536772625"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "size", ""}, {"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "58", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=59}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "get", new String[]{"int"}, new String[]{"2147483632"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "1", "<s:a>"}, {"org.jfree.chart.util.ShapeList", "size", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "1", "<sample:5>"}, {"org.jfree.chart.util.ShapeList", "size", ""}, {"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "134217729", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("134217730", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=134217730}", SearchInputFactory_scaffolding.receiverState());
 }
}
