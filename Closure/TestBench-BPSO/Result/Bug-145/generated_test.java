package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{">.5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\">.5\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", new String[]{"com.google.javascript.rhino.Node", "int", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:0>", "-2147483648", "<sample:2>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addCaseBody", "com.google.javascript.rhino.Node", "<sample:4>"}, {"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"N"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("N", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "int[]"}, new String[]{"<sample:8>", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addCaseBody", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "java.lang.String", "0x12345-6789"}, {"com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", "com.google.javascript.rhino.Node,int,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:10>", "4096", "<sample:8>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:11>", "false", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:4>", "true"}, false, 6, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"\\0x1F"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/\\0x1F/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "int[]"}, new String[]{"<sample:15>", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,int[]", "<sample:2>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:4>", "true", "<sample:4>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", "com.google.javascript.rhino.Node,int,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:13>", "-1", "<sample:3>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"\rull"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"\\rull\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:11>", "<sample:0>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", "com.google.javascript.rhino.Node,int,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:4>", "2147483647", "<sample:4>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "int[]"}, new String[]{"<sample:10>", "<sample:0>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", "com.google.javascript.rhino.Node,int,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:8>", "2147483647", "<sample:7>"}, {"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node", "<sample:3>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:13>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,int[]", "<sample:0>", "<sample:1>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "int[]"}, new String[]{"<sample:15>", "<empty>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node", "<null>"}, {"com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", "com.google.javascript.rhino.Node", "<sample:15>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"\0372147483648", "<null>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/\\u001f2147483648/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"'", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"'\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"va\n "}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"va\\n \"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"\"1.1234567890123456", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'\"1.1234567890123456'", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"va\t<", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"va\\t<\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"-v", "<empty>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/-v/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"1A.12345678"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"1A.12345678\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addCaseBody", "com.google.javascript.rhino.Node", "<sample:1>"}, {"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addExpr", "com.google.javascript.rhino.Node,int", "<sample:12>", "-2147483648"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:10>", "false"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"Ttle", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"Ttle\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:3>", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", "com.google.javascript.rhino.Node,int,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:0>", "2147483647", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"+11.1234567890123456"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/+11.1234567890123456/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"1.13345678"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"1.13345678\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:2>", "<sample:6>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:11>", "false"}, false, 7, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", "com.google.javascript.rhino.Node,int,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:7>", "2147483647", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"n"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/n/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", new String[]{"com.google.javascript.rhino.Node", "int", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:6>", "5", "<sample:9>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", "com.google.javascript.rhino.Node,int,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:7>", "2147483647", "<null>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"IM_FOR_INIT_CLAUSE(", "<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"IM_FOR_INIT_CLAUSE(\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:9>", "true", "<sample:9>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean", "<null>", "true"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:8>", "false", "<sample:4>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "java.lang.String", "finally"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "strEscape", new String[]{"java.lang.String", "char", "java.lang.String", "java.lang.String", "java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"F", "7", "true ", "IN_FOR_INIT_CLAUSE", "(1.12345678901234567", "<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("7F7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"cuatch("}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("cuatch(", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "int[]"}, new String[]{"<sample:2>", "<sample:0>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addExpr", "com.google.javascript.rhino.Node,int", "<sample:5>", "-2147483648"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:2>", "false"}, false, 1, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,int[]", "<sample:6>", "<empty>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:10>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", "com.google.javascript.rhino.Node,int,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:5>", "10", "<sample:6>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("//", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "strEscape", new String[]{"java.lang.String", "char", "java.lang.String", "java.lang.String", "java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"-1", "]", " -1234567", "--1return", "1.1234567890234567", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("]-1]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", "com.google.javascript.rhino.Node", "<sample:3>"}, {"com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", "com.google.javascript.rhino.Node", "<sample:4>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"java.lang.String"}, new String[]{"Helln, World+1"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,int[]", "<sample:10>", "<sample:1>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:7>", "false"}, false, 5, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node", "<sample:0>"}, {"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:1>", "false", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"T1H"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/T1H/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:10>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,int[]", "<sample:1>", "<sample:0>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", "com.google.javascript.rhino.Node,int,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:5>", "2147483647", "<sample:3>"}, {"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,int[]", "<null>", "<sample:0>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:13>", "true", "<sample:2>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node", "<sample:16>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"OSHER"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/OSHER/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "int[]"}, new String[]{"<sample:4>", "<sample:0>"}, false, 5, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"2147483648"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/2147483648/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"a,b,c"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/a,b,c/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addExpr", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:0>", "10"}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "strEscape", new String[]{"java.lang.String", "char", "java.lang.String", "java.lang.String", "java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"[", "7", ".-1", "01.", "1.12345678", "<empty>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("7[7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:11>", "<sample:5>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:10>", "false", "<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<sample:3>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addExpr", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:0>", "-2146959360"}, false, 6, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:7>", "true", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", "com.google.javascript.rhino.Node", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", "com.google.javascript.rhino.Node,int,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:11>", "0", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"", "<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"/"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"/\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", "com.google.javascript.rhino.Node", "<sample:13>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", "com.google.javascript.rhino.Node", "<sample:2>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"1.26", "<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/1.26/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:13>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{">.6", "<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/>.6/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 4, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:15>", "true", "<sample:8>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addExpr", "com.google.javascript.rhino.Node,int", "<sample:3>", "2147483643"}, {"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "int[]"}, new String[]{"<sample:13>", "<sample:0>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:2>", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"S.ATEMENT", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"S.ATEMENT\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean", "<sample:9>", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:13>", "<sample:3>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:14>", "true", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "int[]"}, new String[]{"<sample:15>", "<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:10>", "true", "<sample:4>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"\rull", "<null>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"\\rull\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:10>"}, false, 7, new String[][]{}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:14>", "<sample:3>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:0>", "<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addCaseBody", "com.google.javascript.rhino.Node", "<sample:7>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"1/"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/1//", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"STATE:ENT"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/STATE:ENT/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"T020-01-01", "<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"T020-01-01\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", new String[]{"com.google.javascript.rhino.Node", "int", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:9>", "-2147483648", "<sample:3>"}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"0-B1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/0-B1/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"trrue", "<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"trrue\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addCaseBody", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:8>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,int[]", "<sample:13>", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"tr1.1234567890123456"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"tr1.1234567890123456\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"TitlU"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"TitlU\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"PRESERVE_.;OCK"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/PRESERVE_.;OCK/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "int[]"}, new String[]{"<sample:10>", "<sample:2>"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:1>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "int[]"}, new String[]{"<sample:3>", "<sample:2>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addExpr", "com.google.javascript.rhino.Node,int", "<sample:5>", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 7, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addExpr", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:6>", "2147483647"}, false, 5, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:8>", "true", "<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addExpr", "com.google.javascript.rhino.Node,int", "<sample:11>", "-2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:10>", "false", "<sample:1>"}, false, 1, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"java.lang.String"}, new String[]{"8."}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"i"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("i", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{">.5", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\">.5\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"HN_FOR_INIT_CLAUSE"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"HN_FOR_INIT_CLAUSE\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"1.5f"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addExpr", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:11>", "-536870912"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"A1]", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"A1]\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:7>", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "java.lang.String", "12:40:45"}, {"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "int[]"}, new String[]{"<sample:4>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "java.lang.String", "2147484648var "}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"1..5e300"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1..5e300", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:5>", "false"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"1.5f"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/1.5f/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:10>", "false"}, false, 7, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addExpr", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:1>", "-2147483648"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"caXtch(catch("}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"caXtch(catch(\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"2147483648G"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"2147483648G\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{" null", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\" null\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"1.25", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"1.25\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"0", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/0/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:1>", "<sample:0>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"1L"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"1L\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "strEscape", new String[]{"java.lang.String", "char", "java.lang.String", "java.lang.String", "java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"retuqn", "*", "a0.5f", "21474836448", "0y1G", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("*retuqn*", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"+1", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"+1\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "strEscape", new String[]{"java.lang.String", "char", "java.lang.String", "java.lang.String", "java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"OTHER", "3", ">.5", "vM", "try", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("3OTHER3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "strEscape", new String[]{"java.lang.String", "char", "java.lang.String", "java.lang.String", "java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"01E-5", "/", "throwPRESERVE_BLOCKPRESERVE_BLOCK", ">123456789012345678901234567890", "0x1F", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/01E-5/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:2>", "<sample:1>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addCaseBody", "com.google.javascript.rhino.Node", "<sample:7>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:5>", "false", "<sample:5>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node", "<sample:3>"}, {"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean", "<sample:15>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "strEscape", new String[]{"java.lang.String", "char", "java.lang.String", "java.lang.String", "java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"V", "\uffff", "=", "2147u83649", "0x123456779", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\uffffV\uffff", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"`bc"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"`bc\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "int[]"}, new String[]{"<sample:1>", "<empty>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean", "<sample:1>", "true"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:11>", "true", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "java.lang.String", "IN_FOR_INIT_CLAUSE("}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"1.12345677", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"1.12345677\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"PRESERVE_BLOCK"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PRESERVE_BLOCK", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"-1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/-1/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "strEscape", new String[]{"java.lang.String", "char", "java.lang.String", "java.lang.String", "java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"c", "a", "-0", "OTHER0x1F", "20220-01-01", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("aca", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"throw"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/throw/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"11.5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/11.5/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{".5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/.5/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:15>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:15>", "false"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"15f", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"15f\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"STTEMENT"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("STTEMENT", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"b"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "int[]"}, new String[]{"<sample:10>", "<sample:1>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,int[]", "<sample:7>", "<empty>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:13>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,int[]", "<sample:5>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("//", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"0\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"a,c,c"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"a,c,c\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"a("}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"a(\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"^"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("^", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "strEscape", new String[]{"java.lang.String", "char", "java.lang.String", "java.lang.String", "java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"BEFORE_DANGLINMG_ELSE", "0", "1.5fnulC", "c+tch(", "0xFFFFFFF", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0BEFORE_DANGLINMG_ELSE0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addExpr", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<null>", "-536870912"}, false, 3, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "java.lang.String", "abc1.12345678901234567"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "strEscape", new String[]{"java.lang.String", "char", "java.lang.String", "java.lang.String", "java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"12:20:451.5e300", ")", "jTitle", "6)", "retu", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(")12:20:451.5e300)", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node", "<sample:11>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"0STATEMENT"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/0STATEMENT/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"STATEMFNT", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"STATEMFNT\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean", "<sample:8>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "strEscape", new String[]{"java.lang.String", "char", "java.lang.String", "java.lang.String", "java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"PRESERVE_wLOCK", "'", "1123456_7", "1.5", "1.5f", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'PRESERVE_wLOCK'", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"x123456789"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/x123456789/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"?"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/?/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", new String[]{"com.google.javascript.rhino.Node", "int", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:15>", "-2147483647", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"P", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/P/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"T", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/T/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", new String[]{"com.google.javascript.rhino.Node", "int", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:15>", "2147483647", "<sample:7>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addCaseBody", "com.google.javascript.rhino.Node", "<sample:13>"}, {"com.google.javascript.jscomp.CodeGenerator", "addExpr", "com.google.javascript.rhino.Node,int", "<sample:7>", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<null>", "<null>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"OTHERR", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/OTHERR/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"/.25", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("//.25/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"12345678901234567889012345 67890", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/12345678901234567889012345 67890/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"OHER"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"OHER\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"+1Ifinally", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/+1Ifinally/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addCaseBody", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:13>"}, false, 7, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:15>", "false", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<sample:4>"}, {"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<null>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"TtTLLE"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/TtTLLE/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"finaKly", "<null>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/finaKly/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:11>", "true"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{">.5", "<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\">.5\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"aac", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/aac/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"TTART_OF_EXPR"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"TTART_OF_EXPR\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addExpr", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:13>", "-15728640"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"[0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"[0\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "strEscape", new String[]{"java.lang.String", "char", "java.lang.String", "java.lang.String", "java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"R", ")", "(SOTHER", "1E-5", "1.123456L81.5e300", "<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(")R)", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:15>", "true", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:9>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:5>", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{";"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\";\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"\037"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"\\u001f\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", new String[]{"com.google.javascript.rhino.Node", "int", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:15>", "2147483647", "<sample:2>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addExpr", "com.google.javascript.rhino.Node,int", "<sample:0>", "2147483647"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"-.0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"-.0\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"sry"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"sry\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "int[]"}, new String[]{"<sample:8>", "<empty>"}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:11>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", "com.google.javascript.rhino.Node,int,com.google.javascript.jscomp.CodeGenerator$Context", "<null>", "1", "<sample:7>"}, {"com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", "com.google.javascript.rhino.Node,int,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:3>", "2147483647", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:15>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "java.lang.String", "0.25"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addCaseBody", "com.google.javascript.rhino.Node", "<sample:5>"}, {"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:10>", "false", "<sample:9>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"Title"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"Title\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"<N"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/<N/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:17>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"]"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"]\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"d11.5f"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("d11.5f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"IN_FOR_wNIT_CLAUSE"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/IN_FOR_wNIT_CLAUSE/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"IN_FOR_INIT_CLAUSE"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"IN_FOR_INIT_CLAUSE\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"Hrllo, World", "<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/Hrllo, World/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"]"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"]\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"catch(0x1F"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"catch(0x1F\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"S"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"S\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"re"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("re", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"P1H", "<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"P1H\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"TITKE"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TITKE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"fjnally"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/fjnally/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "strEscape", new String[]{"java.lang.String", "char", "java.lang.String", "java.lang.String", "java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"1.1234568", "C", "BEFORE_DANG", "catch(", "1", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("C1.1234568C", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"n", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"n\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"1-25"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/1-25/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{">.5"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/>.5/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"-"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"-\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"f1L", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"f1L\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{".", "<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\".\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addExpr", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:4>", "-2147479552"}, false, 7, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:2>", "true", "<sample:8>"}, {"com.google.javascript.jscomp.CodeGenerator", "addCaseBody", "com.google.javascript.rhino.Node", "<sample:10>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{")1.1234567890123456"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\")1.1234567890123456\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"  "}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"  \"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "strEscape", new String[]{"java.lang.String", "char", "java.lang.String", "java.lang.String", "java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"", "=", "var d", "START_OF_EWPR1", "[[", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("==", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"PRESERVEBLOCK"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/PRESERVEBLOCK/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"STATEMET"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/STATEMET/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:15>", "<sample:7>"}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:10>", "false"}, false, 5, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "java.lang.String", "("}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"\r"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\r", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"\rvll+1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\rvll+1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"1L"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/1L/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"throw"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/throw/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addExpr", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:13>", "-2147475200"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"catch(0xFFFFFFFF1.25"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("catch(0xFFFFFFFF1.25", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{".5", "<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\".5\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"\037", "<null>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/\\u001f/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"java.lang.String"}, new String[]{" "}, false, 5, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean,com.google.javascript.jscomp.CodeGenerator$Context", "<null>", "false", "<sample:6>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"/", "<empty>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("///", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:7>", "<sample:6>"}, false, 5, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"0x123456789"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"0x123456789\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"-v"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/-v/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"2020_-01-01"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020_-01-01", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"9eturn"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("9eturn", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{".1.5"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/.1.5/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"ST1ATEMENT", "<null>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/ST1ATEMENT/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"IN_FO<_INIT_CLAUSE", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"IN_FO<_INIT_CLAUSE\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"return"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"return\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"", "<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", new String[]{"com.google.javascript.rhino.Node", "int", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:5>", "-2147483648", "<sample:0>"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"L", "<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/L/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"2147485648var ", "<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"2147485648var \"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"START_OF_EXPR"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("START_OF_EXPR", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-02-30T25:61:61", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addExpr", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:8>", "-19"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", new String[]{"com.google.javascript.rhino.Node", "int", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<null>", "-2147483648", "<sample:7>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,int[]", "<sample:4>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"Il"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Il", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"a", "<null>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"a\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addCaseBody", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false, 3, new String[][]{}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"12:3B0:45", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/12:3B0:45/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<null>", "<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", "com.google.javascript.rhino.Node,int,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:9>", "2147483647", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", new String[]{"com.google.javascript.rhino.Node", "int", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:11>", "-2147479552", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean", "<sample:8>", "false"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", new String[]{"com.google.javascript.rhino.Node", "int", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<null>", "256", "<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,int[]", "<sample:9>", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:1>", "<sample:3>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "java.lang.String", "STATE7ENT"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"a"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"35."}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("35.", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"2147484648varF ", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"2147484648varF \"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", new String[]{"com.google.javascript.rhino.Node", "int", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:0>", "0", "<sample:2>"}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "strEscape", new String[]{"java.lang.String", "char", "java.lang.String", "java.lang.String", "java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"ry", "!", "START_OF_EX", "010-1", "C147483648", "<null>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("!ry!", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"tru"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("tru", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{".-"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".-", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{".V", "<null>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/.V/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addExpr", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:6>", "10"}, false, 7, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean", "<sample:11>", "false"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"IN_FOR_INIT_CLAUSE0x1F", "<sample:4>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/IN_FOR_INIT_CLAUSE0x1F/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "strEscape", new String[]{"java.lang.String", "char", "java.lang.String", "java.lang.String", "java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"1.5f", "a", "+", "-", "0x123456\n789", "<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a1.5fa", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, false, 6, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "strEscape", new String[]{"java.lang.String", "char", "java.lang.String", "java.lang.String", "java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{")", "?", "throwPT1>H", "vaar ", "PT1H1.5", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("?)?", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"-u"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-u", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addExpr", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:4>", "-2147483648"}, false, 5, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"\rull0", "<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/\\rull0/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"1.5", "<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/1.5/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"?010", "<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/?010/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "strEscape", new String[]{"java.lang.String", "char", "java.lang.String", "java.lang.String", "java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"PRESERVE_BLOCK", " ", "PRESERVE_BLOCKuhrow", "??", "Z", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" PRESERVE_BLOCK ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"BEFORF_DANGLING_ELSE", "<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/BEFORF_DANGLING_ELSE/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"PRESERVE_BLOK", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/PRESERVE_BLOK/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "strEscape", new String[]{"java.lang.String", "char", "java.lang.String", "java.lang.String", "java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"IN_FOR_INIT_yCLAUSE(1L", ">", "S", "uar ", "", "<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(">IN_FOR_INIT_yCLAUSE(1L>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "strEscape", new String[]{"java.lang.String", "char", "java.lang.String", "java.lang.String", "java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"9TATEMENT", "6", "]1.12345a67890123456", "20R0-01-01", "Helllo, World", "<empty>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("69TATEMENT6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"thrw", "<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"thrw\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"oull", "<empty>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"oull\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"OTHES", "<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"OTHES\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:15>", "false"}, false, 7, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", "com.google.javascript.rhino.Node,int,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:3>", "-1", "<sample:1>"}, {"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:8>", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "strEscape", new String[]{"java.lang.String", "char", "java.lang.String", "java.lang.String", "java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"finaly", " ", "*", "IN_FOR_INIT_CLAUSE", "214748", "<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" finaly ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"uello, Worldcatch(", "<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/uello, Worldcatch(/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "strEscape", new String[]{"java.lang.String", "char", "java.lang.String", "java.lang.String", "java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"'", "C", ",-vtry", "1L", "IN_FOR_INIT_CLAUSE(2147483648", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("C1LC", String.valueOf(actual));
 }
}
