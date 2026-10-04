package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", "com.google.javascript.rhino.Node,int,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:5>", "1", "<sample:0>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addCaseBody", "com.google.javascript.rhino.Node", "<sample:6>"}, {"com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", "com.google.javascript.rhino.Node,int,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:5>", "2147483647", "<sample:2>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "isSimpleNumber", new String[]{"java.lang.String"}, new String[]{"1e10"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "tagAsStrict", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addExpr", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:13>", "-55"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node", "<sample:5>"}, {"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<sample:11>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"'use strict';", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"'use strict';\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "getSimpleNumber", new String[]{"java.lang.String"}, new String[]{"1.5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "getSimpleNumber", new String[]{"java.lang.String"}, new String[]{"1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", new String[]{"com.google.javascript.rhino.Node", "int", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:11>", "2147483647", "<sample:4>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:2>", "false", "<sample:5>"}, {"com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", "com.google.javascript.rhino.Node,int,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:1>", "-2147483648", "<sample:4>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"STATEMENT"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("STATEMENT", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "isSimpleNumber", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:11>", "false", "<sample:4>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean", "<sample:10>", "true"}, {"com.google.javascript.jscomp.CodeGenerator", "addCaseBody", "com.google.javascript.rhino.Node", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:17>", "<sample:2>"}, false, 14, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean", "<sample:12>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:11>"}, false, 14, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addExpr", "com.google.javascript.rhino.Node,int", "<sample:15>", "55"}, {"com.google.javascript.jscomp.CodeGenerator", "addArrayList", "com.google.javascript.rhino.Node", "<sample:10>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:15>"}, false, 9, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<sample:12>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{">"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\">\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"\n", "<null>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"\\n\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"\\", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"\\\\\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"\r3W&\tuOxD\016PR"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/\\r3W&\\tuOxD\\u000ePR/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", "com.google.javascript.rhino.Node,int,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:5>", "1073741823", "<sample:6>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", new String[]{"com.google.javascript.rhino.Node", "int", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:4>", "-1", "<sample:2>"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", new String[]{"com.google.javascript.rhino.Node", "int", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:1>", "-2147483648", "<sample:3>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean", "<sample:7>", "true"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addArrayList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:12>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addExpr", "com.google.javascript.rhino.Node,int", "<sample:2>", "10"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addArrayList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:11>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addExpr", "com.google.javascript.rhino.Node,int", "<sample:2>", "10"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addArrayList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addExpr", "com.google.javascript.rhino.Node,int", "<sample:2>", "10"}, {"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:0>", "true", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"IN_FOR_INIT_CLAUSE", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"IN_FOR_INIT_CLAUSE\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addExpr", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:10>", "-55"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node", "<sample:1>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addExpr", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:10>", "-65642"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node", "<sample:11>"}, {"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<sample:11>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addExpr", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:9>", "-131284"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node", "<sample:11>"}, {"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<sample:10>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addExpr", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:10>", "55"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addExpr", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:9>", "55"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "getSimpleNumber", new String[]{"java.lang.String"}, new String[]{"1K"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "tagAsStrict", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node", "<sample:4>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"", "<null>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{" ", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\" \"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"!", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"!\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"b", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"b\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"6", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"6\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"5", "<empty>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"5\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"51E-5", "<empty>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"51E-5\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "tagAsStrict", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", "com.google.javascript.rhino.Node", "<sample:10>"}, {"com.google.javascript.jscomp.CodeGenerator", "tagAsStrict", ""}, {"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<sample:0>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "getSimpleNumber", new String[]{"java.lang.String"}, new String[]{"I"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "tagAsStrict", new String[]{}, new String[]{}, false, 22, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", "com.google.javascript.rhino.Node,int,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:10>", "1", "<sample:4>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", new String[]{"com.google.javascript.rhino.Node", "int", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:10>", "4", "<sample:0>"}, false, 11, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", new String[]{"com.google.javascript.rhino.Node", "int", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:11>", "-2044", "<sample:0>"}, false, 11, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addExpr", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:11>", "2147483647"}, false, 13, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<sample:10>"}, {"com.google.javascript.jscomp.CodeGenerator", "addArrayList", "com.google.javascript.rhino.Node", "<sample:9>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addExpr", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<null>", "2147483647"}, false, 2, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<sample:2>"}, {"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<sample:12>"}, {"com.google.javascript.jscomp.CodeGenerator", "addArrayList", "com.google.javascript.rhino.Node", "<sample:11>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "isSimpleNumber", new String[]{"java.lang.String"}, new String[]{"1.25"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "isSimpleNumber", new String[]{"java.lang.String"}, new String[]{"0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"a,b,c"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a,b,c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addArrayList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<null>"}, {"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:10>", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"java.lang.String"}, new String[]{"'use strict';"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addArrayList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:10>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<null>"}, {"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:10>", "<sample:2>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"0L2147483648"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/0L2147483648/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"/L2147483647"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("//L2147483647/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"/L2147483647PT1H"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("//L2147483647PT1H/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"1.1234567B901234567"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/1.1234567B901234567/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"1.25"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/1.25/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"125"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/125/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"1125"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/1125/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"1.12345678901234567"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/1.12345678901234567/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"112345678901234567"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/112345678901234567/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"112345O678901234566"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/112345O678901234566/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"112345O678901224566"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/112345O678901224566/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addExpr", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:11>", "1"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:11>", "true", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "isSimpleNumber", new String[]{"java.lang.String"}, new String[]{"finalmy"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addCaseBody", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "getSimpleNumber", new String[]{"java.lang.String"}, new String[]{" "}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addArrayList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:11>"}, false, 11, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:13>", "false", "<sample:1>"}, {"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:12>", "false", "<sample:11>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addArrayList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false, 11, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:13>", "false", "<sample:1>"}, {"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:12>", "false", "<sample:11>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addArrayList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 11, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addExpr", "com.google.javascript.rhino.Node,int", "<sample:10>", "10"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:0>", "false", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:7>", "<sample:3>"}, {"com.google.javascript.jscomp.CodeGenerator", "tagAsStrict", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:6>", "true", "<sample:6>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "tagAsStrict", ""}, {"com.google.javascript.jscomp.CodeGenerator", "addCaseBody", "com.google.javascript.rhino.Node", "<sample:7>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:3>", "false", "<sample:1>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean", "<sample:10>", "true"}, {"com.google.javascript.jscomp.CodeGenerator", "addArrayList", "com.google.javascript.rhino.Node", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addExpr", "com.google.javascript.rhino.Node,int", "<sample:1>", "-1"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:12>", "<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", "com.google.javascript.rhino.Node", "<sample:2>"}, {"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:5>", "true", "<sample:1>"}, {"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:11>", "false", "<sample:4>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:15>", "<sample:4>"}, false, 14, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", "com.google.javascript.rhino.Node", "<sample:2>"}, {"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:5>", "true", "<sample:1>"}, {"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:11>", "false", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"["}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"[\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:14>", "<sample:3>"}, false, 13, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", "com.google.javascript.rhino.Node", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addCaseBody", "com.google.javascript.rhino.Node", "<null>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:3>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addArrayList", "com.google.javascript.rhino.Node", "<sample:13>"}, {"com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", "com.google.javascript.rhino.Node", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:4>", "<null>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addArrayList", "com.google.javascript.rhino.Node", "<sample:13>"}, {"com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", "com.google.javascript.rhino.Node", "<sample:5>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:2>", "<sample:5>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addArrayList", "com.google.javascript.rhino.Node", "<sample:14>"}, {"com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", "com.google.javascript.rhino.Node", "<sample:8>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:6>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean", "<sample:13>", "true"}, {"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean", "<sample:10>", "true"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:15>"}, false, 11, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addArrayList", "com.google.javascript.rhino.Node", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false, 14, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addExpr", "com.google.javascript.rhino.Node,int", "<sample:15>", "55"}, {"com.google.javascript.jscomp.CodeGenerator", "addArrayList", "com.google.javascript.rhino.Node", "<sample:10>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:10>"}, false, 13, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<sample:2>"}, {"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:6>", "<null>"}, {"com.google.javascript.jscomp.CodeGenerator", "addArrayList", "com.google.javascript.rhino.Node", "<sample:15>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:13>"}, false, 13, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<sample:2>"}, {"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:6>", "<null>"}, {"com.google.javascript.jscomp.CodeGenerator", "addArrayList", "com.google.javascript.rhino.Node", "<sample:15>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 13, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addArrayList", "com.google.javascript.rhino.Node", "<sample:17>"}, {"com.google.javascript.jscomp.CodeGenerator", "addExpr", "com.google.javascript.rhino.Node,int", "<sample:12>", "0"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", new String[]{"com.google.javascript.rhino.Node", "int", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:2>", "1", "<sample:3>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addExpr", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:2>", "2147483647"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{":", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/:/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", "com.google.javascript.rhino.Node,int,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:5>", "2147483647", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"1.5", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/1.5/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"1.51.1234567", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/1.51.1234567/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"1.50xFFFFFFFF", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/1.50xFFFFFFFF/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addExpr", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<null>", "2147483647"}, false, 5, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean", "<sample:7>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addExpr", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<null>", "2147483647"}, false, 5, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean", "<sample:7>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", new String[]{"com.google.javascript.rhino.Node", "int", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:4>", "-1", "<sample:2>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", new String[]{"com.google.javascript.rhino.Node", "int", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:8>", "-58", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:1>", "false", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:4>", "false", "<sample:6>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addExpr", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:1>", "-1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addExpr", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:1>", "1"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", "com.google.javascript.rhino.Node,int,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:6>", "1", "<sample:7>"}, {"com.google.javascript.jscomp.CodeGenerator", "addArrayList", "com.google.javascript.rhino.Node", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addExpr", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:1>", "1"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", "com.google.javascript.rhino.Node,int,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:6>", "1", "<sample:7>"}, {"com.google.javascript.jscomp.CodeGenerator", "addArrayList", "com.google.javascript.rhino.Node", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addArrayList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addArrayList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addArrayList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:10>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addCaseBody", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:1>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addExpr", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:10>", "1"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node", "<sample:7>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addExpr", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:11>", "1"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addCaseBody", "com.google.javascript.rhino.Node", "<sample:11>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addExpr", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:10>", "55"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node", "<sample:5>"}, {"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<sample:11>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addExpr", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:10>", "25"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node", "<sample:11>"}, {"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<sample:7>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/2147483648/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "tagAsStrict", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "tagAsStrict", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "tagAsStrict", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node", "<sample:10>"}, {"com.google.javascript.jscomp.CodeGenerator", "tagAsStrict", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "strEscape", new String[]{"java.lang.String", "char", "java.lang.String", "java.lang.String", "java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"0", "]", "finally", ":", "1.5d", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("]0]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{":"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/:/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<sample:11>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"1.5e300"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"1.5e300\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"?", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"?\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"B", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"B\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"C", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"C\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"2", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"2\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"5E-e5finally", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"5E-e5finally\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"5Ee5finally", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"5Ee5finally\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"1.1234567890123456"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/1.1234567890123456/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:3>", "true"}, false, 2, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean", "<null>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{" "}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/ /", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{" L"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/ L/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{" L2020-02-30T25:61:61"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/ L2020-02-30T25:61:61/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{" L2020-02-3"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/ L2020-02-3/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{" L220-12-3"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/ L220-12-3/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"<null>", "<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"throw", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/throw/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"STATEMENT", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/STATEMENT/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "strEscape", new String[]{"java.lang.String", "char", "java.lang.String", "java.lang.String", "java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"2020-02-30T25:61:61", "a", "PRESERVE_BLOCK", "null", "?", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a2020-02-30T25:61:61a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "strEscape", new String[]{"java.lang.String", "char", "java.lang.String", "java.lang.String", "java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"2020-02-30T25:61:61", "`", "PRESERVE_BLOCK", "null", "?", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("`2020-02-30T25:61:61`", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "strEscape", new String[]{"java.lang.String", "char", "java.lang.String", "java.lang.String", "java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"22020-02-30T25:61:61", "`", "PRESERVE_BLOCK", "null", "?", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("`22020-02-30T25:61:61`", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "strEscape", new String[]{"java.lang.String", "char", "java.lang.String", "java.lang.String", "java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"22020-03-30T25:61:61", "`", "PRESERVE_BLOCK", "null", "?", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("`22020-03-30T25:61:61`", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "strEscape", new String[]{"java.lang.String", "char", "java.lang.String", "java.lang.String", "java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"22030-03-30T25:61:61", "`", "PRESERVE_BLOCK", "null", "?", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("`22030-03-30T25:61:61`", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "strEscape", new String[]{"java.lang.String", "char", "java.lang.String", "java.lang.String", "java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"22030-03-30T25:61:61", "4", "PRESERVE_BLOCK", "nukl", "?", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("422030-03-30T25:61:614", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "strEscape", new String[]{"java.lang.String", "char", "java.lang.String", "java.lang.String", "java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"22030-03-30T25:61:61", ",", "PRESERVE_BLOCK", "nukl", "?", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(",22030-03-30T25:61:61,", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:10>", "true"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:13>", "true"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"I", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/I/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"i", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"i\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"1.1234567"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.1234567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"H"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("H", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"a,b,c"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a,b,c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"START_OF_EXPR"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"START_OF_EXPR\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"java.lang.String"}, new String[]{"1e10"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addExpr", "com.google.javascript.rhino.Node,int", "<sample:6>", "-55"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"1L"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/1L/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "isSimpleNumber", new String[]{"java.lang.String"}, new String[]{"2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "getSimpleNumber", new String[]{"java.lang.String"}, new String[]{"0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:10>", "<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "java.lang.String", "return"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addExpr", "com.google.javascript.rhino.Node,int", "<sample:7>", "55"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:13>", "false", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:13>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:1>", "<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.CodeGenerator$Context", "<null>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addArrayList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:11>"}, false, 11, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:12>", "false", "<sample:11>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"TITLE"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TITLE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:2>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", "com.google.javascript.rhino.Node", "<sample:2>"}, {"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:11>", "false", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "getSimpleNumber", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"I"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("I", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"1.1234567890123456"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.1234567890123456", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"2147483648\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFF"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"0xFFFFFFFF\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{")"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\")\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"TITLE", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/TITLE/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"0xFFFFFFFF", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/0xFFFFFFFF/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", new String[]{"com.google.javascript.rhino.Node", "int", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<null>", "-2147483648", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"Hello, World"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"Hello, World\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"java.lang.String"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"1.12345678901234567"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"1.12345678901234567\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"finally"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("finally", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", new String[]{"com.google.javascript.rhino.Node", "int", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:11>", "0", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"START_OF_EXPR"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("START_OF_EXPR", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"0xFFFFF4FFF"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"0xFFFFF4FFF\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"0xFFFFF4FF"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"0xFFFFF4FF\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "tagAsStrict", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", "com.google.javascript.rhino.Node,int,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:11>", "0", "<sample:4>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:13>", "false"}, false, 13, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:2>", "<sample:0>"}, {"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:5>", "false", "<sample:3>"}, {"com.google.javascript.jscomp.CodeGenerator", "addArrayList", "com.google.javascript.rhino.Node", "<sample:10>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:12>", "false"}, false, 13, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:2>", "<sample:0>"}, {"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:5>", "false", "<sample:3>"}, {"com.google.javascript.jscomp.CodeGenerator", "addArrayList", "com.google.javascript.rhino.Node", "<sample:10>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:12>", "true"}, false, 13, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:2>", "<sample:0>"}, {"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:5>", "false", "<sample:2>"}, {"com.google.javascript.jscomp.CodeGenerator", "addArrayList", "com.google.javascript.rhino.Node", "<sample:17>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:5>", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:5>", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"?", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"?\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"??", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"??\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"+1", "<null>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"+1\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{",1", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\",1\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"1.5", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"1.5\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"1.5--1", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"1.5--1\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"Hello, World", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"Hello, World\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"Hello, Xorld", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"Hello, Xorld\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", new String[]{"com.google.javascript.rhino.Node", "int", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:7>", "31", "<sample:1>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean", "<sample:11>", "true"}, {"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node", "<sample:10>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:20>", "true"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"++1", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/++1/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"++1catcch(", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/++1catcch(/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"5.", "<null>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/5./", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"", "<null>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("//", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"-1.5", "<null>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/-1.5/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"-1)5", "<null>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/-1)5/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"-1)55", "<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/-1)55/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"D-1)55", "<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/D-1)55/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 8, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", "com.google.javascript.rhino.Node", "<sample:12>"}, {"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean", "<sample:0>", "true"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 8, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean", "<sample:0>", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:1>"}, false, 8, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean", "<sample:0>", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"java.lang.String"}, new String[]{"010"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:4>", "true", "<sample:4>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:3>", "true", "<sample:5>"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"I_"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("I_", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"I_\r"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("I_\r", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"H_\r"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("H_\r", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"H_\r2020-02-30T25:61:61"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("H_\r2020-02-30T25:61:61", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"12345667890123R5678901234567890"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12345667890123R5678901234567890", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"STATEMENNT"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("STATEMENNT", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node", "<sample:6>"}, {"com.google.javascript.jscomp.CodeGenerator", "addArrayList", "com.google.javascript.rhino.Node", "<sample:17>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:13>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node", "<sample:3>"}, {"com.google.javascript.jscomp.CodeGenerator", "addArrayList", "com.google.javascript.rhino.Node", "<sample:20>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"("}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/(/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"(("}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/((/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"(V"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/(V/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("//", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"1.1134567890123456"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/1.1134567890123456/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:1>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addCaseBody", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:13>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:7>", "true", "<sample:2>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", new String[]{"com.google.javascript.rhino.Node", "int", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:10>", "10", "<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addCaseBody", "com.google.javascript.rhino.Node", "<sample:3>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:3>", "false"}, false, 4, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", "com.google.javascript.rhino.Node,int,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:3>", "-25", "<sample:5>"}, {"com.google.javascript.jscomp.CodeGenerator", "addArrayList", "com.google.javascript.rhino.Node", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", new String[]{"com.google.javascript.rhino.Node", "int", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:15>", "-55", "<sample:1>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<sample:11>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"re\r.e"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/re\\r.e/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "isSimpleNumber", new String[]{"java.lang.String"}, new String[]{">T6IT2LTHHR1.1234567790123456"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "getSimpleNumber", new String[]{"java.lang.String"}, new String[]{"11"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("11.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"1.1234567890123456"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"1.1234567890123456\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"Title"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"Title\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:3>", "<sample:6>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"12.5e300"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"12.5e300\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:12>", "<sample:0>"}, false, 10, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<sample:0>"}, {"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:13>", "false", "<sample:4>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:13>", "false", "<sample:0>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:13>", "false", "<sample:9>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node", "<sample:3>"}, {"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<sample:15>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:15>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:16>"}, false, 8, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"qee62246"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("qee62246", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"pee62246"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("pee62246", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"ppee62246"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ppee62246", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"ppee62246BEFORE_DANGLING_ELSE"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ppee62246BEFORE_DANGLING_ELSE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:17>", "false", "<sample:7>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addExpr", "com.google.javascript.rhino.Node,int", "<sample:0>", "2"}, {"com.google.javascript.jscomp.CodeGenerator", "addArrayList", "com.google.javascript.rhino.Node", "<sample:0>"}, {"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node", "<sample:12>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:17>", "true", "<sample:11>"}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"12:30:45", "<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/12:30:45/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "strEscape", new String[]{"java.lang.String", "char", "java.lang.String", "java.lang.String", "java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"10.5d1.5e300", "3", "BEFORE_DANGLING_ELSB1.12345678901234567", "re\r.e", "III", "<empty>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("310.5d1.5e3003", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "strEscape", new String[]{"java.lang.String", "char", "java.lang.String", "java.lang.String", "java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"10'.5d1.5e300", "3", "BEFORE_DANGLING_ELSB1.12345678901234567", "re\r.e", "III", "<empty>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("310re\r.e.5d1.5e3003", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"re\r.e", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"re\\r.e\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"re\r/e", "<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"re\\r/e\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"re\r//e", "<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"re\\r//e\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"re//e", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"re//e\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "getSimpleNumber", new String[]{"java.lang.String"}, new String[]{"010"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("10.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "getSimpleNumber", new String[]{"java.lang.String"}, new String[]{"2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.147483648E9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "getSimpleNumber", new String[]{"java.lang.String"}, new String[]{"21447483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.1447483648E10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "getSimpleNumber", new String[]{"java.lang.String"}, new String[]{"2144748358"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.144748358E9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "getSimpleNumber", new String[]{"java.lang.String"}, new String[]{"2144748358"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.144748358E9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "getSimpleNumber", new String[]{"java.lang.String"}, new String[]{"214748358"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.14748358E8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addCaseBody", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:1>", "false", "<sample:1>"}, {"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<sample:10>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addCaseBody", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:8>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node", "<sample:2>"}, {"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<sample:10>"}, {"com.google.javascript.jscomp.CodeGenerator", "addExpr", "com.google.javascript.rhino.Node,int", "<sample:13>", "2147450879"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addCaseBody", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<sample:10>"}, {"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean", "<sample:18>", "false"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addCaseBody", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false, 11, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<sample:17>"}, {"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean", "<sample:12>", "false"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addCaseBody", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, false, 11, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<sample:17>"}, {"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean", "<sample:12>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addCaseBody", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false, 11, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<sample:17>"}, {"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean", "<sample:12>", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addCaseBody", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, false, 11, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<sample:19>"}, {"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean", "<sample:12>", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addCaseBody", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 11, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", "com.google.javascript.rhino.Node,int,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:10>", "25", "<sample:2>"}, {"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:4>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addCaseBody", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, false, 11, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", "com.google.javascript.rhino.Node,int,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:10>", "79", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addCaseBody", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 11, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", "com.google.javascript.rhino.Node,int,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:10>", "87", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addCaseBody", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:16>"}, false, 11, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", "com.google.javascript.rhino.Node,int,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:10>", "87", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:12>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean", "<sample:12>", "false"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addCaseBody", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 11, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addArrayList", "com.google.javascript.rhino.Node", "<sample:6>"}, {"com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", "com.google.javascript.rhino.Node,int,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:10>", "-2147483647", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addCaseBody", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 13, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addArrayList", "com.google.javascript.rhino.Node", "<sample:6>"}, {"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<sample:21>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<null>", "<sample:5>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"0x1F", "<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/0x1F/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:13>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"((1.5f", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/((1.5f/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{",C.5e.3H0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(",C.5e.3H0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"*1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/*1/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"*t1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/*t1/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"*st1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/*st1/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"0\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"1e10"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"1e10\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"tTry"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/tTry/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"re\r.e"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"re\\r.e\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"re\rl.le"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"re\\rl.le\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"1.5f"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"1.5f\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"1.55f"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"1.55f\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"1e10"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"1e10\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"110"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"110\"", String.valueOf(actual));
 }
}
