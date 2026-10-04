package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "createEntryLattice", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "flowThrough", new String[]{"java.lang.Object", "com.google.javascript.jscomp.graph.LatticeElement"}, new String[]{"<i:2>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "createEntryLattice", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses", "<null>", "<sample:1>"}, {"com.google.javascript.jscomp.MaybeReachingVariableUse", "createEntryLattice", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "createEntryLattice", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses", "<null>", "<sample:1>"}, {"com.google.javascript.jscomp.MaybeReachingVariableUse", "createEntryLattice", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "initialize", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getExitLatticeElement", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getUses", new String[]{"java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"AST should be normalized", "<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "flowThrough", "java.lang.Object,com.google.javascript.jscomp.graph.LatticeElement", "<i:0>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "join", new String[]{"com.google.javascript.jscomp.graph.LatticeElement", "com.google.javascript.jscomp.graph.LatticeElement"}, new String[]{"<sample:1>", "<sample:4>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "flowThrough", "java.lang.Object,com.google.javascript.jscomp.graph.LatticeElement", "<s:b>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "join", new String[]{"com.google.javascript.jscomp.graph.LatticeElement", "com.google.javascript.jscomp.graph.LatticeElement"}, new String[]{"<sample:6>", "<sample:7>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses"}, new String[]{"<sample:5>", "<sample:4>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses"}, new String[]{"<sample:8>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses"}, new String[]{"<sample:4>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getCfg", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.ControlFlowGraph", actual.getClass().getName());
  assertEquals("{getName=LinkedGraph, isDirected=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getCfg", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "createInitialEstimateLattice", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "computeEscaped", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set", "com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:7>", "<sample:2>", "<sample:7>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "computeEscaped", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set", "com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:6>", "<sample:2>", "<sample:7>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getUses", new String[]{"java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"2.5", "<sample:3>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getUses", new String[]{"java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"3.C", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getExitLatticeElement", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getExitLatticeElement", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getExitLatticeElement", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "createEntryLattice", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "createEntryLattice", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", new String[]{"int"}, new String[]{"0"}, false, 7, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "getUses", "java.lang.String,com.google.javascript.rhino.Node", "true", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", new String[]{"int"}, new String[]{"2147483599"}, false, 6, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "join", "com.google.javascript.jscomp.graph.LatticeElement,com.google.javascript.jscomp.graph.LatticeElement", "<sample:7>", "<sample:3>"}, {"com.google.javascript.jscomp.MaybeReachingVariableUse", "getCfg", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", new String[]{"int"}, new String[]{"-2147483647"}, false, 6, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "join", "com.google.javascript.jscomp.graph.LatticeElement,com.google.javascript.jscomp.graph.LatticeElement", "<sample:7>", "<sample:3>"}, {"com.google.javascript.jscomp.MaybeReachingVariableUse", "getCfg", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.DataFlowAnalysis$MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", new String[]{"int"}, new String[]{"-2147483618"}, false, 5, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "join", "com.google.javascript.jscomp.graph.LatticeElement,com.google.javascript.jscomp.graph.LatticeElement", "<sample:7>", "<sample:3>"}, {"com.google.javascript.jscomp.MaybeReachingVariableUse", "getCfg", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "flow", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.DataFlowAnalysis$MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", new String[]{"int"}, new String[]{"2147483647"}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", new String[]{"int"}, new String[]{"-1073741823"}, false, 11, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses", "<sample:2>", "<sample:3>"}, {"com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "createEntryLattice", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "initialize", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:0>"}, {"com.google.javascript.jscomp.MaybeReachingVariableUse", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "initialize", new String[]{}, new String[]{}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "initialize", new String[]{}, new String[]{}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "join", new String[]{"com.google.javascript.jscomp.graph.LatticeElement", "com.google.javascript.jscomp.graph.LatticeElement"}, new String[]{"<null>", "<sample:10>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "joinInputs", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "initialize", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "isForward", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "initialize", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "isForward", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "initialize", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "isForward", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "isForward", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", new String[]{"int"}, new String[]{"67108934"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "getUses", "java.lang.String,com.google.javascript.rhino.Node", "I", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", new String[]{"int"}, new String[]{"-67108896"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "getUses", "java.lang.String,com.google.javascript.rhino.Node", "I", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.DataFlowAnalysis$MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", new String[]{"int"}, new String[]{"-67108896"}, false, 5, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "getUses", "java.lang.String,com.google.javascript.rhino.Node", "I", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", new String[]{"int"}, new String[]{"-67108917"}, false, 7, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "getUses", "java.lang.String,com.google.javascript.rhino.Node", "I", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "flow", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<null>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:6>"}, {"com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", "int", "-1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:6>"}, {"com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "join", "com.google.javascript.jscomp.graph.LatticeElement,com.google.javascript.jscomp.graph.LatticeElement", "<sample:7>", "<sample:10>"}, {"com.google.javascript.jscomp.MaybeReachingVariableUse", "join", "com.google.javascript.jscomp.graph.LatticeElement,com.google.javascript.jscomp.graph.LatticeElement", "<sample:4>", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "join", "com.google.javascript.jscomp.graph.LatticeElement,com.google.javascript.jscomp.graph.LatticeElement", "<sample:7>", "<sample:10>"}, {"com.google.javascript.jscomp.MaybeReachingVariableUse", "join", "com.google.javascript.jscomp.graph.LatticeElement,com.google.javascript.jscomp.graph.LatticeElement", "<sample:4>", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses"}, new String[]{"<sample:4>", "<sample:8>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "isForward", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "getExitLatticeElement", ""}, {"com.google.javascript.jscomp.MaybeReachingVariableUse", "join", "com.google.javascript.jscomp.graph.LatticeElement,com.google.javascript.jscomp.graph.LatticeElement", "<sample:3>", "<sample:5>"}, {"com.google.javascript.jscomp.MaybeReachingVariableUse", "getUses", "java.lang.String,com.google.javascript.rhino.Node", "0x1F", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "initialize", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "initialize", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "initialize", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getUses", new String[]{"java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"<a>b;/a=", "<sample:1>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "createEntryLattice", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getExitLatticeElement", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "initialize", ""}, {"com.google.javascript.jscomp.MaybeReachingVariableUse", "getCfg", ""}, {"com.google.javascript.jscomp.MaybeReachingVariableUse", "isForward", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "flow", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<sample:1>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "join", new String[]{"com.google.javascript.jscomp.graph.LatticeElement", "com.google.javascript.jscomp.graph.LatticeElement"}, new String[]{"<sample:10>", "<sample:1>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses"}, new String[]{"<sample:0>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "join", new String[]{"com.google.javascript.jscomp.graph.LatticeElement", "com.google.javascript.jscomp.graph.LatticeElement"}, new String[]{"<sample:13>", "<sample:0>"}, false, 15, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses", "<sample:5>", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "join", new String[]{"com.google.javascript.jscomp.graph.LatticeElement", "com.google.javascript.jscomp.graph.LatticeElement"}, new String[]{"<sample:4>", "<sample:4>"}, false, 13, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses", "<sample:0>", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "flowThrough", new String[]{"java.lang.Object", "com.google.javascript.jscomp.graph.LatticeElement"}, new String[]{"<sample:1>", "<sample:3>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "joinInputs", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<sample:14>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "joinInputs", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<null>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "joinInputs", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<null>"}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "joinInputs", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<sample:5>"}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "computeEscaped", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set", "com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:7>", "<sample:0>", "<sample:7>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "flow", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<sample:0>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "joinInputs", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "join", "com.google.javascript.jscomp.graph.LatticeElement,com.google.javascript.jscomp.graph.LatticeElement", "<sample:4>", "<sample:0>"}, {"com.google.javascript.jscomp.MaybeReachingVariableUse", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses", "<null>", "<sample:7>"}, {"com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "computeEscaped", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set", "com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:6>", "<sample:0>", "<sample:7>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "flow", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<sample:0>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "createEntryLattice", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "getExitLatticeElement", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "joinInputs", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<null>"}, false, 15, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "createEntryLattice", ""}, {"com.google.javascript.jscomp.MaybeReachingVariableUse", "join", "com.google.javascript.jscomp.graph.LatticeElement,com.google.javascript.jscomp.graph.LatticeElement", "<sample:0>", "<sample:1>"}, {"com.google.javascript.jscomp.MaybeReachingVariableUse", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses", "<null>", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "computeEscaped", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set", "com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<null>", "<null>", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getCfg", new String[]{}, new String[]{}, false), new String[][]{{"popEdgeAnnotations", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "isForward", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "join", "com.google.javascript.jscomp.graph.LatticeElement,com.google.javascript.jscomp.graph.LatticeElement", "<sample:0>", "<sample:10>"}, {"com.google.javascript.jscomp.MaybeReachingVariableUse", "flow", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "flowThrough", new String[]{"java.lang.Object", "com.google.javascript.jscomp.graph.LatticeElement"}, new String[]{"<i:2>", "<sample:3>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getCfg", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "isForward", ""}, {"com.google.javascript.jscomp.MaybeReachingVariableUse", "join", "com.google.javascript.jscomp.graph.LatticeElement,com.google.javascript.jscomp.graph.LatticeElement", "<sample:10>", "<null>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getUses", new String[]{"java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"1", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:7>"}, {"com.google.javascript.jscomp.MaybeReachingVariableUse", "initialize", ""}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.AbstractMultimap$WrappedSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "joinInputs", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<null>"}, false, 11, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "join", "com.google.javascript.jscomp.graph.LatticeElement,com.google.javascript.jscomp.graph.LatticeElement", "<null>", "<sample:0>"}, {"com.google.javascript.jscomp.MaybeReachingVariableUse", "createInitialEstimateLattice", ""}, {"com.google.javascript.jscomp.MaybeReachingVariableUse", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses", "<null>", "<sample:9>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses"}, new String[]{"<sample:3>", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "isForward", ""}, {"com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", "int", "1"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses"}, new String[]{"<sample:6>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "isForward", ""}, {"com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", "int", "1"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "flowThrough", new String[]{"java.lang.Object", "com.google.javascript.jscomp.graph.LatticeElement"}, new String[]{"<s:ub}>", "<sample:0>"}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "getUses", "java.lang.String,com.google.javascript.rhino.Node", "{\"a\":1}", "<sample:5>"}, {"com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", ""}, {"com.google.javascript.jscomp.MaybeReachingVariableUse", "flow", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "getUses", "java.lang.String,com.google.javascript.rhino.Node", "{\"a\":1}", "<sample:5>"}, {"com.google.javascript.jscomp.MaybeReachingVariableUse", "flow", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getCfg", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses", "<null>", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.ControlFlowGraph", actual.getClass().getName());
  assertEquals("{getName=LinkedGraph, isDirected=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getCfg", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses", "<null>", "<sample:5>"}, {"com.google.javascript.jscomp.MaybeReachingVariableUse", "getUses", "java.lang.String,com.google.javascript.rhino.Node", "+1", "<sample:5>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getCfg", new String[]{}, new String[]{}, false), new String[][]{{"newSubGraph", "", "7"}, {"addNode", "java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getCfg", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"newSubGraph", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.graph.Graph$SimpleSubGraph", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getCfg", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "flow", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:2>"}}, 3), new String[][]{{"newSubGraph", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.graph.Graph$SimpleSubGraph", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getCfg", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "flow", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:2>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "computeEscaped", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set", "com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:6>", "<sample:0>", "<sample:6>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses"}, new String[]{"<sample:9>", "<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "flowThrough", "java.lang.Object,com.google.javascript.jscomp.graph.LatticeElement", "<s:key>", "<sample:6>"}, {"com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses"}, new String[]{"<null>", "<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses"}, new String[]{"<sample:4>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", ""}, {"com.google.javascript.jscomp.MaybeReachingVariableUse", "join", "com.google.javascript.jscomp.graph.LatticeElement,com.google.javascript.jscomp.graph.LatticeElement", "<sample:5>", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "computeEscaped", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set", "com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:8>", "<sample:3>", "<sample:1>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getCfg", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "getUses", "java.lang.String,com.google.javascript.rhino.Node", "a", "<sample:4>"}}, 3), new String[][]{{"pushEdgeAnnotations", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.ControlFlowGraph", actual.getClass().getName());
  assertEquals("{getName=LinkedGraph, isDirected=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getExitLatticeElement", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getExitLatticeElement", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "join", new String[]{"com.google.javascript.jscomp.graph.LatticeElement", "com.google.javascript.jscomp.graph.LatticeElement"}, new String[]{"<null>", "<sample:6>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses", "<sample:3>", "<sample:0>"}, {"com.google.javascript.jscomp.MaybeReachingVariableUse", "createInitialEstimateLattice", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "join", new String[]{"com.google.javascript.jscomp.graph.LatticeElement", "com.google.javascript.jscomp.graph.LatticeElement"}, new String[]{"<sample:7>", "<sample:6>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses", "<sample:3>", "<sample:0>"}, {"com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", ""}, {"com.google.javascript.jscomp.MaybeReachingVariableUse", "createInitialEstimateLattice", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getUses", new String[]{"java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"{\"a\":1}", "<sample:1>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "flow", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "getCfg", ""}, {"com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "initialize", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", ""}, {"com.google.javascript.jscomp.MaybeReachingVariableUse", "createInitialEstimateLattice", ""}, {"com.google.javascript.jscomp.MaybeReachingVariableUse", "initialize", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "initialize", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", ""}, {"com.google.javascript.jscomp.MaybeReachingVariableUse", "join", "com.google.javascript.jscomp.graph.LatticeElement,com.google.javascript.jscomp.graph.LatticeElement", "<sample:0>", "<sample:6>"}, {"com.google.javascript.jscomp.MaybeReachingVariableUse", "createInitialEstimateLattice", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "initialize", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", ""}, {"com.google.javascript.jscomp.MaybeReachingVariableUse", "join", "com.google.javascript.jscomp.graph.LatticeElement,com.google.javascript.jscomp.graph.LatticeElement", "<sample:0>", "<sample:6>"}, {"com.google.javascript.jscomp.MaybeReachingVariableUse", "createInitialEstimateLattice", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "computeEscaped", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set", "com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:14>", "<sample:0>", "<sample:7>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "isForward", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "computeEscaped", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set", "com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<null>", "<sample:6>", "<sample:7>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "flowThrough", new String[]{"java.lang.Object", "com.google.javascript.jscomp.graph.LatticeElement"}, new String[]{"<null>", "<null>"}, false, 9, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "isForward", ""}, {"com.google.javascript.jscomp.MaybeReachingVariableUse", "getCfg", ""}, {"com.google.javascript.jscomp.MaybeReachingVariableUse", "getExitLatticeElement", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getCfg", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"clearNodeAnnotations", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getCfg", new String[]{}, new String[]{}, false, 9, new String[][]{}), new String[][]{{"hasNode", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getCfg", new String[]{}, new String[]{}, false, 14, new String[][]{}), new String[][]{{"hasNode", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getCfg", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3), new String[][]{{"hasNode", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getExitLatticeElement", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", ""}, {"com.google.javascript.jscomp.MaybeReachingVariableUse", "createEntryLattice", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getExitLatticeElement", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses", "<sample:5>", "<sample:0>"}, {"com.google.javascript.jscomp.MaybeReachingVariableUse", "getCfg", ""}, {"com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getCfg", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:0>"}, {"com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", "int", "0"}, {"com.google.javascript.jscomp.MaybeReachingVariableUse", "flow", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.ControlFlowGraph", actual.getClass().getName());
  assertEquals("{getName=LinkedGraph, isDirected=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getCfg", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:0>"}, {"com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", "int", "0"}, {"com.google.javascript.jscomp.MaybeReachingVariableUse", "flow", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<null>"}}, 1), new String[][]{{"disconnectInDirection", "java.lang.Object,java.lang.Object", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses"}, new String[]{"<sample:5>", "<sample:2>"}, false, 10, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "flow", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:8>"}, {"com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", "int", "10"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "isForward", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.DataFlowAnalysis$MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", new String[]{"int"}, new String[]{"0"}, false, 7, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "flow", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "flow", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getExitLatticeElement", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses", "<sample:4>", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses"}, new String[]{"<sample:6>", "<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", new String[]{"int"}, new String[]{"1"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "join", new String[]{"com.google.javascript.jscomp.graph.LatticeElement", "com.google.javascript.jscomp.graph.LatticeElement"}, new String[]{"<null>", "<sample:10>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "flow", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<null>"}, {"com.google.javascript.jscomp.MaybeReachingVariableUse", "getCfg", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "computeEscaped", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set", "com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:6>", "<sample:1>", "<sample:0>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getUses", new String[]{"java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"1L", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "initialize", ""}}), new String[][]{{"iterator", "", "0"}, {"remove", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getCfg", new String[]{}, new String[]{}, false, 8, new String[][]{}, 3), new String[][]{{"getNodes", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[null, 1.5]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getExitLatticeElement", new String[]{}, new String[]{}, false, 26, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:0>"}, {"com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getExitLatticeElement", new String[]{}, new String[]{}, false, 27, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:0>"}, {"com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getUses", new String[]{"java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"0x1-25356789", "<null>"}, false, 15, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "computeEscaped", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set", "com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<null>", "<sample:2>", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getUses", new String[]{"java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"1.123567890123", "<null>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", ""}}), new String[][]{{"removeAll", "java.util.Collection", "4"}, {"isEmpty", "", "1"}, {"add", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getUses", new String[]{"java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"a-,{b,I", "<null>"}, false, 15, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses", "<sample:6>", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", new String[]{"int"}, new String[]{"2130706384"}, false, 9, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "join", "com.google.javascript.jscomp.graph.LatticeElement,com.google.javascript.jscomp.graph.LatticeElement", "<null>", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "flow", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<null>"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getCfg", new String[]{}, new String[]{}, false, 29, new String[][]{}, 1), new String[][]{{"getDirectedSuccNodes", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getUses", new String[]{"java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"Hell+, World+1T", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", "int", "2147483647"}}), new String[][]{{"addAll", "java.util.Collection", "3"}, {"containsAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getUses", new String[]{"java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", "int", "-1073741794"}}, 1), new String[][]{{"addAll", "java.util.Collection", "3"}, {"containsAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getUses", new String[]{"java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"a b", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", ""}, {"com.google.javascript.jscomp.MaybeReachingVariableUse", "flow", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:0>"}}, 2), new String[][]{{"retainAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getCfg", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "createInitialEstimateLattice", ""}}, 1), new String[][]{{"getDirectedSuccNodes", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getCfg", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "flowThrough", "java.lang.Object,com.google.javascript.jscomp.graph.LatticeElement", "<s:key>", "<sample:4>"}, {"com.google.javascript.jscomp.MaybeReachingVariableUse", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses", "<sample:1>", "<sample:5>"}, {"com.google.javascript.jscomp.MaybeReachingVariableUse", "initialize", ""}}, 2), new String[][]{{"connect", "java.lang.Object,java.lang.Object,java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getCfg", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"getFirstEdge", "java.lang.Object,java.lang.Object", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "computeEscaped", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set", "com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<null>", "<sample:3>", "<sample:1>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getCfg", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:7>"}}, 2), new String[][]{{"newSubGraph", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.graph.Graph$SimpleSubGraph", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getCfg", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "getCfg", ""}}, 1), new String[][]{{"isImplicitReturn", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "6"}, {"hasNode", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getCfg", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "initialize", ""}, {"com.google.javascript.jscomp.MaybeReachingVariableUse", "getUses", "java.lang.String,com.google.javascript.rhino.Node", "1", "<sample:1>"}}, 2), new String[][]{{"getDirectedPredNodes", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getCfg", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "createInitialEstimateLattice", ""}, {"com.google.javascript.jscomp.MaybeReachingVariableUse", "getCfg", ""}}, 2), new String[][]{{"createDirectedGraphNode", "java.lang.Object", "3"}, {"getValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
}
