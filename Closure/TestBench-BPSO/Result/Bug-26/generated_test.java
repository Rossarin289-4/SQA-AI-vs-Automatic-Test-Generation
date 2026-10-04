package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "getModule", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "getModule", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "getModule", ""}, {"com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", "java.lang.String", "1.5d"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"00"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "getModule", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$00", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "getModule", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"IIa", "a\u00e9"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$IIa", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "getModule", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"0x123456789"}, false, 7, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "getModule", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$0x123456789", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", "java.lang.String", "01"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<null>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "getModule", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{".."}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$..", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"modulle.exports"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$modulle.exports", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"PT1Hmodule", "expors1.12345678901234567"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$PT1Hmodule", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"a1E-5"}, false, 2, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "getModule", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$a1E_5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"psowide", ""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$psowide", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"Tiitle"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$Tiitle", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"2147483648"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "getModule", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$2147483648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"b"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"//", "-"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$$$", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"module.exports"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$module.exports", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1L123456789012345678901234567890", "T\u00e9itlf"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$1L123456789012345678901234567890", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"1dE-5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$1dE_5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"oogH"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$oogH", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"requireI"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$requireI", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2147A483648", "b"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$2147A483648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"proide"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "getModule", ""}, {"com.google.javascript.jscomp.ProcessCommonJSModules", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:10>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$proide", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"modu\nle.expports"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", "java.lang.String", "1.12345677"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$modu\nle.expports", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"goog"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "getModule", ""}, {"com.google.javascript.jscomp.ProcessCommonJSModules", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$goog", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"0x1F1.5d"}, false, 7, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", "java.lang.String", "PT1H\\$"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$0x1F1.5d", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"\n"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"nulm", "G"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$nulm", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"16.5e3001.5d", "0xx2F"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$16.5e3001.5d", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"ab"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$ab", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"0xFFFFFvFFF"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$0xFFFFFvFFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"\u00e9"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$\u00e9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"W"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", "java.lang.String", "1.e"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$W", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"1.1>345678901234567"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$1.1>345678901234567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"1L"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$1L", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"5.", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$5.", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1e10", "^\\.--1I"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$1e10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<null>"}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"a,b9,c"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:5>"}, {"com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", "java.lang.String", "0x123456788"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$a,b9,c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<sample:3>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", "java.lang.String", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1E-5", "mndule%"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$1E_5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1e5", "b\u00e9"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$1e5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"0x1F"}, false, 3, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", "java.lang.String", "\nexports"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$0x1F", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"1.5ee300"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "getModule", ""}, {"com.google.javascript.jscomp.ProcessCommonJSModules", "getModule", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$1.5ee300", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"m2odulle"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "getModule", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$m2odulle", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"5.", "a,b,,c"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$5.", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:1>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:4>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "getModule", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:4>"}, {"com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", "java.lang.String", "HI`"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.25", "I1e1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$1.25", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{".0"}, false, 4, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"I1"}, false, 1, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "getModule", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$I1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"SITLE", "X"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$SITLE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"1.1234567"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$1.1234567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"-1.5"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", "java.lang.String", "P1H"}, {"com.google.javascript.jscomp.ProcessCommonJSModules", "getModule", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$_1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.5e300", "-41.5"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$1.5e300", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"1.c6d"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$1.c6d", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"u"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$u", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"-1.0"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$_1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"a\u00e9"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$a\u00e9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"0x"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$0x", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"Tile-1.5"}, false, 7, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", "java.lang.String", "1.12345678901234567"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$Tile_1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"PT1H-1"}, false, 3, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", "java.lang.String", "-,11"}, {"com.google.javascript.jscomp.ProcessCommonJSModules", "getModule", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$PT1H_1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0x123456789", "$$1.5e300"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$0x123456789", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"1true"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$1true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"!"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$!", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"/..."}, false, 2, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "getModule", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$...", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"\n,"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", "java.lang.String", "5"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$\n,", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"Hnllo, World"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$Hnllo, World", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{""}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"1E-5"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$1E_5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"11.5ff"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", "java.lang.String", "^[."}, {"com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", "java.lang.String", ".."}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$11.5ff", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"-1P"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$_1P", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{",1.0", "1.123456678"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$,1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1e10", "\\#"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$1e10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{".."}, false, 0, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$..", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"PT1T", "Hello, World-1.5"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$PT1T", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.13345667", "/..."}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$1.13345667", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"<0x"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$<0x", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"-0.00"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$_0.00", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.25Title1L", "exportsi"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$1.25Title1L", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<null>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<null>", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\037", "-"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$\037", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"12:30945", "HeIllo, World"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$12:30945", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2.5fi", "010"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$2.5fi", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"020", "H"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$020", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"2.1234u67"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$2.1234u67", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"a\u00e9010", "1l.5"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$a\u00e9010", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.124567890123456", "0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$1.124567890123456", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"googHello, World"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$googHello, World", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.5erequire", "`bc"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$1.5erequire", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"a,b,c"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$a,b,c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"00.x1F", "-0.0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$00.x1F", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"0x2F"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$0x2F", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0", "module$"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "getModule", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0xFGFFFFFF", "exposts"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$0xFGFFFFFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"module.exporus."}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$module.exporus.", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"2022"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$2022", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"2020-01-012020-02-30T25:61:61"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$2020_01_012020_02_30T25:61:61", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"I", "\\.is$"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$I", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"12:3045provide"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$12:3045provide", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"-1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$_1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"1.51E-5"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$1.51E_5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"provide^\\."}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$provide^\\.", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"-1.5r"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$_1.5r", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"-0.00module"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$_0.00module", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"./5", "module$$"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"./5a a", "--1"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"../", "1/25"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$", String.valueOf(actual));
 }
}
