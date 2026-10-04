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
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "flow", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.LiveVariablesAnalysis$LiveVariableLattice", "<sample:2>", "<sample:0>"}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "getEscapedLocals", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "flow", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "analyze", ""}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.LiveVariablesAnalysis$LiveVariableLattice", "<sample:3>", "<sample:6>"}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "flowThrough", "java.lang.Object,com.google.javascript.jscomp.LatticeElement", "<i:-2147483648>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "flow", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "analyze", ""}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.LiveVariablesAnalysis$LiveVariableLattice", "<sample:3>", "<sample:6>"}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "flowThrough", "java.lang.Object,com.google.javascript.jscomp.LatticeElement", "<i:-2147483648>", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "isForward", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "markAllParametersEscaped", ""}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "initialize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "join", new String[]{"com.google.javascript.jscomp.LatticeElement", "com.google.javascript.jscomp.LatticeElement"}, new String[]{"<sample:0>", "<sample:6>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "join", new String[]{"com.google.javascript.jscomp.LatticeElement", "com.google.javascript.jscomp.LatticeElement"}, new String[]{"<sample:0>", "<sample:1>"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "computeEscaped", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set", "com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:2>", "<empty>", "<sample:4>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "computeEscaped", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set", "com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:0>", "<empty>", "<sample:6>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "join", new String[]{"com.google.javascript.jscomp.LatticeElement", "com.google.javascript.jscomp.LatticeElement"}, new String[]{"<sample:1>", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "flow", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "join", new String[]{"com.google.javascript.jscomp.LatticeElement", "com.google.javascript.jscomp.LatticeElement"}, new String[]{"<sample:0>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.LiveVariablesAnalysis$LiveVariableLattice", "<sample:4>", "<sample:6>"}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "flow", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:5>"}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "createEntryLattice", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "markAllParametersEscaped", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "flowThrough", "java.lang.Object,com.google.javascript.jscomp.LatticeElement", "<i:0>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "markAllParametersEscaped", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "flow", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:4>"}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "flowThrough", "java.lang.Object,com.google.javascript.jscomp.LatticeElement", "<i:0>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "getExitLatticeElement", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "analyze", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.LiveVariablesAnalysis$LiveVariableLattice", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "getExitLatticeElement", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "analyze", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "getExitLatticeElement", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "analyze", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "getExitLatticeElement", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "analyze", ""}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "markAllParametersEscaped", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.LiveVariablesAnalysis$LiveVariableLattice", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "getExitLatticeElement", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "analyze", ""}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "markAllParametersEscaped", ""}}, 1), new String[][]{{"isLive", "com.google.javascript.jscomp.Scope$Var", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "joinInputs", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "isForward", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "getEscapedLocals", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "markAllParametersEscaped", ""}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "flowThrough", "java.lang.Object,com.google.javascript.jscomp.LatticeElement", "<s:b>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.util.HashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "analyze", new String[]{"int"}, new String[]{"-2147483648"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.DataFlowAnalysis$MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "analyze", new String[]{"int"}, new String[]{"10"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "analyze", new String[]{"int"}, new String[]{"10"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "getCfg", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.ControlFlowGraph", actual.getClass().getName());
  assertEquals("{getName=LinkedGraph, isDirected=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "getCfg", new String[]{}, new String[]{}, false), new String[][]{{"getDirectedSuccNodes", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "getCfg", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "getCfg", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2), new String[][]{{"getDirectedSuccNodes", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "getCfg", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.ControlFlowGraph", actual.getClass().getName());
  assertEquals("{getName=LinkedGraph, isDirected=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "getCfg", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "computeEscaped", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set", "com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<null>", "<sample:3>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "flowThrough", new String[]{"java.lang.Object", "com.google.javascript.jscomp.LatticeElement"}, new String[]{"<s:b>", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "isForward", ""}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "initialize", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "flowThrough", new String[]{"java.lang.Object", "com.google.javascript.jscomp.LatticeElement"}, new String[]{"<s:b>", "<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "isForward", ""}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "initialize", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "flow", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<sample:1>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "getVarIndex", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "getVarIndex", new String[]{"java.lang.String"}, new String[]{"12:30::455"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "getExitLatticeElement", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "getExitLatticeElement", new String[]{}, new String[]{}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "analyze", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "analyze", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "analyze", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "analyze", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "analyze", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "analyze", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "analyze", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "markAllParametersEscaped", ""}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "analyze", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "analyze", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "markAllParametersEscaped", ""}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "analyze", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "analyze", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "markAllParametersEscaped", ""}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "analyze", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "initialize", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:5>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "initialize", new String[]{}, new String[]{}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "initialize", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "getEscapedLocals", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "flowThrough", new String[]{"java.lang.Object", "com.google.javascript.jscomp.LatticeElement"}, new String[]{"<s:`>", "<sample:5>"}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "flow", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "joinInputs", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<sample:5>"}, false, 13, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "getExitLatticeElement", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "markAllParametersEscaped", ""}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "initialize", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "getExitLatticeElement", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "markAllParametersEscaped", ""}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "initialize", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "getExitLatticeElement", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "markAllParametersEscaped", ""}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "initialize", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.LiveVariablesAnalysis$LiveVariableLattice", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "getExitLatticeElement", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "markAllParametersEscaped", ""}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "initialize", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.LiveVariablesAnalysis$LiveVariableLattice", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "createEntryLattice", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.LiveVariablesAnalysis$LiveVariableLattice", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "joinInputs", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "flowThrough", "java.lang.Object,com.google.javascript.jscomp.LatticeElement", "<s:b>", "<sample:4>"}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "join", "com.google.javascript.jscomp.LatticeElement,com.google.javascript.jscomp.LatticeElement", "<sample:6>", "<sample:9>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "createEntryLattice", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "flow", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "createEntryLattice", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "flow", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:6>"}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "initialize", ""}}), new String[][]{{"isLive", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "createEntryLattice", new String[]{}, new String[]{}, false), new String[][]{{"isLive", "com.google.javascript.jscomp.Scope$Var", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "computeEscaped", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set", "com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:4>", "<sample:1>", "<sample:0>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "computeEscaped", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set", "com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:3>", "<sample:1>", "<sample:0>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.LiveVariablesAnalysis$LiveVariableLattice"}, new String[]{"<sample:3>", "<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "joinInputs", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "getCfg", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.LiveVariablesAnalysis$LiveVariableLattice"}, new String[]{"<sample:3>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "getCfg", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.ControlFlowGraph", actual.getClass().getName());
  assertEquals("{getName=LinkedGraph, isDirected=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "getCfg", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "flow", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<null>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "getExitLatticeElement", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "markAllParametersEscaped", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "getExitLatticeElement", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.LiveVariablesAnalysis$LiveVariableLattice", "<sample:0>", "<sample:7>"}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "markAllParametersEscaped", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "getCfg", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "getEscapedLocals", ""}}), new String[][]{{"connectToImplicitReturn", "java.lang.Object,com.google.javascript.jscomp.ControlFlowGraph$Branch", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "join", new String[]{"com.google.javascript.jscomp.LatticeElement", "com.google.javascript.jscomp.LatticeElement"}, new String[]{"<sample:6>", "<sample:0>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "createEntryLattice", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "getVarIndex", "java.lang.String", "1.1234567"}}, 2), new String[][]{{"isLive", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "createEntryLattice", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "getVarIndex", "java.lang.String", "1.12344567"}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.LiveVariablesAnalysis$LiveVariableLattice", "<sample:5>", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "join", new String[]{"com.google.javascript.jscomp.LatticeElement", "com.google.javascript.jscomp.LatticeElement"}, new String[]{"<null>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "getExitLatticeElement", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "getEscapedLocals", ""}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "analyze", ""}}), new String[][]{{"isLive", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "computeEscaped", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set", "com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:4>", "<sample:5>", "<sample:0>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "computeEscaped", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set", "com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:3>", "<sample:5>", "<sample:0>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "join", "com.google.javascript.jscomp.LatticeElement,com.google.javascript.jscomp.LatticeElement", "<sample:5>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.LiveVariablesAnalysis$LiveVariableLattice", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"isLive", "com.google.javascript.jscomp.Scope$Var", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "markAllParametersEscaped", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "markAllParametersEscaped", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "markAllParametersEscaped", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "analyze", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "getCfg", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "analyze", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "getCfg", ""}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "getExitLatticeElement", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "analyze", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "getCfg", ""}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "getExitLatticeElement", ""}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "isForward", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "getEscapedLocals", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "getEscapedLocals", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "getEscapedLocals", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.LiveVariablesAnalysis$LiveVariableLattice", "<sample:6>", "<sample:1>"}}), new String[][]{{"size", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "getEscapedLocals", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "join", "com.google.javascript.jscomp.LatticeElement,com.google.javascript.jscomp.LatticeElement", "<sample:3>", "<sample:4>"}}, 2), new String[][]{{"clone", "", "7"}, {"clear", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.HashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "getEscapedLocals", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "initialize", ""}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "join", "com.google.javascript.jscomp.LatticeElement,com.google.javascript.jscomp.LatticeElement", "<sample:3>", "<sample:4>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "initialize", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "initialize", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "initialize", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "initialize", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "analyze", ""}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "analyze", "int", "10"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "join", new String[]{"com.google.javascript.jscomp.LatticeElement", "com.google.javascript.jscomp.LatticeElement"}, new String[]{"<sample:5>", "<sample:10>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "markAllParametersEscaped", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.LiveVariablesAnalysis$LiveVariableLattice"}, new String[]{"<sample:1>", "<sample:7>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.LiveVariablesAnalysis$LiveVariableLattice", "<sample:7>", "<sample:3>"}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "analyze", "int", "0"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "getEscapedLocals", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "analyze", "int", "1"}}), new String[][]{{"addAll", "java.util.Collection", "2"}, {"add", "java.lang.Object", "0"}, {"add", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "getVarIndex", new String[]{"java.lang.String"}, new String[]{"--1"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "analyze", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "isForward", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "createEntryLattice", new String[]{}, new String[]{}, false, 15, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.LiveVariablesAnalysis$LiveVariableLattice", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "flowThrough", "java.lang.Object,com.google.javascript.jscomp.LatticeElement", "<s:b>", "<null>"}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "getVarIndex", "java.lang.String", "0"}}, 2), new String[][]{{"isLive", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "flowThrough", new String[]{"java.lang.Object", "com.google.javascript.jscomp.LatticeElement"}, new String[]{"<d:1.465>", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "markAllParametersEscaped", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "analyze", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "markAllParametersEscaped", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "analyze", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "markAllParametersEscaped", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "analyze", new String[]{"int"}, new String[]{"2147483647"}, false, 4, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "analyze", ""}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "markAllParametersEscaped", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "getCfg", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"getNeighborNodesIterator", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.graph.LinkedDirectedGraph$LinkedDirectedGraphNode$NeighborIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "getCfg", new String[]{}, new String[]{}, false, 14, new String[][]{}), new String[][]{{"getNeighborNodesIterator", "java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "joinInputs", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "getVarIndex", "java.lang.String", "a"}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "flowThrough", "java.lang.Object,com.google.javascript.jscomp.LatticeElement", "<i:-1>", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "getEscapedLocals", new String[]{}, new String[]{}, false), new String[][]{{"contains", "java.lang.Object", "7"}, {"iterator", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "getEscapedLocals", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "isForward", ""}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "createEntryLattice", ""}}, 1), new String[][]{{"contains", "java.lang.Object", "7"}, {"iterator", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "getEscapedLocals", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "createEntryLattice", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "getEscapedLocals", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "createEntryLattice", ""}}), new String[][]{{"contains", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "getEscapedLocals", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "isForward", ""}}, 3), new String[][]{{"contains", "java.lang.Object", "7"}, {"remove", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "getEscapedLocals", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "isForward", ""}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:2>"}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "flow", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:0>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "createEntryLattice", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "analyze", "int", "1"}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "getVarIndex", "java.lang.String", "2020-02-30T25:61:61"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "createEntryLattice", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "analyze", "int", "1"}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "getVarIndex", "java.lang.String", "2020-02-30T25:61:61"}}, 2), new String[][]{{"isLive", "com.google.javascript.jscomp.Scope$Var", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "createEntryLattice", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "analyze", "int", "-1073741861"}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "createInitialEstimateLattice", ""}}, 1), new String[][]{{"isLive", "com.google.javascript.jscomp.Scope$Var", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "createEntryLattice", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "initialize", ""}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "flowThrough", "java.lang.Object,com.google.javascript.jscomp.LatticeElement", "<s:a>", "<sample:4>"}}, 1), new String[][]{{"isLive", "int", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "createEntryLattice", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "initialize", ""}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "flowThrough", "java.lang.Object,com.google.javascript.jscomp.LatticeElement", "<s:>", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.LiveVariablesAnalysis$LiveVariableLattice", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.LiveVariablesAnalysis$LiveVariableLattice"}, new String[]{"<sample:4>", "<sample:9>"}, false, 10, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "getEscapedLocals", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "flowThrough", new String[]{"java.lang.Object", "com.google.javascript.jscomp.LatticeElement"}, new String[]{"<null>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "analyze", "int", "-1"}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "getEscapedLocals", ""}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "markAllParametersEscaped", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "analyze", new String[]{"int"}, new String[]{"-1"}, false, 5, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "flow", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "analyze", new String[]{"int"}, new String[]{"31"}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "analyze", new String[]{"int"}, new String[]{"-2017"}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.DataFlowAnalysis$MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "getCfg", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"getGraphvizNodes", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[null, b]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "getCfg", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "join", "com.google.javascript.jscomp.LatticeElement,com.google.javascript.jscomp.LatticeElement", "<sample:1>", "<sample:0>"}}), new String[][]{{"getDirectedGraphNodes", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[null, b]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "initialize", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:7>"}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "createEntryLattice", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "initialize", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:7>"}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "createEntryLattice", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "initialize", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:7>"}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "createEntryLattice", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "getEscapedLocals", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "analyze", ""}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "initialize", ""}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.LiveVariablesAnalysis$LiveVariableLattice", "<null>", "<sample:4>"}}, 2), new String[][]{{"remove", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "getCfg", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"createDirectedGraphNode", "java.lang.Object", "6"}, {"getLabel", "", "5"}, {"getOutEdges", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "getCfg", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.ControlFlowGraph", actual.getClass().getName());
  assertEquals("{getName=LinkedGraph, isDirected=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "getCfg", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "getExitLatticeElement", ""}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "analyze", "int", "-2147483648"}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "flow", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:0>"}}, 1), new String[][]{{"createDirectedGraphNode", "java.lang.Object", "4"}, {"getLabel", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "getCfg", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "flow", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:3>"}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "getVarIndex", "java.lang.String", "T1Ha b"}}, 1), new String[][]{{"createDirectedGraphNode", "java.lang.Object", "0"}, {"getAnnotation", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "getCfg", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.LiveVariablesAnalysis$LiveVariableLattice", "<sample:5>", "<sample:4>"}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "initialize", ""}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "initialize", ""}}, 1), new String[][]{{"createDirectedGraphNode", "java.lang.Object", "4"}, {"getOutEdges", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "getCfg", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.LiveVariablesAnalysis$LiveVariableLattice", "<sample:5>", "<sample:4>"}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "initialize", ""}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "initialize", ""}}, 2), new String[][]{{"pushNodeAnnotations", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "getCfg", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "markAllParametersEscaped", ""}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.LiveVariablesAnalysis$LiveVariableLattice", "<sample:5>", "<sample:4>"}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "initialize", ""}}, 3), new String[][]{{"pushNodeAnnotations", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "markAllParametersEscaped", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "markAllParametersEscaped", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "flow", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "isForward", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "flow", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<null>"}, false, 14, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "getEscapedLocals", ""}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "getVarIndex", "java.lang.String", "a"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "flow", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<null>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "getExitLatticeElement", ""}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "getEscapedLocals", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "getEscapedLocals", new String[]{}, new String[]{}, false, 14, new String[][]{}, 3), new String[][]{{"add", "java.lang.Object", "2"}, {"retainAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "computeEscaped", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set", "com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:5>", "<sample:3>", "<sample:4>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "computeEscaped", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set", "com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:0>", "<sample:2>", "<sample:6>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "getExitLatticeElement", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "createInitialEstimateLattice", ""}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "analyze", "int", "1"}}), new String[][]{{"isLive", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "getCfg", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "getExitLatticeElement", ""}}, 1), new String[][]{{"isConnectedInDirection", "java.lang.Object,java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "getCfg", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "getExitLatticeElement", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "initialize", ""}}), new String[][]{{"isLive", "int", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "initialize", ""}}, 3), new String[][]{{"isLive", "int", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "initialize", ""}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "flow", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "join", new String[]{"com.google.javascript.jscomp.LatticeElement", "com.google.javascript.jscomp.LatticeElement"}, new String[]{"<null>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "createEntryLattice", ""}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:7>"}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "analyze", "int", "0"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "createEntryLattice", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.LiveVariablesAnalysis$LiveVariableLattice", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "initialize", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "flow", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:0>"}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "join", "com.google.javascript.jscomp.LatticeElement,com.google.javascript.jscomp.LatticeElement", "<sample:4>", "<sample:2>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "initialize", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "flow", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:0>"}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "join", "com.google.javascript.jscomp.LatticeElement,com.google.javascript.jscomp.LatticeElement", "<sample:4>", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "markAllParametersEscaped", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "isForward", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "flow", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "getEscapedLocals", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2), new String[][]{{"add", "java.lang.Object", "0"}, {"addAll", "java.util.Collection", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "getCfg", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2), new String[][]{{"connectToImplicitReturn", "java.lang.Object,com.google.javascript.jscomp.ControlFlowGraph$Branch", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "getCfg", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.LiveVariablesAnalysis$LiveVariableLattice", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "getCfg", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "analyze", new String[]{"int"}, new String[]{"2147483647"}, false, 5, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "markAllParametersEscaped", ""}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "flowThrough", "java.lang.Object,com.google.javascript.jscomp.LatticeElement", "<i:-1>", "<sample:3>"}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "analyze", new String[]{"int"}, new String[]{"-10"}, false, 6, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "markAllParametersEscaped", ""}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "flowThrough", "java.lang.Object,com.google.javascript.jscomp.LatticeElement", "<i:-1>", "<sample:3>"}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.DataFlowAnalysis$MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "getCfg", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "getExitLatticeElement", ""}}, 2), new String[][]{{"getNeighborNodes", "java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "getVarIndex", new String[]{"java.lang.String"}, new String[]{"0x1F"}, false, 14, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "analyze", ""}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "createEntryLattice", ""}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "analyze", "int", "-1"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "getEscapedLocals", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "getVarIndex", "java.lang.String", "\t"}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.HashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "analyze", new String[]{"int"}, new String[]{"104853508"}, false, 3, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "getEscapedLocals", ""}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "flowThrough", "java.lang.Object,com.google.javascript.jscomp.LatticeElement", "<sample:1>", "<sample:6>"}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "getExitLatticeElement", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "analyze", "int", "-1073741823"}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "getVarIndex", "java.lang.String", "a 7"}}, 2), new String[][]{{"isLive", "com.google.javascript.jscomp.Scope$Var", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "analyze", new String[]{"int"}, new String[]{"-2147467264"}, false, 1, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "isForward", ""}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "getEscapedLocals", ""}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "createInitialEstimateLattice", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "analyze", new String[]{"int"}, new String[]{"-18"}, false, 0, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.DataFlowAnalysis$MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "analyze", new String[]{"int"}, new String[]{"-18"}, false, 5, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "flow", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<null>"}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "analyze", new String[]{"int"}, new String[]{"-18"}, false, 4, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "flow", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<null>"}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "markAllParametersEscaped", new String[]{}, new String[]{}, false, 9, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "markAllParametersEscaped", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "isForward", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "markAllParametersEscaped", ""}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "createEntryLattice", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.LiveVariablesAnalysis$LiveVariableLattice", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "createEntryLattice", ""}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "createEntryLattice", ""}}, 2), new String[][]{{"isLive", "int", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "getExitLatticeElement", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "analyze", "int", "1"}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.LiveVariablesAnalysis$LiveVariableLattice", "<sample:5>", "<sample:2>"}}, 3), new String[][]{{"isLive", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "getExitLatticeElement", ""}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "markAllParametersEscaped", ""}}, 3), new String[][]{{"isLive", "com.google.javascript.jscomp.Scope$Var", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "getExitLatticeElement", ""}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "markAllParametersEscaped", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.LiveVariablesAnalysis$LiveVariableLattice", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "isForward", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.LiveVariablesAnalysis$LiveVariableLattice", "<sample:2>", "<sample:4>"}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "getVarIndex", "java.lang.String", "Title"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "markAllParametersEscaped", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "createInitialEstimateLattice", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "markAllParametersEscaped", ""}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "getExitLatticeElement", ""}}, 1), new String[][]{{"isLive", "int", "5"}, {"isLive", "int", "6"}, {"isLive", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "getEscapedLocals", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:7>"}}, 1), new String[][]{{"contains", "java.lang.Object", "3"}, {"contains", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "createEntryLattice", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "createInitialEstimateLattice", ""}}, 3), new String[][]{{"isLive", "int", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "createEntryLattice", new String[]{}, new String[]{}, false, 13, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "markAllParametersEscaped", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "markAllParametersEscaped", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "getEscapedLocals", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "getCfg", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "createInitialEstimateLattice", ""}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "flow", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:5>"}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "getVarIndex", "java.lang.String", "1"}}, 2), new String[][]{{"createNode", "java.lang.Object", "0"}, {"getId", "", "3"}, {"getLabel", "", "0"}, {"getColor", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("white", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "joinInputs", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "getEscapedLocals", ""}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:7>"}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "isForward", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "getEscapedLocals", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "analyze", ""}}, 3), new String[][]{{"clone", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.HashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "getEscapedLocals", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "analyze", "int", "57"}}, 1), new String[][]{{"containsAll", "java.util.Collection", "7"}, {"clear", "", "3"}, {"isEmpty", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "analyze", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "markAllParametersEscaped", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "join", new String[]{"com.google.javascript.jscomp.LatticeElement", "com.google.javascript.jscomp.LatticeElement"}, new String[]{"<sample:2>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "join", "com.google.javascript.jscomp.LatticeElement,com.google.javascript.jscomp.LatticeElement", "<sample:3>", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "join", new String[]{"com.google.javascript.jscomp.LatticeElement", "com.google.javascript.jscomp.LatticeElement"}, new String[]{"<null>", "<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "createEntryLattice", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "joinInputs", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "analyze", "int", "-1"}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "getVarIndex", "java.lang.String", "1L"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "markAllParametersEscaped", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "flowThrough", "java.lang.Object,com.google.javascript.jscomp.LatticeElement", "<b:true>", "<null>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "markAllParametersEscaped", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "flowThrough", "java.lang.Object,com.google.javascript.jscomp.LatticeElement", "<b:true>", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "computeEscaped", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set", "com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<null>", "<sample:0>", "<sample:3>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "getExitLatticeElement", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "markAllParametersEscaped", ""}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "analyze", ""}}, 2), new String[][]{{"isLive", "com.google.javascript.jscomp.Scope$Var", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "getEscapedLocals", new String[]{}, new String[]{}, false), new String[][]{{"iterator", "", "1"}, {"hasNext", "", "7"}, {"remove", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "getEscapedLocals", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "isForward", ""}}), new String[][]{{"iterator", "", "1"}, {"hasNext", "", "7"}, {"next", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "getEscapedLocals", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "analyze", ""}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "join", "com.google.javascript.jscomp.LatticeElement,com.google.javascript.jscomp.LatticeElement", "<sample:2>", "<sample:5>"}}, 1), new String[][]{{"iterator", "", "1"}, {"hasNext", "", "7"}, {"remove", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "getEscapedLocals", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "getExitLatticeElement", ""}}, 3), new String[][]{{"iterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1), new String[][]{{"isLive", "int", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "markAllParametersEscaped", new String[]{}, new String[]{}, false, 12, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "flowThrough", new String[]{"java.lang.Object", "com.google.javascript.jscomp.LatticeElement"}, new String[]{"<null>", "<null>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "analyze", ""}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "getEscapedLocals", ""}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "getCfg", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "getEscapedLocals", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.LiveVariablesAnalysis$LiveVariableLattice", "<sample:4>", "<sample:0>"}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "initialize", ""}}, 1), new String[][]{{"size", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "analyze", new String[]{"int"}, new String[]{"2147483647"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "computeEscaped", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set", "com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<null>", "<sample:2>", "<sample:0>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "flow", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<null>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "initialize", ""}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "isForward", ""}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "getCfg", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "joinInputs", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "createInitialEstimateLattice", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "getExitLatticeElement", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "analyze", "int", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.LiveVariablesAnalysis$LiveVariableLattice", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "getEscapedLocals", new String[]{}, new String[]{}, false, 15, new String[][]{}, 2), new String[][]{{"add", "java.lang.Object", "2"}, {"addAll", "java.util.Collection", "6"}, {"iterator", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "getEscapedLocals", new String[]{}, new String[]{}, false, 11, new String[][]{}, 2), new String[][]{{"addAll", "java.util.Collection", "3"}, {"isEmpty", "", "3"}, {"isEmpty", "", "1"}, {"size", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "getExitLatticeElement", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "analyze", "int", "-2147483648"}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "getExitLatticeElement", ""}}, 1), new String[][]{{"isLive", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "computeEscaped", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set", "com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:10>", "<sample:2>", "<sample:7>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "getEscapedLocals", new String[]{}, new String[]{}, false, 20, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "flowThrough", "java.lang.Object,com.google.javascript.jscomp.LatticeElement", "<s:>", "<sample:7>"}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "flow", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:5>"}}, 1), new String[][]{{"add", "java.lang.Object", "6"}, {"iterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "getExitLatticeElement", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "analyze", ""}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "isForward", ""}}, 2), new String[][]{{"isLive", "int", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "getEscapedLocals", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3), new String[][]{{"size", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "createEntryLattice", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "getExitLatticeElement", ""}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "getExitLatticeElement", ""}}, 3), new String[][]{{"isLive", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "getEscapedLocals", new String[]{}, new String[]{}, false, 21, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "initialize", ""}}, 3), new String[][]{{"size", "", "7"}, {"addAll", "java.util.Collection", "1"}, {"size", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "getEscapedLocals", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"clear", "", "0"}, {"iterator", "", "7"}, {"next", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "getEscapedLocals", new String[]{}, new String[]{}, false, 27, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "join", "com.google.javascript.jscomp.LatticeElement,com.google.javascript.jscomp.LatticeElement", "<sample:6>", "<sample:5>"}, {"com.google.javascript.jscomp.LiveVariablesAnalysis", "getExitLatticeElement", ""}}, 3), new String[][]{{"isEmpty", "", "3"}, {"iterator", "", "6"}, {"hasNext", "", "2"}, {"next", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LiveVariablesAnalysis", "com.google.javascript.jscomp.LiveVariablesAnalysis", "getEscapedLocals", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.LiveVariablesAnalysis", "getVarIndex", "java.lang.String", " "}}, 2), new String[][]{{"addAll", "java.util.Collection", "7"}, {"size", "", "4"}, {"size", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
}
