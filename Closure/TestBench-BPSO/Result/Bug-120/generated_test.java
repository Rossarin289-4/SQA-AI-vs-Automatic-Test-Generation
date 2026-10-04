package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getAllSymbols", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "hotSwapScript", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "hotSwapScript", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:0>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "getAllSymbols", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferences", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getAllSymbols", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "exitScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:2>"}}), new String[][]{{"containsAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "hotSwapScript", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:9>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "enterScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferences", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:4>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:1>", "<sample:6>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "getAllSymbols", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:8>", "<sample:2>"}, false, 4, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<sample:11>", "<null>"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "hotSwapScript", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<sample:2>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:4>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getScope", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:9>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "hotSwapScript", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<sample:11>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "getScope", "com.google.javascript.jscomp.Scope$Var", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getScope", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "hotSwapScript", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:6>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<sample:2>", "<sample:2>"}, false, 2, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getScope", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<null>", "<sample:8>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:8>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferences", "com.google.javascript.jscomp.Scope$Var", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "enterScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:3>"}, {"com.google.javascript.jscomp.ReferenceCollectingCallback", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "enterScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferences", "com.google.javascript.jscomp.Scope$Var", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getScope", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<null>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "exitScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "hotSwapScript", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getAllSymbols", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "getAllSymbols", ""}, {"com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferences", "com.google.javascript.jscomp.Scope$Var", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "exitScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "getScope", "com.google.javascript.jscomp.Scope$Var", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "enterScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:1>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getAllSymbols", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "hotSwapScript", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:11>", "<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "enterScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getAllSymbols", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"addAll", "java.util.Collection", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferences", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "getScope", "com.google.javascript.jscomp.Scope$Var", "<sample:3>"}, {"com.google.javascript.jscomp.ReferenceCollectingCallback", "exitScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:4>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "exitScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:10>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "getAllSymbols", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:11>", "<sample:7>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "exitScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:7>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getAllSymbols", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "enterScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:6>"}, {"com.google.javascript.jscomp.ReferenceCollectingCallback", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:15>", "<sample:4>"}}, 1), new String[][]{{"addAll", "java.util.Collection", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<sample:3>", "<sample:3>"}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getAllSymbols", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "getAllSymbols", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "hotSwapScript", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getAllSymbols", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferences", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:8>", "<sample:11>", "<sample:11>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferences", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferences", "com.google.javascript.jscomp.Scope$Var", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<sample:5>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:8>", "<sample:7>", "<sample:11>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "enterScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getScope", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "getAllSymbols", ""}, {"com.google.javascript.jscomp.ReferenceCollectingCallback", "getAllSymbols", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getAllSymbols", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:6>", "<sample:4>"}}), new String[][]{{"size", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<sample:2>", "<sample:3>"}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getAllSymbols", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "hotSwapScript", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:5>"}, {"com.google.javascript.jscomp.ReferenceCollectingCallback", "getScope", "com.google.javascript.jscomp.Scope$Var", "<sample:8>"}}, 1), new String[][]{{"contains", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getAllSymbols", new String[]{}, new String[]{}, false), new String[][]{{"isEmpty", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getAllSymbols", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferences", "com.google.javascript.jscomp.Scope$Var", "<sample:0>"}, {"com.google.javascript.jscomp.ReferenceCollectingCallback", "hotSwapScript", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:6>"}}, 2), new String[][]{{"retainAll", "java.util.Collection", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "enterScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:7>"}, {"com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferences", "com.google.javascript.jscomp.Scope$Var", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getScope", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<null>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "enterScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<null>", "<sample:2>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "getAllSymbols", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getAllSymbols", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "getScope", "com.google.javascript.jscomp.Scope$Var", "<sample:0>"}}, 2), new String[][]{{"addAll", "java.util.Collection", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<null>", "<sample:2>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "enterScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getAllSymbols", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2), new String[][]{{"iterator", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getAllSymbols", new String[]{}, new String[]{}, false), new String[][]{{"add", "java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<null>", "<sample:0>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getScope", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:2>", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferences", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "hotSwapScript", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:7>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getAllSymbols", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3), new String[][]{{"containsAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getAllSymbols", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferences", "com.google.javascript.jscomp.Scope$Var", "<sample:5>"}}, 3), new String[][]{{"iterator", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getAllSymbols", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "exitScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:4>"}}, 1), new String[][]{{"isEmpty", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<null>", "<sample:9>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferences", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "getAllSymbols", ""}, {"com.google.javascript.jscomp.ReferenceCollectingCallback", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:3>", "<sample:0>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<null>", "<sample:6>"}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getAllSymbols", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<null>", "<sample:6>"}}, 3), new String[][]{{"isEmpty", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getAllSymbols", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "hotSwapScript", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:4>"}}, 2), new String[][]{{"size", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getScope", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "getScope", "com.google.javascript.jscomp.Scope$Var", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getAllSymbols", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "getAllSymbols", ""}}, 1), new String[][]{{"removeAll", "java.util.Collection", "5"}, {"clear", "", "6"}, {"iterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getAllSymbols", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:5>", "<sample:10>"}}, 1), new String[][]{{"size", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferences", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<null>"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getAllSymbols", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:11>", "<sample:4>"}, {"com.google.javascript.jscomp.ReferenceCollectingCallback", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:8>", "<sample:3>"}}), new String[][]{{"iterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getAllSymbols", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"iterator", "", "3"}, {"hasNext", "", "2"}, {"next", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getAllSymbols", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:3>"}, {"com.google.javascript.jscomp.ReferenceCollectingCallback", "getScope", "com.google.javascript.jscomp.Scope$Var", "<sample:1>"}}), new String[][]{{"iterator", "", "0"}, {"remove", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<null>", "<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "hotSwapScript", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:9>", "<sample:5>"}, {"com.google.javascript.jscomp.ReferenceCollectingCallback", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:6>", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getAllSymbols", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferences", "com.google.javascript.jscomp.Scope$Var", "<sample:9>"}, {"com.google.javascript.jscomp.ReferenceCollectingCallback", "getScope", "com.google.javascript.jscomp.Scope$Var", "<sample:2>"}}, 2), new String[][]{{"isEmpty", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getAllSymbols", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "hotSwapScript", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:3>"}, {"com.google.javascript.jscomp.ReferenceCollectingCallback", "exitScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:7>"}}, 1), new String[][]{{"iterator", "", "7"}, {"remove", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<null>", "<sample:2>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getAllSymbols", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"iterator", "", "1"}, {"next", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getAllSymbols", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "exitScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:2>"}}, 1), new String[][]{{"iterator", "", "4"}, {"next", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<null>", "<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "getAllSymbols", ""}, {"com.google.javascript.jscomp.ReferenceCollectingCallback", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:0>", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getAllSymbols", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"iterator", "", "0"}, {"next", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
}
