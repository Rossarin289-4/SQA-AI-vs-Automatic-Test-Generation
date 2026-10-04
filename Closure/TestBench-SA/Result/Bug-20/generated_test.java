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
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "areMatchingExits", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<null>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isASTNormalized", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "areMatchingExits", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:1>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isASTNormalized", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "mayEffectMutableState", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "error", new String[]{"com.google.javascript.jscomp.DiagnosticType", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "error", new String[]{"com.google.javascript.jscomp.DiagnosticType", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<sample:9>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "error", new String[]{"com.google.javascript.jscomp.DiagnosticType", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "error", new String[]{"com.google.javascript.jscomp.DiagnosticType", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<sample:7>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "error", "com.google.javascript.jscomp.DiagnosticType,com.google.javascript.rhino.Node", "<sample:1>", "<sample:2>"}, {"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "endTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "getCodingConvention", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.ClosureCodingConvention", actual.getClass().getName());
  assertEquals("{getAbstractMethodName=goog.abstractMethod, getDelegateSuperclassName=null, getExportPropertyFunction=goog.exportProperty, getExportSymbolFunction=goog.exportSymbol, getGlobalObject=goog.global}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "getCodingConvention", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:1>"}}), new String[][]{{"isPropertyTestFunction", "com.google.javascript.rhino.Node", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "getExceptionHandler", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "areNodesEqualForInlining", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "reportCodeChange", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:1>"}, false, 0, null, 1), new String[][]{{"children", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$SiblingNodeIterable", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "areMatchingExits", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<null>", "<sample:6>"}}, 1), new String[][]{{"children", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isASTNormalized", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false), new String[][]{{"getChildCount", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false, 1, new String[][]{}), new String[][]{{"getChildCount", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isPure", "com.google.javascript.rhino.Node", "<sample:0>"}}), new String[][]{{"getChildCount", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isPure", "com.google.javascript.rhino.Node", "<sample:6>"}}), new String[][]{{"getChildCount", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isPure", "com.google.javascript.rhino.Node", "<sample:6>"}}), new String[][]{{"getChildCount", "", "0"}, {"addChildAfter", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "reportCodeChange", ""}, {"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "areMatchingExits", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:1>"}}), new String[][]{{"getChildCount", "", "0"}, {"addChildAfter", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 10, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "skipFinallyNodes", "com.google.javascript.rhino.Node", "<sample:7>"}, {"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "reportCodeChange", ""}, {"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "areMatchingExits", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:1>"}}), new String[][]{{"getChildCount", "", "0"}, {"addChildAfter", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "skipFinallyNodes", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "skipFinallyNodes", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "skipFinallyNodes", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isExceptionPossible", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isExceptionPossible", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "mayEffectMutableState", "com.google.javascript.rhino.Node", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isExceptionPossible", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "reportCodeChange", ""}, {"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "mayEffectMutableState", "com.google.javascript.rhino.Node", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "reportCodeChange", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:0>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "areMatchingExits", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isEcmaScript5OrGreater", ""}, {"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "areMatchingExits", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "getCodingConvention", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isEcmaScript5OrGreater", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "mayHaveSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "mayHaveSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false), new String[][]{{"addSuppression", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$NumberNode", actual.getClass().getName());
  assertEquals("NUMBER -Infinity [jsdoc_info: JSDocInfo] {getCharno=-1, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceO...#363#2105857079", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false), new String[][]{{"isAssign", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false), new String[][]{{"isAssign", "", "7"}, {"getCharno", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 0, null, 1), new String[][]{{"isAssign", "", "7"}, {"getCharno", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 0, null, 1), new String[][]{{"isAssign", "", "7"}, {"getCharno", "", "2"}, {"isAssignAdd", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isPure", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "reportCodeChange", ""}, {"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "mayEffectMutableState", "com.google.javascript.rhino.Node", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isPure", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isEcmaScript5OrGreater", ""}, {"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:3>"}, {"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "mayEffectMutableState", "com.google.javascript.rhino.Node", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "skipFinallyNodes", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "containsUnicodeEscape", new String[]{"java.lang.String"}, new String[]{"Object"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "mayHaveSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isEcmaScript5OrGreater", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isASTNormalized", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isPure", "com.google.javascript.rhino.Node", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isEcmaScript5OrGreater", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isEcmaScript5OrGreater", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isExceptionPossible", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "areNodesEqualForInlining", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "endTraversal", new String[]{"com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:4>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isExceptionPossible", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isASTNormalized", ""}, {"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "mayHaveSideEffects", "com.google.javascript.rhino.Node", "<null>"}, {"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isPure", "com.google.javascript.rhino.Node", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "validateResult", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "validateResult", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isExceptionPossible", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isExceptionPossible", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isPure", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isPure", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "mayHaveSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "getCodingConvention", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isPure", "com.google.javascript.rhino.Node", "<sample:7>"}, {"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isASTNormalized", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "mayHaveSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "reportCodeChange", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isPure", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isPure", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:10>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isPure", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "areMatchingExits", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "endTraversal", new String[]{"com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:7>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "beginTraversal", new String[]{"com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:5>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isPure", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isExceptionPossible", "com.google.javascript.rhino.Node", "<sample:5>"}, {"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "areMatchingExits", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:0>"}, {"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "reportCodeChange", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isEcmaScript5OrGreater", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isPure", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:11>"}, false, 13, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isExceptionPossible", "com.google.javascript.rhino.Node", "<sample:2>"}, {"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isExceptionPossible", "com.google.javascript.rhino.Node", "<sample:7>"}, {"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "skipFinallyNodes", "com.google.javascript.rhino.Node", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "containsUnicodeEscape", new String[]{"java.lang.String"}, new String[]{"1e100"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "areNodesEqualForInlining", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "areMatchingExits", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:1>"}, {"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "areNodesEqualForInlining", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "containsUnicodeEscape", new String[]{"java.lang.String"}, new String[]{"\\u2028"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isEcmaScript5OrGreater", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "containsUnicodeEscape", new String[]{"java.lang.String"}, new String[]{"\\u2129.split(I'.')"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "containsUnicodeEscape", new String[]{"java.lang.String"}, new String[]{"\\u212A9.split(I_.')\037"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "containsUnicodeEscape", new String[]{"java.lang.String"}, new String[]{"\\u10tplita"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "containsUnicodeEscape", new String[]{"java.lang.String"}, new String[]{"\\\\u10tpl6t"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "containsUnicodeEscape", new String[]{"java.lang.String"}, new String[]{"\\\\u10np"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "containsUnicodeEscape", new String[]{"java.lang.String"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isPure", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 10, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isExceptionPossible", "com.google.javascript.rhino.Node", "<sample:9>"}, {"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isExceptionPossible", "com.google.javascript.rhino.Node", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "areMatchingExits", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:5>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "areMatchingExits", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:7>"}, {"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isPure", "com.google.javascript.rhino.Node", "<sample:6>"}, {"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isExceptionPossible", "com.google.javascript.rhino.Node", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "areMatchingExits", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:4>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "areMatchingExits", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:7>"}, {"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isPure", "com.google.javascript.rhino.Node", "<sample:6>"}, {"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isExceptionPossible", "com.google.javascript.rhino.Node", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "areMatchingExits", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<sample:6>"}, false, 8, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "areMatchingExits", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:7>"}, {"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isExceptionPossible", "com.google.javascript.rhino.Node", "<sample:3>"}, {"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isPure", "com.google.javascript.rhino.Node", "<sample:8>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "areMatchingExits", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:6>"}, false, 14, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "areMatchingExits", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:7>"}, {"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isPure", "com.google.javascript.rhino.Node", "<sample:8>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "areMatchingExits", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:3>"}, false, 15, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "areMatchingExits", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:9>", "<sample:7>"}, {"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isPure", "com.google.javascript.rhino.Node", "<sample:7>"}, {"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "areNodesEqualForInlining", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "areMatchingExits", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<null>"}, false, 16, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "areMatchingExits", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:7>"}, {"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isPure", "com.google.javascript.rhino.Node", "<sample:7>"}, {"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "areNodesEqualForInlining", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "areMatchingExits", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<sample:6>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "getCodingConvention", ""}, {"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "areMatchingExits", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:3>"}, {"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isPure", "com.google.javascript.rhino.Node", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "areNodesEqualForInlining", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "areNodesEqualForInlining", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<null>"}, {"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "reportCodeChange", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "areNodesEqualForInlining", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:8>", "<sample:4>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "getExceptionHandler", "com.google.javascript.rhino.Node", "<sample:4>"}, {"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "getExceptionHandler", "com.google.javascript.rhino.Node", "<sample:3>"}, {"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "areMatchingExits", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "getCodingConvention", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "getCodingConvention", ""}, {"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "mayEffectMutableState", "com.google.javascript.rhino.Node", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "getCodingConvention", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:3>"}, {"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "getCodingConvention", ""}, {"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "mayEffectMutableState", "com.google.javascript.rhino.Node", "<sample:7>"}}, 3), new String[][]{{"getExportSymbolFunction", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("goog.exportSymbol", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "getCodingConvention", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:3>"}, {"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "getCodingConvention", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.ClosureCodingConvention", actual.getClass().getName());
  assertEquals("{getAbstractMethodName=goog.abstractMethod, getDelegateSuperclassName=null, getExportPropertyFunction=goog.exportProperty, getExportSymbolFunction=goog.exportSymbol, getGlobalObject=goog.global}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "mayEffectMutableState", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "reportCodeChange", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "mayEffectMutableState", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "reportCodeChange", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "mayEffectMutableState", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "reportCodeChange", ""}, {"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "reportCodeChange", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "validateResult", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "validateResult", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "mayHaveSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "mayHaveSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "error", "com.google.javascript.jscomp.DiagnosticType,com.google.javascript.rhino.Node", "<sample:7>", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "error", "com.google.javascript.jscomp.DiagnosticType,com.google.javascript.rhino.Node", "<sample:7>", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("ERROR {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getS...#349#637856945", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "error", "com.google.javascript.jscomp.DiagnosticType,com.google.javascript.rhino.Node", "<sample:7>", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$NumberNode", actual.getClass().getName());
  assertEquals("NUMBER -Infinity {getCharno=-1, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getSourcePosit...#339#1917934166", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "mayEffectMutableState", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "mayEffectMutableState", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "getCodingConvention", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.ClosureCodingConvention", actual.getClass().getName());
  assertEquals("{getAbstractMethodName=goog.abstractMethod, getDelegateSuperclassName=null, getExportPropertyFunction=goog.exportProperty, getExportSymbolFunction=goog.exportSymbol, getGlobalObject=goog.global}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:9>"}, false, 8, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 8, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 8, new String[][]{}, 3), new String[][]{{"detachChildren", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$NumberNode", actual.getClass().getName());
  assertEquals("NUMBER -Infinity {getCharno=-1, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getSourcePosit...#339#1917934166", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 8, new String[][]{}, 3), new String[][]{{"detachChildren", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("ERROR {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getS...#349#637856945", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "containsUnicodeEscape", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "validateResult", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "getExceptionHandler", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "mayEffectMutableState", "com.google.javascript.rhino.Node", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "skipFinallyNodes", "com.google.javascript.rhino.Node", "<sample:6>"}}, 1), new String[][]{{"getInputId", "", "3"}, {"getIntProp", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isASTNormalized", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "mayEffectMutableState", "com.google.javascript.rhino.Node", "<sample:0>"}, {"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isASTNormalized", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "error", new String[]{"com.google.javascript.jscomp.DiagnosticType", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:2>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "reportCodeChange", ""}, {"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "reportCodeChange", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "error", new String[]{"com.google.javascript.jscomp.DiagnosticType", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:4>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "reportCodeChange", ""}, {"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "reportCodeChange", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "getExceptionHandler", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "areMatchingExits", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "endTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("ERROR {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getS...#349#637856945", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "mayHaveSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "mayHaveSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "mayHaveSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "getExceptionHandler", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isEcmaScript5OrGreater", ""}, {"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "optimizeSubtree", "com.google.javascript.rhino.Node", "<sample:2>"}, {"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isExceptionPossible", "com.google.javascript.rhino.Node", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "areNodesEqualForInlining", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "skipFinallyNodes", "com.google.javascript.rhino.Node", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "skipFinallyNodes", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 9, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "getExceptionHandler", "com.google.javascript.rhino.Node", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "reportCodeChange", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "endTraversal", new String[]{"com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "reportCodeChange", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "areNodesEqualForInlining", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:6>"}, false, 8, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "error", "com.google.javascript.jscomp.DiagnosticType,com.google.javascript.rhino.Node", "<sample:3>", "<sample:11>"}, {"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:0>"}, {"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "reportCodeChange", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "areNodesEqualForInlining", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:5>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "error", "com.google.javascript.jscomp.DiagnosticType,com.google.javascript.rhino.Node", "<sample:3>", "<sample:11>"}, {"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:0>"}, {"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "reportCodeChange", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "skipFinallyNodes", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "optimizeSubtree", "com.google.javascript.rhino.Node", "<sample:0>"}, {"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isPure", "com.google.javascript.rhino.Node", "<sample:5>"}, {"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isExceptionPossible", "com.google.javascript.rhino.Node", "<sample:3>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "skipFinallyNodes", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isPure", "com.google.javascript.rhino.Node", "<sample:0>"}, {"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isExceptionPossible", "com.google.javascript.rhino.Node", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "skipFinallyNodes", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isPure", "com.google.javascript.rhino.Node", "<sample:1>"}, {"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isEcmaScript5OrGreater", ""}, {"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isExceptionPossible", "com.google.javascript.rhino.Node", "<sample:4>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "error", new String[]{"com.google.javascript.jscomp.DiagnosticType", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "mayHaveSideEffects", "com.google.javascript.rhino.Node", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "reportCodeChange", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "beginTraversal", new String[]{"com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:7>"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "getCodingConvention", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "areMatchingExits", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "reportCodeChange", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "getCodingConvention", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "beginTraversal", new String[]{"com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:2>"}, false, 7, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "containsUnicodeEscape", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isExceptionPossible", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "mayEffectMutableState", "com.google.javascript.rhino.Node", "<sample:3>"}, {"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "endTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:7>"}}, 3), new String[][]{{"getNext", "", "1"}, {"getDouble", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isASTNormalized", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "mayHaveSideEffects", "com.google.javascript.rhino.Node", "<sample:3>"}, {"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "error", new String[]{"com.google.javascript.jscomp.DiagnosticType", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:4>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "error", new String[]{"com.google.javascript.jscomp.DiagnosticType", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:1>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "endTraversal", new String[]{"com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "endTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:0>"}, {"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "endTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:6>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:10>"}, false, 13, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "getCodingConvention", ""}, {"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "areNodesEqualForInlining", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<null>", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING <a><b>t</b></a> {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#351#302262130", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isASTNormalized", new String[]{}, new String[]{}, false, 32, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isPure", "com.google.javascript.rhino.Node", "<sample:1>"}, {"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "areMatchingExits", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:6>"}, {"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "error", new String[]{"com.google.javascript.jscomp.DiagnosticType", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "areMatchingExits", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:7>"}, {"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:7>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "mayHaveSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "areNodesEqualForInlining", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "areNodesEqualForInlining", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:8>", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isEcmaScript5OrGreater", ""}, {"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "mayHaveSideEffects", "com.google.javascript.rhino.Node", "<sample:4>"}, {"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isEcmaScript5OrGreater", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isPure", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:11>"}, false, 8, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "areMatchingExits", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:4>"}, {"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isASTNormalized", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "mayEffectMutableState", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "reportCodeChange", ""}, {"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "endTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:10>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "mayEffectMutableState", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isASTNormalized", ""}, {"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isASTNormalized", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "mayEffectMutableState", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "validateResult", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:13>"}, false, 9, new String[][]{}, 3), new String[][]{{"cloneTree", "", "0"}, {"isAnd", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:13>"}, false, 9, new String[][]{}, 3), new String[][]{{"cloneTree", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BITAND {getCharno=-1, getChildCount=1, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, get...#348#2060427106", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:14>"}, false, 9, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isEcmaScript5OrGreater", ""}}, 3), new String[][]{{"clonePropsFrom", "com.google.javascript.rhino.Node", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BLOCK {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getS...#350#-117756380", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "validateResult", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "beginTraversal", new String[]{"com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:2>"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "areMatchingExits", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "endTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "mayHaveSideEffects", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "mayHaveSideEffects", "com.google.javascript.rhino.Node", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isASTNormalized", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isExceptionPossible", "com.google.javascript.rhino.Node", "<sample:6>"}, {"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "optimizeSubtree", "com.google.javascript.rhino.Node", "<sample:4>"}, {"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "skipFinallyNodes", "com.google.javascript.rhino.Node", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "areMatchingExits", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isExceptionPossible", "com.google.javascript.rhino.Node", "<sample:3>"}, {"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "getExceptionHandler", "com.google.javascript.rhino.Node", "<sample:8>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isASTNormalized", ""}, {"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "optimizeSubtree", "com.google.javascript.rhino.Node", "<sample:14>"}, {"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "areMatchingExits", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:14>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isASTNormalized", ""}, {"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "optimizeSubtree", "com.google.javascript.rhino.Node", "<sample:14>"}, {"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "areMatchingExits", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BLOCK {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getS...#350#-117756380", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:14>"}, false, 13, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isExceptionPossible", "com.google.javascript.rhino.Node", "<sample:7>"}, {"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "mayHaveSideEffects", "com.google.javascript.rhino.Node", "<sample:5>"}}, 2), new String[][]{{"cloneTree", "", "2"}, {"getIndexOfChild", "com.google.javascript.rhino.Node", "0"}, {"hasMoreThanOneChild", "", "5"}, {"getNext", "", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isASTNormalized", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "reportCodeChange", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:7>"}, {"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "getExceptionHandler", "com.google.javascript.rhino.Node", "<sample:14>"}, {"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "mayEffectMutableState", "com.google.javascript.rhino.Node", "<null>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "mayEffectMutableState", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:14>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "areNodesEqualForInlining", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:5>"}}, 2), new String[][]{{"getInputId", "", "2"}, {"getBooleanProp", "int", "6"}, {"detachFromParent", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "mayEffectMutableState", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isExceptionPossible", "com.google.javascript.rhino.Node", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "validateResult", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isASTNormalized", ""}, {"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "getExceptionHandler", "com.google.javascript.rhino.Node", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:7>"}, {"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isEcmaScript5OrGreater", ""}}, 2), new String[][]{{"getString", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:15>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "optimizeSubtree", "com.google.javascript.rhino.Node", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("GT {getCharno=-1, getChildCount=2, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getSour...#344#-1442649439", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "mayEffectMutableState", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "getCodingConvention", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:3>"}}), new String[][]{{"isPrivate", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "getCodingConvention", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:3>"}}, 1), new String[][]{{"isPrivate", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isASTNormalized", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "beginTraversal", "com.google.javascript.jscomp.AbstractCompiler", "<sample:1>"}, {"com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", "isExceptionPossible", "com.google.javascript.rhino.Node", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
}
