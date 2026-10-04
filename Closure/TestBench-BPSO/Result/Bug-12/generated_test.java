package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "flowThrough", new String[]{"java.lang.Object", "com.google.javascript.jscomp.graph.LatticeElement"}, new String[]{"<s:>", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "createInitialEstimateLattice", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "flowThrough", new String[]{"java.lang.Object", "com.google.javascript.jscomp.graph.LatticeElement"}, new String[]{"<null>", "<null>"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", new String[]{"int"}, new String[]{"-10"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.DataFlowAnalysis$MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "createEntryLattice", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getCfg", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "createEntryLattice", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.ControlFlowGraph", actual.getClass().getName());
  assertEquals("{getName=LinkedGraph, isDirected=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getCfg", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "createInitialEstimateLattice", ""}}), new String[][]{{"getNodes", "", "7"}, {"size", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getExitLatticeElement", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "isForward", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "flowThrough", "java.lang.Object,com.google.javascript.jscomp.graph.LatticeElement", "<b:false>", "<sample:6>"}, {"com.google.javascript.jscomp.MaybeReachingVariableUse", "getUses", "java.lang.String,com.google.javascript.rhino.Node", "<a>b</a>", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses"}, new String[]{"<sample:3>", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "flow", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "flow", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<null>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "initialize", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "join", "com.google.javascript.jscomp.graph.LatticeElement,com.google.javascript.jscomp.graph.LatticeElement", "<sample:8>", "<sample:9>"}, {"com.google.javascript.jscomp.MaybeReachingVariableUse", "initialize", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", new String[]{}, new String[]{}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getExitLatticeElement", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getExitLatticeElement", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "flow", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:8>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "flow", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<sample:10>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "join", new String[]{"com.google.javascript.jscomp.graph.LatticeElement", "com.google.javascript.jscomp.graph.LatticeElement"}, new String[]{"<sample:6>", "<sample:3>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getUses", new String[]{"java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"2020-02-30T25:61:62", "<sample:10>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "computeEscaped", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set", "com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:4>", "<null>", "<sample:7>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses"}, new String[]{"<null>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "initialize", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "flow", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<sample:2>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getUses", new String[]{"java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"0x12", "<sample:4>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "joinInputs", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "join", "com.google.javascript.jscomp.graph.LatticeElement,com.google.javascript.jscomp.graph.LatticeElement", "<sample:6>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "getUses", "java.lang.String,com.google.javascript.rhino.Node", "true", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "join", new String[]{"com.google.javascript.jscomp.graph.LatticeElement", "com.google.javascript.jscomp.graph.LatticeElement"}, new String[]{"<null>", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", new String[]{"int"}, new String[]{"1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "join", new String[]{"com.google.javascript.jscomp.graph.LatticeElement", "com.google.javascript.jscomp.graph.LatticeElement"}, new String[]{"<sample:1>", "<sample:6>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getExitLatticeElement", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "join", new String[]{"com.google.javascript.jscomp.graph.LatticeElement", "com.google.javascript.jscomp.graph.LatticeElement"}, new String[]{"<sample:3>", "<sample:3>"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "joinInputs", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<sample:8>"}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "join", new String[]{"com.google.javascript.jscomp.graph.LatticeElement", "com.google.javascript.jscomp.graph.LatticeElement"}, new String[]{"<sample:7>", "<sample:5>"}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "join", new String[]{"com.google.javascript.jscomp.graph.LatticeElement", "com.google.javascript.jscomp.graph.LatticeElement"}, new String[]{"<sample:7>", "<sample:0>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", "int", "65536"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "initialize", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getCfg", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"isConnectedInDirection", "java.lang.Object,java.lang.Object,java.lang.Object", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getExitLatticeElement", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getCfg", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "getUses", "java.lang.String,com.google.javascript.rhino.Node", "1.5e300", "<sample:1>"}}, 3), new String[][]{{"newSubGraph", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.graph.Graph$SimpleSubGraph", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "createEntryLattice", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "joinInputs", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "getUses", "java.lang.String,com.google.javascript.rhino.Node", "a b", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", new String[]{"int"}, new String[]{"1"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses"}, new String[]{"<sample:0>", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "join", "com.google.javascript.jscomp.graph.LatticeElement,com.google.javascript.jscomp.graph.LatticeElement", "<sample:1>", "<sample:1>"}, {"com.google.javascript.jscomp.MaybeReachingVariableUse", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "createEntryLattice", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "computeEscaped", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set", "com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:3>", "<empty>", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses"}, new String[]{"<null>", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "createEntryLattice", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "createEntryLattice", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.DataFlowAnalysis$MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "isForward", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", "int", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses"}, new String[]{"<sample:1>", "<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", new String[]{"int"}, new String[]{"-2147483648"}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.DataFlowAnalysis$MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "createEntryLattice", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "getCfg", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "flowThrough", new String[]{"java.lang.Object", "com.google.javascript.jscomp.graph.LatticeElement"}, new String[]{"<s:>", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "createEntryLattice", ""}, {"com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", "int", "1"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getUses", new String[]{"java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"2020-02-330T25:61:61", "<sample:2>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "getUses", "java.lang.String,com.google.javascript.rhino.Node", "0a/b", "<null>"}, {"com.google.javascript.jscomp.MaybeReachingVariableUse", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getCfg", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "initialize", ""}}), new String[][]{{"disconnectInDirection", "java.lang.Object,java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "joinInputs", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<sample:4>"}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses"}, new String[]{"<sample:5>", "<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "flow", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "flow", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "joinInputs", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<null>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "computeEscaped", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set", "com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<null>", "<sample:0>", "<sample:5>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "isForward", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "flow", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "computeEscaped", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set", "com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:3>", "<sample:1>", "<sample:5>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses"}, new String[]{"<sample:4>", "<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "getExitLatticeElement", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "flowThrough", new String[]{"java.lang.Object", "com.google.javascript.jscomp.graph.LatticeElement"}, new String[]{"<i:1>", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "createInitialEstimateLattice", ""}, {"com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", "int", "4194303"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", new String[]{"int"}, new String[]{"2147483647"}, false, 5, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "isForward", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getCfg", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:2>"}, {"com.google.javascript.jscomp.MaybeReachingVariableUse", "initialize", ""}}), new String[][]{{"getName", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("LinkedGraph", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "getUses", "java.lang.String,com.google.javascript.rhino.Node", "2020-02-30T25:61:61", "<sample:0>"}, {"com.google.javascript.jscomp.MaybeReachingVariableUse", "initialize", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "computeEscaped", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set", "com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:2>", "<sample:0>", "<sample:6>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "initialize", new String[]{}, new String[]{}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "initialize", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getUses", new String[]{"java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"1.123456789012345675.", "<sample:7>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "computeEscaped", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set", "com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:6>", "<sample:4>", "<sample:6>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", new String[]{}, new String[]{}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getCfg", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", "int", "-89"}, {"com.google.javascript.jscomp.MaybeReachingVariableUse", "createEntryLattice", ""}}), new String[][]{{"hasNode", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getCfg", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getCfg", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "join", "com.google.javascript.jscomp.graph.LatticeElement,com.google.javascript.jscomp.graph.LatticeElement", "<sample:0>", "<sample:2>"}}), new String[][]{{"getDirectedPredNodes", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "initialize", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "initialize", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "flow", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:2>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getCfg", new String[]{}, new String[]{}, false), new String[][]{{"getEdges", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "flow", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:8>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "flowThrough", new String[]{"java.lang.Object", "com.google.javascript.jscomp.graph.LatticeElement"}, new String[]{"<i:-26>", "<sample:7>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "createEntryLattice", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getUses", new String[]{"java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"2/20-02-30T25:61:61", "<null>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "getCfg", ""}, {"com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", "int", "8388609"}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.AbstractMultimap$WrappedSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses"}, new String[]{"<sample:6>", "<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getUses", new String[]{"java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"1.5W", "<null>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", "int", "2147483647"}}), new String[][]{{"size", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", "int", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "computeEscaped", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set", "com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:1>", "<sample:1>", "<sample:3>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses"}, new String[]{"<sample:5>", "<sample:3>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "getUses", "java.lang.String,com.google.javascript.rhino.Node", "II", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getCfg", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "createInitialEstimateLattice", ""}}, 2), new String[][]{{"connectIfNotFound", "java.lang.Object,java.lang.Object,java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "isForward", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "initialize", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "getUses", "java.lang.String,com.google.javascript.rhino.Node", "1.123406278", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses"}, new String[]{"<sample:8>", "<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", new String[]{"int"}, new String[]{"-5"}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "initialize", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses", "<sample:4>", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getCfg", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", ""}}, 1), new String[][]{{"getEdges", "java.lang.Object,java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getExitLatticeElement", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "initialize", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "flow", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", "int", "4194304"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "createEntryLattice", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "flow", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "flowThrough", "java.lang.Object,com.google.javascript.jscomp.graph.LatticeElement", "<d:1.5>", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses"}, new String[]{"<sample:1>", "<sample:3>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "flow", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "computeEscaped", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set", "com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:2>", "<sample:3>", "<sample:4>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses"}, new String[]{"<null>", "<sample:4>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "join", "com.google.javascript.jscomp.graph.LatticeElement,com.google.javascript.jscomp.graph.LatticeElement", "<sample:2>", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getCfg", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"getDirectedPredNodes", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "0"}, {"clear", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses"}, new String[]{"<sample:4>", "<sample:7>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "initialize", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getExitLatticeElement", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "createEntryLattice", ""}, {"com.google.javascript.jscomp.MaybeReachingVariableUse", "createEntryLattice", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "joinInputs", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "computeEscaped", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set", "com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<null>", "<sample:1>", "<sample:4>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getCfg", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"popNodeAnnotations", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getUses", new String[]{"java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"2020-{02-330T25:61:61", "<sample:6>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getCfg", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.ControlFlowGraph", actual.getClass().getName());
  assertEquals("{getName=LinkedGraph, isDirected=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "flow", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<null>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", "int", "-1073741824"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getUses", new String[]{"java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"---", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", ""}, {"com.google.javascript.jscomp.MaybeReachingVariableUse", "join", "com.google.javascript.jscomp.graph.LatticeElement,com.google.javascript.jscomp.graph.LatticeElement", "<sample:7>", "<sample:0>"}}), new String[][]{{"remove", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getUses", new String[]{"java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"true0", "<null>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "getCfg", ""}, {"com.google.javascript.jscomp.MaybeReachingVariableUse", "initialize", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "joinInputs", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "getExitLatticeElement", ""}, {"com.google.javascript.jscomp.MaybeReachingVariableUse", "flowThrough", "java.lang.Object,com.google.javascript.jscomp.graph.LatticeElement", "<i:0>", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getUses", new String[]{"java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"TITbE>", "<null>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "isForward", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", new String[]{"int"}, new String[]{"2147483610"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "isForward", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "computeEscaped", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set", "com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<null>", "<sample:1>", "<sample:5>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getExitLatticeElement", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "initialize", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses", "<sample:7>", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "join", new String[]{"com.google.javascript.jscomp.graph.LatticeElement", "com.google.javascript.jscomp.graph.LatticeElement"}, new String[]{"<null>", "<sample:5>"}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getCfg", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", "int", "-33"}}, 2), new String[][]{{"getDirectedPredNodes", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getCfg", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "getExitLatticeElement", ""}}, 1), new String[][]{{"getOptionalNodeComparator", "boolean", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", new String[]{"int"}, new String[]{"-2147483648"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "createEntryLattice", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "computeEscaped", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set", "com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:6>", "<sample:1>", "<sample:0>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "flow", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<null>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "join", "com.google.javascript.jscomp.graph.LatticeElement,com.google.javascript.jscomp.graph.LatticeElement", "<sample:7>", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "createEntryLattice", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "join", new String[]{"com.google.javascript.jscomp.graph.LatticeElement", "com.google.javascript.jscomp.graph.LatticeElement"}, new String[]{"<sample:5>", "<sample:4>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "join", "com.google.javascript.jscomp.graph.LatticeElement,com.google.javascript.jscomp.graph.LatticeElement", "<sample:3>", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getCfg", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:9>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getCfg", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"popNodeAnnotations", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "computeEscaped", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set", "com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<null>", "<empty>", "<sample:4>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "initialize", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "initialize", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", new String[]{"int"}, new String[]{"2147483593"}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getExitLatticeElement", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getCfg", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"getDirectedPredNodes", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "initialize", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "flow", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getExitLatticeElement", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getCfg", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "getCfg", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.ControlFlowGraph", actual.getClass().getName());
  assertEquals("{getName=LinkedGraph, isDirected=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", new String[]{"int"}, new String[]{"-536870912"}, false, 6, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "isForward", ""}, {"com.google.javascript.jscomp.MaybeReachingVariableUse", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses", "<sample:0>", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.DataFlowAnalysis$MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getExitLatticeElement", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "initialize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "flowThrough", new String[]{"java.lang.Object", "com.google.javascript.jscomp.graph.LatticeElement"}, new String[]{"<null>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getExitLatticeElement", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "getCfg", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getCfg", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.ControlFlowGraph", actual.getClass().getName());
  assertEquals("{getName=LinkedGraph, isDirected=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", new String[]{"int"}, new String[]{"8454145"}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getCfg", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1), new String[][]{{"getGraphvizNodes", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[null, key]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", new String[]{"int"}, new String[]{"-42"}, false, 3, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getCfg", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", ""}}, 3), new String[][]{{"getEdges", "", "6"}, {"add", "int,java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getCfg", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "joinInputs", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<null>"}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", new String[]{"int"}, new String[]{"-1073741824"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getCfg", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3), new String[][]{{"getDirectedPredNodes", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getUses", new String[]{"java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"/a/", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "analyze", "int", "-2147483648"}}, 1), new String[][]{{"remove", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getCfg", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "createInitialEstimateLattice", ""}}, 2), new String[][]{{"getEdges", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getCfg", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "createEntryLattice", ""}}, 2), new String[][]{{"getEdges", "", "3"}, {"retainAll", "java.util.Collection", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "flow", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:2>"}, {"com.google.javascript.jscomp.MaybeReachingVariableUse", "isForward", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getCfg", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses", "<sample:5>", "<sample:4>"}}, 3), new String[][]{{"getGraphvizNodes", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[null, c]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MaybeReachingVariableUse", "com.google.javascript.jscomp.MaybeReachingVariableUse", "getUses", new String[]{"java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"15d", "<null>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.MaybeReachingVariableUse", "initialize", ""}}), new String[][]{{"iterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.AbstractMultimap$WrappedCollection$WrappedIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
}
