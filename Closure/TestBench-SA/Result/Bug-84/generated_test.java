package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:3>", "0x1F", "<sample:0>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationException, getType=132, hasCh...#384#1776704045", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<null>", "0x1F", "<sample:0>", "<sample:6>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:9>", "0x2F", "<sample:3>", "<sample:5>"}, true), new String[][]{{"hasChild", "com.google.javascript.rhino.Node", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:9>", "0xTTG[122]", "<sample:3>", "<sample:7>"}, true), new String[][]{{"getAncestor", "int", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:9>", "0xTTG[122", "<sample:4>", "<sample:7>"}, true), new String[][]{{"getAncestor", "int", "3"}, {"children", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:5>", "2020-02-200T25:61:61", "<sample:3>", "<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationException, getType=132, hasCh...#384#1776704045", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:5>", "2020-02-200T25:61:61", "<sample:4>", "<sample:1>"}, true, 0, null, 2), new String[][]{{"getIntProp", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:5>", "2020-02-200T25:61:61", "<sample:4>", "<sample:1>"}, true, 0, null, 2), new String[][]{{"getIntProp", "int", "3"}, {"isNoSideEffectsCall", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:0>", "123567890123456789o01234567890", "<sample:4>", "<sample:6>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationException, getType=132, hasCh...#384#1776704045", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:6>", "1.5f", "<sample:0>", "<null>"}, true, 0, null, 3), new String[][]{{"clonePropsFrom", "com.google.javascript.rhino.Node", "7"}, {"getIntProp", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:6>", "12:30:45", "<sample:0>", "<null>"}, true), new String[][]{{"clonePropsFrom", "com.google.javascript.rhino.Node", "7"}, {"getIntProp", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:6>", "12:30:45", "<sample:0>", "<null>"}, true), new String[][]{{"clonePropsFrom", "com.google.javascript.rhino.Node", "7"}, {"getIntProp", "int", "3"}, {"getJsDocBuilderForNode", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$FileLevelJsDocBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:7>", "/a/bginvalid dAcrement target", "<sample:5>", "<sample:3>"}, true, 0, null, 2), new String[][]{{"clonePropsFrom", "com.google.javascript.rhino.Node", "7"}, {"getIntProp", "int", "6"}, {"getJsDocBuilderForNode", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$FileLevelJsDocBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<null>", "/a/bhrnvalid dAcrement uargetinvalid increment target", "<sample:9>", "<sample:4>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:4>", "-0.0", "<sample:1>", "<sample:0>"}, true), new String[][]{{"addChildToFront", "com.google.javascript.rhino.Node", "5"}, {"detachFromParent", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:4>", "-0.0", "<sample:1>", "<sample:0>"}, true, 0, null, 1), new String[][]{{"addChildToFront", "com.google.javascript.rhino.Node", "5"}, {"detachFromParent", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:3>", "Unsupported syntax: ", "<sample:9>", "<sample:2>"}, true, 0, null, 3), new String[][]{{"checkTreeEquals", "com.google.javascript.rhino.Node", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Node tree inequality:\nTree1:\nSCRIPT\n\n\nTree2:\nEOL 0\n    LEAVEWITH\n        GOTO\n        IFEQ\n        IFNE\n    RETURN 6\n        IFEQ\n\n\nSubtree1: SCRIPT\n\n\nSubtree2: EOL 0\n    LEAVEWITH\n        GOTO\n      ...#246#2096319699", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:1>", "1234567890123456678901234567890", "<sample:6>", "<sample:3>"}, true, 0, null, 3), new String[][]{{"copyInformationFrom", "com.google.javascript.rhino.Node", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT 0 {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationException, getType=132, hasCh...#384#922136453", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<null>", "", "<sample:3>", "<sample:2>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:2>", "0234567890123456678901234567890", "<sample:7>", "<sample:2>"}, true, 0, null, 3), new String[][]{{"getProp", "int", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:6>", "0234567890123456678901234567890", "<sample:7>", "<sample:3>"}, true, 0, null, 3), new String[][]{{"putIntProp", "int,int", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT [enum: 5] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationException, getType=...#394#1403777559", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:2>", "1", "<sample:5>", "<sample:2>"}, true), new String[][]{{"getType", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("132", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:3>", "0FFFFFFFF0", "<sample:1>", "<sample:5>"}, true, 0, null, 2), new String[][]{{"addChildrenToBack", "com.google.javascript.rhino.Node", "6"}, {"addSuppression", "java.lang.String", "4"}, {"detachFromParent", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:3>", "a", "<sample:5>", "<sample:1>"}, true, 0, null, 1), new String[][]{{"addChildToBack", "com.google.javascript.rhino.Node", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT {getCharno=-1, getChildCount=1, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationException, getType=132, hasCh...#382#1458954712", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:1>", "-<a>b</a>", "<sample:6>", "<sample:3>"}, true, 0, null, 3), new String[][]{{"checkTreeEquals", "com.google.javascript.rhino.Node", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:4>", "OT2H;a,b-c1", "<sample:6>", "<sample:4>"}, true, 0, null, 1), new String[][]{{"isQuotedString", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<null>", "OT2H;a,b-1", "<sample:5>", "<sample:4>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:6>", " ", "<sample:7>", "<sample:4>"}, true, 0, null, 1), new String[][]{{"removeChildAfter", "com.google.javascript.rhino.Node", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:10>", "!", "<sample:0>", "<sample:3>"}, true, 0, null, 1), new String[][]{{"getParent", "", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:13>", "c", "<sample:4>", "<sample:7>"}, true, 0, null, 1), new String[][]{{"getString", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:13>", "\n", "<sample:4>", "<sample:7>"}, true, 0, null, 1), new String[][]{{"isSyntheticBlock", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:7>", "\n", "<sample:2>", "<sample:5>"}, true, 0, null, 1), new String[][]{{"isSyntheticBlock", "", "3"}, {"getSideEffectFlags", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:1>", "ittle", "<sample:1>", "<sample:1>"}, true, 0, null, 2), new String[][]{{"getJSType", "", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:6>", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "<sample:3>", "<sample:2>"}, true, 0, null, 2), new String[][]{{"addChildrenToBack", "com.google.javascript.rhino.Node", "5"}, {"addChildBefore", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
}
