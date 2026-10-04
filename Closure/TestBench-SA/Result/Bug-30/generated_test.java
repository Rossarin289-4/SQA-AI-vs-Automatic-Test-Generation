package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "computeEscaped", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set", "com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:4>", "<sample:2>", "<sample:3>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "computeEscaped", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set", "com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:3>", "<sample:2>", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "computeEscaped", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set", "com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:7>", "<empty>", "<sample:1>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef"}, new String[]{"<sample:2>", "<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "flowThrough", "java.lang.Object,com.google.javascript.jscomp.graph.LatticeElement", "<i:0>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef"}, new String[]{"<sample:5>", "<sample:6>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef"}, new String[]{"<sample:6>", "<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "flow", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "flow", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "initialize", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "getDef", new String[]{"java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"[1,2]", "<sample:1>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "flow", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "analyze", new String[]{"int"}, new String[]{"-1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.DataFlowAnalysis$MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "analyze", new String[]{"int"}, new String[]{"1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FlowSensitiveInlineVariables", "com.google.javascript.jscomp.FlowSensitiveInlineVariables", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<null>", "<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.FlowSensitiveInlineVariables", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<null>", "<sample:0>", "<sample:2>"}, {"com.google.javascript.jscomp.FlowSensitiveInlineVariables", "exitScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:0>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "flowThrough", new String[]{"java.lang.Object", "com.google.javascript.jscomp.graph.LatticeElement"}, new String[]{"<sample:1>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FlowSensitiveInlineVariables", "com.google.javascript.jscomp.FlowSensitiveInlineVariables", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:4>", "<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.FlowSensitiveInlineVariables", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<null>", "<sample:3>", "<sample:2>"}, {"com.google.javascript.jscomp.FlowSensitiveInlineVariables", "exitScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:0>"}, {"com.google.javascript.jscomp.FlowSensitiveInlineVariables", "enterScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:2>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FlowSensitiveInlineVariables", "com.google.javascript.jscomp.FlowSensitiveInlineVariables", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "computeEscaped", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set", "com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:0>", "<sample:2>", "<sample:2>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "getExitLatticeElement", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "getExitLatticeElement", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "initialize", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "getExitLatticeElement", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "initialize", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "getExitLatticeElement", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "initialize", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "getExitLatticeElement", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "initialize", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "dependsOnOuterScopeVars", new String[]{"java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"/a/b", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "getCfg", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "getDef", new String[]{"java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"12:30:45", "<sample:6>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "analyze", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "getDef", new String[]{"java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"B2:30:45", "<sample:9>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "analyze", "int", "1"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "analyze", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FlowSensitiveInlineVariables", "com.google.javascript.jscomp.FlowSensitiveInlineVariables", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<sample:6>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "analyze", new String[]{}, new String[]{}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "analyze", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "getDef", "java.lang.String,com.google.javascript.rhino.Node", "+1", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "analyze", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "getDef", "java.lang.String,com.google.javascript.rhino.Node", "+1", "<null>"}, {"com.google.javascript.jscomp.MustBeReachingVariableDef", "createEntryLattice", ""}, {"com.google.javascript.jscomp.MustBeReachingVariableDef", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FlowSensitiveInlineVariables", "com.google.javascript.jscomp.FlowSensitiveInlineVariables", "exitScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FlowSensitiveInlineVariables", "com.google.javascript.jscomp.FlowSensitiveInlineVariables", "exitScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.FlowSensitiveInlineVariables", "exitScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:5>"}, {"com.google.javascript.jscomp.FlowSensitiveInlineVariables", "exitScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:2>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "getDef", new String[]{"java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"", "<null>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "join", "com.google.javascript.jscomp.graph.LatticeElement,com.google.javascript.jscomp.graph.LatticeElement", "<sample:6>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "dependsOnOuterScopeVars", new String[]{"java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"-0.0", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "dependsOnOuterScopeVars", "java.lang.String,com.google.javascript.rhino.Node", "-1", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "getCfg", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.ControlFlowGraph", actual.getClass().getName());
  assertEquals("{getName=LinkedGraph, isDirected=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "dependsOnOuterScopeVars", new String[]{"java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"/x1E--0.e", "<sample:0>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "initialize", ""}, {"com.google.javascript.jscomp.MustBeReachingVariableDef", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef", "<sample:1>", "<sample:7>"}, {"com.google.javascript.jscomp.MustBeReachingVariableDef", "dependsOnOuterScopeVars", "java.lang.String,com.google.javascript.rhino.Node", ".5", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "dependsOnOuterScopeVars", new String[]{"java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"/sx1E-1.e", "<sample:1>"}, false, 9, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:2>"}, {"com.google.javascript.jscomp.MustBeReachingVariableDef", "initialize", ""}, {"com.google.javascript.jscomp.MustBeReachingVariableDef", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef", "<sample:3>", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FlowSensitiveInlineVariables", "com.google.javascript.jscomp.FlowSensitiveInlineVariables", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<sample:0>", "<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "dependsOnOuterScopeVars", new String[]{"java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"Iaa0b", "<sample:0>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "isForward", ""}, {"com.google.javascript.jscomp.MustBeReachingVariableDef", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:7>"}, {"com.google.javascript.jscomp.MustBeReachingVariableDef", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef", "<sample:0>", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "dependsOnOuterScopeVars", new String[]{"java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"2020-01-01", "<sample:1>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "isForward", ""}, {"com.google.javascript.jscomp.MustBeReachingVariableDef", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef", "<sample:0>", "<sample:7>"}, {"com.google.javascript.jscomp.MustBeReachingVariableDef", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "createEntryLattice", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FlowSensitiveInlineVariables", "com.google.javascript.jscomp.FlowSensitiveInlineVariables", "enterScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.FlowSensitiveInlineVariables", "exitScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:2>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "createEntryLattice", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "dependsOnOuterScopeVars", new String[]{"java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"1.5e300", "<null>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "createEntryLattice", ""}, {"com.google.javascript.jscomp.MustBeReachingVariableDef", "getCfg", ""}, {"com.google.javascript.jscomp.MustBeReachingVariableDef", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef", "<sample:1>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "dependsOnOuterScopeVars", new String[]{"java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"123456789012345678901234567890", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "getCfg", ""}, {"com.google.javascript.jscomp.MustBeReachingVariableDef", "analyze", ""}, {"com.google.javascript.jscomp.MustBeReachingVariableDef", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef", "<sample:6>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "dependsOnOuterScopeVars", new String[]{"java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"123456789112345678901234567890", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "getCfg", ""}, {"com.google.javascript.jscomp.MustBeReachingVariableDef", "analyze", ""}, {"com.google.javascript.jscomp.MustBeReachingVariableDef", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef", "<sample:6>", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "dependsOnOuterScopeVars", new String[]{"java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"123456789112345678901234567890", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "getCfg", ""}, {"com.google.javascript.jscomp.MustBeReachingVariableDef", "analyze", ""}, {"com.google.javascript.jscomp.MustBeReachingVariableDef", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef", "<sample:6>", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "joinInputs", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "initialize", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "getCfg", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "flow", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<null>"}, {"com.google.javascript.jscomp.MustBeReachingVariableDef", "getExitLatticeElement", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.ControlFlowGraph", actual.getClass().getName());
  assertEquals("{getName=LinkedGraph, isDirected=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "createInitialEstimateLattice", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "join", new String[]{"com.google.javascript.jscomp.graph.LatticeElement", "com.google.javascript.jscomp.graph.LatticeElement"}, new String[]{"<sample:7>", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "getCfg", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.ControlFlowGraph", actual.getClass().getName());
  assertEquals("{getName=LinkedGraph, isDirected=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "dependsOnOuterScopeVars", new String[]{"java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"22", "<null>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "analyze", ""}, {"com.google.javascript.jscomp.MustBeReachingVariableDef", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef", "<sample:5>", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FlowSensitiveInlineVariables", "com.google.javascript.jscomp.FlowSensitiveInlineVariables", "exitScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.FlowSensitiveInlineVariables", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:1>", "<sample:6>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "dependsOnOuterScopeVars", new String[]{"java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"X", "<null>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "analyze", ""}, {"com.google.javascript.jscomp.MustBeReachingVariableDef", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef", "<sample:5>", "<sample:1>"}, {"com.google.javascript.jscomp.MustBeReachingVariableDef", "join", "com.google.javascript.jscomp.graph.LatticeElement,com.google.javascript.jscomp.graph.LatticeElement", "<sample:0>", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "isForward", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "joinInputs", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<null>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "initialize", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "flow", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "analyze", new String[]{"int"}, new String[]{"1"}, false, 1, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "getDef", "java.lang.String,com.google.javascript.rhino.Node", "-1.5", "<sample:7>"}, {"com.google.javascript.jscomp.MustBeReachingVariableDef", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "joinInputs", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<sample:2>"}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FlowSensitiveInlineVariables", "com.google.javascript.jscomp.FlowSensitiveInlineVariables", "enterScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.FlowSensitiveInlineVariables", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:7>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FlowSensitiveInlineVariables", "com.google.javascript.jscomp.FlowSensitiveInlineVariables", "enterScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.FlowSensitiveInlineVariables", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<null>", "<sample:5>", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FlowSensitiveInlineVariables", "com.google.javascript.jscomp.FlowSensitiveInlineVariables", "enterScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.FlowSensitiveInlineVariables", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<null>", "<sample:5>", "<sample:3>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "analyze", new String[]{"int"}, new String[]{"0"}, false, 15, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FlowSensitiveInlineVariables", "com.google.javascript.jscomp.FlowSensitiveInlineVariables", "enterScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<null>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.FlowSensitiveInlineVariables", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "initialize", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "dependsOnOuterScopeVars", "java.lang.String,com.google.javascript.rhino.Node", "1.5e300", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "initialize", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "dependsOnOuterScopeVars", "java.lang.String,com.google.javascript.rhino.Node", "1.5e300", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "initialize", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "join", "com.google.javascript.jscomp.graph.LatticeElement,com.google.javascript.jscomp.graph.LatticeElement", "<sample:5>", "<sample:2>"}, {"com.google.javascript.jscomp.MustBeReachingVariableDef", "getCfg", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "getCfg", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:4>"}, {"com.google.javascript.jscomp.MustBeReachingVariableDef", "analyze", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "initialize", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "flow", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "initialize", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "flow", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:2>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "computeEscaped", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set", "com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:10>", "<sample:3>", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "getCfg", new String[]{}, new String[]{}, false), new String[][]{{"getDirectedSuccNodes", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "joinInputs", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "joinInputs", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<sample:5>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FlowSensitiveInlineVariables", "com.google.javascript.jscomp.FlowSensitiveInlineVariables", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.FlowSensitiveInlineVariables", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:5>", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "isForward", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "flow", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<sample:2>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "computeEscaped", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set", "com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:4>", "<sample:2>", "<sample:5>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "computeEscaped", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set", "com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:6>", "<sample:2>", "<sample:4>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "analyze", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef", "<sample:3>", "<sample:1>"}, {"com.google.javascript.jscomp.MustBeReachingVariableDef", "getCfg", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "analyze", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef", "<sample:3>", "<sample:1>"}, {"com.google.javascript.jscomp.MustBeReachingVariableDef", "getCfg", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "analyze", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef", "<sample:3>", "<sample:1>"}, {"com.google.javascript.jscomp.MustBeReachingVariableDef", "getCfg", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FlowSensitiveInlineVariables", "com.google.javascript.jscomp.FlowSensitiveInlineVariables", "exitScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<null>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.FlowSensitiveInlineVariables", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:2>", "<sample:4>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "analyze", new String[]{}, new String[]{}, false, 26, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef", "<sample:2>", "<sample:1>"}, {"com.google.javascript.jscomp.MustBeReachingVariableDef", "createInitialEstimateLattice", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "analyze", new String[]{}, new String[]{}, false, 27, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef", "<sample:2>", "<sample:1>"}, {"com.google.javascript.jscomp.MustBeReachingVariableDef", "createInitialEstimateLattice", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "getExitLatticeElement", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "analyze", "int", "10"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "getExitLatticeElement", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "analyze", "int", "10"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "getExitLatticeElement", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "analyze", "int", "10"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef"}, new String[]{"<sample:9>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "dependsOnOuterScopeVars", "java.lang.String,com.google.javascript.rhino.Node", "", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef"}, new String[]{"<sample:8>", "<sample:4>"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef"}, new String[]{"<sample:2>", "<sample:6>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "getExitLatticeElement", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef"}, new String[]{"<sample:5>", "<sample:7>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "getExitLatticeElement", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef"}, new String[]{"<sample:5>", "<sample:5>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "createEntryLattice", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef"}, new String[]{"<sample:3>", "<sample:5>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "createEntryLattice", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "analyze", new String[]{"int"}, new String[]{"0"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "isForward", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "analyze", "int", "-2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "getDef", new String[]{"java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"true", "<sample:2>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "flow", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:2>"}, {"com.google.javascript.jscomp.MustBeReachingVariableDef", "analyze", "int", "16"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "joinInputs", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef", "<sample:2>", "<sample:0>"}, {"com.google.javascript.jscomp.MustBeReachingVariableDef", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "joinInputs", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef", "<sample:2>", "<sample:0>"}, {"com.google.javascript.jscomp.MustBeReachingVariableDef", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "join", new String[]{"com.google.javascript.jscomp.graph.LatticeElement", "com.google.javascript.jscomp.graph.LatticeElement"}, new String[]{"<sample:3>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "analyze", "int", "2147483647"}, {"com.google.javascript.jscomp.MustBeReachingVariableDef", "join", "com.google.javascript.jscomp.graph.LatticeElement,com.google.javascript.jscomp.graph.LatticeElement", "<sample:4>", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "join", new String[]{"com.google.javascript.jscomp.graph.LatticeElement", "com.google.javascript.jscomp.graph.LatticeElement"}, new String[]{"<sample:7>", "<sample:6>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "analyze", ""}, {"com.google.javascript.jscomp.MustBeReachingVariableDef", "join", "com.google.javascript.jscomp.graph.LatticeElement,com.google.javascript.jscomp.graph.LatticeElement", "<sample:4>", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "join", new String[]{"com.google.javascript.jscomp.graph.LatticeElement", "com.google.javascript.jscomp.graph.LatticeElement"}, new String[]{"<sample:1>", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "analyze", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "flowThrough", new String[]{"java.lang.Object", "com.google.javascript.jscomp.graph.LatticeElement"}, new String[]{"<sample:1>", "<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "initialize", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "dependsOnOuterScopeVars", "java.lang.String,com.google.javascript.rhino.Node", ".5", "<sample:5>"}, {"com.google.javascript.jscomp.MustBeReachingVariableDef", "initialize", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "initialize", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "dependsOnOuterScopeVars", "java.lang.String,com.google.javascript.rhino.Node", ".5", "<sample:5>"}, {"com.google.javascript.jscomp.MustBeReachingVariableDef", "initialize", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "initialize", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "initialize", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "createEntryLattice", new String[]{}, new String[]{}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "createEntryLattice", new String[]{}, new String[]{}, false, 16, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "createEntryLattice", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "createEntryLattice", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "createEntryLattice", ""}, {"com.google.javascript.jscomp.MustBeReachingVariableDef", "getExitLatticeElement", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FlowSensitiveInlineVariables", "com.google.javascript.jscomp.FlowSensitiveInlineVariables", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:6>", "<sample:4>"}, false, 14, new String[][]{{"com.google.javascript.jscomp.FlowSensitiveInlineVariables", "exitScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:2>"}, {"com.google.javascript.jscomp.FlowSensitiveInlineVariables", "enterScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:5>"}, {"com.google.javascript.jscomp.FlowSensitiveInlineVariables", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:8>", "<sample:1>", "<null>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "flowThrough", new String[]{"java.lang.Object", "com.google.javascript.jscomp.graph.LatticeElement"}, new String[]{"<i:1>", "<null>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "dependsOnOuterScopeVars", "java.lang.String,com.google.javascript.rhino.Node", "1.5d", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "join", new String[]{"com.google.javascript.jscomp.graph.LatticeElement", "com.google.javascript.jscomp.graph.LatticeElement"}, new String[]{"<sample:6>", "<sample:1>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "flow", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<sample:9>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "dependsOnOuterScopeVars", "java.lang.String,com.google.javascript.rhino.Node", " ", "<sample:3>"}, {"com.google.javascript.jscomp.MustBeReachingVariableDef", "getCfg", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "analyze", new String[]{"int"}, new String[]{"2147483647"}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "getCfg", new String[]{}, new String[]{}, false), new String[][]{{"getFirstEdge", "java.lang.Object,java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "getCfg", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "getExitLatticeElement", ""}, {"com.google.javascript.jscomp.MustBeReachingVariableDef", "initialize", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "getCfg", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "getExitLatticeElement", ""}, {"com.google.javascript.jscomp.MustBeReachingVariableDef", "initialize", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.ControlFlowGraph", actual.getClass().getName());
  assertEquals("{getName=LinkedGraph, isDirected=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "getCfg", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "getExitLatticeElement", ""}, {"com.google.javascript.jscomp.MustBeReachingVariableDef", "initialize", ""}}, 3), new String[][]{{"getDirectedGraphNodes", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[null, c]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "getCfg", new String[]{}, new String[]{}, false, 20, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "getExitLatticeElement", ""}, {"com.google.javascript.jscomp.MustBeReachingVariableDef", "initialize", ""}}, 3), new String[][]{{"getDirectedGraphNodes", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[null, 1.5]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "getCfg", new String[]{}, new String[]{}, false, 20, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "getExitLatticeElement", ""}, {"com.google.javascript.jscomp.MustBeReachingVariableDef", "initialize", ""}}, 3), new String[][]{{"getDirectedGraphNodes", "", "0"}, {"removeAll", "java.util.Collection", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "getCfg", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "isForward", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "getCfg", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "isForward", ""}}, 2), new String[][]{{"newSubGraph", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.graph.Graph$SimpleSubGraph", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "getExitLatticeElement", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef", "<sample:5>", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "joinInputs", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<null>"}, false, 15, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "getExitLatticeElement", ""}, {"com.google.javascript.jscomp.MustBeReachingVariableDef", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef", "<sample:8>", "<sample:8>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "getCfg", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "getDef", new String[]{"java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"1t.25", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "join", "com.google.javascript.jscomp.graph.LatticeElement,com.google.javascript.jscomp.graph.LatticeElement", "<sample:4>", "<sample:4>"}, {"com.google.javascript.jscomp.MustBeReachingVariableDef", "createInitialEstimateLattice", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FlowSensitiveInlineVariables", "com.google.javascript.jscomp.FlowSensitiveInlineVariables", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<sample:2>", "<sample:0>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FlowSensitiveInlineVariables", "com.google.javascript.jscomp.FlowSensitiveInlineVariables", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<sample:2>", "<sample:7>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef"}, new String[]{"<sample:11>", "<sample:5>"}, false, 8, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "initialize", ""}, {"com.google.javascript.jscomp.MustBeReachingVariableDef", "dependsOnOuterScopeVars", "java.lang.String,com.google.javascript.rhino.Node", "[1,,2C]", "<null>"}, {"com.google.javascript.jscomp.MustBeReachingVariableDef", "dependsOnOuterScopeVars", "java.lang.String,com.google.javascript.rhino.Node", "{\"a\":1}", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "getCfg", new String[]{}, new String[]{}, false), new String[][]{{"getEdges", "", "3"}, {"clear", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "flowThrough", new String[]{"java.lang.Object", "com.google.javascript.jscomp.graph.LatticeElement"}, new String[]{"<i:1>", "<sample:6>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FlowSensitiveInlineVariables", "com.google.javascript.jscomp.FlowSensitiveInlineVariables", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "analyze", new String[]{"int"}, new String[]{"2147483627"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "isForward", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "analyze", new String[]{"int"}, new String[]{"-2147483627"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "isForward", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.DataFlowAnalysis$MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "isForward", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "getDef", "java.lang.String,com.google.javascript.rhino.Node", "Hello, World", "<sample:3>"}, {"com.google.javascript.jscomp.MustBeReachingVariableDef", "getDef", "java.lang.String,com.google.javascript.rhino.Node", "arguments", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "getDef", new String[]{"java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"21748364", "<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "getDef", new String[]{"java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"21748364", "<sample:7>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "analyze", new String[]{"int"}, new String[]{"-1"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.DataFlowAnalysis$MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FlowSensitiveInlineVariables", "com.google.javascript.jscomp.FlowSensitiveInlineVariables", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:1>", "<sample:0>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.FlowSensitiveInlineVariables", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:5>", "<null>"}, {"com.google.javascript.jscomp.FlowSensitiveInlineVariables", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:6>", "<sample:3>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "getCfg", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "createInitialEstimateLattice", ""}, {"com.google.javascript.jscomp.MustBeReachingVariableDef", "isForward", ""}}), new String[][]{{"hasNode", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "getExitLatticeElement", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "analyze", new String[]{}, new String[]{}, false, 9, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "analyze", new String[]{}, new String[]{}, false, 10, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "analyze", new String[]{}, new String[]{}, false, 12, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "createEntryLattice", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "initialize", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FlowSensitiveInlineVariables", "com.google.javascript.jscomp.FlowSensitiveInlineVariables", "enterScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:7>"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef"}, new String[]{"<sample:11>", "<sample:5>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "initialize", ""}, {"com.google.javascript.jscomp.MustBeReachingVariableDef", "getDef", "java.lang.String,com.google.javascript.rhino.Node", "1.12345678", "<null>"}, {"com.google.javascript.jscomp.MustBeReachingVariableDef", "flow", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:10>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "analyze", new String[]{}, new String[]{}, false, 28, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef", "<sample:6>", "<sample:3>"}, {"com.google.javascript.jscomp.MustBeReachingVariableDef", "isForward", ""}, {"com.google.javascript.jscomp.MustBeReachingVariableDef", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "getCfg", new String[]{}, new String[]{}, false, 14, new String[][]{}, 3), new String[][]{{"getDirectedSuccNodes", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "join", new String[]{"com.google.javascript.jscomp.graph.LatticeElement", "com.google.javascript.jscomp.graph.LatticeElement"}, new String[]{"<sample:2>", "<sample:7>"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "computeEscaped", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set", "com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:2>", "<sample:3>", "<sample:2>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "computeEscaped", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set", "com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<null>", "<null>", "<sample:4>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "analyze", new String[]{"int"}, new String[]{"-2147483648"}, false, 1, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "createEntryLattice", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "getCfg", new String[]{}, new String[]{}, false, 16, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "getDef", new String[]{"java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"a b", "<sample:7>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "flowThrough", "java.lang.Object,com.google.javascript.jscomp.graph.LatticeElement", "<d:1.5>", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "computeEscaped", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set", "com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<null>", "<null>", "<sample:4>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "analyze", new String[]{"int"}, new String[]{"11"}, false, 16, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef", "<sample:6>", "<sample:0>"}, {"com.google.javascript.jscomp.MustBeReachingVariableDef", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:7>"}, {"com.google.javascript.jscomp.MustBeReachingVariableDef", "getCfg", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "analyze", new String[]{"int"}, new String[]{"11"}, false, 8, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef", "<sample:6>", "<sample:0>"}, {"com.google.javascript.jscomp.MustBeReachingVariableDef", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:7>"}, {"com.google.javascript.jscomp.MustBeReachingVariableDef", "getCfg", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "analyze", new String[]{"int"}, new String[]{"-1"}, false, 8, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef", "<sample:6>", "<sample:0>"}, {"com.google.javascript.jscomp.MustBeReachingVariableDef", "getCfg", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.DataFlowAnalysis$MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "analyze", new String[]{"int"}, new String[]{"-20"}, false, 3, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef", "<sample:6>", "<sample:0>"}, {"com.google.javascript.jscomp.MustBeReachingVariableDef", "analyze", "int", "0"}, {"com.google.javascript.jscomp.MustBeReachingVariableDef", "getCfg", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "getCfg", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "flowThrough", "java.lang.Object,com.google.javascript.jscomp.graph.LatticeElement", "<i:-1>", "<sample:5>"}}, 2), new String[][]{{"createNode", "java.lang.Object", "6"}, {"getInEdges", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FlowSensitiveInlineVariables", "com.google.javascript.jscomp.FlowSensitiveInlineVariables", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:6>", "<sample:6>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.FlowSensitiveInlineVariables", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:11>", "<sample:11>"}, {"com.google.javascript.jscomp.FlowSensitiveInlineVariables", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:2>"}, {"com.google.javascript.jscomp.FlowSensitiveInlineVariables", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:2>", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "getCfg", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1), new String[][]{{"connectToImplicitReturn", "java.lang.Object,com.google.javascript.jscomp.ControlFlowGraph$Branch", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "getCfg", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2), new String[][]{{"getEdges", "", "0"}, {"size", "", "6"}, {"remove", "java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "computeEscaped", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set", "com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:3>", "<null>", "<sample:12>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FlowSensitiveInlineVariables", "com.google.javascript.jscomp.FlowSensitiveInlineVariables", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:5>", "<sample:1>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "createEntryLattice", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "analyze", new String[]{"int"}, new String[]{"2147483647"}, false, 11, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:0>"}, {"com.google.javascript.jscomp.MustBeReachingVariableDef", "initialize", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "getCfg", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"getDirectedGraphNode", "java.lang.Object", "1"}, {"newSubGraph", "", "0"}, {"isIndependentOf", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "getCfg", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1), new String[][]{{"getDirectedGraphNode", "java.lang.Object", "1"}, {"newSubGraph", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.graph.Graph$SimpleSubGraph", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "join", new String[]{"com.google.javascript.jscomp.graph.LatticeElement", "com.google.javascript.jscomp.graph.LatticeElement"}, new String[]{"<sample:7>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "analyze", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "join", new String[]{"com.google.javascript.jscomp.graph.LatticeElement", "com.google.javascript.jscomp.graph.LatticeElement"}, new String[]{"<sample:2>", "<sample:7>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "analyze", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "initialize", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "initialize", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "getExitLatticeElement", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "initialize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FlowSensitiveInlineVariables", "com.google.javascript.jscomp.FlowSensitiveInlineVariables", "enterScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<null>"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "join", new String[]{"com.google.javascript.jscomp.graph.LatticeElement", "com.google.javascript.jscomp.graph.LatticeElement"}, new String[]{"<null>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "getExitLatticeElement", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "analyze", new String[]{"int"}, new String[]{"12"}, false, 4, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "join", "com.google.javascript.jscomp.graph.LatticeElement,com.google.javascript.jscomp.graph.LatticeElement", "<sample:3>", "<sample:9>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "computeEscaped", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set", "com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<null>", "<sample:1>", "<sample:4>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "getDef", new String[]{"java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"\t", "<null>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "analyze", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "getDef", new String[]{"java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"\t", "<null>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "analyze", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "getDef", new String[]{"java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"\t", "<null>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "analyze", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "getCfg", new String[]{}, new String[]{}, false, 21, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "initialize", ""}, {"com.google.javascript.jscomp.MustBeReachingVariableDef", "flowThrough", "java.lang.Object,com.google.javascript.jscomp.graph.LatticeElement", "<sample:0>", "<sample:1>"}}, 2), new String[][]{{"getInEdges", "java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "getDef", new String[]{"java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"5_mntll1.5d", "<null>"}, false, 11, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef", "<sample:11>", "<sample:5>"}, {"com.google.javascript.jscomp.MustBeReachingVariableDef", "flowThrough", "java.lang.Object,com.google.javascript.jscomp.graph.LatticeElement", "<b:true>", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "getDef", new String[]{"java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"##ag=D-5T5.P-0x1Fa12:0:45[1,,2C]", "<null>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:5>"}, {"com.google.javascript.jscomp.MustBeReachingVariableDef", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef", "<sample:11>", "<sample:7>"}, {"com.google.javascript.jscomp.MustBeReachingVariableDef", "analyze", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MustBeReachingVariableDef", "com.google.javascript.jscomp.MustBeReachingVariableDef", "getDef", new String[]{"java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"PUra2o,-1", "<null>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.MustBeReachingVariableDef", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:5>"}, {"com.google.javascript.jscomp.MustBeReachingVariableDef", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef", "<sample:11>", "<sample:9>"}, {"com.google.javascript.jscomp.MustBeReachingVariableDef", "analyze", ""}}, 2);
  assertNull(actual);
 }
}
