package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "isEcmaScript5OrGreater", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "areNodesEqualForInlining", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "areNodesEqualForInlining", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "beginTraversal", new String[]{"com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:3>"}, false, 6, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "isEcmaScript5OrGreater", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "mayEffectMutableState", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "isASTNormalized", ""}, {"com.google.javascript.jscomp.ExploitAssigns", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:6>"}}), new String[][]{{"cloneTree", "", "6"}, {"clonePropsFrom", "com.google.javascript.rhino.Node", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$NumberNode", actual.getClass().getName());
  assertEquals("NUMBER -Infinity {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-...#343#1363071907", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "getCodingConvention", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "getCodingConvention", ""}, {"com.google.javascript.jscomp.ExploitAssigns", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.ClosureCodingConvention", actual.getClass().getName());
  assertEquals("{getAbstractMethodName=goog.abstractMethod, getDelegateSuperclassName=null, getExportPropertyFunction=goog.exportProperty, getExportSymbolFunction=goog.exportSymbol, getGlobalObject=goog.global}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "areNodesEqualForInlining", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<sample:5>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "endTraversal", new String[]{"com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:8>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "isASTNormalized", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "isASTNormalized", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "getCodingConvention", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "reportCodeChange", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "beginTraversal", new String[]{"com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "optimizeSubtree", "com.google.javascript.rhino.Node", "<sample:5>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "mayEffectMutableState", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "getCodingConvention", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "optimizeSubtree", "com.google.javascript.rhino.Node", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "getCodingConvention", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "report", "com.google.javascript.jscomp.DiagnosticType,com.google.javascript.rhino.Node", "<sample:2>", "<sample:5>"}}), new String[][]{{"isBreak", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "validateResult", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "mayHaveSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "optimizeSubtree", "com.google.javascript.rhino.Node", "<sample:0>"}, {"com.google.javascript.jscomp.ExploitAssigns", "reportCodeChange", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "mayEffectMutableState", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "nodeTypeMayHaveSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "isEcmaScript5OrGreater", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "reportCodeChange", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "nodeTypeMayHaveSideEffects", "com.google.javascript.rhino.Node", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "report", new String[]{"com.google.javascript.jscomp.DiagnosticType", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:1>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "endTraversal", new String[]{"com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "endTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:1>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "report", new String[]{"com.google.javascript.jscomp.DiagnosticType", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "isEcmaScript5OrGreater", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "endTraversal", new String[]{"com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "getCodingConvention", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "validateResult", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "beginTraversal", new String[]{"com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "isASTNormalized", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "report", new String[]{"com.google.javascript.jscomp.DiagnosticType", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:4>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "getCodingConvention", ""}, {"com.google.javascript.jscomp.ExploitAssigns", "mayHaveSideEffects", "com.google.javascript.rhino.Node", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "mayHaveSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "mayEffectMutableState", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:10>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "getCodingConvention", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "isEcmaScript5OrGreater", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "getCodingConvention", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "mayEffectMutableState", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "getCodingConvention", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "beginTraversal", new String[]{"com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "isEcmaScript5OrGreater", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "areNodesEqualForInlining", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "isASTNormalized", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "report", new String[]{"com.google.javascript.jscomp.DiagnosticType", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<sample:6>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:9>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "nodeTypeMayHaveSideEffects", "com.google.javascript.rhino.Node", "<sample:2>"}, {"com.google.javascript.jscomp.ExploitAssigns", "isEcmaScript5OrGreater", ""}}), new String[][]{{"checkTreeEquals", "com.google.javascript.rhino.Node", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "areNodesEqualForInlining", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<sample:1>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "optimizeSubtree", "com.google.javascript.rhino.Node", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "mayEffectMutableState", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "validateResult", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "areNodesEqualForInlining", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "isASTNormalized", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "nodeTypeMayHaveSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "getCodingConvention", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "reportCodeChange", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "isASTNormalized", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "endTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "report", new String[]{"com.google.javascript.jscomp.DiagnosticType", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "areNodesEqualForInlining", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "mayEffectMutableState", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "mayEffectMutableState", "com.google.javascript.rhino.Node", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "isEcmaScript5OrGreater", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "mayEffectMutableState", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "endTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:7>"}, {"com.google.javascript.jscomp.ExploitAssigns", "optimizeSubtree", "com.google.javascript.rhino.Node", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "reportCodeChange", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "reportCodeChange", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "isASTNormalized", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "areNodesEqualForInlining", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "endTraversal", new String[]{"com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "optimizeSubtree", "com.google.javascript.rhino.Node", "<sample:5>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "reportCodeChange", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:6>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "validateResult", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "reportCodeChange", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$NumberNode", actual.getClass().getName());
  assertEquals("NUMBER -Infinity {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-...#343#1363071907", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "nodeTypeMayHaveSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "areNodesEqualForInlining", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "getCodingConvention", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "nodeTypeMayHaveSideEffects", "com.google.javascript.rhino.Node", "<sample:5>"}, {"com.google.javascript.jscomp.ExploitAssigns", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.ClosureCodingConvention", actual.getClass().getName());
  assertEquals("{getAbstractMethodName=goog.abstractMethod, getDelegateSuperclassName=null, getExportPropertyFunction=goog.exportProperty, getExportSymbolFunction=goog.exportSymbol, getGlobalObject=goog.global}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "report", new String[]{"com.google.javascript.jscomp.DiagnosticType", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "optimizeSubtree", "com.google.javascript.rhino.Node", "<sample:1>"}, {"com.google.javascript.jscomp.ExploitAssigns", "getCodingConvention", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "mayHaveSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "reportCodeChange", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "isASTNormalized", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "getCodingConvention", ""}}), new String[][]{{"getParent", "", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "mayHaveSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "isEcmaScript5OrGreater", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "report", new String[]{"com.google.javascript.jscomp.DiagnosticType", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<sample:6>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "nodeTypeMayHaveSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "areNodesEqualForInlining", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<null>", "<sample:0>"}, {"com.google.javascript.jscomp.ExploitAssigns", "isEcmaScript5OrGreater", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "getCodingConvention", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.ClosureCodingConvention", actual.getClass().getName());
  assertEquals("{getAbstractMethodName=goog.abstractMethod, getDelegateSuperclassName=null, getExportPropertyFunction=goog.exportProperty, getExportSymbolFunction=goog.exportSymbol, getGlobalObject=goog.global}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "nodeTypeMayHaveSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "mayHaveSideEffects", "com.google.javascript.rhino.Node", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "mayEffectMutableState", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:1>"}, false), new String[][]{{"addSuppression", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "mayHaveSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:10>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING <a><b>t</b></a> {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileN...#355#2035619353", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "mayHaveSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "endTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "optimizeSubtree", "com.google.javascript.rhino.Node", "<sample:7>"}}), new String[][]{{"getString", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "getCodingConvention", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:1>"}}), new String[][]{{"isValidEnumKey", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false), new String[][]{{"getSourcePosition", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "report", "com.google.javascript.jscomp.DiagnosticType,com.google.javascript.rhino.Node", "<sample:3>", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "getCodingConvention", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:2>"}}), new String[][]{{"getGlobalObject", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("goog.global", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "nodeTypeMayHaveSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "isASTNormalized", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "report", new String[]{"com.google.javascript.jscomp.DiagnosticType", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:6>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "getCodingConvention", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "getCodingConvention", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:3>"}}), new String[][]{{"getDelegateSuperclassName", "", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 0, null, 1), new String[][]{{"isCase", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, false, 0, null, 1), new String[][]{{"copyInformationFrom", "com.google.javascript.rhino.Node", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "getCodingConvention", ""}}, 2), new String[][]{{"getSourceFileName", "", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "reportCodeChange", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "isEcmaScript5OrGreater", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "validateResult", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 0, null, 2), new String[][]{{"getSourceOffset", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "reportCodeChange", ""}, {"com.google.javascript.jscomp.ExploitAssigns", "optimizeSubtree", "com.google.javascript.rhino.Node", "<sample:8>"}}, 1), new String[][]{{"getQualifiedName", "", "0"}, {"getJSDocInfo", "", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "mayHaveSideEffects", "com.google.javascript.rhino.Node", "<sample:0>"}}, 3), new String[][]{{"isAssignAdd", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "report", "com.google.javascript.jscomp.DiagnosticType,com.google.javascript.rhino.Node", "<sample:8>", "<sample:4>"}, {"com.google.javascript.jscomp.ExploitAssigns", "reportCodeChange", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false, 0, null, 2), new String[][]{{"isAssign", "", "4"}, {"addChildAfter", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "isEcmaScript5OrGreater", ""}}, 3), new String[][]{{"detachChildren", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$NumberNode", actual.getClass().getName());
  assertEquals("NUMBER -Infinity {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-...#343#1363071907", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "report", "com.google.javascript.jscomp.DiagnosticType,com.google.javascript.rhino.Node", "<sample:3>", "<sample:0>"}}, 2), new String[][]{{"hasOneChild", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "isEcmaScript5OrGreater", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false, 0, null, 3), new String[][]{{"getParent", "", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, false, 3, new String[][]{}, 3), new String[][]{{"getSourcePosition", "", "1"}, {"getIndexOfChild", "com.google.javascript.rhino.Node", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$NumberNode", actual.getClass().getName());
  assertEquals("NUMBER -Infinity {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-...#343#1363071907", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "validateResult", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "isEcmaScript5OrGreater", ""}}, 1), new String[][]{{"appendStringTree", "java.lang.Appendable", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:8>"}, false, 0, null, 1), new String[][]{{"getJsDocBuilderForNode", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$FileLevelJsDocBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:4>"}, {"com.google.javascript.jscomp.ExploitAssigns", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:5>"}}, 1), new String[][]{{"hasMoreThanOneChild", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "report", "com.google.javascript.jscomp.DiagnosticType,com.google.javascript.rhino.Node", "<sample:7>", "<sample:7>"}, {"com.google.javascript.jscomp.ExploitAssigns", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:8>"}}, 3), new String[][]{{"getChangeTime", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "nodeTypeMayHaveSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "optimizeSubtree", "com.google.javascript.rhino.Node", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "report", new String[]{"com.google.javascript.jscomp.DiagnosticType", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:0>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:5>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "areNodesEqualForInlining", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:5>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "isEcmaScript5OrGreater", ""}, {"com.google.javascript.jscomp.ExploitAssigns", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false, 0, null, 3), new String[][]{{"getSourcePosition", "", "2"}, {"getFirstChild", "", "2"}, {"getExistingIntProp", "int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "isASTNormalized", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "reportCodeChange", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:8>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "validateResult", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "mayHaveSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "reportCodeChange", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:9>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "nodeTypeMayHaveSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "mayHaveSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "mayHaveSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "isEcmaScript5OrGreater", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "areNodesEqualForInlining", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:9>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "areNodesEqualForInlining", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:9>", "<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "mayHaveSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "isEcmaScript5OrGreater", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:6>"}, {"com.google.javascript.jscomp.ExploitAssigns", "areNodesEqualForInlining", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "mayHaveSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "getCodingConvention", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:1>"}}, 2), new String[][]{{"getDelegateRelationship", "com.google.javascript.rhino.Node", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "getCodingConvention", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:2>"}}), new String[][]{{"isPrototypeAlias", "com.google.javascript.rhino.Node", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "report", new String[]{"com.google.javascript.jscomp.DiagnosticType", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<sample:6>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:2>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "areNodesEqualForInlining", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "areNodesEqualForInlining", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "report", "com.google.javascript.jscomp.DiagnosticType,com.google.javascript.rhino.Node", "<sample:6>", "<sample:0>"}, {"com.google.javascript.jscomp.ExploitAssigns", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "getCodingConvention", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:9>"}}, 2), new String[][]{{"getObjectLiteralCast", "com.google.javascript.rhino.Node", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "reportCodeChange", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:0>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "getCodingConvention", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:0>"}}), new String[][]{{"getIndirectlyDeclaredProperties", "", "4"}, {"iterator", "", "6"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "isASTNormalized", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "getCodingConvention", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:2>"}}), new String[][]{{"isInlinableFunction", "com.google.javascript.rhino.Node", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "isEcmaScript5OrGreater", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "validateResult", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "mayEffectMutableState", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "areNodesEqualForInlining", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "isASTNormalized", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:4>"}, {"com.google.javascript.jscomp.ExploitAssigns", "nodeTypeMayHaveSideEffects", "com.google.javascript.rhino.Node", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "getCodingConvention", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:3>"}}, 2), new String[][]{{"isConstantKey", "java.lang.String", "2"}, {"isSuperClassReference", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "mayHaveSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "getCodingConvention", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:7>"}}, 2), new String[][]{{"isSuperClassReference", "java.lang.String", "2"}, {"getAssertionFunctions", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.RegularImmutableList", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "isEcmaScript5OrGreater", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ExploitAssigns", "com.google.javascript.jscomp.ExploitAssigns", "getCodingConvention", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.ExploitAssigns", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:2>"}}, 2), new String[][]{{"isValidEnumKey", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
}
