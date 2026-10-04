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
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"java.lang.Object", "com.google.javascript.jscomp.graph.LatticeElement"}, new String[]{"<d:1.5>", "<null>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.TypeInference", "analyze", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"java.lang.Object", "com.google.javascript.jscomp.graph.LatticeElement"}, new String[]{"<d:1.5>", "<sample:7>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.TypeInference", "createEntryLattice", ""}, {"com.google.javascript.jscomp.TypeInference", "analyze", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"java.lang.Object", "com.google.javascript.jscomp.graph.LatticeElement"}, new String[]{"<d:1.5>", "<sample:7>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.TypeInference", "createEntryLattice", ""}, {"com.google.javascript.jscomp.TypeInference", "analyze", ""}, {"com.google.javascript.jscomp.TypeInference", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<null>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", new String[]{"com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "boolean"}, new String[]{"<sample:7>", "<sample:6>", "true"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", new String[]{"com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "boolean"}, new String[]{"<sample:1>", "<sample:1>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "getCfg", ""}, {"com.google.javascript.jscomp.TypeInference", "join", "com.google.javascript.jscomp.graph.LatticeElement,com.google.javascript.jscomp.graph.LatticeElement", "<sample:1>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", new String[]{"com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "boolean"}, new String[]{"<sample:0>", "<sample:1>", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "getCfg", ""}, {"com.google.javascript.jscomp.TypeInference", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:3>", "<sample:5>"}, {"com.google.javascript.jscomp.TypeInference", "join", "com.google.javascript.jscomp.graph.LatticeElement,com.google.javascript.jscomp.graph.LatticeElement", "<sample:1>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope"}, new String[]{"<null>", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "createEntryLattice", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "analyze", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "analyze", new String[]{}, new String[]{}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flow", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flow", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "join", new String[]{"com.google.javascript.jscomp.graph.LatticeElement", "com.google.javascript.jscomp.graph.LatticeElement"}, new String[]{"<sample:5>", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "computeEscaped", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set", "com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:1>", "<empty>", "<sample:3>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "computeEscaped", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set", "com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:4>", "<sample:0>", "<sample:1>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "computeEscaped", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set", "com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:0>", "<sample:0>", "<sample:1>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope"}, new String[]{"<sample:2>", "<sample:2>"}, false);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope"}, new String[]{"<sample:6>", "<sample:0>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", ""}}, 1);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope"}, new String[]{"<sample:6>", "<sample:4>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:3>", "<sample:4>"}, {"com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", ""}}, 1);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope"}, new String[]{"<sample:5>", "<sample:4>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", ""}}), new String[][]{{"getOwnSlot", "java.lang.String", "3"}, {"isTypeInferred", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.LinkedFlowScope", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.LinkedFlowScope", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,boolean", "<sample:4>", "<sample:1>", "true"}}), new String[][]{{"completeScope", "com.google.javascript.rhino.jstype.StaticScope", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", ""}, {"com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,boolean", "<sample:3>", "<sample:1>", "true"}}, 1), new String[][]{{"completeScope", "com.google.javascript.rhino.jstype.StaticScope", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", ""}, {"com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,boolean", "<sample:3>", "<sample:1>", "true"}}, 1), new String[][]{{"inferSlotType", "java.lang.String,com.google.javascript.rhino.jstype.JSType", "0"}, {"createChildFlowScope", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.LinkedFlowScope", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createEntryLattice", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.LinkedFlowScope", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope"}, new String[]{"<sample:4>", "<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope"}, new String[]{"<sample:5>", "<sample:2>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeInference", "analyze", "int", "-2147483648"}, {"com.google.javascript.jscomp.TypeInference", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "isForward", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope"}, new String[]{"<null>", "<sample:1>"}, false, 14, new String[][]{{"com.google.javascript.jscomp.TypeInference", "analyze", "int", "-2147483648"}, {"com.google.javascript.jscomp.TypeInference", "initialize", ""}, {"com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,boolean", "<sample:4>", "<sample:3>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", new String[]{"java.lang.Object", "com.google.javascript.jscomp.graph.LatticeElement"}, new String[]{"<sample:1>", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope"}, new String[]{"<sample:2>", "<sample:4>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "initialize", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.TypeInference", "analyze", "int", "10"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope"}, new String[]{"<sample:6>", "<sample:4>"}, false, 8, new String[][]{{"com.google.javascript.jscomp.TypeInference", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getBooleanOutcomes", new String[]{"com.google.javascript.rhino.jstype.BooleanLiteralSet", "com.google.javascript.rhino.jstype.BooleanLiteralSet", "boolean"}, new String[]{"<sample:4>", "<sample:3>", "true"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanLiteralSet", actual.getClass().getName());
  assertEquals("BOTH", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createEntryLattice", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.LinkedFlowScope", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", new String[]{"com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "boolean"}, new String[]{"<sample:6>", "<sample:6>", "false"}, false, 13, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "joinInputs", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", new String[]{"com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "boolean"}, new String[]{"<sample:7>", "<sample:1>", "true"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", new String[]{"com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "boolean"}, new String[]{"<sample:0>", "<sample:1>", "false"}, false, 15, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getBooleanOutcomes", new String[]{"com.google.javascript.rhino.jstype.BooleanLiteralSet", "com.google.javascript.rhino.jstype.BooleanLiteralSet", "boolean"}, new String[]{"<sample:4>", "<sample:5>", "true"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanLiteralSet", actual.getClass().getName());
  assertEquals("TRUE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope"}, new String[]{"<sample:6>", "<sample:5>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", ""}, {"com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,boolean", "<sample:6>", "<null>", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope"}, new String[]{"<sample:7>", "<sample:0>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", ""}, {"com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,boolean", "<sample:6>", "<null>", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "analyze", new String[]{"int"}, new String[]{"2147483647"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "initialize", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", ""}, {"com.google.javascript.jscomp.TypeInference", "initialize", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "initialize", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeInference", "analyze", "int", "1"}, {"com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "initialize", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", ""}, {"com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", ""}, {"com.google.javascript.jscomp.TypeInference", "isForward", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope"}, new String[]{"<sample:2>", "<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", ""}, {"com.google.javascript.jscomp.TypeInference", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:0>"}}), new String[][]{{"getOwnSlot", "java.lang.String", "2"}, {"getType", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope"}, new String[]{"<sample:2>", "<sample:10>"}, false, 13, new String[][]{{"com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", ""}, {"com.google.javascript.jscomp.TypeInference", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:0>"}, {"com.google.javascript.jscomp.TypeInference", "flow", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:4>"}}), new String[][]{{"getOwnSlot", "java.lang.String", "2"}, {"getType", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope"}, new String[]{"<sample:2>", "<sample:6>"}, false, 13, new String[][]{{"com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", ""}, {"com.google.javascript.jscomp.TypeInference", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:4>"}}), new String[][]{{"getOwnSlot", "java.lang.String", "2"}, {"getType", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope"}, new String[]{"<sample:2>", "<sample:5>"}, false, 13, new String[][]{{"com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", ""}, {"com.google.javascript.jscomp.TypeInference", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:4>"}}), new String[][]{{"getOwnSlot", "java.lang.String", "2"}, {"getType", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope"}, new String[]{"<sample:2>", "<sample:5>"}, false, 13, new String[][]{{"com.google.javascript.jscomp.TypeInference", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:7>"}}), new String[][]{{"getSlot", "java.lang.String", "2"}, {"getJSDocInfo", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.JSDocInfo", actual.getClass().getName());
  assertEquals("JSDocInfo {containsDeclaration=false, getBlockDescription=null, getDeprecationReason=null, getDescription=null, getExtendedInterfacesCount=0, getFileOverview=null, getImplementedInterfaceCount=0, getL...#390#-1856857836", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope"}, new String[]{"<sample:7>", "<sample:5>"}, false, 9, new String[][]{}, 3), new String[][]{{"getSlot", "java.lang.String", "2"}, {"getJSDocInfo", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.JSDocInfo", actual.getClass().getName());
  assertEquals("JSDocInfo {containsDeclaration=false, getBlockDescription=null, getDeprecationReason=null, getDescription=null, getExtendedInterfacesCount=0, getFileOverview=null, getImplementedInterfaceCount=0, getL...#390#-1856857836", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope"}, new String[]{"<sample:8>", "<null>"}, false, 9, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope"}, new String[]{"<sample:4>", "<sample:3>"}, false, 10, new String[][]{}, 3), new String[][]{{"getSlot", "java.lang.String", "5"}, {"getJSDocInfo", "", "1"}, {"isNoAlias", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope"}, new String[]{"<sample:5>", "<sample:6>"}, false, 10, new String[][]{{"com.google.javascript.jscomp.TypeInference", "getCfg", ""}, {"com.google.javascript.jscomp.TypeInference", "analyze", ""}}, 3), new String[][]{{"getSlot", "java.lang.String", "5"}, {"getDeclaration", "", "1"}, {"getSourceFile", "", "2"}, {"getLineOfOffset", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope"}, new String[]{"<sample:7>", "<sample:2>"}, false, 11, new String[][]{{"com.google.javascript.jscomp.TypeInference", "getCfg", ""}, {"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:3>", "<sample:0>"}, {"com.google.javascript.jscomp.TypeInference", "analyze", ""}}, 2), new String[][]{{"getSlot", "java.lang.String", "5"}, {"getDeclaration", "", "1"}, {"getSourceFile", "", "1"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope"}, new String[]{"<sample:7>", "<sample:2>"}, false, 11, new String[][]{{"com.google.javascript.jscomp.TypeInference", "getCfg", ""}, {"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:3>", "<sample:0>"}, {"com.google.javascript.jscomp.TypeInference", "analyze", ""}}, 2), new String[][]{{"getSlot", "java.lang.String", "5"}, {"getDeclaration", "", "1"}, {"getSourceFile", "", "1"}, {"isExtern", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getCfg", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.ControlFlowGraph", actual.getClass().getName());
  assertEquals("{getName=LinkedGraph, isDirected=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getCfg", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "isForward", ""}}), new String[][]{{"getNeighborNodes", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "flowThrough", "java.lang.Object,com.google.javascript.jscomp.graph.LatticeElement", "<s:b>", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "initialize", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "analyze", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "analyze", "int", "0"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope"}, new String[]{"<null>", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,boolean", "<sample:1>", "<sample:0>", "true"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getCfg", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.TypeInference", "flow", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:1>"}}, 2), new String[][]{{"getImplicitReturn", "", "4"}, {"getOutEdges", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "computeEscaped", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set", "com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:3>", "<sample:1>", "<sample:5>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope"}, new String[]{"<sample:4>", "<sample:4>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.TypeInference", "analyze", ""}, {"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "java.lang.Object,com.google.javascript.jscomp.graph.LatticeElement", "<i:2>", "<null>"}, {"com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,boolean", "<sample:0>", "<sample:1>", "false"}}, 1), new String[][]{{"getRootNode", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$NumberNode", actual.getClass().getName());
  assertEquals("NUMBER -Infinity {getCharno=-1, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getSourcePosit...#339#1917934166", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope"}, new String[]{"<sample:5>", "<sample:0>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.TypeInference", "analyze", ""}, {"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "java.lang.Object,com.google.javascript.jscomp.graph.LatticeElement", "<i:1>", "<sample:1>"}, {"com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,boolean", "<sample:7>", "<sample:1>", "true"}}, 2), new String[][]{{"getRootNode", "", "1"}, {"getSourcePosition", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "analyze", "int", "0"}}, 2), new String[][]{{"getOwnSlot", "java.lang.String", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope"}, new String[]{"<sample:2>", "<sample:5>"}, false, 0, null, 3), new String[][]{{"getOwnSlot", "java.lang.String", "1"}, {"getType", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope"}, new String[]{"<sample:5>", "<sample:1>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "java.lang.Object,com.google.javascript.jscomp.graph.LatticeElement", "<i:1>", "<sample:1>"}, {"com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,boolean", "<sample:7>", "<sample:1>", "true"}}, 3), new String[][]{{"getRootNode", "", "1"}, {"getSourcePosition", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.TypeInference", "createEntryLattice", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope"}, new String[]{"<sample:7>", "<sample:1>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "java.lang.Object,com.google.javascript.jscomp.graph.LatticeElement", "<i:45>", "<sample:7>"}, {"com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,boolean", "<sample:7>", "<sample:0>", "true"}, {"com.google.javascript.jscomp.TypeInference", "initialize", ""}}, 3), new String[][]{{"getRootNode", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "joinInputs", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<sample:5>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope"}, new String[]{"<sample:0>", "<sample:6>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,boolean", "<sample:1>", "<sample:0>", "true"}, {"com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", ""}}, 3), new String[][]{{"getRootNode", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$NumberNode", actual.getClass().getName());
  assertEquals("NUMBER -Infinity {getCharno=-1, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getSourcePosit...#339#1917934166", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope"}, new String[]{"<sample:7>", "<sample:7>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.TypeInference", "initialize", ""}, {"com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,boolean", "<sample:4>", "<sample:0>", "true"}, {"com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", ""}}, 2), new String[][]{{"getRootNode", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope"}, new String[]{"<sample:5>", "<sample:10>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.TypeInference", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:6>"}, {"com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,boolean", "<sample:5>", "<sample:0>", "true"}}, 1), new String[][]{{"getRootNode", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING <a><b>t</b></a> {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#351#302262130", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope"}, new String[]{"<sample:3>", "<sample:6>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,boolean", "<sample:4>", "<sample:0>", "true"}, {"com.google.javascript.jscomp.TypeInference", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:6>", "<sample:2>"}, {"com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,boolean", "<sample:4>", "<sample:3>", "true"}}, 1), new String[][]{{"getRootNode", "", "5"}, {"getLineno", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope"}, new String[]{"<sample:11>", "<sample:4>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.TypeInference", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:0>", "<sample:1>"}, {"com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,boolean", "<sample:4>", "<sample:2>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope"}, new String[]{"<sample:13>", "<sample:1>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.TypeInference", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:0>", "<sample:7>"}, {"com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,boolean", "<sample:4>", "<sample:2>", "false"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getBooleanOutcomes", new String[]{"com.google.javascript.rhino.jstype.BooleanLiteralSet", "com.google.javascript.rhino.jstype.BooleanLiteralSet", "boolean"}, new String[]{"<sample:7>", "<sample:1>", "false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanLiteralSet", actual.getClass().getName());
  assertEquals("TRUE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getBooleanOutcomes", new String[]{"com.google.javascript.rhino.jstype.BooleanLiteralSet", "com.google.javascript.rhino.jstype.BooleanLiteralSet", "boolean"}, new String[]{"<sample:6>", "<sample:4>", "false"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanLiteralSet", actual.getClass().getName());
  assertEquals("EMPTY", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope"}, new String[]{"<sample:13>", "<sample:3>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.TypeInference", "createEntryLattice", ""}, {"com.google.javascript.jscomp.TypeInference", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:2>", "<sample:7>"}, {"com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,boolean", "<sample:4>", "<sample:2>", "false"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flow", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<sample:0>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "analyze", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:6>", "<sample:6>"}, {"com.google.javascript.jscomp.TypeInference", "analyze", "int", "0"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "join", new String[]{"com.google.javascript.jscomp.graph.LatticeElement", "com.google.javascript.jscomp.graph.LatticeElement"}, new String[]{"<sample:5>", "<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope"}, new String[]{"<sample:4>", "<sample:0>"}, false, 14, new String[][]{{"com.google.javascript.jscomp.TypeInference", "isForward", ""}, {"com.google.javascript.jscomp.TypeInference", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:4>", "<sample:7>"}, {"com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,boolean", "<sample:3>", "<sample:5>", "false"}}, 2), new String[][]{{"completeScope", "com.google.javascript.rhino.jstype.StaticScope", "6"}, {"createChildFlowScope", "", "1"}, {"getParentScope", "", "7"}, {"getRootNode", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("ERROR {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getS...#349#637856945", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flow", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<null>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", ""}, {"com.google.javascript.jscomp.TypeInference", "createEntryLattice", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope"}, new String[]{"<sample:4>", "<sample:9>"}, false, 15, new String[][]{{"com.google.javascript.jscomp.TypeInference", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:3>", "<sample:7>"}, {"com.google.javascript.jscomp.TypeInference", "getCfg", ""}, {"com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,boolean", "<sample:5>", "<sample:5>", "false"}}, 1), new String[][]{{"getOwnSlot", "java.lang.String", "2"}, {"isTypeInferred", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "joinInputs", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", ""}, {"com.google.javascript.jscomp.TypeInference", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createEntryLattice", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.LinkedFlowScope", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "join", new String[]{"com.google.javascript.jscomp.graph.LatticeElement", "com.google.javascript.jscomp.graph.LatticeElement"}, new String[]{"<sample:5>", "<sample:6>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:2>", "<sample:5>"}, {"com.google.javascript.jscomp.TypeInference", "getCfg", ""}, {"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "java.lang.Object,com.google.javascript.jscomp.graph.LatticeElement", "<b:true>", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "join", new String[]{"com.google.javascript.jscomp.graph.LatticeElement", "com.google.javascript.jscomp.graph.LatticeElement"}, new String[]{"<null>", "<null>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:2>", "<sample:5>"}, {"com.google.javascript.jscomp.TypeInference", "getCfg", ""}, {"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "java.lang.Object,com.google.javascript.jscomp.graph.LatticeElement", "<b:true>", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "analyze", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:5>", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createEntryLattice", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.TypeInference", "analyze", "int", "-2147483648"}, {"com.google.javascript.jscomp.TypeInference", "initialize", ""}}), new String[][]{{"completeScope", "com.google.javascript.rhino.jstype.StaticScope", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.google.javascript.jscomp.TypeInference", "flowThrough", "java.lang.Object,com.google.javascript.jscomp.graph.LatticeElement", "<i:1>", "<sample:4>"}, {"com.google.javascript.jscomp.TypeInference", "initialize", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.LinkedFlowScope", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"getOwnSlot", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "isForward", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", ""}, {"com.google.javascript.jscomp.TypeInference", "initialize", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getBooleanOutcomes", new String[]{"com.google.javascript.rhino.jstype.BooleanLiteralSet", "com.google.javascript.rhino.jstype.BooleanLiteralSet", "boolean"}, new String[]{"<sample:3>", "<sample:0>", "true"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanLiteralSet", actual.getClass().getName());
  assertEquals("FALSE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getBooleanOutcomes", new String[]{"com.google.javascript.rhino.jstype.BooleanLiteralSet", "com.google.javascript.rhino.jstype.BooleanLiteralSet", "boolean"}, new String[]{"<sample:3>", "<sample:5>", "true"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanLiteralSet", actual.getClass().getName());
  assertEquals("BOTH", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getBooleanOutcomes", new String[]{"com.google.javascript.rhino.jstype.BooleanLiteralSet", "com.google.javascript.rhino.jstype.BooleanLiteralSet", "boolean"}, new String[]{"<sample:3>", "<sample:8>", "true"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanLiteralSet", actual.getClass().getName());
  assertEquals("FALSE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getBooleanOutcomes", new String[]{"com.google.javascript.rhino.jstype.BooleanLiteralSet", "com.google.javascript.rhino.jstype.BooleanLiteralSet", "boolean"}, new String[]{"<sample:4>", "<sample:8>", "true"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanLiteralSet", actual.getClass().getName());
  assertEquals("EMPTY", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "analyze", new String[]{"int"}, new String[]{"1"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getBooleanOutcomes", new String[]{"com.google.javascript.rhino.jstype.BooleanLiteralSet", "com.google.javascript.rhino.jstype.BooleanLiteralSet", "boolean"}, new String[]{"<sample:5>", "<sample:4>", "false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanLiteralSet", actual.getClass().getName());
  assertEquals("TRUE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getBooleanOutcomes", new String[]{"com.google.javascript.rhino.jstype.BooleanLiteralSet", "com.google.javascript.rhino.jstype.BooleanLiteralSet", "boolean"}, new String[]{"<sample:4>", "<sample:4>", "false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanLiteralSet", actual.getClass().getName());
  assertEquals("EMPTY", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope"}, new String[]{"<sample:5>", "<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "java.lang.Object,com.google.javascript.jscomp.graph.LatticeElement", "<i:-1>", "<sample:1>"}, {"com.google.javascript.jscomp.TypeInference", "initialize", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "initialize", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "initialize", new String[]{}, new String[]{}, false, 14, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flow", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<sample:3>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope"}, new String[]{"<sample:4>", "<null>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.TypeInference", "join", "com.google.javascript.jscomp.graph.LatticeElement,com.google.javascript.jscomp.graph.LatticeElement", "<sample:4>", "<sample:11>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "analyze", new String[]{"int"}, new String[]{"10"}, false, 7, new String[][]{{"com.google.javascript.jscomp.TypeInference", "flowThrough", "java.lang.Object,com.google.javascript.jscomp.graph.LatticeElement", "<b:true>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "analyze", new String[]{"int"}, new String[]{"-4"}, false, 7, new String[][]{{"com.google.javascript.jscomp.TypeInference", "flowThrough", "java.lang.Object,com.google.javascript.jscomp.graph.LatticeElement", "<b:true>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.DataFlowAnalysis$MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "joinInputs", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<null>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.TypeInference", "createEntryLattice", ""}, {"com.google.javascript.jscomp.TypeInference", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:5>", "<sample:1>"}, {"com.google.javascript.jscomp.TypeInference", "initialize", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getBooleanOutcomes", new String[]{"com.google.javascript.rhino.jstype.BooleanLiteralSet", "com.google.javascript.rhino.jstype.BooleanLiteralSet", "boolean"}, new String[]{"<sample:4>", "<sample:3>", "true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanLiteralSet", actual.getClass().getName());
  assertEquals("BOTH", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope"}, new String[]{"<sample:6>", "<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "initialize", ""}, {"com.google.javascript.jscomp.TypeInference", "createEntryLattice", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope"}, new String[]{"<sample:3>", "<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "flowThrough", "java.lang.Object,com.google.javascript.jscomp.graph.LatticeElement", "<s:j6ey>", "<sample:0>"}}, 1), new String[][]{{"findUniqueRefinedSlot", "com.google.javascript.jscomp.type.FlowScope", "5"}, {"getName", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope"}, new String[]{"<sample:2>", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "java.lang.Object,com.google.javascript.jscomp.graph.LatticeElement", "<i:1>", "<null>"}}, 1), new String[][]{{"inferSlotType", "java.lang.String,com.google.javascript.rhino.jstype.JSType", "4"}, {"getTypeOfThis", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createEntryLattice", new String[]{}, new String[]{}, false, 16, new String[][]{}, 3), new String[][]{{"getTypeOfThis", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.NamedType", actual.getClass().getName());
  assertEquals("sample {canBeCalled=true, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=2147483647, getReferenceName=sample, hasCachedValues=false, ha...#397#1128322343", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createEntryLattice", new String[]{}, new String[]{}, false, 16, new String[][]{}, 3), new String[][]{{"getTypeOfThis", "", "3"}, {"getPropertyType", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnknownType", actual.getClass().getName());
  assertEquals("? {canBeCalled=true, getDisplayName=Unknown, getNormalizedReferenceName=?, getPossibleToBooleanOutcomes=BOTH, getPropertiesCount=2147483647, getReferenceName=?, hasCachedValues=false, hasDisplayName=t...#384#-1663040400", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createEntryLattice", new String[]{}, new String[]{}, false, 17, new String[][]{}, 3), new String[][]{{"getTypeOfThis", "", "3"}, {"getPropertyType", "java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createEntryLattice", new String[]{}, new String[]{}, false, 18, new String[][]{}, 3), new String[][]{{"getTypeOfThis", "", "3"}, {"getOwnSlot", "java.lang.String", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createEntryLattice", new String[]{}, new String[]{}, false, 19, new String[][]{}, 3), new String[][]{{"getTypeOfThis", "", "3"}, {"getOwnSlot", "java.lang.String", "5"}, {"getExtendedInterfaces", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.EmptyImmutableList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createEntryLattice", new String[]{}, new String[]{}, false, 22, new String[][]{{"com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,boolean", "<sample:2>", "<sample:3>", "true"}, {"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "java.lang.Object,com.google.javascript.jscomp.graph.LatticeElement", "<i:-1>", "<sample:3>"}}), new String[][]{{"getTypeOfThis", "", "3"}, {"getPropertyType", "java.lang.String", "5"}, {"getImplicitPrototype", "", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createEntryLattice", new String[]{}, new String[]{}, false, 24, new String[][]{{"com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,boolean", "<sample:2>", "<sample:3>", "true"}, {"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "java.lang.Object,com.google.javascript.jscomp.graph.LatticeElement", "<i:-7>", "<sample:3>"}}), new String[][]{{"getTypeOfThis", "", "3"}, {"isEnumType", "", "5"}, {"getReferenceName", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createEntryLattice", new String[]{}, new String[]{}, false, 26, new String[][]{{"com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,boolean", "<sample:2>", "<sample:3>", "true"}, {"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "java.lang.Object,com.google.javascript.jscomp.graph.LatticeElement", "<i:-7>", "<sample:3>"}}), new String[][]{{"getTypeOfThis", "", "3"}, {"getPropertyType", "java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createEntryLattice", new String[]{}, new String[]{}, false, 28, new String[][]{{"com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,boolean", "<sample:7>", "<sample:5>", "true"}, {"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "java.lang.Object,com.google.javascript.jscomp.graph.LatticeElement", "<i:-7>", "<sample:3>"}}), new String[][]{{"getTypeOfThis", "", "3"}, {"getParametersNode", "", "5"}, {"getBooleanProp", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createEntryLattice", new String[]{}, new String[]{}, false, 32, new String[][]{{"com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,boolean", "<sample:1>", "<sample:5>", "false"}, {"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "java.lang.Object,com.google.javascript.jscomp.graph.LatticeElement", "<sample:0>", "<sample:5>"}}, 1), new String[][]{{"getTypeOfThis", "", "3"}, {"getPropertyType", "java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createEntryLattice", new String[]{}, new String[]{}, false, 33, new String[][]{{"com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,boolean", "<sample:1>", "<sample:5>", "false"}, {"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "java.lang.Object,com.google.javascript.jscomp.graph.LatticeElement", "<sample:0>", "<sample:5>"}}, 1), new String[][]{{"getTypeOfThis", "", "3"}, {"getPropertyType", "java.lang.String", "5"}, {"getImplicitPrototype", "", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createEntryLattice", new String[]{}, new String[]{}, false, 33, new String[][]{{"com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,boolean", "<sample:1>", "<sample:5>", "false"}, {"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "java.lang.Object,com.google.javascript.jscomp.graph.LatticeElement", "<sample:0>", "<sample:5>"}}, 1), new String[][]{{"getTypeOfThis", "", "3"}, {"getOwnPropertyNames", "", "5"}, {"remove", "java.lang.Object", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createEntryLattice", new String[]{}, new String[]{}, false, 34, new String[][]{{"com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,boolean", "<sample:1>", "<sample:5>", "false"}, {"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "java.lang.Object,com.google.javascript.jscomp.graph.LatticeElement", "<sample:0>", "<sample:5>"}}), new String[][]{{"getTypeOfThis", "", "3"}, {"getOwnPropertyNames", "", "5"}, {"remove", "java.lang.Object", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getCfg", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "join", "com.google.javascript.jscomp.graph.LatticeElement,com.google.javascript.jscomp.graph.LatticeElement", "<sample:4>", "<sample:3>"}}), new String[][]{{"isConnected", "java.lang.Object,java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "java.lang.Object,com.google.javascript.jscomp.graph.LatticeElement", "<i:1>", "<sample:5>"}}), new String[][]{{"inferSlotType", "java.lang.String,com.google.javascript.rhino.jstype.JSType", "7"}, {"findUniqueRefinedSlot", "com.google.javascript.jscomp.type.FlowScope", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "joinInputs", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "computeEscaped", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set", "com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:4>", "<sample:1>", "<null>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "computeEscaped", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set", "com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:3>", "<sample:1>", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flow", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeInference", "isForward", ""}, {"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:0>", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flow", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<null>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "java.lang.Object,com.google.javascript.jscomp.graph.LatticeElement", "<s:>", "<sample:4>"}, {"com.google.javascript.jscomp.TypeInference", "isForward", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flow", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<null>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "java.lang.Object,com.google.javascript.jscomp.graph.LatticeElement", "<s:>", "<sample:7>"}, {"com.google.javascript.jscomp.TypeInference", "isForward", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.TypeInference", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:1>", "<sample:5>"}}), new String[][]{{"getParentScope", "", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "initialize", new String[]{}, new String[]{}, false, 22, new String[][]{{"com.google.javascript.jscomp.TypeInference", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getBooleanOutcomes", new String[]{"com.google.javascript.rhino.jstype.BooleanLiteralSet", "com.google.javascript.rhino.jstype.BooleanLiteralSet", "boolean"}, new String[]{"<sample:7>", "<null>", "true"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getCfg", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"getDirectedGraphNode", "java.lang.Object", "7"}, {"getAnnotation", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getCfg", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"getFirstEdge", "java.lang.Object,java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getCfg", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:11>", "<sample:7>"}, {"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:0>", "<sample:6>"}}), new String[][]{{"getDirectedGraphNode", "java.lang.Object", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getCfg", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:15>", "<sample:5>"}}, 2), new String[][]{{"getDirectedGraphNode", "java.lang.Object", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getCfg", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.TypeInference", "flow", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:0>"}, {"com.google.javascript.jscomp.TypeInference", "initialize", ""}, {"com.google.javascript.jscomp.TypeInference", "createEntryLattice", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.ControlFlowGraph", actual.getClass().getName());
  assertEquals("{getName=LinkedGraph, isDirected=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "computeEscaped", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set", "com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<null>", "<null>", "<sample:7>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "joinInputs", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.TypeInference", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:9>"}, {"com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,boolean", "<sample:4>", "<sample:1>", "false"}}, 1), new String[][]{{"findUniqueRefinedSlot", "com.google.javascript.jscomp.type.FlowScope", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "analyze", new String[]{"int"}, new String[]{"33554382"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "flow", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:2>"}, {"com.google.javascript.jscomp.TypeInference", "flowThrough", "java.lang.Object,com.google.javascript.jscomp.graph.LatticeElement", "<s:key>", "<sample:2>"}, {"com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,boolean", "<sample:3>", "<sample:4>", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "analyze", new String[]{"int"}, new String[]{"-2147483647"}, false, 9, new String[][]{{"com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,boolean", "<sample:3>", "<sample:4>", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.DataFlowAnalysis$MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "computeEscaped", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set", "com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:4>", "<null>", "<sample:4>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.TypeInference", "analyze", "int", "-1"}, {"com.google.javascript.jscomp.TypeInference", "analyze", "int", "10"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.LinkedFlowScope", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createEntryLattice", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.TypeInference", "getCfg", ""}}), new String[][]{{"inferSlotType", "java.lang.String,com.google.javascript.rhino.jstype.JSType", "3"}, {"createChildFlowScope", "", "1"}, {"getRootNode", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BITXOR {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, get...#350#459879196", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"java.lang.Object", "com.google.javascript.jscomp.graph.LatticeElement"}, new String[]{"<i:2>", "<sample:7>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "computeEscaped", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set", "com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:6>", "<null>", "<sample:2>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope"}, new String[]{"<sample:0>", "<null>"}, false, 13, new String[][]{{"com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,boolean", "<sample:7>", "<sample:4>", "false"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getCfg", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.ControlFlowGraph", actual.getClass().getName());
  assertEquals("{getName=LinkedGraph, isDirected=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createEntryLattice", new String[]{}, new String[]{}, false, 17, new String[][]{}, 3), new String[][]{{"getTypeOfThis", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.ParameterizedType", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getCfg", new String[]{}, new String[]{}, false), new String[][]{{"getImplicitReturn", "", "2"}, {"getLabel", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("null", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getCfg", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"getImplicitReturn", "", "2"}, {"getLabel", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("null", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getCfg", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.TypeInference", "analyze", "int", "0"}}, 1), new String[][]{{"getImplicitReturn", "", "2"}, {"getLabel", "", "4"}, {"getInEdges", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getCfg", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.ControlFlowGraph", actual.getClass().getName());
  assertEquals("{getName=LinkedGraph, isDirected=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:6>", "<sample:6>"}}, 3), new String[][]{{"getParentScope", "", "2"}, {"findUniqueRefinedSlot", "com.google.javascript.jscomp.type.FlowScope", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"java.lang.Object", "com.google.javascript.jscomp.graph.LatticeElement"}, new String[]{"<s:>", "<sample:6>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createEntryLattice", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.LinkedFlowScope", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createEntryLattice", new String[]{}, new String[]{}, false, 20, new String[][]{{"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:4>", "<null>"}}, 3), new String[][]{{"getParentScope", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "joinInputs", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.TypeInference", "analyze", ""}, {"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:5>", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "joinInputs", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<null>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:4>", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "join", new String[]{"com.google.javascript.jscomp.graph.LatticeElement", "com.google.javascript.jscomp.graph.LatticeElement"}, new String[]{"<sample:7>", "<sample:2>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.TypeInference", "getCfg", ""}, {"com.google.javascript.jscomp.TypeInference", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createEntryLattice", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<null>"}}, 1), new String[][]{{"getTypeOfThis", "", "0"}, {"hasProperty", "java.lang.String", "7"}, {"hasCachedValues", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createEntryLattice", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeInference", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:2>"}, {"com.google.javascript.jscomp.TypeInference", "createEntryLattice", ""}}, 1), new String[][]{{"getTypeOfThis", "", "0"}, {"getSlot", "java.lang.String", "7"}, {"getRestrictedTypeGivenToBooleanOutcome", "boolean", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.NoType", actual.getClass().getName());
  assertEquals("None {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=0, getMaxArguments=2147483647, getMinArguments=0, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=EMPTY, getProper...#405#-1753506400", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.TypeInference", "isForward", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.google.javascript.jscomp.TypeInference", "isForward", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "computeEscaped", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set", "com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<null>", "<sample:0>", "<sample:3>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.TypeInference", "analyze", ""}, {"com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", ""}}, 2), new String[][]{{"getSlot", "java.lang.String", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", new String[]{"java.lang.Object", "com.google.javascript.jscomp.graph.LatticeElement"}, new String[]{"<i:2>", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "analyze", "int", "-2147483648"}, {"com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,boolean", "<sample:4>", "<sample:1>", "true"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getCfg", new String[]{}, new String[]{}, false), new String[][]{{"getDirectedGraphNode", "java.lang.Object", "5"}, {"pushEdgeAnnotations", "", "4"}, {"newSubGraph", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.graph.Graph$SimpleSubGraph", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", new String[]{"java.lang.Object", "com.google.javascript.jscomp.graph.LatticeElement"}, new String[]{"<s:+>", "<sample:2>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:3>", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:5>", "<sample:6>"}}), new String[][]{{"getRootNode", "", "5"}, {"isArrayLit", "", "2"}, {"appendStringTree", "java.lang.Appendable", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:5>", "<sample:6>"}, {"com.google.javascript.jscomp.TypeInference", "isForward", ""}}), new String[][]{{"getRootNode", "", "5"}, {"isArrayLit", "", "2"}, {"appendStringTree", "java.lang.Appendable", "7"}, {"isArrayLit", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:5>", "<sample:5>"}, {"com.google.javascript.jscomp.TypeInference", "isForward", ""}}, 2), new String[][]{{"getRootNode", "", "5"}, {"isArrayLit", "", "2"}, {"appendStringTree", "java.lang.Appendable", "7"}, {"isArrayLit", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:5>", "<sample:5>"}, {"com.google.javascript.jscomp.TypeInference", "isForward", ""}}, 2), new String[][]{{"getRootNode", "", "5"}, {"isArrayLit", "", "2"}, {"appendStringTree", "java.lang.Appendable", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeInference", "analyze", "int", "0"}, {"com.google.javascript.jscomp.TypeInference", "flow", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:2>"}}, 1), new String[][]{{"createChildFlowScope", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.LinkedFlowScope", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", ""}, {"com.google.javascript.jscomp.TypeInference", "flow", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.google.javascript.jscomp.TypeInference", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:3>", "<sample:6>"}, {"com.google.javascript.jscomp.TypeInference", "analyze", "int", "-1"}}), new String[][]{{"getRootNode", "", "5"}, {"getBooleanProp", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.google.javascript.jscomp.TypeInference", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:3>", "<sample:6>"}, {"com.google.javascript.jscomp.TypeInference", "analyze", "int", "-1"}}), new String[][]{{"getRootNode", "", "5"}, {"getBooleanProp", "int", "3"}, {"appendStringTree", "java.lang.Appendable", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.google.javascript.jscomp.TypeInference", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:6>", "<sample:5>"}, {"com.google.javascript.jscomp.TypeInference", "analyze", "int", "-1"}, {"com.google.javascript.jscomp.TypeInference", "flowThrough", "java.lang.Object,com.google.javascript.jscomp.graph.LatticeElement", "<null>", "<sample:9>"}}, 1), new String[][]{{"getRootNode", "", "5"}, {"getBooleanProp", "int", "3"}, {"appendStringTree", "java.lang.Appendable", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.google.javascript.jscomp.TypeInference", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:6>", "<sample:4>"}, {"com.google.javascript.jscomp.TypeInference", "flow", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:2>"}, {"com.google.javascript.jscomp.TypeInference", "analyze", "int", "-10"}}, 1), new String[][]{{"getRootNode", "", "5"}, {"getBooleanProp", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope"}, new String[]{"<sample:4>", "<sample:0>"}, false, 15, new String[][]{{"com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,boolean", "<sample:5>", "<sample:3>", "true"}, {"com.google.javascript.jscomp.TypeInference", "createEntryLattice", ""}}, 2), new String[][]{{"createChildFlowScope", "", "6"}, {"getParentScope", "", "0"}, {"getTypeOfThis", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope"}, new String[]{"<sample:5>", "<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,boolean", "<sample:5>", "<sample:4>", "false"}, {"com.google.javascript.jscomp.TypeInference", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:13>", "<sample:6>"}}, 2), new String[][]{{"createChildFlowScope", "", "6"}, {"getParentScope", "", "0"}, {"getTypeOfThis", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "isForward", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.google.javascript.jscomp.TypeInference", "isForward", ""}, {"com.google.javascript.jscomp.TypeInference", "getCfg", ""}, {"com.google.javascript.jscomp.TypeInference", "getCfg", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.TypeInference", "initialize", ""}}), new String[][]{{"getSlot", "java.lang.String", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "analyze", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "analyze", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getCfg", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:4>", "<sample:0>"}, {"com.google.javascript.jscomp.TypeInference", "analyze", "int", "-1"}, {"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "java.lang.Object,com.google.javascript.jscomp.graph.LatticeElement", "<b:true>", "<sample:7>"}}, 1), new String[][]{{"getDirectedPredNodes", "java.lang.Object", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getCfg", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.TypeInference", "join", "com.google.javascript.jscomp.graph.LatticeElement,com.google.javascript.jscomp.graph.LatticeElement", "<sample:6>", "<sample:4>"}, {"com.google.javascript.jscomp.TypeInference", "flowThrough", "java.lang.Object,com.google.javascript.jscomp.graph.LatticeElement", "<s:a>", "<sample:7>"}}, 1), new String[][]{{"getDirectedPredNodes", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"java.lang.Object", "com.google.javascript.jscomp.graph.LatticeElement"}, new String[]{"<s:a>", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "flow", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:7>"}, {"com.google.javascript.jscomp.TypeInference", "flow", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:5>"}, {"com.google.javascript.jscomp.TypeInference", "analyze", "int", "-2147483648"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"java.lang.Object", "com.google.javascript.jscomp.graph.LatticeElement"}, new String[]{"<null>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "join", new String[]{"com.google.javascript.jscomp.graph.LatticeElement", "com.google.javascript.jscomp.graph.LatticeElement"}, new String[]{"<null>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "join", "com.google.javascript.jscomp.graph.LatticeElement,com.google.javascript.jscomp.graph.LatticeElement", "<sample:2>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getBooleanOutcomes", new String[]{"com.google.javascript.rhino.jstype.BooleanLiteralSet", "com.google.javascript.rhino.jstype.BooleanLiteralSet", "boolean"}, new String[]{"<sample:5>", "<sample:7>", "false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanLiteralSet", actual.getClass().getName());
  assertEquals("BOTH", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", new String[]{"java.lang.Object", "com.google.javascript.jscomp.graph.LatticeElement"}, new String[]{"<i:0>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:1>", "<sample:4>"}}), new String[][]{{"getOwnSlot", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "analyze", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "java.lang.Object,com.google.javascript.jscomp.graph.LatticeElement", "<s:b>", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "isForward", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "analyze", new String[]{"int"}, new String[]{"18"}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.TypeInference", "createEntryLattice", ""}}), new String[][]{{"getRootNode", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BITOR 32 {getCharno=64, getChildCount=4, getDouble=!UnsupportedOperationException, getLength=0, getLineno=32, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, g...#353#2146048475", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getBooleanOutcomes", new String[]{"com.google.javascript.rhino.jstype.BooleanLiteralSet", "com.google.javascript.rhino.jstype.BooleanLiteralSet", "boolean"}, new String[]{"<sample:5>", "<sample:1>", "true"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanLiteralSet", actual.getClass().getName());
  assertEquals("TRUE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getCfg", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", ""}}, 2), new String[][]{{"getNeighborNodes", "java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "analyze", new String[]{"int"}, new String[]{"-1"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeInference", "analyze", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.DataFlowAnalysis$MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "analyze", new String[]{"int"}, new String[]{"2147483647"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeInference", "isForward", ""}, {"com.google.javascript.jscomp.TypeInference", "analyze", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getBooleanOutcomes", new String[]{"com.google.javascript.rhino.jstype.BooleanLiteralSet", "com.google.javascript.rhino.jstype.BooleanLiteralSet", "boolean"}, new String[]{"<null>", "<sample:7>", "true"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getBooleanOutcomes", new String[]{"com.google.javascript.rhino.jstype.BooleanLiteralSet", "com.google.javascript.rhino.jstype.BooleanLiteralSet", "boolean"}, new String[]{"<sample:1>", "<sample:2>", "true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanLiteralSet", actual.getClass().getName());
  assertEquals("FALSE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getBooleanOutcomes", new String[]{"com.google.javascript.rhino.jstype.BooleanLiteralSet", "com.google.javascript.rhino.jstype.BooleanLiteralSet", "boolean"}, new String[]{"<null>", "<sample:6>", "false"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createEntryLattice", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.google.javascript.jscomp.TypeInference", "analyze", ""}, {"com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", ""}, {"com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", ""}}, 2), new String[][]{{"createChildFlowScope", "", "1"}, {"getTypeOfThis", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.IndexedType", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createEntryLattice", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.google.javascript.jscomp.TypeInference", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:6>", "<sample:1>"}}, 2), new String[][]{{"getParentScope", "", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createEntryLattice", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.google.javascript.jscomp.TypeInference", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:6>", "<sample:1>"}}, 2), new String[][]{{"getParentScope", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,boolean", "<sample:4>", "<sample:5>", "true"}, {"com.google.javascript.jscomp.TypeInference", "initialize", ""}, {"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "java.lang.Object,com.google.javascript.jscomp.graph.LatticeElement", "<sample:0>", "<sample:5>"}}), new String[][]{{"getParentScope", "", "1"}, {"completeScope", "com.google.javascript.rhino.jstype.StaticScope", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "computeEscaped", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set", "com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<null>", "<sample:0>", "<sample:2>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getBooleanOutcomes", new String[]{"com.google.javascript.rhino.jstype.BooleanLiteralSet", "com.google.javascript.rhino.jstype.BooleanLiteralSet", "boolean"}, new String[]{"<sample:2>", "<sample:2>", "false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanLiteralSet", actual.getClass().getName());
  assertEquals("FALSE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getCfg", new String[]{}, new String[]{}, false, 9, new String[][]{}, 2), new String[][]{{"getNodeDegree", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.google.javascript.jscomp.TypeInference", "flowThrough", "java.lang.Object,com.google.javascript.jscomp.graph.LatticeElement", "<i:1>", "<sample:7>"}, {"com.google.javascript.jscomp.TypeInference", "analyze", "int", "2147483647"}, {"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "java.lang.Object,com.google.javascript.jscomp.graph.LatticeElement", "<sample:0>", "<sample:1>"}}, 3), new String[][]{{"getTypeOfThis", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.IndexedType", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.google.javascript.jscomp.TypeInference", "analyze", "int", "1073741823"}}, 3), new String[][]{{"getTypeOfThis", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.NamedType", actual.getClass().getName());
  assertEquals("sample {canBeCalled=true, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=2147483647, getReferenceName=sample, hasCachedValues=false, ha...#397#1128322343", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.google.javascript.jscomp.TypeInference", "analyze", "int", "1073741823"}, {"com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", ""}}, 3), new String[][]{{"getTypeOfThis", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.ParameterizedType", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.google.javascript.jscomp.TypeInference", "analyze", "int", "1073741823"}, {"com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", ""}}, 3), new String[][]{{"getTypeOfThis", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.NoObjectType", actual.getClass().getName());
  assertEquals("NoObject {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=0, getMaxArguments=2147483647, getMinArguments=0, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPro...#408#-255005673", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getCfg", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.TypeInference", "flow", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:0>"}, {"com.google.javascript.jscomp.TypeInference", "flowThrough", "java.lang.Object,com.google.javascript.jscomp.graph.LatticeElement", "<i:2>", "<null>"}}, 3), new String[][]{{"getDirectedSuccNodes", "java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"java.lang.Object", "com.google.javascript.jscomp.graph.LatticeElement"}, new String[]{"<null>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", ""}, {"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:0>", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", ""}, {"com.google.javascript.jscomp.TypeInference", "initialize", ""}}, 3), new String[][]{{"createChildFlowScope", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.LinkedFlowScope", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createEntryLattice", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,boolean", "<sample:4>", "<sample:3>", "true"}}, 2), new String[][]{{"getOwnSlot", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createEntryLattice", new String[]{}, new String[]{}, false, 23, new String[][]{{"com.google.javascript.jscomp.TypeInference", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:5>"}}, 2), new String[][]{{"findUniqueRefinedSlot", "com.google.javascript.jscomp.type.FlowScope", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "analyze", new String[]{"int"}, new String[]{"-536870927"}, false, 15, new String[][]{{"com.google.javascript.jscomp.TypeInference", "createEntryLattice", ""}, {"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:3>", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.DataFlowAnalysis$MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "analyze", new String[]{"int"}, new String[]{"10"}, false, 15, new String[][]{{"com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", ""}, {"com.google.javascript.jscomp.TypeInference", "createEntryLattice", ""}, {"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:1>", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "computeEscaped", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set", "com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<null>", "<empty>", "<sample:7>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createEntryLattice", new String[]{}, new String[]{}, false, 9, new String[][]{}, 2), new String[][]{{"inferSlotType", "java.lang.String,com.google.javascript.rhino.jstype.JSType", "5"}, {"getRootNode", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("EQ 0 {getCharno=0, getChildCount=2, getDouble=!UnsupportedOperationException, getLength=0, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getSour...#343#530499584", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createEntryLattice", new String[]{}, new String[]{}, false, 10, new String[][]{}, 2), new String[][]{{"inferSlotType", "java.lang.String,com.google.javascript.rhino.jstype.JSType", "5"}, {"getRootNode", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("GT {getCharno=-1, getChildCount=2, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getSour...#344#-1442649439", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "analyze", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.google.javascript.jscomp.TypeInference", "analyze", "int", "20"}, {"com.google.javascript.jscomp.TypeInference", "join", "com.google.javascript.jscomp.graph.LatticeElement,com.google.javascript.jscomp.graph.LatticeElement", "<sample:0>", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
}
