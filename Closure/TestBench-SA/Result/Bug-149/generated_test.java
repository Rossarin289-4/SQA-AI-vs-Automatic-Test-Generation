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
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "com.google.javascript.jscomp.JSModule[]"}, new String[]{"<null>", "<empty>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<empty>", "<sample:0>", "<sample:3>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "getErrorManager", ""}, {"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.CompilerOptions", "<sample:0>", "<sample:1>", "<sample:10>"}, {"com.google.javascript.jscomp.Compiler", "hasErrors", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:3>", "<sample:0>", "<sample:5>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "getErrorManager", ""}, {"com.google.javascript.jscomp.Compiler", "hasErrors", ""}, {"com.google.javascript.jscomp.Compiler", "toSource", "com.google.javascript.jscomp.JSModule", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown ...#404#1789648253", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CompilerOptions", "com.google.javascript.jscomp.CompilerOptions", "setChainCalls", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CompilerOptions", "skipAllCompilerPasses", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isExternExportsEnabled=false, shouldColorizeErrorOutput=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", new String[]{"com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.AbstractCommandLineRunner", "doRun", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphManifestTo", "com.google.javascript.jscomp.JSModuleGraph,java.lang.Appendable", "<sample:0>", "<sample:3>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "processResults", new String[]{"com.google.javascript.jscomp.Result", "com.google.javascript.jscomp.JSModule[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:0>", "<empty>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.AbstractCommandLineRunner", "exit", "com.google.javascript.jscomp.AbstractCommandLineRunner$RunTimeStats,java.lang.Throwable", "<sample:2>", "<sample:1>"}, {"com.google.javascript.jscomp.AbstractCommandLineRunner", "printModuleGraphManifestTo", "com.google.javascript.jscomp.JSModuleGraph,java.lang.Appendable", "<sample:2>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", new String[]{"com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:11>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "exit", "com.google.javascript.jscomp.AbstractCommandLineRunner$RunTimeStats,java.lang.Throwable", "<sample:6>", "<null>"}, {"com.google.javascript.jscomp.AbstractCommandLineRunner", "processResults", "com.google.javascript.jscomp.Result,com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "<sample:6>", "<sample:1>", "<sample:9>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createJsModules", new String[]{"java.util.List", "java.util.List"}, new String[]{"<sample:1>", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.AbstractCommandLineRunner$FlagUsageException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createJsModules", new String[]{"java.util.List", "java.util.List"}, new String[]{"<sample:0>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createJsModules", new String[]{"java.util.List", "java.util.List"}, new String[]{"<null>", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createJsModules", new String[]{"java.util.List", "java.util.List"}, new String[]{"<empty>", "<sample:5>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", new String[]{"com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.AbstractCommandLineRunner", "getCompiler", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", new String[]{"com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:9>"}, false, 8, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}, {"com.google.javascript.jscomp.AbstractCommandLineRunner", "getErrorPrintStream", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "run", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "com.google.javascript.jscomp.JSModule[]"}, new String[]{"<empty>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{0=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "writeOutput", new String[]{"java.lang.Appendable", "com.google.javascript.jscomp.Compiler", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "<sample:3>", "0x123456789", "1.259", "/dev/null"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "com.google.javascript.jscomp.JSModule[]"}, new String[]{"<sample:2>", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.AbstractCommandLineRunner$FlagUsageException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSource", new String[]{"com.google.javascript.jscomp.Compiler$CodeBuilder", "int", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "-536870907", "<sample:8>"}, false, 8, new String[][]{{"com.google.javascript.jscomp.Compiler", "throwInternalError", "java.lang.String,java.lang.Exception", "123456789012345678901234567890", "<sample:0>"}, {"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "<sample:8>", "<sample:0>", "<sample:6>"}, {"com.google.javascript.jscomp.Compiler", "parse", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSource", new String[]{"com.google.javascript.jscomp.Compiler$CodeBuilder", "int", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "2147483646", "<sample:6>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "getSourceLine", "java.lang.String,int", ".", "1048532"}, {"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "<sample:8>", "<sample:0>", "<sample:3>"}, {"com.google.javascript.jscomp.Compiler", "getSourceRegion", "java.lang.String,int", "-1.5", "-1076"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown ...#404#1789648253", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CompilerOptions", "com.google.javascript.jscomp.CompilerOptions", "getWarningsGuard", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CompilerOptions", "setRemoveAbstractMethods", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isExternExportsEnabled=false, shouldColorizeErrorOutput=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CompilerOptions", "com.google.javascript.jscomp.CompilerOptions", "setIdGenerators", new String[]{"java.util.Set"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CompilerOptions", "setLooseTypes", "boolean", "false"}, {"com.google.javascript.jscomp.CompilerOptions", "setRewriteNewDateGoogNow", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isExternExportsEnabled=false, shouldColorizeErrorOutput=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CompilerOptions", "com.google.javascript.jscomp.CompilerOptions", "setCollapsePropertiesOnExternTypes", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CompilerOptions", "setDefineToDoubleLiteral", "java.lang.String,double", "1.12345678", "NaN"}, {"com.google.javascript.jscomp.CompilerOptions", "getDefineReplacements", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isExternExportsEnabled=false, shouldColorizeErrorOutput=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "computeCFG", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "isInliningForbidden", ""}, {"com.google.javascript.jscomp.Compiler", "getFunctionalInformationMap", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "report", new String[]{"com.google.javascript.jscomp.JSError"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "stripCode", "java.util.Set,java.util.Set,java.util.Set,java.util.Set", "<sample:3>", "<null>", "<sample:0>", "<empty>"}, {"com.google.javascript.jscomp.Compiler", "addIncrementalSourceAst", "com.google.javascript.jscomp.JsAst", "<sample:7>"}, {"com.google.javascript.jscomp.Compiler", "getDefaultErrorReporter", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown source) line (unknown line) : (unknown colu.., getWarningCount...#342#-1303714041", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "recordFunctionInformation", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "parseTestCode", "java.lang.String", "1.5"}, {"com.google.javascript.jscomp.Compiler", "setNormalized", ""}, {"com.google.javascript.jscomp.Compiler", "throwInternalError", "java.lang.String,java.lang.Exception", "Can't specify stdin.", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createDefineReplacements", new String[]{"java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:7>", "<sample:14>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CompilerOptions", "com.google.javascript.jscomp.CompilerOptions", "setCodingConvention", new String[]{"com.google.javascript.jscomp.CodingConvention"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CompilerOptions", "setOutputCharset", "java.lang.String", "0xFFFFFFFF"}, {"com.google.javascript.jscomp.CompilerOptions", "setNameAnonymousFunctionsOnly", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isExternExportsEnabled=false, shouldColorizeErrorOutput=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getDefaultErrorReporter", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "<sample:4>", "<sample:1>", "<sample:8>"}, {"com.google.javascript.jscomp.Compiler", "processDefines", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.RhinoErrorReporter$NewRhinoErrorReporter", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown ...#404#1789648253", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "init", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<null>", "<sample:4>", "<sample:2>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.CompilerOptions", "<sample:8>", "<sample:1>", "<sample:6>"}, {"com.google.javascript.jscomp.Compiler", "compileModules", "java.util.List,java.util.List,com.google.javascript.jscomp.CompilerOptions", "<sample:1>", "<sample:1>", "<sample:9>"}, {"com.google.javascript.jscomp.Compiler", "reportCodeChange", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getUniqueNameIdSupplier", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "rebuildInputsFromModules", ""}}), new String[][]{{"get", "", "6"}, {"get", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown source) line (unknown line) : (unknown colu.., getWarningCount...#342#-1303714041", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getCommandLineConfig", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "getDiagnosticGroups", ""}}, 2), new String[][]{{"setReplaceStringsConfiguration", "java.lang.String,java.util.List", "6"}, {"setRenamingPolicy", "com.google.javascript.jscomp.VariableRenamingPolicy,com.google.javascript.jscomp.PropertyRenamingPolicy", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.CompilerOptions", actual.getClass().getName());
  assertEquals("{isExternExportsEnabled=false, shouldColorizeErrorOutput=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getMessages", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "setPassConfig", "com.google.javascript.jscomp.PassConfig", "<sample:7>"}, {"com.google.javascript.jscomp.Compiler", "setPassConfig", "com.google.javascript.jscomp.PassConfig", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("[Lcom.google.javascript.jscomp.JSError;", actual.getClass().getName());
  assertEquals("[. a at (unknown source) line (unknown line) : (unknown column), . a at (unknown source) line (unknown line) : (unknown column), . a at (unknown source) line (unknown line) : (unknown column)]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown source) line (unknown line) : (unknown colu.., getWarningCount...#342#-1303714041", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "expandManifest", new String[]{"com.google.javascript.jscomp.JSModule"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.AbstractCommandLineRunner", "createCompiler", ""}, {"com.google.javascript.jscomp.AbstractCommandLineRunner", "createOptions", ""}, {"com.google.javascript.jscomp.AbstractCommandLineRunner", "initOptionsFromFlags", "com.google.javascript.jscomp.CompilerOptions", "<sample:6>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CompilerOptions", "com.google.javascript.jscomp.CompilerOptions", "disables", new String[]{"com.google.javascript.jscomp.DiagnosticGroup"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CompilerOptions", "getWarningsGuard", ""}, {"com.google.javascript.jscomp.CompilerOptions", "disableRuntimeTypeCheck", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isExternExportsEnabled=false, shouldColorizeErrorOutput=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "recordFunctionInformation", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "parse", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown ...#404#1789648253", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSourceArray", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Compiler", "toSourceArray", "com.google.javascript.jscomp.JSModule", "<sample:4>"}, {"com.google.javascript.jscomp.Compiler", "init", "com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "<sample:1>", "<null>", "<sample:10>"}, {"com.google.javascript.jscomp.Compiler", "parseTestCode", "java.lang.String", "123456789012345678901234567890"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile", "com.google.javascript.jscomp.JSModule[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:8>", "<empty>", "<sample:4>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "disableThreads", ""}, {"com.google.javascript.jscomp.Compiler", "initInputsByNameMap", ""}, {"com.google.javascript.jscomp.Compiler", "removeTryCatchFinally", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "writeOutput", new String[]{"java.lang.Appendable", "com.google.javascript.jscomp.Compiler", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "<sample:5>", "Module '", "1.12345678901234567", "0"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.AbstractCommandLineRunner", "doRun", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "exit", "com.google.javascript.jscomp.AbstractCommandLineRunner$RunTimeStats,java.lang.Throwable", "<sample:0>", "<sample:3>"}}), new String[][]{{"setDefineToBooleanLiteral", "java.lang.String,boolean", "1"}, {"isExternExportsEnabled", "", "6"}, {"getDefineReplacements", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{a=FALSE}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CompilerOptions", "com.google.javascript.jscomp.CompilerOptions", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CompilerOptions", "setColorizeErrorOutput", "boolean", "true"}, {"com.google.javascript.jscomp.CompilerOptions", "setManageClosureDependencies", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.CompilerOptions", actual.getClass().getName());
  assertEquals("{isExternExportsEnabled=false, shouldColorizeErrorOutput=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isExternExportsEnabled=false, shouldColorizeErrorOutput=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getOptions", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "getModuleGraph", ""}, {"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.CompilerOptions", "<sample:0>", "<sample:2>", "<sample:3>"}, {"com.google.javascript.jscomp.Compiler", "areNodesEqualForInlining", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:9>", "<sample:2>"}}), new String[][]{{"enableRuntimeTypeCheck", "java.lang.String", "5"}, {"setDefineToNumberLiteral", "java.lang.String,int", "2"}, {"getDefineReplacements", "", "6"}, {"replace", "java.lang.Object,java.lang.Object,java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown ...#404#1789648253", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getOptions", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "getNodeForCodeInsertion", "com.google.javascript.jscomp.JSModule", "<sample:7>"}, {"com.google.javascript.jscomp.Compiler", "disableThreads", ""}, {"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.CompilerOptions", "<sample:10>", "<sample:5>", "<sample:9>"}}, 3), new String[][]{{"setDefineToStringLiteral", "java.lang.String,java.lang.String", "1"}, {"setDefineToStringLiteral", "java.lang.String,java.lang.String", "7"}, {"getDefineReplacements", "", "6"}, {"values", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$Values", actual.getClass().getName());
  assertEquals("[STRING 0, STRING ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown ...#404#1789648253", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CompilerOptions", "com.google.javascript.jscomp.CompilerOptions", "setLooseTypes", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CompilerOptions", "enableExternExports", "boolean", "true"}, {"com.google.javascript.jscomp.CompilerOptions", "enables", "com.google.javascript.jscomp.DiagnosticGroup", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isExternExportsEnabled=true, shouldColorizeErrorOutput=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "parseTestCode", new String[]{"java.lang.String"}, new String[]{"PT1H"}, false, 4, new String[][]{{"com.google.javascript.jscomp.Compiler", "stripCode", "java.util.Set,java.util.Set,java.util.Set,java.util.Set", "<sample:2>", "<null>", "<null>", "<empty>"}, {"com.google.javascript.jscomp.Compiler", "getReverseAbstractInterpreter", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT 1 [sourcename:  [testcode] ] [synthetic: 1] [sourcefile:  [testcode] ] {getCharno=0, getChildCount=1, getDouble=!UnsupportedOperationException, getLineno=1, getQualifiedName=null, getString=!Un...#442#1722966156", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[], getMessages=[], getWarningCount=0, getWarnings=[], hasErrors=false, isIdeMode=false, isTypeCheckingEnabled=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "writeOutput", new String[]{"java.lang.Appendable", "com.google.javascript.jscomp.Compiler", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", "<sample:2>", ":", "1.5", "1.5"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getOptions", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "<sample:8>", "<sample:1>", "<sample:9>"}, {"com.google.javascript.jscomp.Compiler", "getTypeValidator", ""}}, 3), new String[][]{{"setRewriteNewDateGoogNow", "boolean", "3"}, {"skipAllCompilerPasses", "", "5"}, {"getDefineReplacements", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown ...#404#1789648253", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getOptions", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "getState", ""}, {"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "<sample:8>", "<sample:0>", "<sample:4>"}, {"com.google.javascript.jscomp.Compiler", "toSource", "com.google.javascript.rhino.Node", "<sample:4>"}}, 1), new String[][]{{"setProcessObjectPropertyString", "boolean", "7"}, {"setCodingConvention", "com.google.javascript.jscomp.CodingConvention", "7"}, {"setColorizeErrorOutput", "boolean", "4"}, {"getCodingConvention", "", "2"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown ...#404#1789648253", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "writeOutput", new String[]{"java.lang.Appendable", "com.google.javascript.jscomp.Compiler", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", "<null>", "Invalid js fiile count g", ".", ""}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.google.javascript.jscomp.AbstractCommandLineRunner", "setRunOptions", "com.google.javascript.jscomp.CompilerOptions", "<sample:3>"}, {"com.google.javascript.jscomp.CommandLineRunner", "expandSourceMapPath", "com.google.javascript.jscomp.CompilerOptions,com.google.javascript.jscomp.JSModule", "<sample:9>", "<null>"}}, 2), new String[][]{{"addWarningsGuard", "com.google.javascript.jscomp.WarningsGuard", "3"}, {"getCodingConvention", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.ClosureCodingConvention", actual.getClass().getName());
  assertEquals("{getAbstractMethodName=goog.abstractMethod, getDelegateSuperclassName=null, getExportPropertyFunction=goog.exportProperty, getExportSymbolFunction=goog.exportSymbol, getGlobalObject=goog.global}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getCssRenamingMap", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "processDefines", ""}, {"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "<sample:2>", "<sample:2>", "<sample:10>"}, {"com.google.javascript.jscomp.Compiler", "recordFunctionInformation", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown ...#404#1789648253", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:4>", "<sample:7>", "<sample:4>"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:4>", "<sample:0>", "<sample:5>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "getErrorManager", ""}, {"com.google.javascript.jscomp.Compiler", "hasErrors", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:3>", "<sample:0>", "<sample:5>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "getErrorManager", ""}, {"com.google.javascript.jscomp.Compiler", "hasErrors", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown ...#404#1789648253", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:3>", "<sample:0>", "<sample:5>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "getErrorManager", ""}, {"com.google.javascript.jscomp.Compiler", "getCodingConvention", ""}, {"com.google.javascript.jscomp.Compiler", "hasErrors", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown ...#404#1789648253", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<empty>", "<sample:0>", "<sample:7>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "getErrorManager", ""}, {"com.google.javascript.jscomp.Compiler", "hasErrors", ""}, {"com.google.javascript.jscomp.Compiler", "getSourceLine", "java.lang.String,int", "a", "1048575"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown ...#404#1789648253", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:3>", "<sample:2>", "<sample:2>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "hasErrors", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown ...#404#1789648253", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:3>", "<sample:2>", "<sample:2>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "hasErrors", ""}, {"com.google.javascript.jscomp.Compiler", "newExternInput", "java.lang.String", "+1"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown ...#404#1789648253", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", new String[]{"com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:2>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", new String[]{"com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.AbstractCommandLineRunner", "getErrorPrintStream", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", new String[]{"com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.AbstractCommandLineRunner", "doRun", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", new String[]{"com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.AbstractCommandLineRunner", "getDiagnosticGroups", ""}, {"com.google.javascript.jscomp.AbstractCommandLineRunner", "doRun", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphManifestTo", "com.google.javascript.jscomp.JSModuleGraph,java.lang.Appendable", "<sample:0>", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "doRun", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", new String[]{"com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.AbstractCommandLineRunner", "doRun", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphManifestTo", "com.google.javascript.jscomp.JSModuleGraph,java.lang.Appendable", "<sample:0>", "<empty>"}, {"com.google.javascript.jscomp.CommandLineRunner", "exit", "com.google.javascript.jscomp.AbstractCommandLineRunner$RunTimeStats,java.lang.Throwable", "<sample:3>", "<sample:3>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.AbstractCommandLineRunner", "printModuleGraphManifestTo", "com.google.javascript.jscomp.JSModuleGraph,java.lang.Appendable", "<sample:3>", "<sample:2>"}, {"com.google.javascript.jscomp.CommandLineRunner", "doRun", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.io.PrintStream", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getDefaultExterns", new String[]{}, new String[]{}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "parseSyntheticCode", new String[]{"java.lang.String"}, new String[]{"Bad"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getState", ""}}, 1), new String[][]{{"isOptionalArg", "", "7"}, {"getParent", "", "6"}, {"addChildToFront", "com.google.javascript.rhino.Node", "1"}, {"getChildBefore", "com.google.javascript.rhino.Node", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createJsModules", new String[]{"java.util.List", "java.util.List"}, new String[]{"<sample:0>", "<sample:2>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.AbstractCommandLineRunner$FlagUsageException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CompilerOptions", "com.google.javascript.jscomp.CompilerOptions", "setRenamingPolicy", new String[]{"com.google.javascript.jscomp.VariableRenamingPolicy", "com.google.javascript.jscomp.PropertyRenamingPolicy"}, new String[]{"<sample:3>", "<sample:5>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.CompilerOptions", "enableExternExports", "boolean", "false"}, {"com.google.javascript.jscomp.CompilerOptions", "setDefineToStringLiteral", "java.lang.String,java.lang.String", "1L", "-1"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isExternExportsEnabled=false, shouldColorizeErrorOutput=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", new String[]{"com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<null>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "shouldRunCompiler", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "run", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "endPass", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", new String[]{"com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:10>"}, false, 13, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "run", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "precheck", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.google.javascript.jscomp.Compiler", "report", "com.google.javascript.jscomp.JSError", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=!NullPointerException, getErrors=!NullPointerException, getMessages=!NullPointerException, getWarningCount=!NullPointerException, getWarnings=!NullPointerException, has...#307#49963817", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CompilerOptions", "com.google.javascript.jscomp.CompilerOptions", "setWarningLevel", new String[]{"com.google.javascript.jscomp.DiagnosticGroup", "com.google.javascript.jscomp.CheckLevel"}, new String[]{"<null>", "<sample:2>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isExternExportsEnabled=false, shouldColorizeErrorOutput=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSource", new String[]{"com.google.javascript.jscomp.Compiler$CodeBuilder", "int", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "2", "<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getSourceMap", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSource", new String[]{"com.google.javascript.jscomp.Compiler$CodeBuilder", "int", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "3", "<sample:6>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "getSourceMap", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown source) line (unknown line) : (unknown colu.., getWarningCount...#342#-1303714041", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSource", new String[]{"com.google.javascript.jscomp.Compiler$CodeBuilder", "int", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "-1023", "<sample:12>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "<null>", "<empty>", "<sample:10>"}, {"com.google.javascript.jscomp.Compiler", "getNodeForCodeInsertion", "com.google.javascript.jscomp.JSModule", "<sample:4>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=3, getErrors=[JSC_EMPTY_MODULE_LIST_ERROR. At least one module must be pr.., getMessages=[JSC_EMPTY_MODULE_LIST_ERROR. At least one module must be pr.., getWarningCount...#281#-1134956750", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSource", new String[]{"com.google.javascript.jscomp.Compiler$CodeBuilder", "int", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "-1023", "<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "<null>", "<empty>", "<sample:10>"}, {"com.google.javascript.jscomp.Compiler", "getNodeForCodeInsertion", "com.google.javascript.jscomp.JSModule", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSource", new String[]{"com.google.javascript.jscomp.Compiler$CodeBuilder", "int", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "-1023", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "<null>", "<empty>", "<sample:10>"}, {"com.google.javascript.jscomp.Compiler", "getNodeForCodeInsertion", "com.google.javascript.jscomp.JSModule", "<sample:1>"}, {"com.google.javascript.jscomp.Compiler", "report", "com.google.javascript.jscomp.JSError", "<sample:3>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=3, getErrors=[JSC_EMPTY_MODULE_LIST_ERROR. At least one module must be pr.., getMessages=[JSC_EMPTY_MODULE_LIST_ERROR. At least one module must be pr.., getWarningCount...#341#2043139794", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSource", new String[]{"com.google.javascript.jscomp.Compiler$CodeBuilder", "int", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "29", "<sample:0>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "<sample:5>", "<empty>", "<sample:10>"}, {"com.google.javascript.jscomp.Compiler", "isInliningForbidden", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "initModules", new String[]{"java.util.List", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:3>", "<sample:3>", "<sample:1>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CompilerOptions", "com.google.javascript.jscomp.CompilerOptions", "enableExternExports", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CompilerOptions", "setLooseTypes", "boolean", "false"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isExternExportsEnabled=true, shouldColorizeErrorOutput=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSource", new String[]{"com.google.javascript.jscomp.Compiler$CodeBuilder", "int", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "198", "<sample:4>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "<sample:8>", "<empty>", "<sample:11>"}, {"com.google.javascript.jscomp.Compiler", "isIdeMode", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown ...#404#1789648253", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", new String[]{"com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:4>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSource", new String[]{"com.google.javascript.jscomp.Compiler$CodeBuilder", "int", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "1048577", "<sample:6>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "getSourceLine", "java.lang.String,int", ".", "1048532"}, {"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "<sample:8>", "<sample:0>", "<sample:3>"}, {"com.google.javascript.jscomp.Compiler", "getSourceRegion", "java.lang.String,int", "-1.5", "-1076"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown ...#404#1789648253", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSource", new String[]{"com.google.javascript.jscomp.Compiler$CodeBuilder", "int", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "1048454", "<sample:4>"}, false, 11, new String[][]{{"com.google.javascript.jscomp.Compiler", "isTypeCheckingEnabled", ""}, {"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "<sample:8>", "<empty>", "<sample:7>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=3, getErrors=[JSC_EMPTY_MODULE_LIST_ERROR. At least one module must be pr.., getMessages=[JSC_EMPTY_MODULE_LIST_ERROR. At least one module must be pr.., getWarningCount...#281#-1134956750", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSource", new String[]{"com.google.javascript.jscomp.Compiler$CodeBuilder", "int", "com.google.javascript.rhino.Node"}, new String[]{"<sample:9>", "2147483647", "<sample:6>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "isTypeCheckingEnabled", ""}, {"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "<sample:8>", "<empty>", "<sample:7>"}, {"com.google.javascript.jscomp.Compiler", "initInputsByNameMap", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown ...#404#1789648253", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CompilerOptions", "com.google.javascript.jscomp.CompilerOptions", "setCollapsePropertiesOnExternTypes", new String[]{"boolean"}, new String[]{"false"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isExternExportsEnabled=false, shouldColorizeErrorOutput=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "shouldRunCompiler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}, {"com.google.javascript.jscomp.AbstractCommandLineRunner", "doRun", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSource", new String[]{"com.google.javascript.jscomp.Compiler$CodeBuilder", "int", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "2147483638", "<sample:12>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.Compiler", "parse", "com.google.javascript.jscomp.JSSourceFile", "<sample:8>"}, {"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "<sample:2>", "<sample:5>", "<sample:7>"}, {"com.google.javascript.jscomp.Compiler", "toSourceArray", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=1, getErrors=[JSC_EMPTY_ROOT_MODULE_ERROR. Root module {0} must contain a.., getMessages=[JSC_EMPTY_ROOT_MODULE_ERROR. Root module {0} must contain a.., getWarningCount...#281#1479895548", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CompilerOptions", "com.google.javascript.jscomp.CompilerOptions", "setDefineToNumberLiteral", new String[]{"java.lang.String", "int"}, new String[]{"9223372036854775807", "1073741815"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CompilerOptions", "getWarningsGuard", ""}, {"com.google.javascript.jscomp.CompilerOptions", "setDefineToNumberLiteral", "java.lang.String,int", "1.5", "10"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isExternExportsEnabled=false, shouldColorizeErrorOutput=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSource", new String[]{"com.google.javascript.jscomp.Compiler$CodeBuilder", "int", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "-2147483647", "<sample:12>"}, false, 15, new String[][]{{"com.google.javascript.jscomp.Compiler", "parse", "com.google.javascript.jscomp.JSSourceFile", "<sample:6>"}, {"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "<sample:7>", "<sample:2>", "<sample:7>"}, {"com.google.javascript.jscomp.Compiler", "toSourceArray", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=3, getErrors=[JSC_READ_ERROR. Cannot read: <a><b>t</b></a> at (unknown so.., getMessages=[JSC_READ_ERROR. Cannot read: <a><b>t</b></a> at (unknown so.., getWarningCount...#281#-150348988", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CompilerOptions", "com.google.javascript.jscomp.CompilerOptions", "disables", new String[]{"com.google.javascript.jscomp.DiagnosticGroup"}, new String[]{"<sample:6>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isExternExportsEnabled=false, shouldColorizeErrorOutput=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSource", new String[]{"com.google.javascript.jscomp.Compiler$CodeBuilder", "int", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "2147352575", "<sample:12>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "parse", "com.google.javascript.jscomp.JSSourceFile", "<sample:0>"}, {"com.google.javascript.jscomp.Compiler", "toSourceArray", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown source) line (unknown line) : (unknown colu.., getWarningCount...#342#-1303714041", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "parseTestCode", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "throwInternalError", new String[]{"java.lang.String", "java.lang.Exception"}, new String[]{"--1", "<sample:1>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "expandSourceMapPath", new String[]{"com.google.javascript.jscomp.CompilerOptions", "com.google.javascript.jscomp.JSModule"}, new String[]{"<sample:10>", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", "com.google.javascript.jscomp.CompilerOptions", "<sample:5>"}, {"com.google.javascript.jscomp.AbstractCommandLineRunner", "createExterns", ""}, {"com.google.javascript.jscomp.AbstractCommandLineRunner", "getErrorPrintStream", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createJsModules", new String[]{"java.util.List", "java.util.List"}, new String[]{"<empty>", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createJsModules", new String[]{"java.util.List", "java.util.List"}, new String[]{"<sample:3>", "<sample:7>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.AbstractCommandLineRunner$FlagUsageException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getScopeCreator", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.google.javascript.jscomp.Compiler", "optimize", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=!NullPointerException, getErrors=!NullPointerException, getMessages=!NullPointerException, getWarningCount=!NullPointerException, getWarnings=!NullPointerException, has...#307#49963817", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "processResults", new String[]{"com.google.javascript.jscomp.Result", "com.google.javascript.jscomp.JSModule[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:8>", "<sample:5>", "<sample:5>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "initOptionsFromFlags", "com.google.javascript.jscomp.CompilerOptions", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CompilerOptions", "com.google.javascript.jscomp.CompilerOptions", "setLooseTypes", new String[]{"boolean"}, new String[]{"true"}, false, 3, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isExternExportsEnabled=false, shouldColorizeErrorOutput=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "setUnnormalized", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.google.javascript.jscomp.Compiler", "computeCFG", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=!NullPointerException, getErrors=!NullPointerException, getMessages=!NullPointerException, getWarningCount=!NullPointerException, getWarnings=!NullPointerException, has...#307#49963817", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "setUnnormalized", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.google.javascript.jscomp.Compiler", "computeCFG", ""}, {"com.google.javascript.jscomp.Compiler", "recordFunctionInformation", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=!NullPointerException, getErrors=!NullPointerException, getMessages=!NullPointerException, getWarningCount=!NullPointerException, getWarnings=!NullPointerException, has...#307#49963817", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CompilerOptions", "com.google.javascript.jscomp.CompilerOptions", "getCodingConvention", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isExternExportsEnabled=false, shouldColorizeErrorOutput=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<null>", "<sample:2>", "<sample:9>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getWarningCount", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:1>", "<empty>", "<sample:10>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "newTracer", "java.lang.String", "1048576"}, {"com.google.javascript.jscomp.Compiler", "initOptions", "com.google.javascript.jscomp.CompilerOptions", "<null>"}, {"com.google.javascript.jscomp.Compiler", "getWarningCount", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:4>", "<sample:1>", "<sample:7>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.CompilerOptions", "<sample:0>", "<sample:1>", "<sample:10>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "init", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:1>", "<null>", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:3>", "<sample:2>", "<sample:5>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "hasErrors", ""}, {"com.google.javascript.jscomp.Compiler", "newExternInput", "java.lang.String", "+1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown ...#404#1789648253", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CompilerOptions", "com.google.javascript.jscomp.CompilerOptions", "setManageClosureDependencies", new String[]{"boolean"}, new String[]{"false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isExternExportsEnabled=false, shouldColorizeErrorOutput=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "normalize", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", new String[]{"com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "writeOutput", new String[]{"java.lang.Appendable", "com.google.javascript.jscomp.Compiler", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "<sample:2>", "0xFFFFFFFF", "Invalid js file count '", "'"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "removeTryCatchFinally", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", new String[]{"com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:2>"}, false, 13, new String[][]{{"com.google.javascript.jscomp.AbstractCommandLineRunner", "processResults", "com.google.javascript.jscomp.Result,com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "<sample:6>", "<sample:1>", "<sample:10>"}, {"com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", ""}, {"com.google.javascript.jscomp.AbstractCommandLineRunner", "expandSourceMapPath", "com.google.javascript.jscomp.CompilerOptions,com.google.javascript.jscomp.JSModule", "<sample:5>", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile", "com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:2>", "<sample:4>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "addToDebugLog", "java.lang.String", "'"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", new String[]{"com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.AbstractCommandLineRunner", "processResults", "com.google.javascript.jscomp.Result,com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "<sample:6>", "<sample:1>", "<sample:9>"}, {"com.google.javascript.jscomp.CommandLineRunner", "expandSourceMapPath", "com.google.javascript.jscomp.CompilerOptions,com.google.javascript.jscomp.JSModule", "<sample:7>", "<sample:1>"}, {"com.google.javascript.jscomp.AbstractCommandLineRunner", "getCommandLineConfig", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "rebuildInputsFromModules", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "normalize", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown source) line (unknown line) : (unknown colu.., getWarningCount...#342#-1303714041", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "rebuildInputsFromModules", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Compiler", "initInputsByNameMap", ""}, {"com.google.javascript.jscomp.Compiler", "normalize", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "initOptionsFromFlags", new String[]{"com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "init", new String[]{"java.util.List", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:2>", "<empty>", "<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.CompilerOptions", "<null>", "<sample:2>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "expandManifest", new String[]{"com.google.javascript.jscomp.JSModule"}, new String[]{"<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "throwInternalError", new String[]{"java.lang.String", "java.lang.Exception"}, new String[]{"7", "<sample:0>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.Compiler", "hasErrors", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getInputsForTesting", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown source) line (unknown line) : (unknown colu.., getWarningCount...#342#-1303714041", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getInputsForTesting", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=!NullPointerException, getErrors=!NullPointerException, getMessages=!NullPointerException, getWarningCount=!NullPointerException, getWarnings=!NullPointerException, has...#307#49963817", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CompilerOptions", "com.google.javascript.jscomp.CompilerOptions", "setDefineToNumberLiteral", new String[]{"java.lang.String", "int"}, new String[]{"-", "2147483647"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CompilerOptions", "isExternExportsEnabled", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isExternExportsEnabled=false, shouldColorizeErrorOutput=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "expandManifest", new String[]{"com.google.javascript.jscomp.JSModule"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", new String[]{"com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:10>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "shouldRunCompiler", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "run", ""}, {"com.google.javascript.jscomp.AbstractCommandLineRunner", "getCompiler", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createExterns", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.AbstractCommandLineRunner", "expandSourceMapPath", "com.google.javascript.jscomp.CompilerOptions,com.google.javascript.jscomp.JSModule", "<sample:5>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", new String[]{"com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<null>"}, false, 8, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}, {"com.google.javascript.jscomp.AbstractCommandLineRunner", "getErrorPrintStream", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "run", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "areNodesEqualForInlining", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "areNodesEqualForInlining", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<null>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CompilerOptions", "com.google.javascript.jscomp.CompilerOptions", "setSummaryDetailLevel", new String[]{"int"}, new String[]{"1048575"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CompilerOptions", "setDefineToDoubleLiteral", "java.lang.String,double", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isExternExportsEnabled=false, shouldColorizeErrorOutput=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "setState", new String[]{"com.google.javascript.jscomp.Compiler$IntermediateState"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "prepareAst", "com.google.javascript.rhino.Node", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getPassConfig", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.DefaultPassConfig", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown source) line (unknown line) : (unknown colu.., getWarningCount...#342#-1303714041", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "precheck", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown source) line (unknown line) : (unknown colu.., getWarningCount...#342#-1303714041", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphManifestTo", new String[]{"com.google.javascript.jscomp.JSModuleGraph", "java.lang.Appendable"}, new String[]{"<sample:4>", "<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CompilerOptions", "com.google.javascript.jscomp.CompilerOptions", "enableRuntimeTypeCheck", new String[]{"java.lang.String"}, new String[]{"-9223372036854775808"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isExternExportsEnabled=false, shouldColorizeErrorOutput=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSource", new String[]{"com.google.javascript.jscomp.Compiler$CodeBuilder", "int", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "7", "<null>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.Compiler", "setUnnormalized", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "parse", new String[]{"com.google.javascript.jscomp.JSSourceFile"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "writeOutput", new String[]{"java.lang.Appendable", "com.google.javascript.jscomp.Compiler", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"<sample:0>", "<sample:4>", "'", "1.5e300", "1.12345678901234567"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "computeCFG", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CompilerOptions", "com.google.javascript.jscomp.CompilerOptions", "setDefineToDoubleLiteral", new String[]{"java.lang.String", "double"}, new String[]{" more in module:", "1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isExternExportsEnabled=false, shouldColorizeErrorOutput=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSource", new String[]{"com.google.javascript.jscomp.Compiler$CodeBuilder", "int", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "6", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "doRun", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "expandSourceMapPath", "com.google.javascript.jscomp.CompilerOptions,com.google.javascript.jscomp.JSModule", "<sample:9>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getErrorManager", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "stopTracer", "com.google.javascript.jscomp.Tracer,java.lang.String", "<sample:7>", "/dev/null"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown source) line (unknown line) : (unknown colu.., getWarningCount...#342#-1303714041", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "expandSourceMapPath", new String[]{"com.google.javascript.jscomp.CompilerOptions", "com.google.javascript.jscomp.JSModule"}, new String[]{"<sample:7>", "<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSource", new String[]{"com.google.javascript.jscomp.Compiler$CodeBuilder", "int", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "-1076", "<sample:10>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "endPass", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown source) line (unknown line) : (unknown colu.., getWarningCount...#342#-1303714041", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSource", new String[]{"com.google.javascript.jscomp.Compiler$CodeBuilder", "int", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "-1076", "<sample:10>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "getFunctionalInformationMap", ""}, {"com.google.javascript.jscomp.Compiler", "endPass", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown source) line (unknown line) : (unknown colu.., getWarningCount...#342#-1303714041", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "initModules", new String[]{"java.util.List", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:1>", "<empty>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSource", new String[]{"com.google.javascript.jscomp.Compiler$CodeBuilder", "int", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "-1076", "<sample:12>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "<null>", "<empty>", "<sample:10>"}, {"com.google.javascript.jscomp.Compiler", "getNodeForCodeInsertion", "com.google.javascript.jscomp.JSModule", "<sample:4>"}, {"com.google.javascript.jscomp.Compiler", "endPass", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=3, getErrors=[JSC_EMPTY_MODULE_LIST_ERROR. At least one module must be pr.., getMessages=[JSC_EMPTY_MODULE_LIST_ERROR. At least one module must be pr.., getWarningCount...#281#-1134956750", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CompilerOptions", "com.google.javascript.jscomp.CompilerOptions", "isExternExportsEnabled", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.CompilerOptions", "setRenamingPolicy", "com.google.javascript.jscomp.VariableRenamingPolicy,com.google.javascript.jscomp.PropertyRenamingPolicy", "<sample:2>", "<sample:3>"}, {"com.google.javascript.jscomp.CompilerOptions", "setRewriteNewDateGoogNow", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isExternExportsEnabled=false, shouldColorizeErrorOutput=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSource", new String[]{"com.google.javascript.jscomp.Compiler$CodeBuilder", "int", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "-1023", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "<null>", "<empty>", "<sample:10>"}, {"com.google.javascript.jscomp.Compiler", "getNodeForCodeInsertion", "com.google.javascript.jscomp.JSModule", "<sample:1>"}, {"com.google.javascript.jscomp.Compiler", "report", "com.google.javascript.jscomp.JSError", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=3, getErrors=[JSC_EMPTY_MODULE_LIST_ERROR. At least one module must be pr.., getMessages=[JSC_EMPTY_MODULE_LIST_ERROR. At least one module must be pr.., getWarningCount...#341#2043139794", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSource", new String[]{"com.google.javascript.jscomp.Compiler$CodeBuilder", "int", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "-1023", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "<sample:3>", "<empty>", "<sample:10>"}, {"com.google.javascript.jscomp.Compiler", "getNodeForCodeInsertion", "com.google.javascript.jscomp.JSModule", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=3, getErrors=[JSC_EMPTY_MODULE_LIST_ERROR. At least one module must be pr.., getMessages=[JSC_EMPTY_MODULE_LIST_ERROR. At least one module must be pr.., getWarningCount...#281#-1134956750", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSource", new String[]{"com.google.javascript.jscomp.Compiler$CodeBuilder", "int", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "511", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "<sample:5>", "<empty>", "<sample:10>"}, {"com.google.javascript.jscomp.Compiler", "isInliningForbidden", ""}, {"com.google.javascript.jscomp.Compiler", "getNodeForCodeInsertion", "com.google.javascript.jscomp.JSModule", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=3, getErrors=[JSC_EMPTY_MODULE_LIST_ERROR. At least one module must be pr.., getMessages=[JSC_EMPTY_MODULE_LIST_ERROR. At least one module must be pr.., getWarningCount...#281#-1134956750", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSource", new String[]{"com.google.javascript.jscomp.Compiler$CodeBuilder", "int", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "100", "<sample:7>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "<sample:5>", "<empty>", "<sample:10>"}, {"com.google.javascript.jscomp.Compiler", "isInliningForbidden", ""}, {"com.google.javascript.jscomp.Compiler", "getNodeForCodeInsertion", "com.google.javascript.jscomp.JSModule", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "endPass", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getSourceLine", "java.lang.String,int", "1048576", "-1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSource", new String[]{"com.google.javascript.jscomp.Compiler$CodeBuilder", "int", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "2147483647", "<sample:10>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "getErrorManager", ""}, {"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "<sample:5>", "<empty>", "<sample:10>"}, {"com.google.javascript.jscomp.Compiler", "isInliningForbidden", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown ...#404#1789648253", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.CompilerOptions", actual.getClass().getName());
  assertEquals("{isExternExportsEnabled=false, shouldColorizeErrorOutput=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSource", new String[]{"com.google.javascript.jscomp.Compiler$CodeBuilder", "int", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "66", "<sample:10>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "<sample:8>", "<empty>", "<sample:11>"}, {"com.google.javascript.jscomp.Compiler", "init", "java.util.List,java.util.List,com.google.javascript.jscomp.CompilerOptions", "<sample:7>", "<sample:0>", "<sample:11>"}, {"com.google.javascript.jscomp.Compiler", "isInliningForbidden", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown ...#404#1789648253", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "initModules", new String[]{"java.util.List", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<null>", "<sample:7>", "<sample:11>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "report", "com.google.javascript.jscomp.JSError", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSource", new String[]{"com.google.javascript.jscomp.Compiler$CodeBuilder", "int", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "2147483630", "<sample:8>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "throwInternalError", "java.lang.String,java.lang.Exception", "", "<sample:0>"}, {"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "<sample:8>", "<sample:0>", "<sample:6>"}, {"com.google.javascript.jscomp.Compiler", "parse", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getTopScope", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Compiler", "getNodeForCodeInsertion", "com.google.javascript.jscomp.JSModule", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=!NullPointerException, getErrors=!NullPointerException, getMessages=!NullPointerException, getWarningCount=!NullPointerException, getWarnings=!NullPointerException, has...#307#49963817", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSource", new String[]{"com.google.javascript.jscomp.Compiler$CodeBuilder", "int", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "1073741815", "<sample:8>"}, false, 13, new String[][]{{"com.google.javascript.jscomp.Compiler", "throwInternalError", "java.lang.String,java.lang.Exception", "", "<sample:0>"}, {"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "<sample:8>", "<sample:0>", "<sample:6>"}, {"com.google.javascript.jscomp.Compiler", "parse", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "throwInternalError", new String[]{"java.lang.String", "java.lang.Exception"}, new String[]{"/dev/null", "<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "toSourceArray", ""}, {"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.CompilerOptions", "<sample:3>", "<sample:7>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", new String[]{"com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}, {"com.google.javascript.jscomp.AbstractCommandLineRunner", "expandSourceMapPath", "com.google.javascript.jscomp.CompilerOptions,com.google.javascript.jscomp.JSModule", "<sample:9>", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSource", new String[]{"com.google.javascript.jscomp.Compiler$CodeBuilder", "int", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "2147483638", "<sample:6>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "getModuleGraph", ""}, {"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "<sample:8>", "<sample:0>", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown ...#404#1789648253", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSource", new String[]{"com.google.javascript.jscomp.Compiler$CodeBuilder", "int", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "2147483638", "<sample:6>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "getSourceLine", "java.lang.String,int", ".5", "1048576"}, {"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "<sample:8>", "<sample:0>", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown ...#404#1789648253", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.AbstractCommandLineRunner", "createOptions", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "createCompiler", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Compiler", actual.getClass().getName());
  assertEquals("{getAstDotGraph=, getErrorCount=!NullPointerException, getErrors=!NullPointerException, getMessages=!NullPointerException, getWarningCount=!NullPointerException, getWarnings=!NullPointerException, has...#307#49963817", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CompilerOptions", "com.google.javascript.jscomp.CompilerOptions", "skipAllCompilerPasses", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isExternExportsEnabled=false, shouldColorizeErrorOutput=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CompilerOptions", "com.google.javascript.jscomp.CompilerOptions", "getDefineReplacements", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isExternExportsEnabled=false, shouldColorizeErrorOutput=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSource", new String[]{"com.google.javascript.jscomp.Compiler$CodeBuilder", "int", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "-2147483648", "<sample:10>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "isTypeCheckingEnabled", ""}, {"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "<sample:8>", "<empty>", "<sample:7>"}, {"com.google.javascript.jscomp.Compiler", "resetUniqueNameId", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown ...#404#1789648253", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSourceArray", new String[]{"com.google.javascript.jscomp.JSModule"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getScopeCreator", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getDiagnosticGroups", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "exit", "com.google.javascript.jscomp.AbstractCommandLineRunner$RunTimeStats,java.lang.Throwable", "<sample:0>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.DiagnosticGroups", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CompilerOptions", "com.google.javascript.jscomp.CompilerOptions", "setCodingConvention", new String[]{"com.google.javascript.jscomp.CodingConvention"}, new String[]{"<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isExternExportsEnabled=false, shouldColorizeErrorOutput=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getCommandLineConfig", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.AbstractCommandLineRunner", "createExterns", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CompilerOptions", "com.google.javascript.jscomp.CompilerOptions", "setDefineToNumberLiteral", new String[]{"java.lang.String", "int"}, new String[]{" but found ", "-1"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CompilerOptions", "setReplaceStringsConfiguration", "java.lang.String,java.util.List", "Best time: ", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isExternExportsEnabled=false, shouldColorizeErrorOutput=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CompilerOptions", "com.google.javascript.jscomp.CompilerOptions", "setCodingConvention", new String[]{"com.google.javascript.jscomp.CodingConvention"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CompilerOptions", "enables", "com.google.javascript.jscomp.DiagnosticGroup", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isExternExportsEnabled=false, shouldColorizeErrorOutput=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AbstractCommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Compiler", actual.getClass().getName());
  assertEquals("{getAstDotGraph=, getErrorCount=!NullPointerException, getErrors=!NullPointerException, getMessages=!NullPointerException, getWarningCount=!NullPointerException, getWarnings=!NullPointerException, has...#307#49963817", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "initOptions", new String[]{"com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "<sample:3>", "<empty>", "<sample:9>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=3, getErrors=[JSC_EMPTY_MODULE_LIST_ERROR. At least one module must be pr.., getMessages=[JSC_EMPTY_MODULE_LIST_ERROR. At least one module must be pr.., getWarningCount...#281#-1134956750", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CompilerOptions", "com.google.javascript.jscomp.CompilerOptions", "getCodingConvention", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isExternExportsEnabled=false, shouldColorizeErrorOutput=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CompilerOptions", "com.google.javascript.jscomp.CompilerOptions", "setCollapsePropertiesOnExternTypes", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isExternExportsEnabled=false, shouldColorizeErrorOutput=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getCompiler", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "writeOutput", new String[]{"java.lang.Appendable", "com.google.javascript.jscomp.Compiler", "java.lang.String", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "<sample:5>", "stdin", "1.5e300", "2020-01-01"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CompilerOptions", "com.google.javascript.jscomp.CompilerOptions", "setDefineToNumberLiteral", new String[]{"java.lang.String", "int"}, new String[]{"-0.0", "1048577"}, false, 7, new String[][]{{"com.google.javascript.jscomp.CompilerOptions", "setProcessObjectPropertyString", "boolean", "false"}, {"com.google.javascript.jscomp.CompilerOptions", "getCodingConvention", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isExternExportsEnabled=false, shouldColorizeErrorOutput=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CompilerOptions", "com.google.javascript.jscomp.CompilerOptions", "enables", new String[]{"com.google.javascript.jscomp.DiagnosticGroup"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CompilerOptions", "addWarningsGuard", "com.google.javascript.jscomp.WarningsGuard", "<sample:2>"}, {"com.google.javascript.jscomp.CompilerOptions", "setLooseTypes", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isExternExportsEnabled=false, shouldColorizeErrorOutput=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CompilerOptions", "com.google.javascript.jscomp.CompilerOptions", "addWarningsGuard", new String[]{"com.google.javascript.jscomp.WarningsGuard"}, new String[]{"<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isExternExportsEnabled=false, shouldColorizeErrorOutput=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getDefaultErrorReporter", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Compiler", "setUnnormalized", ""}, {"com.google.javascript.jscomp.Compiler", "newExternInput", "java.lang.String", "010"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.RhinoErrorReporter$NewRhinoErrorReporter", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=!NullPointerException, getErrors=!NullPointerException, getMessages=!NullPointerException, getWarningCount=!NullPointerException, getWarnings=!NullPointerException, has...#307#49963817", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CompilerOptions", "com.google.javascript.jscomp.CompilerOptions", "setRenamingPolicy", new String[]{"com.google.javascript.jscomp.VariableRenamingPolicy", "com.google.javascript.jscomp.PropertyRenamingPolicy"}, new String[]{"<sample:0>", "<sample:3>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.CompilerOptions", "enableExternExports", "boolean", "true"}, {"com.google.javascript.jscomp.CompilerOptions", "setProcessObjectPropertyString", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isExternExportsEnabled=true, shouldColorizeErrorOutput=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "shouldRunCompiler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", ""}, {"com.google.javascript.jscomp.AbstractCommandLineRunner", "setRunOptions", "com.google.javascript.jscomp.CompilerOptions", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CompilerOptions", "com.google.javascript.jscomp.CompilerOptions", "setSummaryDetailLevel", new String[]{"int"}, new String[]{"66"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CompilerOptions", "disableRuntimeTypeCheck", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isExternExportsEnabled=false, shouldColorizeErrorOutput=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getDefaultExterns", new String[]{}, new String[]{}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
}
