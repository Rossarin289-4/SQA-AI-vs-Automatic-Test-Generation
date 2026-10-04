package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CheckAccessControls", "com.google.javascript.jscomp.CheckAccessControls", "enterScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:5>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CheckAccessControls", "com.google.javascript.jscomp.CheckAccessControls", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:0>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.CheckAccessControls", "hotSwapScript", "com.google.javascript.rhino.Node", "<sample:5>"}, {"com.google.javascript.jscomp.CheckAccessControls", "enterScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:6>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CheckAccessControls", "com.google.javascript.jscomp.CheckAccessControls", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:6>", "<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CheckAccessControls", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:5>", "<sample:11>"}, {"com.google.javascript.jscomp.CheckAccessControls", "exitScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CheckAccessControls", "com.google.javascript.jscomp.CheckAccessControls", "hotSwapScript", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CheckAccessControls", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:1>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CheckAccessControls", "com.google.javascript.jscomp.CheckAccessControls", "exitScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:8>"}, false, 3, new String[][]{}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CheckAccessControls", "com.google.javascript.jscomp.CheckAccessControls", "enterScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<null>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CheckAccessControls", "com.google.javascript.jscomp.CheckAccessControls", "exitScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:10>"}, false, 1, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CheckAccessControls", "com.google.javascript.jscomp.CheckAccessControls", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<sample:8>", "<sample:6>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.CheckAccessControls", "enterScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:4>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CheckAccessControls", "com.google.javascript.jscomp.CheckAccessControls", "enterScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:7>"}, false, 5, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CheckAccessControls", "com.google.javascript.jscomp.CheckAccessControls", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:8>", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CheckAccessControls", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:1>", "<sample:7>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CheckAccessControls", "com.google.javascript.jscomp.CheckAccessControls", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<sample:6>", "<sample:9>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CheckAccessControls", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:2>", "<sample:2>"}, {"com.google.javascript.jscomp.CheckAccessControls", "exitScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:3>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CheckAccessControls", "com.google.javascript.jscomp.CheckAccessControls", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<sample:1>", "<sample:2>"}, false, 4, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CheckAccessControls", "com.google.javascript.jscomp.CheckAccessControls", "enterScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.CheckAccessControls", "hotSwapScript", "com.google.javascript.rhino.Node", "<sample:2>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CheckAccessControls", "com.google.javascript.jscomp.CheckAccessControls", "hotSwapScript", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.CheckAccessControls", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:5>", "<null>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CheckAccessControls", "com.google.javascript.jscomp.CheckAccessControls", "hotSwapScript", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:11>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.CheckAccessControls", "enterScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:6>"}, {"com.google.javascript.jscomp.CheckAccessControls", "exitScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:2>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CheckAccessControls", "com.google.javascript.jscomp.CheckAccessControls", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<sample:3>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.CheckAccessControls", "hotSwapScript", "com.google.javascript.rhino.Node", "<sample:3>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CheckAccessControls", "com.google.javascript.jscomp.CheckAccessControls", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:8>", "<sample:3>", "<sample:1>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.CheckAccessControls", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:3>", "<sample:8>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CheckAccessControls", "com.google.javascript.jscomp.CheckAccessControls", "hotSwapScript", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.CheckAccessControls", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:7>", "<sample:2>"}, {"com.google.javascript.jscomp.CheckAccessControls", "enterScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CheckAccessControls", "com.google.javascript.jscomp.CheckAccessControls", "exitScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:3>"}, false, 4, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CheckAccessControls", "com.google.javascript.jscomp.CheckAccessControls", "hotSwapScript", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CheckAccessControls", "hotSwapScript", "com.google.javascript.rhino.Node", "<sample:5>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CheckAccessControls", "com.google.javascript.jscomp.CheckAccessControls", "hotSwapScript", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.CheckAccessControls", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:4>", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CheckAccessControls", "com.google.javascript.jscomp.CheckAccessControls", "exitScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.CheckAccessControls", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:3>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CheckAccessControls", "com.google.javascript.jscomp.CheckAccessControls", "exitScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CheckAccessControls", "com.google.javascript.jscomp.CheckAccessControls", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:6>", "<sample:2>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.CheckAccessControls", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:7>", "<sample:8>"}, {"com.google.javascript.jscomp.CheckAccessControls", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<null>", "<null>", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CheckAccessControls", "com.google.javascript.jscomp.CheckAccessControls", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:9>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.CheckAccessControls", "exitScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:6>"}, {"com.google.javascript.jscomp.CheckAccessControls", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:6>", "<sample:0>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CheckAccessControls", "com.google.javascript.jscomp.CheckAccessControls", "exitScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CheckAccessControls", "exitScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:3>"}, {"com.google.javascript.jscomp.CheckAccessControls", "hotSwapScript", "com.google.javascript.rhino.Node", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CheckAccessControls", "com.google.javascript.jscomp.CheckAccessControls", "enterScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CheckAccessControls", "exitScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:3>"}, {"com.google.javascript.jscomp.CheckAccessControls", "enterScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CheckAccessControls", "com.google.javascript.jscomp.CheckAccessControls", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<null>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.CheckAccessControls", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:8>", "<sample:4>"}, {"com.google.javascript.jscomp.CheckAccessControls", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:4>", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CheckAccessControls", "com.google.javascript.jscomp.CheckAccessControls", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CheckAccessControls", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:8>", "<sample:2>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CheckAccessControls", "com.google.javascript.jscomp.CheckAccessControls", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<null>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CheckAccessControls", "com.google.javascript.jscomp.CheckAccessControls", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<sample:3>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CheckAccessControls", "hotSwapScript", "com.google.javascript.rhino.Node", "<sample:9>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CheckAccessControls", "com.google.javascript.jscomp.CheckAccessControls", "enterScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CheckAccessControls", "com.google.javascript.jscomp.CheckAccessControls", "enterScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:0>"}, false, 3, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CheckAccessControls", "com.google.javascript.jscomp.CheckAccessControls", "hotSwapScript", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CheckAccessControls", "com.google.javascript.jscomp.CheckAccessControls", "exitScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<null>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.CheckAccessControls", "exitScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CheckAccessControls", "com.google.javascript.jscomp.CheckAccessControls", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<sample:3>", "<sample:6>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.CheckAccessControls", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:5>", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CheckAccessControls", "com.google.javascript.jscomp.CheckAccessControls", "exitScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<null>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.CheckAccessControls", "exitScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:5>"}, {"com.google.javascript.jscomp.CheckAccessControls", "enterScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CheckAccessControls", "com.google.javascript.jscomp.CheckAccessControls", "hotSwapScript", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CheckAccessControls", "com.google.javascript.jscomp.CheckAccessControls", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CheckAccessControls", "exitScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CheckAccessControls", "com.google.javascript.jscomp.CheckAccessControls", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<null>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.CheckAccessControls", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:4>", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CheckAccessControls", "com.google.javascript.jscomp.CheckAccessControls", "enterScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<null>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.CheckAccessControls", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:9>", "<sample:4>"}, {"com.google.javascript.jscomp.CheckAccessControls", "hotSwapScript", "com.google.javascript.rhino.Node", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CheckAccessControls", "com.google.javascript.jscomp.CheckAccessControls", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<null>", "<sample:5>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.CheckAccessControls", "enterScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CheckAccessControls", "com.google.javascript.jscomp.CheckAccessControls", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<null>", "<sample:3>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.CheckAccessControls", "enterScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CheckAccessControls", "com.google.javascript.jscomp.CheckAccessControls", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<null>", "<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
}
