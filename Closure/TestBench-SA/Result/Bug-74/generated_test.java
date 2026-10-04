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
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "validateResult", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "endTraversal", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:0>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "mayEffectMutableState", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("EOL 0 {getCharno=0, getChildCount=2, getDouble=!UnsupportedOperationException, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourcePosition=0, getString=!UnsupportedOperationException, ...#377#-759491108", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$NumberNode", actual.getClass().getName());
  assertEquals("NUMBER -Infinity {getCharno=-1, getChildCount=0, getDouble=-Infinity, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourcePosition=-1, getString=!UnsupportedOperationException, getType...#373#1387726836", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("LEAVEWITH {getCharno=-1, getChildCount=3, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourcePosition=-1, getString=!UnsupportedOperationExce...#383#1808116099", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", ""}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "areNodesEqualForInlining", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:4>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", ""}}, 3), new String[][]{{"clonePropsFrom", "com.google.javascript.rhino.Node", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("GOTO 7 {getCharno=8, getChildCount=1, getDouble=!UnsupportedOperationException, getLineno=7, getQualifiedName=null, getSideEffectFlags=0, getSourcePosition=28680, getString=!UnsupportedOperationExcept...#381#-1226051941", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", "com.google.javascript.rhino.Node", "<sample:0>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("EOF {getCharno=-1, getChildCount=1, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourcePosition=-1, getString=!UnsupportedOperationException,...#378#-276811720", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "reportCodeChange", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "error", new String[]{"com.google.javascript.jscomp.DiagnosticType", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "endTraversal", "com.google.javascript.jscomp.NodeTraversal", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "error", new String[]{"com.google.javascript.jscomp.DiagnosticType", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "reportCodeChange", ""}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "endTraversal", "com.google.javascript.jscomp.NodeTraversal", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "error", new String[]{"com.google.javascript.jscomp.DiagnosticType", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<sample:4>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:4>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "reportCodeChange", ""}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "endTraversal", "com.google.javascript.jscomp.NodeTraversal", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "error", new String[]{"com.google.javascript.jscomp.DiagnosticType", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<sample:3>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:4>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "mayEffectMutableState", "com.google.javascript.rhino.Node", "<sample:4>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "endTraversal", "com.google.javascript.jscomp.NodeTraversal", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "areNodesEqualForInlining", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "areNodesEqualForInlining", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:7>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", ""}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "mayHaveSideEffects", "com.google.javascript.rhino.Node", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "areNodesEqualForInlining", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:0>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "mayHaveSideEffects", "com.google.javascript.rhino.Node", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "mayHaveSideEffects", "com.google.javascript.rhino.Node", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:3>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "error", "com.google.javascript.jscomp.DiagnosticType,com.google.javascript.rhino.Node", "<sample:0>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", new String[]{}, new String[]{}, false, 23, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "error", "com.google.javascript.jscomp.DiagnosticType,com.google.javascript.rhino.Node", "<null>", "<sample:1>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:3>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "error", "com.google.javascript.jscomp.DiagnosticType,com.google.javascript.rhino.Node", "<sample:0>", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "areNodesEqualForInlining", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:3>"}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "reportCodeChange", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:4>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", "com.google.javascript.rhino.Node", "<sample:3>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "reportCodeChange", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "endTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:0>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "reportCodeChange", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "mayHaveSideEffects", "com.google.javascript.rhino.Node", "<sample:0>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:4>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", "com.google.javascript.rhino.Node", "<sample:2>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "endTraversal", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:6>"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "endTraversal", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:1>"}, false, 3, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "validateResult", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "validateResult", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "validateResult", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "mayHaveSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", "com.google.javascript.rhino.Node", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "mayEffectMutableState", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:1>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "error", "com.google.javascript.jscomp.DiagnosticType,com.google.javascript.rhino.Node", "<sample:3>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "mayEffectMutableState", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:1>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "error", "com.google.javascript.jscomp.DiagnosticType,com.google.javascript.rhino.Node", "<sample:3>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$NumberNode", actual.getClass().getName());
  assertEquals("NUMBER -Infinity {getCharno=-1, getChildCount=0, getDouble=-Infinity, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourcePosition=-1, getString=!UnsupportedOperationException, getType...#373#1387726836", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("LEAVEWITH {getCharno=-1, getChildCount=3, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourcePosition=-1, getString=!UnsupportedOperationExce...#383#1808116099", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("GOTO 7 {getCharno=8, getChildCount=1, getDouble=!UnsupportedOperationException, getLineno=7, getQualifiedName=null, getSideEffectFlags=0, getSourcePosition=28680, getString=!UnsupportedOperationExcept...#381#-1226051941", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:0>"}, false, 13, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "areNodesEqualForInlining", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", "com.google.javascript.rhino.Node", "<sample:6>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "mayHaveSideEffects", "com.google.javascript.rhino.Node", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "mayHaveSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "mayHaveSideEffects", "com.google.javascript.rhino.Node", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "validateResult", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "error", new String[]{"com.google.javascript.jscomp.DiagnosticType", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<sample:3>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "mayEffectMutableState", "com.google.javascript.rhino.Node", "<sample:4>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "mayHaveSideEffects", "com.google.javascript.rhino.Node", "<sample:7>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:10>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "error", new String[]{"com.google.javascript.jscomp.DiagnosticType", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<sample:4>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "mayEffectMutableState", "com.google.javascript.rhino.Node", "<sample:4>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "mayHaveSideEffects", "com.google.javascript.rhino.Node", "<sample:7>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:10>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "error", new String[]{"com.google.javascript.jscomp.DiagnosticType", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<sample:2>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "mayEffectMutableState", "com.google.javascript.rhino.Node", "<sample:7>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "endTraversal", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<null>"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "mayHaveSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "mayHaveSideEffects", "com.google.javascript.rhino.Node", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "mayHaveSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "areNodesEqualForInlining", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:2>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "mayHaveSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "endTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "reportCodeChange", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "reportCodeChange", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", ""}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "mayEffectMutableState", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:5>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "reportCodeChange", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "areNodesEqualForInlining", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:6>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "mayEffectMutableState", "com.google.javascript.rhino.Node", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "error", new String[]{"com.google.javascript.jscomp.DiagnosticType", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<sample:7>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:10>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "mayEffectMutableState", "com.google.javascript.rhino.Node", "<sample:6>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "endTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING <a><b>t</b></a> {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourcePosition=-1, getString=<a><b>t</b><...#385#137478744", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:13>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "mayEffectMutableState", "com.google.javascript.rhino.Node", "<sample:7>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "endTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:10>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BITAND {getCharno=-1, getChildCount=1, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourcePosition=-1, getString=!UnsupportedOperationExcepti...#382#-600967908", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:13>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "mayEffectMutableState", "com.google.javascript.rhino.Node", "<sample:7>"}}), new String[][]{{"isQualifiedName", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:15>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "mayEffectMutableState", "com.google.javascript.rhino.Node", "<sample:7>"}}), new String[][]{{"getBooleanProp", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:15>"}, false, 3, new String[][]{}, 1), new String[][]{{"getBooleanProp", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:15>"}, false, 13, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "mayEffectMutableState", "com.google.javascript.rhino.Node", "<sample:1>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", "com.google.javascript.rhino.Node", "<sample:13>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:10>"}}, 3), new String[][]{{"getLastChild", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("ERROR {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourcePosition=-1, getString=!UnsupportedOperationExceptio...#382#1840568114", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:15>"}, false, 11, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "error", "com.google.javascript.jscomp.DiagnosticType,com.google.javascript.rhino.Node", "<sample:1>", "<sample:1>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "mayHaveSideEffects", "com.google.javascript.rhino.Node", "<sample:7>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", "com.google.javascript.rhino.Node", "<sample:13>"}}, 1), new String[][]{{"copyInformationFrom", "com.google.javascript.rhino.Node", "5"}, {"putProp", "int,java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("GT [break: ] {getCharno=-1, getChildCount=2, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourcePosition=-1, getString=!UnsupportedOperationE...#388#-799593580", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:15>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", "com.google.javascript.rhino.Node", "<sample:13>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "error", "com.google.javascript.jscomp.DiagnosticType,com.google.javascript.rhino.Node", "<sample:6>", "<sample:1>"}}, 2), new String[][]{{"copyInformationFrom", "com.google.javascript.rhino.Node", "5"}, {"putProp", "int,java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("GT [break: ] {getCharno=-1, getChildCount=2, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourcePosition=-1, getString=!UnsupportedOperationE...#388#-799593580", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$NumberNode", actual.getClass().getName());
  assertEquals("NUMBER -Infinity {getCharno=-1, getChildCount=0, getDouble=-Infinity, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourcePosition=-1, getString=!UnsupportedOperationException, getType...#373#1387726836", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:15>"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("GT {getCharno=-1, getChildCount=2, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourcePosition=-1, getString=!UnsupportedOperationException, ...#378#327348993", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:16>"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("ERROR {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourcePosition=-1, getString=!UnsupportedOperationExceptio...#382#1840568114", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:15>"}, false, 1, new String[][]{}, 2), new String[][]{{"hasMoreThanOneChild", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 1, new String[][]{}, 2), new String[][]{{"hasMoreThanOneChild", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 9, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:15>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "endTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:2>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", ""}}, 3), new String[][]{{"getParent", "", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:15>"}, false, 13, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "endTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:2>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("GT {getCharno=-1, getChildCount=2, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourcePosition=-1, getString=!UnsupportedOperationException, ...#378#327348993", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:15>"}, false, 13, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "endTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:2>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", ""}}, 3), new String[][]{{"getLineno", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:15>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "reportCodeChange", ""}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "mayHaveSideEffects", "com.google.javascript.rhino.Node", "<sample:0>"}}, 1), new String[][]{{"getLineno", "", "7"}, {"hasChild", "com.google.javascript.rhino.Node", "7"}, {"getParent", "", "3"}, {"hasMoreThanOneChild", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:15>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:5>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "reportCodeChange", ""}}, 1), new String[][]{{"addSuppression", "java.lang.String", "7"}, {"getFirstChild", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("OBJECTLIT {getCharno=-1, getChildCount=3, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourcePosition=-1, getString=!UnsupportedOperationExce...#385#1454171812", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "error", new String[]{"com.google.javascript.jscomp.DiagnosticType", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:10>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:15>"}, false, 10, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", ""}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", ""}}, 3), new String[][]{{"getChildAtIndex", "int", "5"}, {"hasChildren", "", "5"}, {"getJSDocInfo", "", "0"}, {"appendStringTree", "java.lang.Appendable", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "mayEffectMutableState", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "error", "com.google.javascript.jscomp.DiagnosticType,com.google.javascript.rhino.Node", "<sample:3>", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:15>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", ""}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "error", "com.google.javascript.jscomp.DiagnosticType,com.google.javascript.rhino.Node", "<sample:0>", "<sample:6>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", "com.google.javascript.rhino.Node", "<sample:2>"}}, 1), new String[][]{{"getChildAtIndex", "int", "5"}, {"getBooleanProp", "int", "5"}, {"getJSDocInfo", "", "0"}, {"appendStringTree", "java.lang.Appendable", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:10>"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "error", new String[]{"com.google.javascript.jscomp.DiagnosticType", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", "com.google.javascript.rhino.Node", "<sample:4>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:7>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:13>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "areNodesEqualForInlining", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:1>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "mayEffectMutableState", "com.google.javascript.rhino.Node", "<sample:7>"}}, 1), new String[][]{{"getDouble", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:15>"}, false, 8, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", "com.google.javascript.rhino.Node", "<sample:5>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "error", "com.google.javascript.jscomp.DiagnosticType,com.google.javascript.rhino.Node", "<sample:6>", "<sample:5>"}}, 1), new String[][]{{"getDirectives", "", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "validateResult", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:15>"}, false, 8, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", ""}}, 1), new String[][]{{"getType", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "mayHaveSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "mayHaveSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "mayHaveSideEffects", "com.google.javascript.rhino.Node", "<sample:4>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:10>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "mayEffectMutableState", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", new String[]{}, new String[]{}, false, 8, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "areNodesEqualForInlining", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "endTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:4>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "error", new String[]{"com.google.javascript.jscomp.DiagnosticType", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:0>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "reportCodeChange", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:7>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "validateResult", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:11>"}, false, 4, new String[][]{}), new String[][]{{"getLastSibling", "", "7"}, {"getDouble", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "reportCodeChange", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:5>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "mayHaveSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:10>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", "com.google.javascript.rhino.Node", "<sample:11>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:7>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "mayEffectMutableState", "com.google.javascript.rhino.Node", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "mayHaveSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "mayHaveSideEffects", "com.google.javascript.rhino.Node", "<sample:11>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:6>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", "com.google.javascript.rhino.Node", "<sample:11>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "error", new String[]{"com.google.javascript.jscomp.DiagnosticType", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:3>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "mayHaveSideEffects", "com.google.javascript.rhino.Node", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "validateResult", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "mayEffectMutableState", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:10>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "areNodesEqualForInlining", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:8>"}, false, 15, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:3>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "reportCodeChange", ""}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "reportCodeChange", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "areNodesEqualForInlining", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:5>"}, false, 15, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:3>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "reportCodeChange", ""}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "reportCodeChange", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "areNodesEqualForInlining", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<sample:4>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "areNodesEqualForInlining", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:13>", "<sample:13>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "mayEffectMutableState", "com.google.javascript.rhino.Node", "<null>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:2>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "reportCodeChange", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "mayEffectMutableState", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "endTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:10>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:2>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:10>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "mayEffectMutableState", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:10>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "endTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:10>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:2>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:10>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "mayHaveSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:1>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "mayEffectMutableState", "com.google.javascript.rhino.Node", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "mayEffectMutableState", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:12>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:2>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
}
