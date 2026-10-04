package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\\.js$", "0x123456789"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$\\.js$", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\\.js$", "0x123456789"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$\\.js$", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<null>", "nx123456789"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"module", "mx123456789module"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$module", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "./"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"x", "./"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$x", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"module$exports", "/</"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$module$exports", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"module$e1xports", "/</"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$module$e1xports", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<sample:1>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"a"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{""}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:13>", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "getModule", ""}, {"com.google.javascript.jscomp.ProcessCommonJSModules", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:6>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"i"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$i", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"1L"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$1L", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"1-L"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$1_L", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"1-L"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$1_L", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"1-"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$1_", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"1."}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$1.", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"0."}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$0.", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"lodule"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$lodule", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"lodtle"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$lodtle", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"ldtle"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$ldtle", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"module.exports"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$module.exports", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"cmodule.exprts"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$cmodule.exprts", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"cmpdule.exprts"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$cmpdule.exprts", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"cmpdule.xprts"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$cmpdule.xprts", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"cmpdulf.xrts"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$cmpdulf.xrts", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"cmpdukf.xrts"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$cmpdukf.xrts", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"Tietl"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$Tietl", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:5>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"^\\."}, false, 0, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", "java.lang.String", "PT1H"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$^$.", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:5>"}, {"com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", "java.lang.String", "B.258"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"abc", "0x123456789"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$abc", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"abc", "0x123456789"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$abc", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"ac", "0x123456789"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$ac", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"1E-5"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", "java.lang.String", "/"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$1E_5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"1E-f5"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", "java.lang.String", "/"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$1E_f5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"HJ"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$HJ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"/"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$$", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"p"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$p", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"9p"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$9p", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"$$"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$$$", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"$$r"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$$$r", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"s$$r"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$s$$r", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"s$#rPT1G$$"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$s$#rPT1G$$", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"s#rPT1G$$"}, false, 8, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$s#rPT1G$$", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"true", ".5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "getModule", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", "java.lang.String", "1.5e300"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:9>", "<sample:7>"}, false, 10, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", "java.lang.String", "/"}, {"com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", "java.lang.String", ","}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"abC1Wnull"}, false, 6, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", "java.lang.String", "r<qtire2020-02-30T25:61:61"}, {"com.google.javascript.jscomp.ProcessCommonJSModules", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:7>"}, {"com.google.javascript.jscomp.ProcessCommonJSModules", "getModule", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$abC1Wnull", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"abC1WFnull"}, false, 6, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", "java.lang.String", "r<qtire2020-02-30T25:61:61"}, {"com.google.javascript.jscomp.ProcessCommonJSModules", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:7>"}, {"com.google.javascript.jscomp.ProcessCommonJSModules", "getModule", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$abC1WFnull", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.12345678901234567", "trte"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$1.12345678901234567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0x123456789", "rte"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$0x123456789", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1..12345678901234567", "trte"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$1..12345678901234567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"_"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$_", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"2_"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$2_", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"2_2147483648"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$2_2147483648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"2_21 7483648"}, false, 14, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$2_21 7483648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0", "o"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"/", "o"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$$", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"E/", "o"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$E$", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"EE/", "o"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$EE$", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"ED/", "p"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$ED$", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:1>"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"_"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$_", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "getModule", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", "java.lang.String", "a"}, {"com.google.javascript.jscomp.ProcessCommonJSModules", "getModule", ""}, {"com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", "java.lang.String", "0.5"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "getModule", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:13>", "<sample:5>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567801.5"}, false, 10, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:13>", "<sample:9>"}, {"com.google.javascript.jscomp.ProcessCommonJSModules", "getModule", ""}, {"com.google.javascript.jscomp.ProcessCommonJSModules", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$123456789012345678901234567801.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.1234567", "PT1H"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$1.1234567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"k161\n2", "Pc1.4f0x123156789010modulle.exports"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$k161\n2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"k1611\n2", "Pc1.4f0x123156789010modulle.exports-1.5"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$k1611\n2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"k161f\n2", "1e10"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$k161f\n2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "getModule", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "getModule", ""}, {"com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", "java.lang.String", "123456789012345678901234567890"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"Title"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "getModule", ""}, {"com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", "java.lang.String", "123456789012345678901234567890"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$Title", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"OT:", "r\\owidde1.C51.5d"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$OT:", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"O:", "r\\owidde1.C51b5d"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$O:", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"O:module$", "<r\\oxidde1.C51b5d"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$O:module$", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:13>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$1.12345678", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"i"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", "java.lang.String", "+1"}, {"com.google.javascript.jscomp.ProcessCommonJSModules", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:12>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$i", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"^8"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:13>", "<sample:6>"}, {"com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", "java.lang.String", "j1.1234567"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$^8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"./", "0xFFFFFFFF"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"module.exports"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$module.exports", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"_", "0xFFFFFFFF"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$_", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Title", "./"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$Title", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"*1"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$*1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{".7bee2t21.5e3090"}, false, 12, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "getModule", ""}, {"com.google.javascript.jscomp.ProcessCommonJSModules", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:12>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$.7bee2t21.5e3090", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"\005"}, false, 2, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:13>", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$\005", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"\005"}, false, 5, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:13>", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$\005", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"kFl"}, false, 6, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:9>", "<sample:13>"}, {"com.google.javascript.jscomp.ProcessCommonJSModules", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:7>"}, {"com.google.javascript.jscomp.ProcessCommonJSModules", "getModule", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$kFl", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "guessCJSModuleName", new String[]{"java.lang.String"}, new String[]{"module$"}, false, 7, new String[][]{{"com.google.javascript.jscomp.ProcessCommonJSModules", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:9>", "<sample:12>"}, {"com.google.javascript.jscomp.ProcessCommonJSModules", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$module$", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"I"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$I", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"-0.0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$_0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"module.exports", "null"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$module.exports", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"a"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0xEFFFFFFF", "1.25"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$0xEFFFFFFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"./", "1.1234567"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"./1.1234567", "1.1234567"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$1.1234567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"./1.1234567 ", "1.1234567"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"i2aE"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$i2aE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"i2`E"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$i2`E", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"a"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"2"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{"3"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessCommonJSModules", "com.google.javascript.jscomp.ProcessCommonJSModules", "toModuleName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"../", "2020-01-01"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("module$..$", String.valueOf(actual));
 }
}
