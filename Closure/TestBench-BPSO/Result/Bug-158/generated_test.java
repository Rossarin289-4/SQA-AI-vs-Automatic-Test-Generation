package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createDefineOrTweakReplacements", new String[]{"java.util.List", "com.google.javascript.jscomp.CompilerOptions", "boolean"}, new String[]{"<sample:4>", "<sample:2>", "true"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createJsModules", new String[]{"java.util.List", "java.util.List"}, new String[]{"<null>", "<empty>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "initOptionsFromFlags", new String[]{"com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:2>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getCommandLineConfig", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.AbstractCommandLineRunner", "expandSourceMapPath", "com.google.javascript.jscomp.CompilerOptions,com.google.javascript.jscomp.JSModule", "<sample:6>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.DiagnosticGroups", "com.google.javascript.jscomp.DiagnosticGroups", "registerGroup", new String[]{"java.lang.String", "com.google.javascript.jscomp.DiagnosticGroup[]"}, new String[]{" .", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.DiagnosticGroup", actual.getClass().getName());
  assertEquals("DiagnosticGroup< .>", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createDefineOrTweakReplacements", new String[]{"java.util.List", "com.google.javascript.jscomp.CompilerOptions", "boolean"}, new String[]{"<sample:3>", "<sample:3>", "true"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createInputs", new String[]{"java.util.List", "boolean"}, new String[]{"<sample:0>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "checkModuleName", "java.lang.String", "TITLD"}}), new String[][]{{"contains", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "java.util.List"}, new String[]{"<sample:5>", "<empty>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.AbstractCommandLineRunner$FlagUsageException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.DiagnosticGroups", "com.google.javascript.jscomp.DiagnosticGroups", "registerGroup", new String[]{"java.lang.String", "com.google.javascript.jscomp.DiagnosticGroup"}, new String[]{"IeUllo, World", "<sample:8>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.DiagnosticGroup", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createJsModules", new String[]{"java.util.List", "java.util.List"}, new String[]{"<sample:4>", "<sample:0>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createJsModules", "java.util.List,java.util.List", "<sample:4>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.AbstractCommandLineRunner$FlagUsageException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.DiagnosticGroups", "com.google.javascript.jscomp.DiagnosticGroups", "registerGroup", new String[]{"java.lang.String", "com.google.javascript.jscomp.DiagnosticType[]"}, new String[]{"Wa", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.DiagnosticGroup", actual.getClass().getName());
  assertEquals("DiagnosticGroup<Wa>", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "writeOutput", new String[]{"java.lang.Appendable", "com.google.javascript.jscomp.Compiler", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"<sample:0>", "<sample:5>", "0x123456789", "10/", "1.5g"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "java.util.List"}, new String[]{"<null>", "<sample:6>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "processResults", new String[]{"com.google.javascript.jscomp.Result", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:8>", "<null>", "<sample:9>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphManifestTo", "com.google.javascript.jscomp.JSModuleGraph,java.lang.Appendable", "<sample:5>", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createJsModules", new String[]{"java.util.List", "java.util.List"}, new String[]{"<empty>", "<sample:6>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "processResults", "com.google.javascript.jscomp.Result,java.util.List,com.google.javascript.jscomp.CompilerOptions", "<sample:5>", "<sample:4>", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.DiagnosticGroups", "com.google.javascript.jscomp.DiagnosticGroups", "getRegisteredGroups", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.DiagnosticGroups", "setWarningLevel", "com.google.javascript.jscomp.CompilerOptions,java.lang.String,com.google.javascript.jscomp.CheckLevel", "<sample:4>", "", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createInputs", new String[]{"java.util.List", "boolean"}, new String[]{"<sample:1>", "false"}, false, 7, new String[][]{{"com.google.javascript.jscomp.AbstractCommandLineRunner", "run", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "getCompiler", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "writeOutput", new String[]{"java.lang.Appendable", "com.google.javascript.jscomp.Compiler", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", "<sample:5>", "Bad --js lag. ", "PT1H", "1"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createDefineOrTweakReplacements", new String[]{"java.util.List", "com.google.javascript.jscomp.CompilerOptions", "boolean"}, new String[]{"<sample:2>", "<sample:1>", "false"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "processResults", new String[]{"com.google.javascript.jscomp.Result", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:4>", "<empty>", "<sample:10>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "checkModuleName", new String[]{"java.lang.String"}, new String[]{"1E--5"}, false, 5, new String[][]{{"com.google.javascript.jscomp.AbstractCommandLineRunner", "enableTestMode", "com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Function", "<sample:5>", "<sample:5>", "<sample:8>", "<sample:7>"}, {"com.google.javascript.jscomp.CommandLineRunner", "filenameToOutputStream", "java.lang.String", " "}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.AbstractCommandLineRunner$FlagUsageException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "filenameToOutputStream", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createCompiler", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphManifestTo", new String[]{"com.google.javascript.jscomp.JSModuleGraph", "java.lang.Appendable"}, new String[]{"<sample:1>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.AbstractCommandLineRunner", "printModuleGraphManifestTo", "com.google.javascript.jscomp.JSModuleGraph,java.lang.Appendable", "<sample:10>", "<sample:8>"}, {"com.google.javascript.jscomp.CommandLineRunner", "createJsModules", "java.util.List,java.util.List", "<sample:9>", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", "com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Function", "<sample:0>", "<null>", "<sample:2>", "<sample:7>"}, {"com.google.javascript.jscomp.CommandLineRunner", "run", ""}}, 1), new String[][]{{"report", "com.google.javascript.jscomp.JSError", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "writeOutput", new String[]{"java.lang.Appendable", "com.google.javascript.jscomp.Compiler", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "<null>", "2020-02-30T25:61:611L", "-9223372036854775808", "-9223372036854775808"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.AbstractCommandLineRunner", "setRunOptions", "com.google.javascript.jscomp.CompilerOptions", "<sample:2>"}}, 1), new String[][]{{"getAliasTransformationHandler", "", "4"}, {"logAliasChangeSet", "java.lang.String,int,int", "0"}, {"addAlias", "java.lang.String,java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.CompilerOptions$NullAliasTransformationHandler$NullAliasTransformation", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createJsModules", new String[]{"java.util.List", "java.util.List"}, new String[]{"<sample:4>", "<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.AbstractCommandLineRunner", "expandManifest", "com.google.javascript.jscomp.JSModule", "<sample:7>"}, {"com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", "com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Function", "<sample:6>", "<sample:6>", "<null>", "<sample:9>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.DiagnosticGroups", "com.google.javascript.jscomp.DiagnosticGroups", "forName", new String[]{"java.lang.String"}, new String[]{"1.12345678901234567"}, false, 0, new String[][]{{"com.google.javascript.jscomp.DiagnosticGroups", "forName", "java.lang.String", "Can', specify stdin."}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "java.util.List"}, new String[]{"<sample:2>", "<sample:1>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "doRun", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "processResults", "com.google.javascript.jscomp.Result,java.util.List,com.google.javascript.jscomp.CompilerOptions", "<sample:2>", "<sample:2>", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createJsModules", new String[]{"java.util.List", "java.util.List"}, new String[]{"<sample:1>", "<empty>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.AbstractCommandLineRunner", "processResults", "com.google.javascript.jscomp.Result,java.util.List,com.google.javascript.jscomp.CompilerOptions", "<sample:5>", "<sample:6>", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.AbstractCommandLineRunner$FlagUsageException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "initOptionsFromFlags", new String[]{"com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:6>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Compiler", actual.getClass().getName());
  assertEquals("{getAstDotGraph=, getErrorCount=!NullPointerException, getErrors=!NullPointerException, getMessages=!NullPointerException, getWarningCount=!NullPointerException, getWarnings=!NullPointerException, has...#307#49963817", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "expandManifest", new String[]{"com.google.javascript.jscomp.JSModule"}, new String[]{"<sample:7>"}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createInputs", new String[]{"java.util.List", "boolean"}, new String[]{"<null>", "false"}, false, 1, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "shouldRunCompiler", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphManifestTo", "com.google.javascript.jscomp.JSModuleGraph,java.lang.Appendable", "<sample:3>", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "processResults", new String[]{"com.google.javascript.jscomp.Result", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:0>", "<sample:0>", "<sample:7>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.AbstractCommandLineRunner", "createOptions", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "getCompiler", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "expandManifest", new String[]{"com.google.javascript.jscomp.JSModule"}, new String[]{"<sample:4>"}, false, 3, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "java.util.List"}, new String[]{"<sample:2>", "<sample:5>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", "com.google.javascript.jscomp.CompilerOptions", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Compiler", actual.getClass().getName());
  assertEquals("{getAstDotGraph=, getErrorCount=!NullPointerException, getErrors=!NullPointerException, getMessages=!NullPointerException, getWarningCount=!NullPointerException, getWarnings=!NullPointerException, has...#307#49963817", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "initOptionsFromFlags", new String[]{"com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.AbstractCommandLineRunner", "createCompiler", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "checkModuleName", "java.lang.String", "DuIlicate mndule name: "}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "checkModuleName", new String[]{"java.lang.String"}, new String[]{"CCan', specify stdin."}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createCompiler", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "initOptionsFromFlags", "com.google.javascript.jscomp.CompilerOptions", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.AbstractCommandLineRunner$FlagUsageException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "doRun", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.AbstractCommandLineRunner", "expandSourceMapPath", "com.google.javascript.jscomp.CompilerOptions,com.google.javascript.jscomp.JSModule", "<sample:3>", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.AbstractCommandLineRunner", "createCompiler", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.io.PrintStream", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "filenameToOutputStream", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFFF"}, false, 4, new String[][]{}, 1), new String[][]{{"close", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.io.FileOutputStream", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.AbstractCommandLineRunner", "getCommandLineConfig", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Compiler", actual.getClass().getName());
  assertEquals("{getAstDotGraph=, getErrorCount=!NullPointerException, getErrors=!NullPointerException, getMessages=!NullPointerException, getWarningCount=!NullPointerException, getWarnings=!NullPointerException, has...#307#49963817", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.io.PrintStream", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getDiagnosticGroups", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "expandSourceMapPath", "com.google.javascript.jscomp.CompilerOptions,com.google.javascript.jscomp.JSModule", "<sample:6>", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.DiagnosticGroups", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getDiagnosticGroups", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphManifestTo", "com.google.javascript.jscomp.JSModuleGraph,java.lang.Appendable", "<sample:7>", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.DiagnosticGroups", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.CompilerOptions", actual.getClass().getName());
  assertEquals("{getLanguageIn=ECMASCRIPT3, getLanguageOut=null, getTweakProcessing=OFF, isExternExportsEnabled=false, shouldColorizeErrorOutput=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createJsModules", new String[]{"java.util.List", "java.util.List"}, new String[]{"<sample:5>", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "isInTestMode", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.AbstractCommandLineRunner$FlagUsageException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "checkModuleName", new String[]{"java.lang.String"}, new String[]{"-0.0"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.AbstractCommandLineRunner$FlagUsageException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getDiagnosticGroups", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.DiagnosticGroups", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", new String[]{"com.google.common.base.Supplier", "com.google.common.base.Supplier", "com.google.common.base.Supplier", "com.google.common.base.Function"}, new String[]{"<sample:0>", "<sample:0>", "<sample:3>", "<sample:4>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.AbstractCommandLineRunner", "setRunOptions", "com.google.javascript.jscomp.CompilerOptions", "<sample:1>"}, {"com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", "com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Function", "<sample:4>", "<sample:5>", "<sample:3>", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"lineLengthThreshold", "int", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.CompilerOptions", actual.getClass().getName());
  assertEquals("{getLanguageIn=ECMASCRIPT3, getLanguageOut=null, getTweakProcessing=OFF, isExternExportsEnabled=false, shouldColorizeErrorOutput=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "isInTestMode", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphManifestTo", new String[]{"com.google.javascript.jscomp.JSModuleGraph", "java.lang.Appendable"}, new String[]{"<sample:5>", "<sample:8>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createJsModules", new String[]{"java.util.List", "java.util.List"}, new String[]{"<sample:1>", "<sample:6>"}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.AbstractCommandLineRunner$FlagUsageException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createExterns", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "doRun", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "expandSourceMapPath", new String[]{"com.google.javascript.jscomp.CompilerOptions", "com.google.javascript.jscomp.JSModule"}, new String[]{"<sample:4>", "<sample:2>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "isInTestMode", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.AbstractCommandLineRunner", "setRunOptions", "com.google.javascript.jscomp.CompilerOptions", "<sample:2>"}, {"com.google.javascript.jscomp.AbstractCommandLineRunner", "doRun", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.DiagnosticGroups", "com.google.javascript.jscomp.DiagnosticGroups", "forName", new String[]{"java.lang.String"}, new String[]{"1.1234m5678901234567"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "doRun", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "writeOutput", new String[]{"java.lang.Appendable", "com.google.javascript.jscomp.Compiler", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"<sample:0>", "<null>", "123456789012345678901234567890", "a1.5f", "ECMASCRP.3"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getDefaultExterns", new String[]{}, new String[]{}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getCommandLineConfig", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "filenameToOutputStream", new String[]{"java.lang.String"}, new String[]{"1.12345678901234566"}, false, 0, new String[][]{{"com.google.javascript.jscomp.AbstractCommandLineRunner", "expandManifest", "com.google.javascript.jscomp.JSModule", "<sample:5>"}}, 2), new String[][]{{"write", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.io.FileOutputStream", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getCompiler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.AbstractCommandLineRunner", "run", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.DiagnosticGroups", "com.google.javascript.jscomp.DiagnosticGroups", "registerGroup", new String[]{"java.lang.String", "com.google.javascript.jscomp.DiagnosticGroup"}, new String[]{"IeUllo,\037World", "<sample:4>"}, true, 0, null, 1), new String[][]{{"matches", "com.google.javascript.jscomp.DiagnosticType", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createInputs", new String[]{"java.util.List", "boolean"}, new String[]{"<null>", "false"}, false, 2, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createInputs", new String[]{"java.util.List", "boolean"}, new String[]{"<null>", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.AbstractCommandLineRunner", "setRunOptions", "com.google.javascript.jscomp.CompilerOptions", "<sample:5>"}, {"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createJsModules", new String[]{"java.util.List", "java.util.List"}, new String[]{"<sample:4>", "<sample:0>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.AbstractCommandLineRunner$FlagUsageException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "expandManifest", new String[]{"com.google.javascript.jscomp.JSModule"}, new String[]{"<sample:4>"}, false, 5, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createJsModules", new String[]{"java.util.List", "java.util.List"}, new String[]{"<sample:2>", "<sample:4>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.AbstractCommandLineRunner", "processResults", "com.google.javascript.jscomp.Result,java.util.List,com.google.javascript.jscomp.CompilerOptions", "<sample:3>", "<sample:5>", "<sample:4>"}, {"com.google.javascript.jscomp.AbstractCommandLineRunner", "doRun", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.AbstractCommandLineRunner$FlagUsageException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "processResults", new String[]{"com.google.javascript.jscomp.Result", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:3>", "<sample:0>", "<sample:4>"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getCompiler", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "checkModuleName", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "expandSourceMapPath", "com.google.javascript.jscomp.CompilerOptions,com.google.javascript.jscomp.JSModule", "<sample:1>", "<sample:5>"}, {"com.google.javascript.jscomp.CommandLineRunner", "doRun", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.AbstractCommandLineRunner$FlagUsageException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getCompiler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphManifestTo", "com.google.javascript.jscomp.JSModuleGraph,java.lang.Appendable", "<sample:6>", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createInputs", new String[]{"java.util.List", "boolean"}, new String[]{"<sample:4>", "false"}, false, 3, new String[][]{{"com.google.javascript.jscomp.AbstractCommandLineRunner", "createExterns", ""}, {"com.google.javascript.jscomp.AbstractCommandLineRunner", "run", ""}}, 2), new String[][]{{"ensureCapacity", "int", "1"}, {"indexOf", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1), new String[][]{{"enableRuntimeTypeCheck", "java.lang.String", "5"}, {"setDefineToStringLiteral", "java.lang.String,java.lang.String", "5"}, {"shouldColorizeErrorOutput", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getCompiler", ""}}, 1), new String[][]{{"enableRuntimeTypeCheck", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.CompilerOptions", actual.getClass().getName());
  assertEquals("{getLanguageIn=ECMASCRIPT3, getLanguageOut=null, getTweakProcessing=OFF, isExternExportsEnabled=false, shouldColorizeErrorOutput=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "shouldRunCompiler", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createInputs", new String[]{"java.util.List", "boolean"}, new String[]{"<sample:5>", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "run", ""}, {"com.google.javascript.jscomp.AbstractCommandLineRunner", "createOptions", ""}}, 2), new String[][]{{"trimToSize", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, 0, sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "java.util.List"}, new String[]{"<sample:9>", "<sample:3>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", new String[]{"com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:3>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createJsModules", new String[]{"java.util.List", "java.util.List"}, new String[]{"<null>", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.AbstractCommandLineRunner", "createInputs", "java.util.List,boolean", "<sample:9>", "true"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "checkModuleName", new String[]{"java.lang.String"}, new String[]{"ECMASCRIPT5"}, false, 1, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", "com.google.javascript.jscomp.CompilerOptions", "<sample:11>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "writeOutput", new String[]{"java.lang.Appendable", "com.google.javascript.jscomp.Compiler", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", "<sample:0>", " ", "Hemlo, World", "fInvalid js file count '1.5Duplicate module name: "}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "doRun", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.AbstractCommandLineRunner", "setRunOptions", "com.google.javascript.jscomp.CompilerOptions", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "isInTestMode", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.AbstractCommandLineRunner", "expandSourceMapPath", "com.google.javascript.jscomp.CompilerOptions,com.google.javascript.jscomp.JSModule", "<sample:1>", "<sample:0>"}}, 1), new String[][]{{"setTweakProcessing", "com.google.javascript.jscomp.CompilerOptions$TweakProcessing", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.CompilerOptions", actual.getClass().getName());
  assertEquals("{getLanguageIn=ECMASCRIPT3, getLanguageOut=null, getTweakProcessing=CHECK, isExternExportsEnabled=false, shouldColorizeErrorOutput=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "java.util.List"}, new String[]{"<sample:3>", "<sample:2>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.DiagnosticGroups", "com.google.javascript.jscomp.DiagnosticGroups", "getRegisteredGroups", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.DiagnosticGroups", "forName", "java.lang.String", " unexpected exception"}, {"com.google.javascript.jscomp.DiagnosticGroups", "setWarningLevel", "com.google.javascript.jscomp.CompilerOptions,java.lang.String,com.google.javascript.jscomp.CheckLevel", "<sample:5>", "nvalid js file count 'Bad --externs flag. ", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createInputs", new String[]{"java.util.List", "boolean"}, new String[]{"<sample:0>", "false"}, false, 5, new String[][]{{"com.google.javascript.jscomp.AbstractCommandLineRunner", "enableTestMode", "com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Function", "<sample:7>", "<sample:6>", "<sample:5>", "<sample:2>"}}, 3), new String[][]{{"indexOf", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createInputs", new String[]{"java.util.List", "boolean"}, new String[]{"<sample:2>", "false"}, false, 1, new String[][]{{"com.google.javascript.jscomp.AbstractCommandLineRunner", "getCommandLineConfig", ""}, {"com.google.javascript.jscomp.AbstractCommandLineRunner", "expandSourceMapPath", "com.google.javascript.jscomp.CompilerOptions,com.google.javascript.jscomp.JSModule", "<sample:6>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createExterns", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "processResults", new String[]{"com.google.javascript.jscomp.Result", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:2>", "<sample:2>", "<sample:1>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "expandSourceMapPath", "com.google.javascript.jscomp.CompilerOptions,com.google.javascript.jscomp.JSModule", "<sample:8>", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "initOptionsFromFlags", new String[]{"com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:0>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "java.util.List"}, new String[]{"<sample:3>", "<empty>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.AbstractCommandLineRunner$FlagUsageException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "processResults", new String[]{"com.google.javascript.jscomp.Result", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:8>", "<sample:2>", "<sample:5>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.AbstractCommandLineRunner", "createOptions", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "doRun", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createInputs", new String[]{"java.util.List", "boolean"}, new String[]{"<sample:0>", "false"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createJsModules", new String[]{"java.util.List", "java.util.List"}, new String[]{"<sample:2>", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.AbstractCommandLineRunner$FlagUsageException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getDiagnosticGroups", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.DiagnosticGroups", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphManifestTo", new String[]{"com.google.javascript.jscomp.JSModuleGraph", "java.lang.Appendable"}, new String[]{"<sample:1>", "<sample:6>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createExterns", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "java.util.List"}, new String[]{"<sample:3>", "<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", new String[]{"com.google.common.base.Supplier", "com.google.common.base.Supplier", "com.google.common.base.Supplier", "com.google.common.base.Function"}, new String[]{"<sample:3>", "<sample:3>", "<sample:1>", "<sample:4>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.AbstractCommandLineRunner", "setRunOptions", "com.google.javascript.jscomp.CompilerOptions", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "writeOutput", new String[]{"java.lang.Appendable", "com.google.javascript.jscomp.Compiler", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"<sample:8>", "<sample:4>", "Duplicate modtle name: ", "ES3", "2.12345688"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getCompiler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.AbstractCommandLineRunner", "filenameToOutputStream", "java.lang.String", "Duplicate lodule name: "}, {"com.google.javascript.jscomp.AbstractCommandLineRunner", "checkModuleName", "java.lang.String", "Best time:R"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "checkModuleName", new String[]{"java.lang.String"}, new String[]{":Worst time: "}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.AbstractCommandLineRunner$FlagUsageException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.DiagnosticGroups", "com.google.javascript.jscomp.DiagnosticGroups", "setWarningLevel", new String[]{"com.google.javascript.jscomp.CompilerOptions", "java.lang.String", "com.google.javascript.jscomp.CheckLevel"}, new String[]{"<sample:6>", "-9223372036855775808010", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.DiagnosticGroups", "forName", "java.lang.String", "fInvalid js file count '"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createInputs", new String[]{"java.util.List", "boolean"}, new String[]{"<sample:2>", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.AbstractCommandLineRunner", "createOptions", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Compiler", actual.getClass().getName());
  assertEquals("{getAstDotGraph=, getErrorCount=!NullPointerException, getErrors=!NullPointerException, getMessages=!NullPointerException, getWarningCount=!NullPointerException, getWarnings=!NullPointerException, has...#307#49963817", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "filenameToOutputStream", new String[]{"java.lang.String"}, new String[]{" 1L"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.io.FileOutputStream", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "expandManifest", new String[]{"com.google.javascript.jscomp.JSModule"}, new String[]{"<sample:4>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.io.PrintStream", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", new String[]{"com.google.common.base.Supplier", "com.google.common.base.Supplier", "com.google.common.base.Supplier", "com.google.common.base.Function"}, new String[]{"<null>", "<sample:0>", "<sample:7>", "<sample:0>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "processResults", new String[]{"com.google.javascript.jscomp.Result", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:9>", "<sample:4>", "<sample:6>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.AbstractCommandLineRunner", "expandManifest", "com.google.javascript.jscomp.JSModule", "<sample:8>"}, {"com.google.javascript.jscomp.CommandLineRunner", "expandManifest", "com.google.javascript.jscomp.JSModule", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", new String[]{"com.google.common.base.Supplier", "com.google.common.base.Supplier", "com.google.common.base.Supplier", "com.google.common.base.Function"}, new String[]{"<sample:1>", "<null>", "<sample:7>", "<sample:6>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createInputs", "java.util.List,boolean", "<sample:5>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createJsModules", new String[]{"java.util.List", "java.util.List"}, new String[]{"<sample:4>", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.AbstractCommandLineRunner", "run", ""}, {"com.google.javascript.jscomp.AbstractCommandLineRunner", "createCompiler", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.AbstractCommandLineRunner$FlagUsageException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "writeOutput", new String[]{"java.lang.Appendable", "com.google.javascript.jscomp.Compiler", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"<sample:0>", "<null>", "fInva0id js file count '", "12:3T0:45", "true1.12345678901234,6"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getDiagnosticGroups", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.DiagnosticGroups", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.AbstractCommandLineRunner", "expandManifest", "com.google.javascript.jscomp.JSModule", "<sample:4>"}, {"com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphManifestTo", "com.google.javascript.jscomp.JSModuleGraph,java.lang.Appendable", "<sample:7>", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.CompilerOptions", actual.getClass().getName());
  assertEquals("{getLanguageIn=ECMASCRIPT3, getLanguageOut=null, getTweakProcessing=OFF, isExternExportsEnabled=false, shouldColorizeErrorOutput=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "initOptionsFromFlags", new String[]{"com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:3>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.AbstractCommandLineRunner", "expandManifest", "com.google.javascript.jscomp.JSModule", "<sample:5>"}}), new String[][]{{"getWarnings", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"append", "java.lang.CharSequence,int,int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", new String[]{"com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getDiagnosticGroups", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "doRun", new String[]{}, new String[]{}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "expandManifest", new String[]{"com.google.javascript.jscomp.JSModule"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.AbstractCommandLineRunner", "getCompiler", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "checkModuleName", new String[]{"java.lang.String"}, new String[]{"Duplicate module name: 1.1234567890123456"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.AbstractCommandLineRunner$FlagUsageException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createInputs", new String[]{"java.util.List", "boolean"}, new String[]{"<sample:5>", "true"}, false);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, 0, sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createInputs", new String[]{"java.util.List", "boolean"}, new String[]{"<null>", "true"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "expandSourceMapPath", new String[]{"com.google.javascript.jscomp.CompilerOptions", "com.google.javascript.jscomp.JSModule"}, new String[]{"<sample:3>", "<sample:4>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "isInTestMode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "expandSourceMapPath", new String[]{"com.google.javascript.jscomp.CompilerOptions", "com.google.javascript.jscomp.JSModule"}, new String[]{"<null>", "<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "doRun", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.AbstractCommandLineRunner", "setRunOptions", "com.google.javascript.jscomp.CompilerOptions", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", new String[]{"com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.AbstractCommandLineRunner", "enableTestMode", "com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Function", "<null>", "<sample:7>", "<sample:7>", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createJsModules", new String[]{"java.util.List", "java.util.List"}, new String[]{"<sample:2>", "<sample:6>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.AbstractCommandLineRunner$FlagUsageException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.AbstractCommandLineRunner", "enableTestMode", "com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Function", "<sample:7>", "<sample:4>", "<sample:6>", "<sample:2>"}, {"com.google.javascript.jscomp.CommandLineRunner", "initOptionsFromFlags", "com.google.javascript.jscomp.CompilerOptions", "<sample:3>"}}), new String[][]{{"shouldColorizeErrorOutput", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "processResults", new String[]{"com.google.javascript.jscomp.Result", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:2>", "<sample:6>", "<sample:9>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.AbstractCommandLineRunner", "createInputs", "java.util.List,boolean", "<sample:2>", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "filenameToOutputStream", new String[]{"java.lang.String"}, new String[]{",0.0"}, false, 1, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "isInTestMode", ""}});
  assertNotNull(actual);
  assertEquals("java.io.FileOutputStream", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphManifestTo", new String[]{"com.google.javascript.jscomp.JSModuleGraph", "java.lang.Appendable"}, new String[]{"<sample:5>", "<sample:0>"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createInputs", new String[]{"java.util.List", "boolean"}, new String[]{"<sample:5>", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, 0, sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "shouldRunCompiler", ""}}), new String[][]{{"print", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.io.PrintStream", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphManifestTo", new String[]{"com.google.javascript.jscomp.JSModuleGraph", "java.lang.Appendable"}, new String[]{"<null>", "<null>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.DiagnosticGroups", "com.google.javascript.jscomp.DiagnosticGroups", "registerGroup", new String[]{"java.lang.String", "com.google.javascript.jscomp.DiagnosticGroup[]"}, new String[]{"orst time: ", "<sample:1>"}, true), new String[][]{{"matches", "com.google.javascript.jscomp.JSError", "2"}, {"matches", "com.google.javascript.jscomp.JSError", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createInputs", new String[]{"java.util.List", "boolean"}, new String[]{"<sample:0>", "true"}, false, 5, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createExterns", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.AbstractCommandLineRunner", "checkModuleName", "java.lang.String", "ECMASCRIPT3"}, {"com.google.javascript.jscomp.AbstractCommandLineRunner", "expandSourceMapPath", "com.google.javascript.jscomp.CompilerOptions,com.google.javascript.jscomp.JSModule", "<sample:7>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getDefaultExterns", new String[]{}, new String[]{}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "writeOutput", new String[]{"java.lang.Appendable", "com.google.javascript.jscomp.Compiler", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "<sample:2>", " ", "-1/5ECMASCRIPT5_STRICT", ""}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createDefineOrTweakReplacements", new String[]{"java.util.List", "com.google.javascript.jscomp.CompilerOptions", "boolean"}, new String[]{"<empty>", "<sample:2>", "false"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.AbstractCommandLineRunner", "expandManifest", "com.google.javascript.jscomp.JSModule", "<sample:2>"}}), new String[][]{{"getTweakReplacements", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "processResults", new String[]{"com.google.javascript.jscomp.Result", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:1>", "<null>", "<null>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.DiagnosticGroups", "com.google.javascript.jscomp.DiagnosticGroups", "forName", new String[]{"java.lang.String"}, new String[]{"mill"}, false, 0, new String[][]{{"com.google.javascript.jscomp.DiagnosticGroups", "setWarningLevel", "com.google.javascript.jscomp.CompilerOptions,java.lang.String,com.google.javascript.jscomp.CheckLevel", "<sample:3>", "Bad --exterms flag. ", "<null>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getCompiler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.AbstractCommandLineRunner", "getErrorPrintStream", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createInputs", new String[]{"java.util.List", "boolean"}, new String[]{"<sample:7>", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.AbstractCommandLineRunner", "isInTestMode", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphManifestTo", "com.google.javascript.jscomp.JSModuleGraph,java.lang.Appendable", "<sample:1>", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.CompilerOptions", actual.getClass().getName());
  assertEquals("{getLanguageIn=ECMASCRIPT3, getLanguageOut=null, getTweakProcessing=OFF, isExternExportsEnabled=false, shouldColorizeErrorOutput=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createInputs", new String[]{"java.util.List", "boolean"}, new String[]{"<sample:0>", "false"}, false, 5, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", "com.google.javascript.jscomp.CompilerOptions", "<sample:6>"}}), new String[][]{{"trimToSize", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getCommandLineConfig", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "doRun", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "java.util.List"}, new String[]{"<sample:5>", "<empty>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.AbstractCommandLineRunner$FlagUsageException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "expandSourceMapPath", new String[]{"com.google.javascript.jscomp.CompilerOptions", "com.google.javascript.jscomp.JSModule"}, new String[]{"<sample:7>", "<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "isInTestMode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "filenameToOutputStream", new String[]{"java.lang.String"}, new String[]{"1.22"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createInputs", "java.util.List,boolean", "<sample:7>", "false"}}), new String[][]{{"getFD", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.io.FileDescriptor", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false), new String[][]{{"getCodingConvention", "", "3"}, {"getAbstractMethodName", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("goog.abstractMethod", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphManifestTo", new String[]{"com.google.javascript.jscomp.JSModuleGraph", "java.lang.Appendable"}, new String[]{"<null>", "<sample:8>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createInputs", new String[]{"java.util.List", "boolean"}, new String[]{"<sample:5>", "true"}, false, 2, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createInputs", "java.util.List,boolean", "<sample:4>", "true"}}), new String[][]{{"listIterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createInputs", new String[]{"java.util.List", "boolean"}, new String[]{"<sample:7>", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.AbstractCommandLineRunner", "processResults", "com.google.javascript.jscomp.Result,java.util.List,com.google.javascript.jscomp.CompilerOptions", "<sample:1>", "<sample:2>", "<sample:0>"}}), new String[][]{{"contains", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "shouldRunCompiler", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createInputs", "java.util.List,boolean", "<sample:0>", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "java.util.List"}, new String[]{"<sample:3>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createInputs", new String[]{"java.util.List", "boolean"}, new String[]{"<sample:0>", "true"}, false, 1, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}}), new String[][]{{"add", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "java.util.List"}, new String[]{"<sample:8>", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.DiagnosticGroups", "com.google.javascript.jscomp.DiagnosticGroups", "registerGroup", new String[]{"java.lang.String", "com.google.javascript.jscomp.DiagnosticGroup"}, new String[]{"Ca<n't specify stdiin.", "<sample:0>"}, true), new String[][]{{"matches", "com.google.javascript.jscomp.DiagnosticType", "2"}, {"matches", "com.google.javascript.jscomp.JSError", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createDefineOrTweakReplacements", new String[]{"java.util.List", "com.google.javascript.jscomp.CompilerOptions", "boolean"}, new String[]{"<sample:4>", "<sample:5>", "true"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.DiagnosticGroups", "com.google.javascript.jscomp.DiagnosticGroups", "registerGroup", new String[]{"java.lang.String", "com.google.javascript.jscomp.DiagnosticGroup"}, new String[]{"1_5", "<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "filenameToOutputStream", new String[]{"java.lang.String"}, new String[]{"r"}, false, 4, new String[][]{{"com.google.javascript.jscomp.AbstractCommandLineRunner", "getErrorPrintStream", ""}}), new String[][]{{"write", "int", "2"}, {"getChannel", "", "7"}});
  assertNotNull(actual);
  assertEquals("sun.nio.ch.FileChannelImpl", actual.getClass().getName());
  assertEquals("{isOpen=true, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.DiagnosticGroups", "com.google.javascript.jscomp.DiagnosticGroups", "registerGroup", new String[]{"java.lang.String", "com.google.javascript.jscomp.DiagnosticType[]"}, new String[]{"2020-01-01", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createDefineOrTweakReplacements", new String[]{"java.util.List", "com.google.javascript.jscomp.CompilerOptions", "boolean"}, new String[]{"<sample:1>", "<sample:0>", "true"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createInputs", new String[]{"java.util.List", "boolean"}, new String[]{"<sample:6>", "true"}, false, 7, new String[][]{{"com.google.javascript.jscomp.AbstractCommandLineRunner", "createExterns", ""}}), new String[][]{{"set", "int,java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createJsModules", new String[]{"java.util.List", "java.util.List"}, new String[]{"<empty>", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", "com.google.javascript.jscomp.CompilerOptions", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "filenameToOutputStream", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, false, 0, new String[][]{{"com.google.javascript.jscomp.AbstractCommandLineRunner", "processResults", "com.google.javascript.jscomp.Result,java.util.List,com.google.javascript.jscomp.CompilerOptions", "<sample:4>", "<sample:3>", "<sample:4>"}}), new String[][]{{"getChannel", "", "7"}});
  assertNotNull(actual);
  assertEquals("sun.nio.ch.FileChannelImpl", actual.getClass().getName());
  assertEquals("{isOpen=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.DiagnosticGroups", "com.google.javascript.jscomp.DiagnosticGroups", "registerGroup", new String[]{"java.lang.String", "com.google.javascript.jscomp.DiagnosticGroup"}, new String[]{"+1", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.DiagnosticGroup", actual.getClass().getName());
  assertEquals("DiagnosticGroup<sample>", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createInputs", new String[]{"java.util.List", "boolean"}, new String[]{"<sample:6>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "filenameToOutputStream", new String[]{"java.lang.String"}, new String[]{",1"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", "com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Function", "<sample:3>", "<sample:0>", "<null>", "<sample:5>"}}), new String[][]{{"getFD", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.io.FileDescriptor", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createInputs", new String[]{"java.util.List", "boolean"}, new String[]{"<sample:4>", "true"}, false, 5, new String[][]{{"com.google.javascript.jscomp.AbstractCommandLineRunner", "initOptionsFromFlags", "com.google.javascript.jscomp.CompilerOptions", "<sample:10>"}}), new String[][]{{"add", "int,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[2, , a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.DiagnosticGroups", "com.google.javascript.jscomp.DiagnosticGroups", "registerGroup", new String[]{"java.lang.String", "com.google.javascript.jscomp.DiagnosticType[]"}, new String[]{"8ITLD", "<empty>"}, true), new String[][]{{"matches", "com.google.javascript.jscomp.DiagnosticType", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createDefineOrTweakReplacements", new String[]{"java.util.List", "com.google.javascript.jscomp.CompilerOptions", "boolean"}, new String[]{"<null>", "<sample:3>", "true"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createInputs", new String[]{"java.util.List", "boolean"}, new String[]{"<sample:0>", "false"}, false, 4, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "isInTestMode", ""}}), new String[][]{{"addAll", "int,java.util.Collection", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", new String[]{"com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<null>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.DiagnosticGroups", "com.google.javascript.jscomp.DiagnosticGroups", "registerGroup", new String[]{"java.lang.String", "com.google.javascript.jscomp.DiagnosticType[]"}, new String[]{"1.1234567", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.DiagnosticGroup", actual.getClass().getName());
  assertEquals("DiagnosticGroup<1.1234567>", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "filenameToOutputStream", new String[]{"java.lang.String"}, new String[]{"Invalid js file count 'ECMASCRIPT5_STRICT"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createInputs", "java.util.List,boolean", "<sample:1>", "true"}, {"com.google.javascript.jscomp.CommandLineRunner", "createCompiler", ""}}), new String[][]{{"write", "byte[],int,int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "filenameToOutputStream", new String[]{"java.lang.String"}, new String[]{"Unknown langua5ge `"}, false, 5, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "filenameToOutputStream", "java.lang.String", "Duplicate lodule name: "}}), new String[][]{{"getFD", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.io.FileDescriptor", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createDefineOrTweakReplacements", new String[]{"java.util.List", "com.google.javascript.jscomp.CompilerOptions", "boolean"}, new String[]{"<sample:3>", "<sample:0>", "false"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "checkModuleName", new String[]{"java.lang.String"}, new String[]{"TIILD"}, false, 0, new String[][]{{"com.google.javascript.jscomp.AbstractCommandLineRunner", "createOptions", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createInputs", new String[]{"java.util.List", "boolean"}, new String[]{"<null>", "true"}, false, 7, new String[][]{{"com.google.javascript.jscomp.AbstractCommandLineRunner", "isInTestMode", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "expandManifest", "com.google.javascript.jscomp.JSModule", "<sample:10>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createInputs", new String[]{"java.util.List", "boolean"}, new String[]{"<sample:6>", "true"}, false, 4, new String[][]{{"com.google.javascript.jscomp.AbstractCommandLineRunner", "createOptions", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false), new String[][]{{"getSourceRegion", "java.lang.String,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "processResults", new String[]{"com.google.javascript.jscomp.Result", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:3>", "<sample:1>", "<sample:0>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "filenameToOutputStream", new String[]{"java.lang.String"}, new String[]{"ES5_STQICT"}, false, 3, new String[][]{{"com.google.javascript.jscomp.AbstractCommandLineRunner", "checkModuleName", "java.lang.String", "Bad --externs fla"}}), new String[][]{{"getChannel", "", "3"}, {"write", "java.nio.ByteBuffer[]", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createDefineOrTweakReplacements", new String[]{"java.util.List", "com.google.javascript.jscomp.CompilerOptions", "boolean"}, new String[]{"<sample:0>", "<sample:9>", "false"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createJsModules", new String[]{"java.util.List", "java.util.List"}, new String[]{"<sample:4>", "<sample:4>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.AbstractCommandLineRunner", "enableTestMode", "com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Function", "<sample:8>", "<sample:7>", "<null>", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createDefineOrTweakReplacements", new String[]{"java.util.List", "com.google.javascript.jscomp.CompilerOptions", "boolean"}, new String[]{"<sample:5>", "<sample:1>", "true"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createInputs", new String[]{"java.util.List", "boolean"}, new String[]{"<sample:3>", "false"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "processResults", new String[]{"com.google.javascript.jscomp.Result", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:2>", "<null>", "<sample:7>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "isInTestMode", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "filenameToOutputStream", new String[]{"java.lang.String"}, new String[]{".5"}, false, 3, new String[][]{{"com.google.javascript.jscomp.AbstractCommandLineRunner", "getCommandLineConfig", ""}}, 1), new String[][]{{"close", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.io.FileOutputStream", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.AbstractCommandLineRunner", "run", ""}}, 3), new String[][]{{"print", "char[]", "7"}, {"close", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.io.PrintStream", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "expandSourceMapPath", new String[]{"com.google.javascript.jscomp.CompilerOptions", "com.google.javascript.jscomp.JSModule"}, new String[]{"<sample:6>", "<sample:3>"}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "java.util.List"}, new String[]{"<sample:2>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", new String[]{"com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "checkModuleName", "java.lang.String", "W`"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"getTweakProcessing", "", "3"}, {"getAliasTransformationHandler", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.CompilerOptions$NullAliasTransformationHandler", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.AbstractCommandLineRunner", "enableTestMode", "com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Function", "<sample:7>", "<sample:7>", "<sample:9>", "<sample:5>"}, {"com.google.javascript.jscomp.AbstractCommandLineRunner", "createInputs", "java.util.List,boolean", "<sample:3>", "true"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Compiler", actual.getClass().getName());
  assertEquals("{getAstDotGraph=, getErrorCount=!NullPointerException, getErrors=!NullPointerException, getMessages=!NullPointerException, getWarningCount=!NullPointerException, getWarnings=!NullPointerException, has...#307#49963817", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "expandSourceMapPath", new String[]{"com.google.javascript.jscomp.CompilerOptions", "com.google.javascript.jscomp.JSModule"}, new String[]{"<sample:8>", "<sample:3>"}, false, 7, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"languageMode", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createDefineOrTweakReplacements", new String[]{"java.util.List", "com.google.javascript.jscomp.CompilerOptions", "boolean"}, new String[]{"<sample:2>", "<null>", "false"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "writeOutput", new String[]{"java.lang.Appendable", "com.google.javascript.jscomp.Compiler", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"<sample:0>", "<sample:5>", "1.5d", "Duplibate module name: ", "-"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.DiagnosticGroups", "com.google.javascript.jscomp.DiagnosticGroups", "registerGroup", new String[]{"java.lang.String", "com.google.javascript.jscomp.DiagnosticGroup[]"}, new String[]{"fInvalid js file count 'ca", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.DiagnosticGroups", "com.google.javascript.jscomp.DiagnosticGroups", "registerGroup", new String[]{"java.lang.String", "com.google.javascript.jscomp.DiagnosticGroup"}, new String[]{"0x1d23456789", "<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.DiagnosticGroup", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getCommandLineConfig", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createInputs", new String[]{"java.util.List", "boolean"}, new String[]{"<sample:1>", "true"}, false, 5, new String[][]{}, 2), new String[][]{{"indexOf", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", "com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Function", "<sample:0>", "<sample:6>", "<sample:7>", "<sample:5>"}}), new String[][]{{"getCodingConvention", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.ClosureCodingConvention", actual.getClass().getName());
  assertEquals("{getAbstractMethodName=goog.abstractMethod, getDelegateSuperclassName=null, getExportPropertyFunction=goog.exportProperty, getExportSymbolFunction=goog.exportSymbol, getGlobalObject=goog.global}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1), new String[][]{{"acceptConstKeyword", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "writeOutput", new String[]{"java.lang.Appendable", "com.google.javascript.jscomp.Compiler", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "<sample:6>", "EES5_STRICT", "Cl5", "Bad --exter/ns flag. "}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getCommandLineConfig", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.AbstractCommandLineRunner", "doRun", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "processResults", new String[]{"com.google.javascript.jscomp.Result", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:2>", "<sample:2>", "<null>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.DiagnosticGroups", "com.google.javascript.jscomp.DiagnosticGroups", "registerGroup", new String[]{"java.lang.String", "com.google.javascript.jscomp.DiagnosticGroup[]"}, new String[]{"Be4st time:R", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "processResults", new String[]{"com.google.javascript.jscomp.Result", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:1>", "<sample:4>", "<sample:9>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.AbstractCommandLineRunner", "createOptions", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "processResults", new String[]{"com.google.javascript.jscomp.Result", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:1>", "<sample:0>", "<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "filenameToOutputStream", "java.lang.String", "ES3"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "processResults", new String[]{"com.google.javascript.jscomp.Result", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:7>", "<sample:6>", "<sample:0>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", "com.google.javascript.jscomp.CompilerOptions", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getDiagnosticGroups", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.DiagnosticGroups", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "processResults", new String[]{"com.google.javascript.jscomp.Result", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:0>", "<sample:6>", "<sample:2>"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getCommandLineConfig", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.AbstractCommandLineRunner", "enableTestMode", "com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Function", "<sample:6>", "<sample:5>", "<sample:4>", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "isInTestMode", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2), new String[][]{{"print", "char[]", "5"}, {"append", "java.lang.CharSequence", "3"}});
  assertNotNull(actual);
  assertEquals("java.io.PrintStream", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createInputs", new String[]{"java.util.List", "boolean"}, new String[]{"<sample:7>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.AbstractCommandLineRunner", "filenameToOutputStream", "java.lang.String", "1.4c"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "processResults", new String[]{"com.google.javascript.jscomp.Result", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:1>", "<sample:4>", "<sample:6>"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "filenameToOutputStream", "java.lang.String", "/dev/null123456789012345678901234567890"}}, 2);
  assertNotNull(actual);
  assertEquals("java.io.PrintStream", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createInputs", new String[]{"java.util.List", "boolean"}, new String[]{"<sample:3>", "false"}, false, 1, new String[][]{}, 1), new String[][]{{"addAll", "int,java.util.Collection", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createInputs", new String[]{"java.util.List", "boolean"}, new String[]{"<sample:1>", "false"}, false, 5, new String[][]{}, 1), new String[][]{{"addAll", "int,java.util.Collection", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphManifestTo", "com.google.javascript.jscomp.JSModuleGraph,java.lang.Appendable", "<sample:0>", "<sample:6>"}}), new String[][]{{"getLanguageOut", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createJsModules", new String[]{"java.util.List", "java.util.List"}, new String[]{"<sample:2>", "<sample:4>"}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.AbstractCommandLineRunner$FlagUsageException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.DiagnosticGroups", "com.google.javascript.jscomp.DiagnosticGroups", "registerGroup", new String[]{"java.lang.String", "com.google.javascript.jscomp.DiagnosticGroup"}, new String[]{"T1.12345678", "<sample:2>"}, true, 0, null, 2), new String[][]{{"matches", "com.google.javascript.jscomp.DiagnosticType", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getCompiler", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "java.util.List"}, new String[]{"<sample:1>", "<sample:3>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "initOptionsFromFlags", new String[]{"com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.AbstractCommandLineRunner", "getCompiler", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createJsModules", new String[]{"java.util.List", "java.util.List"}, new String[]{"<null>", "<sample:1>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", "com.google.javascript.jscomp.CompilerOptions", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "writeOutput", new String[]{"java.lang.Appendable", "com.google.javascript.jscomp.Compiler", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "<sample:8>", "ES5_9223372036854775807", ",", "Hello, World"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", new String[]{"com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", "com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Function", "<sample:3>", "<sample:2>", "<sample:3>", "<sample:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.AbstractCommandLineRunner", "expandManifest", "com.google.javascript.jscomp.JSModule", "<sample:5>"}}), new String[][]{{"getState", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Compiler$IntermediateState", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "shouldRunCompiler", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphManifestTo", new String[]{"com.google.javascript.jscomp.JSModuleGraph", "java.lang.Appendable"}, new String[]{"<null>", "<sample:0>"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", new String[]{"com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:3>"}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", new String[]{"com.google.common.base.Supplier", "com.google.common.base.Supplier", "com.google.common.base.Supplier", "com.google.common.base.Function"}, new String[]{"<sample:5>", "<sample:1>", "<sample:1>", "<sample:0>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "processResults", "com.google.javascript.jscomp.Result,java.util.List,com.google.javascript.jscomp.CompilerOptions", "<sample:1>", "<sample:4>", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createInputs", "java.util.List,boolean", "<sample:5>", "true"}}), new String[][]{{"getCodingConvention", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.ClosureCodingConvention", actual.getClass().getName());
  assertEquals("{getAbstractMethodName=goog.abstractMethod, getDelegateSuperclassName=null, getExportPropertyFunction=goog.exportProperty, getExportSymbolFunction=goog.exportSymbol, getGlobalObject=goog.global}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "java.util.List"}, new String[]{"<sample:6>", "<empty>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.AbstractCommandLineRunner$FlagUsageException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.DiagnosticGroups", "com.google.javascript.jscomp.DiagnosticGroups", "registerGroup", new String[]{"java.lang.String", "com.google.javascript.jscomp.DiagnosticGroup[]"}, new String[]{"ECMASCRIPT5+1", "<sample:2>"}, true, 0, null, 2), new String[][]{{"matches", "com.google.javascript.jscomp.DiagnosticType", "7"}, {"matches", "com.google.javascript.jscomp.JSError", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "processResults", new String[]{"com.google.javascript.jscomp.Result", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:2>", "<sample:0>", "<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.AbstractCommandLineRunner", "filenameToOutputStream", "java.lang.String", "Duplicate modtle name: "}, {"com.google.javascript.jscomp.AbstractCommandLineRunner", "processResults", "com.google.javascript.jscomp.Result,java.util.List,com.google.javascript.jscomp.CompilerOptions", "<sample:0>", "<sample:2>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createInputs", new String[]{"java.util.List", "boolean"}, new String[]{"<sample:1>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.AbstractCommandLineRunner", "run", ""}}, 2), new String[][]{{"listIterator", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.DiagnosticGroups", "com.google.javascript.jscomp.DiagnosticGroups", "registerGroup", new String[]{"java.lang.String", "com.google.javascript.jscomp.DiagnosticGroup[]"}, new String[]{"1.12345679901234561.1234567890123456", "<sample:0>"}, true, 0, null, 3), new String[][]{{"matches", "com.google.javascript.jscomp.DiagnosticType", "1"}, {"matches", "com.google.javascript.jscomp.DiagnosticType", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "initOptionsFromFlags", new String[]{"com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:8>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createInputs", new String[]{"java.util.List", "boolean"}, new String[]{"<sample:0>", "true"}, false, 1, new String[][]{}, 2), new String[][]{{"clear", "", "7"}, {"listIterator", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.DiagnosticGroups", "com.google.javascript.jscomp.DiagnosticGroups", "registerGroup", new String[]{"java.lang.String", "com.google.javascript.jscomp.DiagnosticGroup"}, new String[]{"Dan't specifmy stdin.", "<sample:5>"}, true, 0, null, 3), new String[][]{{"matches", "com.google.javascript.jscomp.DiagnosticType", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "processResults", new String[]{"com.google.javascript.jscomp.Result", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:7>", "<sample:3>", "<sample:7>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "run", ""}}), new String[][]{{"checkError", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"getAliasTransformationHandler", "", "0"}, {"logAliasChangeSet", "java.lang.String,int,int", "0"}, {"addAlias", "java.lang.String,java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.CompilerOptions$NullAliasTransformationHandler$NullAliasTransformation", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createInputs", new String[]{"java.util.List", "boolean"}, new String[]{"<sample:1>", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.AbstractCommandLineRunner", "enableTestMode", "com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Function", "<sample:6>", "<sample:9>", "<sample:7>", "<sample:0>"}, {"com.google.javascript.jscomp.AbstractCommandLineRunner", "run", ""}}, 1), new String[][]{{"listIterator", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3), new String[][]{{"getTweakReplacements", "", "0"}, {"getOrDefault", "java.lang.Object,java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getCommandLineConfig", ""}}), new String[][]{{"getTweakProcessing", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.CompilerOptions$TweakProcessing", actual.getClass().getName());
  assertEquals("OFF", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getDefaultExterns", new String[]{}, new String[]{}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "processResults", new String[]{"com.google.javascript.jscomp.Result", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<null>", "<sample:6>", "<sample:9>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "filenameToOutputStream", "java.lang.String", "UITLE"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createInputs", new String[]{"java.util.List", "boolean"}, new String[]{"<sample:3>", "true"}, false, 0, null, 2), new String[][]{{"listIterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getCompiler", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.CompilerOptions", actual.getClass().getName());
  assertEquals("{getLanguageIn=ECMASCRIPT3, getLanguageOut=null, getTweakProcessing=OFF, isExternExportsEnabled=false, shouldColorizeErrorOutput=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphManifestTo", new String[]{"com.google.javascript.jscomp.JSModuleGraph", "java.lang.Appendable"}, new String[]{"<null>", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "processResults", "com.google.javascript.jscomp.Result,java.util.List,com.google.javascript.jscomp.CompilerOptions", "<sample:4>", "<sample:6>", "<sample:0>"}, {"com.google.javascript.jscomp.CommandLineRunner", "getCompiler", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getDefaultExterns", new String[]{}, new String[]{}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", new String[]{"com.google.common.base.Supplier", "com.google.common.base.Supplier", "com.google.common.base.Supplier", "com.google.common.base.Function"}, new String[]{"<sample:7>", "<sample:0>", "<sample:8>", "<sample:5>"}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createDefineOrTweakReplacements", new String[]{"java.util.List", "com.google.javascript.jscomp.CompilerOptions", "boolean"}, new String[]{"<sample:4>", "<sample:7>", "false"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.DiagnosticGroups", "com.google.javascript.jscomp.DiagnosticGroups", "registerGroup", new String[]{"java.lang.String", "com.google.javascript.jscomp.DiagnosticGroup"}, new String[]{"ES5", "<sample:7>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.DiagnosticGroup", actual.getClass().getName());
  assertEquals("DiagnosticGroup<>", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "writeOutput", new String[]{"java.lang.Appendable", "com.google.javascript.jscomp.Compiler", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"<empty>", "<sample:0>", "TITLnE", "<null>", "ECMASCRIPT5<"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createInputs", new String[]{"java.util.List", "boolean"}, new String[]{"<sample:0>", "false"}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "filenameToOutputStream", new String[]{"java.lang.String"}, new String[]{"ECMASCRHPU3"}, false, 2, new String[][]{}), new String[][]{{"close", "", "6"}, {"getChannel", "", "1"}});
  assertNotNull(actual);
  assertEquals("sun.nio.ch.FileChannelImpl", actual.getClass().getName());
  assertEquals("{isOpen=false, size=!ClosedChannelException}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"addWarningsGuard", "com.google.javascript.jscomp.WarningsGuard", "1"}, {"getLanguageIn", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.CompilerOptions$LanguageMode", actual.getClass().getName());
  assertEquals("ECMASCRIPT3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
}
