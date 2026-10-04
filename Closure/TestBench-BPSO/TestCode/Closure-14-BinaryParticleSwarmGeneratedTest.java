package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:7>"}, false, 6, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "computeFollowNode", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "isContinueStructure", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "isBreakTarget", new String[]{"com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:1>", "{\"a\":1}0xFFFFFFFF"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "getCfg", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "isBreakStructure", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:3>", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "computeFallThrough", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "isContinueStructure", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "getCatchHandlerForBlock", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "computeFallThrough", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, true, 0, null, 3), new String[][]{{"getExistingIntProp", "int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "mayThrowException", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "getExceptionHandler", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:9>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:8>", "<null>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<sample:2>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<null>", "<sample:1>"}, false, 2, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "computeFallThrough", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:9>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "computeFollowNode", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "computeFollowNode", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.ControlFlowAnalysis"}, new String[]{"<sample:4>", "<sample:4>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:9>", "<sample:8>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.ControlFlowAnalysis", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<null>", "<sample:11>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<sample:8>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.ControlFlowAnalysis", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:7>", "<sample:8>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ControlFlowAnalysis", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:9>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<sample:5>", "<sample:10>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ControlFlowAnalysis", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:8>"}, {"com.google.javascript.jscomp.ControlFlowAnalysis", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:6>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "computeFallThrough", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, true), new String[][]{{"children", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "computeFallThrough", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, true), new String[][]{{"getCharno", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "isContinueStructure", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "mayThrowException", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "computeFollowNode", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.ControlFlowAnalysis"}, new String[]{"<sample:3>", "<sample:0>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "mayThrowException", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "computeFollowNode", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "getCfg", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "isBreakTarget", new String[]{"com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:0>", "\u00e90xFFFFFFFF{\"a\":1}0xFFFFFFFF"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "computeFallThrough", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, true, 0, null, 3), new String[][]{{"isAssignAdd", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "computeFollowNode", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.ControlFlowAnalysis"}, new String[]{"<null>", "<sample:7>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "getCatchHandlerForBlock", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:1>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<sample:7>", "<sample:6>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.ControlFlowAnalysis", "getCfg", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "computeFallThrough", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, true, 0, null, 1), new String[][]{{"getLineno", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "computeFallThrough", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:9>"}, true), new String[][]{{"getParent", "", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:10>", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ControlFlowAnalysis", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:9>", "<sample:3>"}, {"com.google.javascript.jscomp.ControlFlowAnalysis", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:4>", "<sample:12>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "computeFallThrough", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, true), new String[][]{{"getExistingIntProp", "int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "computeFallThrough", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, true), new String[][]{{"isBlock", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:9>", "<sample:1>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.ControlFlowAnalysis", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<null>", "<sample:9>", "<sample:6>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "computeFollowNode", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:8>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:9>", "<sample:4>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.ControlFlowAnalysis", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:8>", "<sample:9>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<sample:5>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ControlFlowAnalysis", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:4>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "computeFallThrough", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, true, 0, null, 1), new String[][]{{"cloneNode", "", "1"}, {"detachFromParent", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "computeFollowNode", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.ControlFlowAnalysis"}, new String[]{"<sample:11>", "<sample:5>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "computeFollowNode", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.ControlFlowAnalysis"}, new String[]{"<sample:9>", "<sample:2>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "computeFollowNode", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:0>", "<sample:5>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.ControlFlowAnalysis", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:1>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "computeFallThrough", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, true), new String[][]{{"addChildToFront", "com.google.javascript.rhino.Node", "0"}, {"getJsDocBuilderForNode", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$FileLevelJsDocBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "computeFallThrough", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, true, 0, null, 1), new String[][]{{"addChildToFront", "com.google.javascript.rhino.Node", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$NumberNode", actual.getClass().getName());
  assertEquals("NUMBER -Infinity {getCharno=-1, getChildCount=1, getDouble=-Infinity, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getSourcePosit...#337#-848993309", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "computeFallThrough", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("ERROR {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getS...#349#637856945", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "isBreakStructure", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:8>", "false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<sample:4>", "<sample:8>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.ControlFlowAnalysis", "getCfg", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "getCfg", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "computeFallThrough", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, true), new String[][]{{"copyInformationFromForTree", "com.google.javascript.rhino.Node", "3"}, {"hasChildren", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:6>", "<sample:11>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ControlFlowAnalysis", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:4>", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "mayThrowException", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "isContinueStructure", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:4>", "<sample:2>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.ControlFlowAnalysis", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:11>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "getCatchHandlerForBlock", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:15>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:11>", "<sample:11>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ControlFlowAnalysis", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:8>", "<sample:0>"}, {"com.google.javascript.jscomp.ControlFlowAnalysis", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ControlFlowAnalysis", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<sample:5>", "<sample:1>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.ControlFlowAnalysis", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<sample:8>", "<sample:9>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ControlFlowAnalysis", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:3>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "isBreakStructure", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<null>", "true"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<sample:2>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.ControlFlowAnalysis", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<null>", "<sample:14>", "<sample:5>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "computeFollowNode", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:14>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ControlFlowAnalysis", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:14>", "<sample:14>"}, {"com.google.javascript.jscomp.ControlFlowAnalysis", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:9>", "<sample:2>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<sample:17>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.ControlFlowAnalysis", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:6>", "<sample:5>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "getCfg", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.ControlFlowAnalysis", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:11>", "<sample:17>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.ControlFlowAnalysis$AstControlFlowGraph", actual.getClass().getName());
  assertEquals("{getName=LinkedGraph, isDirected=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<sample:11>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.ControlFlowAnalysis", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "getCatchHandlerForBlock", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "isContinueStructure", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<sample:3>", "<sample:9>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ControlFlowAnalysis", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:1>"}, {"com.google.javascript.jscomp.ControlFlowAnalysis", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<null>", "<sample:9>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<sample:15>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ControlFlowAnalysis", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "isBreakStructure", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:11>", "true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "computeFollowNode", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "computeFallThrough", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:9>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "getExceptionHandler", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "isBreakTarget", new String[]{"com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:5>", "01\u00e901E-5"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "getCfg", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.ControlFlowAnalysis", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:15>", "<sample:9>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<sample:16>", "<sample:0>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.ControlFlowAnalysis", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:11>", "<sample:9>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "isBreakTarget", new String[]{"com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<null>", "0xFFFFFFFFa"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "getCatchHandlerForBlock", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "getCfg", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.ControlFlowAnalysis", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:5>"}}), new String[][]{{"getOptionalNodeComparator", "boolean", "5"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "getCfg", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.ControlFlowAnalysis", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:8>", "<sample:3>"}}), new String[][]{{"getGraphvizNodes", "", "3"}, {"retainAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<sample:16>", "<sample:6>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.ControlFlowAnalysis", "getCfg", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "getCfg", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.ControlFlowAnalysis", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:8>", "<sample:7>"}}, 2), new String[][]{{"getInEdges", "java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "getCfg", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.ControlFlowAnalysis", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:7>"}}), new String[][]{{"getDirectedGraphNode", "java.lang.Object", "4"}, {"getOutEdges", "java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "computeFallThrough", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, true, 0, null, 1), new String[][]{{"hasChildren", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "computeFollowNode", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "computeFallThrough", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:14>"}, true, 0, null, 3), new String[][]{{"addChildrenAfter", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "getExceptionHandler", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:14>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "computeFallThrough", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, true, 0, null, 2), new String[][]{{"getInputId", "", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "computeFallThrough", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "isBreakStructure", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:3>", "false"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "getCfg", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.ControlFlowAnalysis", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:14>"}, {"com.google.javascript.jscomp.ControlFlowAnalysis", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:8>"}}), new String[][]{{"clearEdgeAnnotations", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "computeFallThrough", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, true, 0, null, 3), new String[][]{{"getSourcePosition", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "getCfg", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.ControlFlowAnalysis", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:2>"}}, 3), new String[][]{{"getNodes", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "computeFallThrough", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:17>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("OBJECTLIT {getCharno=-1, getChildCount=3, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, ...#351#938779954", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:8>", "<sample:17>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ControlFlowAnalysis", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:8>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "computeFallThrough", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:15>"}, true, 0, null, 2), new String[][]{{"children", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$SiblingNodeIterable", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "getCfg", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.ControlFlowAnalysis", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:20>", "<sample:18>"}}), new String[][]{{"getDirectedSuccNodes", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "computeFallThrough", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:9>"}, true, 0, null, 2), new String[][]{{"getString", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "isBreakStructure", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:14>", "false"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "mayThrowException", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "mayThrowException", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "computeFallThrough", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, true, 0, null, 2), new String[][]{{"getType", "", "5"}, {"isArrayLit", "", "4"}, {"addChildBefore", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ControlFlowAnalysis", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:15>"}, {"com.google.javascript.jscomp.ControlFlowAnalysis", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:5>", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "isBreakTarget", new String[]{"com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:14>", "12345678901234567"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "getCfg", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.ControlFlowAnalysis", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:6>"}, {"com.google.javascript.jscomp.ControlFlowAnalysis", "getCfg", ""}}), new String[][]{{"getNeighborNodes", "java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<sample:5>", "<sample:4>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.ControlFlowAnalysis", "getCfg", ""}, {"com.google.javascript.jscomp.ControlFlowAnalysis", "getCfg", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "computeFallThrough", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("ERROR {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getS...#349#637856945", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:9>", "<sample:2>", "<sample:5>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.ControlFlowAnalysis", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:5>"}, {"com.google.javascript.jscomp.ControlFlowAnalysis", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:16>", "<sample:1>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "mayThrowException", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:15>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "getCfg", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.ControlFlowAnalysis", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:14>"}, {"com.google.javascript.jscomp.ControlFlowAnalysis", "getCfg", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.ControlFlowAnalysis$AstControlFlowGraph", actual.getClass().getName());
  assertEquals("{getName=LinkedGraph, isDirected=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "getCfg", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.ControlFlowAnalysis", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:14>", "<sample:9>"}, {"com.google.javascript.jscomp.ControlFlowAnalysis", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:5>"}}), new String[][]{{"isImplicitReturn", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:11>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ControlFlowAnalysis", "getCfg", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<sample:9>", "<sample:16>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.ControlFlowAnalysis", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:9>", "<sample:14>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "getExceptionHandler", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:8>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "computeFallThrough", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$NumberNode", actual.getClass().getName());
  assertEquals("NUMBER -Infinity {getCharno=-1, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getSourcePosit...#339#1917934166", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "computeFallThrough", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, true, 0, null, 3), new String[][]{{"getParent", "", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "getCfg", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.ControlFlowAnalysis", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:9>", "<sample:7>"}, {"com.google.javascript.jscomp.ControlFlowAnalysis", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.ControlFlowAnalysis$AstControlFlowGraph", actual.getClass().getName());
  assertEquals("{getName=LinkedGraph, isDirected=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "computeFallThrough", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "computeFallThrough", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:16>"}, true, 0, null, 1), new String[][]{{"getQualifiedName", "", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<sample:18>", "<sample:6>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.ControlFlowAnalysis", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:0>", "<sample:8>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "getCfg", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.ControlFlowAnalysis", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:14>"}}), new String[][]{{"newSubGraph", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.graph.Graph$SimpleSubGraph", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "computeFollowNode", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.ControlFlowAnalysis"}, new String[]{"<null>", "<sample:0>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "getCfg", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.ControlFlowAnalysis", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:16>", "<sample:5>"}}, 3), new String[][]{{"isImplicitReturn", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "5"}, {"disconnect", "java.lang.Object,java.lang.Object", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "computeFallThrough", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:14>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BLOCK {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getS...#350#-117756380", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "getCfg", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.ControlFlowAnalysis", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:8>", "<sample:0>"}}, 1), new String[][]{{"getDirectedPredNodes", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "getCfg", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.ControlFlowAnalysis", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:4>"}, {"com.google.javascript.jscomp.ControlFlowAnalysis", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:17>", "<sample:2>"}}, 2), new String[][]{{"clearEdgeAnnotations", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "isBreakStructure", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:14>", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:17>", "<sample:15>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "isBreakStructure", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<null>", "true"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "getCfg", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.ControlFlowAnalysis", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:6>"}}, 1), new String[][]{{"getEdges", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[NUMBER -Infinity -> null]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "getExceptionHandler", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "computeFollowNode", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.ControlFlowAnalysis"}, new String[]{"<null>", "<sample:4>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "computeFallThrough", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "getCfg", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.ControlFlowAnalysis", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:18>", "<sample:11>"}, {"com.google.javascript.jscomp.ControlFlowAnalysis", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:9>"}}, 2), new String[][]{{"getGraphvizNodes", "", "5"}, {"addAll", "int,java.util.Collection", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "getCfg", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.ControlFlowAnalysis", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:9>", "<sample:1>"}}, 3), new String[][]{{"getNodes", "", "1"}, {"iterator", "", "7"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "isBreakTarget", new String[]{"com.google.javascript.rhino.Node", "java.lang.String"}, new String[]{"<sample:9>", "abc"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "getCatchHandlerForBlock", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:14>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "isBreakStructure", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<null>", "false"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<sample:3>", "<sample:16>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ControlFlowAnalysis", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:1>", "<sample:9>"}, {"com.google.javascript.jscomp.ControlFlowAnalysis", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "getCfg", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.ControlFlowAnalysis", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:12>", "<sample:3>"}}, 3), new String[][]{{"newSubGraph", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.graph.Graph$SimpleSubGraph", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:8>", "<null>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.ControlFlowAnalysis", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:11>", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "getCfg", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.ControlFlowAnalysis", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:14>"}}, 3), new String[][]{{"isImplicitReturn", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<sample:16>", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ControlFlowAnalysis", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:17>", "<sample:7>"}, {"com.google.javascript.jscomp.ControlFlowAnalysis", "getCfg", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "getCfg", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.ControlFlowAnalysis", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:5>"}}, 1), new String[][]{{"isConnected", "java.lang.Object,java.lang.Object,java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:7>", "<sample:18>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.ControlFlowAnalysis", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:17>", "<sample:16>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "isContinueStructure", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "computeFollowNode", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.ControlFlowAnalysis"}, new String[]{"<null>", "<sample:6>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "isContinueStructure", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "isContinueStructure", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "isBreakStructure", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<null>", "false"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "mayThrowException", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "getCfg", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.ControlFlowAnalysis", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:0>"}}, 2), new String[][]{{"getGraphvizNodes", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[null, ERROR]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "getCatchHandlerForBlock", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:14>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "getCfg", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.ControlFlowAnalysis", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:0>"}, {"com.google.javascript.jscomp.ControlFlowAnalysis", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:5>", "<sample:8>"}}, 2), new String[][]{{"getDirectedPredNodes", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "getCatchHandlerForBlock", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:14>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "getCfg", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.ControlFlowAnalysis", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:2>"}, {"com.google.javascript.jscomp.ControlFlowAnalysis", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:7>"}}, 1), new String[][]{{"getName", "", "3"}, {"getEntry", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.graph.LinkedDirectedGraph$AnnotatedLinkedDirectedGraphNode", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "getCfg", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.ControlFlowAnalysis", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:18>", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.ControlFlowAnalysis$AstControlFlowGraph", actual.getClass().getName());
  assertEquals("{getName=LinkedGraph, isDirected=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "getCfg", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.ControlFlowAnalysis", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:1>"}}), new String[][]{{"getOptionalNodeComparator", "boolean", "6"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ControlFlowAnalysis", "com.google.javascript.jscomp.ControlFlowAnalysis", "isBreakStructure", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:14>", "true"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
}
