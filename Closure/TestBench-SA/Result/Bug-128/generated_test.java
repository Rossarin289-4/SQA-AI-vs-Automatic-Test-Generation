package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"java.lang.String"}, new String[]{","}, false, 1, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<null>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"java.lang.String"}, new String[]{"-,123456789012345678901234567890"}, false, 1, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<null>"}, {"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:6>", "true", "<sample:7>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"IN_F>OR_INIT_CLAUSE", "<null>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/IN_F>OR_INIT_CLAUSE/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "getSimpleNumber", new String[]{"java.lang.String"}, new String[]{"0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "getSimpleNumber", new String[]{"java.lang.String"}, new String[]{"I"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "getSimpleNumber", new String[]{"java.lang.String"}, new String[]{"/"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "getSimpleNumber", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 13, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<sample:0>"}, {"com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", "java.lang.String", "1"}, {"com.google.javascript.jscomp.CodeGenerator", "tagAsStrict", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "forCostEstimation", new String[]{"com.google.javascript.jscomp.CodeConsumer"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.CodeGenerator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{".:03X&()"}, false, 12, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addCaseBody", "com.google.javascript.rhino.Node", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/.:03X&()/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"="}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "regexpEscape", "java.lang.String", "abt"}, {"com.google.javascript.jscomp.CodeGenerator", "addCaseBody", "com.google.javascript.rhino.Node", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/=/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{">", "<empty>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/>/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:7>", "false", "<sample:7>"}, false, 8, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<sample:13>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:12>", "false", "<sample:1>"}, false, 13, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addArrayList", "com.google.javascript.rhino.Node", "<sample:11>"}, {"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<sample:12>"}, {"com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", "com.google.javascript.rhino.Node", "<sample:6>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:15>", "true", "<sample:2>"}, false, 13, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<sample:12>"}, {"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:6>", "true", "<sample:4>"}, {"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:14>", "<sample:9>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:15>", "true", "<sample:10>"}, false, 14, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", "com.google.javascript.rhino.Node", "<sample:16>"}, {"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean", "<sample:1>", "true"}, {"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean", "<sample:12>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addArrayList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:20>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean", "<sample:7>", "false"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addCaseBody", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:22>"}, false, 14, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", "com.google.javascript.rhino.Node", "<sample:18>"}, {"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node", "<sample:8>"}, {"com.google.javascript.jscomp.CodeGenerator", "addArrayList", "com.google.javascript.rhino.Node", "<sample:12>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addCaseBody", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:24>"}, false, 14, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", "com.google.javascript.rhino.Node", "<sample:18>"}, {"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node", "<sample:8>"}, {"com.google.javascript.jscomp.CodeGenerator", "addArrayList", "com.google.javascript.rhino.Node", "<sample:12>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addCaseBody", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:26>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node", "<sample:15>"}, {"com.google.javascript.jscomp.CodeGenerator", "addCaseBody", "com.google.javascript.rhino.Node", "<sample:14>"}, {"com.google.javascript.jscomp.CodeGenerator", "addArrayList", "com.google.javascript.rhino.Node", "<sample:12>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addCaseBody", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:28>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node", "<sample:15>"}, {"com.google.javascript.jscomp.CodeGenerator", "addCaseBody", "com.google.javascript.rhino.Node", "<sample:14>"}, {"com.google.javascript.jscomp.CodeGenerator", "addArrayList", "com.google.javascript.rhino.Node", "<sample:12>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "getSimpleNumber", new String[]{"java.lang.String"}, new String[]{"010"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"java.lang.String"}, new String[]{"1/5fxFFFGFFFF"}, false, 6, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", "java.lang.String", ".:03X&()"}, {"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean", "<sample:11>", "false"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", "java.lang.String", "="}, {"com.google.javascript.jscomp.CodeGenerator", "addArrayList", "com.google.javascript.rhino.Node", "<sample:24>"}, {"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:20>", "false", "<sample:0>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "getSimpleNumber", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"'usd!rstricCt'<"}, false, 1, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", "com.google.javascript.rhino.Node", "<sample:17>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/'usd!rstricCt'</", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"2.12345588"}, false, 6, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node", "<sample:10>"}, {"com.google.javascript.jscomp.CodeGenerator", "regexpEscape", "java.lang.String", "\r\ntrue"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/2.12345588/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"\\", "<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean", "<sample:10>", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/\\/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"\r\013true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node", "<sample:24>"}, {"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean", "<sample:26>", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"\\r\\x0Btrue\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "getSimpleNumber", new String[]{"java.lang.String"}, new String[]{"11234567890123456"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"java.lang.String"}, new String[]{"0x1F"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"java.lang.String"}, new String[]{"-,123456E89012345678901234567890"}, false, 1, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<null>"}, {"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:6>", "true", "<sample:7>"}, {"com.google.javascript.jscomp.CodeGenerator", "regexpEscape", "java.lang.String", "a"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:4>", "false", "<sample:0>"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:3>", "false", "<sample:0>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"IN", "<empty>"}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/IN/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"I", "<sample:2>"}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/I/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"II", "<sample:3>"}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/II/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"IIfinally", "<empty>"}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/IIfinally/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:2>", "true", "<sample:6>"}, {"com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", "com.google.javascript.rhino.Node", "<sample:1>"}, {"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:0>", "true", "<sample:4>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:2>", "true", "<sample:6>"}, {"com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", "com.google.javascript.rhino.Node", "<sample:1>"}, {"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:0>", "true", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:2>", "true", "<sample:6>"}, {"com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", "com.google.javascript.rhino.Node", "<sample:5>"}, {"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:0>", "true", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"BEFORE_DANGLING_ELSD", "<sample:2>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", "java.lang.String", "1.5f"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/BEFORE_DANGLING_ELSD/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:8>", "false"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:4>", "false"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:4>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "tagAsStrict", ""}, {"com.google.javascript.jscomp.CodeGenerator", "addArrayList", "com.google.javascript.rhino.Node", "<sample:6>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:4>", "true"}, false, 2, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "regexpEscape", "java.lang.String,java.nio.charset.CharsetEncoder", "1E-5", "<sample:3>"}, {"com.google.javascript.jscomp.CodeGenerator", "addArrayList", "com.google.javascript.rhino.Node", "<sample:0>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:3>", "true"}, false, 1, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "regexpEscape", "java.lang.String,java.nio.charset.CharsetEncoder", "1E-5", "<sample:2>"}, {"com.google.javascript.jscomp.CodeGenerator", "addArrayList", "com.google.javascript.rhino.Node", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addArrayList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:7>", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "getSimpleNumber", new String[]{"java.lang.String"}, new String[]{"abrc"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "getSimpleNumber", new String[]{"java.lang.String"}, new String[]{")("}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "isSimpleNumber", new String[]{"java.lang.String"}, new String[]{")"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "tagAsStrict", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<sample:6>"}, {"com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", "java.lang.String", "var "}, {"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addCaseBody", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "regexpEscape", "java.lang.String", "true"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addCaseBody", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, false, 10, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean", "<sample:3>", "true"}, {"com.google.javascript.jscomp.CodeGenerator", "regexpEscape", "java.lang.String", "tsue"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addCaseBody", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false, 11, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean", "<sample:3>", "true"}, {"com.google.javascript.jscomp.CodeGenerator", "regexpEscape", "java.lang.String", "tsuethrow"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addCaseBody", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "regexpEscape", "java.lang.String", "tsuethrow"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addCaseBody", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 11, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "regexpEscape", "java.lang.String", "tsuethrow"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:5>", "false", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node", "<sample:0>"}, {"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:5>", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{".501-X'1"}, false, 12, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node", "<sample:7>"}, {"com.google.javascript.jscomp.CodeGenerator", "addCaseBody", "com.google.javascript.rhino.Node", "<sample:2>"}, {"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:6>", "true", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/.501-X'1/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{".:02-X'1i"}, false, 12, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addCaseBody", "com.google.javascript.rhino.Node", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/.:02-X'1i/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{".:03-X'1i"}, false, 12, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addCaseBody", "com.google.javascript.rhino.Node", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/.:03-X'1i/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{".:03X'1)"}, false, 12, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addCaseBody", "com.google.javascript.rhino.Node", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/.:03X'1)/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{".:03X'()"}, false, 12, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addCaseBody", "com.google.javascript.rhino.Node", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/.:03X'()/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{".:03Y&()"}, false, 12, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addCaseBody", "com.google.javascript.rhino.Node", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/.:03Y&()/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{".:03Y&()"}, false, 12, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addCaseBody", "com.google.javascript.rhino.Node", "<sample:2>"}, {"com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", "java.lang.String", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/.:03Y&()/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"a,b,c"}, false, 12, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/a,b,c/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"+1"}, false, 12, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/+1/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"+c,-S'"}, false, 11, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/+c,-S'/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"1y2234567O9M"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "regexpEscape", "java.lang.String,java.nio.charset.CharsetEncoder", "0x1Fcatch(", "<empty>"}, {"com.google.javascript.jscomp.CodeGenerator", "addCaseBody", "com.google.javascript.rhino.Node", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/1y2234567O9M/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"1X2234567O9M"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "regexpEscape", "java.lang.String,java.nio.charset.CharsetEncoder", "0x1Fcatch(", "<empty>"}, {"com.google.javascript.jscomp.CodeGenerator", "addCaseBody", "com.google.javascript.rhino.Node", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/1X2234567O9M/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"-XHX+y"}, false, 11, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/-XHX+y/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"-XHX+y1.25"}, false, 11, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node", "<sample:7>"}, {"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:4>", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/-XHX+y1.25/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"a,b,c", "<empty>"}, false, 8, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/a,b,c/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"-,123456E89012345678901234567890", "<empty>"}, false, 8, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/-,123456E89012345678901234567890/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"-,123457E89012345678901234567890", "<empty>"}, false, 8, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/-,123457E89012345678901234567890/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"?", "<empty>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/?/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:2>", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node", "<null>"}, {"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:3>", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addArrayList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addArrayList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 13, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addArrayList", "com.google.javascript.rhino.Node", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"PRESERVE_BLOCK"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PRESERVE_BLOCK", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addArrayList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addArrayList", "com.google.javascript.rhino.Node", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addArrayList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:11>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addArrayList", "com.google.javascript.rhino.Node", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:6>", "true", "<sample:6>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<sample:15>"}, {"com.google.javascript.jscomp.CodeGenerator", "tagAsStrict", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:2>", "true", "<sample:4>"}, false, 17, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<sample:15>"}, {"com.google.javascript.jscomp.CodeGenerator", "tagAsStrict", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:15>", "false", "<sample:4>"}, false, 13, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<sample:12>"}, {"com.google.javascript.jscomp.CodeGenerator", "tagAsStrict", ""}, {"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean,com.google.javascript.jscomp.CodeGenerator$Context", "<null>", "false", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:3>", "false"}, false, 6, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", "java.lang.String", "1.1234567"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:16>", "false", "<sample:4>"}, false, 13, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<sample:12>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"BEFORE_DANGLING_ELSE"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/BEFORE_DANGLING_ELSE/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:14>", "true", "<sample:3>"}, false, 13, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<sample:12>"}, {"com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", "java.lang.String", "9qy"}, {"com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", "com.google.javascript.rhino.Node", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:15>", "false", "<sample:2>"}, false, 13, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addArrayList", "com.google.javascript.rhino.Node", "<sample:11>"}, {"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<sample:12>"}, {"com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", "com.google.javascript.rhino.Node", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:0>", "false", "<null>"}, false, 14, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<sample:12>"}, {"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:6>", "false", "<sample:4>"}, {"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:14>", "<sample:9>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:6>", "false", "<null>"}, false, 14, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<sample:12>"}, {"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:6>", "false", "<sample:4>"}, {"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:14>", "<sample:1>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{""}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("//", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:6>", "<sample:5>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "getSimpleNumber", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "tagAsStrict", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addArrayList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:1>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:16>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node", "<sample:1>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"java.lang.String"}, new String[]{"1.1234567890123456"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", "com.google.javascript.rhino.Node", "<sample:3>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:20>", "false", "<sample:2>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:4>", "true", "<sample:10>"}, {"com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", "com.google.javascript.rhino.Node", "<sample:14>"}, {"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean", "<sample:12>", "true"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 14, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node", "<sample:0>"}, {"com.google.javascript.jscomp.CodeGenerator", "add", "java.lang.String", ".5"}, {"com.google.javascript.jscomp.CodeGenerator", "tagAsStrict", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:11>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addCaseBody", "com.google.javascript.rhino.Node", "<sample:14>"}, {"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node", "<null>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"java.lang.String"}, new String[]{"-,123456E89012345678901234567890"}, false, 1, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<null>"}, {"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:6>", "true", "<sample:8>"}, {"com.google.javascript.jscomp.CodeGenerator", "regexpEscape", "java.lang.String", "aSTATEMENT"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:4>", "true", "<sample:0>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:3>", "true", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:2>", "false", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"IN_FOR_INIT_CLAUSE", "<null>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/IN_FOR_INIT_CLAUSE/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:3>", "<sample:1>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "tagAsStrict", ""}, {"com.google.javascript.jscomp.CodeGenerator", "regexpEscape", "java.lang.String,java.nio.charset.CharsetEncoder", "0x123456789", "<empty>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"INN_F>OR_INIT_CLAUSE", "<null>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/INN_F>OR_INIT_CLAUSE/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"INN_F>OR_INIT_CLAUSE", "<empty>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addArrayList", "com.google.javascript.rhino.Node", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/INN_F>OR_INIT_CLAUSE/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"INN_F>OR_SNIT_CLAUSE", "<empty>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/INN_F>OR_SNIT_CLAUSE/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"IN", "<empty>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/IN/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", "com.google.javascript.rhino.Node", "<sample:5>"}, {"com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", "java.lang.String", "0x1F"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", "com.google.javascript.rhino.Node", "<sample:5>"}, {"com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", "java.lang.String", "0x1F"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", "com.google.javascript.rhino.Node", "<sample:5>"}, {"com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", "java.lang.String", "0x1Fcatch("}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addCaseBody", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addCaseBody", "com.google.javascript.rhino.Node", "<sample:5>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addArrayList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "tagAsStrict", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addArrayList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"INN_F>OR_INIT_CLAUSE"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addArrayList", "com.google.javascript.rhino.Node", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/INN_F>OR_INIT_CLAUSE/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"010"}, false, 15, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addArrayList", "com.google.javascript.rhino.Node", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/010/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"BEFORE_DANGLING_ELSE", "<sample:0>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", "java.lang.String", "1.5f"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/BEFORE_DANGLING_ELSE/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"1.5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"1/5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1/5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"2/5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2/5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"1/"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:5>", "false", "<sample:4>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean", "<sample:6>", "true"}, {"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<sample:7>"}, {"com.google.javascript.jscomp.CodeGenerator", "add", "java.lang.String", "1.25"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "tagAsStrict", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "tagAsStrict", ""}, {"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:3>", "false", "<sample:5>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:5>", "false"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:0>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"1.5e300"}, false, 3, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<sample:2>"}, {"com.google.javascript.jscomp.CodeGenerator", "tagAsStrict", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/1.5e300/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "regexpEscape", "java.lang.String,java.nio.charset.CharsetEncoder", "<null>", "<sample:2>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:0>", "true", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", "java.lang.String", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"START_OF_EXPR"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/START_OF_EXPR/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:1>", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addArrayList", "com.google.javascript.rhino.Node", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:4>", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "regexpEscape", "java.lang.String,java.nio.charset.CharsetEncoder", "1E-5", "<sample:1>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "tagAsStrict", ""}, {"com.google.javascript.jscomp.CodeGenerator", "addArrayList", "com.google.javascript.rhino.Node", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"BEFORE_DANGLING_ELSE"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("BEFORE_DANGLING_ELSE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"I", "<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/I/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"finally", "<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/finally/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"null"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "regexpEscape", "java.lang.String", "i"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"null\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:6>", "false", "<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:5>", "<sample:5>"}, {"com.google.javascript.jscomp.CodeGenerator", "regexpEscape", "java.lang.String", "a,b,c"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "isSimpleNumber", new String[]{"java.lang.String"}, new String[]{"]"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "regexpEscape", "java.lang.String,java.nio.charset.CharsetEncoder", "--1", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/true/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"?", "<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/?/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"finally"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("finally", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"finaly"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("finaly", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"eioaly"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("eioaly", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"eioal"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("eioal", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/123456789012345678901234567890/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 11, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<sample:6>"}, {"com.google.javascript.jscomp.CodeGenerator", "regexpEscape", "java.lang.String", "1-35"}, {"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addCaseBody", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false, 11, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean", "<sample:3>", "true"}, {"com.google.javascript.jscomp.CodeGenerator", "regexpEscape", "java.lang.String", "tsue"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "getSimpleNumber", new String[]{"java.lang.String"}, new String[]{"2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.147483648E9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "getSimpleNumber", new String[]{"java.lang.String"}, new String[]{"2147483"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2147483.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "getSimpleNumber", new String[]{"java.lang.String"}, new String[]{"2117483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.117483648E9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/2020-02-30T25:61:61/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"2020"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/2020/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{".511-X'1"}, false, 13, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node", "<sample:4>"}, {"com.google.javascript.jscomp.CodeGenerator", "addCaseBody", "com.google.javascript.rhino.Node", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/.511-X'1/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"TITLE"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"TITLE\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"0x1Fcatch("}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"0x1Fcatch(\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"0x1FNcatch("}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"0x1FNcatch(\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"0x1FNcatch(START_OF_EXPR"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"0x1FNcatch(START_OF_EXPR\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"0x1FNcdatch(START_OF_EXPR"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"0x1FNcdatch(START_OF_EXPR\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"0x1FNcdatc"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"0x1FNcdatc\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"0y1FNcdatc"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"0y1FNcdatc\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addArrayList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:1>", "true", "<sample:0>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<sample:12>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:6>", "false", "<sample:7>"}, false, 8, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<sample:15>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:2>", "false", "<sample:4>"}, false, 17, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<sample:14>"}, {"com.google.javascript.jscomp.CodeGenerator", "tagAsStrict", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:0>", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:14>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node", "<null>"}, {"com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", "java.lang.String", ".5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "isSimpleNumber", new String[]{"java.lang.String"}, new String[]{"0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:11>"}, false, 11, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addCaseBody", "com.google.javascript.rhino.Node", "<sample:14>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"<null>", "<sample:1>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "java.lang.String", "12:30:45"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"java.lang.String"}, new String[]{"OTHER"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean", "<sample:11>", "true"}, {"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:4>", "false", "<sample:10>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:10>", "<sample:7>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<sample:1>"}, {"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node", "<sample:12>"}, {"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:20>", "false", "<sample:10>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:0>", "<sample:1>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<sample:1>"}, {"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:20>", "false", "<sample:10>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<null>", "<sample:9>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:20>", "false", "<sample:10>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"1.51/5START_OF_EXPR"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"1.51/5START_OF_EXPR\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "tagAsStrict", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<null>", "<sample:3>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "regexpEscape", "java.lang.String", "BEORE_DANNGLI"}, {"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:2>", "<sample:9>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "forCostEstimation", new String[]{"com.google.javascript.jscomp.CodeConsumer"}, new String[]{"<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.CodeGenerator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addArrayList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:15>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "java.lang.String", "var "}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addArrayList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:18>"}, false, 11, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"12:30R45"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/12:30R45/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"12:30R45"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/12:30R45/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"BEFORE_DANGLING_ELSE"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"BEFORE_DANGLING_ELSE\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "isSimpleNumber", new String[]{"java.lang.String"}, new String[]{"-,123456E89012345678901234567890"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "tagAsStrict", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:15>", "<null>"}, {"com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", "com.google.javascript.rhino.Node", "<sample:6>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addCaseBody", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:18>"}, false, 11, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:10>", "true", "<sample:3>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addCaseBody", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 11, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:10>", "true", "<sample:2>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addCaseBody", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false, 11, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:10>", "true", "<sample:2>"}, {"com.google.javascript.jscomp.CodeGenerator", "addCaseBody", "com.google.javascript.rhino.Node", "<sample:1>"}, {"com.google.javascript.jscomp.CodeGenerator", "addCaseBody", "com.google.javascript.rhino.Node", "<sample:12>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addCaseBody", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:15>"}, false, 11, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "java.lang.String", "--1"}, {"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:10>", "false", "<sample:0>"}, {"com.google.javascript.jscomp.CodeGenerator", "addCaseBody", "com.google.javascript.rhino.Node", "<sample:12>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"1.5d"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/1.5d/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addCaseBody", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", "com.google.javascript.rhino.Node", "<sample:14>"}, {"com.google.javascript.jscomp.CodeGenerator", "tagAsStrict", ""}, {"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node", "<sample:8>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"1.12345678", "<sample:3>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/1.12345678/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "forCostEstimation", new String[]{"com.google.javascript.jscomp.CodeConsumer"}, new String[]{"<null>"}, true), new String[][]{{"tagAsStrict", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addCaseBody", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 14, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", "com.google.javascript.rhino.Node", "<sample:18>"}, {"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node", "<sample:7>"}, {"com.google.javascript.jscomp.CodeGenerator", "addArrayList", "com.google.javascript.rhino.Node", "<sample:12>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "forCostEstimation", new String[]{"com.google.javascript.jscomp.CodeConsumer"}, new String[]{"<sample:6>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.CodeGenerator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addCaseBody", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 14, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node", "<sample:15>"}, {"com.google.javascript.jscomp.CodeGenerator", "addCaseBody", "com.google.javascript.rhino.Node", "<sample:14>"}, {"com.google.javascript.jscomp.CodeGenerator", "addArrayList", "com.google.javascript.rhino.Node", "<sample:12>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addCaseBody", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 14, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node", "<sample:15>"}, {"com.google.javascript.jscomp.CodeGenerator", "addCaseBody", "com.google.javascript.rhino.Node", "<sample:14>"}, {"com.google.javascript.jscomp.CodeGenerator", "addArrayList", "com.google.javascript.rhino.Node", "<sample:12>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addCaseBody", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 14, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node", "<sample:15>"}, {"com.google.javascript.jscomp.CodeGenerator", "addCaseBody", "com.google.javascript.rhino.Node", "<sample:14>"}, {"com.google.javascript.jscomp.CodeGenerator", "addArrayList", "com.google.javascript.rhino.Node", "<sample:12>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "forCostEstimation", new String[]{"com.google.javascript.jscomp.CodeConsumer"}, new String[]{"<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.CodeGenerator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addCaseBody", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node", "<sample:15>"}, {"com.google.javascript.jscomp.CodeGenerator", "addCaseBody", "com.google.javascript.rhino.Node", "<sample:14>"}, {"com.google.javascript.jscomp.CodeGenerator", "addArrayList", "com.google.javascript.rhino.Node", "<sample:12>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "isSimpleNumber", new String[]{"java.lang.String"}, new String[]{"2147483648"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"IN_F>OR_INiT_CLAUSEfinally"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("IN_F>OR_INiT_CLAUSEfinally", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"1.5f"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"STATEMENT"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("STATEMENT", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"STBTEMENT"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("STBTEMENT", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"S"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{".:03X&()"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".:03X&()", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{".:0X&()"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".:0X&()", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:8>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addArrayList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:18>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", "java.lang.String", "12:30:45"}, {"com.google.javascript.jscomp.CodeGenerator", "tagAsStrict", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addArrayList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:17>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", "java.lang.String", "12:30:45"}, {"com.google.javascript.jscomp.CodeGenerator", "tagAsStrict", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:14>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addArrayList", "com.google.javascript.rhino.Node", "<sample:22>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", "java.lang.String", "="}, {"com.google.javascript.jscomp.CodeGenerator", "addArrayList", "com.google.javascript.rhino.Node", "<sample:24>"}, {"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:20>", "false", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", "java.lang.String", "="}, {"com.google.javascript.jscomp.CodeGenerator", "addArrayList", "com.google.javascript.rhino.Node", "<sample:25>"}, {"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:20>", "false", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"12345678901234567801234567890"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12345678901234567801234567890", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"]"}, false, 2, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addArrayList", "com.google.javascript.rhino.Node", "<sample:13>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"]\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"--1"}, false, 2, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addArrayList", "com.google.javascript.rhino.Node", "<sample:13>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"--1\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"2147483648"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", "java.lang.String", "return"}, {"com.google.javascript.jscomp.CodeGenerator", "addArrayList", "com.google.javascript.rhino.Node", "<sample:28>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/2147483648/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"--,b2345678801234567890123>45678:0.5return"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("--,b2345678801234567890123>45678:0.5return", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{".511-X'1"}, false, 7, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addCaseBody", "com.google.javascript.rhino.Node", "<sample:12>"}, {"com.google.javascript.jscomp.CodeGenerator", "add", "java.lang.String", "abt"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\".511-X'1\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{".511-X'11.5e300"}, false, 7, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addCaseBody", "com.google.javascript.rhino.Node", "<sample:12>"}, {"com.google.javascript.jscomp.CodeGenerator", "add", "java.lang.String", "abt"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\".511-X'11.5e300\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{".511-X'12.5e300"}, false, 7, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addCaseBody", "com.google.javascript.rhino.Node", "<sample:12>"}, {"com.google.javascript.jscomp.CodeGenerator", "add", "java.lang.String", "abt"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\".511-X'12.5e300\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"1/5fxFFFGFFFF"}, false, 7, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addCaseBody", "com.google.javascript.rhino.Node", "<sample:12>"}, {"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.CodeGenerator$Context", "<null>", "<sample:0>"}, {"com.google.javascript.jscomp.CodeGenerator", "add", "java.lang.String", "abt"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"1/5fxFFFGFFFF\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"INN_F>OR_INIT_CLAUSE"}, false, 7, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "java.lang.String", "abt"}, {"com.google.javascript.jscomp.CodeGenerator", "regexpEscape", "java.lang.String", "Title"}, {"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"INN_F\\x3eOR_INIT_CLAUSE\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"INN_F>R_INIT_CLAUSE"}, false, 14, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "regexpEscape", "java.lang.String", "1.5"}, {"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"INN_F\\x3eR_INIT_CLAUSE\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"INN_F>R_IcNIT_CLAUSE"}, false, 14, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "regexpEscape", "java.lang.String", "1.5"}, {"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"INN_F\\x3eR_IcNIT_CLAUSE\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean", "<sample:7>", "true"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:16>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean", "<sample:7>", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:23>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean", "<sample:7>", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"abc", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "java.lang.String", "="}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/abc/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"cac,bdd", "<empty>"}, false, 14, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addArrayList", "com.google.javascript.rhino.Node", "<sample:12>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/cac,bdd/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"cac,Hbddcatch(", "<empty>"}, false, 14, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addArrayList", "com.google.javascript.rhino.Node", "<sample:12>"}, {"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:0>", "true", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/cac,Hbddcatch(/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"Title", "<sample:2>"}, false, 14, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addArrayList", "com.google.javascript.rhino.Node", "<sample:12>"}, {"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:0>", "true", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/Title/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"Titl/", "<sample:2>"}, false, 14, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addArrayList", "com.google.javascript.rhino.Node", "<sample:12>"}, {"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:0>", "true", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/Titl//", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"Titl0", "<sample:1>"}, false, 14, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addArrayList", "com.google.javascript.rhino.Node", "<sample:12>"}, {"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:0>", "true", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/Titl0/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"Uitl0", "<sample:1>"}, false, 14, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addArrayList", "com.google.javascript.rhino.Node", "<sample:12>"}, {"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:0>", "true", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/Uitl0/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"Uil0", "<sample:1>"}, false, 14, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addArrayList", "com.google.javascript.rhino.Node", "<sample:12>"}, {"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:0>", "true", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/Uil0/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"var ", "<sample:2>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/var /", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"var .5", "<empty>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node", "<sample:10>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/var .5/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"var .R5", "<empty>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addCaseBody", "com.google.javascript.rhino.Node", "<sample:24>"}, {"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node", "<sample:16>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/var .R5/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "forCostEstimation", new String[]{"com.google.javascript.jscomp.CodeConsumer"}, new String[]{"<null>"}, true, 0, null, 2), new String[][]{{"tagAsStrict", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"Hello, World"}, false, 2, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"Hello, World\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:24>", "false"}, false, 1, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "java.lang.String", "2"}, {"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:0>", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"1.5e300", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:16>", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/1.5e300/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder"}, new String[]{"12:30:45", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:16>", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/12:30:45/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:15>", "<sample:11>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:3>", "<sample:9>"}, {"com.google.javascript.jscomp.CodeGenerator", "add", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.CodeGenerator$Context", "<sample:14>", "<sample:0>"}, {"com.google.javascript.jscomp.CodeGenerator", "addArrayList", "com.google.javascript.rhino.Node", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:15>"}, false, 15, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "regexpEscape", "java.lang.String", "0x123446789-0.0"}, {"com.google.javascript.jscomp.CodeGenerator", "regexpEscape", "java.lang.String", "\ntrue"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"1.5d"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", "com.google.javascript.rhino.Node", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"1.5d\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"return"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "add", "java.lang.String", "0xFFFFFFFF"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"return\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "isSimpleNumber", new String[]{"java.lang.String"}, new String[]{"1.12345678901234567"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"IN_FOR_INIT_CLAUSE"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("IN_FOR_INIT_CLAUSE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"1.5f"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "isSimpleNumber", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "getSimpleNumber", new String[]{"java.lang.String"}, new String[]{"1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:18>", "<sample:5>"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:22>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node", "<sample:23>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addAllSiblings", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"--1"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "regexpEscape", "java.lang.String,java.nio.charset.CharsetEncoder", "throw", "<sample:3>"}, {"com.google.javascript.jscomp.CodeGenerator", "add", "java.lang.String", "0x1F"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/--1/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"--1-1.5"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "regexpEscape", "java.lang.String,java.nio.charset.CharsetEncoder", "throw", "<sample:3>"}, {"com.google.javascript.jscomp.CodeGenerator", "add", "java.lang.String", "0x1F"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/--1-1.5/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"--1--1.5"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "regexpEscape", "java.lang.String,java.nio.charset.CharsetEncoder", "throw", "<sample:3>"}, {"com.google.javascript.jscomp.CodeGenerator", "add", "java.lang.String", "0x1F"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/--1--1.5/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "regexpEscape", new String[]{"java.lang.String"}, new String[]{"-0.0"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "regexpEscape", "java.lang.String,java.nio.charset.CharsetEncoder", "tirow", "<sample:3>"}, {"com.google.javascript.jscomp.CodeGenerator", "add", "java.lang.String", "x1F"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/-0.0/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"START_OF_EXPR"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("START_OF_EXPR", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"START_OFsEXPR"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("START_OFsEXPR", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"STnART_OFsEXPR"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("STnART_OFsEXPR", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"ST4nART_OFsEXPR"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ST4nART_OFsEXPR", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"ST4nART_OFsEXPR?P"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ST4nART_OFsEXPR?P", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"ST4nART"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ST4nART", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "getSimpleNumber", new String[]{"java.lang.String"}, new String[]{"catch:(1e10"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "getSimpleNumber", new String[]{"java.lang.String"}, new String[]{"7"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("7.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "getSimpleNumber", new String[]{"java.lang.String"}, new String[]{"56"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("56.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "getSimpleNumber", new String[]{"java.lang.String"}, new String[]{"57"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("57.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "getSimpleNumber", new String[]{"java.lang.String"}, new String[]{"957010"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("957010.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "getSimpleNumber", new String[]{"java.lang.String"}, new String[]{"9570110"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("9570110.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:11>", "<sample:9>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "isSimpleNumber", new String[]{"java.lang.String"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:0>", "false"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CodeGenerator$Context"}, new String[]{"<sample:0>", "<sample:10>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean", "<sample:5>", "false"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:10>", "false"}, false, 7, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "isSimpleNumber", new String[]{"java.lang.String"}, new String[]{"1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"-0.00T002020-01-01"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-0.00T002020-01-01", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"-0.00U002020-01-01"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-0.00U002020-01-01", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"-0.00U002020-01<-011.5e300"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-0.00U002020-01<-011.5e300", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"-0.00U0022020-01<-011.5e300"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-0.00U0022020-01<-011.5e300", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"-0.00U0022020.01<-011.5e300"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-0.00U0022020.01<-011.5e300", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "identifierEscape", new String[]{"java.lang.String"}, new String[]{"-0.00U00220020.01<-011.5e300"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-0.00U00220020.01<-011.5e300", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "add", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:8>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addList", "com.google.javascript.rhino.Node,boolean", "<sample:21>", "true"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"retrn"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addArrayList", "com.google.javascript.rhino.Node", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"retrn\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "escapeToDoubleQuotedJsString", new String[]{"java.lang.String"}, new String[]{"1"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeGenerator", "addArrayList", "com.google.javascript.rhino.Node", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"1\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "addList", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:18>", "false"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeGenerator", "com.google.javascript.jscomp.CodeGenerator", "getSimpleNumber", new String[]{"java.lang.String"}, new String[]{"90"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("90.0", String.valueOf(actual));
 }
}
