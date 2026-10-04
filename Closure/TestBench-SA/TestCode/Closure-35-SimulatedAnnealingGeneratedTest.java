package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.TypeInference", "flow", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:2>"}, {"com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.LinkedFlowScope", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.TypeInference", "flow", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:2>"}, {"com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", ""}}), new String[][]{{"findUniqueRefinedSlot", "com.google.javascript.jscomp.FlowScope", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope"}, new String[]{"<sample:3>", "<sample:5>"}, false, 0, null, 3);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope"}, new String[]{"<null>", "<sample:5>"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "join", new String[]{"com.google.javascript.jscomp.LatticeElement", "com.google.javascript.jscomp.LatticeElement"}, new String[]{"<sample:5>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "isForward", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope"}, new String[]{"<sample:5>", "<sample:4>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,boolean", "<sample:4>", "<null>", "true"}, {"com.google.javascript.jscomp.TypeInference", "isForward", ""}}, 3), new String[][]{{"optimize", "", "0"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope"}, new String[]{"<sample:5>", "<sample:3>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,boolean", "<sample:4>", "<sample:0>", "true"}, {"com.google.javascript.jscomp.TypeInference", "isForward", ""}}, 3), new String[][]{{"optimize", "", "0"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "joinInputs", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", new String[]{"com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "boolean"}, new String[]{"<null>", "<sample:1>", "false"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope"}, new String[]{"<sample:6>", "<sample:7>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,boolean", "<sample:6>", "<sample:6>", "false"}}, 3), new String[][]{{"optimize", "", "4"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope"}, new String[]{"<sample:6>", "<sample:4>"}, false, 15, new String[][]{{"com.google.javascript.jscomp.TypeInference", "analyze", "int", "1"}, {"com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,boolean", "<sample:6>", "<sample:7>", "false"}}, 3);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "computeEscaped", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set", "com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:4>", "<sample:0>", "<sample:2>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", new String[]{"com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "boolean"}, new String[]{"<sample:6>", "<null>", "true"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", new String[]{"java.lang.Object", "com.google.javascript.jscomp.LatticeElement"}, new String[]{"<s:a>", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeInference", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope", "<sample:5>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "initialize", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "initialize", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "initialize", new String[]{}, new String[]{}, false, 15, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "computeEscaped", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set", "com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:0>", "<sample:0>", "<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "computeEscaped", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set", "com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<null>", "<sample:0>", "<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "computeEscaped", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set", "com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:7>", "<sample:0>", "<sample:2>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "analyze", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "join", "com.google.javascript.jscomp.LatticeElement,com.google.javascript.jscomp.LatticeElement", "<sample:2>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", new String[]{"com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "boolean"}, new String[]{"<sample:0>", "<sample:7>", "false"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", new String[]{"com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "boolean"}, new String[]{"<sample:4>", "<sample:3>", "false"}, false, 2, new String[][]{{"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "java.lang.Object,com.google.javascript.jscomp.LatticeElement", "<s:=>", "<sample:7>"}, {"com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,boolean", "<null>", "<sample:6>", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"java.lang.Object", "com.google.javascript.jscomp.LatticeElement"}, new String[]{"<s:>", "<sample:7>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", new String[]{"com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "boolean"}, new String[]{"<sample:2>", "<sample:4>", "false"}, false, 2, new String[][]{{"com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,boolean", "<sample:3>", "<sample:0>", "true"}, {"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope", "<sample:6>", "<sample:4>"}, {"com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,boolean", "<null>", "<sample:6>", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope"}, new String[]{"<sample:6>", "<sample:3>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.TypeInference", "getCfg", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getCfg", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "isForward", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.ControlFlowGraph", actual.getClass().getName());
  assertEquals("{getName=LinkedGraph, isDirected=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getBooleanOutcomes", new String[]{"com.google.javascript.rhino.jstype.BooleanLiteralSet", "com.google.javascript.rhino.jstype.BooleanLiteralSet", "boolean"}, new String[]{"<sample:3>", "<null>", "true"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getBooleanOutcomes", new String[]{"com.google.javascript.rhino.jstype.BooleanLiteralSet", "com.google.javascript.rhino.jstype.BooleanLiteralSet", "boolean"}, new String[]{"<sample:3>", "<sample:1>", "true"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanLiteralSet", actual.getClass().getName());
  assertEquals("BOTH", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getBooleanOutcomes", new String[]{"com.google.javascript.rhino.jstype.BooleanLiteralSet", "com.google.javascript.rhino.jstype.BooleanLiteralSet", "boolean"}, new String[]{"<sample:2>", "<sample:6>", "true"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanLiteralSet", actual.getClass().getName());
  assertEquals("FALSE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getBooleanOutcomes", new String[]{"com.google.javascript.rhino.jstype.BooleanLiteralSet", "com.google.javascript.rhino.jstype.BooleanLiteralSet", "boolean"}, new String[]{"<sample:3>", "<null>", "true"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getBooleanOutcomes", new String[]{"com.google.javascript.rhino.jstype.BooleanLiteralSet", "com.google.javascript.rhino.jstype.BooleanLiteralSet", "boolean"}, new String[]{"<sample:3>", "<null>", "true"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "analyze", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getBooleanOutcomes", new String[]{"com.google.javascript.rhino.jstype.BooleanLiteralSet", "com.google.javascript.rhino.jstype.BooleanLiteralSet", "boolean"}, new String[]{"<sample:3>", "<sample:1>", "false"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanLiteralSet", actual.getClass().getName());
  assertEquals("TRUE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createEntryLattice", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.LinkedFlowScope", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getBooleanOutcomes", new String[]{"com.google.javascript.rhino.jstype.BooleanLiteralSet", "com.google.javascript.rhino.jstype.BooleanLiteralSet", "boolean"}, new String[]{"<sample:3>", "<null>", "true"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"java.lang.Object", "com.google.javascript.jscomp.LatticeElement"}, new String[]{"<s:a>", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope"}, new String[]{"<sample:2>", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flow", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope"}, new String[]{"<sample:2>", "<sample:7>"}, false, 12, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", new String[]{"java.lang.Object", "com.google.javascript.jscomp.LatticeElement"}, new String[]{"<null>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope", "<sample:5>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope"}, new String[]{"<sample:1>", "<sample:12>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "java.lang.Object,com.google.javascript.jscomp.LatticeElement", "<s:key>", "<sample:6>"}, {"com.google.javascript.jscomp.TypeInference", "analyze", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope"}, new String[]{"<null>", "<sample:7>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "java.lang.Object,com.google.javascript.jscomp.LatticeElement", "<s:key>", "<sample:6>"}, {"com.google.javascript.jscomp.TypeInference", "analyze", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getCfg", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<null>"}}), new String[][]{{"connect", "java.lang.Object,java.lang.Object,java.lang.Object", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope"}, new String[]{"<sample:4>", "<null>"}, false, 11, new String[][]{{"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope", "<sample:1>", "<sample:7>"}, {"com.google.javascript.jscomp.TypeInference", "analyze", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "analyze", new String[]{"int"}, new String[]{"1073741823"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,boolean", "<sample:0>", "<sample:1>", "true"}, {"com.google.javascript.jscomp.TypeInference", "join", "com.google.javascript.jscomp.LatticeElement,com.google.javascript.jscomp.LatticeElement", "<sample:7>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "createEntryLattice", ""}}), new String[][]{{"getTypeOfThis", "", "2"}, {"getRestrictedTypeGivenToBooleanOutcome", "boolean", "4"}, {"getLeastSupertype", "com.google.javascript.rhino.jstype.JSType", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.AllType", actual.getClass().getName());
  assertEquals("* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheck...#374#-1102074180", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope"}, new String[]{"<sample:7>", "<sample:7>"}, false), new String[][]{{"completeScope", "com.google.javascript.jscomp.Scope", "4"}, {"getOwnSlot", "java.lang.String", "7"}, {"getJSDocInfo", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.JSDocInfo", actual.getClass().getName());
  assertEquals("JSDocInfo {containsDeclaration=false, getBlockDescription=null, getDeprecationReason=null, getDescription=null, getExtendedInterfacesCount=0, getFileOverview=null, getImplementedInterfaceCount=0, getL...#390#-1856857836", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope"}, new String[]{"<null>", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope", "<sample:3>", "<sample:2>"}, {"com.google.javascript.jscomp.TypeInference", "join", "com.google.javascript.jscomp.LatticeElement,com.google.javascript.jscomp.LatticeElement", "<sample:5>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope"}, new String[]{"<sample:3>", "<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope", "<sample:3>", "<sample:2>"}, {"com.google.javascript.jscomp.TypeInference", "join", "com.google.javascript.jscomp.LatticeElement,com.google.javascript.jscomp.LatticeElement", "<sample:5>", "<sample:1>"}}, 2), new String[][]{{"completeScope", "com.google.javascript.jscomp.Scope", "4"}, {"getOwnSlot", "java.lang.String", "7"}, {"getJSDocInfo", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.JSDocInfo", actual.getClass().getName());
  assertEquals("JSDocInfo {containsDeclaration=false, getBlockDescription=null, getDeprecationReason=null, getDescription=null, getExtendedInterfacesCount=0, getFileOverview=null, getImplementedInterfaceCount=0, getL...#390#-1856857836", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope"}, new String[]{"<sample:3>", "<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope", "<sample:3>", "<sample:2>"}, {"com.google.javascript.jscomp.TypeInference", "join", "com.google.javascript.jscomp.LatticeElement,com.google.javascript.jscomp.LatticeElement", "<sample:5>", "<sample:1>"}}, 2), new String[][]{{"completeScope", "com.google.javascript.jscomp.Scope", "4"}, {"getOwnSlot", "java.lang.String", "7"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "isForward", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,boolean", "<sample:5>", "<sample:0>", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope"}, new String[]{"<sample:5>", "<sample:5>"}, false), new String[][]{{"findUniqueRefinedSlot", "com.google.javascript.jscomp.FlowScope", "2"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope"}, new String[]{"<sample:9>", "<sample:4>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.TypeInference", "analyze", "int", "0"}, {"com.google.javascript.jscomp.TypeInference", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope", "<sample:5>", "<sample:5>"}}, 1), new String[][]{{"findUniqueRefinedSlot", "com.google.javascript.jscomp.FlowScope", "6"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", new String[]{"java.lang.Object", "com.google.javascript.jscomp.LatticeElement"}, new String[]{"<d:-0.15>", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "initialize", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flow", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "flow", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:2>"}, {"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "java.lang.Object,com.google.javascript.jscomp.LatticeElement", "<i:-1>", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flow", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "flow", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:2>"}, {"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "java.lang.Object,com.google.javascript.jscomp.LatticeElement", "<i:-1>", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flow", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<null>"}, false, 15, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope"}, new String[]{"<null>", "<sample:2>"}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope"}, new String[]{"<sample:4>", "<sample:6>"}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createEntryLattice", new String[]{}, new String[]{}, false), new String[][]{{"findUniqueRefinedSlot", "com.google.javascript.jscomp.FlowScope", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "join", new String[]{"com.google.javascript.jscomp.LatticeElement", "com.google.javascript.jscomp.LatticeElement"}, new String[]{"<sample:0>", "<sample:2>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeInference", "isForward", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createEntryLattice", new String[]{}, new String[]{}, false), new String[][]{{"getOwnSlot", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope"}, new String[]{"<sample:4>", "<sample:0>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.TypeInference", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope"}, new String[]{"<sample:3>", "<sample:0>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.TypeInference", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.google.javascript.jscomp.TypeInference", "isForward", ""}, {"com.google.javascript.jscomp.TypeInference", "analyze", "int", "-1"}, {"com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.LinkedFlowScope", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"java.lang.Object", "com.google.javascript.jscomp.LatticeElement"}, new String[]{"<s:key>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getBooleanOutcomes", new String[]{"com.google.javascript.rhino.jstype.BooleanLiteralSet", "com.google.javascript.rhino.jstype.BooleanLiteralSet", "boolean"}, new String[]{"<sample:0>", "<sample:5>", "true"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanLiteralSet", actual.getClass().getName());
  assertEquals("TRUE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getBooleanOutcomes", new String[]{"com.google.javascript.rhino.jstype.BooleanLiteralSet", "com.google.javascript.rhino.jstype.BooleanLiteralSet", "boolean"}, new String[]{"<sample:0>", "<sample:4>", "true"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanLiteralSet", actual.getClass().getName());
  assertEquals("EMPTY", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope", "<sample:5>", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.google.javascript.jscomp.TypeInference", "flowThrough", "java.lang.Object,com.google.javascript.jscomp.LatticeElement", "<b:true>", "<sample:5>"}, {"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope", "<sample:5>", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "analyze", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "java.lang.Object,com.google.javascript.jscomp.LatticeElement", "<i:2>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope"}, new String[]{"<sample:6>", "<sample:8>"}, false, 8, new String[][]{{"com.google.javascript.jscomp.TypeInference", "flow", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:1>"}, {"com.google.javascript.jscomp.TypeInference", "analyze", "int", "-2147483648"}}, 2), new String[][]{{"getRootNode", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope"}, new String[]{"<sample:8>", "<sample:7>"}, false, 8, new String[][]{{"com.google.javascript.jscomp.TypeInference", "flow", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:1>"}, {"com.google.javascript.jscomp.TypeInference", "analyze", "int", "-2147483648"}}, 2), new String[][]{{"getRootNode", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope"}, new String[]{"<sample:8>", "<sample:6>"}, false, 8, new String[][]{{"com.google.javascript.jscomp.TypeInference", "flow", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:1>"}, {"com.google.javascript.jscomp.TypeInference", "analyze", "int", "-2147483648"}}, 2), new String[][]{{"getRootNode", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$NumberNode", actual.getClass().getName());
  assertEquals("NUMBER -Infinity {getCharno=-1, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getSourcePosit...#339#1917934166", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getCfg", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeInference", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope", "<sample:0>", "<sample:6>"}}), new String[][]{{"getDirectedGraphNode", "java.lang.Object", "7"}, {"getDirectedSuccNodes", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", new String[]{}, new String[]{}, false), new String[][]{{"inferSlotType", "java.lang.String,com.google.javascript.rhino.jstype.JSType", "2"}, {"getRootNode", "", "2"}, {"isAdd", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", new String[]{}, new String[]{}, false), new String[][]{{"inferSlotType", "java.lang.String,com.google.javascript.rhino.jstype.JSType", "2"}, {"getRootNode", "", "2"}, {"isAdd", "", "6"}, {"getSourcePosition", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"inferSlotType", "java.lang.String,com.google.javascript.rhino.jstype.JSType", "2"}, {"getRootNode", "", "2"}, {"isAdd", "", "6"}, {"getSourcePosition", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("24583", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createEntryLattice", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", ""}, {"com.google.javascript.jscomp.TypeInference", "initialize", ""}}), new String[][]{{"getParentScope", "", "0"}, {"createChildFlowScope", "", "2"}, {"getTypeOfThis", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.TemplateType", actual.getClass().getName());
  assertEquals("0 {getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getReferenceName=0, hasCachedValues=false, hasDisplayName=true, isArrayType=false, isBooleanObjectType=false, isBo...#378#-2132561296", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createEntryLattice", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", ""}, {"com.google.javascript.jscomp.TypeInference", "initialize", ""}}), new String[][]{{"getParentScope", "", "0"}, {"getParent", "", "2"}, {"getTypeOfThis", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnknownType", actual.getClass().getName());
  assertEquals("? {canBeCalled=true, getDisplayName=Unknown, getNormalizedReferenceName=?, getPossibleToBooleanOutcomes=BOTH, getPropertiesCount=2147483647, getReferenceName=?, hasCachedValues=false, hasDisplayName=t...#384#-1663040400", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createEntryLattice", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.google.javascript.jscomp.TypeInference", "initialize", ""}, {"com.google.javascript.jscomp.TypeInference", "createEntryLattice", ""}}), new String[][]{{"getParentScope", "", "0"}, {"createChildFlowScope", "", "5"}, {"getTypeOfThis", "", "4"}, {"getPropertyType", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnresolvedTypeExpression", actual.getClass().getName());
  assertEquals("? {canBeCalled=true, getDisplayName=Unknown, getNormalizedReferenceName=?, getPossibleToBooleanOutcomes=BOTH, getPropertiesCount=2147483647, getReferenceName=?, hasCachedValues=false, hasDisplayName=t...#384#-1663040400", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createEntryLattice", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.google.javascript.jscomp.TypeInference", "initialize", ""}, {"com.google.javascript.jscomp.TypeInference", "createEntryLattice", ""}}, 3), new String[][]{{"getParentScope", "", "0"}, {"getParent", "", "5"}, {"getTypeOfThis", "", "4"}, {"getPropertyType", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "analyze", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "analyze", ""}, {"com.google.javascript.jscomp.TypeInference", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope", "<null>", "<sample:4>"}, {"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope", "<sample:6>", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"java.lang.Object", "com.google.javascript.jscomp.LatticeElement"}, new String[]{"<s:a>", "<sample:7>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope"}, new String[]{"<sample:0>", "<sample:1>"}, false, 2, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope"}, new String[]{"<null>", "<sample:1>"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope"}, new String[]{"<null>", "<sample:4>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.TypeInference", "analyze", "int", "46"}, {"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "java.lang.Object,com.google.javascript.jscomp.LatticeElement", "<i:-511>", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "isForward", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,boolean", "<sample:3>", "<sample:3>", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "isForward", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.TypeInference", "flowThrough", "java.lang.Object,com.google.javascript.jscomp.LatticeElement", "<d:1.5>", "<sample:5>"}, {"com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,boolean", "<sample:2>", "<sample:4>", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "joinInputs", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "java.lang.Object,com.google.javascript.jscomp.LatticeElement", "<s:b>", "<sample:2>"}, {"com.google.javascript.jscomp.TypeInference", "getCfg", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "join", new String[]{"com.google.javascript.jscomp.LatticeElement", "com.google.javascript.jscomp.LatticeElement"}, new String[]{"<sample:4>", "<sample:5>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope", "<sample:2>", "<sample:6>"}, {"com.google.javascript.jscomp.TypeInference", "flow", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:5>"}}), new String[][]{{"getRootNode", "", "3"}, {"getJsDocBuilderForNode", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$FileLevelJsDocBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope"}, new String[]{"<sample:7>", "<sample:7>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", ""}}), new String[][]{{"getOwnSlot", "java.lang.String", "2"}, {"getName", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "analyze", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getBooleanOutcomes", new String[]{"com.google.javascript.rhino.jstype.BooleanLiteralSet", "com.google.javascript.rhino.jstype.BooleanLiteralSet", "boolean"}, new String[]{"<sample:5>", "<sample:4>", "true"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanLiteralSet", actual.getClass().getName());
  assertEquals("EMPTY", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"getSlot", "java.lang.String", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createEntryLattice", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.TypeInference", "analyze", ""}, {"com.google.javascript.jscomp.TypeInference", "analyze", "int", "-2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.LinkedFlowScope", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "initialize", new String[]{}, new String[]{}, false, 24, new String[][]{{"com.google.javascript.jscomp.TypeInference", "flowThrough", "java.lang.Object,com.google.javascript.jscomp.LatticeElement", "<s:>", "<sample:8>"}, {"com.google.javascript.jscomp.TypeInference", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:3>"}, {"com.google.javascript.jscomp.TypeInference", "getCfg", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "initialize", new String[]{}, new String[]{}, false, 25, new String[][]{{"com.google.javascript.jscomp.TypeInference", "flowThrough", "java.lang.Object,com.google.javascript.jscomp.LatticeElement", "<s:>", "<sample:8>"}, {"com.google.javascript.jscomp.TypeInference", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:3>"}, {"com.google.javascript.jscomp.TypeInference", "getCfg", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "initialize", new String[]{}, new String[]{}, false, 31, new String[][]{{"com.google.javascript.jscomp.TypeInference", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:3>"}, {"com.google.javascript.jscomp.TypeInference", "getCfg", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "initialize", new String[]{}, new String[]{}, false, 32, new String[][]{{"com.google.javascript.jscomp.TypeInference", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:3>"}, {"com.google.javascript.jscomp.TypeInference", "getCfg", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flow", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<sample:6>"}, false, 10, new String[][]{{"com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createEntryLattice", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "join", "com.google.javascript.jscomp.LatticeElement,com.google.javascript.jscomp.LatticeElement", "<sample:2>", "<null>"}, {"com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,boolean", "<sample:5>", "<sample:5>", "false"}}), new String[][]{{"getParentScope", "", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createEntryLattice", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.TypeInference", "join", "com.google.javascript.jscomp.LatticeElement,com.google.javascript.jscomp.LatticeElement", "<sample:2>", "<null>"}, {"com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,boolean", "<sample:5>", "<sample:5>", "false"}}), new String[][]{{"getParentScope", "", "6"}, {"getArgumentsVar", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Arguments", actual.getClass().getName());
  assertEquals("Scope.Var arguments{null} {getInputName=<non-file>, getName=arguments, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=true, isLocal=false, isNoShadow=false, isTypeIn...#213#290495258", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope"}, new String[]{"<sample:5>", "<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope", "<sample:0>", "<sample:2>"}, {"com.google.javascript.jscomp.TypeInference", "getCfg", ""}}), new String[][]{{"getRootNode", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "analyze", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "analyze", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.TypeInference", "analyze", "int", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.LinkedFlowScope", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope"}, new String[]{"<sample:5>", "<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", ""}}), new String[][]{{"getTypeOfThis", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope"}, new String[]{"<sample:5>", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", ""}}), new String[][]{{"getTypeOfThis", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "joinInputs", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeInference", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "joinInputs", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<sample:13>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "java.lang.Object,com.google.javascript.jscomp.LatticeElement", "<d:1.5>", "<sample:2>"}, {"com.google.javascript.jscomp.TypeInference", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "joinInputs", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<null>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "java.lang.Object,com.google.javascript.jscomp.LatticeElement", "<d:1.5>", "<sample:4>"}, {"com.google.javascript.jscomp.TypeInference", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "java.lang.Object,com.google.javascript.jscomp.LatticeElement", "<i:-1>", "<sample:5>"}, {"com.google.javascript.jscomp.TypeInference", "isForward", ""}}), new String[][]{{"getRootNode", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("RETURN 6 {getCharno=7, getChildCount=1, getDouble=!UnsupportedOperationException, getLength=0, getLineno=6, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, get...#350#-2108597987", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "joinInputs", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flow", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "flowThrough", "java.lang.Object,com.google.javascript.jscomp.LatticeElement", "<s:kdy>", "<sample:1>"}, {"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope", "<sample:7>", "<sample:4>"}, {"com.google.javascript.jscomp.TypeInference", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flow", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "flowThrough", "java.lang.Object,com.google.javascript.jscomp.LatticeElement", "<s:kdy>", "<sample:1>"}, {"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope", "<sample:7>", "<sample:4>"}, {"com.google.javascript.jscomp.TypeInference", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getBooleanOutcomes", new String[]{"com.google.javascript.rhino.jstype.BooleanLiteralSet", "com.google.javascript.rhino.jstype.BooleanLiteralSet", "boolean"}, new String[]{"<sample:0>", "<sample:5>", "true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanLiteralSet", actual.getClass().getName());
  assertEquals("TRUE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getBooleanOutcomes", new String[]{"com.google.javascript.rhino.jstype.BooleanLiteralSet", "com.google.javascript.rhino.jstype.BooleanLiteralSet", "boolean"}, new String[]{"<sample:7>", "<sample:5>", "true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanLiteralSet", actual.getClass().getName());
  assertEquals("BOTH", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope"}, new String[]{"<sample:11>", "<sample:0>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope", "<sample:5>", "<sample:6>"}, {"com.google.javascript.jscomp.TypeInference", "getCfg", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getCfg", new String[]{}, new String[]{}, false), new String[][]{{"createDirectedGraphNode", "java.lang.Object", "6"}, {"getLabel", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope"}, new String[]{"<sample:2>", "<sample:4>"}, false), new String[][]{{"optimize", "", "3"}, {"getSlot", "java.lang.String", "5"}, {"getType", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.LinkedFlowScope", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", new String[]{"java.lang.Object", "com.google.javascript.jscomp.LatticeElement"}, new String[]{"<null>", "<sample:7>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createEntryLattice", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.LinkedFlowScope", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope", "<sample:2>", "<sample:0>"}, {"com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", ""}}, 3), new String[][]{{"getOwnSlot", "java.lang.String", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createEntryLattice", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.TypeInference", "createEntryLattice", ""}}, 1), new String[][]{{"getTypeOfThis", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.NoType", actual.getClass().getName());
  assertEquals("None {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=0, getMaxArguments=2147483647, getMinArguments=0, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=EMPTY, getProper...#405#-1753506400", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createEntryLattice", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.TypeInference", "createEntryLattice", ""}}, 1), new String[][]{{"getTypeOfThis", "", "0"}, {"getImplicitPrototype", "", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createEntryLattice", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.TypeInference", "createEntryLattice", ""}}, 1), new String[][]{{"findUniqueRefinedSlot", "com.google.javascript.jscomp.FlowScope", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getBooleanOutcomes", new String[]{"com.google.javascript.rhino.jstype.BooleanLiteralSet", "com.google.javascript.rhino.jstype.BooleanLiteralSet", "boolean"}, new String[]{"<sample:0>", "<sample:7>", "false"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanLiteralSet", actual.getClass().getName());
  assertEquals("BOTH", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getBooleanOutcomes", new String[]{"com.google.javascript.rhino.jstype.BooleanLiteralSet", "com.google.javascript.rhino.jstype.BooleanLiteralSet", "boolean"}, new String[]{"<sample:1>", "<sample:6>", "true"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanLiteralSet", actual.getClass().getName());
  assertEquals("FALSE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.LinkedFlowScope", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3), new String[][]{{"createChildFlowScope", "", "6"}, {"findUniqueRefinedSlot", "com.google.javascript.jscomp.FlowScope", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2), new String[][]{{"createChildFlowScope", "", "6"}, {"findUniqueRefinedSlot", "com.google.javascript.jscomp.FlowScope", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2), new String[][]{{"createChildFlowScope", "", "6"}, {"getTypeOfThis", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.TemplateType", actual.getClass().getName());
  assertEquals("0 {getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getReferenceName=0, hasCachedValues=false, hasDisplayName=true, isArrayType=false, isBooleanObjectType=false, isBo...#378#-2132561296", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 8, new String[][]{}, 2), new String[][]{{"createChildFlowScope", "", "6"}, {"getTypeOfThis", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnknownType", actual.getClass().getName());
  assertEquals("? {canBeCalled=true, getDisplayName=Unknown, getNormalizedReferenceName=?, getPossibleToBooleanOutcomes=BOTH, getPropertiesCount=2147483647, getReferenceName=?, hasCachedValues=false, hasDisplayName=t...#384#-1663040400", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 10, new String[][]{}, 2), new String[][]{{"createChildFlowScope", "", "6"}, {"getTypeOfThis", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnresolvedTypeExpression", actual.getClass().getName());
  assertEquals("? {canBeCalled=true, getDisplayName=Unknown, getNormalizedReferenceName=?, getPossibleToBooleanOutcomes=BOTH, getPropertiesCount=2147483647, getReferenceName=?, hasCachedValues=false, hasDisplayName=t...#384#-1663040400", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 11, new String[][]{}, 2), new String[][]{{"createChildFlowScope", "", "6"}, {"getTypeOfThis", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.IndexedType", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 12, new String[][]{}, 2), new String[][]{{"createChildFlowScope", "", "6"}, {"getTypeOfThis", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.ErrorFunctionType", actual.getClass().getName());
  assertEquals("function (new:sample, *=, *=, *=): sample {canBeCalled=true, getDisplayName=sample, getExtendedInterfacesCount=0, getMaxArguments=3, getMinArguments=0, getNormalizedReferenceName=sample, getPossibleTo...#433#259964623", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "join", new String[]{"com.google.javascript.jscomp.LatticeElement", "com.google.javascript.jscomp.LatticeElement"}, new String[]{"<sample:5>", "<sample:8>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "analyze", ""}, {"com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", ""}, {"com.google.javascript.jscomp.TypeInference", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createEntryLattice", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.LinkedFlowScope", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "analyze", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "flow", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:10>"}, {"com.google.javascript.jscomp.TypeInference", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope", "<null>", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flow", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", new String[]{}, new String[]{}, false, 10, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", new String[]{}, new String[]{}, false, 13, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "computeEscaped", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set", "com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:7>", "<sample:3>", "<sample:4>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 23, new String[][]{}, 1), new String[][]{{"getOwnSlot", "java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createEntryLattice", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope", "<sample:1>", "<sample:2>"}}, 2), new String[][]{{"findUniqueRefinedSlot", "com.google.javascript.jscomp.FlowScope", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "analyze", new String[]{}, new String[]{}, false, 12, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "analyze", new String[]{}, new String[]{}, false, 13, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getBooleanOutcomes", new String[]{"com.google.javascript.rhino.jstype.BooleanLiteralSet", "com.google.javascript.rhino.jstype.BooleanLiteralSet", "boolean"}, new String[]{"<sample:0>", "<sample:6>", "true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanLiteralSet", actual.getClass().getName());
  assertEquals("FALSE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createEntryLattice", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.google.javascript.jscomp.TypeInference", "analyze", "int", "10"}}, 3), new String[][]{{"getRootNode", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("OBJECTLIT {getCharno=-1, getChildCount=3, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, ...#351#938779954", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createEntryLattice", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.TypeInference", "analyze", "int", "5"}}, 3), new String[][]{{"getRootNode", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BITOR 32 {getCharno=64, getChildCount=4, getDouble=!UnsupportedOperationException, getLength=0, getLineno=32, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, g...#353#2146048475", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "computeEscaped", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set", "com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<null>", "<sample:1>", "<sample:4>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getCfg", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "flowThrough", "java.lang.Object,com.google.javascript.jscomp.LatticeElement", "<s:key>", "<sample:5>"}, {"com.google.javascript.jscomp.TypeInference", "getCfg", ""}}, 2), new String[][]{{"disconnectInDirection", "java.lang.Object,java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "analyze", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "analyze", new String[]{"int"}, new String[]{"-2147483648"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.DataFlowAnalysis$MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "analyze", new String[]{"int"}, new String[]{"1"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", ""}, {"com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", new String[]{"java.lang.Object", "com.google.javascript.jscomp.LatticeElement"}, new String[]{"<sample:5>", "<sample:0>"}, false, 9, new String[][]{{"com.google.javascript.jscomp.TypeInference", "flowThrough", "java.lang.Object,com.google.javascript.jscomp.LatticeElement", "<s:b>", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope"}, new String[]{"<sample:11>", "<sample:3>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope"}, new String[]{"<sample:2>", "<sample:5>"}, false, 0, null, 2), new String[][]{{"getOwnSlot", "java.lang.String", "0"}, {"isTypeInferred", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "analyze", new String[]{"int"}, new String[]{"-1073741824"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", ""}, {"com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.DataFlowAnalysis$MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getBooleanOutcomes", new String[]{"com.google.javascript.rhino.jstype.BooleanLiteralSet", "com.google.javascript.rhino.jstype.BooleanLiteralSet", "boolean"}, new String[]{"<sample:5>", "<sample:6>", "false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanLiteralSet", actual.getClass().getName());
  assertEquals("BOTH", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getBooleanOutcomes", new String[]{"com.google.javascript.rhino.jstype.BooleanLiteralSet", "com.google.javascript.rhino.jstype.BooleanLiteralSet", "boolean"}, new String[]{"<sample:4>", "<sample:5>", "true"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanLiteralSet", actual.getClass().getName());
  assertEquals("TRUE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getBooleanOutcomes", new String[]{"com.google.javascript.rhino.jstype.BooleanLiteralSet", "com.google.javascript.rhino.jstype.BooleanLiteralSet", "boolean"}, new String[]{"<sample:4>", "<sample:4>", "false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanLiteralSet", actual.getClass().getName());
  assertEquals("EMPTY", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getBooleanOutcomes", new String[]{"com.google.javascript.rhino.jstype.BooleanLiteralSet", "com.google.javascript.rhino.jstype.BooleanLiteralSet", "boolean"}, new String[]{"<sample:6>", "<sample:4>", "true"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanLiteralSet", actual.getClass().getName());
  assertEquals("FALSE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.google.javascript.jscomp.TypeInference", "isForward", ""}, {"com.google.javascript.jscomp.TypeInference", "initialize", ""}, {"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope", "<sample:1>", "<sample:2>"}}, 1), new String[][]{{"findUniqueRefinedSlot", "com.google.javascript.jscomp.FlowScope", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"completeScope", "com.google.javascript.jscomp.Scope", "6"}, {"getOwnSlot", "java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "computeEscaped", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set", "com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:0>", "<sample:2>", "<sample:2>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "computeEscaped", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set", "com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:3>", "<empty>", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "computeEscaped", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set", "com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:4>", "<sample:0>", "<null>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "computeEscaped", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set", "com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<null>", "<sample:0>", "<sample:4>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getCfg", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.ControlFlowGraph", actual.getClass().getName());
  assertEquals("{getName=LinkedGraph, isDirected=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getCfg", new String[]{}, new String[]{}, false, 12, new String[][]{}, 2), new String[][]{{"clearEdgeAnnotations", "", "4"}, {"getNeighborNodes", "java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getCfg", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.google.javascript.jscomp.TypeInference", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope", "<sample:7>", "<sample:5>"}}, 2), new String[][]{{"clearEdgeAnnotations", "", "4"}, {"getDirectedSuccNodes", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getCfg", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"getDirectedSuccNodes", "java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getCfg", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1), new String[][]{{"getDirectedSuccNodes", "java.lang.Object", "4"}, {"addAll", "java.util.Collection", "0"}, {"ensureCapacity", "int", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getCfg", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.google.javascript.jscomp.TypeInference", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope", "<sample:1>", "<sample:7>"}}), new String[][]{{"getDirectedSuccNodes", "java.lang.Object", "4"}, {"addAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getCfg", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.google.javascript.jscomp.TypeInference", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope", "<sample:1>", "<sample:7>"}}), new String[][]{{"getDirectedSuccNodes", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createEntryLattice", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,boolean", "<sample:2>", "<null>", "true"}, {"com.google.javascript.jscomp.TypeInference", "join", "com.google.javascript.jscomp.LatticeElement,com.google.javascript.jscomp.LatticeElement", "<sample:2>", "<sample:0>"}}, 3), new String[][]{{"getTypeOfThis", "", "1"}, {"hasImplementedInterfaces", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getCfg", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "java.lang.Object,com.google.javascript.jscomp.LatticeElement", "<i:0>", "<sample:0>"}, {"com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.ControlFlowGraph", actual.getClass().getName());
  assertEquals("{getName=LinkedGraph, isDirected=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getCfg", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.google.javascript.jscomp.TypeInference", "createEntryLattice", ""}, {"com.google.javascript.jscomp.TypeInference", "initialize", ""}}, 3), new String[][]{{"connectToImplicitReturn", "java.lang.Object,com.google.javascript.jscomp.ControlFlowGraph$Branch", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getCfg", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"isDirected", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope"}, new String[]{"<sample:9>", "<sample:4>"}, false, 14, new String[][]{{"com.google.javascript.jscomp.TypeInference", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope", "<sample:4>", "<sample:5>"}, {"com.google.javascript.jscomp.TypeInference", "initialize", ""}, {"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "java.lang.Object,com.google.javascript.jscomp.LatticeElement", "<b:true>", "<sample:0>"}}, 3), new String[][]{{"getRootNode", "", "6"}, {"getNext", "", "2"}, {"getJsDocBuilderForNode", "", "0"}, {"append", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$FileLevelJsDocBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope"}, new String[]{"<sample:12>", "<sample:1>"}, false, 15, new String[][]{{"com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", ""}, {"com.google.javascript.jscomp.TypeInference", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope", "<sample:4>", "<sample:5>"}}, 2), new String[][]{{"getRootNode", "", "6"}, {"getNext", "", "2"}, {"getSourceFileName", "", "0"}, {"getIntProp", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"optimize", "", "0"}, {"optimize", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.LinkedFlowScope", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope"}, new String[]{"<sample:1>", "<sample:8>"}, false, 10, new String[][]{{"com.google.javascript.jscomp.TypeInference", "flowThrough", "java.lang.Object,com.google.javascript.jscomp.LatticeElement", "<i:-1>", "<sample:0>"}, {"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope", "<sample:0>", "<sample:6>"}}, 1), new String[][]{{"createChildFlowScope", "", "5"}, {"findUniqueRefinedSlot", "com.google.javascript.jscomp.FlowScope", "7"}, {"isTypeInferred", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope"}, new String[]{"<sample:14>", "<sample:10>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,boolean", "<sample:3>", "<sample:4>", "true"}, {"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope", "<sample:5>", "<sample:4>"}}, 3), new String[][]{{"inferSlotType", "java.lang.String,com.google.javascript.rhino.jstype.JSType", "7"}, {"inferSlotType", "java.lang.String,com.google.javascript.rhino.jstype.JSType", "0"}, {"findUniqueRefinedSlot", "com.google.javascript.jscomp.FlowScope", "3"}, {"getName", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope"}, new String[]{"<sample:3>", "<sample:8>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,boolean", "<sample:3>", "<sample:4>", "true"}, {"com.google.javascript.jscomp.TypeInference", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope", "<sample:5>", "<sample:3>"}, {"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope", "<sample:5>", "<sample:4>"}}, 3), new String[][]{{"getParentScope", "", "7"}, {"getSlot", "java.lang.String", "0"}, {"getName", "", "3"}, {"getName", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope"}, new String[]{"<sample:12>", "<sample:9>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,boolean", "<sample:3>", "<sample:4>", "true"}, {"com.google.javascript.jscomp.TypeInference", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope", "<sample:5>", "<sample:3>"}, {"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope", "<sample:5>", "<sample:4>"}}, 3), new String[][]{{"getParentScope", "", "7"}, {"getSlot", "java.lang.String", "0"}, {"getName", "", "3"}, {"getName", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "computeEscaped", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set", "com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<null>", "<sample:0>", "<sample:8>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeInference", "analyze", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.LinkedFlowScope", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getCfg", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3), new String[][]{{"clearEdgeAnnotations", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.ControlFlowGraph", actual.getClass().getName());
  assertEquals("{getName=LinkedGraph, isDirected=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getCfg", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.TypeInference", "createEntryLattice", ""}, {"com.google.javascript.jscomp.TypeInference", "flow", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:4>"}}, 3), new String[][]{{"getName", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("LinkedGraph", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getBooleanOutcomes", new String[]{"com.google.javascript.rhino.jstype.BooleanLiteralSet", "com.google.javascript.rhino.jstype.BooleanLiteralSet", "boolean"}, new String[]{"<sample:4>", "<sample:0>", "true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanLiteralSet", actual.getClass().getName());
  assertEquals("EMPTY", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createEntryLattice", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,boolean", "<sample:1>", "<sample:0>", "true"}, {"com.google.javascript.jscomp.TypeInference", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope", "<sample:3>", "<sample:0>"}}, 2), new String[][]{{"getRootNode", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("EQ 0 {getCharno=0, getChildCount=2, getDouble=!UnsupportedOperationException, getLength=0, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getSour...#343#530499584", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createEntryLattice", new String[]{}, new String[]{}, false, 47, new String[][]{{"com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,boolean", "<sample:3>", "<sample:6>", "true"}, {"com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,boolean", "<sample:1>", "<null>", "true"}, {"com.google.javascript.jscomp.TypeInference", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope", "<sample:2>", "<sample:3>"}}, 2), new String[][]{{"getOwnSlot", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createEntryLattice", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,boolean", "<sample:3>", "<sample:6>", "true"}, {"com.google.javascript.jscomp.TypeInference", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope", "<sample:2>", "<sample:2>"}}, 2), new String[][]{{"getTypeOfThis", "", "0"}, {"hasOwnProperty", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createEntryLattice", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,boolean", "<sample:3>", "<sample:6>", "true"}, {"com.google.javascript.jscomp.TypeInference", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope", "<sample:4>", "<sample:5>"}, {"com.google.javascript.jscomp.TypeInference", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope", "<sample:2>", "<sample:2>"}}, 2), new String[][]{{"getTypeOfThis", "", "0"}, {"hasOwnProperty", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createEntryLattice", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,boolean", "<sample:3>", "<sample:6>", "true"}, {"com.google.javascript.jscomp.TypeInference", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope", "<sample:4>", "<sample:5>"}, {"com.google.javascript.jscomp.TypeInference", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope", "<sample:2>", "<sample:2>"}}, 2), new String[][]{{"getTypeOfThis", "", "0"}, {"hasOwnProperty", "java.lang.String", "2"}, {"getImplicitPrototype", "", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createEntryLattice", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,boolean", "<sample:3>", "<sample:6>", "true"}, {"com.google.javascript.jscomp.TypeInference", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope", "<sample:4>", "<sample:5>"}, {"com.google.javascript.jscomp.TypeInference", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope", "<sample:2>", "<sample:2>"}}, 2), new String[][]{{"getTypeOfThis", "", "0"}, {"getSuperClassConstructor", "", "2"}, {"getExtendedInterfacesCount", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.TypeInference", "analyze", "int", "2147483647"}, {"com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,boolean", "<sample:1>", "<sample:3>", "true"}}), new String[][]{{"getRootNode", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.TypeInference", "getCfg", ""}, {"com.google.javascript.jscomp.TypeInference", "analyze", ""}, {"com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,boolean", "<sample:4>", "<null>", "false"}}), new String[][]{{"inferSlotType", "java.lang.String,com.google.javascript.rhino.jstype.JSType", "6"}, {"getSlot", "java.lang.String", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.google.javascript.jscomp.TypeInference", "getCfg", ""}, {"com.google.javascript.jscomp.TypeInference", "analyze", ""}, {"com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,boolean", "<sample:4>", "<null>", "false"}}, 2), new String[][]{{"inferSlotType", "java.lang.String,com.google.javascript.rhino.jstype.JSType", "6"}, {"getSlot", "java.lang.String", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.TypeInference", "initialize", ""}}), new String[][]{{"getRootNode", "", "1"}, {"getQualifiedName", "", "4"}, {"hasChild", "com.google.javascript.rhino.Node", "4"}, {"getFirstChild", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BITAND {getCharno=-1, getChildCount=1, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, get...#348#2060427106", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.TypeInference", "initialize", ""}}, 1), new String[][]{{"getRootNode", "", "1"}, {"getQualifiedName", "", "4"}, {"hasChild", "com.google.javascript.rhino.Node", "4"}, {"getFirstChild", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BITAND {getCharno=-1, getChildCount=1, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, get...#348#2060427106", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.google.javascript.jscomp.TypeInference", "initialize", ""}}, 1), new String[][]{{"getRootNode", "", "1"}, {"getQualifiedName", "", "4"}, {"hasChild", "com.google.javascript.rhino.Node", "4"}, {"getFirstChild", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.google.javascript.jscomp.TypeInference", "initialize", ""}}, 1), new String[][]{{"getRootNode", "", "1"}, {"getQualifiedName", "", "4"}, {"hasChild", "com.google.javascript.rhino.Node", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "join", new String[]{"com.google.javascript.jscomp.LatticeElement", "com.google.javascript.jscomp.LatticeElement"}, new String[]{"<null>", "<null>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", ""}, {"com.google.javascript.jscomp.TypeInference", "analyze", "int", "1"}, {"com.google.javascript.jscomp.TypeInference", "isForward", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "analyze", new String[]{"int"}, new String[]{"43"}, false, 3, new String[][]{{"com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "analyze", new String[]{"int"}, new String[]{"-15"}, false, 3, new String[][]{{"com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.DataFlowAnalysis$MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1), new String[][]{{"getRootNode", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BITOR 32 {getCharno=64, getChildCount=4, getDouble=!UnsupportedOperationException, getLength=0, getLineno=32, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, g...#353#2146048475", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1), new String[][]{{"getRootNode", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BITXOR {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, get...#350#459879196", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 8, new String[][]{}, 1), new String[][]{{"getRootNode", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("EQ 0 {getCharno=0, getChildCount=2, getDouble=!UnsupportedOperationException, getLength=0, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getSour...#343#530499584", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 10, new String[][]{}, 1), new String[][]{{"getRootNode", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("GT {getCharno=-1, getChildCount=2, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getSour...#344#-1442649439", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 11, new String[][]{}, 1), new String[][]{{"getRootNode", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("OBJECTLIT {getCharno=-1, getChildCount=3, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, ...#351#938779954", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createEntryLattice", new String[]{}, new String[]{}, false, 10, new String[][]{}, 3), new String[][]{{"getSlot", "java.lang.String", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope"}, new String[]{"<sample:4>", "<sample:3>"}, false, 0, null, 3), new String[][]{{"getTypeOfThis", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope"}, new String[]{"<sample:3>", "<sample:1>"}, false, 0, null, 3), new String[][]{{"getTypeOfThis", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "analyze", new String[]{"int"}, new String[]{"-2147483647"}, false, 5, new String[][]{{"com.google.javascript.jscomp.TypeInference", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope", "<sample:1>", "<sample:5>"}, {"com.google.javascript.jscomp.TypeInference", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope", "<sample:3>", "<null>"}, {"com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.DataFlowAnalysis$MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "analyze", new String[]{"int"}, new String[]{"2147483647"}, false, 5, new String[][]{{"com.google.javascript.jscomp.TypeInference", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope", "<sample:1>", "<sample:5>"}, {"com.google.javascript.jscomp.TypeInference", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope", "<sample:3>", "<null>"}, {"com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
}
