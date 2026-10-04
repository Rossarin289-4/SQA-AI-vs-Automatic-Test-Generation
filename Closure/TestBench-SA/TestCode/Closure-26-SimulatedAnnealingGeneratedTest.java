package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"+1"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<null>", "<sample:0>"}, {"com.google.javascript.jscomp.ProcessCommonJSModules", "getModule", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$+1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"T1"}, false, 13, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<null>", "<sample:0>"}, {"com.google.javascript.jscomp.ProcessCommonJSModules", "getModule", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$T1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{",1"}, false, 12, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<null>", "<sample:0>"}, {"com.google.javascript.jscomp.ProcessCommonJSModules", "getModule", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$,1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"1.1234567"}, false, 13, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<null>", "<sample:0>"}, {"com.google.javascript.jscomp.ProcessCommonJSModules", "getModule", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$1.1234567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "getModule", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "getModule", ""}, {"com.google.javascript.jscomp.ProcessCommonJSModules", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:1>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "getModule", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "getModule", ""}, {"com.google.javascript.jscomp.ProcessCommonJSModules", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:1>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-1", "provide"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$_1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"module$", "provide"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$module$", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-2", ""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$_2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{",2", "require"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$,2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{",2", "require"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$,2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"I", "require"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$I", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"1.1234567"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$1.1234567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"2.1234567"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$2.1234567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"2.1233567"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$2.1233567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\\$", "module"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$\\$", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1\\$", "module"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$1\\$", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"12:30:45", "module"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$12:30:45", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"12:30;45", "module"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$12:30;45", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"12:30X45", "module"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$12:30X45", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"--1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$__1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"--11"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$__11", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$2147483648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"2148483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$2148483648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"-1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$_1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<sample:4>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"-0.0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$_0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{""}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"null"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$null", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:3>"}, {"com.google.javascript.jscomp.ProcessCommonJSModules", "getModule", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<null>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", "java.lang.String", "--x1"}, {"com.google.javascript.jscomp.ProcessCommonJSModules", "getModule", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<sample:3>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", "java.lang.String", "--x1"}, {"com.google.javascript.jscomp.ProcessCommonJSModules", "getModule", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"provide"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$provide", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"prvide"}, false, 1, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", "java.lang.String", "1LL"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$prvide", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"-0."}, false, 4, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:0>"}, {"com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", "java.lang.String", "0"}, {"com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", "java.lang.String", "+^"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$_0.", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{",0."}, false, 4, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:0>"}, {"com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", "java.lang.String", "0"}, {"com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", "java.lang.String", "+^^"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$,0.", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{",0-"}, false, 4, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:0>"}, {"com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", "java.lang.String", "+^^"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$,0_", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{",1-"}, false, 3, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:0>"}, {"com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", "java.lang.String", "+^^"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$,1_", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{",11-"}, false, 3, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:0>"}, {"com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", "java.lang.String", "+^^"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$,11_", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "getModule", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{""}, false, 12, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:0>"}, {"com.google.javascript.jscomp.ProcessCommonJSModules", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"a b"}, false, 12, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:0>"}, {"com.google.javascript.jscomp.ProcessCommonJSModules", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$a b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"a!b"}, false, 12, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:0>"}, {"com.google.javascript.jscomp.ProcessCommonJSModules", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$a!b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"adb"}, false, 12, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:0>"}, {"com.google.javascript.jscomp.ProcessCommonJSModules", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$adb", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"ad<b0"}, false, 12, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:0>"}, {"com.google.javascript.jscomp.ProcessCommonJSModules", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:7>"}, {"com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", "java.lang.String", "123456789012345678901234567890"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$ad<b0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"ac<b0"}, false, 12, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:0>"}, {"com.google.javascript.jscomp.ProcessCommonJSModules", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:7>"}, {"com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", "java.lang.String", "123456789012345678901234567890"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$ac<b0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "getModule", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", "java.lang.String", "null"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"-1trueD"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$_1trueD", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"<1\u00e91t12345678:01234567-"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$<1\u00e91t12345678:01234567_", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"<1\u00e9112345678:01234567-"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$<1\u00e9112345678:01234567_", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:5>"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"12:30:45", "-1.5"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$12:30:45", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"1023456789012345678901233567890"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "getModule", ""}, {"com.google.javascript.jscomp.ProcessCommonJSModules", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<null>", "<sample:0>"}, {"com.google.javascript.jscomp.ProcessCommonJSModules", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$1023456789012345678901233567890", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"exports.4"}, false, 8, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:0>"}, {"com.google.javascript.jscomp.ProcessCommonJSModules", "getModule", ""}, {"com.google.javascript.jscomp.ProcessCommonJSModules", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$exports.4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"121E4:74>36480xFEllFFGFF4I"}, false, 10, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", "java.lang.String", ""}, {"com.google.javascript.jscomp.ProcessCommonJSModules", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$121E4:74>36480xFEllFFGFF4I", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"131E4:74>3>6t480xFEllFFGFF4I"}, false, 10, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", "java.lang.String", ""}, {"com.google.javascript.jscomp.ProcessCommonJSModules", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:7>"}, {"com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", "java.lang.String", "\\$"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$131E4:74>3>6t480xFEllFFGFF4I", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0x123456789", "1e10"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$0x123456789", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"repvre"}, false, 11, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", "java.lang.String", "1.1235678"}, {"com.google.javascript.jscomp.ProcessCommonJSModules", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:1>"}, {"com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", "java.lang.String", "%"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$repvre", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"Li"}, false, 11, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "getModule", ""}, {"com.google.javascript.jscomp.ProcessCommonJSModules", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:1>"}, {"com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", "java.lang.String", "8"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$Li", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"+1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$+1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"3j1-9"}, false, 4, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "getModule", ""}, {"com.google.javascript.jscomp.ProcessCommonJSModules", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:10>", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$3j1_9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"361,8"}, false, 4, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "getModule", ""}, {"com.google.javascript.jscomp.ProcessCommonJSModules", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:9>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$361,8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"module$exports"}, false, 4, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "getModule", ""}, {"com.google.javascript.jscomp.ProcessCommonJSModules", "getModule", ""}, {"com.google.javascript.jscomp.ProcessCommonJSModules", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:9>", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$module$exports", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"mm"}, false, 4, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "getModule", ""}, {"com.google.javascript.jscomp.ProcessCommonJSModules", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$mm", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.1234567", "I"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$1.1234567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-1", "0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$_1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0+", "0x123456789"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$0+", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1/.123456781.5d", "Title"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$1$.123456781.5d", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"^"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$^", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"^12:-30:45"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$^12:_30:45", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"modue.dxports"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$modue.dxports", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"modve.dxp5orts"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$modve.dxp5orts", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"mdve.dxp5orts"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$mdve.dxp5orts", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"mdve.dxpDorts"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$mdve.dxpDorts", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"mdve.expDorts"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$mdve.expDorts", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"mdve."}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$mdve.", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"mdve.0xFFFFFFFF"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$mdve.0xFFFFFFFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1xe110", "0x1234567"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$1xe110", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1xe120", "0x1234567"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$1xe120", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"00x\010::15-require0102020-01-01"}, false, 15, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "getModule", ""}, {"com.google.javascript.jscomp.ProcessCommonJSModules", "getModule", ""}, {"com.google.javascript.jscomp.ProcessCommonJSModules", "getModule", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$00x\010::15_require0102020_01_01", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"moduke.exports"}, false, 15, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "getModule", ""}, {"com.google.javascript.jscomp.ProcessCommonJSModules", "getModule", ""}, {"com.google.javascript.jscomp.ProcessCommonJSModules", "getModule", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$moduke.exports", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"moduje.8xports"}, false, 15, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "getModule", ""}, {"com.google.javascript.jscomp.ProcessCommonJSModules", "getModule", ""}, {"com.google.javascript.jscomp.ProcessCommonJSModules", "getModule", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$moduje.8xports", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\t", ""}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$\t", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<null>", "1.5"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Title", "\\$"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$Title", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"require", "module$exports"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$require", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<null>"}, false, 12, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"goog"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$goog", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\\$", "1.5e300"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$\\$", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"/"}, false, 14, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:4>"}, {"com.google.javascript.jscomp.ProcessCommonJSModules", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<null>"}, {"com.google.javascript.jscomp.ProcessCommonJSModules", "getModule", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<null>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", "java.lang.String", "1.5e300"}, {"com.google.javascript.jscomp.ProcessCommonJSModules", "getModule", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"D-moe1le$expo", "\t\t"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$D_moe1le$expo", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"C-moe1le$expo", "\t\t"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$C_moe1le$expo", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"C-moB1le$expo", "\t\t5."}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$C_moB1le$expo", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\t", "1de10"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$\t", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\010", "0de10"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$\010", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\010\\$", "/ue\t10"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$\010\\$", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\010[W", "/ue\t10"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$\010[W", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\010[X", "a"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$\010[X", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "j"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"\u00e9L1.12245677,1.5moduleeyorus"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$\u00e9L1.12245677,1.5moduleeyorus", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"\u00e9L1.1224677,1.5moduleeyorus"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$\u00e9L1.1224677,1.5moduleeyorus", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"\u00e9L1.122677,1.5moduleeyorus"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$\u00e9L1.122677,1.5moduleeyorus", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"1.1234567890123456"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$1.1234567890123456", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"0.1234567890123456"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$0.1234567890123456", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"0.12234567890123456"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$0.12234567890123456", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"0.12235567890123456"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$0.12235567890123456", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"null"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$null", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"1e10"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$1e10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<null>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "getModule", ""}, {"com.google.javascript.jscomp.ProcessCommonJSModules", "getModule", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
}
