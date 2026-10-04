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
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "processForTesting", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "check", "com.google.javascript.rhino.Node,boolean", "<sample:7>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "processForTesting", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<sample:8>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "check", "com.google.javascript.rhino.Node,boolean", "<sample:7>", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "processForTesting", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "check", "com.google.javascript.rhino.Node,boolean", "<sample:7>", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "getTypedPercent", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "getTypedPercent", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<null>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "getTypedPercent", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<null>", "<sample:5>"}, {"com.google.javascript.jscomp.TypeCheck", "visitName", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:1>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "getTypedPercent", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<null>", "<sample:5>"}, {"com.google.javascript.jscomp.TypeCheck", "visitName", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:1>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "getTypedPercent", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "check", "com.google.javascript.rhino.Node,boolean", "<sample:5>", "false"}, {"com.google.javascript.jscomp.TypeCheck", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<null>", "<sample:5>"}, {"com.google.javascript.jscomp.TypeCheck", "visitName", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:1>", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:5>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<null>", "<sample:5>"}, false, 10, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:4>", "<sample:5>"}, false, 7, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<null>", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visitName", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:1>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<sample:4>", "<sample:7>"}, false, 13, new String[][]{}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<sample:4>", "<sample:7>"}, false, 13, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "reportMissingProperties", "boolean", "true"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "check", "com.google.javascript.rhino.Node,boolean", "<sample:5>", "true"}, {"com.google.javascript.jscomp.TypeCheck", "visitName", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:7>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<sample:0>", "<null>"}, false, 12, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<sample:4>", "<null>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "check", "com.google.javascript.rhino.Node,boolean", "<sample:7>", "true"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<sample:4>", "<sample:7>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:2>", "<null>"}, {"com.google.javascript.jscomp.TypeCheck", "processForTesting", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<null>", "<null>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<sample:4>", "<sample:6>"}, false, 11, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:2>", "<null>"}, {"com.google.javascript.jscomp.TypeCheck", "processForTesting", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<null>", "<null>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<sample:3>", "<sample:4>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "getTypedPercent", ""}, {"com.google.javascript.jscomp.TypeCheck", "processForTesting", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:1>"}, {"com.google.javascript.jscomp.TypeCheck", "processForTesting", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<sample:0>", "<sample:2>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "getTypedPercent", ""}, {"com.google.javascript.jscomp.TypeCheck", "processForTesting", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:1>"}, {"com.google.javascript.jscomp.TypeCheck", "processForTesting", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<null>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<sample:0>", "<sample:2>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "getTypedPercent", ""}, {"com.google.javascript.jscomp.TypeCheck", "processForTesting", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:2>", "<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visitName", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<sample:0>", "<sample:5>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "reportMissingProperties", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.TypeCheck", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "reportMissingProperties", new String[]{"boolean"}, new String[]{"true"}, false), new String[][]{{"shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "5"}, {"visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "processForTesting", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:3>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "getTypedPercent", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<sample:7>", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "getTypedPercent", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "check", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:0>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "reportMissingProperties", "boolean", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "check", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:0>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "reportMissingProperties", "boolean", "false"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "processForTesting", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "visitName", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:2>", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:0>", "<sample:0>"}, false, 11, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "visitName", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:5>", "<sample:6>"}, {"com.google.javascript.jscomp.TypeCheck", "getTypedPercent", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visitName", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:6>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:6>", "<sample:0>"}, {"com.google.javascript.jscomp.TypeCheck", "processForTesting", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<null>", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<sample:0>", "<sample:6>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "processForTesting", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:0>"}, {"com.google.javascript.jscomp.TypeCheck", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:8>", "<sample:3>", "<sample:5>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visitName", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<sample:4>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "reportMissingProperties", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "reportMissingProperties", "boolean", "false"}}), new String[][]{{"process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visitName", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:2>", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "reportMissingProperties", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "visitName", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:2>", "<sample:7>"}, {"com.google.javascript.jscomp.TypeCheck", "check", "com.google.javascript.rhino.Node,boolean", "<sample:4>", "true"}}, 3), new String[][]{{"check", "com.google.javascript.rhino.Node,boolean", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "processForTesting", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "check", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:5>", "false"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:3>", "<sample:3>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "processForTesting", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:6>"}, {"com.google.javascript.jscomp.TypeCheck", "visitName", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:1>", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:0>", "<sample:7>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "processForTesting", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:5>"}, {"com.google.javascript.jscomp.TypeCheck", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:4>", "<sample:5>"}, {"com.google.javascript.jscomp.TypeCheck", "getTypedPercent", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<null>", "<sample:3>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "processForTesting", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<null>", "<sample:5>"}, {"com.google.javascript.jscomp.TypeCheck", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:2>", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "processForTesting", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:3>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "getTypedPercent", ""}, {"com.google.javascript.jscomp.TypeCheck", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:3>", "<null>"}, {"com.google.javascript.jscomp.TypeCheck", "processForTesting", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<null>", "<sample:5>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "processForTesting", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:5>"}, {"com.google.javascript.jscomp.TypeCheck", "processForTesting", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:10>", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<null>", "<sample:7>"}, false, 11, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:8>", "<sample:0>", "<sample:0>"}, false, 16, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<null>", "<sample:5>", "<sample:5>"}, {"com.google.javascript.jscomp.TypeCheck", "visitName", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:0>", "<sample:7>"}, {"com.google.javascript.jscomp.TypeCheck", "reportMissingProperties", "boolean", "false"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "check", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:6>", "true"}, false, 4, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:1>", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "reportMissingProperties", new String[]{"boolean"}, new String[]{"true"}, false, 3, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "check", "com.google.javascript.rhino.Node,boolean", "<sample:5>", "true"}}, 1), new String[][]{{"process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "getTypedPercent", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:1>", "<sample:2>"}, {"com.google.javascript.jscomp.TypeCheck", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:0>", "<sample:7>"}, {"com.google.javascript.jscomp.TypeCheck", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "getTypedPercent", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "reportMissingProperties", "boolean", "true"}, {"com.google.javascript.jscomp.TypeCheck", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:0>", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "getTypedPercent", new String[]{}, new String[]{}, false, 22, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "processForTesting", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:5>"}, {"com.google.javascript.jscomp.TypeCheck", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:6>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("100.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "reportMissingProperties", new String[]{"boolean"}, new String[]{"false"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.TypeCheck", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:5>", "<sample:0>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<null>"}, {"com.google.javascript.jscomp.TypeCheck", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "getTypedPercent", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "visitName", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:4>", "<sample:0>"}, {"com.google.javascript.jscomp.TypeCheck", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:4>", "<sample:5>"}, {"com.google.javascript.jscomp.TypeCheck", "processForTesting", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("100.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "getTypedPercent", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "visitName", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:4>", "<sample:4>"}, {"com.google.javascript.jscomp.TypeCheck", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:4>", "<sample:1>"}, {"com.google.javascript.jscomp.TypeCheck", "processForTesting", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("100.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:5>", "<sample:0>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<sample:1>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<sample:4>"}, false, 10, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:5>", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<sample:10>", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "getTypedPercent", ""}, {"com.google.javascript.jscomp.TypeCheck", "getTypedPercent", ""}, {"com.google.javascript.jscomp.TypeCheck", "getTypedPercent", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<sample:1>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "reportMissingProperties", new String[]{"boolean"}, new String[]{"false"}, false, 4, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:10>", "<sample:4>"}}, 2), new String[][]{{"visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visitName", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<sample:0>", "<sample:0>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "check", "com.google.javascript.rhino.Node,boolean", "<sample:10>", "false"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visitName", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<sample:0>", "<sample:1>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "check", "com.google.javascript.rhino.Node,boolean", "<sample:10>", "false"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visitName", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<sample:1>", "<sample:5>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "check", "com.google.javascript.rhino.Node,boolean", "<sample:10>", "false"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<null>", "<sample:2>"}, false, 11, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "reportMissingProperties", "boolean", "true"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "reportMissingProperties", new String[]{"boolean"}, new String[]{"false"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.TypeCheck", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visitName", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<sample:7>", "<sample:6>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "processForTesting", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<null>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:3>", "<sample:7>"}, {"com.google.javascript.jscomp.TypeCheck", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:0>", "<sample:7>"}, {"com.google.javascript.jscomp.TypeCheck", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:10>", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visitName", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:8>", "<sample:3>", "<sample:4>"}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "reportMissingProperties", new String[]{"boolean"}, new String[]{"true"}, false), new String[][]{{"shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "reportMissingProperties", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:6>", "<sample:6>"}, {"com.google.javascript.jscomp.TypeCheck", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:4>", "<sample:2>"}, {"com.google.javascript.jscomp.TypeCheck", "check", "com.google.javascript.rhino.Node,boolean", "<sample:0>", "true"}}, 3), new String[][]{{"shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "reportMissingProperties", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:6>", "<sample:6>"}, {"com.google.javascript.jscomp.TypeCheck", "check", "com.google.javascript.rhino.Node,boolean", "<sample:0>", "true"}}, 1), new String[][]{{"shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "reportMissingProperties", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:6>", "<sample:6>"}, {"com.google.javascript.jscomp.TypeCheck", "check", "com.google.javascript.rhino.Node,boolean", "<sample:0>", "true"}}, 1), new String[][]{{"visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "reportMissingProperties", new String[]{"boolean"}, new String[]{"false"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.TypeCheck", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "reportMissingProperties", new String[]{"boolean"}, new String[]{"false"}, false, 0, null, 2), new String[][]{{"process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:8>", "<sample:13>", "<sample:3>"}, false, 12, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:14>", "<sample:13>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "visitName", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:0>", "<sample:2>"}, {"com.google.javascript.jscomp.TypeCheck", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:0>", "<sample:9>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:15>", "<sample:9>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "visitName", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:5>", "<sample:13>"}, {"com.google.javascript.jscomp.TypeCheck", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:0>", "<sample:3>"}, {"com.google.javascript.jscomp.TypeCheck", "getTypedPercent", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:7>", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "getTypedPercent", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "reportMissingProperties", new String[]{"boolean"}, new String[]{"false"}, false, 0, null, 3), new String[][]{{"visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeCheck", "com.google.javascript.jscomp.TypeCheck", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:17>", "<sample:7>"}, false, 14, new String[][]{{"com.google.javascript.jscomp.TypeCheck", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:9>", "<sample:0>"}, {"com.google.javascript.jscomp.TypeCheck", "check", "com.google.javascript.rhino.Node,boolean", "<sample:6>", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
}
