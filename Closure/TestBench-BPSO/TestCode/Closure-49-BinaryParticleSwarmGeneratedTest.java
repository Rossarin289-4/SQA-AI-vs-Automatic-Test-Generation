package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MakeDeclaredNamesUnique", "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "exitScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:1>"}, false, 4, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MakeDeclaredNamesUnique", "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "enterScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:3>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MakeDeclaredNamesUnique", "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "exitScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MakeDeclaredNamesUnique", "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "enterScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:6>"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MakeDeclaredNamesUnique", "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "exitScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:4>"}, false, 4, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MakeDeclaredNamesUnique", "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<sample:6>", "<sample:8>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.MakeDeclaredNamesUnique", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:5>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MakeDeclaredNamesUnique", "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "getContextualRenameInverter", new String[]{"com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenameInverter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MakeDeclaredNamesUnique", "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "getContextualRenameInverter", new String[]{"com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:7>"}, true), new String[][]{{"visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenameInverter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MakeDeclaredNamesUnique", "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<sample:3>", "<sample:3>"}, false, 3, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MakeDeclaredNamesUnique", "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "getContextualRenameInverter", new String[]{"com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:5>"}, true), new String[][]{{"process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "5"}, {"visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenameInverter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MakeDeclaredNamesUnique", "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "getContextualRenameInverter", new String[]{"com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:3>"}, true), new String[][]{{"shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "0"}, {"shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MakeDeclaredNamesUnique", "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<sample:8>", "<sample:5>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.MakeDeclaredNamesUnique", "exitScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MakeDeclaredNamesUnique", "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "getContextualRenameInverter", new String[]{"com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:5>"}, true, 0, null, 1), new String[][]{{"visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenameInverter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MakeDeclaredNamesUnique", "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "exitScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MakeDeclaredNamesUnique", "exitScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:2>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MakeDeclaredNamesUnique", "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "getContextualRenameInverter", new String[]{"com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:4>"}, true, 0, null, 3), new String[][]{{"process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenameInverter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MakeDeclaredNamesUnique", "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "enterScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MakeDeclaredNamesUnique", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:1>", "<sample:7>"}, {"com.google.javascript.jscomp.MakeDeclaredNamesUnique", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:8>", "<sample:3>", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MakeDeclaredNamesUnique", "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "exitScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:6>"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MakeDeclaredNamesUnique", "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "exitScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<null>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MakeDeclaredNamesUnique", "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<sample:0>", "<sample:9>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.MakeDeclaredNamesUnique", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:3>", "<sample:8>"}, {"com.google.javascript.jscomp.MakeDeclaredNamesUnique", "exitScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:0>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MakeDeclaredNamesUnique", "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<sample:1>", "<sample:1>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MakeDeclaredNamesUnique", "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "getContextualRenameInverter", new String[]{"com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:0>"}, true, 0, null, 2), new String[][]{{"visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenameInverter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MakeDeclaredNamesUnique", "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "getContextualRenameInverter", new String[]{"com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:3>"}, true, 0, null, 3), new String[][]{{"process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "1"}, {"shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MakeDeclaredNamesUnique", "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<sample:4>", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MakeDeclaredNamesUnique", "enterScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MakeDeclaredNamesUnique", "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "enterScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MakeDeclaredNamesUnique", "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:9>", "<null>", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MakeDeclaredNamesUnique", "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "exitScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<null>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.MakeDeclaredNamesUnique", "exitScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:3>"}, {"com.google.javascript.jscomp.MakeDeclaredNamesUnique", "enterScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MakeDeclaredNamesUnique", "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<sample:1>", "<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MakeDeclaredNamesUnique", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:3>", "<sample:8>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MakeDeclaredNamesUnique", "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "getContextualRenameInverter", new String[]{"com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<null>"}, true, 0, null, 1), new String[][]{{"shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MakeDeclaredNamesUnique", "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<sample:7>", "<sample:3>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.MakeDeclaredNamesUnique", "exitScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:5>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MakeDeclaredNamesUnique", "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<null>", "<sample:8>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MakeDeclaredNamesUnique", "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<null>", "<null>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.MakeDeclaredNamesUnique", "exitScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MakeDeclaredNamesUnique", "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "getContextualRenameInverter", new String[]{"com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:5>"}, true, 0, null, 2), new String[][]{{"shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "0"}, {"shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MakeDeclaredNamesUnique", "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "exitScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<null>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.MakeDeclaredNamesUnique", "enterScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:2>"}, {"com.google.javascript.jscomp.MakeDeclaredNamesUnique", "exitScope", "com.google.javascript.jscomp.NodeTraversal", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MakeDeclaredNamesUnique", "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<null>", "<sample:3>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.MakeDeclaredNamesUnique", "exitScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MakeDeclaredNamesUnique", "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<null>", "<sample:3>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MakeDeclaredNamesUnique", "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<null>", "<sample:6>"}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MakeDeclaredNamesUnique", "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<null>", "<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MakeDeclaredNamesUnique", "com.google.javascript.jscomp.MakeDeclaredNamesUnique", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<null>", "<sample:6>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
}
