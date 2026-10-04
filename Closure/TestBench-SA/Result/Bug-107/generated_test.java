package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "isInTestMode", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getCommandLineConfig", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 20, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createCompiler", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", "com.google.javascript.jscomp.CompilerOptions", "<sample:6>"}}, 2), new String[][]{{"getTweakProcessing", "", "4"}, {"disableRuntimeTypeCheck", "", "4"}, {"getAliasTransformationHandler", "", "5"}, {"logAliasTransformation", "java.lang.String,com.google.javascript.rhino.SourcePosition", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.CompilerOptions$NullAliasTransformationHandler$NullAliasTransformation", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "run", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "createInputs", "java.util.List,boolean", "<sample:3>", "false"}}, 2), new String[][]{{"format", "java.lang.String,java.lang.Object[]", "4"}, {"println", "char", "6"}});
  assertNotNull(actual);
  assertEquals("java.io.PrintStream", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getDiagnosticGroups", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.DiagnosticGroups", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getDiagnosticGroups", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "expandSourceMapPath", "com.google.javascript.jscomp.CompilerOptions,com.google.javascript.jscomp.JSModule", "<sample:5>", "<sample:5>"}, {"com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", ""}}, 2), new String[][]{{"forName", "java.lang.String", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createExterns", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", "com.google.javascript.jscomp.CompilerOptions", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createExterns", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", "com.google.javascript.jscomp.CompilerOptions", "<sample:2>"}, {"com.google.javascript.jscomp.CommandLineRunner", "checkModuleName", "java.lang.String", "true"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getDefaultExterns", new String[]{}, new String[]{}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "checkModuleName", new String[]{"java.lang.String"}, new String[]{"-1"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "doRun", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "expandSourceMapPath", "com.google.javascript.jscomp.CompilerOptions,com.google.javascript.jscomp.JSModule", "<sample:7>", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.AbstractCommandLineRunner$FlagUsageException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "checkModuleName", new String[]{"java.lang.String"}, new String[]{"false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "doRun", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "expandSourceMapPath", "com.google.javascript.jscomp.CompilerOptions,com.google.javascript.jscomp.JSModule", "<sample:7>", "<sample:4>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "processResults", new String[]{"com.google.javascript.jscomp.Result", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:6>", "<sample:2>", "<sample:1>"}, false, 11, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "doRun", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "processResults", new String[]{"com.google.javascript.jscomp.Result", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:7>", "<empty>", "<sample:1>"}, false, 9, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "outputSingleBinary", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.CompilerOptions", actual.getClass().getName());
  assertEquals("{getCheckDeterminism=false, getCheckEventfulObjectDisposalPolicy=OFF, getInferTypes=false, getInstrumentMemoryAllocations=false, getLanguageIn=ECMASCRIPT3, getLanguageOut=null, getTracerMode=OFF, getT...#358#1032831614", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "writeOutput", new String[]{"java.lang.Appendable", "com.google.javascript.jscomp.Compiler", "java.lang.String", "java.lang.String", "java.lang.String", "com.google.common.base.Function"}, new String[]{"<null>", "<sample:1>", "1e10", "12:30:45", "i", "<sample:3>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "shouldRunCompiler", new String[]{}, new String[]{}, false, 43, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "isInTestMode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "shouldRunCompiler", new String[]{}, new String[]{}, false, 59, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createCompiler", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getJavascriptEscaper", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "expandSourceMapPath", "com.google.javascript.jscomp.CompilerOptions,com.google.javascript.jscomp.JSModule", "<sample:6>", "<sample:4>"}, {"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getCommandLineConfig", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphManifestOrBundleTo", new String[]{"com.google.javascript.jscomp.JSModuleGraph", "java.lang.Appendable", "boolean"}, new String[]{"<null>", "<empty>", "true"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "writeModuleOutput", new String[]{"java.lang.Appendable", "com.google.javascript.jscomp.JSModule"}, new String[]{"<sample:2>", "<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 28, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphJsonTo", "java.lang.Appendable", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.CompilerOptions", actual.getClass().getName());
  assertEquals("{getCheckDeterminism=false, getCheckEventfulObjectDisposalPolicy=OFF, getInferTypes=false, getInstrumentMemoryAllocations=false, getLanguageIn=ECMASCRIPT3, getLanguageOut=null, getTracerMode=OFF, getT...#358#1032831614", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "expandSourceMapPath", new String[]{"com.google.javascript.jscomp.CompilerOptions", "com.google.javascript.jscomp.JSModule"}, new String[]{"<sample:6>", "<sample:4>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "writeModuleOutput", "java.lang.Appendable,com.google.javascript.jscomp.JSModule", "<sample:0>", "<sample:4>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "expandSourceMapPath", new String[]{"com.google.javascript.jscomp.CompilerOptions", "com.google.javascript.jscomp.JSModule"}, new String[]{"<sample:6>", "<sample:7>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "expandSourceMapPath", new String[]{"com.google.javascript.jscomp.CompilerOptions", "com.google.javascript.jscomp.JSModule"}, new String[]{"<null>", "<sample:1>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "checkModuleName", new String[]{"java.lang.String"}, new String[]{":"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createInputs", "java.util.List,boolean", "<sample:2>", "true"}, {"com.google.javascript.jscomp.CommandLineRunner", "processResults", "com.google.javascript.jscomp.Result,java.util.List,com.google.javascript.jscomp.CompilerOptions", "<sample:7>", "<sample:0>", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.AbstractCommandLineRunner$FlagUsageException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "checkModuleName", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFFPRINT_INPUT_DELIMITER"}, false, 12, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "checkModuleName", "java.lang.String", "0x1F"}, {"com.google.javascript.jscomp.CommandLineRunner", "filenameToOutputStream", "java.lang.String", "0xFFFFEFFR1"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.AbstractCommandLineRunner$FlagUsageException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createDefineOrTweakReplacements", new String[]{"java.util.List", "com.google.javascript.jscomp.CompilerOptions", "boolean"}, new String[]{"<null>", "<null>", "false"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getJavascriptEscaper", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "outputSingleBinary", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getCommandLineConfig", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getCompiler", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "run", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "filenameToOutputStream", "java.lang.String", "(--[a-zA-Z_]+)=(.*)"}}, 2), new String[][]{{"setCollapseObjectLiterals", "boolean", "4"}, {"setCheckUnreachableCode", "com.google.javascript.jscomp.CheckLevel", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.CompilerOptions", actual.getClass().getName());
  assertEquals("{getCheckDeterminism=false, getCheckEventfulObjectDisposalPolicy=OFF, getInferTypes=false, getInstrumentMemoryAllocations=false, getLanguageIn=ECMASCRIPT3, getLanguageOut=null, getTracerMode=OFF, getT...#358#1032831614", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 24, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "run", ""}}, 1), new String[][]{{"setCollapseObjectLiterals", "boolean", "4"}, {"getLanguageOut", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 36, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "expandSourceMapPath", "com.google.javascript.jscomp.CompilerOptions,com.google.javascript.jscomp.JSModule", "<sample:0>", "<sample:5>"}, {"com.google.javascript.jscomp.CommandLineRunner", "run", ""}}, 2), new String[][]{{"setCollapseObjectLiterals", "boolean", "4"}, {"getLanguageOut", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getDefaultExterns", new String[]{}, new String[]{}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "doRun", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createJsModules", "java.util.List,java.util.List", "<sample:0>", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 18, new String[][]{}, 3), new String[][]{{"setAssumeClosuresOnlyCaptureReferences", "boolean", "4"}, {"getLanguageOut", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "run", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "getCommandLineConfig", ""}}, 3), new String[][]{{"setAssumeClosuresOnlyCaptureReferences", "boolean", "3"}, {"getCodingConvention", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.ClosureCodingConvention", actual.getClass().getName());
  assertEquals("{getAbstractMethodName=goog.abstractMethod, getDelegateSuperclassName=null, getExportPropertyFunction=goog.exportProperty, getExportSymbolFunction=goog.exportSymbol, getGlobalObject=goog.global}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createDefineOrTweakReplacements", new String[]{"java.util.List", "com.google.javascript.jscomp.CompilerOptions", "boolean"}, new String[]{"<empty>", "<sample:4>", "true"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 25, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "getCommandLineConfig", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "createInputs", "java.util.List,boolean", "<sample:5>", "true"}}, 1), new String[][]{{"enableRuntimeTypeCheck", "java.lang.String", "1"}, {"isExternExportsEnabled", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getDiagnosticGroups", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}}, 2), new String[][]{{"getTracerMode", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.CompilerOptions$TracerMode", actual.getClass().getName());
  assertEquals("OFF", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getJavascriptEscaper", new String[]{}, new String[]{}, false, 20, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "filenameToOutputStream", new String[]{"java.lang.String"}, new String[]{"1.12345678901234567"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.io.FileOutputStream", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createJsModules", new String[]{"java.util.List", "java.util.List"}, new String[]{"<sample:1>", "<sample:2>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.AbstractCommandLineRunner$FlagUsageException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "writeOutput", new String[]{"java.lang.Appendable", "com.google.javascript.jscomp.Compiler", "java.lang.String", "java.lang.String", "java.lang.String", "com.google.common.base.Function"}, new String[]{"<sample:2>", "<sample:3>", "0xFFFFFFFF", "/externs.zip", "Hello, World", "<sample:3>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "shouldRunCompiler", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphManifestOrBundleTo", "com.google.javascript.jscomp.JSModuleGraph,java.lang.Appendable,boolean", "<sample:3>", "<sample:1>", "false"}, {"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}}, 3), new String[][]{{"setClosurePass", "boolean", "2"}, {"assumeClosuresOnlyCaptureReferences", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "writeModuleOutput", new String[]{"java.lang.Appendable", "com.google.javascript.jscomp.JSModule"}, new String[]{"<sample:2>", "<sample:3>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createDependencyOptions", new String[]{"boolean", "boolean", "boolean", "java.util.List"}, new String[]{"false", "false", "true", "<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.DependencyOptions", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "expandSourceMapPath", new String[]{"com.google.javascript.jscomp.CompilerOptions", "com.google.javascript.jscomp.JSModule"}, new String[]{"<sample:2>", "<sample:6>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "writeOutput", new String[]{"java.lang.Appendable", "com.google.javascript.jscomp.Compiler", "java.lang.String", "java.lang.String", "java.lang.String", "com.google.common.base.Function"}, new String[]{"<sample:0>", "<sample:5>", "ERROR - ", "null", "Reading XTB file", "<null>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createDependencyOptions", new String[]{"boolean", "boolean", "boolean", "java.util.List"}, new String[]{"true", "false", "false", "<sample:2>"}, true, 0, null, 2), new String[][]{{"setEntryPoints", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.DependencyOptions", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", "com.google.javascript.jscomp.CompilerOptions", "<sample:1>"}, {"com.google.javascript.jscomp.CommandLineRunner", "createInputs", "java.util.List,boolean", "<sample:0>", "false"}}, 3), new String[][]{{"isDisambiguatePrivateProperties", "", "6"}, {"setAliasKeywords", "boolean", "0"}, {"getDefineReplacements", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}}, 2), new String[][]{{"isDisambiguatePrivateProperties", "", "6"}, {"setAliasKeywords", "boolean", "2"}, {"resetWarningsGuard", "", "4"}, {"assumeStrictThis", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "shouldRunCompiler", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", ""}}, 2), new String[][]{{"isDisambiguatePrivateProperties", "", "6"}, {"setAnonymousFunctionNaming", "com.google.javascript.jscomp.AnonymousFunctionNamingPolicy", "4"}, {"getAliasTransformationHandler", "", "1"}, {"logAliasTransformation", "java.lang.String,com.google.javascript.rhino.SourcePosition", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 31, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}}, 1), new String[][]{{"isDisambiguatePrivateProperties", "", "6"}, {"getCheckEventfulObjectDisposalPolicy", "", "4"}, {"getAliasTransformationHandler", "", "5"}, {"logAliasTransformation", "java.lang.String,com.google.javascript.rhino.SourcePosition", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "processResults", "com.google.javascript.jscomp.Result,java.util.List,com.google.javascript.jscomp.CompilerOptions", "<sample:0>", "<sample:1>", "<sample:7>"}, {"com.google.javascript.jscomp.CommandLineRunner", "getCompiler", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}}, 3), new String[][]{{"isDisambiguatePrivateProperties", "", "2"}, {"setCollapseProperties", "boolean", "4"}, {"getAliasTransformationHandler", "", "5"}, {"logAliasTransformation", "java.lang.String,com.google.javascript.rhino.SourcePosition", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "isInTestMode", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "isInTestMode", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", "com.google.javascript.jscomp.CompilerOptions", "<sample:6>"}}, 2), new String[][]{{"getTweakProcessing", "", "4"}, {"setCollapseProperties", "boolean", "4"}, {"getAliasTransformationHandler", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.CompilerOptions$NullAliasTransformationHandler", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createExterns", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "expandSourceMapPath", "com.google.javascript.jscomp.CompilerOptions,com.google.javascript.jscomp.JSModule", "<null>", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getJavascriptEscaper", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphJsonTo", "java.lang.Appendable", "<sample:0>"}}, 2), new String[][]{{"setAliasStringsBlacklist", "java.lang.String", "4"}, {"setAliasTransformationHandler", "com.google.javascript.jscomp.CompilerOptions$AliasTransformationHandler", "1"}, {"getAliasTransformationHandler", "", "7"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 25, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "getJavascriptEscaper", ""}}, 1), new String[][]{{"setCheckControlStructures", "boolean", "4"}, {"setAliasTransformationHandler", "com.google.javascript.jscomp.CompilerOptions$AliasTransformationHandler", "1"}, {"getAliasTransformationHandler", "", "7"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "expandSourceMapPath", "com.google.javascript.jscomp.CompilerOptions,com.google.javascript.jscomp.JSModule", "<sample:5>", "<sample:1>"}, {"com.google.javascript.jscomp.CommandLineRunner", "filenameToOutputStream", "java.lang.String", "no"}}, 1);
  assertNotNull(actual);
  assertEquals("java.io.PrintStream", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "isInTestMode", ""}}, 3), new String[][]{{"setAssumeStrictThis", "boolean", "7"}, {"setAliasTransformationHandler", "com.google.javascript.jscomp.CompilerOptions$AliasTransformationHandler", "6"}, {"getCodingConvention", "", "6"}, {"getExportPropertyFunction", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("goog.exportProperty", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "isInTestMode", ""}}, 1), new String[][]{{"setAssumeStrictThis", "boolean", "0"}, {"setAliasTransformationHandler", "com.google.javascript.jscomp.CompilerOptions$AliasTransformationHandler", "6"}, {"getCodingConvention", "", "6"}, {"getExportPropertyFunction", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("goog.exportProperty", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}}, 1), new String[][]{{"setAssumeStrictThis", "boolean", "2"}, {"disableRuntimeTypeCheck", "", "6"}, {"getCodingConvention", "", "3"}, {"getExportSymbolFunction", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("goog.exportSymbol", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}}, 3), new String[][]{{"setAssumeStrictThis", "boolean", "2"}, {"disableRuntimeTypeCheck", "", "6"}, {"getCodingConvention", "", "3"}, {"getExportSymbolFunction", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("goog.exportSymbol", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "shouldRunCompiler", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}}, 1), new String[][]{{"setAssumeStrictThis", "boolean", "3"}, {"disableRuntimeTypeCheck", "", "6"}, {"getCodingConvention", "", "3"}, {"identifyTypeDeclarationCall", "com.google.javascript.rhino.Node", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "doRun", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "outputSingleBinary", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createJsModules", new String[]{"java.util.List", "java.util.List"}, new String[]{"<sample:1>", "<empty>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "isInTestMode", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "expandSourceMapPath", "com.google.javascript.jscomp.CompilerOptions,com.google.javascript.jscomp.JSModule", "<sample:7>", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.AbstractCommandLineRunner$FlagUsageException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", new String[]{"com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:0>"}, false, 14, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "checkModuleName", "java.lang.String", "-1.5"}, {"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", "com.google.javascript.jscomp.CompilerOptions", "<sample:3>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getDiagnosticGroups", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getJavascriptEscaper", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.DiagnosticGroups", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getDiagnosticGroups", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getJavascriptEscaper", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}}, 3), new String[][]{{"forName", "java.lang.String", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphManifestOrBundleTo", new String[]{"com.google.javascript.jscomp.JSModuleGraph", "java.lang.Appendable", "boolean"}, new String[]{"<sample:4>", "<sample:0>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "doRun", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "createCompiler", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphManifestOrBundleTo", new String[]{"com.google.javascript.jscomp.JSModuleGraph", "java.lang.Appendable", "boolean"}, new String[]{"<sample:3>", "<null>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "doRun", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "createCompiler", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createJsModules", new String[]{"java.util.List", "java.util.List"}, new String[]{"<empty>", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "outputSingleBinary", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createJsModules", new String[]{"java.util.List", "java.util.List"}, new String[]{"<empty>", "<sample:0>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "processResults", new String[]{"com.google.javascript.jscomp.Result", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:3>", "<null>", "<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "expandSourceMapPath", "com.google.javascript.jscomp.CompilerOptions,com.google.javascript.jscomp.JSModule", "<sample:0>", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "isInTestMode", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getCommandLineConfig", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createInputs", "java.util.List,boolean", "<sample:3>", "false"}});
  assertNotNull(actual);
  assertEquals("java.io.PrintStream", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "run", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "createInputs", "java.util.List,boolean", "<sample:3>", "false"}});
  assertNotNull(actual);
  assertEquals("java.io.PrintStream", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createDefineOrTweakReplacements", new String[]{"java.util.List", "com.google.javascript.jscomp.CompilerOptions", "boolean"}, new String[]{"<sample:3>", "<sample:4>", "false"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createExterns", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", new String[]{"com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", "com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Function", "<sample:2>", "<sample:0>", "<null>", "<sample:6>"}, {"com.google.javascript.jscomp.CommandLineRunner", "run", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createInputs", new String[]{"java.util.List", "boolean"}, new String[]{"<empty>", "true"}, false, 5, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "outputSingleBinary", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "doRun", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getJavascriptEscaper", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "processResults", new String[]{"com.google.javascript.jscomp.Result", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:0>", "<sample:2>", "<null>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphJsonTo", new String[]{"java.lang.Appendable"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "filenameToOutputStream", "java.lang.String", "(--[a-zA-Z_]+)=(.*)"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "checkModuleName", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "doRun", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "expandSourceMapPath", "com.google.javascript.jscomp.CompilerOptions,com.google.javascript.jscomp.JSModule", "<sample:7>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "checkModuleName", new String[]{"java.lang.String"}, new String[]{"-1"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "doRun", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "expandSourceMapPath", "com.google.javascript.jscomp.CompilerOptions,com.google.javascript.jscomp.JSModule", "<sample:7>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.AbstractCommandLineRunner$FlagUsageException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", new String[]{"com.google.common.base.Supplier", "com.google.common.base.Supplier", "com.google.common.base.Supplier", "com.google.common.base.Function"}, new String[]{"<sample:1>", "<sample:3>", "<sample:4>", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "outputSingleBinary", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", "com.google.javascript.jscomp.CompilerOptions", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "checkModuleName", new String[]{"java.lang.String"}, new String[]{"false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "doRun", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "expandSourceMapPath", "com.google.javascript.jscomp.CompilerOptions,com.google.javascript.jscomp.JSModule", "<sample:7>", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getDiagnosticGroups", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.DiagnosticGroups", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "processResults", new String[]{"com.google.javascript.jscomp.Result", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:0>", "<null>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "createCompiler", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "processResults", new String[]{"com.google.javascript.jscomp.Result", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:6>", "<sample:0>", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "createCompiler", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "processResults", new String[]{"com.google.javascript.jscomp.Result", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<null>", "<null>", "<sample:0>"}, false, 11, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "writeModuleOutput", "java.lang.Appendable,com.google.javascript.jscomp.JSModule", "<sample:1>", "<sample:2>"}, {"com.google.javascript.jscomp.CommandLineRunner", "doRun", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "processResults", new String[]{"com.google.javascript.jscomp.Result", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:7>", "<null>", "<sample:0>"}, false, 11, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "doRun", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "outputSingleBinary", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.CompilerOptions", actual.getClass().getName());
  assertEquals("{getCheckDeterminism=false, getCheckEventfulObjectDisposalPolicy=OFF, getInferTypes=false, getInstrumentMemoryAllocations=false, getLanguageIn=ECMASCRIPT3, getLanguageOut=null, getTracerMode=OFF, getT...#358#1032831614", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "processResults", "com.google.javascript.jscomp.Result,java.util.List,com.google.javascript.jscomp.CompilerOptions", "<sample:2>", "<empty>", "<sample:1>"}, {"com.google.javascript.jscomp.CommandLineRunner", "outputSingleBinary", ""}}), new String[][]{{"setAliasStringsBlacklist", "java.lang.String", "1"}, {"getInstrumentMemoryAllocations", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "shouldRunCompiler", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "writeOutput", new String[]{"java.lang.Appendable", "com.google.javascript.jscomp.Compiler", "java.lang.String", "java.lang.String", "java.lang.String", "com.google.common.base.Function"}, new String[]{"<empty>", "<sample:0>", "0x1F", "0x123456789", " ", "<sample:7>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getDefaultExterns", new String[]{}, new String[]{}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "outputSingleBinary", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getCompiler", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "isInTestMode", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "shouldRunCompiler", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Compiler", actual.getClass().getName());
  assertEquals("{getAstDotGraph=, getErrorCount=!NullPointerException, getErrors=!NullPointerException, getMessages=!NullPointerException, getProgress=0.0, getWarningCount=!NullPointerException, getWarnings=!NullPoin...#324#756948161", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "java.util.List"}, new String[]{"<sample:0>", "<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", "com.google.javascript.jscomp.CompilerOptions", "<sample:0>"}}), new String[][]{{"getLanguageIn", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.CompilerOptions$LanguageMode", actual.getClass().getName());
  assertEquals("ECMASCRIPT3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "doRun", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "checkModuleName", "java.lang.String", "i"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "expandSourceMapPath", new String[]{"com.google.javascript.jscomp.CompilerOptions", "com.google.javascript.jscomp.JSModule"}, new String[]{"<sample:1>", "<sample:5>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createCompiler", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createInputs", new String[]{"java.util.List", "boolean"}, new String[]{"<sample:3>", "false"}, false);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getCommandLineConfig", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createDependencyOptions", new String[]{"boolean", "boolean", "boolean", "java.util.List"}, new String[]{"false", "true", "true", "<empty>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.AbstractCommandLineRunner$FlagUsageException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphManifestOrBundleTo", new String[]{"com.google.javascript.jscomp.JSModuleGraph", "java.lang.Appendable", "boolean"}, new String[]{"<null>", "<sample:1>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphJsonTo", "java.lang.Appendable", "<null>"}, {"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "doRun", ""}}), new String[][]{{"setBrokenClosureRequiresLevel", "com.google.javascript.jscomp.CheckLevel", "3"}, {"getCodingConvention", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.ClosureCodingConvention", actual.getClass().getName());
  assertEquals("{getAbstractMethodName=goog.abstractMethod, getDelegateSuperclassName=null, getExportPropertyFunction=goog.exportProperty, getExportSymbolFunction=goog.exportSymbol, getGlobalObject=goog.global}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getDiagnosticGroups", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createJsModules", "java.util.List,java.util.List", "<empty>", "<sample:0>"}}), new String[][]{{"forName", "java.lang.String", "7"}, {"forName", "java.lang.String", "6"}, {"forName", "java.lang.String", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createDependencyOptions", new String[]{"boolean", "boolean", "boolean", "java.util.List"}, new String[]{"false", "false", "false", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.DependencyOptions", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createDefineOrTweakReplacements", new String[]{"java.util.List", "com.google.javascript.jscomp.CompilerOptions", "boolean"}, new String[]{"<null>", "<sample:7>", "true"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "writeModuleOutput", new String[]{"java.lang.Appendable", "com.google.javascript.jscomp.JSModule"}, new String[]{"<sample:2>", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "run", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "run", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "filenameToOutputStream", "java.lang.String", "(--[a-zA-Z_]+)=(.*)"}}), new String[][]{{"setCollapseObjectLiterals", "boolean", "4"}, {"setCheckUnreachableCode", "com.google.javascript.jscomp.CheckLevel", "0"}, {"getTweakReplacements", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "filenameToOutputStream", new String[]{"java.lang.String"}, new String[]{"\t"}, false);
  assertNotNull(actual);
  assertEquals("java.io.FileOutputStream", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 32, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "run", ""}}), new String[][]{{"setCollapseObjectLiterals", "boolean", "4"}, {"getLanguageOut", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createDependencyOptions", new String[]{"boolean", "boolean", "boolean", "java.util.List"}, new String[]{"false", "false", "false", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createJsModules", new String[]{"java.util.List", "java.util.List"}, new String[]{"<sample:3>", "<empty>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "expandSourceMapPath", "com.google.javascript.jscomp.CompilerOptions,com.google.javascript.jscomp.JSModule", "<sample:3>", "<sample:2>"}, {"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.AbstractCommandLineRunner$FlagUsageException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "expandSourceMapPath", new String[]{"com.google.javascript.jscomp.CompilerOptions", "com.google.javascript.jscomp.JSModule"}, new String[]{"<null>", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getDiagnosticGroups", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}}), new String[][]{{"getTracerMode", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.CompilerOptions$TracerMode", actual.getClass().getName());
  assertEquals("OFF", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "filenameToOutputStream", new String[]{"java.lang.String"}, new String[]{"PRINT_INPUT_DELIMITER"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "run", ""}}), new String[][]{{"write", "byte[],int,int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "java.util.List"}, new String[]{"<null>", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphManifestOrBundleTo", new String[]{"com.google.javascript.jscomp.JSModuleGraph", "java.lang.Appendable", "boolean"}, new String[]{"<sample:2>", "<sample:3>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "doRun", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createInputs", new String[]{"java.util.List", "boolean"}, new String[]{"<sample:1>", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getDiagnosticGroups", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createJsModules", new String[]{"java.util.List", "java.util.List"}, new String[]{"<null>", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "isInTestMode", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "main", new String[]{"java.lang.String[]"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createInputs", new String[]{"java.util.List", "boolean"}, new String[]{"<sample:2>", "false"}, false, 7, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "checkModuleName", "java.lang.String", "Hello, World"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "java.util.List"}, new String[]{"<sample:1>", "<empty>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.AbstractCommandLineRunner$FlagUsageException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createInputs", new String[]{"java.util.List", "boolean"}, new String[]{"<null>", "true"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", new String[]{"com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<null>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createJsModules", "java.util.List,java.util.List", "<sample:2>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 31, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "getDiagnosticGroups", ""}}), new String[][]{{"isDisambiguatePrivateProperties", "", "6"}, {"setAnonymousFunctionNaming", "com.google.javascript.jscomp.AnonymousFunctionNamingPolicy", "4"}, {"getAliasTransformationHandler", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.CompilerOptions$NullAliasTransformationHandler", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createOptions", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}}), new String[][]{{"isDisambiguatePrivateProperties", "", "6"}, {"setAnonymousFunctionNaming", "com.google.javascript.jscomp.AnonymousFunctionNamingPolicy", "4"}, {"getAliasTransformationHandler", "", "5"}, {"logAliasTransformation", "java.lang.String,com.google.javascript.rhino.SourcePosition", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.CompilerOptions$NullAliasTransformationHandler$NullAliasTransformation", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createDefineOrTweakReplacements", new String[]{"java.util.List", "com.google.javascript.jscomp.CompilerOptions", "boolean"}, new String[]{"<sample:2>", "<sample:0>", "true"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "writeOutput", new String[]{"java.lang.Appendable", "com.google.javascript.jscomp.Compiler", "java.lang.String", "java.lang.String", "java.lang.String", "com.google.common.base.Function"}, new String[]{"<null>", "<sample:4>", "yes", ".5", "1.12345678", "<sample:5>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "filenameToOutputStream", new String[]{"java.lang.String"}, new String[]{" "}, false), new String[][]{{"write", "int", "2"}, {"getFD", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.io.FileDescriptor", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", new String[]{"com.google.common.base.Supplier", "com.google.common.base.Supplier", "com.google.common.base.Supplier", "com.google.common.base.Function"}, new String[]{"<sample:0>", "<null>", "<sample:1>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "java.util.List"}, new String[]{"<sample:0>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "writeOutput", new String[]{"java.lang.Appendable", "com.google.javascript.jscomp.Compiler", "java.lang.String", "java.lang.String", "java.lang.String", "com.google.common.base.Function"}, new String[]{"<sample:3>", "<sample:7>", "1L", "", "", "<sample:7>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphManifestOrBundleTo", new String[]{"com.google.javascript.jscomp.JSModuleGraph", "java.lang.Appendable", "boolean"}, new String[]{"<sample:7>", "<sample:1>", "false"}, false, 14, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "run", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "run", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "doRun", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphManifestOrBundleTo", "com.google.javascript.jscomp.JSModuleGraph,java.lang.Appendable,boolean", "<sample:1>", "<null>", "false"}}), new String[][]{{"getWarnings", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "processResults", new String[]{"com.google.javascript.jscomp.Result", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<null>", "<null>", "<sample:5>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", "com.google.javascript.jscomp.CompilerOptions", "<sample:4>"}, {"com.google.javascript.jscomp.CommandLineRunner", "outputSingleBinary", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "main", new String[]{"java.lang.String[]"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createDependencyOptions", new String[]{"boolean", "boolean", "boolean", "java.util.List"}, new String[]{"false", "true", "true", "<empty>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.AbstractCommandLineRunner$FlagUsageException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createDependencyOptions", new String[]{"boolean", "boolean", "boolean", "java.util.List"}, new String[]{"false", "true", "true", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "processResults", new String[]{"com.google.javascript.jscomp.Result", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:3>", "<sample:2>", "<sample:3>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "expandSourceMapPath", "com.google.javascript.jscomp.CompilerOptions,com.google.javascript.jscomp.JSModule", "<sample:2>", "<sample:9>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "processResults", new String[]{"com.google.javascript.jscomp.Result", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<null>", "<sample:3>", "<sample:6>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphJsonTo", "java.lang.Appendable", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getDiagnosticGroups", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", "com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Function", "<sample:0>", "<sample:7>", "<sample:3>", "<sample:2>"}, {"com.google.javascript.jscomp.CommandLineRunner", "outputSingleBinary", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.DiagnosticGroups", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "filenameToOutputStream", new String[]{"java.lang.String"}, new String[]{"./"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "doRun", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "getCommandLineConfig", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getCommandLineConfig", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", new String[]{}, new String[]{}, false), new String[][]{{"println", "boolean", "7"}, {"print", "char[]", "4"}, {"checkError", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphJsonTo", new String[]{"java.lang.Appendable"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createJsModules", "java.util.List,java.util.List", "<sample:1>", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "processResults", new String[]{"com.google.javascript.jscomp.Result", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:4>", "<empty>", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "run", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "processResults", new String[]{"com.google.javascript.jscomp.Result", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:3>", "<empty>", "<sample:0>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", "com.google.javascript.jscomp.CompilerOptions", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "processResults", new String[]{"com.google.javascript.jscomp.Result", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<null>", "<empty>", "<sample:0>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", "com.google.javascript.jscomp.CompilerOptions", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createInputs", new String[]{"java.util.List", "boolean"}, new String[]{"<sample:0>", "false"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "writeModuleOutput", new String[]{"java.lang.Appendable", "com.google.javascript.jscomp.JSModule"}, new String[]{"<null>", "<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createCompiler", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getCompiler", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getCompiler", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "outputSingleBinary", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "filenameToOutputStream", new String[]{"java.lang.String"}, new String[]{"Y"}, false, 2, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}}, 1), new String[][]{{"write", "int", "7"}, {"flush", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.io.FileOutputStream", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "filenameToOutputStream", new String[]{"java.lang.String"}, new String[]{"Y1.022345l6789012346670"}, false, 1, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}}, 1), new String[][]{{"write", "int", "7"}, {"flush", "", "1"}, {"write", "int", "1"}, {"getFD", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.io.FileDescriptor", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "filenameToOutputStream", new String[]{"java.lang.String"}, new String[]{""}, false, 1, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createInputs", new String[]{"java.util.List", "boolean"}, new String[]{"<empty>", "false"}, false, 13, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getCompiler", ""}}), new String[][]{{"add", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createInputs", new String[]{"java.util.List", "boolean"}, new String[]{"<sample:3>", "false"}, false, 13, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getCompiler", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "run", ""}}, 3), new String[][]{{"add", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createInputs", new String[]{"java.util.List", "boolean"}, new String[]{"<sample:3>", "false"}, false, 13, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "filenameToOutputStream", "java.lang.String", "a,b,c"}, {"com.google.javascript.jscomp.CommandLineRunner", "getCompiler", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "run", ""}}, 1), new String[][]{{"add", "java.lang.Object", "7"}, {"retainAll", "java.util.Collection", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createInputs", new String[]{"java.util.List", "boolean"}, new String[]{"<sample:1>", "false"}, false, 13, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "filenameToOutputStream", "java.lang.String", "a,b,c"}, {"com.google.javascript.jscomp.CommandLineRunner", "run", ""}}, 1), new String[][]{{"add", "java.lang.Object", "7"}, {"retainAll", "java.util.Collection", "4"}, {"indexOf", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createInputs", new String[]{"java.util.List", "boolean"}, new String[]{"<sample:4>", "true"}, false, 14, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "run", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "filenameToOutputStream", "java.lang.String", "1.25"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createInputs", new String[]{"java.util.List", "boolean"}, new String[]{"<sample:3>", "false"}, false, 9, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createJsModules", "java.util.List,java.util.List", "<sample:2>", "<sample:2>"}, {"com.google.javascript.jscomp.CommandLineRunner", "run", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", "com.google.javascript.jscomp.CompilerOptions", "<sample:5>"}}), new String[][]{{"add", "java.lang.Object", "7"}, {"retainAll", "java.util.Collection", "4"}, {"indexOf", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createInputs", new String[]{"java.util.List", "boolean"}, new String[]{"<empty>", "false"}, false, 9, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createJsModules", "java.util.List,java.util.List", "<sample:2>", "<sample:2>"}, {"com.google.javascript.jscomp.CommandLineRunner", "run", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", "com.google.javascript.jscomp.CompilerOptions", "<sample:5>"}}, 2), new String[][]{{"add", "java.lang.Object", "7"}, {"retainAll", "java.util.Collection", "4"}, {"indexOf", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createInputs", new String[]{"java.util.List", "boolean"}, new String[]{"<sample:5>", "true"}, false), new String[][]{{"iterator", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", new String[]{"com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", new String[]{"com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:0>"}, false, 9, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", new String[]{"com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<null>"}, false, 15, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "shouldRunCompiler", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "outputSingleBinary", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphJsonTo", new String[]{"java.lang.Appendable"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "doRun", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getDefaultExterns", new String[]{}, new String[]{}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphJsonTo", "java.lang.Appendable", "<sample:2>"}}), new String[][]{{"getAstDotGraph", "", "0"}, {"getErrorManager", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.PrintStreamErrorManager", actual.getClass().getName());
  assertEquals("{getErrorCount=0, getErrors=[], getTypedPercent=0.0, getWarningCount=0, getWarnings=[]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", new String[]{"com.google.common.base.Supplier", "com.google.common.base.Supplier", "com.google.common.base.Supplier", "com.google.common.base.Function"}, new String[]{"<sample:3>", "<sample:0>", "<sample:2>", "<sample:5>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "filenameToOutputStream", "java.lang.String", "1234456779012345678901234567890"}, {"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getCommandLineConfig", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}}), new String[][]{{"getTopScope", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "getCompiler", ""}}, 2), new String[][]{{"getInputsById", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "getCompiler", ""}}, 1), new String[][]{{"getInputsById", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 31, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}}), new String[][]{{"compile", "com.google.javascript.jscomp.SourceFile,com.google.javascript.jscomp.SourceFile,com.google.javascript.jscomp.CompilerOptions", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 44, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Compiler", actual.getClass().getName());
  assertEquals("{getAstDotGraph=, getErrorCount=!NullPointerException, getErrors=!NullPointerException, getMessages=!NullPointerException, getProgress=0.0, getWarningCount=!NullPointerException, getWarnings=!NullPoin...#324#756948161", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphJsonTo", new String[]{"java.lang.Appendable"}, new String[]{"<sample:0>"}, false, 11, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getDiagnosticGroups", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.io.PrintStream", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"replaceScript", "com.google.javascript.jscomp.JsAst", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "java.util.List"}, new String[]{"<sample:0>", "<sample:2>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "isInTestMode", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createDependencyOptions", new String[]{"boolean", "boolean", "boolean", "java.util.List"}, new String[]{"false", "false", "false", "<empty>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "java.util.List"}, new String[]{"<empty>", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "filenameToOutputStream", new String[]{"java.lang.String"}, new String[]{"ECMASCRIPT3"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "writeModuleOutput", "java.lang.Appendable,com.google.javascript.jscomp.JSModule", "<sample:3>", "<sample:5>"}}), new String[][]{{"write", "byte[],int,int", "1"}, {"getFD", "", "7"}, {"valid", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "writeModuleOutput", "java.lang.Appendable,com.google.javascript.jscomp.JSModule", "<sample:1>", "<null>"}, {"com.google.javascript.jscomp.CommandLineRunner", "isInTestMode", ""}}, 3), new String[][]{{"compile", "com.google.javascript.jscomp.SourceFile,com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.CompilerOptions", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "outputSingleBinary", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphJsonTo", "java.lang.Appendable", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphManifestOrBundleTo", new String[]{"com.google.javascript.jscomp.JSModuleGraph", "java.lang.Appendable", "boolean"}, new String[]{"<sample:5>", "<null>", "true"}, false, 1, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphManifestOrBundleTo", "com.google.javascript.jscomp.JSModuleGraph,java.lang.Appendable,boolean", "<sample:5>", "<sample:0>", "false"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createInputs", new String[]{"java.util.List", "boolean"}, new String[]{"<sample:3>", "true"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "main", new String[]{"java.lang.String[]"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createInputs", new String[]{"java.util.List", "boolean"}, new String[]{"<sample:3>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "filenameToOutputStream", "java.lang.String", "123456789012345678901234567891"}, {"com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", "com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Function", "<sample:6>", "<sample:5>", "<sample:7>", "<sample:3>"}, {"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}}, 2), new String[][]{{"listIterator", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createInputs", new String[]{"java.util.List", "boolean"}, new String[]{"<sample:3>", "false"}, false, 13, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "filenameToOutputStream", "java.lang.String", "123456789/12345678901234567891"}, {"com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", "com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Function", "<sample:6>", "<sample:5>", "<sample:7>", "<sample:3>"}, {"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}}, 2), new String[][]{{"listIterator", "int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createInputs", new String[]{"java.util.List", "boolean"}, new String[]{"<null>", "true"}, false, 4, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", "com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Function", "<sample:8>", "<sample:5>", "<sample:7>", "<sample:5>"}, {"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createInputs", new String[]{"java.util.List", "boolean"}, new String[]{"<empty>", "true"}, false, 4, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", "com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Function", "<sample:8>", "<sample:5>", "<sample:7>", "<sample:5>"}, {"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}}, 2), new String[][]{{"isEmpty", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "processResults", new String[]{"com.google.javascript.jscomp.Result", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:1>", "<sample:2>", "<sample:2>"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "doRun", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getCompiler", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", new String[]{"com.google.common.base.Supplier", "com.google.common.base.Supplier", "com.google.common.base.Supplier", "com.google.common.base.Function"}, new String[]{"<sample:0>", "<sample:4>", "<sample:4>", "<sample:6>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "doRun", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", "com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Function", "<sample:1>", "<sample:3>", "<null>", "<sample:5>"}, {"com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", "com.google.javascript.jscomp.CompilerOptions", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "filenameToOutputStream", new String[]{"java.lang.String"}, new String[]{"PNETTY_PRINT"}, false, 2, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getCommandLineConfig", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.io.FileOutputStream", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createJsModules", new String[]{"java.util.List", "java.util.List"}, new String[]{"<sample:2>", "<sample:0>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.AbstractCommandLineRunner$FlagUsageException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createJsModules", new String[]{"java.util.List", "java.util.List"}, new String[]{"<empty>", "<sample:0>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", "com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Function", "<null>", "<sample:3>", "<sample:4>", "<sample:4>"}, {"com.google.javascript.jscomp.CommandLineRunner", "createJsModules", "java.util.List,java.util.List", "<sample:0>", "<null>"}}, 3), new String[][]{{"reportCodeChange", "", "1"}, {"getSourceMap", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "writeModuleOutput", "java.lang.Appendable,com.google.javascript.jscomp.JSModule", "<empty>", "<null>"}}, 3), new String[][]{{"toSource", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "filenameToOutputStream", "java.lang.String", "0x1F"}, {"com.google.javascript.jscomp.CommandLineRunner", "writeModuleOutput", "java.lang.Appendable,com.google.javascript.jscomp.JSModule", "<empty>", "<sample:5>"}, {"com.google.javascript.jscomp.CommandLineRunner", "doRun", ""}}), new String[][]{{"toSource", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphManifestOrBundleTo", new String[]{"com.google.javascript.jscomp.JSModuleGraph", "java.lang.Appendable", "boolean"}, new String[]{"<sample:2>", "<sample:2>", "false"}, false, 12, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createInputs", "java.util.List,boolean", "<sample:0>", "true"}, {"com.google.javascript.jscomp.CommandLineRunner", "doRun", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getCompiler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", "com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Function", "<sample:3>", "<sample:3>", "<sample:4>", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", new String[]{"com.google.common.base.Supplier", "com.google.common.base.Supplier", "com.google.common.base.Supplier", "com.google.common.base.Function"}, new String[]{"<sample:7>", "<sample:1>", "<sample:5>", "<sample:3>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createInputs", new String[]{"java.util.List", "boolean"}, new String[]{"<sample:6>", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "createJsModules", "java.util.List,java.util.List", "<sample:2>", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createInputs", new String[]{"java.util.List", "boolean"}, new String[]{"<sample:9>", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "createJsModules", "java.util.List,java.util.List", "<sample:2>", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createInputs", new String[]{"java.util.List", "boolean"}, new String[]{"<sample:12>", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "createJsModules", "java.util.List,java.util.List", "<sample:2>", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createInputs", new String[]{"java.util.List", "boolean"}, new String[]{"<sample:1>", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "createJsModules", "java.util.List,java.util.List", "<sample:2>", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createInputs", new String[]{"java.util.List", "boolean"}, new String[]{"<sample:3>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "createJsModules", "java.util.List,java.util.List", "<sample:2>", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createInputs", new String[]{"java.util.List", "boolean"}, new String[]{"<empty>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}}, 3), new String[][]{{"add", "int,java.lang.Object", "2"}, {"isEmpty", "", "3"}, {"contains", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createInputs", new String[]{"java.util.List", "boolean"}, new String[]{"<sample:3>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "doRun", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "checkModuleName", "java.lang.String", "ERROR - "}}, 3), new String[][]{{"add", "int,java.lang.Object", "2"}, {"isEmpty", "", "3"}, {"contains", "java.lang.Object", "0"}, {"add", "int,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[2, 2, sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "filenameToOutputStream", new String[]{"java.lang.String"}, new String[]{"PRINT_INPUT_DELIMITER"}, false), new String[][]{{"close", "", "6"}, {"getFD", "", "3"}, {"valid", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getDiagnosticGroups", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1), new String[][]{{"forName", "java.lang.String", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createInputs", "java.util.List,boolean", "<sample:0>", "true"}, {"com.google.javascript.jscomp.CommandLineRunner", "getJavascriptEscaper", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Compiler", actual.getClass().getName());
  assertEquals("{getAstDotGraph=, getErrorCount=!NullPointerException, getErrors=!NullPointerException, getMessages=!NullPointerException, getProgress=0.0, getWarningCount=!NullPointerException, getWarnings=!NullPoin...#324#756948161", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "filenameToOutputStream", new String[]{"java.lang.String"}, new String[]{"./"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", new String[]{}, new String[]{}, false), new String[][]{{"append", "java.lang.CharSequence,int,int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}}), new String[][]{{"toSource", "com.google.javascript.jscomp.JSModule", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "filenameToOutputStream", new String[]{"java.lang.String"}, new String[]{"<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createInputs", new String[]{"java.util.List", "boolean"}, new String[]{"<null>", "false"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createDependencyOptions", new String[]{"boolean", "boolean", "boolean", "java.util.List"}, new String[]{"false", "false", "false", "<empty>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createDefineOrTweakReplacements", new String[]{"java.util.List", "com.google.javascript.jscomp.CompilerOptions", "boolean"}, new String[]{"<sample:0>", "<sample:2>", "false"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createDependencyOptions", new String[]{"boolean", "boolean", "boolean", "java.util.List"}, new String[]{"true", "true", "true", "<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.DependencyOptions", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createDefineOrTweakReplacements", new String[]{"java.util.List", "com.google.javascript.jscomp.CompilerOptions", "boolean"}, new String[]{"<sample:0>", "<null>", "true"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "checkModuleName", new String[]{"java.lang.String"}, new String[]{"false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "writeModuleOutput", "java.lang.Appendable,com.google.javascript.jscomp.JSModule", "<sample:0>", "<sample:1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createDefineOrTweakReplacements", new String[]{"java.util.List", "com.google.javascript.jscomp.CompilerOptions", "boolean"}, new String[]{"<sample:3>", "<sample:1>", "true"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", new String[]{"com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:1>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "outputSingleBinary", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "processResults", "com.google.javascript.jscomp.Result,java.util.List,com.google.javascript.jscomp.CompilerOptions", "<null>", "<null>", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Compiler", actual.getClass().getName());
  assertEquals("{getAstDotGraph=, getErrorCount=!NullPointerException, getErrors=!NullPointerException, getMessages=!NullPointerException, getProgress=0.0, getWarningCount=!NullPointerException, getWarnings=!NullPoin...#324#756948161", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "filenameToOutputStream", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, false), new String[][]{{"getChannel", "", "5"}, {"position", "", "1"}, {"position", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createJsModules", "java.util.List,java.util.List", "<sample:0>", "<sample:2>"}, {"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "createCompiler", ""}}, 2), new String[][]{{"init", "com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.CompilerOptions", "1"}, {"compile", "com.google.javascript.jscomp.SourceFile,com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.CompilerOptions", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"write", "byte[],int,int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", new String[]{"com.google.common.base.Supplier", "com.google.common.base.Supplier", "com.google.common.base.Supplier", "com.google.common.base.Function"}, new String[]{"<sample:5>", "<sample:7>", "<null>", "<sample:4>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createJsModules", "java.util.List,java.util.List", "<sample:0>", "<sample:3>"}, {"com.google.javascript.jscomp.CommandLineRunner", "createInputs", "java.util.List,boolean", "<empty>", "true"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createExterns", new String[]{}, new String[]{}, false, 26, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", "com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Function", "<sample:3>", "<null>", "<sample:4>", "<sample:7>"}, {"com.google.javascript.jscomp.CommandLineRunner", "createJsModules", "java.util.List,java.util.List", "<sample:0>", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "filenameToOutputStream", new String[]{"java.lang.String"}, new String[]{"true"}, false, 0, null, 3), new String[][]{{"close", "", "3"}, {"write", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "filenameToOutputStream", new String[]{"java.lang.String"}, new String[]{"trXuePT11H"}, false, 0, null, 3), new String[][]{{"close", "", "3"}, {"getChannel", "", "1"}});
  assertNotNull(actual);
  assertEquals("sun.nio.ch.FileChannelImpl", actual.getClass().getName());
  assertEquals("{isOpen=false, size=!ClosedChannelException}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "filenameToOutputStream", new String[]{"java.lang.String"}, new String[]{"0x1F"}, false, 8, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphJsonTo", "java.lang.Appendable", "<sample:3>"}}, 3), new String[][]{{"close", "", "3"}, {"getChannel", "", "1"}, {"transferFrom", "java.nio.channels.ReadableByteChannel,long,long", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.channels.ClosedChannelException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "filenameToOutputStream", new String[]{"java.lang.String"}, new String[]{">X1/6d51.5f"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphManifestOrBundleTo", "com.google.javascript.jscomp.JSModuleGraph,java.lang.Appendable,boolean", "<sample:7>", "<sample:1>", "true"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.FileNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "filenameToOutputStream", new String[]{"java.lang.String"}, new String[]{"]"}, false, 8, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", "com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Function", "<sample:3>", "<null>", "<sample:4>", "<sample:0>"}, {"com.google.javascript.jscomp.CommandLineRunner", "shouldRunCompiler", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "getCompiler", ""}}, 1), new String[][]{{"getChannel", "", "1"}, {"position", "long", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "filenameToOutputStream", new String[]{"java.lang.String"}, new String[]{"a,b,c"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphJsonTo", "java.lang.Appendable", "<sample:3>"}, {"com.google.javascript.jscomp.CommandLineRunner", "outputSingleBinary", ""}}, 2), new String[][]{{"getFD", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.io.FileDescriptor", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "filenameToOutputStream", new String[]{"java.lang.String"}, new String[]{"6."}, false, 8, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "outputSingleBinary", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "outputSingleBinary", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}}, 2), new String[][]{{"getFD", "", "0"}, {"valid", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "run", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", "com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Function", "<null>", "<sample:5>", "<null>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getCompiler", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "getCompiler", ""}}), new String[][]{{"setErrorManager", "com.google.javascript.jscomp.ErrorManager", "6"}, {"getSourceMap", "", "4"}, {"getWarningCount", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "processResults", new String[]{"com.google.javascript.jscomp.Result", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:4>", "<sample:3>", "<sample:7>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "writeModuleOutput", "java.lang.Appendable,com.google.javascript.jscomp.JSModule", "<empty>", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "processResults", new String[]{"com.google.javascript.jscomp.Result", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:7>", "<sample:3>", "<sample:7>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "writeModuleOutput", "java.lang.Appendable,com.google.javascript.jscomp.JSModule", "<empty>", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createInputs", new String[]{"java.util.List", "boolean"}, new String[]{"<sample:6>", "false"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createInputs", new String[]{"java.util.List", "boolean"}, new String[]{"<sample:3>", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createCompiler", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}}, 1), new String[][]{{"isEmpty", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createInputs", new String[]{"java.util.List", "boolean"}, new String[]{"<sample:3>", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createInputs", new String[]{"java.util.List", "boolean"}, new String[]{"<sample:5>", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, 0, sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "writeOutput", new String[]{"java.lang.Appendable", "com.google.javascript.jscomp.Compiler", "java.lang.String", "java.lang.String", "java.lang.String", "com.google.common.base.Function"}, new String[]{"<sample:3>", "<null>", "1", "externs.zip", "", "<sample:5>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "filenameToOutputStream", new String[]{"java.lang.String"}, new String[]{"b1.12345678"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getCompiler", ""}}, 2), new String[][]{{"getChannel", "", "5"}});
  assertNotNull(actual);
  assertEquals("sun.nio.ch.FileChannelImpl", actual.getClass().getName());
  assertEquals("{isOpen=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "filenameToOutputStream", new String[]{"java.lang.String"}, new String[]{"\n"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}}, 1), new String[][]{{"write", "int", "6"}, {"getChannel", "", "3"}, {"read", "java.nio.ByteBuffer,long", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.nio.channels.NonReadableChannelException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createDependencyOptions", new String[]{"boolean", "boolean", "boolean", "java.util.List"}, new String[]{"true", "false", "false", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "java.util.List"}, new String[]{"<sample:3>", "<empty>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.AbstractCommandLineRunner$FlagUsageException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "isInTestMode", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createInputs", new String[]{"java.util.List", "boolean"}, new String[]{"<sample:1>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "doRun", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", new String[]{"com.google.common.base.Supplier", "com.google.common.base.Supplier", "com.google.common.base.Supplier", "com.google.common.base.Function"}, new String[]{"<sample:5>", "<sample:5>", "<null>", "<sample:8>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createInputs", "java.util.List,boolean", "<sample:0>", "false"}, {"com.google.javascript.jscomp.CommandLineRunner", "isInTestMode", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "checkModuleName", "java.lang.String", "PRINT_INPUT_DELIMITER"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1), new String[][]{{"getSourceMap", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "filenameToOutputStream", new String[]{"java.lang.String"}, new String[]{"1.15-0z/"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "isInTestMode", ""}}, 1), new String[][]{{"write", "int", "6"}, {"write", "byte[],int,int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "main", new String[]{"java.lang.String[]"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "java.util.List"}, new String[]{"<empty>", "<sample:1>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", new String[]{"com.google.common.base.Supplier", "com.google.common.base.Supplier", "com.google.common.base.Supplier", "com.google.common.base.Function"}, new String[]{"<sample:6>", "<null>", "<sample:4>", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "isInTestMode", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "outputSingleBinary", ""}}, 1), new String[][]{{"flush", "", "3"}, {"checkError", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "filenameToOutputStream", new String[]{"java.lang.String"}, new String[]{"5."}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "run", ""}}, 3), new String[][]{{"close", "", "3"}, {"flush", "", "4"}, {"getFD", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.io.FileDescriptor", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createExterns", new String[]{}, new String[]{}, false, 22, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", "com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Function", "<sample:5>", "<null>", "<sample:5>", "<sample:4>"}, {"com.google.javascript.jscomp.CommandLineRunner", "printModuleGraphJsonTo", "java.lang.Appendable", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "shouldRunCompiler", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "doRun", ""}}, 2), new String[][]{{"getTopScope", "", "0"}, {"compileModules", "java.util.List,java.util.List,com.google.javascript.jscomp.CompilerOptions", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", new String[]{"com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", "com.google.javascript.jscomp.CompilerOptions", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "java.util.List"}, new String[]{"<sample:3>", "<sample:3>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", ""}}, 2), new String[][]{{"getState", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Compiler$IntermediateState", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createDependencyOptions", new String[]{"boolean", "boolean", "boolean", "java.util.List"}, new String[]{"true", "true", "true", "<empty>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.AbstractCommandLineRunner$FlagUsageException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "expandSourceMapPath", new String[]{"com.google.javascript.jscomp.CompilerOptions", "com.google.javascript.jscomp.JSModule"}, new String[]{"<null>", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createExterns", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "getErrorPrintStream", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "outputSingleBinary", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "expandSourceMapPath", new String[]{"com.google.javascript.jscomp.CompilerOptions", "com.google.javascript.jscomp.JSModule"}, new String[]{"<null>", "<sample:1>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "shouldRunCompiler", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "writeOutput", new String[]{"java.lang.Appendable", "com.google.javascript.jscomp.Compiler", "java.lang.String", "java.lang.String", "java.lang.String", "com.google.common.base.Function"}, new String[]{"<null>", "<sample:4>", "2.5e2240d", "1.X4e", "1>-5d+10xFFFFFFFF", "<sample:8>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "writeOutput", new String[]{"java.lang.Appendable", "com.google.javascript.jscomp.Compiler", "java.lang.String", "java.lang.String", "java.lang.String", "com.google.common.base.Function"}, new String[]{"<sample:1>", "<sample:1>", "--1", "/externs.zip", "", "<sample:5>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createDefineOrTweakReplacements", new String[]{"java.util.List", "com.google.javascript.jscomp.CompilerOptions", "boolean"}, new String[]{"<sample:4>", "<sample:8>", "true"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createDefineOrTweakReplacements", new String[]{"java.util.List", "com.google.javascript.jscomp.CompilerOptions", "boolean"}, new String[]{"<sample:1>", "<sample:0>", "true"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createDefineOrTweakReplacements", new String[]{"java.util.List", "com.google.javascript.jscomp.CompilerOptions", "boolean"}, new String[]{"<null>", "<sample:0>", "true"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "checkModuleName", new String[]{"java.lang.String"}, new String[]{"L"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "doRun", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "setRunOptions", "com.google.javascript.jscomp.CompilerOptions", "<sample:5>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createDependencyOptions", new String[]{"boolean", "boolean", "boolean", "java.util.List"}, new String[]{"true", "true", "true", "<empty>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.AbstractCommandLineRunner$FlagUsageException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "writeOutput", new String[]{"java.lang.Appendable", "com.google.javascript.jscomp.Compiler", "java.lang.String", "java.lang.String", "java.lang.String", "com.google.common.base.Function"}, new String[]{"<sample:4>", "<sample:3>", "PRINT_INPUT_DELIMITER", "123456789012345678901234567890", "PT1HH", "<null>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "parseModuleWrappers", new String[]{"java.util.List", "java.util.List"}, new String[]{"<empty>", "<empty>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "run", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getCommandLineConfig", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "enableTestMode", "com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Supplier,com.google.common.base.Function", "<sample:4>", "<null>", "<sample:3>", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "filenameToOutputStream", new String[]{"java.lang.String"}, new String[]{"^['\"](.*)['\"]$"}, false, 0, null, 3), new String[][]{{"close", "", "4"}, {"write", "byte[],int,int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createCompiler", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "getDiagnosticGroups", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "writeModuleOutput", "java.lang.Appendable,com.google.javascript.jscomp.JSModule", "<sample:2>", "<sample:4>"}}, 2), new String[][]{{"parse", "com.google.javascript.jscomp.SourceFile", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "filenameToOutputStream", new String[]{"java.lang.String"}, new String[]{"PT1H"}, false, 5, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "createCompiler", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "expandSourceMapPath", "com.google.javascript.jscomp.CompilerOptions,com.google.javascript.jscomp.JSModule", "<sample:6>", "<sample:6>"}}, 1), new String[][]{{"getChannel", "", "4"}});
  assertNotNull(actual);
  assertEquals("sun.nio.ch.FileChannelImpl", actual.getClass().getName());
  assertEquals("{isOpen=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "filenameToOutputStream", new String[]{"java.lang.String"}, new String[]{"po1.1234567 890123456"}, false, 11, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "expandSourceMapPath", "com.google.javascript.jscomp.CompilerOptions,com.google.javascript.jscomp.JSModule", "<sample:10>", "<sample:8>"}}, 1), new String[][]{{"getChannel", "", "7"}, {"tryLock", "", "7"}});
  assertNotNull(actual);
  assertEquals("sun.nio.ch.FileLockImpl", actual.getClass().getName());
  assertEquals("sun.nio.ch.FileLockImpl[0:9223372036854775807 exclusive valid] {isShared=false, isValid=true, size=9223372036854775807}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldRunCompiler=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "createDefineOrTweakReplacements", new String[]{"java.util.List", "com.google.javascript.jscomp.CompilerOptions", "boolean"}, new String[]{"<null>", "<sample:9>", "false"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CommandLineRunner", "com.google.javascript.jscomp.CommandLineRunner", "filenameToOutputStream", new String[]{"java.lang.String"}, new String[]{"210-01-B01extrns.zip"}, false, 2, new String[][]{{"com.google.javascript.jscomp.CommandLineRunner", "filenameToOutputStream", "java.lang.String", "+1"}, {"com.google.javascript.jscomp.CommandLineRunner", "createOptions", ""}, {"com.google.javascript.jscomp.CommandLineRunner", "isInTestMode", ""}}, 2), new String[][]{{"write", "byte[],int,int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
}
