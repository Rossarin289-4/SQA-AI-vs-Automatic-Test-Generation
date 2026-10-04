package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "expandManifest", new String[]{"com.google.javascript.jscomp.JSModule"}, new String[]{"<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "doRun", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "doRun", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getCommandLineConfig", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createJsModules", new String[]{"java.util.List", "java.util.List"}, new String[]{"<sample:0>", "<sample:0>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createCompiler", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.AbstractCommandLineRunner$FlagUsageException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getCommandLineConfig", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "run", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "isInTestMode", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "shouldRunCompiler", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "isInTestMode", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "shouldRunCompiler", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getCompiler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getCompiler", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getCompiler", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getCompiler", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getDiagnosticGroups", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.DiagnosticGroups", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "initOptionsFromFlags", new String[]{"com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Compiler", actual.getClass().getName());
  assertEquals("{getAstDotGraph=, getErrorCount=!NullPointerException, getErrors=!NullPointerException, getMessages=!NullPointerException, getWarningCount=!NullPointerException, getWarnings=!NullPointerException, has...#307#49963817", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.CompilerOptions", actual.getClass().getName());
  assertEquals("{isExternExportsEnabled=false, shouldColorizeErrorOutput=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createExterns", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "initOptionsFromFlags", new String[]{"com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphManifestTo", "com.google.javascript.jscomp.JSModuleGraph,java.lang.Appendable", "<null>", "<null>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "isInTestMode", ""}}, 2), new String[][]{{"setRemoveClosureAsserts", "boolean", "2"}, {"setDefineToNumberLiteral", "java.lang.String,int", "7"}, {"skipAllCompilerPasses", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.CompilerOptions", actual.getClass().getName());
  assertEquals("{isExternExportsEnabled=false, shouldColorizeErrorOutput=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "shouldRunCompiler", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false), new String[][]{{"setProcessObjectPropertyString", "boolean", "2"}, {"getDefineReplacements", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 45, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getDiagnosticGroups", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphManifestTo", "com.google.javascript.jscomp.JSModuleGraph,java.lang.Appendable", "<sample:7>", "<sample:0>"}}, 3), new String[][]{{"setWarningLevel", "com.google.javascript.jscomp.DiagnosticGroup,com.google.javascript.jscomp.CheckLevel", "5"}, {"setDefineToNumberLiteral", "java.lang.String,int", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.CompilerOptions", actual.getClass().getName());
  assertEquals("{isExternExportsEnabled=false, shouldColorizeErrorOutput=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", new String[]{"com.google.common.base.Supplier", "com.google.common.base.Supplier", "com.google.common.base.Supplier", "com.google.common.base.Function"}, new String[]{"<null>", "<sample:6>", "<sample:2>", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", "com.google.javascript.jscomp.CompilerOptions", "<sample:1>"}, {"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "initOptionsFromFlags", "com.google.javascript.jscomp.CompilerOptions", "<sample:5>"}}, 1), new String[][]{{"skipAllCompilerPasses", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.CompilerOptions", actual.getClass().getName());
  assertEquals("{isExternExportsEnabled=false, shouldColorizeErrorOutput=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createExterns", new String[]{}, new String[]{}, false, 36, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createCompiler", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "initOptionsFromFlags", "com.google.javascript.jscomp.CompilerOptions", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", new String[]{"com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "initOptionsFromFlags", "com.google.javascript.jscomp.CompilerOptions", "<sample:4>"}, {"com.google.javascript.jscomp.CommandLineRunner", "createCompiler", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", new String[]{"com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:0>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "initOptionsFromFlags", "com.google.javascript.jscomp.CompilerOptions", "<sample:0>"}, {"com.google.javascript.jscomp.CommandLineRunner", "getDiagnosticGroups", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphManifestTo", new String[]{"com.google.javascript.jscomp.JSModuleGraph", "java.lang.Appendable"}, new String[]{"<null>", "<sample:0>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphManifestTo", new String[]{"com.google.javascript.jscomp.JSModuleGraph", "java.lang.Appendable"}, new String[]{"<sample:1>", "<sample:0>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphManifestTo", new String[]{"com.google.javascript.jscomp.JSModuleGraph", "java.lang.Appendable"}, new String[]{"<sample:3>", "<sample:1>"}, false, 9, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createCompiler", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "createCompiler", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "writeOutput", new String[]{"java.lang.Appendable", "com.google.javascript.jscomp.Compiler", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "<sample:7>", "1.1234567", "-1.5", "1.5f"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphManifestTo", new String[]{"com.google.javascript.jscomp.JSModuleGraph", "java.lang.Appendable"}, new String[]{"<sample:2>", "<null>"}, false, 9, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createCompiler", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "createCompiler", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "writeOutput", new String[]{"java.lang.Appendable", "com.google.javascript.jscomp.Compiler", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"<empty>", "<sample:6>", "no", "0", "Hello, World"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "expandManifest", new String[]{"com.google.javascript.jscomp.JSModule"}, new String[]{"<sample:6>"}, false, 6, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", new String[]{"com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<null>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getCommandLineConfig", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", new String[]{"com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<null>"}, false, 13, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "java.util.List"}, new String[]{"<sample:1>", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Compiler", actual.getClass().getName());
  assertEquals("{getAstDotGraph=, getErrorCount=!NullPointerException, getErrors=!NullPointerException, getMessages=!NullPointerException, getWarningCount=!NullPointerException, getWarnings=!NullPointerException, has...#307#49963817", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "java.util.List"}, new String[]{"<sample:2>", "<sample:3>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createJsModules", new String[]{"java.util.List", "java.util.List"}, new String[]{"<empty>", "<empty>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getDiagnosticGroups", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createCompiler", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "expandSourceMapPath", "com.google.javascript.jscomp.CompilerOptions,com.google.javascript.jscomp.JSModule", "<null>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.io.PrintStream", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.io.PrintStream", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "processResults", new String[]{"com.google.javascript.jscomp.Result", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:7>", "<null>", "<sample:1>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "expandSourceMapPath", "com.google.javascript.jscomp.CompilerOptions,com.google.javascript.jscomp.JSModule", "<sample:3>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "processResults", new String[]{"com.google.javascript.jscomp.Result", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:9>", "<null>", "<sample:1>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "expandSourceMapPath", "com.google.javascript.jscomp.CompilerOptions,com.google.javascript.jscomp.JSModule", "<sample:3>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "expandSourceMapPath", new String[]{"com.google.javascript.jscomp.CompilerOptions", "com.google.javascript.jscomp.JSModule"}, new String[]{"<sample:4>", "<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getCompiler", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphManifestTo", "com.google.javascript.jscomp.JSModuleGraph,java.lang.Appendable", "<sample:1>", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "expandSourceMapPath", new String[]{"com.google.javascript.jscomp.CompilerOptions", "com.google.javascript.jscomp.JSModule"}, new String[]{"<sample:4>", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createCompiler", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "getCompiler", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphManifestTo", "com.google.javascript.jscomp.JSModuleGraph,java.lang.Appendable", "<sample:1>", "<sample:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "expandSourceMapPath", new String[]{"com.google.javascript.jscomp.CompilerOptions", "com.google.javascript.jscomp.JSModule"}, new String[]{"<null>", "<null>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getCompiler", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "shouldRunCompiler", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "processResults", "com.google.javascript.jscomp.Result,java.util.List,com.google.javascript.jscomp.CompilerOptions", "<sample:3>", "<empty>", "<sample:4>"}}), new String[][]{{"getTopScope", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "processResults", "com.google.javascript.jscomp.Result,java.util.List,com.google.javascript.jscomp.CompilerOptions", "<sample:3>", "<empty>", "<sample:4>"}}), new String[][]{{"getTopScope", "", "4"}, {"toSourceArray", "com.google.javascript.jscomp.JSModule", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "isInTestMode", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "processResults", "com.google.javascript.jscomp.Result,java.util.List,com.google.javascript.jscomp.CompilerOptions", "<sample:1>", "<empty>", "<null>"}, {"com.google.javascript.jscomp.CommandLineRunner", "getCompiler", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "isInTestMode", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createCompiler", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "processResults", "com.google.javascript.jscomp.Result,java.util.List,com.google.javascript.jscomp.CompilerOptions", "<sample:1>", "<null>", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "processResults", new String[]{"com.google.javascript.jscomp.Result", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:2>", "<null>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "isInTestMode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "doRun", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "doRun", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "shouldRunCompiler", ""}}), new String[][]{{"checkError", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "doRun", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "shouldRunCompiler", ""}}, 1), new String[][]{{"println", "char[]", "7"}, {"println", "char", "7"}});
  assertNotNull(actual);
  assertEquals("java.io.PrintStream", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getCommandLineConfig", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createExterns", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphManifestTo", "com.google.javascript.jscomp.JSModuleGraph,java.lang.Appendable", "<sample:2>", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "expandSourceMapPath", new String[]{"com.google.javascript.jscomp.CompilerOptions", "com.google.javascript.jscomp.JSModule"}, new String[]{"<null>", "<sample:0>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "doRun", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "isInTestMode", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "expandSourceMapPath", new String[]{"com.google.javascript.jscomp.CompilerOptions", "com.google.javascript.jscomp.JSModule"}, new String[]{"<null>", "<sample:7>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createJsModules", "java.util.List,java.util.List", "<sample:1>", "<sample:0>"}, {"com.google.javascript.jscomp.CommandLineRunner", "doRun", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "isInTestMode", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "java.util.List"}, new String[]{"<sample:3>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "shouldRunCompiler", new String[]{}, new String[]{}, false, 17, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getDefaultExterns", new String[]{}, new String[]{}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getDiagnosticGroups", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "isInTestMode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.DiagnosticGroups", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "expandSourceMapPath", new String[]{"com.google.javascript.jscomp.CompilerOptions", "com.google.javascript.jscomp.JSModule"}, new String[]{"<sample:7>", "<sample:6>"}, false, 14, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "expandSourceMapPath", new String[]{"com.google.javascript.jscomp.CompilerOptions", "com.google.javascript.jscomp.JSModule"}, new String[]{"<sample:8>", "<sample:6>"}, false, 14, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createDefineReplacements", new String[]{"java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:2>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "java.util.List"}, new String[]{"<empty>", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "java.util.List"}, new String[]{"<sample:0>", "<empty>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.AbstractCommandLineRunner$FlagUsageException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", new String[]{"com.google.common.base.Supplier", "com.google.common.base.Supplier", "com.google.common.base.Supplier", "com.google.common.base.Function"}, new String[]{"<sample:4>", "<sample:6>", "<sample:1>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", "com.google.javascript.jscomp.CompilerOptions", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", new String[]{"com.google.common.base.Supplier", "com.google.common.base.Supplier", "com.google.common.base.Supplier", "com.google.common.base.Function"}, new String[]{"<sample:5>", "<sample:6>", "<sample:6>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getCommandLineConfig", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "shouldRunCompiler", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", new String[]{"com.google.common.base.Supplier", "com.google.common.base.Supplier", "com.google.common.base.Supplier", "com.google.common.base.Function"}, new String[]{"<sample:0>", "<sample:5>", "<null>", "<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getCommandLineConfig", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", "com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Function", "<sample:1>", "<sample:6>", "<sample:3>", "<sample:7>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "initOptionsFromFlags", new String[]{"com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getDiagnosticGroups", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", "com.google.javascript.jscomp.CompilerOptions", "<sample:6>"}}), new String[][]{{"parse", "com.google.javascript.jscomp.JSSourceFile", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT 1 [sourcename: ] [synthetic: 1] {getCharno=0, getChildCount=1, getDouble=!UnsupportedOperationException, getLineno=1, getQualifiedName=null, getString=!UnsupportedOperationException, getType=13...#403#-1564829997", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "initOptionsFromFlags", "com.google.javascript.jscomp.CompilerOptions", "<sample:3>"}, {"com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "run", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Compiler", actual.getClass().getName());
  assertEquals("{getAstDotGraph=, getErrorCount=!NullPointerException, getErrors=!NullPointerException, getMessages=!NullPointerException, getWarningCount=!NullPointerException, getWarnings=!NullPointerException, has...#307#49963817", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createDefineReplacements", new String[]{"java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:3>", "<sample:5>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", "com.google.javascript.jscomp.CompilerOptions", "<sample:6>"}, {"com.google.javascript.jscomp.CommandLineRunner", "expandSourceMapPath", "com.google.javascript.jscomp.CompilerOptions,com.google.javascript.jscomp.JSModule", "<sample:5>", "<sample:0>"}}), new String[][]{{"write", "byte[],int,int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", "com.google.javascript.jscomp.CompilerOptions", "<sample:6>"}, {"com.google.javascript.jscomp.CommandLineRunner", "expandSourceMapPath", "com.google.javascript.jscomp.CompilerOptions,com.google.javascript.jscomp.JSModule", "<sample:5>", "<sample:0>"}}), new String[][]{{"write", "byte[],int,int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createCompiler", ""}}, 1), new String[][]{{"write", "byte[],int,int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "processResults", new String[]{"com.google.javascript.jscomp.Result", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<null>", "<sample:2>", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "processResults", new String[]{"com.google.javascript.jscomp.Result", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<null>", "<empty>", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", "com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Function", "<sample:1>", "<sample:6>", "<null>", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", new String[]{"com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:5>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createDefineReplacements", new String[]{"java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:0>", "<sample:7>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "java.util.List"}, new String[]{"<null>", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "doRun", new String[]{}, new String[]{}, false, 27, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "expandManifest", "com.google.javascript.jscomp.JSModule", "<sample:1>"}, {"com.google.javascript.jscomp.CommandLineRunner", "createCompiler", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getDefaultExterns", new String[]{}, new String[]{}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "shouldRunCompiler", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createDefineReplacements", new String[]{"java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:0>", "<sample:6>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createDefineReplacements", new String[]{"java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:3>", "<sample:9>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getCompiler", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "processResults", new String[]{"com.google.javascript.jscomp.Result", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:1>", "<empty>", "<sample:5>"}, false, 15, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "doRun", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphManifestTo", "com.google.javascript.jscomp.JSModuleGraph,java.lang.Appendable", "<sample:2>", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "processResults", new String[]{"com.google.javascript.jscomp.Result", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:3>", "<sample:3>", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", "com.google.javascript.jscomp.CompilerOptions", "<sample:7>"}, {"com.google.javascript.jscomp.CommandLineRunner", "doRun", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "processResults", new String[]{"com.google.javascript.jscomp.Result", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:2>", "<empty>", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", "com.google.javascript.jscomp.CompilerOptions", "<sample:7>"}, {"com.google.javascript.jscomp.CommandLineRunner", "doRun", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "java.util.List"}, new String[]{"<sample:0>", "<sample:3>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "main", new String[]{"java.lang.String[]"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "processResults", new String[]{"com.google.javascript.jscomp.Result", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:5>", "<sample:1>", "<sample:7>"}, false, 11, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphManifestTo", "com.google.javascript.jscomp.JSModuleGraph,java.lang.Appendable", "<sample:2>", "<sample:1>"}, {"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "processResults", new String[]{"com.google.javascript.jscomp.Result", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<null>", "<sample:0>", "<sample:3>"}, false, 11, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphManifestTo", "com.google.javascript.jscomp.JSModuleGraph,java.lang.Appendable", "<sample:2>", "<sample:4>"}, {"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "writeOutput", new String[]{"java.lang.Appendable", "com.google.javascript.jscomp.Compiler", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"<empty>", "<sample:4>", "/externs.zip", "1L", "a b"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getCompiler", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "doRun", ""}}, 3), new String[][]{{"shouldColorizeErrorOutput", "", "3"}, {"getDefineReplacements", "", "5"}, {"values", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$Values", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 28, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "doRun", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "expandSourceMapPath", "com.google.javascript.jscomp.CompilerOptions,com.google.javascript.jscomp.JSModule", "<sample:7>", "<sample:0>"}, {"com.google.javascript.jscomp.CommandLineRunner", "processResults", "com.google.javascript.jscomp.Result,java.util.List,com.google.javascript.jscomp.CompilerOptions", "<sample:3>", "<empty>", "<sample:3>"}}, 3), new String[][]{{"shouldColorizeErrorOutput", "", "3"}, {"getDefineReplacements", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 29, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "doRun", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "processResults", "com.google.javascript.jscomp.Result,java.util.List,com.google.javascript.jscomp.CompilerOptions", "<sample:3>", "<empty>", "<sample:3>"}}, 3), new String[][]{{"shouldColorizeErrorOutput", "", "3"}, {"getDefineReplacements", "", "5"}, {"containsValue", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 33, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "doRun", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "processResults", "com.google.javascript.jscomp.Result,java.util.List,com.google.javascript.jscomp.CompilerOptions", "<sample:7>", "<empty>", "<sample:3>"}}, 3), new String[][]{{"shouldColorizeErrorOutput", "", "3"}, {"getDefineReplacements", "", "5"}, {"containsKey", "java.lang.Object", "4"}, {"put", "java.lang.Object,java.lang.Object", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 41, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}}, 1), new String[][]{{"getCodingConvention", "", "4"}, {"getExportPropertyFunction", "", "5"}, {"getExportSymbolFunction", "", "4"}, {"extractClassNameIfRequire", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 45, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}}), new String[][]{{"getCodingConvention", "", "4"}, {"getExportPropertyFunction", "", "5"}, {"getExportSymbolFunction", "", "7"}, {"extractClassNameIfRequire", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 47, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}}), new String[][]{{"getCodingConvention", "", "4"}, {"getExportPropertyFunction", "", "5"}, {"getExportSymbolFunction", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("goog.exportSymbol", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}}, 3), new String[][]{{"getCodingConvention", "", "4"}, {"getExportPropertyFunction", "", "5"}, {"getExportSymbolFunction", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("goog.exportSymbol", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphManifestTo", "com.google.javascript.jscomp.JSModuleGraph,java.lang.Appendable", "<sample:4>", "<sample:0>"}, {"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}}), new String[][]{{"setNameAnonymousFunctionsOnly", "boolean", "4"}, {"setCollapsePropertiesOnExternTypes", "boolean", "5"}, {"isExternExportsEnabled", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphManifestTo", "com.google.javascript.jscomp.JSModuleGraph,java.lang.Appendable", "<sample:4>", "<sample:2>"}, {"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}}), new String[][]{{"getCodingConvention", "", "4"}, {"getExportPropertyFunction", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("goog.exportProperty", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "doRun", ""}}, 2), new String[][]{{"getCodingConvention", "", "4"}, {"getExportPropertyFunction", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("goog.exportProperty", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "doRun", ""}}), new String[][]{{"getCodingConvention", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.ClosureCodingConvention", actual.getClass().getName());
  assertEquals("{getAbstractMethodName=goog.abstractMethod, getDelegateSuperclassName=null, getExportPropertyFunction=goog.exportProperty, getExportSymbolFunction=goog.exportSymbol, getGlobalObject=goog.global}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"getCodingConvention", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 79, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", "com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Function", "<sample:5>", "<sample:1>", "<sample:7>", "<sample:7>"}, {"com.google.javascript.jscomp.CommandLineRunner", "doRun", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", "com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Function", "<sample:1>", "<null>", "<sample:7>", "<sample:7>"}}, 2), new String[][]{{"isExternExportsEnabled", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "expandManifest", new String[]{"com.google.javascript.jscomp.JSModule"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", "com.google.javascript.jscomp.CompilerOptions", "<sample:2>"}, {"com.google.javascript.jscomp.CommandLineRunner", "getDiagnosticGroups", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}}, 3), new String[][]{{"format", "java.lang.String,java.lang.Object[]", "3"}, {"println", "double", "3"}});
  assertNotNull(actual);
  assertEquals("java.io.PrintStream", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphManifestTo", "com.google.javascript.jscomp.JSModuleGraph,java.lang.Appendable", "<sample:7>", "<null>"}, {"com.google.javascript.jscomp.CommandLineRunner", "run", ""}}, 2), new String[][]{{"getDefineReplacements", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphManifestTo", "com.google.javascript.jscomp.JSModuleGraph,java.lang.Appendable", "<sample:2>", "<null>"}, {"com.google.javascript.jscomp.CommandLineRunner", "run", ""}}, 2), new String[][]{{"getDefineReplacements", "", "4"}, {"get", "java.lang.Object", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 35, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "getCommandLineConfig", ""}}), new String[][]{{"setDefineToNumberLiteral", "java.lang.String,int", "6"}, {"setColorizeErrorOutput", "boolean", "7"}, {"clone", "", "1"}, {"getDefineReplacements", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{0=NUMBER 4.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getDefaultExterns", new String[]{}, new String[]{}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createExterns", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", "com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Function", "<sample:5>", "<null>", "<sample:6>", "<sample:4>"}, {"com.google.javascript.jscomp.CommandLineRunner", "initOptionsFromFlags", "com.google.javascript.jscomp.CompilerOptions", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createExterns", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createCompiler", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", "com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Function", "<sample:4>", "<null>", "<null>", "<sample:3>"}, {"com.google.javascript.jscomp.CommandLineRunner", "initOptionsFromFlags", "com.google.javascript.jscomp.CompilerOptions", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createJsModules", new String[]{"java.util.List", "java.util.List"}, new String[]{"<sample:2>", "<null>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getDiagnosticGroups", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "processResults", "com.google.javascript.jscomp.Result,java.util.List,com.google.javascript.jscomp.CompilerOptions", "<sample:5>", "<sample:2>", "<sample:0>"}, {"com.google.javascript.jscomp.CommandLineRunner", "shouldRunCompiler", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createJsModules", new String[]{"java.util.List", "java.util.List"}, new String[]{"<sample:2>", "<empty>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getDiagnosticGroups", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "processResults", "com.google.javascript.jscomp.Result,java.util.List,com.google.javascript.jscomp.CompilerOptions", "<sample:5>", "<sample:4>", "<sample:0>"}, {"com.google.javascript.jscomp.CommandLineRunner", "shouldRunCompiler", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.AbstractCommandLineRunner$FlagUsageException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "shouldRunCompiler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "initOptionsFromFlags", "com.google.javascript.jscomp.CompilerOptions", "<sample:7>"}, {"com.google.javascript.jscomp.CommandLineRunner", "createCompiler", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createJsModules", new String[]{"java.util.List", "java.util.List"}, new String[]{"<sample:1>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "doRun", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "getCommandLineConfig", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphManifestTo", new String[]{"com.google.javascript.jscomp.JSModuleGraph", "java.lang.Appendable"}, new String[]{"<sample:2>", "<empty>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "run", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphManifestTo", new String[]{"com.google.javascript.jscomp.JSModuleGraph", "java.lang.Appendable"}, new String[]{"<sample:0>", "<null>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "initOptionsFromFlags", "com.google.javascript.jscomp.CompilerOptions", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "main", new String[]{"java.lang.String[]"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "processResults", new String[]{"com.google.javascript.jscomp.Result", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:4>", "<null>", "<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "isInTestMode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "processResults", new String[]{"com.google.javascript.jscomp.Result", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:7>", "<null>", "<sample:7>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false), new String[][]{{"compileModules", "java.util.List,java.util.List,com.google.javascript.jscomp.CompilerOptions", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createJsModules", new String[]{"java.util.List", "java.util.List"}, new String[]{"<sample:1>", "<sample:0>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.AbstractCommandLineRunner$FlagUsageException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createJsModules", new String[]{"java.util.List", "java.util.List"}, new String[]{"<sample:1>", "<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getDiagnosticGroups", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "expandManifest", "com.google.javascript.jscomp.JSModule", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.DiagnosticGroups", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createDefineReplacements", new String[]{"java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:0>", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphManifestTo", new String[]{"com.google.javascript.jscomp.JSModuleGraph", "java.lang.Appendable"}, new String[]{"<null>", "<empty>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphManifestTo", new String[]{"com.google.javascript.jscomp.JSModuleGraph", "java.lang.Appendable"}, new String[]{"<sample:4>", "<empty>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createJsModules", "java.util.List,java.util.List", "<sample:0>", "<sample:0>"}, {"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"compile", "com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createDefineReplacements", new String[]{"java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<empty>", "<sample:1>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", new String[]{"com.google.common.base.Supplier", "com.google.common.base.Supplier", "com.google.common.base.Supplier", "com.google.common.base.Function"}, new String[]{"<sample:4>", "<sample:5>", "<null>", "<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", new String[]{"com.google.common.base.Supplier", "com.google.common.base.Supplier", "com.google.common.base.Supplier", "com.google.common.base.Function"}, new String[]{"<sample:4>", "<sample:4>", "<null>", "<null>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createDefineReplacements", new String[]{"java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<null>", "<sample:1>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", new String[]{"com.google.common.base.Supplier", "com.google.common.base.Supplier", "com.google.common.base.Supplier", "com.google.common.base.Function"}, new String[]{"<sample:5>", "<sample:5>", "<sample:3>", "<sample:7>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "doRun", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "getCommandLineConfig", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "java.util.List"}, new String[]{"<sample:2>", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createJsModules", new String[]{"java.util.List", "java.util.List"}, new String[]{"<null>", "<sample:3>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", "com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Function", "<sample:4>", "<sample:0>", "<null>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "expandManifest", new String[]{"com.google.javascript.jscomp.JSModule"}, new String[]{"<sample:4>"}, false, 8, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "processResults", "com.google.javascript.jscomp.Result,java.util.List,com.google.javascript.jscomp.CompilerOptions", "<sample:4>", "<sample:3>", "<sample:3>"}, {"com.google.javascript.jscomp.CommandLineRunner", "createJsModules", "java.util.List,java.util.List", "<sample:3>", "<sample:3>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getDiagnosticGroups", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "initOptionsFromFlags", "com.google.javascript.jscomp.CompilerOptions", "<sample:7>"}, {"com.google.javascript.jscomp.CommandLineRunner", "createJsModules", "java.util.List,java.util.List", "<sample:3>", "<empty>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.DiagnosticGroups", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "initOptionsFromFlags", new String[]{"com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:1>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "main", new String[]{"java.lang.String[]"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getCommandLineConfig", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createDefineReplacements", new String[]{"java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<null>", "<sample:1>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 46, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "run", ""}}, 1), new String[][]{{"shouldColorizeErrorOutput", "", "4"}, {"getCodingConvention", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.ClosureCodingConvention", actual.getClass().getName());
  assertEquals("{getAbstractMethodName=goog.abstractMethod, getDelegateSuperclassName=null, getExportPropertyFunction=goog.exportProperty, getExportSymbolFunction=goog.exportSymbol, getGlobalObject=goog.global}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 47, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "run", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "expandManifest", "com.google.javascript.jscomp.JSModule", "<sample:6>"}}, 1), new String[][]{{"shouldColorizeErrorOutput", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 61, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "run", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "expandManifest", "com.google.javascript.jscomp.JSModule", "<null>"}}, 1), new String[][]{{"shouldColorizeErrorOutput", "", "4"}, {"getCodingConvention", "", "7"}, {"getAssertionFunctions", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.RegularImmutableList", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createJsModules", new String[]{"java.util.List", "java.util.List"}, new String[]{"<sample:3>", "<sample:0>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createJsModules", "java.util.List,java.util.List", "<sample:1>", "<sample:0>"}, {"com.google.javascript.jscomp.CommandLineRunner", "doRun", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.AbstractCommandLineRunner$FlagUsageException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "run", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "initOptionsFromFlags", "com.google.javascript.jscomp.CompilerOptions", "<sample:1>"}}, 2), new String[][]{{"print", "java.lang.Object", "2"}, {"append", "java.lang.CharSequence,int,int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "isInTestMode", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "initOptionsFromFlags", "com.google.javascript.jscomp.CompilerOptions", "<sample:1>"}}, 2), new String[][]{{"getCodingConvention", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.ClosureCodingConvention", actual.getClass().getName());
  assertEquals("{getAbstractMethodName=goog.abstractMethod, getDelegateSuperclassName=null, getExportPropertyFunction=goog.exportProperty, getExportSymbolFunction=goog.exportSymbol, getGlobalObject=goog.global}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 27, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "initOptionsFromFlags", "com.google.javascript.jscomp.CompilerOptions", "<sample:0>"}, {"com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphManifestTo", "com.google.javascript.jscomp.JSModuleGraph,java.lang.Appendable", "<sample:6>", "<empty>"}, {"com.google.javascript.jscomp.CommandLineRunner", "doRun", ""}}, 3), new String[][]{{"setRewriteNewDateGoogNow", "boolean", "4"}, {"setColorizeErrorOutput", "boolean", "2"}, {"setDefineToBooleanLiteral", "java.lang.String,boolean", "2"}, {"getDefineReplacements", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{0=TRUE}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "run", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "getCompiler", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "getCompiler", ""}}, 3), new String[][]{{"setDefineToBooleanLiteral", "java.lang.String,boolean", "3"}, {"getDefineReplacements", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{sample=FALSE}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "run", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "expandManifest", "com.google.javascript.jscomp.JSModule", "<sample:4>"}, {"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}}, 2), new String[][]{{"addWarningsGuard", "com.google.javascript.jscomp.WarningsGuard", "0"}, {"setProcessObjectPropertyString", "boolean", "0"}, {"getCodingConvention", "", "7"}, {"getAssertionFunctions", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.RegularImmutableList", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 21, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "doRun", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "processResults", "com.google.javascript.jscomp.Result,java.util.List,com.google.javascript.jscomp.CompilerOptions", "<sample:6>", "<sample:0>", "<sample:8>"}, {"com.google.javascript.jscomp.CommandLineRunner", "run", ""}}, 2), new String[][]{{"setDefineToDoubleLiteral", "java.lang.String,double", "1"}, {"setNameAnonymousFunctionsOnly", "boolean", "3"}, {"getDefineReplacements", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{a=NUMBER 0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getCompiler", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "doRun", ""}}, 1), new String[][]{{"getDefineReplacements", "", "6"}, {"values", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$Values", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "writeOutput", new String[]{"java.lang.Appendable", "com.google.javascript.jscomp.Compiler", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "<sample:4>", "1.1234567890123456", "1.1234567", "es3.js"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 30, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "expandManifest", "com.google.javascript.jscomp.JSModule", "<null>"}, {"com.google.javascript.jscomp.CommandLineRunner", "doRun", ""}}, 1), new String[][]{{"getDefineReplacements", "", "1"}, {"values", "", "2"}, {"addAll", "java.util.Collection", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getCommandLineConfig", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createJsModules", "java.util.List,java.util.List", "<sample:2>", "<empty>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", "com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Function", "<sample:6>", "<sample:7>", "<sample:2>", "<sample:6>"}}, 2), new String[][]{{"initModules", "java.util.List,java.util.List,com.google.javascript.jscomp.CompilerOptions", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 39, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "doRun", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "getCommandLineConfig", ""}}, 1), new String[][]{{"getDefineReplacements", "", "1"}, {"values", "", "2"}, {"iterator", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$ValueIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", new String[]{"com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "shouldRunCompiler", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "writeOutput", new String[]{"java.lang.Appendable", "com.google.javascript.jscomp.Compiler", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"<empty>", "<sample:2>", "Hello, World", "false", "Title"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "java.util.List"}, new String[]{"<null>", "<sample:6>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "java.util.List"}, new String[]{"<sample:3>", "<empty>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.AbstractCommandLineRunner$FlagUsageException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createCompiler", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "expandManifest", "com.google.javascript.jscomp.JSModule", "<sample:0>"}}, 2), new String[][]{{"print", "java.lang.String", "7"}, {"printf", "java.util.Locale,java.lang.String,java.lang.Object[]", "2"}, {"write", "byte[],int,int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createCompiler", ""}}, 2), new String[][]{{"print", "java.lang.String", "7"}, {"printf", "java.util.Locale,java.lang.String,java.lang.Object[]", "2"}, {"write", "byte[],int,int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createCompiler", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "getDiagnosticGroups", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", "com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Function", "<sample:4>", "<sample:0>", "<sample:1>", "<null>"}}), new String[][]{{"compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.CompilerOptions", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getCompiler", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createJsModules", "java.util.List,java.util.List", "<empty>", "<null>"}, {"com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "doRun", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Compiler", actual.getClass().getName());
  assertEquals("{getAstDotGraph=, getErrorCount=!NullPointerException, getErrors=!NullPointerException, getMessages=!NullPointerException, getWarningCount=!NullPointerException, getWarnings=!NullPointerException, has...#307#49963817", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "processResults", new String[]{"com.google.javascript.jscomp.Result", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:3>", "<sample:3>", "<sample:2>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "processResults", "com.google.javascript.jscomp.Result,java.util.List,com.google.javascript.jscomp.CompilerOptions", "<sample:2>", "<sample:0>", "<null>"}, {"com.google.javascript.jscomp.CommandLineRunner", "shouldRunCompiler", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "processResults", new String[]{"com.google.javascript.jscomp.Result", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:5>", "<sample:3>", "<sample:0>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "processResults", "com.google.javascript.jscomp.Result,java.util.List,com.google.javascript.jscomp.CompilerOptions", "<sample:2>", "<sample:0>", "<null>"}, {"com.google.javascript.jscomp.CommandLineRunner", "shouldRunCompiler", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "processResults", new String[]{"com.google.javascript.jscomp.Result", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:1>", "<sample:0>", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 8, new String[][]{}, 3), new String[][]{{"initModules", "java.util.List,java.util.List,com.google.javascript.jscomp.CompilerOptions", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createDefineReplacements", new String[]{"java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:5>", "<sample:7>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createDefineReplacements", new String[]{"java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:3>", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "java.util.List"}, new String[]{"<sample:1>", "<sample:2>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "writeOutput", new String[]{"java.lang.Appendable", "com.google.javascript.jscomp.Compiler", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "<sample:3>", "es3.js", "PRETTY_PRINT", ""}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"check", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "isInTestMode", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "doRun", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", "com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Function", "<sample:0>", "<sample:2>", "<null>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", new String[]{"com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<null>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "doRun", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", "com.google.javascript.jscomp.CompilerOptions", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"parse", "com.google.javascript.jscomp.JSSourceFile", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT 1 [sourcename: ] [synthetic: 1] {getCharno=0, getChildCount=1, getDouble=!UnsupportedOperationException, getLineno=1, getQualifiedName=null, getString=!UnsupportedOperationException, getType=13...#403#-1564829997", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}}), new String[][]{{"append", "java.lang.CharSequence,int,int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "processResults", new String[]{"com.google.javascript.jscomp.Result", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<null>", "<sample:2>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createCompiler", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "expandManifest", "com.google.javascript.jscomp.JSModule", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "run", ""}}, 1), new String[][]{{"parse", "com.google.javascript.jscomp.JSSourceFile", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT 1 [sourcename: ] [synthetic: 1] {getCharno=0, getChildCount=1, getDouble=!UnsupportedOperationException, getLineno=1, getQualifiedName=null, getString=!UnsupportedOperationException, getType=13...#403#-1564829997", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getCompiler", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "createJsModules", "java.util.List,java.util.List", "<empty>", "<sample:2>"}}), new String[][]{{"getErrorManager", "", "2"}, {"generateReport", "", "6"}, {"generateReport", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.PrintStreamErrorManager", actual.getClass().getName());
  assertEquals("{getErrorCount=0, getErrors=[], getTypedPercent=0.0, getWarningCount=0, getWarnings=[]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}}, 2), new String[][]{{"getErrors", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "processResults", "com.google.javascript.jscomp.Result,java.util.List,com.google.javascript.jscomp.CompilerOptions", "<sample:7>", "<empty>", "<sample:5>"}, {"com.google.javascript.jscomp.CommandLineRunner", "getCommandLineConfig", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "processResults", "com.google.javascript.jscomp.Result,java.util.List,com.google.javascript.jscomp.CompilerOptions", "<sample:5>", "<sample:2>", "<sample:6>"}}, 2), new String[][]{{"print", "char", "6"}, {"println", "char", "3"}, {"checkError", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "initOptionsFromFlags", "com.google.javascript.jscomp.CompilerOptions", "<sample:0>"}}, 2), new String[][]{{"compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.CompilerOptions", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", new String[]{"com.google.common.base.Supplier", "com.google.common.base.Supplier", "com.google.common.base.Supplier", "com.google.common.base.Function"}, new String[]{"<sample:2>", "<sample:0>", "<null>", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "run", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createExterns", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphManifestTo", "com.google.javascript.jscomp.JSModuleGraph,java.lang.Appendable", "<sample:5>", "<sample:0>"}, {"com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", "com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Function", "<sample:5>", "<null>", "<sample:9>", "<sample:6>"}, {"com.google.javascript.jscomp.CommandLineRunner", "shouldRunCompiler", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createExterns", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", "com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Function", "<sample:1>", "<sample:2>", "<null>", "<sample:3>"}, {"com.google.javascript.jscomp.CommandLineRunner", "createCompiler", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "java.util.List"}, new String[]{"<empty>", "<empty>"}, true), new String[][]{{"clear", "", "5"}, {"put", "java.lang.Object,java.lang.Object", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"getTopScope", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getDefaultExterns", new String[]{}, new String[]{}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "writeOutput", new String[]{"java.lang.Appendable", "com.google.javascript.jscomp.Compiler", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "<sample:5>", "010", "PRETTY_PRINT", "false"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "java.util.List"}, new String[]{"<empty>", "<empty>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "expandSourceMapPath", new String[]{"com.google.javascript.jscomp.CompilerOptions", "com.google.javascript.jscomp.JSModule"}, new String[]{"<null>", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createCompiler", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3), new String[][]{{"append", "java.lang.CharSequence,int,int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", new String[]{"com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "doRun", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", "com.google.javascript.jscomp.CompilerOptions", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 16, new String[][]{}, 1), new String[][]{{"compile", "com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.CompilerOptions", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "java.util.List"}, new String[]{"<null>", "<sample:2>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "main", new String[]{"java.lang.String[]"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "java.util.List"}, new String[]{"<sample:0>", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "java.util.List"}, new String[]{"<empty>", "<empty>"}, true), new String[][]{{"remove", "java.lang.Object", "1"}, {"getOrDefault", "java.lang.Object,java.lang.Object", "3"}, {"containsValue", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createDefineReplacements", new String[]{"java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:2>", "<sample:0>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "isInTestMode", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", "com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Function", "<sample:0>", "<null>", "<sample:1>", "<sample:0>"}, {"com.google.javascript.jscomp.CommandLineRunner", "expandManifest", "com.google.javascript.jscomp.JSModule", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "isInTestMode", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "getCommandLineConfig", ""}}, 3), new String[][]{{"print", "long", "2"}, {"format", "java.util.Locale,java.lang.String,java.lang.Object[]", "6"}, {"write", "byte[],int,int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "java.util.List"}, new String[]{"<sample:2>", "<empty>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.AbstractCommandLineRunner$FlagUsageException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "java.util.List"}, new String[]{"<null>", "<empty>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "java.util.List"}, new String[]{"<empty>", "<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "java.util.List"}, new String[]{"<empty>", "<empty>"}, true, 0, null, 1), new String[][]{{"get", "java.lang.Object", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "java.util.List"}, new String[]{"<sample:2>", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "expandSourceMapPath", "com.google.javascript.jscomp.CompilerOptions,com.google.javascript.jscomp.JSModule", "<sample:6>", "<sample:4>"}, {"com.google.javascript.jscomp.CommandLineRunner", "createCompiler", ""}}, 1), new String[][]{{"reportCodeChange", "", "4"}, {"getRoot", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "writeOutput", new String[]{"java.lang.Appendable", "com.google.javascript.jscomp.Compiler", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "<sample:5>", "Title", "1.5f", "0"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "expandSourceMapPath", "com.google.javascript.jscomp.CompilerOptions,com.google.javascript.jscomp.JSModule", "<sample:2>", "<null>"}, {"com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", "com.google.javascript.jscomp.CompilerOptions", "<sample:4>"}}), new String[][]{{"init", "com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "2"}, {"getMessages", "", "4"}});
  assertNotNull(actual);
  assertEquals("[Lcom.google.javascript.jscomp.JSError;", actual.getClass().getName());
  assertEquals("[JSC_DUPLICATE_EXTERN_INPUT. Duplicate extern input:  at (unknown source) line (unknown line) : (unknown column)]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "doRun", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", "com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Function", "<sample:7>", "<null>", "<sample:0>", "<sample:7>"}, {"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "java.util.List"}, new String[]{"<sample:2>", "<empty>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.AbstractCommandLineRunner$FlagUsageException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "expandManifest", "com.google.javascript.jscomp.JSModule", "<sample:5>"}}, 3), new String[][]{{"setPassConfig", "com.google.javascript.jscomp.PassConfig", "1"}, {"getAstDotGraph", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "java.util.List"}, new String[]{"<empty>", "<empty>"}, true), new String[][]{{"getOrDefault", "java.lang.Object,java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "doRun", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", "com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Function", "<sample:5>", "<sample:0>", "<null>", "<sample:3>"}, {"com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphManifestTo", "com.google.javascript.jscomp.JSModuleGraph,java.lang.Appendable", "<sample:0>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "java.util.List"}, new String[]{"<empty>", "<empty>"}, true, 0, null, 2), new String[][]{{"clone", "", "3"}, {"remove", "java.lang.Object", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}}, 2), new String[][]{{"getSourceMap", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 52, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "doRun", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "doRun", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}}, 1), new String[][]{{"compileModules", "java.util.List,java.util.List,com.google.javascript.jscomp.CompilerOptions", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "doRun", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "shouldRunCompiler", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", "com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Function", "<sample:1>", "<null>", "<sample:1>", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "shouldRunCompiler", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", "com.google.javascript.jscomp.CompilerOptions", "<sample:2>"}}, 3), new String[][]{{"getState", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Compiler$IntermediateState", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
}
