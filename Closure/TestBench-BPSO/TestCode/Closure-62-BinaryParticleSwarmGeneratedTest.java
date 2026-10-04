package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "termSupportsColor", new String[]{"java.lang.String"}, new String[]{""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "formatWarning", new String[]{"com.google.javascript.jscomp.JSError"}, new String[]{"<sample:9>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("WARNING - a\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "getSource", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "formatError", new String[]{"com.google.javascript.jscomp.JSError"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.LightweightMessageFormatter", "setColorize", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\033[31mERROR\033[39m - a\na\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "getSource", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.LightweightMessageFormatter", "formatError", "com.google.javascript.jscomp.JSError", "<sample:6>"}}, 3), new String[][]{{"getSourceLine", "java.lang.String,int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "formatWarning", new String[]{"com.google.javascript.jscomp.JSError"}, new String[]{"<sample:11>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.LightweightMessageFormatter", "setColorize", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("WARNING - a\na\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "getLevelName", new String[]{"com.google.javascript.jscomp.CheckLevel"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.LightweightMessageFormatter", "formatWarning", "com.google.javascript.jscomp.JSError", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ERROR", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "withoutSource", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.LightweightMessageFormatter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "withoutSource", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"formatError", "com.google.javascript.jscomp.JSError", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ERROR - a\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "getLevelName", new String[]{"com.google.javascript.jscomp.CheckLevel"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("WARNING", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "withoutSource", new String[]{}, new String[]{}, true), new String[][]{{"formatError", "com.google.javascript.jscomp.JSError", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ERROR - a\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "formatError", new String[]{"com.google.javascript.jscomp.JSError"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.LightweightMessageFormatter", "setColorize", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ERROR - a\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "getLevelName", new String[]{"com.google.javascript.jscomp.CheckLevel"}, new String[]{"<sample:7>"}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("WARNING", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "withoutSource", new String[]{}, new String[]{}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.LightweightMessageFormatter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "formatWarning", new String[]{"com.google.javascript.jscomp.JSError"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.LightweightMessageFormatter", "getSource", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("WARNING - a\n  0| 0\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "withoutSource", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"setColorize", "boolean", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.LightweightMessageFormatter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "getSource", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"getSourceLine", "java.lang.String,int", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "setColorize", new String[]{"boolean"}, new String[]{"true"}, false, 4, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "formatError", new String[]{"com.google.javascript.jscomp.JSError"}, new String[]{"<sample:0>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ERROR - a\nsample\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "setColorize", new String[]{"boolean"}, new String[]{"true"}, false, 2, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "formatError", new String[]{"com.google.javascript.jscomp.JSError"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.LightweightMessageFormatter", "setColorize", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ERROR - a\na\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "setColorize", new String[]{"boolean"}, new String[]{"false"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "formatWarning", new String[]{"com.google.javascript.jscomp.JSError"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.LightweightMessageFormatter", "formatError", "com.google.javascript.jscomp.JSError", "<sample:12>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("WARNING - a\nsample\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "formatWarning", new String[]{"com.google.javascript.jscomp.JSError"}, new String[]{"<sample:0>"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("WARNING - a\n  0| 0\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "formatWarning", new String[]{"com.google.javascript.jscomp.JSError"}, new String[]{"<sample:7>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.LightweightMessageFormatter", "setColorize", "boolean", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\033[35mWARNING\033[39m - a\n  3| 0\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "getSource", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.LightweightMessageFormatter", "getLevelName", "com.google.javascript.jscomp.CheckLevel", "<sample:1>"}}, 1);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "getLevelName", new String[]{"com.google.javascript.jscomp.CheckLevel"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.LightweightMessageFormatter", "formatWarning", "com.google.javascript.jscomp.JSError", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("OFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "withoutSource", new String[]{}, new String[]{}, true), new String[][]{{"formatWarning", "com.google.javascript.jscomp.JSError", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("WARNING - a\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "formatError", new String[]{"com.google.javascript.jscomp.JSError"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.LightweightMessageFormatter", "setColorize", "boolean", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ERROR - a\n  3| 0\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "formatError", new String[]{"com.google.javascript.jscomp.JSError"}, new String[]{"<null>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "formatWarning", new String[]{"com.google.javascript.jscomp.JSError"}, new String[]{"<sample:5>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("WARNING - a\na\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "getLevelName", new String[]{"com.google.javascript.jscomp.CheckLevel"}, new String[]{"<sample:2>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("OFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "formatWarning", new String[]{"com.google.javascript.jscomp.JSError"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.LightweightMessageFormatter", "setColorize", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\033[35mWARNING\033[39m - a\n  0| 0\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "formatError", new String[]{"com.google.javascript.jscomp.JSError"}, new String[]{"<sample:9>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.LightweightMessageFormatter", "getSource", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ERROR - a\n  0| 0\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "getSource", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3), new String[][]{{"getSourceRegion", "java.lang.String,int", "4"}, {"getBeginningLineNumber", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "getLevelName", new String[]{"com.google.javascript.jscomp.CheckLevel"}, new String[]{"<sample:1>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("WARNING", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "formatWarning", new String[]{"com.google.javascript.jscomp.JSError"}, new String[]{"<sample:2>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("WARNING - a\nsample\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "formatError", new String[]{"com.google.javascript.jscomp.JSError"}, new String[]{"<sample:9>"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ERROR - a\n  0| 0\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "getLevelName", new String[]{"com.google.javascript.jscomp.CheckLevel"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.LightweightMessageFormatter", "formatWarning", "com.google.javascript.jscomp.JSError", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "withoutSource", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"formatWarning", "com.google.javascript.jscomp.JSError", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("WARNING - a\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "getSource", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1), new String[][]{{"getSourceRegion", "java.lang.String,int", "1"}, {"getEndingLineNumber", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "formatError", new String[]{"com.google.javascript.jscomp.JSError"}, new String[]{"<sample:1>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ERROR - a\n  3| 0\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "formatError", new String[]{"com.google.javascript.jscomp.JSError"}, new String[]{"<sample:10>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.LightweightMessageFormatter", "getSource", ""}, {"com.google.javascript.jscomp.LightweightMessageFormatter", "getSource", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ERROR - a\n  3| 0\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "formatError", new String[]{"com.google.javascript.jscomp.JSError"}, new String[]{"<sample:3>"}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ERROR - a\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "formatError", new String[]{"com.google.javascript.jscomp.JSError"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.LightweightMessageFormatter", "getSource", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ERROR - a\na\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "getLevelName", new String[]{"com.google.javascript.jscomp.CheckLevel"}, new String[]{"<sample:6>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ERROR", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "formatError", new String[]{"com.google.javascript.jscomp.JSError"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.LightweightMessageFormatter", "getLevelName", "com.google.javascript.jscomp.CheckLevel", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ERROR - a\na\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "formatWarning", new String[]{"com.google.javascript.jscomp.JSError"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.LightweightMessageFormatter", "setColorize", "boolean", "true"}, {"com.google.javascript.jscomp.LightweightMessageFormatter", "getSource", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\033[35mWARNING\033[39m - a\n  3| 0\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "formatWarning", new String[]{"com.google.javascript.jscomp.JSError"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.LightweightMessageFormatter", "getLevelName", "com.google.javascript.jscomp.CheckLevel", "<sample:8>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("WARNING - a\na\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "termSupportsColor", new String[]{"java.lang.String"}, new String[]{" - "}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "getSource", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.LightweightMessageFormatter", "formatWarning", "com.google.javascript.jscomp.JSError", "<sample:4>"}}, 1), new String[][]{{"getSourceLine", "java.lang.String,int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "formatWarning", new String[]{"com.google.javascript.jscomp.JSError"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.LightweightMessageFormatter", "formatWarning", "com.google.javascript.jscomp.JSError", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("WARNING - a\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "formatError", new String[]{"com.google.javascript.jscomp.JSError"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.LightweightMessageFormatter", "getLevelName", "com.google.javascript.jscomp.CheckLevel", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ERROR - a\n  3| 0\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "getSource", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3), new String[][]{{"getSourceLine", "java.lang.String,int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "getLevelName", new String[]{"com.google.javascript.jscomp.CheckLevel"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.LightweightMessageFormatter", "getLevelName", "com.google.javascript.jscomp.CheckLevel", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("WARNING", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "formatWarning", new String[]{"com.google.javascript.jscomp.JSError"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.LightweightMessageFormatter", "formatError", "com.google.javascript.jscomp.JSError", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("WARNING - a\na\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "formatError", new String[]{"com.google.javascript.jscomp.JSError"}, new String[]{"<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "getSource", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"getSourceLine", "java.lang.String,int", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "formatWarning", new String[]{"com.google.javascript.jscomp.JSError"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.LightweightMessageFormatter", "getLevelName", "com.google.javascript.jscomp.CheckLevel", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("WARNING - a\n  3| 0\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "withoutSource", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"formatError", "com.google.javascript.jscomp.JSError", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ERROR - a\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "getLevelName", new String[]{"com.google.javascript.jscomp.CheckLevel"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.LightweightMessageFormatter", "setColorize", "boolean", "false"}, {"com.google.javascript.jscomp.LightweightMessageFormatter", "formatWarning", "com.google.javascript.jscomp.JSError", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("OFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "setColorize", new String[]{"boolean"}, new String[]{"false"}, false, 1, new String[][]{{"com.google.javascript.jscomp.LightweightMessageFormatter", "getLevelName", "com.google.javascript.jscomp.CheckLevel", "<sample:3>"}, {"com.google.javascript.jscomp.LightweightMessageFormatter", "formatError", "com.google.javascript.jscomp.JSError", "<null>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "formatError", new String[]{"com.google.javascript.jscomp.JSError"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.LightweightMessageFormatter", "getSource", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ERROR - a\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "formatError", new String[]{"com.google.javascript.jscomp.JSError"}, new String[]{"<sample:3>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ERROR - a\na\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "getLevelName", new String[]{"com.google.javascript.jscomp.CheckLevel"}, new String[]{"<null>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "formatWarning", new String[]{"com.google.javascript.jscomp.JSError"}, new String[]{"<sample:1>"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("WARNING - a\n  3| 0\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "formatWarning", new String[]{"com.google.javascript.jscomp.JSError"}, new String[]{"<sample:10>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.LightweightMessageFormatter", "getLevelName", "com.google.javascript.jscomp.CheckLevel", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("WARNING - a\n  0| 0\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "formatWarning", new String[]{"com.google.javascript.jscomp.JSError"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.LightweightMessageFormatter", "getSource", ""}, {"com.google.javascript.jscomp.LightweightMessageFormatter", "formatError", "com.google.javascript.jscomp.JSError", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("WARNING - a\n  3| 0\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "getSource", new String[]{}, new String[]{}, false), new String[][]{{"getSourceRegion", "java.lang.String,int", "0"}, {"getBeginningLineNumber", "", "5"}, {"getEndingLineNumber", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "getSource", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.LightweightMessageFormatter", "getSource", ""}}), new String[][]{{"getSourceRegion", "java.lang.String,int", "2"}, {"getSourceExcerpt", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "getSource", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.LightweightMessageFormatter", "getLevelName", "com.google.javascript.jscomp.CheckLevel", "<sample:6>"}}), new String[][]{{"getSourceRegion", "java.lang.String,int", "5"}, {"getBeginningLineNumber", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "formatWarning", new String[]{"com.google.javascript.jscomp.JSError"}, new String[]{"<null>"}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "formatError", new String[]{"com.google.javascript.jscomp.JSError"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.LightweightMessageFormatter", "formatWarning", "com.google.javascript.jscomp.JSError", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ERROR - a\n  0| 0\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "getSource", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.LightweightMessageFormatter", "formatError", "com.google.javascript.jscomp.JSError", "<sample:2>"}, {"com.google.javascript.jscomp.LightweightMessageFormatter", "getLevelName", "com.google.javascript.jscomp.CheckLevel", "<sample:4>"}}), new String[][]{{"getSourceRegion", "java.lang.String,int", "2"}, {"getEndingLineNumber", "", "5"}, {"getBeginningLineNumber", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "formatWarning", new String[]{"com.google.javascript.jscomp.JSError"}, new String[]{"<null>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.LightweightMessageFormatter", "setColorize", "boolean", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "formatError", new String[]{"com.google.javascript.jscomp.JSError"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.LightweightMessageFormatter", "formatError", "com.google.javascript.jscomp.JSError", "<sample:5>"}, {"com.google.javascript.jscomp.LightweightMessageFormatter", "setColorize", "boolean", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\033[31mERROR\033[39m - a\n  3| 0\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "termSupportsColor", new String[]{"java.lang.String"}, new String[]{"PT1H"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "getLevelName", new String[]{"com.google.javascript.jscomp.CheckLevel"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.LightweightMessageFormatter", "setColorize", "boolean", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\033[31mERROR\033[39m", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "withoutSource", new String[]{}, new String[]{}, true), new String[][]{{"setColorize", "boolean", "3"}, {"formatError", "com.google.javascript.jscomp.JSError", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\033[31mERROR\033[39m - a\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "getSource", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.LightweightMessageFormatter", "formatError", "com.google.javascript.jscomp.JSError", "<null>"}}, 3), new String[][]{{"getSourceRegion", "java.lang.String,int", "7"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "formatError", new String[]{"com.google.javascript.jscomp.JSError"}, new String[]{"<sample:8>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.LightweightMessageFormatter", "setColorize", "boolean", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\033[31mERROR\033[39m - a\n  3| 0\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "getLevelName", new String[]{"com.google.javascript.jscomp.CheckLevel"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.LightweightMessageFormatter", "formatError", "com.google.javascript.jscomp.JSError", "<sample:3>"}, {"com.google.javascript.jscomp.LightweightMessageFormatter", "setColorize", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\033[31mERROR\033[39m", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "getLevelName", new String[]{"com.google.javascript.jscomp.CheckLevel"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.LightweightMessageFormatter", "getSource", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ERROR", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "formatWarning", new String[]{"com.google.javascript.jscomp.JSError"}, new String[]{"<null>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.LightweightMessageFormatter", "getSource", ""}, {"com.google.javascript.jscomp.LightweightMessageFormatter", "formatWarning", "com.google.javascript.jscomp.JSError", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "getLevelName", new String[]{"com.google.javascript.jscomp.CheckLevel"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.LightweightMessageFormatter", "setColorize", "boolean", "false"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ERROR", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "getLevelName", new String[]{"com.google.javascript.jscomp.CheckLevel"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.LightweightMessageFormatter", "setColorize", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\033[35mWARNING\033[39m", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "withoutSource", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"formatError", "com.google.javascript.jscomp.JSError", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ERROR - a\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "formatError", new String[]{"com.google.javascript.jscomp.JSError"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.LightweightMessageFormatter", "formatError", "com.google.javascript.jscomp.JSError", "<sample:0>"}, {"com.google.javascript.jscomp.LightweightMessageFormatter", "setColorize", "boolean", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\033[31mERROR\033[39m - a\na\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "formatWarning", new String[]{"com.google.javascript.jscomp.JSError"}, new String[]{"<null>"}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "withoutSource", new String[]{}, new String[]{}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.LightweightMessageFormatter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "getLevelName", new String[]{"com.google.javascript.jscomp.CheckLevel"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.LightweightMessageFormatter", "formatError", "com.google.javascript.jscomp.JSError", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("OFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "formatError", new String[]{"com.google.javascript.jscomp.JSError"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.LightweightMessageFormatter", "formatWarning", "com.google.javascript.jscomp.JSError", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "getSource", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.LightweightMessageFormatter", "formatWarning", "com.google.javascript.jscomp.JSError", "<sample:1>"}}, 1), new String[][]{{"getSourceLine", "java.lang.String,int", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "withoutSource", new String[]{}, new String[]{}, true), new String[][]{{"setColorize", "boolean", "1"}, {"formatWarning", "com.google.javascript.jscomp.JSError", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\033[35mWARNING\033[39m - a\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "getSource", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.LightweightMessageFormatter", "getSource", ""}}, 1), new String[][]{{"getSourceLine", "java.lang.String,int", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "formatError", new String[]{"com.google.javascript.jscomp.JSError"}, new String[]{"<sample:7>"}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ERROR - a\nsample\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "formatWarning", new String[]{"com.google.javascript.jscomp.JSError"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.LightweightMessageFormatter", "getLevelName", "com.google.javascript.jscomp.CheckLevel", "<sample:6>"}, {"com.google.javascript.jscomp.LightweightMessageFormatter", "formatWarning", "com.google.javascript.jscomp.JSError", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("WARNING - a\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "formatWarning", new String[]{"com.google.javascript.jscomp.JSError"}, new String[]{"<sample:8>"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("WARNING - a\n  0| 0\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "formatError", new String[]{"com.google.javascript.jscomp.JSError"}, new String[]{"<sample:8>"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ERROR - a\n  0| 0\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "getSource", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.LightweightMessageFormatter", "formatWarning", "com.google.javascript.jscomp.JSError", "<sample:3>"}, {"com.google.javascript.jscomp.LightweightMessageFormatter", "formatWarning", "com.google.javascript.jscomp.JSError", "<sample:3>"}}, 3), new String[][]{{"getSourceLine", "java.lang.String,int", "3"}, {"getSourceLine", "java.lang.String,int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "withoutSource", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"formatWarning", "com.google.javascript.jscomp.JSError", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("WARNING - a\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "getSource", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.LightweightMessageFormatter", "getSource", ""}, {"com.google.javascript.jscomp.LightweightMessageFormatter", "formatWarning", "com.google.javascript.jscomp.JSError", "<sample:12>"}}), new String[][]{{"getSourceRegion", "java.lang.String,int", "0"}, {"getBeginningLineNumber", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "formatError", new String[]{"com.google.javascript.jscomp.JSError"}, new String[]{"<sample:4>"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ERROR - a\nsample\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "getSource", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"getSourceRegion", "java.lang.String,int", "2"}, {"getBeginningLineNumber", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "formatError", new String[]{"com.google.javascript.jscomp.JSError"}, new String[]{"<sample:7>"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ERROR - a\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "getSource", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1), new String[][]{{"getSourceLine", "java.lang.String,int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "getSource", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.LightweightMessageFormatter", "formatWarning", "com.google.javascript.jscomp.JSError", "<sample:1>"}}, 2), new String[][]{{"getSourceRegion", "java.lang.String,int", "0"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "getSource", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.LightweightMessageFormatter", "getLevelName", "com.google.javascript.jscomp.CheckLevel", "<sample:7>"}}, 2), new String[][]{{"getSourceLine", "java.lang.String,int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "formatError", new String[]{"com.google.javascript.jscomp.JSError"}, new String[]{"<sample:7>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.LightweightMessageFormatter", "getSource", ""}, {"com.google.javascript.jscomp.LightweightMessageFormatter", "formatError", "com.google.javascript.jscomp.JSError", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ERROR - a\nsample\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "formatWarning", new String[]{"com.google.javascript.jscomp.JSError"}, new String[]{"<sample:9>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.LightweightMessageFormatter", "formatError", "com.google.javascript.jscomp.JSError", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("WARNING - a\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "withoutSource", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"formatWarning", "com.google.javascript.jscomp.JSError", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("WARNING - a\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "termSupportsColor", new String[]{"java.lang.String"}, new String[]{"-0/0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "getSource", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.LightweightMessageFormatter", "getSource", ""}}, 3), new String[][]{{"getSourceRegion", "java.lang.String,int", "2"}, {"getBeginningLineNumber", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "formatWarning", new String[]{"com.google.javascript.jscomp.JSError"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.LightweightMessageFormatter", "getSource", ""}, {"com.google.javascript.jscomp.LightweightMessageFormatter", "setColorize", "boolean", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\033[35mWARNING\033[39m - a\na\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "formatWarning", new String[]{"com.google.javascript.jscomp.JSError"}, new String[]{"<sample:5>"}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("WARNING - a\nsample\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "getLevelName", new String[]{"com.google.javascript.jscomp.CheckLevel"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.LightweightMessageFormatter", "setColorize", "boolean", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\033[35mWARNING\033[39m", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "getLevelName", new String[]{"com.google.javascript.jscomp.CheckLevel"}, new String[]{"<null>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.LightweightMessageFormatter", "setColorize", "boolean", "false"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "getLevelName", new String[]{"com.google.javascript.jscomp.CheckLevel"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.LightweightMessageFormatter", "getLevelName", "com.google.javascript.jscomp.CheckLevel", "<sample:5>"}, {"com.google.javascript.jscomp.LightweightMessageFormatter", "setColorize", "boolean", "true"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "formatWarning", new String[]{"com.google.javascript.jscomp.JSError"}, new String[]{"<sample:3>"}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("WARNING - a\n  3| 0\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "getLevelName", new String[]{"com.google.javascript.jscomp.CheckLevel"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.LightweightMessageFormatter", "setColorize", "boolean", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\033[31mERROR\033[39m", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "formatWarning", new String[]{"com.google.javascript.jscomp.JSError"}, new String[]{"<sample:2>"}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("WARNING - a\nsample\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "getSource", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.LightweightMessageFormatter", "getLevelName", "com.google.javascript.jscomp.CheckLevel", "<sample:2>"}}, 2), new String[][]{{"getSourceLine", "java.lang.String,int", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "getSource", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.LightweightMessageFormatter", "getSource", ""}}, 1), new String[][]{{"getSourceRegion", "java.lang.String,int", "6"}, {"getEndingLineNumber", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "getLevelName", new String[]{"com.google.javascript.jscomp.CheckLevel"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.LightweightMessageFormatter", "setColorize", "boolean", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\033[35mWARNING\033[39m", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "getSource", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.LightweightMessageFormatter", "getSource", ""}, {"com.google.javascript.jscomp.LightweightMessageFormatter", "formatWarning", "com.google.javascript.jscomp.JSError", "<null>"}}, 3), new String[][]{{"getSourceRegion", "java.lang.String,int", "0"}, {"getBeginningLineNumber", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "getLevelName", new String[]{"com.google.javascript.jscomp.CheckLevel"}, new String[]{"<sample:7>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.LightweightMessageFormatter", "setColorize", "boolean", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\033[35mWARNING\033[39m", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "formatError", new String[]{"com.google.javascript.jscomp.JSError"}, new String[]{"<null>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.LightweightMessageFormatter", "setColorize", "boolean", "true"}, {"com.google.javascript.jscomp.LightweightMessageFormatter", "formatWarning", "com.google.javascript.jscomp.JSError", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "withoutSource", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"setColorize", "boolean", "1"}, {"formatError", "com.google.javascript.jscomp.JSError", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\033[31mERROR\033[39m - a\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "getSource", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.LightweightMessageFormatter", "getLevelName", "com.google.javascript.jscomp.CheckLevel", "<sample:3>"}}, 2), new String[][]{{"getSourceRegion", "java.lang.String,int", "3"}, {"getEndingLineNumber", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "getLevelName", new String[]{"com.google.javascript.jscomp.CheckLevel"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.LightweightMessageFormatter", "setColorize", "boolean", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\033[31mERROR\033[39m", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "getSource", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2), new String[][]{{"getSourceRegion", "java.lang.String,int", "1"}, {"getEndingLineNumber", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "getSource", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1), new String[][]{{"getSourceRegion", "java.lang.String,int", "3"}, {"getBeginningLineNumber", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "getSource", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.LightweightMessageFormatter", "formatWarning", "com.google.javascript.jscomp.JSError", "<sample:5>"}}, 2), new String[][]{{"getSourceRegion", "java.lang.String,int", "2"}, {"getSourceExcerpt", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "getSource", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.LightweightMessageFormatter", "setColorize", "boolean", "false"}, {"com.google.javascript.jscomp.LightweightMessageFormatter", "formatWarning", "com.google.javascript.jscomp.JSError", "<sample:2>"}}, 3), new String[][]{{"getSourceLine", "java.lang.String,int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "getSource", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.LightweightMessageFormatter", "getLevelName", "com.google.javascript.jscomp.CheckLevel", "<sample:4>"}}, 2), new String[][]{{"getSourceRegion", "java.lang.String,int", "0"}, {"getEndingLineNumber", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "getSource", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.LightweightMessageFormatter", "setColorize", "boolean", "false"}}, 2), new String[][]{{"getSourceLine", "java.lang.String,int", "6"}, {"getSourceLine", "java.lang.String,int", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "withoutSource", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"setColorize", "boolean", "3"}, {"formatWarning", "com.google.javascript.jscomp.JSError", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\033[35mWARNING\033[39m - a\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "withoutSource", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"setColorize", "boolean", "1"}, {"formatError", "com.google.javascript.jscomp.JSError", "7"}, {"formatError", "com.google.javascript.jscomp.JSError", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\033[31mERROR\033[39m - a\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "withoutSource", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"setColorize", "boolean", "7"}, {"formatError", "com.google.javascript.jscomp.JSError", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\033[31mERROR\033[39m - a\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "withoutSource", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"setColorize", "boolean", "3"}, {"formatWarning", "com.google.javascript.jscomp.JSError", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\033[35mWARNING\033[39m - a\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.LightweightMessageFormatter", "com.google.javascript.jscomp.LightweightMessageFormatter", "withoutSource", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"setColorize", "boolean", "3"}, {"formatWarning", "com.google.javascript.jscomp.JSError", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\033[35mWARNING\033[39m - a\n", String.valueOf(actual));
 }
}
