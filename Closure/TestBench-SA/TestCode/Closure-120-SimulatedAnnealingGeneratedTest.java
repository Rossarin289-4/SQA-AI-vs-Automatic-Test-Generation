package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getScope", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:2>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getScope", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:5>", "<sample:1>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "hotSwapScript", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<null>", "<sample:3>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getAllSymbols", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "hotSwapScript", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:4>"}, {"com.google.javascript.jscomp.ReferenceCollectingCallback", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<null>", "<sample:3>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "hotSwapScript", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferences", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<null>"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<sample:4>", "<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "hotSwapScript", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<sample:3>", "<sample:3>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "hotSwapScript", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "hotSwapScript", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<sample:0>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "hotSwapScript", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<sample:2>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "hotSwapScript", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:9>", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "getAllSymbols", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<sample:6>", "<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "getScope", "com.google.javascript.jscomp.Scope$Var", "<sample:2>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getAllSymbols", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<null>", "<sample:4>", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getAllSymbols", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<null>", "<sample:4>", "<sample:4>"}, {"com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferences", "com.google.javascript.jscomp.Scope$Var", "<sample:7>"}}, 2), new String[][]{{"iterator", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getAllSymbols", new String[]{}, new String[]{}, false), new String[][]{{"add", "java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getScope", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:1>", "<sample:2>"}, {"com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferences", "com.google.javascript.jscomp.Scope$Var", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getScope", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:3>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "hotSwapScript", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:10>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getScope", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<null>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "hotSwapScript", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:10>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferences", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "exitScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "enterScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:9>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getAllSymbols", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "enterScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:1>"}}, 1), new String[][]{{"containsAll", "java.util.Collection", "4"}, {"clear", "", "4"}, {"addAll", "java.util.Collection", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<null>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<sample:1>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getAllSymbols", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<null>", "<sample:6>"}}), new String[][]{{"remove", "java.lang.Object", "6"}, {"removeAll", "java.util.Collection", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<sample:2>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:8>", "<sample:0>", "<sample:3>"}, false, 13, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "hotSwapScript", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:2>"}, {"com.google.javascript.jscomp.ReferenceCollectingCallback", "getAllSymbols", ""}, {"com.google.javascript.jscomp.ReferenceCollectingCallback", "getAllSymbols", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:3>"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<sample:2>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "getAllSymbols", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferences", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<null>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "enterScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:6>"}, false, 15, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "hotSwapScript", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:5>"}, {"com.google.javascript.jscomp.ReferenceCollectingCallback", "enterScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:5>"}, {"com.google.javascript.jscomp.ReferenceCollectingCallback", "enterScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getAllSymbols", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "getAllSymbols", ""}, {"com.google.javascript.jscomp.ReferenceCollectingCallback", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<null>", "<sample:1>", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferences", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:2>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<null>", "<sample:2>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:3>", "<sample:1>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "enterScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:3>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "exitScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "getAllSymbols", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:0>", "<sample:5>"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<null>", "<sample:5>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "enterScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "exitScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:4>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "exitScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:5>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getAllSymbols", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "getScope", "com.google.javascript.jscomp.Scope$Var", "<sample:7>"}}), new String[][]{{"isEmpty", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getAllSymbols", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "getScope", "com.google.javascript.jscomp.Scope$Var", "<sample:7>"}, {"com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferences", "com.google.javascript.jscomp.Scope$Var", "<sample:4>"}}, 3), new String[][]{{"isEmpty", "", "4"}, {"containsAll", "java.util.Collection", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getAllSymbols", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "getScope", "com.google.javascript.jscomp.Scope$Var", "<sample:7>"}, {"com.google.javascript.jscomp.ReferenceCollectingCallback", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:3>", "<sample:3>"}, {"com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferences", "com.google.javascript.jscomp.Scope$Var", "<sample:4>"}}, 3), new String[][]{{"isEmpty", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getAllSymbols", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:3>", "<sample:3>"}, {"com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferences", "com.google.javascript.jscomp.Scope$Var", "<sample:4>"}}, 3), new String[][]{{"isEmpty", "", "4"}, {"add", "java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getAllSymbols", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "hotSwapScript", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<null>"}, {"com.google.javascript.jscomp.ReferenceCollectingCallback", "hotSwapScript", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:6>"}}, 1), new String[][]{{"containsAll", "java.util.Collection", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getAllSymbols", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:9>", "<sample:3>"}, {"com.google.javascript.jscomp.ReferenceCollectingCallback", "hotSwapScript", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:2>"}, {"com.google.javascript.jscomp.ReferenceCollectingCallback", "hotSwapScript", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:5>"}}, 2), new String[][]{{"retainAll", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getAllSymbols", new String[]{}, new String[]{}, false, 21, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:9>", "<sample:3>"}, {"com.google.javascript.jscomp.ReferenceCollectingCallback", "hotSwapScript", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:2>"}, {"com.google.javascript.jscomp.ReferenceCollectingCallback", "hotSwapScript", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:5>"}}, 2), new String[][]{{"retainAll", "java.util.Collection", "1"}, {"isEmpty", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferences", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "getAllSymbols", ""}, {"com.google.javascript.jscomp.ReferenceCollectingCallback", "enterScope", "com.google.javascript.jscomp.NodeTraversal", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getAllSymbols", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:7>"}, {"com.google.javascript.jscomp.ReferenceCollectingCallback", "exitScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getScope", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:7>"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getScope", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferences", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:0>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<sample:9>", "<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:9>"}, {"com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferences", "com.google.javascript.jscomp.Scope$Var", "<sample:4>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getAllSymbols", new String[]{}, new String[]{}, false, 11, new String[][]{}), new String[][]{{"size", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferences", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferences", "com.google.javascript.jscomp.Scope$Var", "<sample:1>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<null>", "<sample:2>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "getScope", "com.google.javascript.jscomp.Scope$Var", "<null>"}, {"com.google.javascript.jscomp.ReferenceCollectingCallback", "hotSwapScript", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:9>", "<sample:9>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:9>", "<null>", "<sample:9>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:3>", "<sample:0>"}, {"com.google.javascript.jscomp.ReferenceCollectingCallback", "hotSwapScript", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:9>", "<sample:9>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferences", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:4>", "<sample:4>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getAllSymbols", new String[]{}, new String[]{}, false), new String[][]{{"retainAll", "java.util.Collection", "4"}, {"iterator", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getAllSymbols", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3), new String[][]{{"retainAll", "java.util.Collection", "4"}, {"iterator", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getAllSymbols", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3), new String[][]{{"retainAll", "java.util.Collection", "4"}, {"iterator", "", "6"}, {"next", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getScope", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "enterScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:4>"}, {"com.google.javascript.jscomp.ReferenceCollectingCallback", "enterScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:3>"}, {"com.google.javascript.jscomp.ReferenceCollectingCallback", "hotSwapScript", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:10>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<null>", "<sample:0>"}, false, 13, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getAllSymbols", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "enterScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:2>"}, {"com.google.javascript.jscomp.ReferenceCollectingCallback", "getAllSymbols", ""}, {"com.google.javascript.jscomp.ReferenceCollectingCallback", "getScope", "com.google.javascript.jscomp.Scope$Var", "<null>"}}, 1), new String[][]{{"iterator", "", "7"}, {"next", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getAllSymbols", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "enterScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:2>"}, {"com.google.javascript.jscomp.ReferenceCollectingCallback", "getAllSymbols", ""}, {"com.google.javascript.jscomp.ReferenceCollectingCallback", "getScope", "com.google.javascript.jscomp.Scope$Var", "<null>"}}), new String[][]{{"iterator", "", "7"}, {"next", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getAllSymbols", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"iterator", "", "4"}, {"hasNext", "", "1"}, {"remove", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getScope", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<null>", "<sample:0>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
}
