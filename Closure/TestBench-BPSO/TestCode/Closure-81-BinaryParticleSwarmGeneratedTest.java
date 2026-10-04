package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:0>", "a b", "<sample:8>", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationException, getType=132, hasCh...#384#1776704045", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:7>", "1e10cc", "<sample:2>", "<sample:7>"}, true), new String[][]{{"isVarArgs", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:6>", "aaa}aaaaaaaaaaaaaaaaaaaaaaaaaaa", "<sample:1>", "<sample:3>"}, true), new String[][]{{"getDouble", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:6>", "true", "<sample:2>", "<sample:9>"}, true, 0, null, 1), new String[][]{{"getLastChild", "", "4"}, {"hasMoreThanOneChild", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:4>", "invalid decrement target", "<sample:2>", "<sample:6>"}, true), new String[][]{{"putProp", "int,java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT [enum: c] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationException, getType=...#394#-1452102359", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:2>", "/a/b", "<null>", "<sample:1>"}, true), new String[][]{{"getChildBefore", "com.google.javascript.rhino.Node", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:3>", "invalid decrement target", "<sample:3>", "<sample:6>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationException, getType=132, hasCh...#384#1776704045", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:4>", "1020-01-02", "<sample:8>", "<sample:3>"}, true), new String[][]{{"getChildAtIndex", "int", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:6>", "1E-51.25", "<sample:4>", "<sample:0>"}, true, 0, null, 2), new String[][]{{"getSideEffectFlags", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:0>", "1.151", "<sample:1>", "<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationException, getType=132, hasCh...#384#1776704045", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:9>", "Helmo, World", "<sample:5>", "<sample:7>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationException, getType=132, hasCh...#384#1776704045", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:4>", "TIIITLE", "<sample:6>", "<sample:0>"}, true), new String[][]{{"getLineno", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:5>", "\n", "<sample:5>", "<sample:4>"}, true, 0, null, 3), new String[][]{{"getString", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<null>", "5", "<sample:3>", "<sample:8>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:1>", "--5", "<sample:8>", "<sample:6>"}, true), new String[][]{{"addSuppression", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT [jsdoc_info: JSDocInfo] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationExcep...#408#625221676", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:7>", "5\r.", "<sample:7>", "<sample:5>"}, true, 0, null, 2), new String[][]{{"isLocalResultCall", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:7>", "[12\\", "<null>", "<sample:7>"}, true), new String[][]{{"removeChildAfter", "com.google.javascript.rhino.Node", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:0>", "11.4f", "<sample:3>", "<sample:0>"}, true, 0, null, 3), new String[][]{{"putBooleanProp", "int,boolean", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:8>", "\t", "<sample:7>", "<sample:2>"}, true, 0, null, 1), new String[][]{{"getJsDocBuilderForNode", "", "2"}, {"append", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$FileLevelJsDocBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:3>", "\u00e9", "<sample:0>", "<sample:6>"}, true, 0, null, 3), new String[][]{{"isVarArgs", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:1>", "\n", "<sample:0>", "<sample:0>"}, true, 0, null, 3), new String[][]{{"detachFromParent", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:6>", "inval3id decrement target", "<sample:6>", "<sample:7>"}, true, 0, null, 1), new String[][]{{"getNext", "", "4"}, {"copyInformationFromForTree", "com.google.javascript.rhino.Node", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT 0 {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationException, getType=132, hasCh...#384#922136453", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:4>", "1.d", "<sample:8>", "<sample:7>"}, true, 0, null, 2), new String[][]{{"getCharno", "", "0"}, {"removeChild", "com.google.javascript.rhino.Node", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:3>", "1.12345678", "<sample:4>", "<sample:3>"}, true, 0, null, 1), new String[][]{{"addSuppression", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT [jsdoc_info: JSDocInfo] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationExcep...#408#625221676", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:0>", "{\"a\":1}\u00ea", "<sample:5>", "<sample:6>"}, true, 0, null, 2), new String[][]{{"getJSDocInfo", "", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:2>", "1._5f", "<sample:2>", "<sample:3>"}, true, 0, null, 1), new String[][]{{"getIntProp", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:4>", "I1.12345678901234567", "<sample:4>", "<sample:2>"}, true, 0, null, 1), new String[][]{{"getAncestors", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$AncestorIterable", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:1>", "aabc", "<sample:5>", "<sample:4>"}, true, 0, null, 3), new String[][]{{"getChildCount", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:0>", " ", "<sample:5>", "<sample:4>"}, true, 0, null, 3), new String[][]{{"getChildAtIndex", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:0>", "1 ", "<sample:5>", "<sample:2>"}, true, 0, null, 3), new String[][]{{"getDirectives", "", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:7>", "PT1H", "<sample:6>", "<sample:5>"}, true, 0, null, 2), new String[][]{{"getJSDocInfo", "", "3"}, {"getLineno", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:6>", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "<sample:9>", "<sample:2>"}, true, 0, null, 2), new String[][]{{"addSuppression", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT [jsdoc_info: JSDocInfo] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationExcep...#408#625221676", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:0>", " 2020-02-30T25:61:61", "<sample:6>", "<sample:4>"}, true, 0, null, 2), new String[][]{{"getExistingIntProp", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:5>", "i", "<sample:7>", "<sample:6>"}, true, 0, null, 3), new String[][]{{"getCharno", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
}
