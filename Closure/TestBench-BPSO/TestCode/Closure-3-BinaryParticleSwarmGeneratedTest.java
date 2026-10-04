package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FlowSensitiveInlineVariables", "com.google.javascript.jscomp.FlowSensitiveInlineVariables", "exitScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:0>"}, false, 6, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FlowSensitiveInlineVariables", "com.google.javascript.jscomp.FlowSensitiveInlineVariables", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.FlowSensitiveInlineVariables", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:4>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FlowSensitiveInlineVariables", "com.google.javascript.jscomp.FlowSensitiveInlineVariables", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<null>", "<null>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FlowSensitiveInlineVariables", "com.google.javascript.jscomp.FlowSensitiveInlineVariables", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<sample:7>", "<sample:6>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FlowSensitiveInlineVariables", "com.google.javascript.jscomp.FlowSensitiveInlineVariables", "enterScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:0>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FlowSensitiveInlineVariables", "com.google.javascript.jscomp.FlowSensitiveInlineVariables", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<sample:5>", "<sample:5>"}, false, 6, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FlowSensitiveInlineVariables", "com.google.javascript.jscomp.FlowSensitiveInlineVariables", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<null>", "<sample:8>"}, false, 6, new String[][]{}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FlowSensitiveInlineVariables", "com.google.javascript.jscomp.FlowSensitiveInlineVariables", "enterScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:5>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FlowSensitiveInlineVariables", "com.google.javascript.jscomp.FlowSensitiveInlineVariables", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:3>", "<sample:3>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FlowSensitiveInlineVariables", "com.google.javascript.jscomp.FlowSensitiveInlineVariables", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:3>"}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FlowSensitiveInlineVariables", "com.google.javascript.jscomp.FlowSensitiveInlineVariables", "enterScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FlowSensitiveInlineVariables", "com.google.javascript.jscomp.FlowSensitiveInlineVariables", "exitScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:3>"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FlowSensitiveInlineVariables", "com.google.javascript.jscomp.FlowSensitiveInlineVariables", "enterScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:5>"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FlowSensitiveInlineVariables", "com.google.javascript.jscomp.FlowSensitiveInlineVariables", "enterScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.FlowSensitiveInlineVariables", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:0>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FlowSensitiveInlineVariables", "com.google.javascript.jscomp.FlowSensitiveInlineVariables", "exitScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.FlowSensitiveInlineVariables", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:4>", "<sample:5>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FlowSensitiveInlineVariables", "com.google.javascript.jscomp.FlowSensitiveInlineVariables", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:8>", "<sample:4>", "<sample:1>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FlowSensitiveInlineVariables", "com.google.javascript.jscomp.FlowSensitiveInlineVariables", "enterScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<null>"}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FlowSensitiveInlineVariables", "com.google.javascript.jscomp.FlowSensitiveInlineVariables", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:4>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.FlowSensitiveInlineVariables", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:5>"}, {"com.google.javascript.jscomp.FlowSensitiveInlineVariables", "enterScope", "com.google.javascript.jscomp.NodeTraversal", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FlowSensitiveInlineVariables", "com.google.javascript.jscomp.FlowSensitiveInlineVariables", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:9>", "<sample:5>", "<sample:1>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.FlowSensitiveInlineVariables", "enterScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:2>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FlowSensitiveInlineVariables", "com.google.javascript.jscomp.FlowSensitiveInlineVariables", "exitScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.FlowSensitiveInlineVariables", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:5>", "<sample:9>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FlowSensitiveInlineVariables", "com.google.javascript.jscomp.FlowSensitiveInlineVariables", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.FlowSensitiveInlineVariables", "exitScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FlowSensitiveInlineVariables", "com.google.javascript.jscomp.FlowSensitiveInlineVariables", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<sample:3>", "<sample:4>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.FlowSensitiveInlineVariables", "enterScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FlowSensitiveInlineVariables", "com.google.javascript.jscomp.FlowSensitiveInlineVariables", "enterScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.FlowSensitiveInlineVariables", "exitScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FlowSensitiveInlineVariables", "com.google.javascript.jscomp.FlowSensitiveInlineVariables", "enterScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
}
