package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addCaseBody", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addArrayList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", "com.google.javascript.rhino.Node,int,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:4>", "1", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "getSimpleNumber", new String[]{"java.lang.String"}, new String[]{"Titke"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{">'"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/>'/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:0>", "1.(f", "<sample:3>", "<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationException, getType=132, hasCh...#384#1776704045", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"HOellot, World"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("HOellot, World", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:3>", "2020.l2-30T25:61:61", "<sample:7>", "<sample:2>"}, true), new String[][]{{"getChildBefore", "com.google.javascript.rhino.Node", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenamePrototypes", "com.google.javascript.jscomp.RenamePrototypes", "getPropertyMap", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.RenamePrototypes", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.VariableMap", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "tagAsStrict", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean", "<sample:2>", "true"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "isSimpleNumber", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addExpr", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:12>", "2147483647"}, false, 7, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", "com.google.javascript.rhino.Node", "<sample:4>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:10>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:3>", "true", "<sample:7>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"[thrpw"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"[thrpw\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:15>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "isSimpleNumber", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:13>", "false", "<sample:10>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", new String[]{"com.google.javascript.rhino.Node", "int", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:15>", "-54", "<sample:2>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addCaseBody", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:17>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addArrayList", "com.google.javascript.rhino.Node", "<sample:4>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "strEscape", new String[]{"java.lang.String", "char", "java.lang.String", "java.lang.String", "java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"\\", "0", "<1 ", "AEFORE_DANGLING_ELRTE", "a", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0a0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", new String[]{"com.google.javascript.rhino.Node", "int", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:6>", "54", "<sample:4>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addCaseBody", "com.google.javascript.rhino.Node", "<sample:4>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:12>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean", "<sample:12>", "false"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"var\036"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/var\\u001e/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"0x123456789\n", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"0x123456789\\n\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "strEscape", new String[]{"java.lang.String", "char", "java.lang.String", "java.lang.String", "java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"0x123456789\t[", "y", "0x1F5.", "'use strict';", "return]", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("y0x123456789\\t[y", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "getSimpleNumber", new String[]{"java.lang.String"}, new String[]{"010"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("10.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"'use strict';var )", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"'use strict';var )\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", new String[]{"com.google.javascript.rhino.Node", "int", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:11>", "-1073741823", "<sample:0>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"retu\rn", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"retu\\rn\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:3>", "0x1)3456789\nnull", "<sample:5>", "<sample:3>"}, true), new String[][]{{"appendStringTree", "java.lang.Appendable", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationException, getType=132, hasCh...#384#1776704045", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"\"", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/\"/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"2020-l2-30T25:61:61", "<null>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"2020-l2-30T25:61:61\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", "com.google.javascript.rhino.Node", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "strEscape", new String[]{"java.lang.String", "char", "java.lang.String", "java.lang.String", "java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{")'use strict';", "A", "BEFORE_DBNGLING_ELSE", "2020-01-01", "2.5d", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A)2020-01-01use strict2020-01-01;A", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"10.5e300", "<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/10.5e300/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", new String[]{"com.google.javascript.rhino.Node", "int", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:1>", "-54", "<sample:5>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", new String[]{"com.google.javascript.rhino.Node", "int", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:7>", "0", "<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addCaseBody", "com.google.javascript.rhino.Node", "<null>"}, {"com.google.javascript.jscomp.CodeGenerator", "addExpr", "com.google.javascript.rhino.Node,int", "<sample:2>", "-108"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"java.lang.String"}, new String[]{"PRESERVE_BLOCK"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addExpr", "com.google.javascript.rhino.Node,int", "<sample:5>", "0"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"1.5"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/1.5/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:3>", "var ", "<sample:1>", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationException, getType=132, hasCh...#384#1776704045", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"-t15", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/-t15/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addExpr", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:0>", "54"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean", "<sample:4>", "false"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenamePrototypes", "com.google.javascript.jscomp.RenamePrototypes", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:13>", "<sample:14>"}, false, 6, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addExpr", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:1>", "2147483647"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", "com.google.javascript.rhino.Node", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", new String[]{"com.google.javascript.rhino.Node", "int", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:1>", "-54", "<sample:0>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:11>", "<sample:0>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"2.5f"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"2.5f\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "isSimpleNumber", new String[]{"java.lang.String"}, new String[]{"["}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", new String[]{"com.google.javascript.rhino.Node", "int", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:13>", "108", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addCaseBody", "com.google.javascript.rhino.Node", "<sample:2>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "tagAsStrict", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addArrayList", "com.google.javascript.rhino.Node", "<sample:5>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:15>"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"1.52301", "<empty>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"1.52301\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"java.lang.String"}, new String[]{"T"}, false, 4, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:11>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:8>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{".1", "<null>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\".1\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", "com.google.javascript.rhino.Node", "<sample:14>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"h", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"h\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"-11", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"-11\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "strEscape", new String[]{"java.lang.String", "char", "java.lang.String", "java.lang.String", "java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{";throw", "2", "1--112:30:45", "finally", "-", "<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2;throw2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"-1.5-1D.5", "<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"-1.5-1D.5\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:7>", "OTHER", "<sample:1>", "<sample:1>"}, true, 0, null, 2), new String[][]{{"detachChildren", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationException, getType=132, hasCh...#384#1776704045", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addCaseBody", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:16>"}, false, 5, new String[][]{}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:13>"}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addExpr", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:6>", "0"}, false, 6, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", "com.google.javascript.rhino.Node", "<sample:3>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenamePrototypes", "com.google.javascript.jscomp.RenamePrototypes", "getPropertyMap", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.VariableMap", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"2020.l2-30T25:61:61", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"2020.l2-30T25:61:61\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"2020-02-30T26", "<null>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/2020-02-30T26/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"-1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"1.123456789012345671E-5", "<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"1.123456789012345671E-5\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", new String[]{"com.google.javascript.rhino.Node", "int", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<null>", "10", "<sample:2>"}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:3>", "false", "<sample:3>"}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", new String[]{"com.google.javascript.rhino.Node", "int", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:10>", "-1934", "<sample:5>"}, false, 7, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "getSimpleNumber", new String[]{"java.lang.String"}, new String[]{"1.1234567890123456"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenamePrototypes", "com.google.javascript.jscomp.RenamePrototypes", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<sample:0>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.RenamePrototypes", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:10>", "<sample:12>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"java.lang.String"}, new String[]{"START_OF_EXoPR"}, false, 5, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node", "<sample:15>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addArrayList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean", "<sample:5>", "false"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"1F-51e10"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"1F-51e10\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "strEscape", new String[]{"java.lang.String", "char", "java.lang.String", "java.lang.String", "java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"19100x1F", "H", "1.5", "", "1E.5", "<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("H19100x1FH", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addArrayList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "java.lang.String", "J"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addCaseBody", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addArrayList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:15>"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 5, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:19>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", "com.google.javascript.rhino.Node", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:11>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<sample:4>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addArrayList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:11>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "tagAsStrict", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"OTHEROTHER"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"OTHEROTHER\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "tagAsStrict", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addArrayList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addExpr", "com.google.javascript.rhino.Node,int", "<sample:16>", "-2147483647"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"return[", "<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/return[/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "getSimpleNumber", new String[]{"java.lang.String"}, new String[]{")"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "strEscape", new String[]{"java.lang.String", "char", "java.lang.String", "java.lang.String", "java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"1x1Fb", "5", "", "2147383648", "", "<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("51x1Fb5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:12>", "false"}, false, 4, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"="}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"=\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:3>", "]\r", "<sample:7>", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationException, getType=132, hasCh...#384#1776704045", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"1d100", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/1d100/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:5>", "false", "<sample:5>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean", "<sample:0>", "true"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addExpr", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:2>", "0"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addCaseBody", "com.google.javascript.rhino.Node", "<sample:13>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenamePrototypes", "com.google.javascript.jscomp.RenamePrototypes", "getPropertyMap", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.RenamePrototypes", "getPropertyMap", ""}}, 2), new String[][]{{"toBytes", "", "4"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addArrayList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:13>", "false", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"0x1233567890"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x1233567890", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "tagAsStrict", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:13>", "<null>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addCaseBody", "com.google.javascript.rhino.Node", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "isSimpleNumber", new String[]{"java.lang.String"}, new String[]{"finallyynull"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenamePrototypes", "com.google.javascript.jscomp.RenamePrototypes", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.RenamePrototypes", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:4>", "<sample:2>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addCaseBody", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addExpr", "com.google.javascript.rhino.Node,int", "<sample:6>", "-54"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"1/5-1.5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/1/5-1.5/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"var .5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/var .5/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"1.5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"java.lang.String"}, new String[]{"AEFORE_DANGLING_ELRSE"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", "com.google.javascript.rhino.Node", "<sample:7>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "isSimpleNumber", new String[]{"java.lang.String"}, new String[]{"2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:6>", "0x1F", "<sample:9>", "<sample:9>"}, true), new String[][]{{"putBooleanProp", "int,boolean", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT [continue: 1] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationException, getT...#398#-1157203263", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"java.lang.String"}, new String[]{"1e100"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean", "<sample:5>", "false"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"]", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"]\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:6>", "", "<sample:5>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationException, getType=132, hasCh...#384#1776704045", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:7>", "true", "<sample:9>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addExpr", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:1>", "59"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "strEscape", new String[]{"java.lang.String", "char", "java.lang.String", "java.lang.String", "java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"PRESERV_BLOCK", "\000", "==", "nuAll", "truetrue", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\000PRESERV_BLOCK\000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"1.123456781E-5", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/1.123456781E-5/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:5>", "true", "<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", "com.google.javascript.rhino.Node,int,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:1>", "-1073741849", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "strEscape", new String[]{"java.lang.String", "char", "java.lang.String", "java.lang.String", "java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"", "~", "2020-02--30T25:61:61", "I", "0L", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("~~", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"BEFORE_DANGLING_ELSEi", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"BEFORE_DANGLING_ELSEi\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:3>", "true", "<sample:2>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addExpr", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:4>", "-2147483646"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:1>", "<sample:7>"}, {"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<sample:3>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addExpr", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<null>", "1073741823"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addCaseBody", "com.google.javascript.rhino.Node", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:4>", "21474836482020-0", "<sample:7>", "<sample:0>"}, true), new String[][]{{"removeChildren", "", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "strEscape", new String[]{"java.lang.String", "char", "java.lang.String", "java.lang.String", "java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"0xx1F", ")", "PRESFRVE_BLOCK", "1.1123456890123456", ".", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(")0xx1F)", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"1.1234567890123456"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/1.1234567890123456/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "strEscape", new String[]{"java.lang.String", "char", "java.lang.String", "java.lang.String", "java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"0xFFGFFFFF", "E", "2020-02-30T25:61:61return", "START_OF_XPR:", "0x1iFfinally", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("E0xFFGFFFFFE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "strEscape", new String[]{"java.lang.String", "char", "java.lang.String", "java.lang.String", "java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"-0.0", "(", "1K", "=0", "21447483648", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(-0.0(", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"2"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/2/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:12>"}, false, 4, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "strEscape", new String[]{"java.lang.String", "char", "java.lang.String", "java.lang.String", "java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"6.", "m", "+1", "START_OF_EXPR]", "1e100", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("m6.m", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "strEscape", new String[]{"java.lang.String", "char", "java.lang.String", "java.lang.String", "java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"", "\uffff", "TITLEa,b,c", "tirowBEFORE_DANGLING_ELSE", "-1.5ETitle", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\uffff\uffff", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addArrayList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:12>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "tagAsStrict", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:2>", "<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:1>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "strEscape", new String[]{"java.lang.String", "char", "java.lang.String", "java.lang.String", "java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"1.234567890123456", "o", "QT1H", "sry", "1.5d2020-02-30T25:61:61", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("o1.234567890123456o", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", new String[]{"com.google.javascript.rhino.Node", "int", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:4>", "-2147483647", "<sample:4>"}, false, 6, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", new String[]{"com.google.javascript.rhino.Node", "int", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:0>", "0", "<sample:0>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", "com.google.javascript.rhino.Node,int,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:7>", "32767", "<sample:4>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"t7ue", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"t7ue\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:4>", "false"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"?"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("?", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:6>", "false", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addArrayList", "com.google.javascript.rhino.Node", "<sample:7>"}, {"com.google.javascript.jscomp.CodeGenerator", "addExpr", "com.google.javascript.rhino.Node,int", "<null>", "54"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"."}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/./", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"2020.l2-30T25:61;61"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/2020.l2-30T25:61;61/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"varx "}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/varx /", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenamePrototypes", "com.google.javascript.jscomp.RenamePrototypes", "getPropertyMap", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.RenamePrototypes", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:9>", "<sample:3>"}, {"com.google.javascript.jscomp.RenamePrototypes", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:15>"}}), new String[][]{{"toBytes", "", "6"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:4>", "V,b,ci", "<sample:7>", "<sample:2>"}, true), new String[][]{{"getLineno", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"2020-l2-30T35:61:61"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"2020-l2-30T35:61:61\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:1>", "true"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenamePrototypes", "com.google.javascript.jscomp.RenamePrototypes", "getPropertyMap", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.RenamePrototypes", "getPropertyMap", ""}}), new String[][]{{"lookupSourceName", "java.lang.String", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"STATEMENT", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"STATEMENT\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"1100", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"1100\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:3>", "0", "<sample:4>", "<sample:7>"}, true), new String[][]{{"getExistingIntProp", "int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<sample:13>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("//", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"1M", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"1M\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:15>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addArrayList", "com.google.javascript.rhino.Node", "<sample:14>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"1.123456778901234567"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/1.123456778901234567/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"txhrowPRESERVE_BLOCK"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("txhrowPRESERVE_BLOCK", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"1.(9g"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.(9g", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"var "}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("var ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"HOemlpt, World"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("HOemlpt, World", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"5catch", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"5catch\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"Iab", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"Iab\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addArrayList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:11>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", new String[]{"com.google.javascript.rhino.Node", "int", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:11>", "1", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenamePrototypes", "com.google.javascript.jscomp.RenamePrototypes", "getPropertyMap", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"getOriginalNameToNewNameMap", "", "3"}, {"isEmpty", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:13>", "<null>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:1>", "true", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"a.b,c"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a.b,c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"I", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/I/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", new String[]{"com.google.javascript.rhino.Node", "int", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<null>", "-10", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"c.12345978", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/c.12345978/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addExpr", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:11>", "-1"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenamePrototypes", "com.google.javascript.jscomp.RenamePrototypes", "getPropertyMap", new String[]{}, new String[]{}, false), new String[][]{{"save", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenamePrototypes", "com.google.javascript.jscomp.RenamePrototypes", "getPropertyMap", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.RenamePrototypes", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:1>"}}), new String[][]{{"getOriginalNameToNewNameMap", "", "3"}, {"replace", "java.lang.Object,java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:2>", "(?", "<sample:0>", "<sample:3>"}, true), new String[][]{{"isVarArgs", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenamePrototypes", "com.google.javascript.jscomp.RenamePrototypes", "getPropertyMap", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.RenamePrototypes", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:3>"}, {"com.google.javascript.jscomp.RenamePrototypes", "getPropertyMap", ""}}), new String[][]{{"getOriginalNameToNewNameMap", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"i"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("i", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"2020-01-011.1234566", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/2020-01-011.1234566/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:3>", "throw:", "<sample:3>", "<sample:5>"}, true), new String[][]{{"getString", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"T2020-/1-01", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/T2020-/1-01/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"5.1e10", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/5.1e10/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addExpr", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:15>", "-54"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addCaseBody", "com.google.javascript.rhino.Node", "<sample:11>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addArrayList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "tagAsStrict", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:13>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:16>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:5>", "false", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", new String[]{"com.google.javascript.rhino.Node", "int", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:12>", "-2147483648", "<sample:2>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addExpr", "com.google.javascript.rhino.Node,int", "<sample:11>", "35"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"0xD1F--1", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/0xD1F--1/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"ia"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"ia\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "getSimpleNumber", new String[]{"java.lang.String"}, new String[]{"--0.0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenamePrototypes", "com.google.javascript.jscomp.RenamePrototypes", "getPropertyMap", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2), new String[][]{{"getOriginalNameToNewNameMap", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"01,0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"01,0\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:7>", "false", "<sample:0>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:1>", "<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean", "<sample:6>", "true"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:7>", "catch.(", "<sample:6>", "<sample:0>"}, true, 0, null, 3), new String[][]{{"isOnlyModifiesThisCall", "", "3"}, {"detachChildren", "", "6"}, {"removeChild", "com.google.javascript.rhino.Node", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenamePrototypes", "com.google.javascript.jscomp.RenamePrototypes", "getPropertyMap", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"toBytes", "", "2"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenamePrototypes", "com.google.javascript.jscomp.RenamePrototypes", "getPropertyMap", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.RenamePrototypes", "getPropertyMap", ""}}, 3), new String[][]{{"save", "java.lang.String", "3"}, {"toBytes", "", "0"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"START^OF_EXPRIN_FOR_INIT_CLAUSE"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/START^OF_EXPRIN_FOR_INIT_CLAUSE/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenamePrototypes", "com.google.javascript.jscomp.RenamePrototypes", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:12>", "<sample:3>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:3>", "TITLEPRESERVE_BLOCK", "<sample:5>", "<null>"}, true), new String[][]{{"getIntProp", "int", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:9>", "", "<sample:7>", "<sample:4>"}, true), new String[][]{{"getType", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("132", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:5>", "false"}, false, 2, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", "com.google.javascript.rhino.Node", "<sample:13>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenamePrototypes", "com.google.javascript.jscomp.RenamePrototypes", "getPropertyMap", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.RenamePrototypes", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:15>", "<sample:12>"}}, 3), new String[][]{{"save", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.VariableMap", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"1.1234567STATDMENT", "<sample:5>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"1.1234567STATDMENT\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "strEscape", new String[]{"java.lang.String", "char", "java.lang.String", "java.lang.String", "java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"\\,", "\uffff", "", "2147483648", "=", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\uffff=,\uffff", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"1.5e30/5."}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5e30/5.", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"..5"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("..5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:6>", "<sample:2>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<sample:11>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenamePrototypes", "com.google.javascript.jscomp.RenamePrototypes", "getPropertyMap", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1), new String[][]{{"lookupNewName", "java.lang.String", "7"}, {"getOriginalNameToNewNameMap", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:2>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean", "<sample:5>", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:13>", "false"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"1e100STATEMENT"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"1e100STATEMENT\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:15>", "false"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addArrayList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:15>"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "isSimpleNumber", new String[]{"java.lang.String"}, new String[]{"1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:1>", "<sample:1>"}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{",x123456789\n", "<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\",x123456789\\n\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addArrayList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:11>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"/,"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("//,/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:11>", "finally", "<sample:2>", "<sample:5>"}, true, 0, null, 1), new String[][]{{"putProp", "int,java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT [target: key] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationException, getT...#398#184896893", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenamePrototypes", "com.google.javascript.jscomp.RenamePrototypes", "getPropertyMap", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3), new String[][]{{"getOriginalNameToNewNameMap", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{".5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\".5\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:10>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "java.lang.String", "0x1234567811.25"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "strEscape", new String[]{"java.lang.String", "char", "java.lang.String", "java.lang.String", "java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"", "7", "return<", "-0/0", "1.5d--11.25", "<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("77", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFF:"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"0xFFFFFFFF:\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenamePrototypes", "com.google.javascript.jscomp.RenamePrototypes", "getPropertyMap", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.RenamePrototypes", "getPropertyMap", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.VariableMap", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:13>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node", "<sample:14>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "isSimpleNumber", new String[]{"java.lang.String"}, new String[]{"]U"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenamePrototypes", "com.google.javascript.jscomp.RenamePrototypes", "getPropertyMap", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.RenamePrototypes", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<null>"}, {"com.google.javascript.jscomp.RenamePrototypes", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:2>"}}), new String[][]{{"getOriginalNameToNewNameMap", "", "1"}, {"getOrDefault", "java.lang.Object,java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<null>", "0xFFFFFFFFIN_FOR_INIT_CLAUSE", "<sample:8>", "<sample:6>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenamePrototypes", "com.google.javascript.jscomp.RenamePrototypes", "getPropertyMap", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.RenamePrototypes", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:14>"}}, 1), new String[][]{{"lookupNewName", "java.lang.String", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<sample:18>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"9--11"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/9--11/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "getSimpleNumber", new String[]{"java.lang.String"}, new String[]{"12345679012345678901234567890"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "tagAsStrict", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"STATEMENT"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/STATEMENT/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addExpr", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:6>", "1"}, false, 1, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "java.lang.String", "nnull"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"cat"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/cat/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:13>", "<sample:4>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean", "<sample:12>", "false"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "isSimpleNumber", new String[]{"java.lang.String"}, new String[]{"010"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"ii"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ii", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"BEFORE_DANGLING_ELSE-1", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"BEFORE_DANGLING_ELSE-1\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:3>", "true", "<sample:7>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenamePrototypes", "com.google.javascript.jscomp.RenamePrototypes", "getPropertyMap", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.RenamePrototypes", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:15>", "<sample:4>"}}, 1), new String[][]{{"getNewNameToOriginalNameMap", "", "4"}, {"values", "", "7"}, {"size", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "getSimpleNumber", new String[]{"java.lang.String"}, new String[]{"011"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("11.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"=Title"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"=Title\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:2>", "", "<sample:7>", "<sample:0>"}, true, 0, null, 1), new String[][]{{"getAncestors", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$AncestorIterable", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"var a,b,c"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/var a,b,c/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenamePrototypes", "com.google.javascript.jscomp.RenamePrototypes", "getPropertyMap", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.RenamePrototypes", "getPropertyMap", ""}, {"com.google.javascript.jscomp.RenamePrototypes", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:13>", "<sample:15>"}}, 3), new String[][]{{"lookupSourceName", "java.lang.String", "0"}, {"lookupSourceName", "java.lang.String", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addExpr", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:13>", "0"}, false, 1, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean", "<sample:9>", "false"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "strEscape", new String[]{"java.lang.String", "char", "java.lang.String", "java.lang.String", "java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"1.(f", "\ufffe", "2147483648OTHER", "12:30:45", "2020-l2-30T25:61:61var ", "<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\ufffe1.(f\ufffe", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"Thtle", "<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"Thtle\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"1L("}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/1L(/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"4<1!", "<empty>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"4<1!\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenamePrototypes", "com.google.javascript.jscomp.RenamePrototypes", "getPropertyMap", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.RenamePrototypes", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:10>", "<sample:13>"}}), new String[][]{{"getOriginalNameToNewNameMap", "", "4"}, {"size", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"=2020-02-30T25:61:61"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/=2020-02-30T25:61:61/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"0x123456789\t", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/0x123456789\\t/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "strEscape", new String[]{"java.lang.String", "char", "java.lang.String", "java.lang.String", "java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"fioally", "y", "1.25PRESERVE_BLOCK", "2020-l2-30T25:51:61", "-2try", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("yfioallyy", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "getSimpleNumber", new String[]{"java.lang.String"}, new String[]{"00"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenamePrototypes", "com.google.javascript.jscomp.RenamePrototypes", "getPropertyMap", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"lookupNewName", "java.lang.String", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:2>", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:3>", "true", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"1234567890012345678901234567890", "<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/1234567890012345678901234567890/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addExpr", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:15>", "-11"}, false, 1, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean", "<sample:5>", "true"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:10>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addCaseBody", "com.google.javascript.rhino.Node", "<sample:18>"}, {"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:9>", "<sample:7>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"TITME"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/TITME/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"return"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("return", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"BEFORE_DANGLING_ELSEtsy"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/BEFORE_DANGLING_ELSEtsy/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenamePrototypes", "com.google.javascript.jscomp.RenamePrototypes", "getPropertyMap", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.RenamePrototypes", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:15>"}, {"com.google.javascript.jscomp.RenamePrototypes", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:15>"}}, 3), new String[][]{{"getNewNameToOriginalNameMap", "", "2"}, {"putAll", "java.util.Map", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"0x1234567891", "<empty>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"0x1234567891\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"throwtrue", "<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/throwtrue/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:9>", "", "<sample:3>", "<sample:7>"}, true, 0, null, 1), new String[][]{{"removeChildren", "", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter"}, new String[]{"<sample:2>", "var ", "<sample:5>", "<sample:7>"}, true, 0, null, 3), new String[][]{{"isNoSideEffectsCall", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RenamePrototypes", "com.google.javascript.jscomp.RenamePrototypes", "getPropertyMap", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1), new String[][]{{"getNewNameToOriginalNameMap", "", "1"}, {"clear", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"1.5f"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"1.5f\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "strEscape", new String[]{"java.lang.String", "char", "java.lang.String", "java.lang.String", "java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"1L", "y", "[thrpwOTHER", "true", "TITLE--1throw", "<null>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("y1Ly", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "getSimpleNumber", new String[]{"java.lang.String"}, new String[]{"5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("5.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"?"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("?", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"-0.0trz"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/-0.0trz/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"PRESERVE_BLCK"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PRESERVE_BLCK", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"?TIDLE", "<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"?TIDLE\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:0>", "false"}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"BEFORE_DANGLING_ELS"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/BEFORE_DANGLING_ELS/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{".5"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/.5/", String.valueOf(actual));
 }
}
