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
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "getCodingConvention", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "isEcmaScript5OrGreater", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "validateResult", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", new String[]{"com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:2>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", new String[]{"com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:3>"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", new String[]{"com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:1>"}, false, 11, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "mayEffectMutableState", "com.google.javascript.rhino.Node", "<sample:5>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "isEcmaScript5OrGreater", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "isEcmaScript5OrGreater", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$NumberNode", actual.getClass().getName());
  assertEquals("NUMBER -Infinity {getCharno=-1, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getSourcePosit...#339#1917934166", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "mayEffectMutableState", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", ""}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "reportCodeChange", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "mayEffectMutableState", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", ""}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "reportCodeChange", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "mayHaveSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "mayHaveSideEffects", "com.google.javascript.rhino.Node", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "getCodingConvention", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:12>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "getCodingConvention", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING <a><b>t</b></a> {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#351#302262130", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "mayHaveSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:11>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "getCodingConvention", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BITOR 32 {getCharno=64, getChildCount=4, getDouble=!UnsupportedOperationException, getLength=0, getLineno=32, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, g...#353#2146048475", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "mayEffectMutableState", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:11>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", "com.google.javascript.rhino.Node", "<sample:7>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "error", "com.google.javascript.jscomp.DiagnosticType,com.google.javascript.rhino.Node", "<sample:2>", "<sample:9>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:11>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "getCodingConvention", ""}}), new String[][]{{"isCase", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:11>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "getCodingConvention", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BITOR 32 {getCharno=64, getChildCount=4, getDouble=!UnsupportedOperationException, getLength=0, getLineno=32, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, g...#353#2146048475", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "getCodingConvention", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("ERROR {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getS...#349#637856945", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:11>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "getCodingConvention", ""}}), new String[][]{{"getJSDocInfo", "", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:8>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "isEcmaScript5OrGreater", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "getCodingConvention", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:2>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "isEcmaScript5OrGreater", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "areNodesEqualForInlining", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:9>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "isEcmaScript5OrGreater", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "areNodesEqualForInlining", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:8>", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "isEcmaScript5OrGreater", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "reportCodeChange", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "reportCodeChange", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:3>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "reportCodeChange", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "mayEffectMutableState", "com.google.javascript.rhino.Node", "<sample:5>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", "com.google.javascript.rhino.Node", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "error", new String[]{"com.google.javascript.jscomp.DiagnosticType", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "endTraversal", new String[]{"com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "areNodesEqualForInlining", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:9>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$NumberNode", actual.getClass().getName());
  assertEquals("NUMBER -Infinity {getCharno=-1, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getSourcePosit...#339#1917934166", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "error", new String[]{"com.google.javascript.jscomp.DiagnosticType", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "isEcmaScript5OrGreater", ""}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "error", "com.google.javascript.jscomp.DiagnosticType,com.google.javascript.rhino.Node", "<sample:6>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "endTraversal", new String[]{"com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "getCodingConvention", ""}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "mayEffectMutableState", "com.google.javascript.rhino.Node", "<sample:2>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "error", new String[]{"com.google.javascript.jscomp.DiagnosticType", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<sample:11>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "mayHaveSideEffects", "com.google.javascript.rhino.Node", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", new String[]{"com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "reportCodeChange", ""}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", "com.google.javascript.rhino.Node", "<sample:11>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "endTraversal", new String[]{"com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:3>"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "endTraversal", new String[]{"com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "mayHaveSideEffects", "com.google.javascript.rhino.Node", "<sample:6>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "error", new String[]{"com.google.javascript.jscomp.DiagnosticType", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<sample:2>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "getCodingConvention", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.ClosureCodingConvention", actual.getClass().getName());
  assertEquals("{getAbstractMethodName=goog.abstractMethod, getDelegateSuperclassName=null, getExportPropertyFunction=goog.exportProperty, getExportSymbolFunction=goog.exportSymbol, getGlobalObject=goog.global}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "isEcmaScript5OrGreater", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "reportCodeChange", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "mayHaveSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "areNodesEqualForInlining", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:9>", "<null>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "mayEffectMutableState", "com.google.javascript.rhino.Node", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "mayEffectMutableState", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:9>"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "areNodesEqualForInlining", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:2>"}}), new String[][]{{"getSideEffectFlags", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "areNodesEqualForInlining", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "getCodingConvention", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "validateResult", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "reportCodeChange", ""}}), new String[][]{{"getAncestors", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$AncestorIterable", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:11>"}, false, 1, new String[][]{}, 3), new String[][]{{"addChildBefore", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "areNodesEqualForInlining", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "getCodingConvention", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "mayHaveSideEffects", "com.google.javascript.rhino.Node", "<sample:9>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "isEcmaScript5OrGreater", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "validateResult", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "areNodesEqualForInlining", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:7>"}}, 2), new String[][]{{"addChildToBack", "com.google.javascript.rhino.Node", "6"}, {"addChildToBack", "com.google.javascript.rhino.Node", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("ERROR {getCharno=-1, getChildCount=2, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getS...#347#133178429", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "mayEffectMutableState", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:11>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "error", new String[]{"com.google.javascript.jscomp.DiagnosticType", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<sample:10>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", "com.google.javascript.rhino.Node", "<sample:5>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:6>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "error", new String[]{"com.google.javascript.jscomp.DiagnosticType", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", "com.google.javascript.rhino.Node", "<sample:5>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:6>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "error", new String[]{"com.google.javascript.jscomp.DiagnosticType", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:5>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "isEcmaScript5OrGreater", ""}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:4>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "endTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:6>"}}, 1), new String[][]{{"getSourcePosition", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "validateResult", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false, 0, null, 3), new String[][]{{"getIntProp", "int", "7"}, {"isAdd", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false, 0, null, 3), new String[][]{{"getIntProp", "int", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "reportCodeChange", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false, 0, null, 3), new String[][]{{"getIntProp", "int", "7"}, {"getStaticSourceFile", "", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "mayHaveSideEffects", "com.google.javascript.rhino.Node", "<sample:0>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", "com.google.javascript.rhino.Node", "<sample:3>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "areNodesEqualForInlining", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "isEcmaScript5OrGreater", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "reportCodeChange", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "getCodingConvention", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:11>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<null>"}}, 1), new String[][]{{"cloneNode", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BITOR 32 {getCharno=64, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=32, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, g...#355#-1772069111", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:10>"}, false, 3, new String[][]{}, 1), new String[][]{{"cloneNode", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING <a><b>t</b></a> {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#351#302262130", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:7>"}}, 1), new String[][]{{"cloneNode", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$NumberNode", actual.getClass().getName());
  assertEquals("NUMBER -Infinity {getCharno=-1, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getSourcePosit...#339#1917934166", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:7>"}}, 1), new String[][]{{"cloneNode", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:11>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "getCodingConvention", ""}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", "com.google.javascript.rhino.Node", "<sample:1>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:0>"}}, 2), new String[][]{{"clonePropsFrom", "com.google.javascript.rhino.Node", "3"}, {"isBlock", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "getCodingConvention", ""}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", ""}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", "com.google.javascript.rhino.Node", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:11>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "getCodingConvention", ""}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", "com.google.javascript.rhino.Node", "<sample:1>"}}, 2), new String[][]{{"clonePropsFrom", "com.google.javascript.rhino.Node", "3"}, {"isBlock", "", "3"}, {"getJsDocBuilderForNode", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$FileLevelJsDocBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "mayHaveSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "reportCodeChange", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, false, 14, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "error", "com.google.javascript.jscomp.DiagnosticType,com.google.javascript.rhino.Node", "<sample:1>", "<sample:2>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "mayEffectMutableState", "com.google.javascript.rhino.Node", "<sample:8>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", "com.google.javascript.rhino.Node", "<sample:11>"}}, 1), new String[][]{{"getSourcePosition", "", "3"}, {"isBlock", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:11>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", "com.google.javascript.rhino.Node", "<sample:11>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "reportCodeChange", ""}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "areNodesEqualForInlining", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:0>"}}, 2), new String[][]{{"getDirectives", "", "3"}, {"isBlock", "", "3"}, {"getLastSibling", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BITOR 32 {getCharno=64, getChildCount=4, getDouble=!UnsupportedOperationException, getLength=0, getLineno=32, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, g...#353#2146048475", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:10>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", "com.google.javascript.rhino.Node", "<sample:11>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "areNodesEqualForInlining", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:0>"}}, 2), new String[][]{{"getDirectives", "", "3"}, {"isBlock", "", "3"}, {"getLastSibling", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING <a><b>t</b></a> {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#351#302262130", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "error", "com.google.javascript.jscomp.DiagnosticType,com.google.javascript.rhino.Node", "<sample:2>", "<sample:1>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", ""}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", "com.google.javascript.rhino.Node", "<sample:11>"}}, 3), new String[][]{{"getIndexOfChild", "com.google.javascript.rhino.Node", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", ""}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", "com.google.javascript.rhino.Node", "<sample:11>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$NumberNode", actual.getClass().getName());
  assertEquals("NUMBER -Infinity {getCharno=-1, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getSourcePosit...#339#1917934166", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:2>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", "com.google.javascript.rhino.Node", "<sample:11>"}}, 1), new String[][]{{"getJsDocBuilderForNode", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$FileLevelJsDocBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "areNodesEqualForInlining", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<sample:0>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "isEcmaScript5OrGreater", ""}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "mayEffectMutableState", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:15>"}, false, 11, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "mayHaveSideEffects", "com.google.javascript.rhino.Node", "<sample:5>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", ""}}), new String[][]{{"getSourcePosition", "", "6"}, {"getLastChild", "", "0"}, {"addSuppression", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("CONTINUE [jsdoc_info: JSDocInfo] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=nul...#377#428691208", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "error", new String[]{"com.google.javascript.jscomp.DiagnosticType", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "getCodingConvention", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "mayHaveSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "getCodingConvention", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "mayEffectMutableState", "com.google.javascript.rhino.Node", "<sample:15>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "reportCodeChange", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "mayHaveSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "mayEffectMutableState", "com.google.javascript.rhino.Node", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "error", new String[]{"com.google.javascript.jscomp.DiagnosticType", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "mayEffectMutableState", "com.google.javascript.rhino.Node", "<sample:11>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "mayHaveSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "endTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:3>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "getCodingConvention", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<null>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.ClosureCodingConvention", actual.getClass().getName());
  assertEquals("{getAbstractMethodName=goog.abstractMethod, getDelegateSuperclassName=null, getExportPropertyFunction=goog.exportProperty, getExportSymbolFunction=goog.exportSymbol, getGlobalObject=goog.global}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "getCodingConvention", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<null>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:1>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", ""}}, 3), new String[][]{{"describeFunctionBind", "com.google.javascript.rhino.Node,boolean", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "getCodingConvention", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:6>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:5>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", ""}}, 3), new String[][]{{"isConstant", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "validateResult", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "validateResult", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "reportCodeChange", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:9>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "reportCodeChange", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "reportCodeChange", ""}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:2>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "validateResult", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "mayHaveSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "areNodesEqualForInlining", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:2>"}, false, 13, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", "com.google.javascript.rhino.Node", "<sample:11>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", "com.google.javascript.rhino.Node", "<sample:15>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "areNodesEqualForInlining", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<sample:5>"}, false, 13, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", "com.google.javascript.rhino.Node", "<sample:11>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", "com.google.javascript.rhino.Node", "<sample:15>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "mayEffectMutableState", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:9>"}, false, 8, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "mayHaveSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 9, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "mayHaveSideEffects", "com.google.javascript.rhino.Node", "<sample:0>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", "com.google.javascript.rhino.Node", "<sample:2>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "validateResult", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "error", new String[]{"com.google.javascript.jscomp.DiagnosticType", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<sample:6>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:7>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "areNodesEqualForInlining", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:15>", "<sample:15>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:2>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "mayEffectMutableState", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "isEcmaScript5OrGreater", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "mayHaveSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "areNodesEqualForInlining", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:9>", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "mayHaveSideEffects", "com.google.javascript.rhino.Node", "<sample:0>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "mayHaveSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "error", "com.google.javascript.jscomp.DiagnosticType,com.google.javascript.rhino.Node", "<sample:8>", "<sample:6>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "endTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "mayHaveSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:11>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "endTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<null>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "error", "com.google.javascript.jscomp.DiagnosticType,com.google.javascript.rhino.Node", "<sample:2>", "<sample:9>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "error", "com.google.javascript.jscomp.DiagnosticType,com.google.javascript.rhino.Node", "<sample:7>", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "getCodingConvention", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:5>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "isEcmaScript5OrGreater", ""}}), new String[][]{{"isPrivate", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "getCodingConvention", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:5>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "mayEffectMutableState", "com.google.javascript.rhino.Node", "<sample:2>"}}), new String[][]{{"describeFunctionBind", "com.google.javascript.rhino.Node,boolean", "2"}, {"extractClassNameIfRequire", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "reportCodeChange", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "mayEffectMutableState", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:14>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "error", "com.google.javascript.jscomp.DiagnosticType,com.google.javascript.rhino.Node", "<null>", "<null>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "error", "com.google.javascript.jscomp.DiagnosticType,com.google.javascript.rhino.Node", "<sample:1>", "<sample:6>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "endTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "mayEffectMutableState", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "error", "com.google.javascript.jscomp.DiagnosticType,com.google.javascript.rhino.Node", "<sample:2>", "<sample:15>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "mayEffectMutableState", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 9, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "mayEffectMutableState", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 9, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "isEcmaScript5OrGreater", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "error", "com.google.javascript.jscomp.DiagnosticType,com.google.javascript.rhino.Node", "<sample:6>", "<sample:0>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", "com.google.javascript.rhino.Node", "<sample:3>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:10>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "getCodingConvention", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:7>"}}), new String[][]{{"getAssertionFunctions", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.RegularImmutableList", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "getCodingConvention", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", "com.google.javascript.rhino.Node", "<sample:7>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:3>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "error", "com.google.javascript.jscomp.DiagnosticType,com.google.javascript.rhino.Node", "<sample:0>", "<sample:4>"}}, 1), new String[][]{{"getDelegateSuperclassName", "", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "getCodingConvention", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", "com.google.javascript.rhino.Node", "<sample:7>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:3>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "error", "com.google.javascript.jscomp.DiagnosticType,com.google.javascript.rhino.Node", "<sample:0>", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.ClosureCodingConvention", actual.getClass().getName());
  assertEquals("{getAbstractMethodName=goog.abstractMethod, getDelegateSuperclassName=null, getExportPropertyFunction=goog.exportProperty, getExportSymbolFunction=goog.exportSymbol, getGlobalObject=goog.global}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "isEcmaScript5OrGreater", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
}
