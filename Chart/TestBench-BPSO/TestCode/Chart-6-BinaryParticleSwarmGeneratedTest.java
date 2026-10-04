package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "getShape", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "indexOf", "java.lang.Object", "<i:-1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "indexOf", "java.lang.Object", "<s:a>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"-2147483587", "<b:true>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "get", new String[]{"int"}, new String[]{"2"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "setShape", new String[]{"int", "java.awt.Shape"}, new String[]{"-59", "<sample:1>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<i:42>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "getShape", "int", "2147483605"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.ShapeList", actual.getClass().getName());
  assertEquals("{size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clear", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.util.ShapeList", "equals", "java.lang.Object", "<s:T>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clear", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "-536870912", "<sample:2>"}, {"org.jfree.chart.util.ShapeList", "getShape", "int", "2147479551"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "setShape", new String[]{"int", "java.awt.Shape"}, new String[]{"63", "<sample:6>"}, false, 4, new String[][]{{"org.jfree.chart.util.ShapeList", "clear", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=64}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "get", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"2147483647", "<null>"}, false, 1, new String[][]{{"org.jfree.chart.util.ShapeList", "hashCode", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "getShape", "int", "-2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.util.ShapeList", "clear", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4699", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "8", "<s:.>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.util.ShapeList", "getShape", "int", "42"}}), new String[][]{{"setShape", "int,java.awt.Shape", "3"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.ShapeList", actual.getClass().getName());
  assertEquals("{size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "equals", "java.lang.Object", "<s:EE>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "getShape", new String[]{"int"}, new String[]{"1024"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "-2147483648", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4699", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "get", new String[]{"int"}, new String[]{"66"}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "hashCode", ""}, {"org.jfree.chart.util.ShapeList", "get", "int", "-1"}}), new String[][]{{"size", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3), new String[][]{{"getShape", "int", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clear", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "0", "<b:true>"}, {"org.jfree.chart.util.ShapeList", "size", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "get", new String[]{"int"}, new String[]{"1073741821"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<d:0.75>"}, false, 2, new String[][]{{"org.jfree.chart.util.ShapeList", "clone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "getShape", new String[]{"int"}, new String[]{"2147483647"}, false, 3, new String[][]{{"org.jfree.chart.util.ShapeList", "getShape", "int", "-2147483648"}, {"org.jfree.chart.util.ShapeList", "hashCode", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"-90", "<d:-1.5>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.util.ShapeList", "get", "int", "-2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"54", "<s:b>>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=55}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "getShape", "int", "2147483647"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "setShape", new String[]{"int", "java.awt.Shape"}, new String[]{"2147483647", "<sample:6>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "clear", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.ShapeList", actual.getClass().getName());
  assertEquals("{size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "setShape", new String[]{"int", "java.awt.Shape"}, new String[]{"87", "<sample:5>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "size", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=88}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "getShape", new String[]{"int"}, new String[]{"55"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "0", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.util.ShapeList", "size", ""}}, 1), new String[][]{{"size", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "1087", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=1088}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "131071", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1712722540", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=131072}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "getShape", new String[]{"int"}, new String[]{"-1"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "1", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "setShape", new String[]{"int", "java.awt.Shape"}, new String[]{"-3", "<sample:3>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "indexOf", "java.lang.Object", "<s:>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "24", "<sample:1>"}}), new String[][]{{"clear", "", "1"}, {"clone", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.ShapeList", actual.getClass().getName());
  assertEquals("{size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{size=25}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.ShapeList", actual.getClass().getName());
  assertEquals("{size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "equals", "java.lang.Object", "<s:8a>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.ShapeList", actual.getClass().getName());
  assertEquals("{size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "setShape", new String[]{"int", "java.awt.Shape"}, new String[]{"10", "<sample:4>"}, false, 7, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "2147483647", "<i:1>"}, {"org.jfree.chart.util.ShapeList", "get", "int", "-36"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"0", "<null>"}, false, 5, new String[][]{{"org.jfree.chart.util.ShapeList", "size", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "setShape", new String[]{"int", "java.awt.Shape"}, new String[]{"60", "<sample:2>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "-1", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=61}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4699", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"getShape", "int", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.chart.util.ShapeList", "getShape", "int", "-2147483648"}}), new String[][]{{"setShape", "int,java.awt.Shape", "6"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.ShapeList", actual.getClass().getName());
  assertEquals("{size=4}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "setShape", new String[]{"int", "java.awt.Shape"}, new String[]{"2", "<sample:3>"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "get", "int", "44"}, {"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "0", "<s:key>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("279979", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "getShape", new String[]{"int"}, new String[]{"-63"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "size", ""}, {"org.jfree.chart.util.ShapeList", "getShape", "int", "138"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "equals", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "4194314", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=4194315}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"20", "<b:true>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=21}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "getShape", new String[]{"int"}, new String[]{"-10"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "31", "<i:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=32}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "74", "<i:-67108864>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=75}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"524280", "<s:>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "hashCode", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=524281}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"56", "<sample:1>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "getShape", "int", "2147483647"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=57}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"8", "<i:0>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "clear", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "setShape", new String[]{"int", "java.awt.Shape"}, new String[]{"10", "<sample:4>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"50", "<d:4.9>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=51}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "40", "<i:45>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("240096885", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=41}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "setShape", new String[]{"int", "java.awt.Shape"}, new String[]{"-43", "<sample:4>"}, false, 5, new String[][]{{"org.jfree.chart.util.ShapeList", "clone", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "setShape", new String[]{"int", "java.awt.Shape"}, new String[]{"102", "<sample:6>"}, false, 5, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "-2147483648", "<d:-25.5>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=103}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "hashCode", ""}, {"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "1", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "size", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4699", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "68", "<sample:9>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=69}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "setShape", new String[]{"int", "java.awt.Shape"}, new String[]{"2038", "<sample:7>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "clone", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=2039}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"size", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"2147483647", "<i:32>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "getShape", "int", "2147483647"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "getShape", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "80", "<b:true>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=81}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"-2147483648", "<d:1.5>"}, false, 5, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.util.ShapeList", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "hashCode", ""}, {"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "0", "<s:>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("173900", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:bb>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "20", "<i:9>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=21}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.util.ShapeList", "getShape", "int", "-1"}}), new String[][]{{"setShape", "int,java.awt.Shape", "2"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.ShapeList", actual.getClass().getName());
  assertEquals("{size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"setShape", "int,java.awt.Shape", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "get", "int", "-2"}, {"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "63", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("64", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=64}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "get", new String[]{"int"}, new String[]{"1"}, false, 7, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "2147483638", "<sample:6>"}, {"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "262207", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=262208}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<s:d>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "64", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=65}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false), new String[][]{{"getShape", "int", "4"}, {"clone", "", "2"}, {"setShape", "int,java.awt.Shape", "5"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.ShapeList", actual.getClass().getName());
  assertEquals("{size=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "29", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.ShapeList", actual.getClass().getName());
  assertEquals("{size=30}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{size=30}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"size", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "63", "<d:1.5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1295603407", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=64}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "get", new String[]{"int"}, new String[]{"2147483647"}, false, 7, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "2", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.util.ShapeList", "indexOf", "java.lang.Object", "<s:0>"}}, 1), new String[][]{{"setShape", "int,java.awt.Shape", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "2147483647", "<sample:6>"}, {"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "1", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "clone", ""}}, 3), new String[][]{{"setShape", "int,java.awt.Shape", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "1", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.ShapeList", actual.getClass().getName());
  assertEquals("{size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "get", new String[]{"int"}, new String[]{"2147483647"}, false, 2, new String[][]{{"org.jfree.chart.util.ShapeList", "clear", ""}, {"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "0", "<i:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "clone", ""}}, 2), new String[][]{{"setShape", "int,java.awt.Shape", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"getShape", "int", "4"}, {"getShape", "int", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "get", new String[]{"int"}, new String[]{"0"}, false, 3, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "210", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=211}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "10", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.ShapeList", actual.getClass().getName());
  assertEquals("{size=11}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{size=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "16777153", "<s:>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("16777154", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=16777154}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "get", new String[]{"int"}, new String[]{"2147483647"}, false, 3, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "10", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-2>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "66", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=67}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "71", "<s:>"}, {"org.jfree.chart.util.ShapeList", "get", "int", "-39"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("241665463", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=72}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "0", "<i:49>"}}), new String[][]{{"clear", "", "1"}, {"getShape", "int", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "setShape", new String[]{"int", "java.awt.Shape"}, new String[]{"-2143289344", "<sample:2>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "hashCode", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "5", "<s:a>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("238325954", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "get", new String[]{"int"}, new String[]{"-2147483648"}, false, 7, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "13", "<i:26>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=14}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:c>"}, false, 1, new String[][]{{"org.jfree.chart.util.ShapeList", "getShape", "int", "-2147483648"}, {"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "10", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"0", "<s:c>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "size", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "4194304", "<s:[\n>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2056110441", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=4194305}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<d:4.300000000000001>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "0", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "getShape", new String[]{"int"}, new String[]{"-1"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "0", "<sample:3>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"-2147483648", "<s:?>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "size", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "setShape", new String[]{"int", "java.awt.Shape"}, new String[]{"1", "<sample:4>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "clear", ""}, {"org.jfree.chart.util.ShapeList", "clear", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"63", "<sample:1>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "2", "<i:-1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=64}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "5", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<s:ky>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "equals", "java.lang.Object", "<i:1>"}, {"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "218", "<i:15>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=219}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "get", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "20", "<sample:6>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=21}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "2147483647", "<sample:6>"}}, 3), new String[][]{{"setShape", "int,java.awt.Shape", "7"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.ShapeList", actual.getClass().getName());
  assertEquals("{size=5}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2), new String[][]{{"getShape", "int", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"0", "<i:4>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "2147483647", "<d:1.5>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "setShape", new String[]{"int", "java.awt.Shape"}, new String[]{"0", "<sample:9>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "get", "int", "66"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "52", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("53", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=53}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "setShape", new String[]{"int", "java.awt.Shape"}, new String[]{"26", "<sample:4>"}, false, 6, new String[][]{{"org.jfree.chart.util.ShapeList", "indexOf", "java.lang.Object", "<sample:1>"}, {"org.jfree.chart.util.ShapeList", "getShape", "int", "126"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=27}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "setShape", new String[]{"int", "java.awt.Shape"}, new String[]{"2147483647", "<sample:6>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "63", "<i:-2147483648>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "1", "<sample:2>"}}, 3), new String[][]{{"clear", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.ShapeList", actual.getClass().getName());
  assertEquals("{size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "1", "<d:-15.5>"}, {"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "2147483647", "<sample:0>"}}, 3), new String[][]{{"setShape", "int,java.awt.Shape", "5"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.ShapeList", actual.getClass().getName());
  assertEquals("{size=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "clear", ""}, {"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "55", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=56}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "hashCode", ""}, {"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "32", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=33}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "48", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("49", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=49}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "setShape", new String[]{"int", "java.awt.Shape"}, new String[]{"10", "<sample:4>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "76", "<s:jy>"}, {"org.jfree.chart.util.ShapeList", "size", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("77", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=77}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"10", "<s:bC>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "get", "int", "51"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "equals", "java.lang.Object", "<d:1.5>"}}, 1), new String[][]{{"setShape", "int,java.awt.Shape", "2"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.ShapeList", actual.getClass().getName());
  assertEquals("{size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "0", "<s:key>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.ShapeList", actual.getClass().getName());
  assertEquals("{size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "0", "<sample:3>"}, {"org.jfree.chart.util.ShapeList", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.ShapeList", actual.getClass().getName());
  assertEquals("{size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.util.ShapeList", "equals", "java.lang.Object", "<i:1>"}, {"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "10", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("11", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"126", "<sample:0>"}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=127}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "10", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.ShapeList", actual.getClass().getName());
  assertEquals("{size=11}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{size=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "get", new String[]{"int"}, new String[]{"40"}, false, 2, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "1150", "<sample:0>"}, {"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "2147483647", "<s:>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=1151}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "getShape", new String[]{"int"}, new String[]{"2147483647"}, false, 7, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "0", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "setShape", new String[]{"int", "java.awt.Shape"}, new String[]{"21", "<sample:3>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=22}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "setShape", new String[]{"int", "java.awt.Shape"}, new String[]{"126", "<sample:2>"}, false, 1, new String[][]{{"org.jfree.chart.util.ShapeList", "equals", "java.lang.Object", "<s:b>"}, {"org.jfree.chart.util.ShapeList", "get", "int", "29"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=127}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 6, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "10", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "2097153", "<sample:2>"}, {"org.jfree.chart.util.ShapeList", "getShape", "int", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=2097154}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "get", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "hashCode", ""}, {"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "31", "<sample:5>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=32}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "63", "<sample:3>"}, {"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "262144", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("262145", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=262145}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "73", "<d:1.5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1296109937", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=74}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"33554438", "<s:\">"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "getShape", "int", "2147483647"}, {"org.jfree.chart.util.ShapeList", "size", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=33554439}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "get", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "63", "<null>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=64}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"2147483647", "<i:-1>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "0", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"33554426", "<null>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "equals", "java.lang.Object", "<d:-0.75>"}, {"org.jfree.chart.util.ShapeList", "clone", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=33554427}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "getShape", new String[]{"int"}, new String[]{"5"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "5", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "2", "<d:-1.5>"}}, 2), new String[][]{{"getShape", "int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"0", "<i:1>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "get", "int", "-1"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "setShape", new String[]{"int", "java.awt.Shape"}, new String[]{"2", "<sample:4>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"20", "<i:0>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=21}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "clear", ""}, {"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "126", "<i:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.ShapeList", actual.getClass().getName());
  assertEquals("{size=127}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{size=127}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"10", "<i:-41>"}, false, 7, new String[][]{{"org.jfree.chart.util.ShapeList", "equals", "java.lang.Object", "<b:true>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "126", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("127", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=127}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3), new String[][]{{"clear", "", "1"}, {"setShape", "int,java.awt.Shape", "3"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.ShapeList", actual.getClass().getName());
  assertEquals("{size=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "getShape", new String[]{"int"}, new String[]{"-32744"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "63", "<sample:6>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=64}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "2147483647", "<sample:2>"}}, 2), new String[][]{{"size", "", "6"}, {"setShape", "int,java.awt.Shape", "7"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.ShapeList", actual.getClass().getName());
  assertEquals("{size=5}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"clone", "", "1"}, {"setShape", "int,java.awt.Shape", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "indexOf", "java.lang.Object", "<i:2>"}, {"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "43", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("44", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=44}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "setShape", new String[]{"int", "java.awt.Shape"}, new String[]{"2147483647", "<sample:3>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "setShape", new String[]{"int", "java.awt.Shape"}, new String[]{"1", "<sample:2>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "2147483647", "<s:key>"}, {"org.jfree.chart.util.ShapeList", "clear", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "get", new String[]{"int"}, new String[]{"0"}, false, 2, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "0", "<s:key>"}, {"org.jfree.chart.util.ShapeList", "indexOf", "java.lang.Object", "<d:2.0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"setShape", "int,java.awt.Shape", "5"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.ShapeList", actual.getClass().getName());
  assertEquals("{size=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "63", "<i:-13>"}, {"org.jfree.chart.util.ShapeList", "getShape", "int", "-33554433"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.ShapeList", actual.getClass().getName());
  assertEquals("{size=64}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{size=64}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"2147483647", "<s:3>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "equals", "java.lang.Object", "<i:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"63", "<d:1.5>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "equals", "java.lang.Object", "<i:-2147483648>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=64}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "72", "<s:key>"}, {"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "0", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("73", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=73}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"10", "<s:7b>"}, false, 5, new String[][]{{"org.jfree.chart.util.ShapeList", "indexOf", "java.lang.Object", "<s:_a>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "1", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "setShape", new String[]{"int", "java.awt.Shape"}, new String[]{"128", "<null>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "get", "int", "-2147483647"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=129}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "setShape", new String[]{"int", "java.awt.Shape"}, new String[]{"5", "<sample:8>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "get", "int", "41"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "34", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("35", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=35}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "set", new String[]{"int", "java.lang.Object"}, new String[]{"8", "<sample:0>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "indexOf", "java.lang.Object", "<s:key>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 3, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "0", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "40", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.ShapeList", actual.getClass().getName());
  assertEquals("{size=41}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{size=41}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.util.ShapeList", "getShape", "int", "-1"}, {"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "50", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("51", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=51}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "clone", ""}, {"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "41", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=42}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "1", "<d:1.32>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1853935356", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "get", new String[]{"int"}, new String[]{"20"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "23", "<d:7.5>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=24}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "126", "<s:>"}, {"org.jfree.chart.util.ShapeList", "getShape", "int", "29"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("127", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=127}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "2049", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2050", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=2050}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "37", "<sample:2>"}}, 2), new String[][]{{"getShape", "int", "2"}, {"clone", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.ShapeList", actual.getClass().getName());
  assertEquals("{size=38}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{size=38}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "63", "<sample:7>"}}, 1), new String[][]{{"getShape", "int", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=64}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "setShape", new String[]{"int", "java.awt.Shape"}, new String[]{"0", "<sample:3>"}, false, 6, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "getShape", "int", "-2"}, {"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "10", "<i:-2147483648>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("11", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "1", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6435671", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "62", "<sample:8>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("63", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=63}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "1", "<s:Ca>"}, {"org.jfree.chart.util.ShapeList", "equals", "java.lang.Object", "<s:I>"}}, 1), new String[][]{{"getShape", "int", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "getShape", new String[]{"int"}, new String[]{"20"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "61", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=62}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "1", "<sample:3>"}, {"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "-4", "<i:-1>"}}, 2), new String[][]{{"clear", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.ShapeList", actual.getClass().getName());
  assertEquals("{size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "0", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "32778", "<sample:5>"}}, 3), new String[][]{{"getShape", "int", "5"}, {"getShape", "int", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=32779}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "indexOf", "java.lang.Object", "<i:-1>"}, {"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "0", "<b:true>"}}, 1), new String[][]{{"setShape", "int,java.awt.Shape", "7"}, {"getShape", "int", "1"}, {"clear", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.ShapeList", actual.getClass().getName());
  assertEquals("{size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "63", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=64}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "equals", "java.lang.Object", "<i:1>"}, {"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "1", "<i:-2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "size", ""}, {"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "72", "<sample:8>"}}, 3), new String[][]{{"getShape", "int", "0"}, {"clone", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.ShapeList", actual.getClass().getName());
  assertEquals("{size=73}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{size=73}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "getShape", new String[]{"int"}, new String[]{"13"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "39", "<null>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=40}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "size", ""}, {"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "4194304", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=4194305}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "setShape", new String[]{"int", "java.awt.Shape"}, new String[]{"63", "<sample:0>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=64}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "63", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=64}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "262151", "<s:b>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("631905441", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=262152}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "2047", "<null>"}, {"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "-2147483648", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2048", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=2048}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "get", new String[]{"int"}, new String[]{"-2147483606"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "clear", ""}, {"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "0", "<sample:1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "0", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "0", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "get", new String[]{"int"}, new String[]{"2147483647"}, false, 5, new String[][]{{"org.jfree.chart.util.ShapeList", "get", "int", "-4194305"}, {"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "9", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=10}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "getShape", new String[]{"int"}, new String[]{"-2"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "511", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=512}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "get", new String[]{"int"}, new String[]{"63"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "0", "<s:>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "get", new String[]{"int"}, new String[]{"-2147483648"}, false, 1, new String[][]{{"org.jfree.chart.util.ShapeList", "clear", ""}, {"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "6", "<null>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "126", "<sample:5>"}}, 2), new String[][]{{"clear", "", "3"}, {"clone", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.ShapeList", actual.getClass().getName());
  assertEquals("{size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{size=127}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "get", new String[]{"int"}, new String[]{"-20"}, false, 5, new String[][]{{"org.jfree.chart.util.ShapeList", "getShape", "int", "-1"}, {"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "10", "<sample:6>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "get", new String[]{"int"}, new String[]{"0"}, false, 1, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "0", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "setShape", new String[]{"int", "java.awt.Shape"}, new String[]{"2147483647", "<sample:1>"}, false, 6, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "-36", "<s:a>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "1", "<s:key>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6541748", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.chart.util.ShapeList", "indexOf", "java.lang.Object", "<i:-2147483648>"}, {"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "34", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("239794891", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=35}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "63", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("64", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=64}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "1", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "4194305", "<null>"}, {"org.jfree.chart.util.ShapeList", "size", ""}}, 2), new String[][]{{"clear", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.jfree.chart.util.ShapeList", actual.getClass().getName());
  assertEquals("{size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{size=4194306}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:9key>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "119", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=120}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "33", "<d:-1.5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("34", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=34}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "5", "<i:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "10", "<s:>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("11", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "40", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("41", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=41}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "97", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("98", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=98}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "45", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("46", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=46}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:-35.5>"}, false, 1, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "1025", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=1026}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "29", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("30", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=30}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "size", ""}, {"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "31", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("32", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=32}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "4", "<s:kkey>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("360139204", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "2", "<i:-2147483648>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "524261", "<s:b->"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1023771828", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=524262}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "46", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("47", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=47}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "getShape", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "114", "<i:-2147483648>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=115}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "4", "<i:18>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("238272378", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "61", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("62", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=62}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "17", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("18", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=18}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "getShape", new String[]{"int"}, new String[]{"126"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "-2147483648", "<s:b>"}, {"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "20", "<sample:6>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=21}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "41", "<i:2>"}, {"org.jfree.chart.util.ShapeList", "indexOf", "java.lang.Object", "<i:-2147483648>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("240145947", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=42}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "get", new String[]{"int"}, new String[]{"10"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "10", "<s:b>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=11}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "2111", "<s:b>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2112", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=2112}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "get", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "0", "<i:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "indexOf", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "2", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "2", "<s:kgy>"}, {"org.jfree.chart.util.ShapeList", "size", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "getShape", new String[]{"int"}, new String[]{"268435480"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "38", "<i:-74>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=39}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "get", new String[]{"int"}, new String[]{"63"}, false, 2, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "63", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{size=64}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "get", new String[]{"int"}, new String[]{"0"}, false, 5, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "0", "<sample:2>"}}, 1), new String[][]{{"contains", "java.awt.geom.Point2D", "4"}, {"contains", "java.awt.geom.Rectangle2D", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "getShape", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "1", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "get", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "1", "<s:>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "524288", "<sample:1>"}, {"org.jfree.chart.util.ShapeList", "indexOf", "java.lang.Object", "<d:1.5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("524289", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=524289}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "16777216", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=16777217}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "8", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=9}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "getShape", new String[]{"int"}, new String[]{"2"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "indexOf", "java.lang.Object", "<null>"}, {"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "5", "<sample:6>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "get", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "0", "<s:a>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "getShape", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "hashCode", ""}, {"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "1", "<sample:3>"}}), new String[][]{{"contains", "java.awt.geom.Point2D", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "getShape", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "0", "<sample:0>"}}, 3), new String[][]{{"getPathIterator", "java.awt.geom.AffineTransform,double", "5"}, {"getWindingRule", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "getShape", new String[]{"int"}, new String[]{"0"}, false, 6, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "0", "<s:kkeoy>"}, {"org.jfree.chart.util.ShapeList", "indexOf", "java.lang.Object", "<d:7.1000000000000005>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "get", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "0", "<d:1.5>"}, {"org.jfree.chart.util.ShapeList", "getShape", "int", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "41", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("42", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=42}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "size", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.chart.util.ShapeList", "set", "int,java.lang.Object", "5", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "get", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "0", "<sample:4>"}, {"org.jfree.chart.util.ShapeList", "indexOf", "java.lang.Object", "<b:true>"}}), new String[][]{{"contains", "double,double", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.chart.util.ShapeList", "org.jfree.chart.util.ShapeList", "getShape", new String[]{"int"}, new String[]{"10"}, false, 6, new String[][]{{"org.jfree.chart.util.ShapeList", "setShape", "int,java.awt.Shape", "10", "<sample:6>"}}), new String[][]{{"contains", "java.awt.geom.Point2D", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{size=11}", SearchInputFactory_scaffolding.receiverState());
 }
}
