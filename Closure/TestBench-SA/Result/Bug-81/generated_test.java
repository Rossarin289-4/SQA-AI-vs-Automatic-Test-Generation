package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:2>", "1.12345678", "<sample:4>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationException, getType=132, hasCh...#384#1776704045", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:2>", "1.12345678a", "<sample:3>", "<null>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationException, getType=132, hasCh...#384#1776704045", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:1>", ".", "<sample:3>", "<sample:3>"}, true), new String[][]{{"getDouble", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:7>", "\u00e9", "<sample:2>", "<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationException, getType=132, hasCh...#384#1776704045", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:1>", "1.12345678901234567", "<sample:7>", "<null>"}, true, 0, null, 3), new String[][]{{"isLocalResultCall", "", "3"}, {"copyInformationFrom", "com.google.javascript.rhino.Node", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationException, getType=132, hasCh...#384#1776704045", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<null>", "1.12345678901234567", "<null>", "<sample:0>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:7>", "{\"a\":1}", "<sample:6>", "<sample:5>"}, true), new String[][]{{"getChildAtIndex", "int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:2>", "1234567890123456789012345678990", "<sample:0>", "<sample:1>"}, true), new String[][]{{"copyInformationFrom", "com.google.javascript.rhino.Node", "1"}, {"getJSDocInfo", "", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:6>", "[1,2]", "<sample:1>", "<sample:3>"}, true), new String[][]{{"hasChild", "com.google.javascript.rhino.Node", "2"}, {"hasOneChild", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:2>", "ntll", "<sample:13>", "<sample:3>"}, true, 0, null, 3), new String[][]{{"isNoSideEffectsCall", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:7>", "invalid decrement target", "<sample:16>", "<sample:3>"}, true, 0, null, 3), new String[][]{{"getParent", "", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:6>", "1.5d", "<sample:7>", "<sample:5>"}, true, 0, null, 2), new String[][]{{"getIntProp", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:2>", "1.1234567890123456", "<sample:4>", "<sample:6>"}, true), new String[][]{{"isEquivalentTo", "com.google.javascript.rhino.Node", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:2>", "1.12345678901244550x123456789", "<null>", "<sample:4>"}, true, 0, null, 1), new String[][]{{"isEquivalentTo", "com.google.javascript.rhino.Node", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:2>", "<null>", "<sample:4>", "<sample:4>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:6>", "+", "<sample:5>", "<sample:5>"}, true), new String[][]{{"getChildCount", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:5>", "{\"a\":,1}", "<sample:5>", "<sample:4>"}, true), new String[][]{{"getJsDocBuilderForNode", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$FileLevelJsDocBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:6>", "{\"a\":,1}", "<sample:5>", "<sample:5>"}, true, 0, null, 2), new String[][]{{"getJsDocBuilderForNode", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$FileLevelJsDocBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:3>", "0xFFFFFFFF", "<sample:3>", "<sample:0>"}, true), new String[][]{{"getLastSibling", "", "3"}, {"getExistingIntProp", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:3>", "00xGFFFFFFF", "<null>", "<sample:4>"}, true, 0, null, 2), new String[][]{{"getLastSibling", "", "3"}, {"getExistingIntProp", "int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:8>", "1.123456", "<null>", "<sample:2>"}, true, 0, null, 1), new String[][]{{"checkTreeEquals", "com.google.javascript.rhino.Node", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Node tree inequality:\nTree1:\nSCRIPT\n\n\nTree2:\nNUMBER -Infinity\n\n\nSubtree1: SCRIPT\n\n\nSubtree2: NUMBER -Infinity\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:3>", "1.\n56", "<sample:6>", "<sample:5>"}, true, 0, null, 1), new String[][]{{"checkTreeEquals", "com.google.javascript.rhino.Node", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Node tree inequality:\nTree1:\nSCRIPT\n\n\nTree2:\nNUMBER -Infinity\n\n\nSubtree1: SCRIPT\n\n\nSubtree2: NUMBER -Infinity\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:3>", "2.\n5", "<sample:6>", "<sample:5>"}, true, 0, null, 1), new String[][]{{"checkTreeEquals", "com.google.javascript.rhino.Node", "6"}, {"hasChildren", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:3>", "2.\n5", "<sample:10>", "<sample:0>"}, true, 0, null, 1), new String[][]{{"checkTreeEquals", "com.google.javascript.rhino.Node", "6"}, {"hasChildren", "", "2"}, {"getAncestors", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$AncestorIterable", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:0>", "a", "<sample:1>", "<sample:6>"}, true, 0, null, 1), new String[][]{{"getChildCount", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:2>", "invalid\037eecdrement target-1.5", "<sample:0>", "<sample:3>"}, true, 0, null, 2), new String[][]{{"addChildBefore", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:6>", " \u00e9", "<sample:0>", "<sample:6>"}, true, 0, null, 3), new String[][]{{"detachFromParent", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:2>", "1.5", "<sample:2>", "<sample:5>"}, true, 0, null, 2), new String[][]{{"getJSDocInfo", "", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:5>", "1.5", "<sample:1>", "<sample:5>"}, true, 0, null, 2), new String[][]{{"getJSDocInfo", "", "6"}, {"putProp", "int,java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT [continue: true] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationException, g...#401#651564478", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:2>", "", "<sample:5>", "<sample:0>"}, true, 0, null, 1), new String[][]{{"getParent", "", "7"}, {"cloneNode", "", "7"}, {"getChildAtIndex", "int", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:0>", "1.1234567890123456", "<sample:2>", "<sample:0>"}, true, 0, null, 2), new String[][]{{"isSyntheticBlock", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:5>", "", "<sample:4>", "<sample:1>"}, true, 0, null, 3), new String[][]{{"getCharno", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:5>", " 6", "<sample:6>", "<sample:3>"}, true, 0, null, 3), new String[][]{{"children", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:6>", "1.\n56", "<sample:0>", "<sample:8>"}, true, 0, null, 3), new String[][]{{"getSideEffectFlags", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
}
