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
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "com.google.javascript.jscomp.JSModule[]"}, new String[]{"<sample:0>", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.AbstractCommandLineRunner$FlagUsageException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "com.google.javascript.jscomp.JSModule[]"}, new String[]{"<sample:0>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createJsModules", new String[]{"java.util.List", "java.util.List"}, new String[]{"<empty>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getCommandLineConfig", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getCommandLineConfig", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "processResults", "com.google.javascript.jscomp.Result,com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "<sample:7>", "<sample:2>", "<sample:4>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getCommandLineConfig", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getCommandLineConfig", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "processResults", "com.google.javascript.jscomp.Result,com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "<sample:7>", "<sample:2>", "<sample:4>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "writeOutput", new String[]{"java.io.PrintStream", "com.google.javascript.jscomp.Compiler", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"<sample:0>", "<sample:0>", "1.25", "PT1H", "off"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "writeOutput", new String[]{"java.io.PrintStream", "com.google.javascript.jscomp.Compiler", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "<sample:6>", "1.15e", "Qf1", "pfT1"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createExterns", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getCompiler", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createDefineReplacements", new String[]{"java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:0>", "<sample:4>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "run", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "run", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Compiler", actual.getClass().getName());
  assertEquals("{getAstDotGraph=, getErrorCount=!NullPointerException, getErrors=!NullPointerException, getMessages=!NullPointerException, getWarningCount=!NullPointerException, getWarnings=!NullPointerException, has...#307#49963817", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "processResults", new String[]{"com.google.javascript.jscomp.Result", "com.google.javascript.jscomp.JSModule[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:3>", "<empty>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "processResults", "com.google.javascript.jscomp.Result,com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "<sample:1>", "<sample:0>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Compiler", actual.getClass().getName());
  assertEquals("{getAstDotGraph=, getErrorCount=!NullPointerException, getErrors=!NullPointerException, getMessages=!NullPointerException, getWarningCount=!NullPointerException, getWarnings=!NullPointerException, has...#307#49963817", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "writeOutput", new String[]{"java.io.PrintStream", "com.google.javascript.jscomp.Compiler", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "<sample:1>", "2./", "PRINT_IN", "8eblo, World"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "writeOutput", new String[]{"java.io.PrintStream", "com.google.javascript.jscomp.Compiler", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"<empty>", "<sample:1>", "2./", "PRINT_IN", "8eblo, World"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "run", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "writeOutput", new String[]{"java.io.PrintStream", "com.google.javascript.jscomp.Compiler", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", "<sample:6>", "om", ".6", "null"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "initOptionsFromFlags", new String[]{"com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "run", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createDefineReplacements", new String[]{"java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:1>", "<sample:4>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "initOptionsFromFlags", new String[]{"com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createCompiler", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "initOptionsFromFlags", new String[]{"com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:4>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "doRun", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "doRun", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", "com.google.javascript.jscomp.CompilerOptions", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createExterns", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createExterns", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createExterns", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", new String[]{"com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:6>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "com.google.javascript.jscomp.JSModule[]"}, new String[]{"<empty>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{=, sample=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "com.google.javascript.jscomp.JSModule[]"}, new String[]{"<sample:0>", "<sample:1>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.AbstractCommandLineRunner$FlagUsageException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getCompiler", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "processResults", new String[]{"com.google.javascript.jscomp.Result", "com.google.javascript.jscomp.JSModule[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:3>", "<sample:0>", "<sample:7>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "run", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", new String[]{"com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createCompiler", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "com.google.javascript.jscomp.JSModule[]"}, new String[]{"<null>", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "com.google.javascript.jscomp.JSModule[]"}, new String[]{"<empty>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{0=, =, a=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "com.google.javascript.jscomp.JSModule[]"}, new String[]{"<empty>", "<sample:2>"}, true), new String[][]{{"remove", "java.lang.Object,java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getCompiler", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getDiagnosticGroups", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getCompiler", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.DiagnosticGroups", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getDiagnosticGroups", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getCompiler", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.DiagnosticGroups", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getDiagnosticGroups", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getCompiler", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.DiagnosticGroups", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "com.google.javascript.jscomp.JSModule[]"}, new String[]{"<empty>", "<sample:5>"}, true), new String[][]{{"remove", "java.lang.Object,java.lang.Object", "7"}, {"isEmpty", "", "3"}, {"containsKey", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getCommandLineConfig", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getDiagnosticGroups", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "doRun", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getCommandLineConfig", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createCompiler", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "com.google.javascript.jscomp.JSModule[]"}, new String[]{"<sample:1>", "<sample:2>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.AbstractCommandLineRunner$FlagUsageException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createJsModules", new String[]{"java.util.List", "java.util.List"}, new String[]{"<sample:3>", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.AbstractCommandLineRunner$FlagUsageException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", new String[]{"com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getDiagnosticGroups", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"getTopScope", "", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "doRun", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 8, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Compiler", actual.getClass().getName());
  assertEquals("{getAstDotGraph=, getErrorCount=!NullPointerException, getErrors=!NullPointerException, getMessages=!NullPointerException, getWarningCount=!NullPointerException, getWarnings=!NullPointerException, has...#307#49963817", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 8, new String[][]{}, 1), new String[][]{{"compile", "com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createCompiler", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", ""}}), new String[][]{{"compile", "com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 20, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createCompiler", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", ""}}), new String[][]{{"getResult", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getCommandLineConfig", new String[]{}, new String[]{}, false, 27, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", "com.google.javascript.jscomp.CompilerOptions", "<sample:3>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createDefineReplacements", new String[]{"java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:0>", "<sample:5>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createDefineReplacements", new String[]{"java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<null>", "<sample:4>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createDefineReplacements", new String[]{"java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:2>", "<sample:2>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createDefineReplacements", new String[]{"java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:1>", "<sample:2>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "run", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "processResults", "com.google.javascript.jscomp.Result,com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "<sample:5>", "<sample:1>", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "run", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getDiagnosticGroups", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getCompiler", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getCompiler", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getDiagnosticGroups", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.DiagnosticGroups", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "doRun", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Compiler", actual.getClass().getName());
  assertEquals("{getAstDotGraph=, getErrorCount=!NullPointerException, getErrors=!NullPointerException, getMessages=!NullPointerException, getWarningCount=!NullPointerException, getWarnings=!NullPointerException, has...#307#49963817", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createJsModules", new String[]{"java.util.List", "java.util.List"}, new String[]{"<sample:2>", "<sample:2>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.AbstractCommandLineRunner$FlagUsageException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "run", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "getDiagnosticGroups", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "getCommandLineConfig", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "run", ""}}, 3), new String[][]{{"check", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "processResults", new String[]{"com.google.javascript.jscomp.Result", "com.google.javascript.jscomp.JSModule[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<null>", "<sample:0>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "processResults", "com.google.javascript.jscomp.Result,com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "<sample:5>", "<sample:2>", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getDiagnosticGroups", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "processResults", "com.google.javascript.jscomp.Result,com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "<sample:7>", "<sample:2>", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "getDiagnosticGroups", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "processResults", "com.google.javascript.jscomp.Result,com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "<sample:7>", "<sample:3>", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "initOptionsFromFlags", new String[]{"com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<null>"}, false, 11, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "processResults", "com.google.javascript.jscomp.Result,com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "<sample:1>", "<empty>", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "processResults", new String[]{"com.google.javascript.jscomp.Result", "com.google.javascript.jscomp.JSModule[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:0>", "<empty>", "<sample:0>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getCompiler", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getCompiler", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "writeOutput", new String[]{"java.io.PrintStream", "com.google.javascript.jscomp.Compiler", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", "<sample:5>", "Illegal boolean value: ", "1.5f", "1e10"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}}), new String[][]{{"getErrorManager", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.LoggerErrorManager", actual.getClass().getName());
  assertEquals("{getErrorCount=0, getErrors=[], getTypedPercent=0.0, getWarningCount=0, getWarnings=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}}, 1), new String[][]{{"getErrorManager", "", "1"}, {"generateReport", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.LoggerErrorManager", actual.getClass().getName());
  assertEquals("{getErrorCount=0, getErrors=[], getTypedPercent=0.0, getWarningCount=0, getWarnings=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 26, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "doRun", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "doRun", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "initOptionsFromFlags", "com.google.javascript.jscomp.CompilerOptions", "<sample:7>"}}, 1), new String[][]{{"init", "com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.CompilerOptions", "2"}, {"toSource", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "doRun", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", "com.google.javascript.jscomp.CompilerOptions", "<sample:6>"}, {"com.google.javascript.jscomp.CommandLineRunner", "initOptionsFromFlags", "com.google.javascript.jscomp.CompilerOptions", "<sample:7>"}}, 1), new String[][]{{"init", "com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.CompilerOptions", "6"}, {"getErrorCount", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "doRun", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", "com.google.javascript.jscomp.CompilerOptions", "<sample:6>"}, {"com.google.javascript.jscomp.CommandLineRunner", "initOptionsFromFlags", "com.google.javascript.jscomp.CompilerOptions", "<sample:7>"}}, 1), new String[][]{{"getCodingConvention", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getCompiler", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "doRun", ""}}, 2), new String[][]{{"compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getCommandLineConfig", ""}}, 3), new String[][]{{"getState", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Compiler$IntermediateState", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 23, new String[][]{}), new String[][]{{"disableThreads", "", "4"}, {"parse", "com.google.javascript.jscomp.JSSourceFile", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.ScriptOrFnNode", actual.getClass().getName());
  assertEquals("SCRIPT [source name: null] [encoded source length: 0] [base line: -1] [end line: -1] 1 [sourcename: ] [synthetic: 1] {getBaseLineno=-1, getCharno=0, getChildCount=1, getDouble=!UnsupportedOperationExc...#454#1720654586", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createDefineReplacements", new String[]{"java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:1>", "<sample:2>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createJsModules", new String[]{"java.util.List", "java.util.List"}, new String[]{"<sample:2>", "<sample:3>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.AbstractCommandLineRunner$FlagUsageException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "initOptionsFromFlags", "com.google.javascript.jscomp.CompilerOptions", "<sample:7>"}}, 2), new String[][]{{"hasErrors", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "initOptionsFromFlags", "com.google.javascript.jscomp.CompilerOptions", "<sample:7>"}}, 2), new String[][]{{"getErrorManager", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.LoggerErrorManager", actual.getClass().getName());
  assertEquals("{getErrorCount=0, getErrors=[], getTypedPercent=0.0, getWarningCount=0, getWarnings=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "main", new String[]{"java.lang.String[]"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", new String[]{"com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:7>"}, false, 13, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "initOptionsFromFlags", "com.google.javascript.jscomp.CompilerOptions", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "com.google.javascript.jscomp.JSModule[]"}, new String[]{"<sample:1>", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "com.google.javascript.jscomp.JSModule[]"}, new String[]{"<empty>", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3), new String[][]{{"compile", "com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createJsModules", new String[]{"java.util.List", "java.util.List"}, new String[]{"<sample:3>", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "run", ""}}, 3), new String[][]{{"getAstDotGraph", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "run", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", "com.google.javascript.jscomp.CompilerOptions", "<sample:6>"}}, 2), new String[][]{{"getState", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Compiler$IntermediateState", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createJsModules", new String[]{"java.util.List", "java.util.List"}, new String[]{"<sample:2>", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createJsModules", new String[]{"java.util.List", "java.util.List"}, new String[]{"<sample:2>", "<sample:0>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.AbstractCommandLineRunner$FlagUsageException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "com.google.javascript.jscomp.JSModule[]"}, new String[]{"<null>", "<sample:1>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "com.google.javascript.jscomp.JSModule[]"}, new String[]{"<empty>", "<sample:1>"}, true, 0, null, 1), new String[][]{{"remove", "java.lang.Object", "2"}, {"getOrDefault", "java.lang.Object,java.lang.Object", "4"}, {"replace", "java.lang.Object,java.lang.Object", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "com.google.javascript.jscomp.JSModule[]"}, new String[]{"<sample:0>", "<sample:1>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.AbstractCommandLineRunner$FlagUsageException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "com.google.javascript.jscomp.JSModule[]"}, new String[]{"<sample:4>", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "writeOutput", new String[]{"java.io.PrintStream", "com.google.javascript.jscomp.Compiler", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "<sample:3>", "true09FFFFFFFF", "2147483648", "U"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "doRun", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}}, 1), new String[][]{{"getSourceLine", "java.lang.String,int", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "com.google.javascript.jscomp.JSModule[]"}, new String[]{"<empty>", "<empty>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "com.google.javascript.jscomp.JSModule[]"}, new String[]{"<empty>", "<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{=, sample=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createJsModules", new String[]{"java.util.List", "java.util.List"}, new String[]{"<null>", "<empty>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createDefineReplacements", new String[]{"java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<null>", "<sample:7>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false), new String[][]{{"init", "com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.CompilerOptions", "5"}, {"getReverseAbstractInterpreter", "", "0"}, {"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope,boolean", "2"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false), new String[][]{{"init", "com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.CompilerOptions", "5"}, {"getReverseAbstractInterpreter", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SemanticReverseAbstractInterpreter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "run", ""}}, 3), new String[][]{{"init", "com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.CompilerOptions", "5"}, {"getReverseAbstractInterpreter", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SemanticReverseAbstractInterpreter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false), new String[][]{{"getTypeRegistry", "", "0"}, {"registerPropertyOnType", "java.lang.String,com.google.javascript.rhino.jstype.ObjectType", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSTypeRegistry", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}}, 2), new String[][]{{"getTypeRegistry", "", "0"}, {"registerPropertyOnType", "java.lang.String,com.google.javascript.rhino.jstype.ObjectType", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSTypeRegistry", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "com.google.javascript.jscomp.JSModule[]"}, new String[]{"<empty>", "<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{a=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createDefineReplacements", new String[]{"java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<null>", "<sample:6>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "doRun", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "writeOutput", new String[]{"java.io.PrintStream", "com.google.javascript.jscomp.Compiler", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "<sample:2>", "-1.5", " ", "1.12345678901234567"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createDefineReplacements", new String[]{"java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:4>", "<sample:1>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createDefineReplacements", new String[]{"java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<null>", "<sample:6>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "com.google.javascript.jscomp.JSModule[]"}, new String[]{"<empty>", "<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{0=, sample=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createDefineReplacements", new String[]{"java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<empty>", "<sample:6>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "com.google.javascript.jscomp.JSModule[]"}, new String[]{"<null>", "<sample:0>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getCommandLineConfig", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "getDiagnosticGroups", ""}}, 3), new String[][]{{"getErrorManager", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.LoggerErrorManager", actual.getClass().getName());
  assertEquals("{getErrorCount=0, getErrors=[], getTypedPercent=0.0, getWarningCount=0, getWarnings=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "main", new String[]{"java.lang.String[]"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "main", new String[]{"java.lang.String[]"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "com.google.javascript.jscomp.JSModule[]"}, new String[]{"<empty>", "<empty>"}, true, 0, null, 1), new String[][]{{"put", "java.lang.Object,java.lang.Object", "6"}, {"containsKey", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "com.google.javascript.jscomp.JSModule[]"}, new String[]{"<sample:3>", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createCompiler", ""}}, 1), new String[][]{{"getState", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Compiler$IntermediateState", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "com.google.javascript.jscomp.JSModule[]"}, new String[]{"<empty>", "<sample:1>"}, true, 0, null, 2), new String[][]{{"containsValue", "java.lang.Object", "4"}, {"putAll", "java.util.Map", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{=, key0=sample, key1=, sample=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 14, new String[][]{}, 3), new String[][]{{"getErrorManager", "", "5"}, {"getErrors", "", "2"}});
  assertNotNull(actual);
  assertEquals("[Lcom.google.javascript.jscomp.JSError;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "processResults", "com.google.javascript.jscomp.Result,com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "<sample:7>", "<sample:2>", "<sample:9>"}, {"com.google.javascript.jscomp.CommandLineRunner", "createCompiler", ""}}, 2), new String[][]{{"init", "com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "0"}, {"check", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 21, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getCompiler", ""}}, 2), new String[][]{{"init", "com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "0"}, {"getErrors", "", "6"}});
  assertNotNull(actual);
  assertEquals("[Lcom.google.javascript.jscomp.JSError;", actual.getClass().getName());
  assertEquals("[JSC_EMPTY_ROOT_MODULE_ERROR. Root module {0} must contain at least one source code input at (unknown source) line (unknown line)]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "com.google.javascript.jscomp.JSModule[]"}, new String[]{"<null>", "<sample:1>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "com.google.javascript.jscomp.JSModule[]"}, new String[]{"<empty>", "<sample:1>"}, true, 0, null, 3), new String[][]{{"get", "java.lang.Object", "6"}, {"values", "", "2"}, {"add", "java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "com.google.javascript.jscomp.JSModule[]"}, new String[]{"<empty>", "<sample:0>"}, true, 0, null, 2), new String[][]{{"get", "java.lang.Object", "1"}, {"getOrDefault", "java.lang.Object,java.lang.Object", "0"}, {"remove", "java.lang.Object", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "com.google.javascript.jscomp.JSModule[]"}, new String[]{"<empty>", "<empty>"}, true, 0, null, 2), new String[][]{{"getOrDefault", "java.lang.Object,java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "com.google.javascript.jscomp.JSModule[]"}, new String[]{"<empty>", "<sample:0>"}, true, 0, null, 3), new String[][]{{"entrySet", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$EntrySet", actual.getClass().getName());
  assertEquals("[0=]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "main", new String[]{"java.lang.String[]"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "com.google.javascript.jscomp.JSModule[]"}, new String[]{"<empty>", "<empty>"}, true, 0, null, 3), new String[][]{{"values", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$Values", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "com.google.javascript.jscomp.JSModule[]"}, new String[]{"<empty>", "<sample:1>"}, true, 0, null, 1), new String[][]{{"remove", "java.lang.Object,java.lang.Object", "7"}, {"clone", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{=, sample=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "com.google.javascript.jscomp.JSModule[]"}, new String[]{"<empty>", "<sample:2>"}, true, 0, null, 1), new String[][]{{"get", "java.lang.Object", "1"}, {"clone", "", "6"}, {"replace", "java.lang.Object,java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "com.google.javascript.jscomp.JSModule[]"}, new String[]{"<empty>", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{0=, =, a=}", SearchInputFactory_scaffolding.observe(actual));
 }
}
