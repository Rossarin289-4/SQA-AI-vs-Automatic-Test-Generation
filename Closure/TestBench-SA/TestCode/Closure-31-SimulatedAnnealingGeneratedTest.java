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
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "initModules", new String[]{"java.util.List", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:5>", "<null>", "<sample:1>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.Compiler", "acceptEcmaScript5", ""}, {"com.google.javascript.jscomp.Compiler", "prepareAst", "com.google.javascript.rhino.Node", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "setErrorManager", new String[]{"com.google.javascript.jscomp.ErrorManager"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getCssRenamingMap", ""}, {"com.google.javascript.jscomp.Compiler", "newCompilerOptions", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=1, getErrors=[JSC_EMPTY_ROOT_MODULE_ERROR. Root module {0} must contain a.., getMessages=[JSC_EMPTY_ROOT_MODULE_ERROR. Root module {0} must contain a.., getProgress=0.0...#298#1722060754", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "resetUniqueNameId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "throwInternalError", "java.lang.String,java.lang.Exception", "12:30:45", "<sample:3>"}, {"com.google.javascript.jscomp.Compiler", "languageMode", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSource", new String[]{"com.google.javascript.jscomp.JSModule"}, new String[]{"<sample:7>"}, false, 15, new String[][]{{"com.google.javascript.jscomp.Compiler", "processAMDAndCommonJSModules", ""}, {"com.google.javascript.jscomp.Compiler", "getNodeForCodeInsertion", "com.google.javascript.jscomp.JSModule", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "setState", new String[]{"com.google.javascript.jscomp.Compiler$IntermediateState"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getResult", ""}, {"com.google.javascript.jscomp.Compiler", "getTopScope", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:2>", "<sample:3>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "isInliningForbidden", ""}, {"com.google.javascript.jscomp.Compiler", "areNodesEqualForInlining", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=4, getErrors=[JSC_DUPLICATE_EXTERN_INPUT. Duplicate extern input: a at (u.., getMessages=[JSC_DUPLICATE_EXTERN_INPUT. Duplicate extern input: a at (u.., getProgress=0.0...#298#126221601", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:0>", "<sample:3>", "<sample:1>"}, false, 14, new String[][]{{"com.google.javascript.jscomp.Compiler", "areNodesEqualForInlining", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:0>"}, {"com.google.javascript.jscomp.Compiler", "getSynthesizedExternsInput", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=2, getErrors=[JSC_PARSE_ERROR. Parse error. missing ; before statement at.., getMessages=[JSC_PARSE_ERROR....#361#-1931790167", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "setProgress", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 2, new String[][]{{"com.google.javascript.jscomp.Compiler", "getErrors", ""}, {"com.google.javascript.jscomp.Compiler", "parseSyntheticCode", "java.lang.String", "1.5d"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=3, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#323660214", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getParserConfig", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.SourceFile,com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.CompilerOptions", "<sample:0>", "<sample:1>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.parsing.Config", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:0>", "<empty>", "<sample:5>"}, false, 8, new String[][]{{"com.google.javascript.jscomp.Compiler", "report", "com.google.javascript.jscomp.JSError", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=0, getErrors=[], getMessages=[], getProgress=1.0, getWarningCount=0, getWarnings=[], hasErrors=false, isId...#241#813025255", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "runCallableWithLargeStack", new String[]{"java.util.concurrent.Callable"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"java.util.List", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<empty>", "<sample:1>", "<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "hasRegExpGlobalReferences", ""}, {"com.google.javascript.jscomp.Compiler", "createPassConfigInternal", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getFunctionalInformationMap", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:7>", "<sample:0>", "<sample:3>"}, false, 13, new String[][]{{"com.google.javascript.jscomp.Compiler", "toSource", ""}, {"com.google.javascript.jscomp.Compiler", "setErrorManager", "com.google.javascript.jscomp.ErrorManager", "<sample:0>"}, {"com.google.javascript.jscomp.Compiler", "getState", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=-2147483648, getErrors=[], getMessages=[], getProgress=1.0, getWarningCount=-2147483648, getWarnings=[], h...#261#811181243", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "runCallable", new String[]{"java.util.concurrent.Callable", "boolean", "boolean"}, new String[]{"<sample:0>", "false", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "endPass", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "setCssRenamingMap", new String[]{"com.google.javascript.jscomp.CssRenamingMap"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "setPassConfig", "com.google.javascript.jscomp.PassConfig", "<sample:3>"}, {"com.google.javascript.jscomp.Compiler", "stopTracer", "com.google.javascript.jscomp.Tracer,java.lang.String", "<null>", "1e10"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSModule[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:0>", "<sample:0>", "<sample:3>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "addNewScript", "com.google.javascript.jscomp.JsAst", "<sample:1>"}, {"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.SourceFile,com.google.javascript.jscomp.SourceFile,com.google.javascript.jscomp.CompilerOptions", "<sample:0>", "<sample:3>", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "setLifeCycleStage", new String[]{"com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage"}, new String[]{"<sample:7>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.Compiler", "getInputsById", ""}, {"com.google.javascript.jscomp.Compiler", "getDegenerateModuleGraph", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSModule[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<empty>", "<sample:7>", "<sample:0>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "getSynthesizedExternsInput", ""}, {"com.google.javascript.jscomp.Compiler", "toSource", "com.google.javascript.rhino.Node", "<sample:4>"}, {"com.google.javascript.jscomp.Compiler", "updateGlobalVarReferences", "java.util.Map,com.google.javascript.rhino.Node", "<sample:0>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : 0, . a at (un.., getMessages=[. a at (unknown ...#421#-596031162", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getGlobalVarReferences", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.Compiler", "parseTestCode", "java.lang.String", " on recently changed AST"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=1, getErrors=[JSC_PARSE_ERROR. Parse error. missing ; before statement at.., getMessages=[JSC_PARSE_ERROR. Parse error. missing ; before statement at.., getProgress=0.0...#298#-400557248", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "runCallable", new String[]{"java.util.concurrent.Callable", "boolean", "boolean"}, new String[]{"<null>", "false", "true"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getExternsForTesting", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Compiler", "getSourceMap", ""}, {"com.google.javascript.jscomp.Compiler", "getErrorLevel", "com.google.javascript.jscomp.JSError", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=!NullPointerException, getErrors=!NullPointerException, getMessages=!NullPointerException, getProgress=0.0, getWarningCount=!NullPointerException, getWarnings=!NullPoin...#324#756948161", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "newExternInput", new String[]{"java.lang.String"}, new String[]{"a"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "newTracer", "java.lang.String", "toSourceArray"}, {"com.google.javascript.jscomp.Compiler", "setErrorManager", "com.google.javascript.jscomp.ErrorManager", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "processDefines", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "init", "java.util.List,java.util.List,com.google.javascript.jscomp.CompilerOptions", "<sample:2>", "<null>", "<sample:5>"}, {"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "<sample:3>", "<sample:8>", "<sample:0>"}, {"com.google.javascript.jscomp.Compiler", "computeCFG", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : 0, . a at (un.., getMessages=[. a at (unknown ...#421#-596031162", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getSourceRegion", new String[]{"java.lang.String", "int"}, new String[]{"123456789012345678901234567890", "-1"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "toSource", "com.google.javascript.rhino.Node", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "processDefines", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "<sample:13>", "<sample:2>", "<sample:0>"}, {"com.google.javascript.jscomp.Compiler", "getDegenerateModuleGraph", ""}, {"com.google.javascript.jscomp.Compiler", "isInliningForbidden", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : 0, . a at (un.., getMessages=[. a at (unknown ...#421#-596031162", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "setLoggingLevel", new String[]{"java.util.logging.Level"}, new String[]{"<sample:0>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "processDefines", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "<sample:7>", "<sample:4>", "<sample:8>"}, {"com.google.javascript.jscomp.Compiler", "toSourceArray", ""}, {"com.google.javascript.jscomp.Compiler", "replaceScript", "com.google.javascript.jscomp.JsAst", "<sample:7>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : 0, . a at (un.., getMessages=[. a at (unknown ...#421#-596031162", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getSourceRegion", new String[]{"java.lang.String", "int"}, new String[]{"<null>", "1"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "processDefines", ""}, {"com.google.javascript.jscomp.Compiler", "getParserConfig", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "removeChangeHandler", new String[]{"com.google.javascript.jscomp.CodeChangeHandler"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "setErrorManager", new String[]{"com.google.javascript.jscomp.ErrorManager"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "setCssRenamingMap", "com.google.javascript.jscomp.CssRenamingMap", "<sample:3>"}, {"com.google.javascript.jscomp.Compiler", "addIncrementalSourceAst", "com.google.javascript.jscomp.JsAst", "<sample:10>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=1, getErrors=[. a at (unknown source) line (unknown line) : 0], getMessages=[. a at (unknown source) line (unknown line) : 0], getProgress=0.0, getWarningCount=1, getWa...#319#-1213798374", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getTypedScopeCreator", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.google.javascript.jscomp.Compiler", "setCssRenamingMap", "com.google.javascript.jscomp.CssRenamingMap", "<sample:2>"}, {"com.google.javascript.jscomp.Compiler", "getPropertyMap", ""}, {"com.google.javascript.jscomp.Compiler", "setPassConfig", "com.google.javascript.jscomp.PassConfig", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=!NullPointerException, getErrors=!NullPointerException, getMessages=!NullPointerException, getProgress=0.0, getWarningCount=!NullPointerException, getWarnings=!NullPoin...#324#756948161", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getUniqueNameIdSupplier", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "acceptEcmaScript5", ""}, {"com.google.javascript.jscomp.Compiler", "initModules", "java.util.List,java.util.List,com.google.javascript.jscomp.CompilerOptions", "<sample:1>", "<sample:2>", "<null>"}}), new String[][]{{"get", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#347#1366894907", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "init", new String[]{"java.util.List", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:4>", "<sample:5>", "<sample:14>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "parse", ""}, {"com.google.javascript.jscomp.Compiler", "stripCode", "java.util.Set,java.util.Set,java.util.Set,java.util.Set", "<sample:3>", "<sample:3>", "<sample:1>", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSource", new String[]{"com.google.javascript.jscomp.Compiler$CodeBuilder", "int", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "-1073741824", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getInputsInOrder", ""}, {"com.google.javascript.jscomp.Compiler", "initModules", "java.util.List,java.util.List,com.google.javascript.jscomp.CompilerOptions", "<sample:5>", "<empty>", "<sample:1>"}, {"com.google.javascript.jscomp.Compiler", "isInliningForbidden", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=3, getErrors=[JSC_EMPTY_MODULE_LIST_ERROR. At least one module must be pr.., getMessages=[JSC_EMPTY_MODULE_LIST_ERROR. At least one module must be pr.., getProgress=0.0...#298#-1874829988", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "parseSyntheticCode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"]", "123456789012345678901234567890"}, false, 5, new String[][]{{"com.google.javascript.jscomp.Compiler", "addIncrementalSourceAst", "com.google.javascript.jscomp.JsAst", "<sample:3>"}}), new String[][]{{"getType", "", "4"}, {"getDirectives", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSourceArray", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.Compiler", "initOptions", "com.google.javascript.jscomp.CompilerOptions", "<sample:1>"}, {"com.google.javascript.jscomp.Compiler", "getProgress", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "setHasRegExpGlobalReferences", new String[]{"boolean"}, new String[]{"false"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "disableThreads", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : 0, . a at (un.., getMessages=[. a at (unknown source) line (unknown line) : 0, . a at (un.., getProgress=0.0...#359#-313364259", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "init", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSModule[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:5>", "<sample:18>", "<sample:9>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "rebuildInputsFromModules", ""}, {"com.google.javascript.jscomp.Compiler", "getResult", ""}, {"com.google.javascript.jscomp.Compiler", "setProgress", "double", "Infinity"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=3, getErrors=[JSC_DUPLICATE_EXTERN_INPUT. Duplicate extern input: <a><b>t.., getMessages=[JSC_DUPLICATE_EXTERN_INPUT. Duplicate extern input: <a><b>t.., getProgress=1.0...#298#679198991", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "throwInternalError", new String[]{"java.lang.String", "java.lang.Exception"}, new String[]{" ", "<null>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "addNewSourceAst", "com.google.javascript.jscomp.JsAst", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:5>", "<sample:6>", "<sample:7>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "<sample:7>", "<sample:4>", "<sample:9>"}, {"com.google.javascript.jscomp.Compiler", "replaceScript", "com.google.javascript.jscomp.JsAst", "<sample:2>"}, {"com.google.javascript.jscomp.Compiler", "addNewSourceAst", "com.google.javascript.jscomp.JsAst", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:1>", "<sample:4>", "<sample:8>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "<sample:7>", "<sample:4>", "<sample:10>"}, {"com.google.javascript.jscomp.Compiler", "replaceScript", "com.google.javascript.jscomp.JsAst", "<sample:10>"}, {"com.google.javascript.jscomp.Compiler", "addNewSourceAst", "com.google.javascript.jscomp.JsAst", "<sample:9>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=5, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#706333684", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "setState", new String[]{"com.google.javascript.jscomp.Compiler$IntermediateState"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.SourceFile,com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.CompilerOptions", "<sample:4>", "<sample:9>", "<sample:3>"}, {"com.google.javascript.jscomp.Compiler", "getTypeValidator", ""}, {"com.google.javascript.jscomp.Compiler", "buildKnownSymbolTable", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : 0, . a at (un.., getMessages=[. a at (unknown source) line (unknown line) : 0, . a at (un.., getProgress=1.0...#359#-28228356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "setState", new String[]{"com.google.javascript.jscomp.Compiler$IntermediateState"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.SourceFile,com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.CompilerOptions", "<sample:14>", "<sample:5>", "<sample:3>"}, {"com.google.javascript.jscomp.Compiler", "toSourceArray", ""}, {"com.google.javascript.jscomp.Compiler", "toSourceArray", "com.google.javascript.jscomp.JSModule", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : 0, . a at (un.., getMessages=[. a at (unknown source) line (unknown line) : 0, . a at (un.., getProgress=1.0...#359#-28228356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "stripCode", new String[]{"java.util.Set", "java.util.Set", "java.util.Set", "java.util.Set"}, new String[]{"<empty>", "<null>", "<sample:2>", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getReverseAbstractInterpreter", ""}, {"com.google.javascript.jscomp.Compiler", "getPropertyMap", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "init", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:8>", "<sample:4>", "<sample:1>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.CompilerOptions", "<sample:3>", "<sample:0>", "<sample:16>"}, {"com.google.javascript.jscomp.Compiler", "getCodingConvention", ""}, {"com.google.javascript.jscomp.Compiler", "recordFunctionInformation", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : 0, . a at (un.., getMessages=[. a at (unknown ...#421#-596031162", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "process", new String[]{"com.google.javascript.jscomp.CompilerPass"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "removeTryCatchFinally", ""}, {"com.google.javascript.jscomp.Compiler", "getErrorManager", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : 0, . a at (un.., getMessages=[. a at (unknown source) line (unknown line) : 0, . a at (un.., getProgress=0.0...#359#-313364259", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "ensureLibraryInjected", new String[]{"java.lang.String"}, new String[]{"5/.//01.5d"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "recordFunctionInformation", ""}, {"com.google.javascript.jscomp.Compiler", "addNewScript", "com.google.javascript.jscomp.JsAst", "<sample:1>"}, {"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.CompilerOptions", "<sample:7>", "<sample:8>", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getInputsForTesting", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "newExternInput", "java.lang.String", "sanityCheck"}, {"com.google.javascript.jscomp.Compiler", "parseTestCode", "java.lang.String", "Bad module: "}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=3, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#323660214", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "recordFunctionInformation", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.Compiler", "hasHaltingErrors", ""}, {"com.google.javascript.jscomp.Compiler", "stopTracer", "com.google.javascript.jscomp.Tracer,java.lang.String", "<sample:4>", "Strip code"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSource", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getInputsById", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "recordFunctionInformation", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableMap", actual.getClass().getName());
  assertEquals("{InputId: a=a}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "recordFunctionInformation", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.google.javascript.jscomp.Compiler", "hasHaltingErrors", ""}, {"com.google.javascript.jscomp.Compiler", "stopTracer", "com.google.javascript.jscomp.Tracer,java.lang.String", "<sample:4>", "Strip code"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "recordFunctionInformation", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.Compiler", "acceptConstKeyword", ""}, {"com.google.javascript.jscomp.Compiler", "hasHaltingErrors", ""}, {"com.google.javascript.jscomp.Compiler", "stopTracer", "com.google.javascript.jscomp.Tracer,java.lang.String", "<sample:4>", "Strip code"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "recordFunctionInformation", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.Compiler", "acceptConstKeyword", ""}, {"com.google.javascript.jscomp.Compiler", "hasHaltingErrors", ""}, {"com.google.javascript.jscomp.Compiler", "setHasRegExpGlobalReferences", "boolean", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "initModules", new String[]{"java.util.List", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:5>", "<null>", "<sample:1>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.Compiler", "acceptEcmaScript5", ""}, {"com.google.javascript.jscomp.Compiler", "prepareAst", "com.google.javascript.rhino.Node", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "prepareAst", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "<sample:0>", "<empty>", "<sample:0>"}, {"com.google.javascript.jscomp.Compiler", "rebuildInputsFromModules", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=3, getErrors=[JSC_EMPTY_MODULE_LIST_ERROR. At least one module must be pr.., getMessages=[JSC_EMPTY_MODULE_LIST_ERROR. At least one module must be pr.., getProgress=0.0...#298#-1874829988", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "prepareAst", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "<sample:0>", "<null>", "<sample:0>"}, {"com.google.javascript.jscomp.Compiler", "getErrorCount", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSource", new String[]{"com.google.javascript.jscomp.JSModule"}, new String[]{"<sample:2>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSource", new String[]{"com.google.javascript.jscomp.JSModule"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getDiagnosticGroups", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSource", new String[]{"com.google.javascript.jscomp.JSModule"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "acceptEcmaScript5", ""}, {"com.google.javascript.jscomp.Compiler", "getDiagnosticGroups", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSource", new String[]{"com.google.javascript.jscomp.JSModule"}, new String[]{"<sample:3>"}, false, 13, new String[][]{{"com.google.javascript.jscomp.Compiler", "acceptEcmaScript5", ""}, {"com.google.javascript.jscomp.Compiler", "getDiagnosticGroups", ""}, {"com.google.javascript.jscomp.Compiler", "processAMDAndCommonJSModules", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSource", new String[]{"com.google.javascript.jscomp.JSModule"}, new String[]{"<sample:6>"}, false, 15, new String[][]{{"com.google.javascript.jscomp.Compiler", "processAMDAndCommonJSModules", ""}, {"com.google.javascript.jscomp.Compiler", "getNodeForCodeInsertion", "com.google.javascript.jscomp.JSModule", "<sample:4>"}, {"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.CompilerOptions", "<sample:0>", "<null>", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:2>", "<sample:2>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "isInliningForbidden", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=4, getErrors=[JSC_DUPLICATE_EXTERN_INPUT. Duplicate extern input: a at (u.., getMessages=[JSC_DUPLICATE_EXTERN_INPUT. Duplicate extern input: a at (u.., getProgress=0.0...#298#126221601", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:3>", "<sample:3>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "isInliningForbidden", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=3, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: <a><b>t</b></a> at (u.., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: <a><b>t</b></a> at (u.., getProgress=0.0...#298#-1590671210", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:2>", "<sample:3>", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "isInliningForbidden", ""}, {"com.google.javascript.jscomp.Compiler", "updateGlobalVarReferences", "java.util.Map,com.google.javascript.rhino.Node", "<empty>", "<sample:3>"}, {"com.google.javascript.jscomp.Compiler", "areNodesEqualForInlining", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=4, getErrors=[JSC_DUPLICATE_EXTERN_INPUT. Duplicate extern input: a at (u.., getMessages=[JSC_DUPLICATE_EXTERN_INPUT. Duplicate extern input: a at (u.., getProgress=0.0...#298#126221601", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:2>", "<sample:3>", "<sample:0>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.Compiler", "isInliningForbidden", ""}, {"com.google.javascript.jscomp.Compiler", "updateGlobalVarReferences", "java.util.Map,com.google.javascript.rhino.Node", "<empty>", "<sample:3>"}, {"com.google.javascript.jscomp.Compiler", "areNodesEqualForInlining", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_EXTERN_INPUT. Duplicate extern input: a at (u.., getMessages=[JSC_DUPLICATE_EXTERN_INPUT. Duplicate extern input: a at (u.., getProgress=0.0...#298#-256451869", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:0>", "<sample:4>", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "isInliningForbidden", ""}, {"com.google.javascript.jscomp.Compiler", "updateGlobalVarReferences", "java.util.Map,com.google.javascript.rhino.Node", "<empty>", "<sample:3>"}, {"com.google.javascript.jscomp.Compiler", "areNodesEqualForInlining", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:0>", "<sample:3>", "<sample:1>"}, false, 14, new String[][]{{"com.google.javascript.jscomp.Compiler", "areNodesEqualForInlining", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:0>"}, {"com.google.javascript.jscomp.Compiler", "getSynthesizedExternsInput", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=2, getErrors=[JSC_PARSE_ERROR. Parse error. missing ; before statement at.., getMessages=[JSC_PARSE_ERROR....#361#-1931790167", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getModuleGraph", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Compiler", "getNodeForCodeInsertion", "com.google.javascript.jscomp.JSModule", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=!NullPointerException, getErrors=!NullPointerException, getMessages=!NullPointerException, getProgress=0.0, getWarningCount=!NullPointerException, getWarnings=!NullPoin...#324#756948161", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:0>", "<sample:3>", "<sample:5>"}, false, 14, new String[][]{{"com.google.javascript.jscomp.Compiler", "getCssRenamingMap", ""}, {"com.google.javascript.jscomp.Compiler", "getSynthesizedExternsInput", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=2, getErrors=[JSC_PARSE_ERROR. Parse error. missing ; before statement at.., getMessages=[JSC_PARSE_ERROR....#361#-1931790167", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "process", new String[]{"com.google.javascript.jscomp.CompilerPass"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.Compiler", "toSource", "com.google.javascript.rhino.Node", "<null>"}, {"com.google.javascript.jscomp.Compiler", "setHasRegExpGlobalReferences", "boolean", "true"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:0>", "<empty>", "<sample:6>"}, false, 8, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=0, getErrors=[], getMessages=[], getProgress=1.0, getWarningCount=0, getWarnings=[], hasErrors=false, isId...#241#813025255", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:0>", "<empty>", "<sample:5>"}, false, 8, new String[][]{{"com.google.javascript.jscomp.Compiler", "languageMode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=0, getErrors=[], getMessages=[], getProgress=1.0, getWarningCount=0, getWarnings=[], hasErrors=false, isId...#241#813025255", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<null>", "<sample:0>", "<sample:0>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.Compiler", "setErrorManager", "com.google.javascript.jscomp.ErrorManager", "<sample:1>"}, {"com.google.javascript.jscomp.Compiler", "languageMode", ""}, {"com.google.javascript.jscomp.Compiler", "getInput", "com.google.javascript.rhino.InputId", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:1>", "<sample:3>", "<sample:4>"}, false, 13, new String[][]{{"com.google.javascript.jscomp.Compiler", "setErrorManager", "com.google.javascript.jscomp.ErrorManager", "<sample:1>"}, {"com.google.javascript.jscomp.Compiler", "getInput", "com.google.javascript.rhino.InputId", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:1>", "<sample:7>", "<sample:2>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.Compiler", "setErrorManager", "com.google.javascript.jscomp.ErrorManager", "<sample:0>"}, {"com.google.javascript.jscomp.Compiler", "getState", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=-2147483648, getErrors=[], getMessages=[], getProgress=1.0, getWarningCount=-2147483648, getWarnings=[], h...#261#811181243", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<empty>", "<sample:7>", "<null>"}, false, 11, new String[][]{{"com.google.javascript.jscomp.Compiler", "setErrorManager", "com.google.javascript.jscomp.ErrorManager", "<sample:2>"}, {"com.google.javascript.jscomp.Compiler", "initOptions", "com.google.javascript.jscomp.CompilerOptions", "<sample:1>"}, {"com.google.javascript.jscomp.Compiler", "getState", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:3>", "<sample:7>", "<sample:5>"}, false, 11, new String[][]{{"com.google.javascript.jscomp.Compiler", "setErrorManager", "com.google.javascript.jscomp.ErrorManager", "<sample:2>"}, {"com.google.javascript.jscomp.Compiler", "initOptions", "com.google.javascript.jscomp.CompilerOptions", "<sample:6>"}, {"com.google.javascript.jscomp.Compiler", "getState", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getCssRenamingMap", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<null>", "<sample:7>", "<sample:1>"}, false, 13, new String[][]{{"com.google.javascript.jscomp.Compiler", "toSource", ""}, {"com.google.javascript.jscomp.Compiler", "setErrorManager", "com.google.javascript.jscomp.ErrorManager", "<sample:0>"}, {"com.google.javascript.jscomp.Compiler", "getState", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<empty>", "<sample:7>", "<sample:5>"}, false, 13, new String[][]{{"com.google.javascript.jscomp.Compiler", "toSource", ""}, {"com.google.javascript.jscomp.Compiler", "getState", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getSourceMap", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "parseSyntheticCode", "java.lang.String", "sanityCheck"}, {"com.google.javascript.jscomp.Compiler", "check", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "optimize", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.Compiler", "getInput", "com.google.javascript.rhino.InputId", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSModule[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:1>", "<empty>", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "precheck", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=4, getErrors=[JSC_EMPTY_MODULE_LIST_ERROR. At least one module must be pr.., getMessages=[JSC_EMPTY_MODULE_LIST_ERROR. At least one module must be pr.., getProgress=0.0...#298#463990395", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:13>", "<sample:7>", "<sample:3>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "toSource", ""}, {"com.google.javascript.jscomp.Compiler", "getState", ""}, {"com.google.javascript.jscomp.Compiler", "startPass", "java.lang.String", "Title"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:4>", "<sample:2>", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getTypedScopeCreator", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=3, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: <a><b>t</b></a> at (u.., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: <a><b>t</b></a> at (u.., getProgress=0.0...#298#-1590671210", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getInput", new String[]{"com.google.javascript.rhino.InputId"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "addToDebugLog", "java.lang.String", "1.25"}, {"com.google.javascript.jscomp.Compiler", "addIncrementalSourceAst", "com.google.javascript.jscomp.JsAst", "<sample:1>"}, {"com.google.javascript.jscomp.Compiler", "getAstDotGraph", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.CompilerInput", actual.getClass().getName());
  assertEquals("a {getCode=ERROR - Duplicate extern input: a\n\nERROR - Duplicate input: .., getName=a, getNumLines=7, getPathRelativeToClosureBase=!UnsupportedOperationException, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : 0, . a at (un.., getMessages=[. a at (unknown source) line (unknown line) : 0, . a at (un.., getProgress=0.0...#359#-313364259", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getInput", new String[]{"com.google.javascript.rhino.InputId"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "addToDebugLog", "java.lang.String", "1.25"}, {"com.google.javascript.jscomp.Compiler", "addIncrementalSourceAst", "com.google.javascript.jscomp.JsAst", "<sample:1>"}, {"com.google.javascript.jscomp.Compiler", "getAstDotGraph", ""}}, 3), new String[][]{{"removeRequire", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.CompilerInput", actual.getClass().getName());
  assertEquals("a {getCode=ERROR - Duplicate extern input: a\n\nERROR - Duplicate input: .., getName=a, getNumLines=7, getPathRelativeToClosureBase=!UnsupportedOperationException, isExtern=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getInput", new String[]{"com.google.javascript.rhino.InputId"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "addToDebugLog", "java.lang.String", "1.25"}, {"com.google.javascript.jscomp.Compiler", "addIncrementalSourceAst", "com.google.javascript.jscomp.JsAst", "<sample:1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "newExternInput", new String[]{"java.lang.String"}, new String[]{"B`d locule inp\rut9 \037PT1H"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "stripCode", "java.util.Set,java.util.Set,java.util.Set,java.util.Set", "<null>", "<null>", "<sample:5>", "<sample:0>"}, {"com.google.javascript.jscomp.Compiler", "getErrorCount", ""}, {"com.google.javascript.jscomp.Compiler", "getErrorLevel", "com.google.javascript.jscomp.JSError", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "newExternInput", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "stripCode", "java.util.Set,java.util.Set,java.util.Set,java.util.Set", "<null>", "<null>", "<sample:5>", "<sample:0>"}, {"com.google.javascript.jscomp.Compiler", "getPassConfig", ""}, {"com.google.javascript.jscomp.Compiler", "getErrorCount", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSModule[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:2>", "<empty>", "<sample:6>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "isIdeMode", ""}, {"com.google.javascript.jscomp.Compiler", "newExternInput", "java.lang.String", "1048s87"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSModule[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:2>", "<null>", "<sample:5>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "newExternInput", "java.lang.String", "0048s77"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSModule[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:1>", "<sample:2>", "<sample:5>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.Compiler", "newExternInput", "java.lang.String", "0048s77"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=3, getErrors=[JSC_DUPLICATE_EXTERN_INPUT. Duplicate extern input: a at (u.., getMessages=[JSC_DUPLICATE_EXTERN_INPUT. Duplicate extern input: a at (u.., getProgress=0.0...#298#2082368514", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "reportCodeChange", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSModule[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:0>", "<sample:0>", "<sample:3>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "getVariableMap", ""}, {"com.google.javascript.jscomp.Compiler", "prepareAst", "com.google.javascript.rhino.Node", "<sample:5>"}, {"com.google.javascript.jscomp.Compiler", "addNewScript", "com.google.javascript.jscomp.JsAst", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSModule[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:15>", "<sample:0>", "<sample:10>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "getVariableMap", ""}, {"com.google.javascript.jscomp.Compiler", "addNewScript", "com.google.javascript.jscomp.JsAst", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "init", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:4>", "<sample:1>", "<sample:5>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSModule[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:4>", "<sample:1>", "<sample:6>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.Compiler", "getTopScope", ""}, {"com.google.javascript.jscomp.Compiler", "getVariableMap", ""}, {"com.google.javascript.jscomp.Compiler", "parseSyntheticCode", "java.lang.String,java.lang.String", "0.15", "sanityCheckjscompiler"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSModule[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:3>", "<sample:1>", "<sample:9>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "getTopScope", ""}, {"com.google.javascript.jscomp.Compiler", "getVariableMap", ""}, {"com.google.javascript.jscomp.Compiler", "replaceScript", "com.google.javascript.jscomp.JsAst", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSModule[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:2>", "<sample:0>", "<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getVariableMap", ""}, {"com.google.javascript.jscomp.Compiler", "replaceScript", "com.google.javascript.jscomp.JsAst", "<sample:4>"}, {"com.google.javascript.jscomp.Compiler", "initOptions", "com.google.javascript.jscomp.CompilerOptions", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=3, getErrors=[JSC_DUPLICATE_EXTERN_INPUT. Duplicate extern input: a at (u.., getMessages=[JSC_DUPLICATE_EXTERN_INPUT. Duplicate extern input: a at (u.., getProgress=0.0...#298#2082368514", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getLifeCycleStage", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getVariableMap", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage", actual.getClass().getName());
  assertEquals("RAW", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSModule[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:1>", "<null>", "<sample:7>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "getVariableMap", ""}, {"com.google.javascript.jscomp.Compiler", "replaceScript", "com.google.javascript.jscomp.JsAst", "<sample:4>"}, {"com.google.javascript.jscomp.Compiler", "initOptions", "com.google.javascript.jscomp.CompilerOptions", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile", "com.google.javascript.jscomp.JSModule[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:4>", "<sample:1>", "<sample:5>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.Compiler", "getPassConfig", ""}, {"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.CompilerOptions", "<sample:13>", "<empty>", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_EXTERN_INPUT. Duplicate extern input: a at (u.., getMessages=[JSC_DUPLICATE_EXTERN_INPUT. Duplicate extern input: a at (u.., getProgress=0.0...#298#-256451869", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getPassConfig", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getMessages", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.DefaultPassConfig", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSModule[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:12>", "<sample:8>", "<sample:2>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.Compiler", "getSourceRegion", "java.lang.String,int", "Bad module input: ", "1"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSModule[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:12>", "<null>", "<sample:6>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "getSourceRegion", "java.lang.String,int", "Bad module input; ", "1"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSModule[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:5>", "<sample:2>", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getCodingConvention", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=3, getErrors=[JSC_DUPLICATE_EXTERN_INPUT. Duplicate extern input: <a><b>t.., getMessages=[JSC_DUPLICATE_EXTERN_INPUT. Duplicate extern input: <a><b>t.., getProgress=0.0...#298#-814713458", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:3>", "<sample:1>", "<sample:5>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSModule[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:5>", "<sample:0>", "<sample:7>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "removeExternInput", "com.google.javascript.rhino.InputId", "<sample:4>"}, {"com.google.javascript.jscomp.Compiler", "acceptConstKeyword", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSModule[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:5>", "<sample:0>", "<sample:7>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "removeExternInput", "com.google.javascript.rhino.InputId", "<sample:3>"}, {"com.google.javascript.jscomp.Compiler", "acceptConstKeyword", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSModule[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:7>", "<sample:1>", "<sample:9>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getInputsById", ""}, {"com.google.javascript.jscomp.Compiler", "removeExternInput", "com.google.javascript.rhino.InputId", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSModule[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:5>", "<sample:0>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getSynthesizedExternsInput", ""}, {"com.google.javascript.jscomp.Compiler", "toSource", "com.google.javascript.rhino.Node", "<sample:4>"}, {"com.google.javascript.jscomp.Compiler", "updateGlobalVarReferences", "java.util.Map,com.google.javascript.rhino.Node", "<sample:0>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=3, getErrors=[JSC_DUPLICATE_EXTERN_INPUT. Duplicate extern input: <a><b>t.., getMessages=[JSC_DUPLICATE_EXTERN_INPUT. Duplicate extern input: <a><b>t.., getProgress=0.0...#298#-814713458", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSModule[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:5>", "<sample:4>", "<sample:2>"}, false, 14, new String[][]{{"com.google.javascript.jscomp.Compiler", "getSynthesizedExternsInput", ""}, {"com.google.javascript.jscomp.Compiler", "toSource", "com.google.javascript.rhino.Node", "<sample:4>"}, {"com.google.javascript.jscomp.Compiler", "updateGlobalVarReferences", "java.util.Map,com.google.javascript.rhino.Node", "<sample:0>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_EXTERN_INPUT. Duplicate extern input: <a><b>t.., getMessages=[JSC_DUPLICATE_EXTERN_INPUT. Duplicate extern input: <a><b>t.., getProgress=0.0...#298#1141433455", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "isInliningForbidden", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "initModules", new String[]{"java.util.List", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:0>", "<sample:0>", "<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getPropertyMap", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "init", new String[]{"java.util.List", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:3>", "<null>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "initModules", new String[]{"java.util.List", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<empty>", "<sample:3>", "<sample:7>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.Compiler", "getTypeRegistry", ""}, {"com.google.javascript.jscomp.Compiler", "getPropertyMap", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "initModules", new String[]{"java.util.List", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:3>", "<null>", "<sample:4>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.Compiler", "getTypeRegistry", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "initModules", new String[]{"java.util.List", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:5>", "<null>", "<sample:1>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.Compiler", "prepareAst", "com.google.javascript.rhino.Node", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "initModules", new String[]{"java.util.List", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:5>", "<sample:5>", "<sample:0>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.Compiler", "isTypeCheckingEnabled", ""}, {"com.google.javascript.jscomp.Compiler", "prepareAst", "com.google.javascript.rhino.Node", "<sample:0>"}, {"com.google.javascript.jscomp.Compiler", "toSourceArray", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "initModules", new String[]{"java.util.List", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<null>", "<sample:5>", "<sample:0>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.Compiler", "prepareAst", "com.google.javascript.rhino.Node", "<sample:0>"}, {"com.google.javascript.jscomp.Compiler", "toSourceArray", ""}, {"com.google.javascript.jscomp.Compiler", "getTypedScopeCreator", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "initModules", new String[]{"java.util.List", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<null>", "<empty>", "<sample:0>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.Compiler", "toSourceArray", ""}, {"com.google.javascript.jscomp.Compiler", "getTypedScopeCreator", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "prepareAst", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "prepareAst", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "<sample:2>", "<empty>", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=3, getErrors=[JSC_EMPTY_MODULE_LIST_ERROR. At least one module must be pr.., getMessages=[JSC_EMPTY_MODULE_LIST_ERROR. At least one module must be pr.., getProgress=0.0...#298#-1874829988", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "optimize", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "prepareAst", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 10, new String[][]{{"com.google.javascript.jscomp.Compiler", "init", "java.util.List,java.util.List,com.google.javascript.jscomp.CompilerOptions", "<sample:2>", "<sample:0>", "<sample:7>"}, {"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "<sample:2>", "<empty>", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=1, getErrors=[JSC_EMPTY_MODULE_LIST_ERROR. At least one module must be pr.., getMessages=[JSC_EMPTY_MODULE_LIST_ERROR. At least one module must be pr.., getProgress=0.0...#298#2037463838", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "prepareAst", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "<sample:2>", "<empty>", "<sample:0>"}, {"com.google.javascript.jscomp.Compiler", "report", "com.google.javascript.jscomp.JSError", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=4, getErrors=[JSC_EMPTY_MODULE_LIST_ERROR. At least one module must be pr.., getMessages=[JSC_EMPTY_MODULE_LIST_ERROR. At least one module must be pr.., getProgress=0.0...#298#463990395", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "removeTryCatchFinally", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "prepareAst", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "<sample:6>", "<empty>", "<sample:0>"}, {"com.google.javascript.jscomp.Compiler", "report", "com.google.javascript.jscomp.JSError", "<sample:6>"}, {"com.google.javascript.jscomp.Compiler", "rebuildInputsFromModules", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=4, getErrors=[JSC_EMPTY_MODULE_LIST_ERROR. At least one module must be pr.., getMessages=[JSC_EMPTY_MODULE_LIST_ERROR. At least one module must be pr.., getProgress=0.0...#298#463990395", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "prepareAst", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "<sample:6>", "<null>", "<sample:0>"}, {"com.google.javascript.jscomp.Compiler", "report", "com.google.javascript.jscomp.JSError", "<sample:6>"}, {"com.google.javascript.jscomp.Compiler", "rebuildInputsFromModules", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=3, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#323660214", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "init", new String[]{"java.util.List", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:5>", "<sample:5>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "prepareAst", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "<sample:6>", "<empty>", "<sample:0>"}, {"com.google.javascript.jscomp.Compiler", "report", "com.google.javascript.jscomp.JSError", "<sample:6>"}, {"com.google.javascript.jscomp.Compiler", "rebuildInputsFromModules", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_EMPTY_MODULE_LIST_ERROR. At least one module must be pr.., getMessages=[JSC_EMPTY_MODULE_LIST_ERROR. At least one module must be pr.., getProgress=0.0...#298#81316925", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "resetUniqueNameId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "computeCFG", ""}, {"com.google.javascript.jscomp.Compiler", "addToDebugLog", "java.lang.String", "0xFFFFFFFF"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "resetUniqueNameId", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "computeCFG", ""}, {"com.google.javascript.jscomp.Compiler", "addToDebugLog", "java.lang.String", "0xFFFFFFFF"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : 0, . a at (un.., getMessages=[. a at (unknown source) line (unknown line) : 0, . a at (un.., getProgress=0.0...#359#-313364259", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getDiagnosticGroups", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "startPass", "java.lang.String", "runCustomPasses"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.DiagnosticGroups", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getDiagnosticGroups", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "startPass", "java.lang.String", "runCustomPasses"}}), new String[][]{{"forName", "java.lang.String", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "loadLibraryCode", new String[]{"java.lang.String"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getDiagnosticGroups", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "startPass", "java.lang.String", "Bad module: "}}), new String[][]{{"forName", "java.lang.String", "5"}, {"forName", "java.lang.String", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : 0, . a at (un.., getMessages=[. a at (unknown source) line (unknown line) : 0, . a at (un.., getProgress=0.0...#359#-313364259", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getDiagnosticGroups", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.Compiler", "startPass", "java.lang.String", "Bad module: "}}), new String[][]{{"forName", "java.lang.String", "5"}, {"forName", "java.lang.String", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getDiagnosticGroups", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Compiler", "startPass", "java.lang.String", "7Bad module: 8"}}), new String[][]{{"forName", "java.lang.String", "5"}, {"forName", "java.lang.String", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=!NullPointerException, getErrors=!NullPointerException, getMessages=!NullPointerException, getProgress=0.0, getWarningCount=!NullPointerException, getWarnings=!NullPoin...#324#756948161", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "isTypeCheckingEnabled", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSource", new String[]{"com.google.javascript.jscomp.JSModule"}, new String[]{"<sample:3>"}, false, 13, new String[][]{{"com.google.javascript.jscomp.Compiler", "getDiagnosticGroups", ""}, {"com.google.javascript.jscomp.Compiler", "processAMDAndCommonJSModules", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getErrorManager", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.Compiler", "getParserConfig", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.PrintStreamErrorManager", actual.getClass().getName());
  assertEquals("{getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getTypedPercent=0.0, getWarningCount=0, getWarnings=[]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSource", new String[]{"com.google.javascript.jscomp.JSModule"}, new String[]{"<null>"}, false, 15, new String[][]{{"com.google.javascript.jscomp.Compiler", "processAMDAndCommonJSModules", ""}, {"com.google.javascript.jscomp.Compiler", "getNodeForCodeInsertion", "com.google.javascript.jscomp.JSModule", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "languageMode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.CompilerOptions$LanguageMode", actual.getClass().getName());
  assertEquals("ECMASCRIPT3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSource", new String[]{"com.google.javascript.jscomp.JSModule"}, new String[]{"<sample:5>"}, false, 14, new String[][]{{"com.google.javascript.jscomp.Compiler", "processAMDAndCommonJSModules", ""}, {"com.google.javascript.jscomp.Compiler", "optimize", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "setState", new String[]{"com.google.javascript.jscomp.Compiler$IntermediateState"}, new String[]{"<sample:4>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "setState", new String[]{"com.google.javascript.jscomp.Compiler$IntermediateState"}, new String[]{"<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "setState", new String[]{"com.google.javascript.jscomp.Compiler$IntermediateState"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "getResult", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : 0, . a at (un.., getMessages=[. a at (unknown source) line (unknown line) : 0, . a at (un.., getProgress=0.0...#359#-313364259", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "setState", new String[]{"com.google.javascript.jscomp.Compiler$IntermediateState"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.SourceFile,com.google.javascript.jscomp.SourceFile,com.google.javascript.jscomp.CompilerOptions", "<sample:1>", "<sample:3>", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : 0, . a at (un.., getMessages=[. a at (unknown source) line (unknown line) : 0, . a at (un.., getProgress=0.0...#407#-798816314", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "setState", new String[]{"com.google.javascript.jscomp.Compiler$IntermediateState"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "disableThreads", ""}, {"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.SourceFile,com.google.javascript.jscomp.SourceFile,com.google.javascript.jscomp.CompilerOptions", "<sample:1>", "<sample:3>", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : 0, . a at (un.., getMessages=[. a at (unknown source) line (unknown line) : 0, . a at (un.., getProgress=0.0...#407#-798816314", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getTypeRegistry", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.Compiler", "removeTryCatchFinally", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "setState", new String[]{"com.google.javascript.jscomp.Compiler$IntermediateState"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.Compiler", "disableThreads", ""}, {"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.SourceFile,com.google.javascript.jscomp.SourceFile,com.google.javascript.jscomp.CompilerOptions", "<sample:1>", "<sample:6>", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#347#1366894907", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:0>", "<sample:2>", "<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:2>", "<sample:2>", "<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=4, getErrors=[JSC_DUPLICATE_EXTERN_INPUT. Duplicate extern input: a at (u.., getMessages=[JSC_DUPLICATE_EXTERN_INPUT. Duplicate extern input: a at (u.., getProgress=0.0...#298#126221601", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:2>", "<sample:2>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "isInliningForbidden", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=4, getErrors=[JSC_DUPLICATE_EXTERN_INPUT. Duplicate extern input: a at (u.., getMessages=[JSC_DUPLICATE_EXTERN_INPUT. Duplicate extern input: a at (u.., getProgress=0.0...#298#126221601", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<empty>", "<sample:4>", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "areNodesEqualForInlining", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:0>"}, {"com.google.javascript.jscomp.Compiler", "getSynthesizedExternsInput", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:0>", "<empty>", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "areNodesEqualForInlining", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:0>"}, {"com.google.javascript.jscomp.Compiler", "getSynthesizedExternsInput", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:4>", "<sample:3>", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "areNodesEqualForInlining", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:0>"}, {"com.google.javascript.jscomp.Compiler", "getSynthesizedExternsInput", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=3, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: <a><b>t</b></a> at (u.., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: <a><b>t</b></a> at (u.., getProgress=0.0...#298#-1590671210", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "startPass", new String[]{"java.lang.String"}, new String[]{"1E-5"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:0>", "<sample:6>", "<sample:1>"}, false, 14, new String[][]{{"com.google.javascript.jscomp.Compiler", "areNodesEqualForInlining", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:0>"}, {"com.google.javascript.jscomp.Compiler", "getSynthesizedExternsInput", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=1, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-59013256", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<null>", "<sample:3>", "<sample:1>"}, false, 14, new String[][]{{"com.google.javascript.jscomp.Compiler", "getSynthesizedExternsInput", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:1>", "<sample:3>", "<sample:0>"}, false, 14, new String[][]{{"com.google.javascript.jscomp.Compiler", "getCssRenamingMap", ""}, {"com.google.javascript.jscomp.Compiler", "getSynthesizedExternsInput", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=1, getErrors=[JSC_DUPLICATE_EXTERN_INPUT. Duplicate extern input: a at (u.., getMessages=[JSC_DUPLICATE_EXTERN_INPUT. Duplicate extern input: a at (u.., getProgress=0.0...#298#1699695044", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:4>", "<sample:4>", "<sample:1>"}, false, 14, new String[][]{{"com.google.javascript.jscomp.Compiler", "getCssRenamingMap", ""}, {"com.google.javascript.jscomp.Compiler", "getSynthesizedExternsInput", ""}, {"com.google.javascript.jscomp.Compiler", "processAMDAndCommonJSModules", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: <a><b>t</b></a> at (u.., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: <a><b>t</b></a> at (u.., getProgress=0.0...#298#365475703", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "init", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSModule[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:0>", "<sample:1>", "<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "init", "com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.CompilerOptions", "<null>", "<sample:3>", "<sample:7>"}, {"com.google.javascript.jscomp.Compiler", "getInputsForTesting", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:0>", "<sample:3>", "<sample:5>"}, false, 14, new String[][]{{"com.google.javascript.jscomp.Compiler", "getCssRenamingMap", ""}, {"com.google.javascript.jscomp.Compiler", "getSynthesizedExternsInput", ""}, {"com.google.javascript.jscomp.Compiler", "processDefines", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=2, getErrors=[JSC_PARSE_ERROR. Parse error. missing ; before statement at.., getMessages=[JSC_PARSE_ERROR....#361#-1931790167", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "throwInternalError", new String[]{"java.lang.String", "java.lang.Exception"}, new String[]{"toSourceArray", "<empty>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "buildKnownSymbolTable", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getUniqueNameIdSupplier", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getDefaultErrorReporter", ""}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "parse", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_IN...#360#-94050291", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:0>", "<sample:3>", "<sample:5>"}, false, 13, new String[][]{{"com.google.javascript.jscomp.Compiler", "updateGlobalVarReferences", "java.util.Map,com.google.javascript.rhino.Node", "<empty>", "<sample:6>"}, {"com.google.javascript.jscomp.Compiler", "replaceScript", "com.google.javascript.jscomp.JsAst", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:0>", "<empty>", "<sample:5>"}, false, 14, new String[][]{{"com.google.javascript.jscomp.Compiler", "updateGlobalVarReferences", "java.util.Map,com.google.javascript.rhino.Node", "<sample:1>", "<sample:6>"}, {"com.google.javascript.jscomp.Compiler", "replaceScript", "com.google.javascript.jscomp.JsAst", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=0, getErrors=[], getMessages=[], getProgress=1.0, getWarningCount=0, getWarnings=[], hasErrors=false, isId...#241#813025255", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "check", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getWarnings", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:0>", "<empty>", "<sample:6>"}, false, 14, new String[][]{{"com.google.javascript.jscomp.Compiler", "getTypeValidator", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=0, getErrors=[], getMessages=[], getProgress=1.0, getWarningCount=0, getWarnings=[], hasErrors=false, isId...#241#813025255", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getCssRenamingMap", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "initCompilerOptionsIfTesting", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "parseInputs", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_IN...#360#-94050291", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getRoot", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "process", new String[]{"com.google.javascript.jscomp.CompilerPass"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "prepareAst", "com.google.javascript.rhino.Node", "<null>"}, {"com.google.javascript.jscomp.Compiler", "getParserConfig", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSourceArray", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getResult", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getParserConfig", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getSourceMap", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "addToDebugLog", "java.lang.String", "0xFFFFFFFF"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compileModules", new String[]{"java.util.List", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:2>", "<sample:2>", "<sample:1>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.Compiler", "getInputsById", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getCodingConvention", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.ClosureCodingConvention", actual.getClass().getName());
  assertEquals("{getAbstractMethodName=goog.abstractMethod, getDelegateSuperclassName=null, getExportPropertyFunction=goog.exportProperty, getExportSymbolFunction=goog.exportSymbol, getGlobalObject=goog.global}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getPropertyMap", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getOptions", ""}, {"com.google.javascript.jscomp.Compiler", "parse", "com.google.javascript.jscomp.SourceFile", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=3, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#323660214", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSModule[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:0>", "<sample:2>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "hasRegExpGlobalReferences", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getUniqueNameIdSupplier", new String[]{}, new String[]{}, false), new String[][]{{"get", "", "3"}, {"get", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getInputsById", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableMap", actual.getClass().getName());
  assertEquals("{InputId: a=a}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getGlobalVarReferences", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getTopScope", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "addNewScript", "com.google.javascript.jscomp.JsAst", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSource", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "disableThreads", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "hasErrors", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getMessages", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("[Lcom.google.javascript.jscomp.JSError;", actual.getClass().getName());
  assertEquals("[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source) line (unknown line) : (unknown column), JSC_EMPTY_ROOT_MODULE_ERROR. Root module {0} must contain at least one source code input at (unknow...#249#-1638554167", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "createFillFileName", new String[]{"java.lang.String"}, new String[]{"+1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[+1]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "initOptions", new String[]{"com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.Compiler", "initInputsByIdMap", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[], getMessages=[], getProgress=0.0, getWarningCount=0, getWarnings=[], hasErrors=false, isIdeMode=false, isTypeCheckingEnabled=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "toSource", "com.google.javascript.jscomp.Compiler$CodeBuilder,int,com.google.javascript.rhino.Node", "<sample:0>", "1", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.CompilerOptions", actual.getClass().getName());
  assertEquals("{getInferTypes=false, getLanguageIn=ECMASCRIPT3, getLanguageOut=null, getTracerMode=OFF, getTweakProcessing=OFF, isExternExportsEnabled=false, shouldColorizeErrorOutput=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "processDefines", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "stopTracer", new String[]{"com.google.javascript.jscomp.Tracer", "java.lang.String"}, new String[]{"<sample:0>", "%num%"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "initInputsByIdMap", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getExternsInOrder", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "ensureLibraryInjected", new String[]{"java.lang.String"}, new String[]{"%num%"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "init", "com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.CompilerOptions", "<empty>", "<sample:13>", "<sample:0>"}, {"com.google.javascript.jscomp.Compiler", "getInputsForTesting", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getInputsInOrder", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[a, a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getState", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Compiler$IntermediateState", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "rebuildInputsFromModules", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "replaceIncrementalSourceAst", "com.google.javascript.jscomp.JsAst", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "updateGlobalVarReferences", new String[]{"java.util.Map", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getModuleGraph", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "process", "com.google.javascript.jscomp.CompilerPass", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "computeCFG", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getWarnings", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getTypeValidator", ""}});
  assertNotNull(actual);
  assertEquals("[Lcom.google.javascript.jscomp.JSError;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getErrors", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "newCompilerOptions", ""}, {"com.google.javascript.jscomp.Compiler", "computeCFG", ""}});
  assertNotNull(actual);
  assertEquals("[Lcom.google.javascript.jscomp.JSError;", actual.getClass().getName());
  assertEquals("[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source) line (unknown line) : (unknown column), JSC_EMPTY_ROOT_MODULE_ERROR. Root module {0} must contain at least one source code input at (unknow...#249#-1638554167", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<null>", "<sample:0>", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "createPassConfigInternal", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.Compiler", "getFunctionalInformationMap", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.DefaultPassConfig", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getInput", new String[]{"com.google.javascript.rhino.InputId"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "addNewSourceAst", "com.google.javascript.jscomp.JsAst", "<sample:7>"}, {"com.google.javascript.jscomp.Compiler", "getErrors", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=3, getErrors=[JSC_READ_ERROR. Cannot read: <a><b>t</b></a> at (unknown so.., getMessages=[JSC_READ_ERROR. Cannot read: <a><b>t</b></a> at (unknown so.., getProgress=0.0...#298#2015877002", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "report", new String[]{"com.google.javascript.jscomp.JSError"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getWarningCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=3, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#323660214", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "addNewSourceAst", new String[]{"com.google.javascript.jscomp.JsAst"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.Compiler", "getMessages", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getInputsForTesting", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "init", "com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "<sample:7>", "<sample:0>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[[0]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getInputsInOrder", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.SourceFile,com.google.javascript.jscomp.SourceFile,com.google.javascript.jscomp.CompilerOptions", "<sample:7>", "<sample:5>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSModule[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:0>", "<sample:0>", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getInput", "com.google.javascript.rhino.InputId", "<sample:4>"}, {"com.google.javascript.jscomp.Compiler", "getLifeCycleStage", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSModule[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:2>", "<sample:3>", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getLifeCycleStage", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=3, getErrors=[JSC_DUPLICATE_EXTERN_INPUT. Duplicate extern input: a at (u.., getMessages=[JSC_DUPLICATE_EXTERN_INPUT. Duplicate extern input: a at (u.., getProgress=0.0...#298#2082368514", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "newExternInput", new String[]{"java.lang.String"}, new String[]{"Bad module input: "}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "newExternInput", new String[]{"java.lang.String"}, new String[]{"B`d module input: "}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "stripCode", "java.util.Set,java.util.Set,java.util.Set,java.util.Set", "<sample:0>", "<empty>", "<empty>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "replaceIncrementalSourceAst", new String[]{"com.google.javascript.jscomp.JsAst"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.Compiler", "compileModules", "java.util.List,java.util.List,com.google.javascript.jscomp.CompilerOptions", "<sample:0>", "<null>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSModule[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:13>", "<sample:2>", "<sample:6>"}, false, 14, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_EXTERN_INPUT. Duplicate extern input: a at (u.., getMessages=[JSC_DUPLICATE_EXTERN_INPUT. Duplicate extern input: a at (u.., getProgress=0.0...#298#-256451869", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSModule[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<empty>", "<sample:1>", "<sample:9>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "isIdeMode", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : 0, . a at (un.., getMessages=[. a at (unknown ...#421#-596031162", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "isInliningForbidden", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Compiler", "compileModules", "java.util.List,java.util.List,com.google.javascript.jscomp.CompilerOptions", "<sample:0>", "<empty>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=1, getErrors=[JSC_EMPTY_MODULE_LIST_ERROR. At least one module must be pr.., getMessages=[JSC_EMPTY_MODULE_LIST_ERROR. At least one module must be pr.., getProgress=0.0...#298#2037463838", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSModule[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<empty>", "<sample:4>", "<sample:9>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.Compiler", "optimize", ""}, {"com.google.javascript.jscomp.Compiler", "isIdeMode", ""}, {"com.google.javascript.jscomp.Compiler", "newExternInput", "java.lang.String", "1048577"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=1, getErrors=[JSC_EMPTY_ROOT_MODULE_ERROR. Root module {0} must contain a.., getMessages=[JSC_EMPTY_ROOT_MODULE_ERROR. Root module {0} must contain a.., getProgress=0.0...#298#1722060754", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getMessages", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "parseSyntheticCode", "java.lang.String,java.lang.String", "TITLE", "generateReport"}});
  assertNotNull(actual);
  assertEquals("[Lcom.google.javascript.jscomp.JSError;", actual.getClass().getName());
  assertEquals("[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source) line (unknown line) : (unknown column), JSC_EMPTY_ROOT_MODULE_ERROR. Root module {0} must contain at least one source code input at (unknow...#249#-1638554167", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "setLifeCycleStage", new String[]{"com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage"}, new String[]{"<null>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "init", "com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "<empty>", "<sample:2>", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : 0, . a at (un.., getMessages=[. a at (unknown source) line (unknown line) : 0, . a at (un.., getProgress=0.0...#359#-313364259", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getDegenerateModuleGraph", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.JSModuleGraph", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "ensureDefaultPassConfig", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.DefaultPassConfig", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "recordFunctionInformation", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getInputsInOrder", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.Compiler", "removeTryCatchFinally", ""}}), new String[][]{{"addAll", "java.util.Collection", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "setErrorManager", new String[]{"com.google.javascript.jscomp.ErrorManager"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=-2147483648, getErrors=[], getMessages=[], getProgress=0.0, getWarningCount=-2147483648, getWarnings=[], hasErrors=false, isIdeMode=false, isTypeCheckingEnabled=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "setHasRegExpGlobalReferences", new String[]{"boolean"}, new String[]{"false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "newTracer", new String[]{"java.lang.String"}, new String[]{"[singleton]"}, false, 2, new String[][]{{"com.google.javascript.jscomp.Compiler", "getInput", "com.google.javascript.rhino.InputId", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Tracer", actual.getClass().getName());
  assertEquals("[Compiler] [singleton]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "init", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<empty>", "<sample:4>", "<sample:5>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.Compiler", "setProgress", "double", "1.7976931348623157E308"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=1.0...#298#-521247720", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "addChangeHandler", new String[]{"com.google.javascript.jscomp.CodeChangeHandler"}, new String[]{"<sample:6>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "acceptEcmaScript5", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getInputsForTesting", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getErrorCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "toSourceArray", "com.google.javascript.jscomp.JSModule", "<sample:2>"}, {"com.google.javascript.jscomp.Compiler", "replaceIncrementalSourceAst", "com.google.javascript.jscomp.JsAst", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSModule[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:5>", "<sample:1>", "<sample:6>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.Compiler", "getCodingConvention", ""}, {"com.google.javascript.jscomp.Compiler", "getLifeCycleStage", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_EXTERN_INPUT. Duplicate extern input: <a><b>t.., getMessages=[JSC_DUPLICATE_EXTERN_INPUT. Duplicate extern input: <a><b>t.., getProgress=0.0...#298#1141433455", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "isInliningForbidden", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.Compiler", "addIncrementalSourceAst", "com.google.javascript.jscomp.JsAst", "<sample:4>"}, {"com.google.javascript.jscomp.Compiler", "updateGlobalVarReferences", "java.util.Map,com.google.javascript.rhino.Node", "<sample:1>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getPassConfig", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.DefaultPassConfig", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "runCallable", new String[]{"java.util.concurrent.Callable", "boolean", "boolean"}, new String[]{"<sample:1>", "false", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getDefaultErrorReporter", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.RhinoErrorReporter$NewRhinoErrorReporter", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "setPassConfig", new String[]{"com.google.javascript.jscomp.PassConfig"}, new String[]{"<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getSynthesizedExternsInput", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "addNewScript", "com.google.javascript.jscomp.JsAst", "<sample:10>"}, {"com.google.javascript.jscomp.Compiler", "toSource", "com.google.javascript.rhino.Node", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "parseSyntheticCode", new String[]{"java.lang.String"}, new String[]{"Bad module: "}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT [source_file:  [synthetic:1] ] [input_id: InputId:  [synthetic:1] ] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, g...#430#1342306056", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=3, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#323660214", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "acceptConstKeyword", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "java.util.List,java.util.List,com.google.javascript.jscomp.CompilerOptions", "<empty>", "<sample:3>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "isIdeMode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "parseSyntheticCode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"sanityCheck", ".5"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT [source_file: sanityCheck] [input_id: InputId: sanityCheck] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEf...#418#-191535010", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.SourceFile", "com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:6>", "<sample:4>", "<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "optimize", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=3, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: <a><b>t</b></a> at (u.., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: <a><b>t</b></a> at (u.., getProgress=0.0...#298#-1590671210", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getErrorLevel", new String[]{"com.google.javascript.jscomp.JSError"}, new String[]{"<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "parse", new String[]{"com.google.javascript.jscomp.SourceFile"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getExternsForTesting", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getInputsInOrder", new String[]{}, new String[]{}, false), new String[][]{{"size", "", "5"}, {"lastIndexOf", "java.lang.Object", "0"}, {"subList", "int,int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "createFillFileName", new String[]{"java.lang.String"}, new String[]{"removeTryCatchFinally"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[removeTryCatchFinally]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "setProgress", new String[]{"double"}, new String[]{"0.15"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.1...#299#641274919", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "processAMDAndCommonJSModules", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.Compiler", "getAstDotGraph", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "precheck", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getSourceRegion", new String[]{"java.lang.String", "int"}, new String[]{"%name%", "2147483647"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getErrors", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getCodingConvention", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getErrors", ""}, {"com.google.javascript.jscomp.Compiler", "getProgress", ""}}), new String[][]{{"isPropertyTestFunction", "com.google.javascript.rhino.Node", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "areNodesEqualForInlining", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "resetUniqueNameId", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getState", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Compiler$IntermediateState", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getAstDotGraph", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getTypeRegistry", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSTypeRegistry", actual.getClass().getName());
  assertEquals("{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "buildKnownSymbolTable", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.Compiler", "getParserConfig", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getOptions", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Compiler", "toSourceArray", "com.google.javascript.jscomp.JSModule", "<sample:3>"}, {"com.google.javascript.jscomp.Compiler", "setLifeCycleStage", "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=!NullPointerException, getErrors=!NullPointerException, getMessages=!NullPointerException, getProgress=0.0, getWarningCount=!NullPointerException, getWarnings=!NullPoin...#324#756948161", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "newExternInput", new String[]{"java.lang.String"}, new String[]{"Strip code"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "resetUniqueNameId", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSModule[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:13>", "<sample:4>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getSynthesizedExternsInput", ""}, {"com.google.javascript.jscomp.Compiler", "toSource", "com.google.javascript.rhino.Node", "<sample:4>"}, {"com.google.javascript.jscomp.Compiler", "updateGlobalVarReferences", "java.util.Map,com.google.javascript.rhino.Node", "<empty>", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=3, getErrors=[JSC_DUPLICATE_EXTERN_INPUT. Duplicate extern input: a at (u.., getMessages=[JSC_DUPLICATE_EXTERN_INPUT. Duplicate extern input: a at (u.., getProgress=0.0...#298#2082368514", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "addToDebugLog", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890"}, false, 5, new String[][]{{"com.google.javascript.jscomp.Compiler", "getParserConfig", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getProgress", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getWarnings", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "isInliningForbidden", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.Compiler", "parseInputs", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_IN...#360#-94050291", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getDegenerateModuleGraph", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "getResult", ""}, {"com.google.javascript.jscomp.Compiler", "ensureDefaultPassConfig", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.JSModuleGraph", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : 0, . a at (un.., getMessages=[. a at (unknown source) line (unknown line) : 0, . a at (un.., getProgress=0.0...#359#-313364259", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "acceptConstKeyword", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.Compiler", "hasHaltingErrors", ""}, {"com.google.javascript.jscomp.Compiler", "createPassConfigInternal", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "languageMode", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getInputsInOrder", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.CompilerOptions$LanguageMode", actual.getClass().getName());
  assertEquals("ECMASCRIPT3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getVariableMap", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "addIncrementalSourceAst", new String[]{"com.google.javascript.jscomp.JsAst"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=0.0...#298#-2015160169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "setProgress", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getProgress=1.0...#298#-521247720", SearchInputFactory_scaffolding.receiverState());
 }
}
