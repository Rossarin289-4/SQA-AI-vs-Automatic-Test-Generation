package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:3>", "-2.54", "<sample:6>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationException, getType=132, hasCh...#384#1776704045", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:2>", "1.1294567", "<sample:4>", "<sample:6>"}, true), new String[][]{{"addSuppression", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT [jsdoc_info: JSDocInfo] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationExcep...#408#625221676", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:3>", "-1.6", "<sample:3>", "<sample:10>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationException, getType=132, hasCh...#384#1776704045", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:6>", "1x1F", "<sample:3>", "<sample:7>"}, true), new String[][]{{"getDouble", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:3>", ">1", "<sample:5>", "<null>"}, true), new String[][]{{"getJSDocInfo", "", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:5>", "invalid increment targetaF,b,c", "<sample:7>", "<sample:2>"}, true, 0, null, 3), new String[][]{{"cloneTree", "", "3"}, {"getDouble", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:5>", "0d+1", "<sample:2>", "<null>"}, true, 0, null, 1), new String[][]{{"putProp", "int,java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT [catch_scope_prop: b] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationExcepti...#406#645696123", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:0>", "12:30:4", "<sample:4>", "<sample:0>"}, true), new String[][]{{"checkTreeEqualsSilent", "com.google.javascript.rhino.Node", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:3>", "invalid decrement target", "<sample:0>", "<sample:3>"}, true), new String[][]{{"getChildCount", "", "4"}, {"addChildBefore", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:1>", "1.5e0", "<sample:4>", "<sample:4>"}, true, 0, null, 3), new String[][]{{"isQuotedString", "", "1"}, {"getNext", "", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:7>", "1.123456C78", "<sample:4>", "<sample:7>"}, true), new String[][]{{"getCharno", "", "5"}, {"putIntProp", "int,int", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT [break: 3] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationException, getType...#395#656399883", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:7>", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "<sample:0>", "<sample:5>"}, true), new String[][]{{"getLineno", "", "0"}, {"getType", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("132", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:7>", "06x1F", "<sample:1>", "<sample:9>"}, true), new String[][]{{"detachFromParent", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:1>", "\n", "<sample:3>", "<sample:7>"}, true), new String[][]{{"addChildAfter", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "3"}, {"copyInformationFromForTree", "com.google.javascript.rhino.Node", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT 0 {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationException, getType=132, hasCh...#384#922136453", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:0>", "01g5d", "<sample:5>", "<sample:2>"}, true, 0, null, 2), new String[][]{{"addChildBefore", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:1>", "0e11", "<sample:1>", "<sample:0>"}, true, 0, null, 2), new String[][]{{"getFirstChild", "", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:6>", "2157482648", "<sample:3>", "<sample:8>"}, true, 0, null, 2), new String[][]{{"appendStringTree", "java.lang.Appendable", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationException, getType=132, hasCh...#384#1776704045", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:1>", "[1,2]2020-01-01", "<sample:5>", "<null>"}, true, 0, null, 3), new String[][]{{"getChildCount", "", "4"}, {"isLocalResultCall", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:5>", "55.", "<sample:3>", "<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationException, getType=132, hasCh...#384#1776704045", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:2>", "12:30:45\u00e9", "<sample:5>", "<sample:2>"}, true, 0, null, 1), new String[][]{{"getJSType", "", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:5>", "<a>b</b>", "<sample:7>", "<sample:9>"}, true, 0, null, 1), new String[][]{{"addChildToBack", "com.google.javascript.rhino.Node", "2"}, {"isVarArgs", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:3>", "22:30:452020-02-30T25:61:61", "<sample:3>", "<sample:3>"}, true, 0, null, 1), new String[][]{{"getType", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("132", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:5>", "-0.0a b", "<sample:2>", "<sample:4>"}, true, 0, null, 2), new String[][]{{"hasChildren", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:1>", "0x1F", "<sample:4>", "<sample:5>"}, true, 0, null, 2), new String[][]{{"addChildAfter", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "0"}, {"removeChildAfter", "com.google.javascript.rhino.Node", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:0>", "a,b,c", "<sample:0>", "<sample:3>"}, true, 0, null, 2), new String[][]{{"addChildrenToBack", "com.google.javascript.rhino.Node", "1"}, {"hasOneChild", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:3>", "0x1F1L", "<sample:4>", "<sample:0>"}, true, 0, null, 1), new String[][]{{"cloneNode", "", "0"}, {"getJsDocBuilderForNode", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$FileLevelJsDocBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:1>", "1.1234567890123456PT1H", "<sample:1>", "<sample:1>"}, true, 0, null, 3), new String[][]{{"getType", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("132", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:0>", "1E-5", "<sample:3>", "<sample:1>"}, true, 0, null, 3), new String[][]{{"checkTreeEquals", "com.google.javascript.rhino.Node", "6"}, {"addChildBefore", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:7>", "123456789012345678901234567890", "<sample:5>", "<sample:8>"}, true, 0, null, 3), new String[][]{{"getAncestors", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$AncestorIterable", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:6>", "-92.54", "<sample:6>", "<sample:0>"}, true, 0, null, 2), new String[][]{{"getAncestors", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$AncestorIterable", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:7>", "Title1.12345678901234567", "<null>", "<sample:0>"}, true, 0, null, 2), new String[][]{{"getCharno", "", "1"}, {"putProp", "int,java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT [break: ] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationException, getType=...#394#-683680640", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:5>", "1.112345678", "<sample:5>", "<sample:7>"}, true, 0, null, 3), new String[][]{{"getCharno", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:5>", "2020-01-11", "<sample:6>", "<sample:9>"}, true, 0, null, 1), new String[][]{{"getAncestors", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$AncestorIterable", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:3>", "[1,2]invalid decrement trget", "<sample:6>", "<sample:3>"}, true, 0, null, 1), new String[][]{{"checkTreeEquals", "com.google.javascript.rhino.Node", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
}
