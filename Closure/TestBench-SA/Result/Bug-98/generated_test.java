package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:5>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:5>", "<sample:6>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:4>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:7>", "<sample:7>"}, {"com.google.javascript.jscomp.ReferenceCollectingCallback", "exitScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:7>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:1>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:7>", "<sample:2>"}, {"com.google.javascript.jscomp.ReferenceCollectingCallback", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:1>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:11>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:1>"}, {"com.google.javascript.jscomp.ReferenceCollectingCallback", "exitScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:2>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:11>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferenceCollection", "com.google.javascript.jscomp.Scope$Var", "<sample:6>"}, {"com.google.javascript.jscomp.ReferenceCollectingCallback", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:2>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferenceCollection", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:0>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "exitScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "exitScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:7>"}, {"com.google.javascript.jscomp.ReferenceCollectingCallback", "enterScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:4>", "<null>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:2>", "<sample:0>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "exitScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "exitScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:4>"}, {"com.google.javascript.jscomp.ReferenceCollectingCallback", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:3>", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<null>", "<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:4>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "exitScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:7>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferenceCollection", "com.google.javascript.jscomp.Scope$Var", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "enterScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:2>", "<sample:11>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:1>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:0>", "<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferenceCollection", "com.google.javascript.jscomp.Scope$Var", "<null>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "exitScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:5>", "<sample:6>"}, {"com.google.javascript.jscomp.ReferenceCollectingCallback", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:13>"}, {"com.google.javascript.jscomp.ReferenceCollectingCallback", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:2>", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<sample:2>", "<sample:6>"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<null>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<null>"}, {"com.google.javascript.jscomp.ReferenceCollectingCallback", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:5>", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<null>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<null>"}, {"com.google.javascript.jscomp.ReferenceCollectingCallback", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:4>", "<sample:2>"}, {"com.google.javascript.jscomp.ReferenceCollectingCallback", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<null>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferenceCollection", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:7>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:4>", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<null>", "<sample:0>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferenceCollection", "com.google.javascript.jscomp.Scope$Var", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferenceCollection", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<null>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<null>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferenceCollection", "com.google.javascript.jscomp.Scope$Var", "<null>"}, {"com.google.javascript.jscomp.ReferenceCollectingCallback", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:3>"}, {"com.google.javascript.jscomp.ReferenceCollectingCallback", "exitScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "enterScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:1>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "enterScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:6>", "<sample:3>"}, {"com.google.javascript.jscomp.ReferenceCollectingCallback", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:11>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<sample:0>", "<sample:4>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferenceCollection", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:4>"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferenceCollection", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<null>"}, false, 1, new String[][]{}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferenceCollection", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<null>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:11>", "<sample:11>"}, {"com.google.javascript.jscomp.ReferenceCollectingCallback", "enterScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:4>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<sample:9>", "<sample:2>"}, false, 8, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "enterScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:4>"}, {"com.google.javascript.jscomp.ReferenceCollectingCallback", "enterScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:6>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<null>", "<sample:2>"}, false, 2, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "enterScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "enterScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<null>"}, false, 11, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:5>", "<sample:6>"}, {"com.google.javascript.jscomp.ReferenceCollectingCallback", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:1>", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferenceCollection", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<null>", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<null>", "<sample:13>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferenceCollection", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<null>"}, false, 8, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "enterScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:0>"}, {"com.google.javascript.jscomp.ReferenceCollectingCallback", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:1>", "<sample:1>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<sample:4>", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:5>", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:11>", "<null>", "<sample:9>"}, false, 9, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:8>", "<sample:7>"}, {"com.google.javascript.jscomp.ReferenceCollectingCallback", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:3>", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<null>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<null>", "<sample:3>", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<null>", "<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferenceCollection", "com.google.javascript.jscomp.Scope$Var", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:11>", "<null>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<null>"}, {"com.google.javascript.jscomp.ReferenceCollectingCallback", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:8>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
}
