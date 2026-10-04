package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "isEcmaScript5OrGreater", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "getCodingConvention", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "getCodingConvention", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "mayEffectMutableState", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "reportCodeChange", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "mayHaveSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "mayHaveSideEffects", "com.google.javascript.rhino.Node", "<sample:5>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "error", new String[]{"com.google.javascript.jscomp.DiagnosticType", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:5>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "endTraversal", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", "com.google.javascript.rhino.Node", "<sample:7>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "validateResult", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "endTraversal", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:4>"}, false, 1, new String[][]{}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "isEcmaScript5OrGreater", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("LEAVEWITH {getCharno=-1, getChildCount=3, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=2147...#366#-1984407823", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "getCodingConvention", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "error", "com.google.javascript.jscomp.DiagnosticType,com.google.javascript.rhino.Node", "<sample:6>", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:5>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "getCodingConvention", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$NumberNode", actual.getClass().getName());
  assertEquals("NUMBER -Infinity {getCharno=-1, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=2147483647, getSou...#356#982369688", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "areNodesEqualForInlining", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<sample:2>"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "error", new String[]{"com.google.javascript.jscomp.DiagnosticType", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<sample:1>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "reportCodeChange", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", ""}}), new String[][]{{"getSourceOffset", "", "0"}, {"getAncestor", "int", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "getCodingConvention", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.ClosureCodingConvention", actual.getClass().getName());
  assertEquals("{getAbstractMethodName=goog.abstractMethod, getDelegateSuperclassName=null, getExportPropertyFunction=goog.exportProperty, getExportSymbolFunction=goog.exportSymbol, getGlobalObject=goog.global}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "reportCodeChange", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "endTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:3>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:1>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "mayHaveSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "areNodesEqualForInlining", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<sample:2>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", "com.google.javascript.rhino.Node", "<sample:1>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "endTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "getCodingConvention", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "isEcmaScript5OrGreater", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("GOTO 7 {getCharno=8, getChildCount=1, getDouble=!UnsupportedOperationException, getLength=0, getLineno=7, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-21474836...#365#1343730483", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "reportCodeChange", ""}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false, 2, new String[][]{}), new String[][]{{"getExistingIntProp", "int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", "com.google.javascript.rhino.Node", "<sample:3>"}}), new String[][]{{"getSideEffectFlags", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "endTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:10>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("ERROR {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=21474836...#365#658009452", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "mayHaveSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$NumberNode", actual.getClass().getName());
  assertEquals("NUMBER -Infinity {getCharno=-1, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=2147483647, getSou...#356#982369688", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "endTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:8>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", "com.google.javascript.rhino.Node", "<sample:4>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "getCodingConvention", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("ERROR {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=21474836...#365#658009452", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "getCodingConvention", ""}}, 3), new String[][]{{"addChildBefore", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "validateResult", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:1>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "validateResult", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "isEcmaScript5OrGreater", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:1>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("EOF {getCharno=-1, getChildCount=1, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=2147483647...#361#-1414545160", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "areNodesEqualForInlining", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:6>"}}, 1), new String[][]{{"getLastSibling", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$NumberNode", actual.getClass().getName());
  assertEquals("NUMBER -Infinity {getCharno=-1, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=2147483647, getSou...#356#982369688", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "getCodingConvention", ""}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:4>"}}, 1), new String[][]{{"isEquivalentToTyped", "com.google.javascript.rhino.Node", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "error", new String[]{"com.google.javascript.jscomp.DiagnosticType", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", ""}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "reportCodeChange", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "reportCodeChange", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "validateResult", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "validateResult", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "reportCodeChange", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "isEcmaScript5OrGreater", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "mayHaveSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false, 0, null, 2), new String[][]{{"isEquivalentToTyped", "com.google.javascript.rhino.Node", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 3, new String[][]{}, 2), new String[][]{{"getProp", "int", "7"}, {"getDouble", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "mayHaveSideEffects", "com.google.javascript.rhino.Node", "<sample:6>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:4>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "error", new String[]{"com.google.javascript.jscomp.DiagnosticType", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "endTraversal", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", "com.google.javascript.rhino.Node", "<sample:8>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "mayHaveSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "reportCodeChange", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "mayEffectMutableState", "com.google.javascript.rhino.Node", "<sample:5>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "error", "com.google.javascript.jscomp.DiagnosticType,com.google.javascript.rhino.Node", "<sample:3>", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "mayHaveSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "areNodesEqualForInlining", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:8>", "<sample:3>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "mayEffectMutableState", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "isEcmaScript5OrGreater", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, false, 0, null, 3), new String[][]{{"addSuppression", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("EOL 0 [jsdoc_info: JSDocInfo] {getCharno=0, getChildCount=2, getDouble=!UnsupportedOperationException, getLength=0, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, ge...#385#17288617", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "mayEffectMutableState", "com.google.javascript.rhino.Node", "<sample:4>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "error", "com.google.javascript.jscomp.DiagnosticType,com.google.javascript.rhino.Node", "<sample:4>", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "getCodingConvention", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "areNodesEqualForInlining", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "error", "com.google.javascript.jscomp.DiagnosticType,com.google.javascript.rhino.Node", "<null>", "<sample:8>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "endTraversal", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:4>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", "com.google.javascript.rhino.Node", "<null>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "mayEffectMutableState", "com.google.javascript.rhino.Node", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$NumberNode", actual.getClass().getName());
  assertEquals("NUMBER -Infinity {getCharno=-1, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=2147483647, getSou...#356#982369688", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", "com.google.javascript.rhino.Node", "<sample:10>"}}, 2), new String[][]{{"hasSideEffects", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 0, null, 3), new String[][]{{"isVarArgs", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:9>"}, false, 0, null, 1), new String[][]{{"getString", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "mayEffectMutableState", "com.google.javascript.rhino.Node", "<sample:4>"}}, 2), new String[][]{{"getSourceOffset", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("GOTO 7 {getCharno=8, getChildCount=1, getDouble=!UnsupportedOperationException, getLength=0, getLineno=7, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-21474836...#365#1343730483", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", "com.google.javascript.rhino.Node", "<sample:7>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "endTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:4>"}}, 1), new String[][]{{"getChildBefore", "com.google.javascript.rhino.Node", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "areNodesEqualForInlining", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "reportCodeChange", ""}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "error", "com.google.javascript.jscomp.DiagnosticType,com.google.javascript.rhino.Node", "<null>", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("EOF {getCharno=-1, getChildCount=1, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=2147483647...#361#-1414545160", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "error", new String[]{"com.google.javascript.jscomp.DiagnosticType", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<sample:2>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", "com.google.javascript.rhino.Node", "<sample:0>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", ""}}, 2), new String[][]{{"getAncestor", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "error", new String[]{"com.google.javascript.jscomp.DiagnosticType", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<sample:8>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "error", "com.google.javascript.jscomp.DiagnosticType,com.google.javascript.rhino.Node", "<sample:2>", "<sample:4>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "mayEffectMutableState", "com.google.javascript.rhino.Node", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "error", new String[]{"com.google.javascript.jscomp.DiagnosticType", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:3>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "reportCodeChange", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "validateResult", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:11>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", ""}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "reportCodeChange", ""}}), new String[][]{{"isEquivalentTo", "com.google.javascript.rhino.Node", "2"}, {"getChildAtIndex", "int", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BITAND {getCharno=-1, getChildCount=1, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=2147483...#365#-718550516", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "areNodesEqualForInlining", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "mayEffectMutableState", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:9>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "mayEffectMutableState", "com.google.javascript.rhino.Node", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "endTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:2>"}}, 2), new String[][]{{"getParent", "", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "error", new String[]{"com.google.javascript.jscomp.DiagnosticType", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:4>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:3>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:13>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "endTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BITAND {getCharno=-1, getChildCount=1, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=2147483...#365#-718550516", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "mayEffectMutableState", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:11>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "reportCodeChange", ""}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "mayEffectMutableState", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:15>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "mayHaveSideEffects", "com.google.javascript.rhino.Node", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("GT {getCharno=-1, getChildCount=2, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=2147483647,...#361#2019063725", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "reportCodeChange", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:6>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:21>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:5>"}}, 3), new String[][]{{"getLength", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "mayHaveSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "mayHaveSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:12>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "getCodingConvention", ""}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "mayEffectMutableState", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:11>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:12>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING <a><b>t</b></a> {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#368#9706476", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "mayHaveSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "validateResult", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", "com.google.javascript.rhino.Node", "<sample:14>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "endTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "error", new String[]{"com.google.javascript.jscomp.DiagnosticType", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<sample:3>"}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "reportCodeChange", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:4>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "isEcmaScript5OrGreater", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "areNodesEqualForInlining", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:6>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "isEcmaScript5OrGreater", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "mayEffectMutableState", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:11>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "areNodesEqualForInlining", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:1>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "reportCodeChange", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:7>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "mayHaveSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "getCodingConvention", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:6>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "isEcmaScript5OrGreater", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.ClosureCodingConvention", actual.getClass().getName());
  assertEquals("{getAbstractMethodName=goog.abstractMethod, getDelegateSuperclassName=null, getExportPropertyFunction=goog.exportProperty, getExportSymbolFunction=goog.exportSymbol, getGlobalObject=goog.global}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "error", new String[]{"com.google.javascript.jscomp.DiagnosticType", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "mayHaveSideEffects", "com.google.javascript.rhino.Node", "<sample:11>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "error", new String[]{"com.google.javascript.jscomp.DiagnosticType", "com.google.javascript.rhino.Node"}, new String[]{"<sample:12>", "<sample:11>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:4>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "getCodingConvention", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:7>"}}), new String[][]{{"isOptionalParameter", "com.google.javascript.rhino.Node", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "validateResult", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "mayHaveSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "error", new String[]{"com.google.javascript.jscomp.DiagnosticType", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<sample:10>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:0>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "mayHaveSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "reportCodeChange", ""}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "isEcmaScript5OrGreater", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "mayHaveSideEffects", "com.google.javascript.rhino.Node", "<sample:2>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", "com.google.javascript.rhino.Node", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "areNodesEqualForInlining", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:16>", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "mayEffectMutableState", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:8>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "getCodingConvention", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:0>"}}, 1), new String[][]{{"isExported", "java.lang.String,boolean", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "areNodesEqualForInlining", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:0>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "mayEffectMutableState", "com.google.javascript.rhino.Node", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "getCodingConvention", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.ClosureCodingConvention", actual.getClass().getName());
  assertEquals("{getAbstractMethodName=goog.abstractMethod, getDelegateSuperclassName=null, getExportPropertyFunction=goog.exportProperty, getExportSymbolFunction=goog.exportSymbol, getGlobalObject=goog.global}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "getCodingConvention", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:4>"}}), new String[][]{{"getDelegateSuperclassName", "", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "areNodesEqualForInlining", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "getCodingConvention", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:0>"}}, 3), new String[][]{{"extractClassNameIfProvide", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "getCodingConvention", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:7>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "error", "com.google.javascript.jscomp.DiagnosticType,com.google.javascript.rhino.Node", "<sample:9>", "<sample:9>"}}), new String[][]{{"getAssertionFunctions", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.RegularImmutableList", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "getCodingConvention", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "mayEffectMutableState", "com.google.javascript.rhino.Node", "<sample:3>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:6>"}}), new String[][]{{"getAssertionFunctions", "", "5"}, {"addAll", "int,java.util.Collection", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "getCodingConvention", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:2>"}}), new String[][]{{"getAbstractMethodName", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("goog.abstractMethod", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "getCodingConvention", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:3>"}}), new String[][]{{"getAssertionFunctions", "", "5"}, {"size", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "getCodingConvention", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:2>"}}, 2), new String[][]{{"getAssertionFunctions", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.RegularImmutableList", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "getCodingConvention", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:7>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "getCodingConvention", ""}}, 1), new String[][]{{"getDelegateSuperclassName", "", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "mayEffectMutableState", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "getCodingConvention", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.ClosureCodingConvention", actual.getClass().getName());
  assertEquals("{getAbstractMethodName=goog.abstractMethod, getDelegateSuperclassName=null, getExportPropertyFunction=goog.exportProperty, getExportSymbolFunction=goog.exportSymbol, getGlobalObject=goog.global}", SearchInputFactory_scaffolding.observe(actual));
 }
}
