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
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:1>", "false"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", new String[]{"com.google.javascript.rhino.Node", "int", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:7>", "1", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"1.1234567890123456"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.1234567890123456", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"\\"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"\\\\\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:13>", "<sample:4>"}, false, 13, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", "com.google.javascript.rhino.Node", "<sample:15>"}, {"com.google.javascript.jscomp.CodeGenerator", "add", "java.lang.String", "PT1H"}, {"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:15>", "false", "<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean", "<sample:2>", "false"}, {"com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", "com.google.javascript.rhino.Node", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addArrayList", "com.google.javascript.rhino.Node", "<sample:12>"}, {"com.google.javascript.jscomp.CodeGenerator", "add", "java.lang.String", "1.12345678901234567"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{">"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/>/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", new String[]{"com.google.javascript.rhino.Node", "int", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:6>", "67108848", "<sample:10>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"'use strict';", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"'use strict';\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"\rdelko,'use strict';"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/\\rdelko,'use strict';/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"\014d\nlljo,", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/\\u000cd\\nlljo,/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"-P.\t;5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"-P.\\t;5\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", new String[]{"com.google.javascript.rhino.Node", "int", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<null>", "2147483647", "<sample:4>"}, false, 11, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addCaseBody", "com.google.javascript.rhino.Node", "<sample:12>"}, {"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node", "<sample:10>"}, {"com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", "com.google.javascript.rhino.Node,int,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:15>", "16744448", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addExpr", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:11>", "2147483647"}, false, 11, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean", "<sample:12>", "false"}, {"com.google.javascript.jscomp.CodeGenerator", "tagAsStrict", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:6>", "true"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", new String[]{"com.google.javascript.rhino.Node", "int", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:1>", "-42", "<sample:1>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", "com.google.javascript.rhino.Node,int,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:5>", "-2147483648", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", new String[]{"com.google.javascript.rhino.Node", "int", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:1>", "-16", "<sample:5>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", new String[]{"com.google.javascript.rhino.Node", "int", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:7>", "-16", "<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addCaseBody", "com.google.javascript.rhino.Node", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", new String[]{"com.google.javascript.rhino.Node", "int", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<null>", "-2147483623", "<null>"}, false, 14, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addCaseBody", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addArrayList", "com.google.javascript.rhino.Node", "<sample:4>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"I"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"I\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"II"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"II\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"yI"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"yI\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"yI1.5d"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"yI1.5d\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"yI.5d"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"yI.5d\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"I.5d"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"I.5d\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"["}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"[\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"]"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"]\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "tagAsStrict", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addExpr", "com.google.javascript.rhino.Node,int", "<sample:7>", "10"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"", "<null>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("//", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"X", "<null>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/X/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"W", "<null>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/W/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"--1", "<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/--1/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"--i1", "<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/--i1/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"I-3", "<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"I-3\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"-3", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"-3\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "strEscape", new String[]{"java.lang.String", "char", "java.lang.String", "java.lang.String", "java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"PT1H", ":", "Title", "0x123456789", ")", "<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(":PT1H:", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "strEscape", new String[]{"java.lang.String", "char", "java.lang.String", "java.lang.String", "java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{")", ":", "Title", "0x123456789", ")", "<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(":):", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "strEscape", new String[]{"java.lang.String", "char", "java.lang.String", "java.lang.String", "java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"(", ":", "Title", "0x123456789", "1.5e300", "<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(":(:", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:1>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addExpr", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:6>", "-2147483648"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "tagAsStrict", ""}, {"com.google.javascript.jscomp.CodeGenerator", "addArrayList", "com.google.javascript.rhino.Node", "<null>"}, {"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean", "<sample:3>", "false"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"throw", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"throw\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"1e10", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"1e10\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"1G10", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"1G10\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"1Gn0", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"1Gn0\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"n1Gm0", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"n1Gm0\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"n1m0", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"n1m0\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:10>", "<sample:4>"}, false, 5, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:4>", "<sample:6>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", "com.google.javascript.rhino.Node", "<sample:15>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:3>", "<sample:2>"}, false, 5, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:2>", "<sample:2>"}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:5>", "<sample:0>"}, false, 15, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", "com.google.javascript.rhino.Node", "<sample:10>"}, {"com.google.javascript.jscomp.CodeGenerator", "addExpr", "com.google.javascript.rhino.Node,int", "<sample:1>", "1"}, {"com.google.javascript.jscomp.CodeGenerator", "tagAsStrict", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:2>", "<sample:0>"}, false, 8, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:19>", "<sample:2>"}, false, 13, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", "com.google.javascript.rhino.Node", "<sample:15>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:2>", "false", "<sample:7>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "java.lang.String", "1E-5a,b,c"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:2>", "false", "<sample:2>"}, false, 17, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:7>", "<sample:2>"}, {"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:6>", "false", "<sample:4>"}, {"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean", "<sample:13>", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:4>", "false", "<sample:0>"}, false, 17, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addCaseBody", "com.google.javascript.rhino.Node", "<sample:5>"}, {"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:10>", "<sample:2>"}, {"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean", "<sample:15>", "false"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addExpr", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:1>", "-2147483648"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"1.12345678901234567"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"1.12345678901234567\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:10>", "true", "<sample:1>"}, false, 13, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addCaseBody", "com.google.javascript.rhino.Node", "<sample:5>"}, {"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:15>", "<sample:7>"}, {"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean", "<null>", "false"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:12>", "true", "<sample:0>"}, false, 14, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:15>", "<sample:7>"}, {"com.google.javascript.jscomp.CodeGenerator", "add", "java.lang.String", ".1"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:10>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", "com.google.javascript.rhino.Node,int,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:2>", "-16", "<sample:5>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:11>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", "com.google.javascript.rhino.Node", "<sample:1>"}, {"com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", "com.google.javascript.rhino.Node,int,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:2>", "-16", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:15>"}, false, 8, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", "com.google.javascript.rhino.Node", "<sample:0>"}, {"com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", "com.google.javascript.rhino.Node,int,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:2>", "16", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 9, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", "com.google.javascript.rhino.Node", "<sample:12>"}, {"com.google.javascript.jscomp.CodeGenerator", "addArrayList", "com.google.javascript.rhino.Node", "<null>"}, {"com.google.javascript.jscomp.CodeGenerator", "addCaseBody", "com.google.javascript.rhino.Node", "<sample:12>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", new String[]{"com.google.javascript.rhino.Node", "int", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:3>", "0", "<sample:1>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "java.lang.String", "]"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, false, 11, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:12>", "true", "<sample:0>"}, {"com.google.javascript.jscomp.CodeGenerator", "addArrayList", "com.google.javascript.rhino.Node", "<sample:12>"}, {"com.google.javascript.jscomp.CodeGenerator", "addCaseBody", "com.google.javascript.rhino.Node", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:9>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:1>", "true", "<sample:0>"}, {"com.google.javascript.jscomp.CodeGenerator", "addArrayList", "com.google.javascript.rhino.Node", "<sample:12>"}, {"com.google.javascript.jscomp.CodeGenerator", "add", "java.lang.String", "1.12345678901234567"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", "com.google.javascript.rhino.Node,int,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:5>", "1", "<sample:7>"}, {"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node", "<sample:11>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 15, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addArrayList", "com.google.javascript.rhino.Node", "<sample:13>"}, {"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:15>", "true", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"java.lang.String"}, new String[]{"try"}, false, 7, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", "com.google.javascript.rhino.Node,int,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:3>", "10", "<sample:6>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:0>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:0>", "false", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{")", "<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/)/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addCaseBody", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:15>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<sample:5>"}, {"com.google.javascript.jscomp.CodeGenerator", "addExpr", "com.google.javascript.rhino.Node,int", "<sample:6>", "0"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"1.5f"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"1.5f\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"return", "<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"return\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addArrayList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addCaseBody", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addExpr", "com.google.javascript.rhino.Node,int", "<sample:7>", "10"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addArrayList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:4>", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addExpr", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:12>", "1"}, false, 1, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "java.lang.String", "PT1H"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:4>", "false", "<sample:2>"}, {"com.google.javascript.jscomp.CodeGenerator", "tagAsStrict", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<null>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "java.lang.String", "2147483648"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"(", "<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/(/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addExpr", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:3>", "2147483647"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "java.lang.String", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:1>", "true"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:6>", "true"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"I", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"I\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:6>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node", "<sample:4>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:6>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addArrayList", "com.google.javascript.rhino.Node", "<sample:4>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:6>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "tagAsStrict", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:6>", "true"}, false, 1, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "tagAsStrict", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", new String[]{"com.google.javascript.rhino.Node", "int", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:6>", "1", "<sample:0>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:4>", "false", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:7>", "<null>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{":", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/:/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:4>", "false", "<sample:4>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:3>", "false", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", new String[]{"com.google.javascript.rhino.Node", "int", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<null>", "2139094527", "<sample:5>"}, false, 14, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", new String[]{"com.google.javascript.rhino.Node", "int", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:6>", "2147483647", "<sample:7>"}, false, 14, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "strEscape", new String[]{"java.lang.String", "char", "java.lang.String", "java.lang.String", "java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"BEFORE_DANGLING_ELSE", "0", "0xFFFFFFFF", "1L", "0x123456789", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0BEFORE_DANGLING_ELSE0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "strEscape", new String[]{"java.lang.String", "char", "java.lang.String", "java.lang.String", "java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"CEFORE_DANGLING_ELSEI", "0", "0xFFFFFFFF", "1L", "0x1234", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0CEFORE_DANGLING_ELSEI0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:3>", "<sample:2>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "java.lang.String", "0xFFFFFFFF"}, {"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<sample:6>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "java.lang.String", "abc"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addCaseBody", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addCaseBody", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, false, 13, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addCaseBody", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:8>"}, false, 13, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addCaseBody", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 11, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addArrayList", "com.google.javascript.rhino.Node", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addArrayList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addArrayList", "com.google.javascript.rhino.Node", "<sample:2>"}, {"com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", "com.google.javascript.rhino.Node", "<sample:3>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addArrayList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", "com.google.javascript.rhino.Node", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"java.lang.String"}, new String[]{".5"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"TITLE"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"TITLE\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"TITLD"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"TITLD\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"TITL+D"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"TITL+D\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"catch("}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"catch(\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"catch(-1.5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"catch(-1.5\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"Tcatch(-1.5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"Tcatch(-1.5\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"var "}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"var \"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"Title"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"Title\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"vr "}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"vr \"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "tagAsStrict", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addExpr", "com.google.javascript.rhino.Node,int", "<sample:7>", "10"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"0x123456789"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/0x123456789/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"catch("}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/catch(/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"datch)"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/datch)/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addExpr", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:5>", "-1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"datch)return"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/datch)return/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"try"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/try/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/5/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"U"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/U/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"5."}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/5./", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"--1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/--1/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"-0.0", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/-0.0/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{".0.0", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/.0.0/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"./.0", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/./.0/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"1.5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"1."}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"1.1.25"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.1.25", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{".1.5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{".f.5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".f.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"Lf.5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Lf.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"Lf5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Lf5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"Kf5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Kf5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"1", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/1/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("//", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"--i1", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/--i1/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"throw", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"throw\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"thrnw", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"thrnw\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"tNrnw", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"tNrnw\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"tNyrnw", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"tNyrnw\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"tVNyrnw", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"tVNyrnw\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"tVNyrow", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"tVNyrow\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"tWNyrow", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"tWNyrow\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"tWNyow", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"tWNyow\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"1.5f", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/1.5f/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"I", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/I/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "strEscape", new String[]{"java.lang.String", "char", "java.lang.String", "java.lang.String", "java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"1.5f", "=", "\\", "1", "OTHER", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("=1.5f=", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "strEscape", new String[]{"java.lang.String", "char", "java.lang.String", "java.lang.String", "java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"1.5f", "<", "\\", "1", "OTHER", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<1.5f<", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "strEscape", new String[]{"java.lang.String", "char", "java.lang.String", "java.lang.String", "java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"1.5", "a", "\\", "1", "OTHER", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a1.5a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addExpr", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:6>", "-2147483648"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "tagAsStrict", ""}, {"com.google.javascript.jscomp.CodeGenerator", "addArrayList", "com.google.javascript.rhino.Node", "<null>"}, {"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean", "<sample:3>", "false"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:10>", "<sample:4>"}, false, 5, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:9>", "<sample:5>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:2>", "<sample:5>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:2>", "<sample:3>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", "com.google.javascript.rhino.Node", "<sample:11>"}, {"com.google.javascript.jscomp.CodeGenerator", "add", "java.lang.String", "null"}, {"com.google.javascript.jscomp.CodeGenerator", "tagAsStrict", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:11>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:11>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:11>", "false", "<null>"}, false, 17, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:7>", "false", "<sample:4>"}, {"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean", "<sample:15>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:13>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:13>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:12>", "false", "<sample:3>"}, false, 13, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addCaseBody", "com.google.javascript.rhino.Node", "<sample:5>"}, {"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:15>", "<sample:8>"}, {"com.google.javascript.jscomp.CodeGenerator", "add", "java.lang.String", "--1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"'use strict';"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/'use strict';/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node", "<sample:11>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:15>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node", "<sample:11>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addExpr", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<null>", "0"}, false, 3, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", "com.google.javascript.rhino.Node,int,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:1>", "-2147483648", "<null>"}, {"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "strEscape", new String[]{"java.lang.String", "char", "java.lang.String", "java.lang.String", "java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"PT1H", "0", "2147483648", "]", "1.1234567890123456", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0PT1H0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:11>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:12>", "<sample:7>"}, {"com.google.javascript.jscomp.CodeGenerator", "add", "java.lang.String", "1.1234567"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "strEscape", new String[]{"java.lang.String", "char", "java.lang.String", "java.lang.String", "java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"catch(", " ", "START_OF_EXPR", "true", "1.1234567", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" catch( ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "strEscape", new String[]{"java.lang.String", "char", "java.lang.String", "java.lang.String", "java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"-1", ":", "123456789012345678901234567890", "]", "1", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(":-1:", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:15>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", new String[]{"com.google.javascript.rhino.Node", "int", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:11>", "0", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:1>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"1.12345678", "<null>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/1.12345678/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"12:30:45"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/12:30:45/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addArrayList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:13>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:10>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:0>", "true", "<sample:2>"}, {"com.google.javascript.jscomp.CodeGenerator", "addExpr", "com.google.javascript.rhino.Node,int", "<sample:2>", "1"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:11>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<sample:0>"}, {"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node", "<sample:2>"}, {"com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", "com.google.javascript.rhino.Node,int,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:11>", "1", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:10>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node", "<sample:2>"}, {"com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", "com.google.javascript.rhino.Node,int,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:11>", "1", "<sample:4>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addCaseBody", "com.google.javascript.rhino.Node", "<sample:15>"}, {"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node", "<sample:2>"}, {"com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", "com.google.javascript.rhino.Node,int,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:11>", "1", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:3>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", "com.google.javascript.rhino.Node", "<sample:10>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<null>", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:15>", "true", "<sample:6>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:11>", "false", "<sample:7>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"java.lang.String"}, new String[]{"20101.5finally"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", "com.google.javascript.rhino.Node,int,com.google.javascript.jscomp.CodeGenerator$Context", "<null>", "-1", "<sample:1>"}, {"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<sample:7>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"thrdowF010"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("thrdowF010", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<null>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addExpr", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:13>", "67108848"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addExpr", "com.google.javascript.rhino.Node,int", "<sample:6>", "1"}, {"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean", "<sample:13>", "false"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"i"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"i\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"2020-02-30T25:61:61\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:11>", "true", "<sample:4>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:1>", "<sample:7>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"S26S,SfTRT._", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"S26S,SfTRT._\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"S26S,SfTRT._2020-02-30T25:61:61", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"S26S,SfTRT._2020-02-30T25:61:61\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"1L", "<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"1L\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:11>", "true"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addExpr", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:15>", "-2147483648"}, false, 13, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:15>", "true", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addArrayList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addArrayList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", "com.google.javascript.rhino.Node", "<sample:15>"}, {"com.google.javascript.jscomp.CodeGenerator", "addArrayList", "com.google.javascript.rhino.Node", "<sample:13>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addExpr", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<null>", "7"}, false, 1, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<sample:15>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addExpr", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<null>", "7"}, false, 1, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", "com.google.javascript.rhino.Node", "<sample:10>"}, {"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addExpr", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:13>", "-1073741824"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "tagAsStrict", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", new String[]{"com.google.javascript.rhino.Node", "int", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:15>", "22", "<sample:2>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addArrayList", "com.google.javascript.rhino.Node", "<sample:12>"}, {"com.google.javascript.jscomp.CodeGenerator", "addCaseBody", "com.google.javascript.rhino.Node", "<sample:4>"}, {"com.google.javascript.jscomp.CodeGenerator", "addArrayList", "com.google.javascript.rhino.Node", "<sample:14>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", new String[]{"com.google.javascript.rhino.Node", "int", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:6>", "22", "<sample:1>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addCaseBody", "com.google.javascript.rhino.Node", "<sample:4>"}, {"com.google.javascript.jscomp.CodeGenerator", "addArrayList", "com.google.javascript.rhino.Node", "<sample:13>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addArrayList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:10>", "true", "<sample:4>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addArrayList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addArrayList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:11>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", "com.google.javascript.rhino.Node,int,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:5>", "10", "<sample:1>"}, {"com.google.javascript.jscomp.CodeGenerator", "addArrayList", "com.google.javascript.rhino.Node", "<sample:13>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"5(.SiPtle"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5(.SiPtle", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"5).SiPtle"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5).SiPtle", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"6).SiPtle"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("6).SiPtle", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"6).Si\nPt_e"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("6).Si\nPt_e", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"1.5d"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5d", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"java.lang.String"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFF\rF"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "tagAsStrict", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", "com.google.javascript.rhino.Node", "<sample:15>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:2>", "true"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:6>", "true"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:11>", "true"}, false, 14, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:12>"}, false, 15, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:13>"}, false, 15, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:2>", "false", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"TITLE", "<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/TITLE/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addArrayList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:13>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:1>", "false", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"Hello, World", "<null>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"Hello, World\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addArrayList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:13>"}, false, 13, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "java.lang.String", "0xFFFFFFFF"}, {"com.google.javascript.jscomp.CodeGenerator", "add", "java.lang.String", "123456789012345678901234567890"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "strEscape", new String[]{"java.lang.String", "char", "java.lang.String", "java.lang.String", "java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"--1", "=", "<null>", "BEFORE_DANGLING_ELSE", "1", "<null>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("=--1=", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"+1", "<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"+1\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:13>", "true"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", new String[]{"com.google.javascript.rhino.Node", "int", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:11>", "-1", "<sample:2>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"a"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/a/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"I"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("I", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "strEscape", new String[]{"java.lang.String", "char", "java.lang.String", "java.lang.String", "java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"STATEMENT", "[", "OTHER", "0x1F", "2147483648", "<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[STATEMENT[", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"", "<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"y.5"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("y.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"y.4"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("y.4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"Hddlko,<World"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/Hddlko,<World/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"Hddlko,<Wosld"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/Hddlko,<Wosld/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"Hddlko,"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/Hddlko,/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"ddlko,"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/ddlko,/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"Xdelko,"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/Xdelko,/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"\rdelko,"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/\\rdelko,/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"\rdelko,'use ttrict';"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/\\rdelko,'use ttrict';/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:15>", "<sample:8>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"true"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"true\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addCaseBody", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:13>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addCaseBody", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, false, 11, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"1.1234567"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"1.1234567\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"l-,1Hello, World", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"l-,1Hello, World\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "jsString", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"\rd\nljo,", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"\\rd\\nljo,\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:15>"}, false, 11, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:5>", "<sample:2>"}, {"com.google.javascript.jscomp.CodeGenerator", "tagAsStrict", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"Hello, World"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/Hello, World/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "strEscape", new String[]{"java.lang.String", "char", "java.lang.String", "java.lang.String", "java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"throw", "\037", "TTME", "2147483648", "1e10", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\037throw\037", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "strEscape", new String[]{"java.lang.String", "char", "java.lang.String", "java.lang.String", "java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"throw", "6", "uO", "2d", "1e00", "<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("6throw6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "strEscape", new String[]{"java.lang.String", "char", "java.lang.String", "java.lang.String", "java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"throw", "i", "uO", "2d", "1e00", "<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ithrowi", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "strEscape", new String[]{"java.lang.String", "char", "java.lang.String", "java.lang.String", "java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"uhrow", "i", "uO", "2d", "1e00", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("iuhrowi", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"START_OF_EXPR"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"START_OF_EXPR\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"START_OF_hXPR"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"START_OF_hXPR\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "strEscape", new String[]{"java.lang.String", "char", "java.lang.String", "java.lang.String", "java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"2020-02-30T25:61:61", "=", "1.255", "'use3strict';", "Hello, World", "<empty>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("=2020-02-30T25:61:61=", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "strEscape", new String[]{"java.lang.String", "char", "java.lang.String", "java.lang.String", "java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"202\r0-02-30T25:61:61", "=", "1.255", "'use3strict';", "Hello+ World", "<empty>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("=202\\r0-02-30T25:61:61=", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "strEscape", new String[]{"java.lang.String", "char", "java.lang.String", "java.lang.String", "java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"202.\r0-02-30T25:61:61", "=", "1.255", "'se3strict';", "Hello+ World", "<empty>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("=202.\\r0-02-30T25:61:61=", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "strEscape", new String[]{"java.lang.String", "char", "java.lang.String", "java.lang.String", "java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{" ", "E", "123456789012345678901234567890", "I", "1.5", "<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("E E", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "strEscape", new String[]{"java.lang.String", "char", "java.lang.String", "java.lang.String", "java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{" 2020-01-01", "E", "123456789012345678901134567890", "I", "1.5", "<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("E 2020-01-01E", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "strEscape", new String[]{"java.lang.String", "char", "java.lang.String", "java.lang.String", "java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"1.25", "E", "123456789012345678901134567890", "I", "1.5", "<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("E1.25E", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "strEscape", new String[]{"java.lang.String", "char", "java.lang.String", "java.lang.String", "java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"1X25", "E", "123456789012345678901134567890", "I", "1.5", "<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("E1X25E", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"0.12344678901234567", "<sample:10>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/0.12344678901234567/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "strEscape", new String[]{"java.lang.String", "char", "java.lang.String", "java.lang.String", "java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"0", ".", "abc", "I", "123456789012345678901234567890", "<null>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".0.", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addLeftExpr", new String[]{"com.google.javascript.rhino.Node", "int", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:4>", "-16", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", "com.google.javascript.rhino.Node", "<sample:3>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"1E-5", "<empty>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/1E-5/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/123456789012345678901234567890/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "strEscape", new String[]{"java.lang.String", "char", "java.lang.String", "java.lang.String", "java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"i", "}", "PT1H", "2020-02-30T25:61:61", "2020-02-30T25:61:61", "<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("}i}", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"12:30:45", "<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/12:30:45/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"TITLD", "<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/TITLD/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"UITLD", "<null>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/UITLD/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"UITL", "<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/UITL/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"--1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"--1\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"--1+1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"--1+1\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"-"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"-\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"N"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"N\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"O"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"O\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"abc", "<empty>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/abc/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false, 9, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:3>", "<sample:3>"}, {"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"STALTTfEMENT", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/STALTTfEMENT/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"STBLTTfEMENT", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/STBLTTfEMENT/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"STBLTDfEMENT", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/STBLTDfEMENT/", String.valueOf(actual));
 }
}
