package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "processResults", new String[]{"com.google.javascript.jscomp.Result", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:4>", "<empty>", "<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "expandSourceMapPath", "com.google.javascript.jscomp.CompilerOptions,com.google.javascript.jscomp.JSModule", "<sample:6>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "processResults", new String[]{"com.google.javascript.jscomp.Result", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:2>", "<empty>", "<sample:8>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "expandSourceMapPath", "com.google.javascript.jscomp.CompilerOptions,com.google.javascript.jscomp.JSModule", "<sample:6>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "processResults", new String[]{"com.google.javascript.jscomp.Result", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<null>", "<empty>", "<sample:8>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "expandSourceMapPath", "com.google.javascript.jscomp.CompilerOptions,com.google.javascript.jscomp.JSModule", "<sample:6>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "processResults", new String[]{"com.google.javascript.jscomp.Result", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:1>", "<sample:2>", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getCompiler", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getDefaultExterns", new String[]{}, new String[]{}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "processResults", new String[]{"com.google.javascript.jscomp.Result", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:2>", "<sample:4>", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", "com.google.javascript.jscomp.CompilerOptions", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", new String[]{"com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", new String[]{"com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:3>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", new String[]{"com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:4>"}, false, 2, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createExterns", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "shouldRunCompiler", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "writeOutput", new String[]{"java.lang.Appendable", "com.google.javascript.jscomp.Compiler", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", "<sample:0>", "PRETTY_PRINT", "1.12345678", "1.12345678"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "processResults", new String[]{"com.google.javascript.jscomp.Result", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:9>", "<sample:0>", "<sample:6>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "isInTestMode", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", "com.google.javascript.jscomp.CompilerOptions", "<sample:7>"}, {"com.google.javascript.jscomp.CommandLineRunner", "getCompiler", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphManifestTo", new String[]{"com.google.javascript.jscomp.JSModuleGraph", "java.lang.Appendable"}, new String[]{"<sample:4>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getCompiler", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphManifestTo", new String[]{"com.google.javascript.jscomp.JSModuleGraph", "java.lang.Appendable"}, new String[]{"<sample:4>", "<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphManifestTo", new String[]{"com.google.javascript.jscomp.JSModuleGraph", "java.lang.Appendable"}, new String[]{"<sample:4>", "<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getCompiler", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createExterns", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "initOptionsFromFlags", "com.google.javascript.jscomp.CompilerOptions", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getCommandLineConfig", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "getDiagnosticGroups", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Compiler", actual.getClass().getName());
  assertEquals("{getAstDotGraph=, getErrorCount=!NullPointerException, getErrors=!NullPointerException, getMessages=!NullPointerException, getWarningCount=!NullPointerException, getWarnings=!NullPointerException, has...#307#49963817", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "isInTestMode", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.CompilerOptions", actual.getClass().getName());
  assertEquals("{getTweakProcessing=OFF, isExternExportsEnabled=false, shouldColorizeErrorOutput=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "doRun", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "isInTestMode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.CompilerOptions", actual.getClass().getName());
  assertEquals("{getTweakProcessing=OFF, isExternExportsEnabled=false, shouldColorizeErrorOutput=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "isInTestMode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "shouldRunCompiler", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "expandManifest", "com.google.javascript.jscomp.JSModule", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", new String[]{"com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getCompiler", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "getCompiler", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getCommandLineConfig", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createCompiler", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getCommandLineConfig", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createCompiler", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "processResults", new String[]{"com.google.javascript.jscomp.Result", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:5>", "<sample:3>", "<sample:6>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "processResults", new String[]{"com.google.javascript.jscomp.Result", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:6>", "<sample:2>", "<sample:6>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createJsModules", new String[]{"java.util.List", "java.util.List"}, new String[]{"<empty>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getDefaultExterns", new String[]{}, new String[]{}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createDefineOrTweakReplacements", new String[]{"java.util.List", "com.google.javascript.jscomp.CompilerOptions", "boolean"}, new String[]{"<sample:0>", "<null>", "true"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createDefineOrTweakReplacements", new String[]{"java.util.List", "com.google.javascript.jscomp.CompilerOptions", "boolean"}, new String[]{"<sample:1>", "<sample:3>", "true"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getDefaultExterns", new String[]{}, new String[]{}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", new String[]{"com.google.common.base.Supplier", "com.google.common.base.Supplier", "com.google.common.base.Supplier", "com.google.common.base.Function"}, new String[]{"<null>", "<null>", "<sample:1>", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "doRun", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", new String[]{"com.google.common.base.Supplier", "com.google.common.base.Supplier", "com.google.common.base.Supplier", "com.google.common.base.Function"}, new String[]{"<sample:6>", "<sample:3>", "<sample:1>", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "doRun", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "createJsModules", "java.util.List,java.util.List", "<empty>", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getDiagnosticGroups", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.DiagnosticGroups", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", new String[]{"com.google.common.base.Supplier", "com.google.common.base.Supplier", "com.google.common.base.Supplier", "com.google.common.base.Function"}, new String[]{"<sample:8>", "<null>", "<sample:5>", "<sample:2>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createCompiler", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "expandSourceMapPath", "com.google.javascript.jscomp.CompilerOptions,com.google.javascript.jscomp.JSModule", "<sample:7>", "<sample:2>"}, {"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", new String[]{"com.google.common.base.Supplier", "com.google.common.base.Supplier", "com.google.common.base.Supplier", "com.google.common.base.Function"}, new String[]{"<sample:8>", "<sample:7>", "<sample:5>", "<sample:2>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createCompiler", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "expandSourceMapPath", "com.google.javascript.jscomp.CompilerOptions,com.google.javascript.jscomp.JSModule", "<sample:7>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", new String[]{"com.google.common.base.Supplier", "com.google.common.base.Supplier", "com.google.common.base.Supplier", "com.google.common.base.Function"}, new String[]{"<sample:8>", "<sample:0>", "<sample:5>", "<sample:9>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createCompiler", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphManifestTo", "com.google.javascript.jscomp.JSModuleGraph,java.lang.Appendable", "<sample:7>", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", new String[]{"com.google.common.base.Supplier", "com.google.common.base.Supplier", "com.google.common.base.Supplier", "com.google.common.base.Function"}, new String[]{"<null>", "<sample:7>", "<null>", "<sample:8>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphManifestTo", "com.google.javascript.jscomp.JSModuleGraph,java.lang.Appendable", "<sample:7>", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "expandManifest", new String[]{"com.google.javascript.jscomp.JSModule"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "doRun", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.CompilerOptions", actual.getClass().getName());
  assertEquals("{getTweakProcessing=OFF, isExternExportsEnabled=false, shouldColorizeErrorOutput=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "initOptionsFromFlags", new String[]{"com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "getDiagnosticGroups", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "doRun", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createCompiler", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "initOptionsFromFlags", new String[]{"com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createJsModules", "java.util.List,java.util.List", "<sample:2>", "<empty>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 37, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getCompiler", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "initOptionsFromFlags", "com.google.javascript.jscomp.CompilerOptions", "<sample:3>"}, {"com.google.javascript.jscomp.CommandLineRunner", "doRun", ""}}, 2), new String[][]{{"clone", "", "7"}, {"setIdGenerators", "java.util.Set", "4"}, {"setNameAnonymousFunctionsOnly", "boolean", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.CompilerOptions", actual.getClass().getName());
  assertEquals("{getTweakProcessing=OFF, isExternExportsEnabled=false, shouldColorizeErrorOutput=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "doRun", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "java.util.List"}, new String[]{"<sample:2>", "<sample:3>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "expandSourceMapPath", new String[]{"com.google.javascript.jscomp.CompilerOptions", "com.google.javascript.jscomp.JSModule"}, new String[]{"<sample:0>", "<sample:4>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createJsModules", new String[]{"java.util.List", "java.util.List"}, new String[]{"<sample:0>", "<sample:1>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "run", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.AbstractCommandLineRunner$FlagUsageException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphManifestTo", "com.google.javascript.jscomp.JSModuleGraph,java.lang.Appendable", "<sample:6>", "<null>"}}), new String[][]{{"init", "java.util.List,java.util.List,com.google.javascript.jscomp.CompilerOptions", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "processResults", new String[]{"com.google.javascript.jscomp.Result", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:1>", "<sample:5>", "<sample:3>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "createJsModules", "java.util.List,java.util.List", "<sample:0>", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphManifestTo", new String[]{"com.google.javascript.jscomp.JSModuleGraph", "java.lang.Appendable"}, new String[]{"<sample:3>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createJsModules", "java.util.List,java.util.List", "<null>", "<empty>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "expandManifest", new String[]{"com.google.javascript.jscomp.JSModule"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "initOptionsFromFlags", "com.google.javascript.jscomp.CompilerOptions", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "shouldRunCompiler", ""}}), new String[][]{{"getAstDotGraph", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "shouldRunCompiler", ""}}), new String[][]{{"getAstDotGraph", "", "3"}, {"toSourceArray", "com.google.javascript.jscomp.JSModule", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3), new String[][]{{"getAstDotGraph", "", "3"}, {"toSourceArray", "com.google.javascript.jscomp.JSModule", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 20, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "doRun", ""}}, 3), new String[][]{{"getAstDotGraph", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "isInTestMode", new String[]{}, new String[]{}, false, 35, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "expandSourceMapPath", "com.google.javascript.jscomp.CompilerOptions,com.google.javascript.jscomp.JSModule", "<sample:5>", "<sample:9>"}, {"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "isInTestMode", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "expandManifest", "com.google.javascript.jscomp.JSModule", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphManifestTo", "com.google.javascript.jscomp.JSModuleGraph,java.lang.Appendable", "<sample:5>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.io.PrintStream", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getDiagnosticGroups", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.DiagnosticGroups", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createExterns", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createJsModules", "java.util.List,java.util.List", "<sample:3>", "<sample:1>"}, {"com.google.javascript.jscomp.CommandLineRunner", "doRun", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", "com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Function", "<sample:4>", "<null>", "<sample:2>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createExterns", new String[]{}, new String[]{}, false, 17, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false), new String[][]{{"setColorizeErrorOutput", "boolean", "3"}, {"setDefineToBooleanLiteral", "java.lang.String,boolean", "5"}, {"getCodingConvention", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.ClosureCodingConvention", actual.getClass().getName());
  assertEquals("{getAbstractMethodName=goog.abstractMethod, getDelegateSuperclassName=null, getExportPropertyFunction=goog.exportProperty, getExportSymbolFunction=goog.exportSymbol, getGlobalObject=goog.global}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphManifestTo", new String[]{"com.google.javascript.jscomp.JSModuleGraph", "java.lang.Appendable"}, new String[]{"<sample:5>", "<null>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphManifestTo", new String[]{"com.google.javascript.jscomp.JSModuleGraph", "java.lang.Appendable"}, new String[]{"<sample:5>", "<sample:0>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getDiagnosticGroups", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createJsModules", "java.util.List,java.util.List", "<sample:1>", "<sample:2>"}, {"com.google.javascript.jscomp.CommandLineRunner", "getDiagnosticGroups", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.DiagnosticGroups", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getCompiler", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createDefineOrTweakReplacements", new String[]{"java.util.List", "com.google.javascript.jscomp.CompilerOptions", "boolean"}, new String[]{"<null>", "<sample:7>", "false"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "expandSourceMapPath", new String[]{"com.google.javascript.jscomp.CompilerOptions", "com.google.javascript.jscomp.JSModule"}, new String[]{"<sample:6>", "<sample:6>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getCompiler", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "java.util.List"}, new String[]{"<empty>", "<sample:2>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "java.util.List"}, new String[]{"<null>", "<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 50, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "doRun", ""}}), new String[][]{{"getTweakProcessing", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.CompilerOptions$TweakProcessing", actual.getClass().getName());
  assertEquals("OFF", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "shouldRunCompiler", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "run", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "shouldRunCompiler", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "processResults", "com.google.javascript.jscomp.Result,java.util.List,com.google.javascript.jscomp.CompilerOptions", "<sample:2>", "<empty>", "<sample:2>"}}), new String[][]{{"setDefineToBooleanLiteral", "java.lang.String,boolean", "0"}, {"getDefineReplacements", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{=TRUE}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "shouldRunCompiler", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "processResults", "com.google.javascript.jscomp.Result,java.util.List,com.google.javascript.jscomp.CompilerOptions", "<sample:2>", "<empty>", "<sample:2>"}}), new String[][]{{"setDefineToBooleanLiteral", "java.lang.String,boolean", "0"}, {"getDefineReplacements", "", "5"}, {"replace", "java.lang.Object,java.lang.Object", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"setDefineToBooleanLiteral", "java.lang.String,boolean", "0"}, {"getDefineReplacements", "", "5"}, {"clear", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphManifestTo", "com.google.javascript.jscomp.JSModuleGraph,java.lang.Appendable", "<null>", "<sample:1>"}, {"com.google.javascript.jscomp.CommandLineRunner", "processResults", "com.google.javascript.jscomp.Result,java.util.List,com.google.javascript.jscomp.CompilerOptions", "<sample:2>", "<sample:3>", "<sample:0>"}}), new String[][]{{"setDefineToBooleanLiteral", "java.lang.String,boolean", "0"}, {"getDefineReplacements", "", "5"}, {"entrySet", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$EntrySet", actual.getClass().getName());
  assertEquals("[=TRUE]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 20, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphManifestTo", "com.google.javascript.jscomp.JSModuleGraph,java.lang.Appendable", "<null>", "<sample:1>"}, {"com.google.javascript.jscomp.CommandLineRunner", "processResults", "com.google.javascript.jscomp.Result,java.util.List,com.google.javascript.jscomp.CompilerOptions", "<sample:2>", "<sample:3>", "<sample:0>"}}), new String[][]{{"setDefineToBooleanLiteral", "java.lang.String,boolean", "0"}, {"getDefineReplacements", "", "5"}, {"entrySet", "", "2"}, {"contains", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 24, new String[][]{}, 2), new String[][]{{"setDefineToBooleanLiteral", "java.lang.String,boolean", "0"}, {"getDefineReplacements", "", "5"}, {"clear", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 27, new String[][]{}, 2), new String[][]{{"setDefineToBooleanLiteral", "java.lang.String,boolean", "0"}, {"getDefineReplacements", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{=TRUE}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
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
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 43, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", "com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Function", "<sample:3>", "<sample:0>", "<sample:3>", "<sample:1>"}}, 2), new String[][]{{"getTweakReplacements", "", "5"}, {"remove", "java.lang.Object,java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 43, new String[][]{}, 2), new String[][]{{"getTweakReplacements", "", "5"}, {"remove", "java.lang.Object", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 45, new String[][]{}, 2), new String[][]{{"getTweakReplacements", "", "5"}, {"remove", "java.lang.Object", "7"}, {"keySet", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "run", ""}}), new String[][]{{"compile", "com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.CompilerOptions", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "isInTestMode", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "run", ""}}, 3), new String[][]{{"compile", "com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.CompilerOptions", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "expandSourceMapPath", new String[]{"com.google.javascript.jscomp.CompilerOptions", "com.google.javascript.jscomp.JSModule"}, new String[]{"<sample:6>", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", "com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Function", "<null>", "<sample:1>", "<sample:5>", "<null>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "doRun", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphManifestTo", "com.google.javascript.jscomp.JSModuleGraph,java.lang.Appendable", "<sample:1>", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createJsModules", new String[]{"java.util.List", "java.util.List"}, new String[]{"<sample:2>", "<empty>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createCompiler", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.AbstractCommandLineRunner$FlagUsageException", thrown.getClass().getName());
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
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "processResults", new String[]{"com.google.javascript.jscomp.Result", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:1>", "<sample:2>", "<sample:0>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "expandManifest", new String[]{"com.google.javascript.jscomp.JSModule"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "expandManifest", "com.google.javascript.jscomp.JSModule", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "writeOutput", new String[]{"java.lang.Appendable", "com.google.javascript.jscomp.Compiler", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "<null>", "1.25", "1.12345678901234567", "true"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getCompiler", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "run", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "main", new String[]{"java.lang.String[]"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", new String[]{"com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<null>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "processResults", "com.google.javascript.jscomp.Result,java.util.List,com.google.javascript.jscomp.CompilerOptions", "<sample:7>", "<empty>", "<sample:5>"}, {"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 29, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", "com.google.javascript.jscomp.CompilerOptions", "<sample:13>"}}, 3), new String[][]{{"setTweakToBooleanLiteral", "java.lang.String,boolean", "2"}, {"setRewriteNewDateGoogNow", "boolean", "1"}, {"setCollapsePropertiesOnExternTypes", "boolean", "3"}, {"getDefineReplacements", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "expandSourceMapPath", new String[]{"com.google.javascript.jscomp.CompilerOptions", "com.google.javascript.jscomp.JSModule"}, new String[]{"<null>", "<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "run", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", "com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Function", "<sample:2>", "<null>", "<null>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createJsModules", new String[]{"java.util.List", "java.util.List"}, new String[]{"<sample:1>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "shouldRunCompiler", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "doRun", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Compiler", actual.getClass().getName());
  assertEquals("{getAstDotGraph=, getErrorCount=!NullPointerException, getErrors=!NullPointerException, getMessages=!NullPointerException, getWarningCount=!NullPointerException, getWarnings=!NullPointerException, has...#307#49963817", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getDiagnosticGroups", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getDiagnosticGroups", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.DiagnosticGroups", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getCommandLineConfig", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", "com.google.javascript.jscomp.CompilerOptions", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", new String[]{"com.google.common.base.Supplier", "com.google.common.base.Supplier", "com.google.common.base.Supplier", "com.google.common.base.Function"}, new String[]{"<sample:1>", "<sample:0>", "<sample:0>", "<sample:5>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", new String[]{"com.google.common.base.Supplier", "com.google.common.base.Supplier", "com.google.common.base.Supplier", "com.google.common.base.Function"}, new String[]{"<sample:3>", "<null>", "<sample:3>", "<sample:6>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createCompiler", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}}, 1), new String[][]{{"getDefineReplacements", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 20, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "expandSourceMapPath", "com.google.javascript.jscomp.CompilerOptions,com.google.javascript.jscomp.JSModule", "<sample:2>", "<sample:13>"}, {"com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", "com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Function", "<sample:0>", "<sample:0>", "<sample:6>", "<sample:7>"}}, 3), new String[][]{{"shouldColorizeErrorOutput", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "writeOutput", new String[]{"java.lang.Appendable", "com.google.javascript.jscomp.Compiler", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "<sample:7>", "on", "010", "1E-5"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "getCompiler", ""}}, 2), new String[][]{{"getErrorLevel", "com.google.javascript.jscomp.JSError", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "doRun", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "getCommandLineConfig", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "initOptionsFromFlags", new String[]{"com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:4>"}, false, 13, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createCompiler", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "isInTestMode", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "java.util.List"}, new String[]{"<empty>", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createExterns", new String[]{}, new String[]{}, false, 20, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "doRun", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "initOptionsFromFlags", "com.google.javascript.jscomp.CompilerOptions", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createDefineOrTweakReplacements", new String[]{"java.util.List", "com.google.javascript.jscomp.CompilerOptions", "boolean"}, new String[]{"<sample:1>", "<sample:2>", "true"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "java.util.List"}, new String[]{"<sample:0>", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "processResults", "com.google.javascript.jscomp.Result,java.util.List,com.google.javascript.jscomp.CompilerOptions", "<sample:3>", "<sample:0>", "<sample:5>"}}, 3), new String[][]{{"setReplaceStringsConfiguration", "java.lang.String,java.util.List", "3"}, {"getTweakProcessing", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.CompilerOptions$TweakProcessing", actual.getClass().getName());
  assertEquals("OFF", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "run", ""}}, 2), new String[][]{{"setDefineToBooleanLiteral", "java.lang.String,boolean", "3"}, {"getTweakProcessing", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.CompilerOptions$TweakProcessing", actual.getClass().getName());
  assertEquals("OFF", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 42, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "isInTestMode", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphManifestTo", "com.google.javascript.jscomp.JSModuleGraph,java.lang.Appendable", "<sample:7>", "<sample:1>"}}, 3), new String[][]{{"setDefineToBooleanLiteral", "java.lang.String,boolean", "4"}, {"getCodingConvention", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.ClosureCodingConvention", actual.getClass().getName());
  assertEquals("{getAbstractMethodName=goog.abstractMethod, getDelegateSuperclassName=null, getExportPropertyFunction=goog.exportProperty, getExportSymbolFunction=goog.exportSymbol, getGlobalObject=goog.global}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 51, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "isInTestMode", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphManifestTo", "com.google.javascript.jscomp.JSModuleGraph,java.lang.Appendable", "<sample:7>", "<sample:1>"}}, 3), new String[][]{{"setDefineToBooleanLiteral", "java.lang.String,boolean", "4"}, {"getCodingConvention", "", "0"}, {"defineDelegateProxyPrototypeProperties", "com.google.javascript.rhino.jstype.JSTypeRegistry,com.google.javascript.jscomp.Scope,java.util.List", "0"}, {"getClassesDefinedByCall", "com.google.javascript.rhino.Node", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 60, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "isInTestMode", ""}}, 3), new String[][]{{"setDefineToBooleanLiteral", "java.lang.String,boolean", "1"}, {"getCodingConvention", "", "0"}, {"defineDelegateProxyPrototypeProperties", "com.google.javascript.rhino.jstype.JSTypeRegistry,com.google.javascript.jscomp.Scope,java.util.List", "0"}, {"getAbstractMethodName", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("goog.abstractMethod", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}}, 3), new String[][]{{"setDefineToBooleanLiteral", "java.lang.String,boolean", "1"}, {"getCodingConvention", "", "7"}, {"defineDelegateProxyPrototypeProperties", "com.google.javascript.rhino.jstype.JSTypeRegistry,com.google.javascript.jscomp.Scope,java.util.List", "7"}, {"isPropertyTestFunction", "com.google.javascript.rhino.Node", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "java.util.List"}, new String[]{"<empty>", "<empty>"}, true), new String[][]{{"replace", "java.lang.Object,java.lang.Object,java.lang.Object", "6"}, {"isEmpty", "", "3"}, {"isEmpty", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "doRun", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "createCompiler", ""}}, 1), new String[][]{{"setCodingConvention", "com.google.javascript.jscomp.CodingConvention", "1"}, {"getCodingConvention", "", "4"}, {"getSingletonGetterClassName", "com.google.javascript.rhino.Node", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "expandManifest", "com.google.javascript.jscomp.JSModule", "<null>"}, {"com.google.javascript.jscomp.CommandLineRunner", "doRun", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "createCompiler", ""}}, 2), new String[][]{{"setCodingConvention", "com.google.javascript.jscomp.CodingConvention", "1"}, {"getCodingConvention", "", "4"}, {"getSingletonGetterClassName", "com.google.javascript.rhino.Node", "3"}, {"isExported", "java.lang.String,boolean", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "initOptionsFromFlags", new String[]{"com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "doRun", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "doRun", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "expandManifest", "com.google.javascript.jscomp.JSModule", "<sample:2>"}}, 1), new String[][]{{"getTweakReplacements", "", "1"}, {"getOrDefault", "java.lang.Object,java.lang.Object", "3"}, {"replace", "java.lang.Object,java.lang.Object,java.lang.Object", "4"}, {"putAll", "java.util.Map", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.io.PrintStream", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "expandSourceMapPath", "com.google.javascript.jscomp.CompilerOptions,com.google.javascript.jscomp.JSModule", "<sample:3>", "<sample:6>"}, {"com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", "com.google.javascript.jscomp.CompilerOptions", "<sample:3>"}, {"com.google.javascript.jscomp.CommandLineRunner", "doRun", ""}}, 1), new String[][]{{"getTweakReplacements", "", "4"}, {"getOrDefault", "java.lang.Object,java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", "com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Function", "<sample:6>", "<sample:1>", "<sample:2>", "<sample:4>"}}), new String[][]{{"checkError", "", "2"}, {"checkError", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "java.util.List"}, new String[]{"<sample:0>", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "java.util.List"}, new String[]{"<empty>", "<sample:2>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "java.util.List"}, new String[]{"<sample:1>", "<empty>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.AbstractCommandLineRunner$FlagUsageException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "java.util.List"}, new String[]{"<empty>", "<empty>"}, true, 0, null, 2), new String[][]{{"containsKey", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "java.util.List"}, new String[]{"<sample:1>", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getCompiler", ""}}), new String[][]{{"setPassConfig", "com.google.javascript.jscomp.PassConfig", "3"}, {"getSourceRegion", "java.lang.String,int", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", new String[]{"com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:10>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphManifestTo", "com.google.javascript.jscomp.JSModuleGraph,java.lang.Appendable", "<sample:7>", "<sample:1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "writeOutput", new String[]{"java.lang.Appendable", "com.google.javascript.jscomp.Compiler", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"<sample:0>", "<sample:6>", "qnull", "", "12:30:45"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Compiler", actual.getClass().getName());
  assertEquals("{getAstDotGraph=, getErrorCount=!NullPointerException, getErrors=!NullPointerException, getMessages=!NullPointerException, getWarningCount=!NullPointerException, getWarnings=!NullPointerException, has...#307#49963817", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphManifestTo", new String[]{"com.google.javascript.jscomp.JSModuleGraph", "java.lang.Appendable"}, new String[]{"<sample:6>", "<empty>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getCompiler", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "initOptionsFromFlags", "com.google.javascript.jscomp.CompilerOptions", "<sample:6>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createDefineOrTweakReplacements", new String[]{"java.util.List", "com.google.javascript.jscomp.CompilerOptions", "boolean"}, new String[]{"<sample:4>", "<sample:5>", "false"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createDefineOrTweakReplacements", new String[]{"java.util.List", "com.google.javascript.jscomp.CompilerOptions", "boolean"}, new String[]{"<sample:3>", "<null>", "false"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createDefineOrTweakReplacements", new String[]{"java.util.List", "com.google.javascript.jscomp.CompilerOptions", "boolean"}, new String[]{"<sample:3>", "<sample:5>", "false"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "processResults", new String[]{"com.google.javascript.jscomp.Result", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:0>", "<empty>", "<sample:3>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "processResults", new String[]{"com.google.javascript.jscomp.Result", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:11>", "<null>", "<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "processResults", "com.google.javascript.jscomp.Result,java.util.List,com.google.javascript.jscomp.CompilerOptions", "<sample:7>", "<empty>", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "processResults", new String[]{"com.google.javascript.jscomp.Result", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<null>", "<null>", "<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "processResults", "com.google.javascript.jscomp.Result,java.util.List,com.google.javascript.jscomp.CompilerOptions", "<sample:7>", "<empty>", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "java.util.List"}, new String[]{"<empty>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphManifestTo", new String[]{"com.google.javascript.jscomp.JSModuleGraph", "java.lang.Appendable"}, new String[]{"<sample:4>", "<sample:0>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.io.PrintStream", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", new String[]{"com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<null>"}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"getErrorManager", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.PrintStreamErrorManager", actual.getClass().getName());
  assertEquals("{getErrorCount=0, getErrors=[], getTypedPercent=0.0, getWarningCount=0, getWarnings=[]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "initOptionsFromFlags", "com.google.javascript.jscomp.CompilerOptions", "<sample:6>"}, {"com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", "com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Function", "<sample:7>", "<null>", "<sample:2>", "<sample:0>"}}), new String[][]{{"append", "java.lang.CharSequence,int,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "expandManifest", new String[]{"com.google.javascript.jscomp.JSModule"}, new String[]{"<sample:5>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", new String[]{"com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<null>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphManifestTo", "com.google.javascript.jscomp.JSModuleGraph,java.lang.Appendable", "<null>", "<sample:4>"}, {"com.google.javascript.jscomp.CommandLineRunner", "createJsModules", "java.util.List,java.util.List", "<empty>", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getCompiler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getCommandLineConfig", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", "com.google.javascript.jscomp.CompilerOptions", "<sample:7>"}, {"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "java.util.List"}, new String[]{"<sample:2>", "<empty>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.AbstractCommandLineRunner$FlagUsageException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createJsModules", new String[]{"java.util.List", "java.util.List"}, new String[]{"<empty>", "<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createJsModules", new String[]{"java.util.List", "java.util.List"}, new String[]{"<sample:1>", "<sample:1>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.AbstractCommandLineRunner$FlagUsageException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2), new String[][]{{"getAstDotGraph", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1), new String[][]{{"getAstDotGraph", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 12, new String[][]{}, 1), new String[][]{{"getMessages", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 13, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Compiler", actual.getClass().getName());
  assertEquals("{getAstDotGraph=, getErrorCount=!NullPointerException, getErrors=!NullPointerException, getMessages=!NullPointerException, getWarningCount=!NullPointerException, getWarnings=!NullPointerException, has...#307#49963817", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "shouldRunCompiler", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", "com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Function", "<sample:6>", "<sample:3>", "<sample:1>", "<sample:0>"}}, 3), new String[][]{{"initModules", "java.util.List,java.util.List,com.google.javascript.jscomp.CompilerOptions", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "shouldRunCompiler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "java.util.List"}, new String[]{"<sample:2>", "<empty>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.AbstractCommandLineRunner$FlagUsageException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "java.util.List"}, new String[]{"<null>", "<sample:0>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "isInTestMode", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", "com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Function", "<null>", "<null>", "<sample:6>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "isInTestMode", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", "com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Function", "<null>", "<null>", "<sample:6>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createDefineOrTweakReplacements", new String[]{"java.util.List", "com.google.javascript.jscomp.CompilerOptions", "boolean"}, new String[]{"<null>", "<sample:2>", "true"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createDefineOrTweakReplacements", new String[]{"java.util.List", "com.google.javascript.jscomp.CompilerOptions", "boolean"}, new String[]{"<sample:3>", "<sample:2>", "true"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createDefineOrTweakReplacements", new String[]{"java.util.List", "com.google.javascript.jscomp.CompilerOptions", "boolean"}, new String[]{"<sample:4>", "<sample:2>", "true"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "expandSourceMapPath", new String[]{"com.google.javascript.jscomp.CompilerOptions", "com.google.javascript.jscomp.JSModule"}, new String[]{"<sample:3>", "<sample:7>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "expandSourceMapPath", new String[]{"com.google.javascript.jscomp.CompilerOptions", "com.google.javascript.jscomp.JSModule"}, new String[]{"<null>", "<sample:3>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "isInTestMode", new String[]{}, new String[]{}, false, 33, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "getCompiler", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "writeOutput", new String[]{"java.lang.Appendable", "com.google.javascript.jscomp.Compiler", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"<empty>", "<sample:4>", "123456789012345678901234567890", "2147483648", "1.12345678901234567T"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createJsModules", new String[]{"java.util.List", "java.util.List"}, new String[]{"<sample:2>", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "expandSourceMapPath", "com.google.javascript.jscomp.CompilerOptions,com.google.javascript.jscomp.JSModule", "<sample:7>", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.AbstractCommandLineRunner$FlagUsageException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createJsModules", new String[]{"java.util.List", "java.util.List"}, new String[]{"<null>", "<sample:2>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "expandSourceMapPath", "com.google.javascript.jscomp.CompilerOptions,com.google.javascript.jscomp.JSModule", "<sample:7>", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", new String[]{}, new String[]{}, false, 21, new String[][]{}, 3), new String[][]{{"append", "java.lang.CharSequence,int,int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "doRun", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", "com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Function", "<sample:6>", "<sample:7>", "<null>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", new String[]{}, new String[]{}, false), new String[][]{{"println", "double", "5"}, {"write", "byte[],int,int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"println", "double", "5"}, {"write", "byte[],int,int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "processResults", new String[]{"com.google.javascript.jscomp.Result", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:1>", "<sample:1>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "shouldRunCompiler", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createJsModules", new String[]{"java.util.List", "java.util.List"}, new String[]{"<sample:3>", "<sample:1>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", "com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Function", "<sample:4>", "<sample:4>", "<null>", "<sample:0>"}, {"com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", "com.google.javascript.jscomp.CompilerOptions", "<sample:1>"}, {"com.google.javascript.jscomp.CommandLineRunner", "getCompiler", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createJsModules", new String[]{"java.util.List", "java.util.List"}, new String[]{"<sample:3>", "<sample:0>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getCommandLineConfig", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", "com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Function", "<null>", "<null>", "<sample:7>", "<sample:0>"}, {"com.google.javascript.jscomp.CommandLineRunner", "getCompiler", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", new String[]{"com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<null>"}, false, 11, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "isInTestMode", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "createJsModules", "java.util.List,java.util.List", "<sample:1>", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.io.PrintStream", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "writeOutput", new String[]{"java.lang.Appendable", "com.google.javascript.jscomp.Compiler", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "<sample:4>", "1.1234567890123456", "2020-01-01", "yes"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createDefineOrTweakReplacements", new String[]{"java.util.List", "com.google.javascript.jscomp.CompilerOptions", "boolean"}, new String[]{"<sample:2>", "<sample:1>", "false"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"getErrorManager", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.PrintStreamErrorManager", actual.getClass().getName());
  assertEquals("{getErrorCount=0, getErrors=[], getTypedPercent=0.0, getWarningCount=0, getWarnings=[]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", "com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Function", "<sample:0>", "<null>", "<sample:3>", "<sample:2>"}, {"com.google.javascript.jscomp.CommandLineRunner", "processResults", "com.google.javascript.jscomp.Result,java.util.List,com.google.javascript.jscomp.CompilerOptions", "<sample:5>", "<empty>", "<null>"}}, 1), new String[][]{{"compile", "com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.CompilerOptions", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "doRun", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "processResults", "com.google.javascript.jscomp.Result,java.util.List,com.google.javascript.jscomp.CompilerOptions", "<sample:5>", "<sample:0>", "<sample:2>"}, {"com.google.javascript.jscomp.CommandLineRunner", "processResults", "com.google.javascript.jscomp.Result,java.util.List,com.google.javascript.jscomp.CompilerOptions", "<sample:6>", "<sample:1>", "<sample:3>"}, {"com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", "com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Function", "<sample:3>", "<null>", "<sample:6>", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "expandSourceMapPath", new String[]{"com.google.javascript.jscomp.CompilerOptions", "com.google.javascript.jscomp.JSModule"}, new String[]{"<null>", "<sample:5>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "java.util.List"}, new String[]{"<null>", "<sample:1>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "run", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "processResults", "com.google.javascript.jscomp.Result,java.util.List,com.google.javascript.jscomp.CompilerOptions", "<sample:0>", "<sample:1>", "<sample:3>"}}, 1), new String[][]{{"getTweakProcessing", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.CompilerOptions$TweakProcessing", actual.getClass().getName());
  assertEquals("OFF", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "writeOutput", new String[]{"java.lang.Appendable", "com.google.javascript.jscomp.Compiler", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", "<sample:1>", "1.12345678", "1.1234567890123456", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createExterns", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "expandSourceMapPath", "com.google.javascript.jscomp.CompilerOptions,com.google.javascript.jscomp.JSModule", "<null>", "<sample:7>"}, {"com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", "com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Function", "<sample:0>", "<sample:3>", "<null>", "<sample:6>"}, {"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "expandSourceMapPath", new String[]{"com.google.javascript.jscomp.CompilerOptions", "com.google.javascript.jscomp.JSModule"}, new String[]{"<null>", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "isInTestMode", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", "com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Function", "<sample:6>", "<null>", "<sample:7>", "<sample:3>"}, {"com.google.javascript.jscomp.CommandLineRunner", "initOptionsFromFlags", "com.google.javascript.jscomp.CompilerOptions", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createExterns", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", "com.google.javascript.jscomp.CompilerOptions", "<sample:4>"}, {"com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", "com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Function", "<sample:7>", "<sample:1>", "<null>", "<sample:2>"}, {"com.google.javascript.jscomp.CommandLineRunner", "expandSourceMapPath", "com.google.javascript.jscomp.CompilerOptions,com.google.javascript.jscomp.JSModule", "<sample:3>", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 12, new String[][]{}, 2), new String[][]{{"compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.CompilerOptions", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "java.util.List"}, new String[]{"<empty>", "<empty>"}, true, 0, null, 1), new String[][]{{"replace", "java.lang.Object,java.lang.Object,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "shouldRunCompiler", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "run", ""}}, 1), new String[][]{{"setIdGenerators", "java.util.Set", "1"}, {"setManageClosureDependencies", "boolean", "5"}, {"getCodingConvention", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.ClosureCodingConvention", actual.getClass().getName());
  assertEquals("{getAbstractMethodName=goog.abstractMethod, getDelegateSuperclassName=null, getExportPropertyFunction=goog.exportProperty, getExportSymbolFunction=goog.exportSymbol, getGlobalObject=goog.global}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphManifestTo", "com.google.javascript.jscomp.JSModuleGraph,java.lang.Appendable", "<sample:7>", "<sample:0>"}, {"com.google.javascript.jscomp.CommandLineRunner", "shouldRunCompiler", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "run", ""}}, 1), new String[][]{{"setIdGenerators", "java.util.Set", "1"}, {"setManageClosureDependencies", "boolean", "5"}, {"getCodingConvention", "", "0"}, {"isConstantKey", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "main", new String[]{"java.lang.String[]"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "run", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", "com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Function", "<sample:6>", "<null>", "<sample:7>", "<sample:3>"}, {"com.google.javascript.jscomp.CommandLineRunner", "getCompiler", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"initOptions", "com.google.javascript.jscomp.CompilerOptions", "5"}, {"check", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"initOptions", "com.google.javascript.jscomp.CompilerOptions", "5"}, {"check", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "processResults", new String[]{"com.google.javascript.jscomp.Result", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<null>", "<sample:0>", "<sample:3>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "java.util.List"}, new String[]{"<empty>", "<empty>"}, true, 0, null, 2), new String[][]{{"containsValue", "java.lang.Object", "7"}, {"isEmpty", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphManifestTo", new String[]{"com.google.javascript.jscomp.JSModuleGraph", "java.lang.Appendable"}, new String[]{"<sample:7>", "<null>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "doRun", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "createCompiler", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "doRun", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "main", new String[]{"java.lang.String[]"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getCompiler", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "getCommandLineConfig", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", ""}}, 1), new String[][]{{"initOptions", "com.google.javascript.jscomp.CompilerOptions", "3"}, {"initModules", "java.util.List,java.util.List,com.google.javascript.jscomp.CompilerOptions", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2), new String[][]{{"write", "byte[],int,int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "expandManifest", "com.google.javascript.jscomp.JSModule", "<sample:3>"}}), new String[][]{{"getState", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Compiler$IntermediateState", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createJsModules", new String[]{"java.util.List", "java.util.List"}, new String[]{"<null>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", "com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Function", "<sample:5>", "<sample:1>", "<null>", "<null>"}, {"com.google.javascript.jscomp.CommandLineRunner", "processResults", "com.google.javascript.jscomp.Result,java.util.List,com.google.javascript.jscomp.CompilerOptions", "<sample:5>", "<empty>", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createExterns", new String[]{}, new String[]{}, false, 22, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", "com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Function", "<sample:7>", "<sample:1>", "<null>", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "java.util.List"}, new String[]{"<null>", "<sample:3>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "java.util.List"}, new String[]{"<sample:0>", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "java.util.List"}, new String[]{"<empty>", "<empty>"}, true, 0, null, 3), new String[][]{{"isEmpty", "", "2"}, {"remove", "java.lang.Object,java.lang.Object", "0"}, {"remove", "java.lang.Object,java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createDefineOrTweakReplacements", new String[]{"java.util.List", "com.google.javascript.jscomp.CompilerOptions", "boolean"}, new String[]{"<sample:1>", "<null>", "true"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "processResults", new String[]{"com.google.javascript.jscomp.Result", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<null>", "<empty>", "<sample:2>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 23, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphManifestTo", "com.google.javascript.jscomp.JSModuleGraph,java.lang.Appendable", "<null>", "<sample:2>"}, {"com.google.javascript.jscomp.CommandLineRunner", "expandManifest", "com.google.javascript.jscomp.JSModule", "<sample:4>"}}, 3), new String[][]{{"getRoot", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2), new String[][]{{"getSourceMap", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "initOptionsFromFlags", "com.google.javascript.jscomp.CompilerOptions", "<sample:5>"}, {"com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", "com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Function", "<sample:2>", "<sample:3>", "<sample:7>", "<sample:0>"}}, 1), new String[][]{{"getSourceRegion", "java.lang.String,int", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "run", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", "com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Function", "<sample:3>", "<sample:1>", "<null>", "<sample:4>"}, {"com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "run", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", "com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Function", "<sample:6>", "<sample:1>", "<null>", "<sample:5>"}, {"com.google.javascript.jscomp.CommandLineRunner", "doRun", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "getDiagnosticGroups", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "java.util.List"}, new String[]{"<sample:2>", "<empty>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.AbstractCommandLineRunner$FlagUsageException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}}, 2), new String[][]{{"append", "java.lang.CharSequence,int,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", new String[]{}, new String[]{}, false, 25, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createCompiler", ""}}, 1), new String[][]{{"append", "java.lang.CharSequence,int,int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "writeOutput", new String[]{"java.lang.Appendable", "com.google.javascript.jscomp.Compiler", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "<sample:3>", "0x1F", "true", "a b"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3), new String[][]{{"write", "byte[],int,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", new String[]{}, new String[]{}, false, 23, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getDiagnosticGroups", ""}}, 3), new String[][]{{"checkError", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "java.util.List"}, new String[]{"<empty>", "<empty>"}, true), new String[][]{{"size", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getCompiler", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "doRun", ""}}, 1), new String[][]{{"print", "long", "2"}, {"write", "byte[],int,int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "java.util.List"}, new String[]{"<empty>", "<empty>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createJsModules", new String[]{"java.util.List", "java.util.List"}, new String[]{"<empty>", "<empty>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", "com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Function", "<sample:6>", "<sample:7>", "<null>", "<sample:1>"}, {"com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphManifestTo", "com.google.javascript.jscomp.JSModuleGraph,java.lang.Appendable", "<sample:3>", "<sample:2>"}, {"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "isInTestMode", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", "com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Function", "<sample:7>", "<null>", "<sample:0>", "<null>"}, {"com.google.javascript.jscomp.CommandLineRunner", "getDiagnosticGroups", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "java.util.List"}, new String[]{"<empty>", "<empty>"}, true), new String[][]{{"replace", "java.lang.Object,java.lang.Object", "7"}});
  assertNull(actual);
 }
}
