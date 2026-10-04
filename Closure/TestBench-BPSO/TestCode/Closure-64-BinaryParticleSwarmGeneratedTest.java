package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "parseSyntheticCode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-0..S", "123\r56789012345678901234567890"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT 1 [sourcename: -0..S] [synthetic: 1] {getCharno=0, getChildCount=2, getDouble=!UnsupportedOperationException, getLineno=1, getQualifiedName=null, getSideEffectFlags=0, getSourcePosition=4096, g...#420#-1360799833", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown source) line (unknown line) : (unknown colu.., getWarningCount...#342#-1303714041", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "hasRegExpGlobalReferences", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown source) line (unknown line) : (unknown colu.., getWarningCount...#342#-1303714041", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSModule[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:3>", "<sample:2>", "<sample:0>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.Compiler", "getInputsInOrder", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getPropertyMap", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "setLoggingLevel", new String[]{"java.util.logging.Level"}, new String[]{"<sample:0>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "addToDebugLog", new String[]{"java.lang.String"}, new String[]{"nukl"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "disableThreads", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "isInliningForbidden", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.Compiler", "getNodeForCodeInsertion", "com.google.javascript.jscomp.JSModule", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "removeInput", new String[]{"java.lang.String"}, new String[]{"223456789012345678901234567890"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getTopScope", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.Compiler", "getGlobalVarReferences", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "computeCFG", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "<sample:5>", "<sample:0>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.ControlFlowAnalysis$AstControlFlowGraph", actual.getClass().getName());
  assertEquals("{getName=LinkedGraph, isDirected=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown ...#404#1789648253", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "areNodesEqualForInlining", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<sample:2>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.Compiler", "addIncrementalSourceAst", "com.google.javascript.jscomp.JsAst", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "acceptEcmaScript5", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "toSource", "com.google.javascript.jscomp.JSModule", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown source) line (unknown line) : (unknown colu.., getWarningCount...#342#-1303714041", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getState", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getRoot", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Compiler$IntermediateState", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSource", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.Compiler", "endPass", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "addIncrementalSourceAst", new String[]{"com.google.javascript.jscomp.JsAst"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "setHasRegExpGlobalReferences", "boolean", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "runCallableWithLargeStack", new String[]{"java.util.concurrent.Callable"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "removeChangeHandler", new String[]{"com.google.javascript.jscomp.CodeChangeHandler"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "recordFunctionInformation", ""}, {"com.google.javascript.jscomp.Compiler", "getExternsForTesting", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "runCallable", new String[]{"java.util.concurrent.Callable", "boolean", "boolean"}, new String[]{"<sample:5>", "false", "true"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "normalize", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "startPass", "java.lang.String", " on recently chan1ged AST"}, {"com.google.javascript.jscomp.Compiler", "toSourceArray", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "check", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "parse", ""}, {"com.google.javascript.jscomp.Compiler", "processDefines", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_IN...#343#1429407841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "parseTestCode", new String[]{"java.lang.String"}, new String[]{"..5"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "hasHaltingErrors", ""}, {"com.google.javascript.jscomp.Compiler", "getFunctionalInformationMap", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BLOCK [sourcename:  [testcode] ] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourcePosition=-1, getString=!U...#410#1095742470", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=3, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#191970200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "parseSyntheticCode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"TITLE", ";Strip code"}, false, 6, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.CompilerOptions", "<sample:8>", "<sample:2>", "<sample:9>"}, {"com.google.javascript.jscomp.Compiler", "recordFunctionInformation", ""}}), new String[][]{{"addChildrenToFront", "com.google.javascript.rhino.Node", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BLOCK [sourcename: TITLE] {getCharno=-1, getChildCount=1, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourcePosition=-1, getString=!Unsuppor...#401#-994767522", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=1, getErrors=[JSC_PARSE_ERROR. Parse error. missing ; before statement at.., getMessages=[JSC_PARSE_ERROR....#403#1401682928", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getSourceRegion", new String[]{"java.lang.String", "int"}, new String[]{"stripCode", "20"}, false, 6, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.CompilerOptions", "<sample:1>", "<sample:6>", "<sample:4>"}, {"com.google.javascript.jscomp.Compiler", "rebuildInputsFromModules", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=1, getErrors=[JSC_READ_ERROR. Cannot read: <a><b>t</b></a> at (unknown so.., getMessages=[JSC_READ_ERROR. ...#343#1200699148", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSourceArray", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.Compiler", "initCompilerOptionsIfTesting", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile", "com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:8>", "<sample:3>", "<sample:7>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.Compiler", "report", "com.google.javascript.jscomp.JSError", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=1, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: <a><b>t</b></a> at (u.., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: <a><b>t</b></a> at (u.., getWarningCount...#281#-832201034", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "setCssRenamingMap", new String[]{"com.google.javascript.jscomp.CssRenamingMap"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "updateGlobalVarReferences", "java.util.Map,com.google.javascript.rhino.Node", "<sample:5>", "<sample:6>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compileModules", new String[]{"java.util.List", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:4>", "<sample:7>", "<sample:5>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "parse", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile", "com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:6>", "<sample:2>", "<sample:9>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.CompilerOptions", "<sample:0>", "<null>", "<sample:3>"}, {"com.google.javascript.jscomp.Compiler", "parseTestCode", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: <a><b>t</b></a> at (u.., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: <a><b>t</b></a> at (u.., getWarningCount...#281#-945811529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSource", new String[]{"com.google.javascript.jscomp.Compiler$CodeBuilder", "int", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "1048581", "<sample:4>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.Compiler", "toSourceArray", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "stripCode", new String[]{"java.util.Set", "java.util.Set", "java.util.Set", "java.util.Set"}, new String[]{"<sample:2>", "<sample:0>", "<sample:0>", "<sample:1>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.Compiler", "toSourceArray", "com.google.javascript.jscomp.JSModule", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getUniqueNameIdSupplier", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.Compiler", "getTypedScopeCreator", ""}, {"com.google.javascript.jscomp.Compiler", "getDefaultErrorReporter", ""}}), new String[][]{{"get", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "runCallable", new String[]{"java.util.concurrent.Callable", "boolean", "boolean"}, new String[]{"<null>", "true", "true"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getReverseAbstractInterpreter", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.Compiler", "getTypeValidator", ""}, {"com.google.javascript.jscomp.Compiler", "addToDebugLog", "java.lang.String", "t+rue"}}), new String[][]{{"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope,boolean", "0"}, {"getTypeOfThis", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "parse", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.Compiler", "toSource", "com.google.javascript.rhino.Node", "<sample:2>"}, {"com.google.javascript.jscomp.Compiler", "parse", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "setErrorManager", new String[]{"com.google.javascript.jscomp.ErrorManager"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.CompilerOptions", "<sample:7>", "<sample:8>", "<sample:6>"}, {"com.google.javascript.jscomp.Compiler", "replaceIncrementalSourceAst", "com.google.javascript.jscomp.JsAst", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=1, getErrors=[JSC_EMPTY_ROOT_MODULE_ERROR. Root module {0} must contain a.., getMessages=[JSC_EMPTY_ROOT_M...#343#-1691244602", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getErrorLevel", new String[]{"com.google.javascript.jscomp.JSError"}, new String[]{"<null>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.Compiler", "throwInternalError", "java.lang.String,java.lang.Exception", "11:230:45", "<null>"}, {"com.google.javascript.jscomp.Compiler", "getInputsForTesting", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getSourceMap", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.CompilerOptions", "<sample:4>", "<sample:2>", "<sample:4>"}, {"com.google.javascript.jscomp.Compiler", "stripCode", "java.util.Set,java.util.Set,java.util.Set,java.util.Set", "<sample:0>", "<sample:2>", "<sample:3>", "<empty>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=2, getErrors=[JSC_PARSE_ERROR. Parse error. missing ; before statement at.., getMessages=[JSC_PARSE_ERROR....#343#348810137", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getCssRenamingMap", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "getSourceLine", "java.lang.String,int", "Remove try/catch/finally", "4"}, {"com.google.javascript.jscomp.Compiler", "stripCode", "java.util.Set,java.util.Set,java.util.Set,java.util.Set", "<sample:4>", "<sample:4>", "<empty>", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown source) line (unknown line) : (unknown colu.., getWarningCount...#342#-1303714041", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "languageMode", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.CompilerOptions", "<sample:5>", "<empty>", "<sample:5>"}, {"com.google.javascript.jscomp.Compiler", "replaceIncrementalSourceAst", "com.google.javascript.jscomp.JsAst", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.CompilerOptions$LanguageMode", actual.getClass().getName());
  assertEquals("ECMASCRIPT3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown ...#404#1789648253", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getNodeForCodeInsertion", new String[]{"com.google.javascript.jscomp.JSModule"}, new String[]{"<null>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.Compiler", "getUniqueNameIdSupplier", ""}, {"com.google.javascript.jscomp.Compiler", "getOptions", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BLOCK [sourcename: a] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourcePosition=-1, getString=!UnsupportedO...#399#-641638998", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "resetUniqueNameId", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.Compiler", "compileModules", "java.util.List,java.util.List,com.google.javascript.jscomp.CompilerOptions", "<sample:6>", "<empty>", "<sample:5>"}, {"com.google.javascript.jscomp.Compiler", "toSource", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=3, getErrors=[JSC_EMPTY_MODULE_LIST_ERROR. At least one module must be pr.., getMessages=[JSC_EMPTY_MODULE_LIST_ERROR. At least one module must be pr.., getWarningCount...#281#-1134956750", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getCodingConvention", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.Compiler", "removeInput", "java.lang.String", "a"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.ClosureCodingConvention", actual.getClass().getName());
  assertEquals("{getAbstractMethodName=goog.abstractMethod, getDelegateSuperclassName=null, getExportPropertyFunction=goog.exportProperty, getExportSymbolFunction=goog.exportSymbol, getGlobalObject=goog.global}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "setState", new String[]{"com.google.javascript.jscomp.Compiler$IntermediateState"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "<sample:1>", "<sample:3>", "<sample:6>"}, {"com.google.javascript.jscomp.Compiler", "parseSyntheticCode", "java.lang.String", "1234567890D2345678801234567890"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=4, getErrors=[JSC_DUPLICATE_EXTERN_INPUT. Duplicate extern input: a at (u.., getMessages=[JSC_DUPLICATE_EXTERN_INPUT. Duplicate extern input: a at (u.., getWarningCount...#281#-1496885043", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getVariableMap", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "parseInputs", ""}, {"com.google.javascript.jscomp.Compiler", "getSourceRegion", "java.lang.String,int", "129:30:45", "-35"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_IN...#343#1429407841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSourceArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "newExternInput", "java.lang.String", "a"}, {"com.google.javascript.jscomp.Compiler", "initOptions", "com.google.javascript.jscomp.CompilerOptions", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:2>", "<sample:1>", "<null>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.CompilerOptions", "<sample:6>", "<sample:0>", "<sample:2>"}, {"com.google.javascript.jscomp.Compiler", "setPassConfig", "com.google.javascript.jscomp.PassConfig", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "removeTryCatchFinally", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "parse", ""}, {"com.google.javascript.jscomp.Compiler", "setPassConfig", "com.google.javascript.jscomp.PassConfig", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_IN...#343#1429407841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getExternsForTesting", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=!NullPointerException, getErrors=!NullPointerException, getMessages=!NullPointerException, getWarningCount=!NullPointerException, getWarnings=!NullPointerException, has...#307#49963817", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "throwInternalError", new String[]{"java.lang.String", "java.lang.Exception"}, new String[]{"urue2020-02-30T25:61:61", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "parseInputs", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile", "com.google.javascript.jscomp.JSModule[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<null>", "<sample:0>", "<sample:7>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "newExternInput", new String[]{"java.lang.String"}, new String[]{"1.123456782147483648"}, false, 3, new String[][]{{"com.google.javascript.jscomp.Compiler", "setState", "com.google.javascript.jscomp.Compiler$IntermediateState", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "replaceIncrementalSourceAst", new String[]{"com.google.javascript.jscomp.JsAst"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getLifeCycleStage", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile", "com.google.javascript.jscomp.JSSourceFile", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:7>", "<sample:5>", "<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile", "com.google.javascript.jscomp.JSModule[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:2>", "<sample:1>", "<sample:0>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "<sample:4>", "<sample:4>", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=1, getErrors=[JSC_EMPTY_ROOT_MODULE_ERROR. Root module {0} must contain a.., getMessages=[JSC_EMPTY_ROOT_MODULE_ERROR. Root module {0} must contain a.., getWarningCount...#281#1479895548", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "optimize", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getInputsInOrder", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.Compiler", "getLifeCycleStage", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "throwInternalError", new String[]{"java.lang.String", "java.lang.Exception"}, new String[]{";123456789012345678701234567890", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.CompilerOptions", "<sample:7>", "<sample:5>", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<empty>", "<sample:1>", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getInputsForTesting", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile", "com.google.javascript.jscomp.JSSourceFile", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:9>", "<sample:5>", "<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getDefaultErrorReporter", ""}, {"com.google.javascript.jscomp.Compiler", "getReverseAbstractInterpreter", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSModule[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:2>", "<empty>", "<sample:2>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=4, getErrors=[JSC_EMPTY_MODULE_LIST_ERROR. At least one module must be pr.., getMessages=[JSC_EMPTY_MODULE_LIST_ERROR. At least one module must be pr.., getWarningCount...#281#-1248567245", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "rebuildInputsFromModules", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown source) line (unknown line) : (unknown colu.., getWarningCount...#342#-1303714041", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "hasRegExpGlobalReferences", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=!NullPointerException, getErrors=!NullPointerException, getMessages=!NullPointerException, getWarningCount=!NullPointerException, getWarnings=!NullPointerException, has...#307#49963817", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "initInputsByNameMap", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile", "com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:7>", "<empty>", "<null>"}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "initInputsByNameMap", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "startPass", "java.lang.String", "["}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "newTracer", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Tracer", actual.getClass().getName());
  assertEquals("[Compiler] 2020-01-01", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSModule[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:4>", "<sample:0>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.CompilerOptions", "<sample:4>", "<sample:8>", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "runCallable", new String[]{"java.util.concurrent.Callable", "boolean", "boolean"}, new String[]{"<sample:1>", "false", "false"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "check", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getErrorCount", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"java.util.List", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:1>", "<sample:5>", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getErrors", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "resetUniqueNameId", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.Compiler", "getDefaultErrorReporter", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getCodingConvention", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.ClosureCodingConvention", actual.getClass().getName());
  assertEquals("{getAbstractMethodName=goog.abstractMethod, getDelegateSuperclassName=null, getExportPropertyFunction=goog.exportProperty, getExportSymbolFunction=goog.exportSymbol, getGlobalObject=goog.global}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown source) line (unknown line) : (unknown colu.., getWarningCount...#342#-1303714041", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compileModules", new String[]{"java.util.List", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:2>", "<sample:0>", "<sample:1>"}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getSourceMap", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "setLifeCycleStage", new String[]{"com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "prepareAst", "com.google.javascript.rhino.Node", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getTopScope", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.CompilerOptions", "<sample:10>", "<sample:4>", "<null>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown source) line (unknown line) : (unknown colu.., getWarningCount...#390#518701552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSourceArray", new String[]{"com.google.javascript.jscomp.JSModule"}, new String[]{"<null>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.CompilerOptions", "<sample:7>", "<sample:9>", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "prepareAst", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "computeCFG", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.Compiler", "newExternInput", "java.lang.String", "true5.]"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "acceptEcmaScript5", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "acceptConstKeyword", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "setCssRenamingMap", new String[]{"com.google.javascript.jscomp.CssRenamingMap"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "getInputsInOrder", ""}, {"com.google.javascript.jscomp.Compiler", "getModuleGraph", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown source) line (unknown line) : (unknown colu.., getWarningCount...#342#-1303714041", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compileModules", new String[]{"java.util.List", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:1>", "<sample:4>", "<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "check", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "addChangeHandler", new String[]{"com.google.javascript.jscomp.CodeChangeHandler"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.Compiler", "setErrorManager", "com.google.javascript.jscomp.ErrorManager", "<sample:5>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown source) line (unknown line) : (unknown colu.., getWarningCount...#341#-1798978302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "parseSyntheticCode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.124567890123456", "-11.5"}, false, 3, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.CompilerOptions", "<sample:3>", "<sample:8>", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BLOCK [sourcename: 1.124567890123456] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourcePosition=-1, getStri...#415#-1967066631", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "acceptConstKeyword", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Compiler", "getAstDotGraph", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getSourceMap", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getTypeRegistry", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "initCompilerOptionsIfTesting", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "startPass", "java.lang.String", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "setState", new String[]{"com.google.javascript.jscomp.Compiler$IntermediateState"}, new String[]{"<sample:6>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.Compiler", "getErrors", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSModule[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<null>", "<sample:1>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getWarnings", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "optimize", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSource", new String[]{"com.google.javascript.jscomp.JSModule"}, new String[]{"<sample:6>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSModule[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:7>", "<sample:3>", "<sample:0>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "languageMode", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Compiler", "init", "com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.CompilerOptions", "<empty>", "<sample:2>", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "endPass", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "removeChangeHandler", new String[]{"com.google.javascript.jscomp.CodeChangeHandler"}, new String[]{"<sample:0>"}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "hasHaltingErrors", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "getGlobalVarReferences", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown source) line (unknown line) : (unknown colu.., getWarningCount...#342#-1303714041", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSModule[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:8>", "<sample:3>", "<sample:2>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.Compiler", "initInputsByNameMap", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=1, getErrors=[JSC_DUPLICATE_EXTERN_INPUT. Duplicate extern input: a at (u.., getMessages=[JSC_DUPLICATE_EXTERN_INPUT. Duplicate extern input: a at (u.., getWarningCount...#281#-1156053558", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "runCallable", new String[]{"java.util.concurrent.Callable", "boolean", "boolean"}, new String[]{"<sample:0>", "false", "false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "computeCFG", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getInput", new String[]{"java.lang.String"}, new String[]{"6"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown source) line (unknown line) : (unknown colu.., getWarningCount...#342#-1303714041", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compileModules", new String[]{"java.util.List", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:5>", "<null>", "<sample:0>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.Compiler", "setCssRenamingMap", "com.google.javascript.jscomp.CssRenamingMap", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getSourceLine", new String[]{"java.lang.String", "int"}, new String[]{"-.1%name%", "524250"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "java.util.List,java.util.List,com.google.javascript.jscomp.CompilerOptions", "<sample:3>", "<empty>", "<sample:9>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "addChangeHandler", new String[]{"com.google.javascript.jscomp.CodeChangeHandler"}, new String[]{"<sample:1>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getReverseAbstractInterpreter", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getDiagnosticGroups", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SemanticReverseAbstractInterpreter", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "addIncrementalSourceAst", new String[]{"com.google.javascript.jscomp.JsAst"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getMessages", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSource", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown source) line (unknown line) : (unknown colu.., getWarningCount...#342#-1303714041", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "runCallableWithLargeStack", new String[]{"java.util.concurrent.Callable"}, new String[]{"<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "computeCFG", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "parse", new String[]{"com.google.javascript.jscomp.JSSourceFile"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getTypedScopeCreator", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=3, getErrors=[JSC_READ_ERROR. Cannot read: <a><b>t</b></a> at (unknown so.., getMessages=[JSC_READ_ERROR. Cannot read: <a><b>t</b></a> at (unknown so.., getWarningCount...#281#-150348988", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "runCallable", new String[]{"java.util.concurrent.Callable", "boolean", "boolean"}, new String[]{"<sample:2>", "false", "true"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "optimize", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getTopScope", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "throwInternalError", new String[]{"java.lang.String", "java.lang.Exception"}, new String[]{"3020-01-01Hello, World", "<sample:0>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.Compiler", "normalize", ""}, {"com.google.javascript.jscomp.Compiler", "processDefines", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "precheck", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "endPass", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "createPassConfigInternal", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.DefaultPassConfig", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSource", new String[]{"com.google.javascript.jscomp.JSModule"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "getPassConfig", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown source) line (unknown line) : (unknown colu.., getWarningCount...#342#-1303714041", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getVariableMap", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.Compiler", "setLifeCycleStage", "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "hasRegExpGlobalReferences", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.Compiler", "getTypedScopeCreator", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "init", new String[]{"java.util.List", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:3>", "<null>", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "setHasRegExpGlobalReferences", "boolean", "false"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getSourceLine", new String[]{"java.lang.String", "int"}, new String[]{"-1.", "1049089"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "acceptEcmaScript5", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "newExternInput", new String[]{"java.lang.String"}, new String[]{"0"}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "initCompilerOptionsIfTesting", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[], getMessages=[], getWarningCount=0, getWarnings=[], hasErrors=false, isIdeMode=false, isTypeCheckingEnabled=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getErrors", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "<sample:1>", "<sample:0>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("[Lcom.google.javascript.jscomp.JSError;", actual.getClass().getName());
  assertEquals("[JSC_DUPLICATE_EXTERN_INPUT. Duplicate extern input: a at (unknown source) line (unknown line) : (unknown column), JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source) line (unknown line) : (un...#363#817031698", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=3, getErrors=[JSC_DUPLICATE_EXTERN_INPUT. Duplicate extern input: a at (u.., getMessages=[JSC_DUPLICATE_EXTERN_INPUT. Duplicate extern input: a at (u.., getWarningCount...#281#-1383274548", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "setPassConfig", new String[]{"com.google.javascript.jscomp.PassConfig"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getModuleGraph", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "check", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "addToDebugLog", new String[]{"java.lang.String"}, new String[]{"Hfllo, Worlc"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "areNodesEqualForInlining", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<sample:7>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.Compiler", "acceptEcmaScript5", ""}, {"com.google.javascript.jscomp.Compiler", "throwInternalError", "java.lang.String,java.lang.Exception", "129:30:45", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "check", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "setHasRegExpGlobalReferences", "boolean", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getFunctionalInformationMap", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "startPass", "java.lang.String", "1.5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "optimize", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "addIncrementalSourceAst", "com.google.javascript.jscomp.JsAst", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "throwInternalError", new String[]{"java.lang.String", "java.lang.Exception"}, new String[]{"--T0", "<empty>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSource", new String[]{"com.google.javascript.jscomp.Compiler$CodeBuilder", "int", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "2147483647", "<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getNodeForCodeInsertion", "com.google.javascript.jscomp.JSModule", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getSourceLine", new String[]{"java.lang.String", "int"}, new String[]{"<1.5", "2147483647"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile", "com.google.javascript.jscomp.JSSourceFile", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:7>", "<sample:7>", "<sample:9>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "hasHaltingErrors", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compileModules", new String[]{"java.util.List", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:4>", "<sample:0>", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getTopScope", ""}, {"com.google.javascript.jscomp.Compiler", "compile", "java.util.List,java.util.List,com.google.javascript.jscomp.CompilerOptions", "<sample:5>", "<sample:1>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSModule[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<null>", "<null>", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "reportCodeChange", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "startPass", new String[]{"java.lang.String"}, new String[]{"21474836481L"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "initModules", new String[]{"java.util.List", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:0>", "<sample:3>", "<sample:4>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.Compiler", "check", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "acceptEcmaScript5", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "setLifeCycleStage", "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "newTracer", new String[]{"java.lang.String"}, new String[]{"129:t1:45"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.CompilerOptions", "<sample:3>", "<sample:5>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Tracer", actual.getClass().getName());
  assertEquals("[Compiler] 129:t1:45", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "areNodesEqualForInlining", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "computeCFG", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<null>", "<sample:2>", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "hasRegExpGlobalReferences", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getLifeCycleStage", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage", actual.getClass().getName());
  assertEquals("RAW", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "reportCodeChange", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getSourceMap", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "newTracer", new String[]{"java.lang.String"}, new String[]{";2020-02-30T25:61:61"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Tracer", actual.getClass().getName());
  assertEquals("[Compiler] ;2020-02-30T25:61:61", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getInputsForTesting", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSource", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "replaceIncrementalSourceAst", new String[]{"com.google.javascript.jscomp.JsAst"}, new String[]{"<null>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.Compiler", "getErrorLevel", "com.google.javascript.jscomp.JSError", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSModule[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:2>", "<null>", "<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "<sample:3>", "<sample:3>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "parse", new String[]{"com.google.javascript.jscomp.JSSourceFile"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BLOCK [sourcename: <a><b>t</b></a>] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourcePosition=-1, getString...#413#-1662181545", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=4, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#78359705", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"java.util.List", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:3>", "<sample:4>", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getGlobalVarReferences", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.Compiler", "getTypeRegistry", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSModule[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:8>", "<empty>", "<sample:9>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=4, getErrors=[JSC_EMPTY_MODULE_LIST_ERROR. At least one module must be pr.., getMessages=[JSC_EMPTY_MODULE_LIST_ERROR. At least one module must be pr.., getWarningCount...#281#-1248567245", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "addChangeHandler", new String[]{"com.google.javascript.jscomp.CodeChangeHandler"}, new String[]{"<sample:3>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getInput", new String[]{"java.lang.String"}, new String[]{"Bad modulf: "}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "init", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:8>", "<sample:3>", "<sample:0>"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=3, getErrors=[JSC_DUPLICATE_EXTERN_INPUT. Duplicate extern input: a at (u.., getMessages=[JSC_DUPLICATE_EXTERN_INPUT. Duplicate extern input: a at (u.., getWarningCount...#281#-1383274548", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "removeTryCatchFinally", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getTypeRegistry", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.Compiler", "getInputsInOrder", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSTypeRegistry", actual.getClass().getName());
  assertEquals("{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "setLoggingLevel", new String[]{"java.util.logging.Level"}, new String[]{"<sample:3>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getTypedScopeCreator", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.CompilerOptions", actual.getClass().getName());
  assertEquals("{getInferTypes=false, getLanguageIn=ECMASCRIPT3, getLanguageOut=null, getTweakProcessing=OFF, isAssumeStrictThis=false, isExternExportsEnabled=false, shouldColorizeErrorOutput=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile", "com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:3>", "<sample:8>", "<sample:2>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.Compiler", "getReverseAbstractInterpreter", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getSourceMap", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.Compiler", "parseSyntheticCode", "java.lang.String", "iHello, World"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "areNodesEqualForInlining", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<sample:1>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown source) line (unknown line) : (unknown colu.., getWarningCount...#342#-1303714041", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "initOptions", new String[]{"com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:3>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getInputsInOrder", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getLifeCycleStage", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "computeCFG", new String[]{}, new String[]{}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:2>", "<sample:3>", "<sample:2>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=4, getErrors=[JSC_DUPLICATE_EXTERN_INPUT. Duplicate extern input: a at (u.., getMessages=[JSC_DUPLICATE_EXTERN_INPUT. Duplicate extern input: a at (u.., getWarningCount...#281#-1496885043", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "report", new String[]{"com.google.javascript.jscomp.JSError"}, new String[]{"<sample:7>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#341#1851425975", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"java.util.List", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:3>", "<sample:4>", "<sample:7>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "parse", new String[]{"com.google.javascript.jscomp.JSSourceFile"}, new String[]{"<sample:1>"}, false, 3, new String[][]{}), new String[][]{{"getLineno", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getCodingConvention", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.ClosureCodingConvention", actual.getClass().getName());
  assertEquals("{getAbstractMethodName=goog.abstractMethod, getDelegateSuperclassName=null, getExportPropertyFunction=goog.exportProperty, getExportSymbolFunction=goog.exportSymbol, getGlobalObject=goog.global}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "acceptConstKeyword", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.Compiler", "initCompilerOptionsIfTesting", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "setPassConfig", new String[]{"com.google.javascript.jscomp.PassConfig"}, new String[]{"<sample:3>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown source) line (unknown line) : (unknown colu.., getWarningCount...#342#-1303714041", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getCssRenamingMap", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "init", new String[]{"java.util.List", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:3>", "<sample:0>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "setState", "com.google.javascript.jscomp.Compiler$IntermediateState", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSModule[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:8>", "<sample:3>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "addChangeHandler", "com.google.javascript.jscomp.CodeChangeHandler", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=3, getErrors=[JSC_DUPLICATE_EXTERN_INPUT. Duplicate extern input: a at (u.., getMessages=[JSC_DUPLICATE_EXTERN_INPUT. Duplicate extern input: a at (u.., getWarningCount...#281#-1383274548", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSModule[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:3>", "<sample:1>", "<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSource", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getErrorLevel", new String[]{"com.google.javascript.jscomp.JSError"}, new String[]{"<sample:7>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.Compiler", "acceptConstKeyword", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "setHasRegExpGlobalReferences", new String[]{"boolean"}, new String[]{"false"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "initInputsByNameMap", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getDiagnosticGroups", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "setErrorManager", new String[]{"com.google.javascript.jscomp.ErrorManager"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "parseTestCode", "java.lang.String", "h"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=-2147483648, getErrors=[], getMessages=[], getWarningCount=-2147483648, getWarnings=[], hasErrors=false, isIdeMode=false, isTypeCheckingEnabled=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "hasRegExpGlobalReferences", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "init", new String[]{"java.util.List", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:1>", "<sample:0>", "<sample:6>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.Compiler", "processDefines", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getParserConfig", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.Compiler", "addIncrementalSourceAst", "com.google.javascript.jscomp.JsAst", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.parsing.Config", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "areNodesEqualForInlining", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:4>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSourceArray", new String[]{"com.google.javascript.jscomp.JSModule"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getDefaultErrorReporter", ""}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSource", new String[]{"com.google.javascript.jscomp.Compiler$CodeBuilder", "int", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "0", "<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getTypeValidator", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "reportCodeChange", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown source) line (unknown line) : (unknown colu.., getWarningCount...#342#-1303714041", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "prepareAst", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown source) line (unknown line) : (unknown colu.., getWarningCount...#342#-1303714041", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "init", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<empty>", "<sample:4>", "<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "isTypeCheckingEnabled", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSource", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "getMessages", ""}, {"com.google.javascript.jscomp.Compiler", "getVariableMap", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "parseSyntheticCode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.5e300 on recently changed AST", "toSource"}, false, 7, new String[][]{{"com.google.javascript.jscomp.Compiler", "setErrorManager", "com.google.javascript.jscomp.ErrorManager", "<sample:0>"}, {"com.google.javascript.jscomp.Compiler", "getSourceRegion", "java.lang.String,int", "[singleton].5", "0"}}), new String[][]{{"isLocalResultCall", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=-2147483648, getErrors=[], getMessages=[], getWarningCount=-2147483648, getWarnings=[], hasErrors=false, isIdeMode=false, isTypeCheckingEnabled=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "setCssRenamingMap", new String[]{"com.google.javascript.jscomp.CssRenamingMap"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "addChangeHandler", "com.google.javascript.jscomp.CodeChangeHandler", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "processDefines", new String[]{}, new String[]{}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:3>", "<sample:0>", "<sample:7>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "getPassConfig", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "parseTestCode", new String[]{"java.lang.String"}, new String[]{"st9tripCode"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "processDefines", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BLOCK [sourcename:  [testcode] ] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourcePosition=-1, getString=!U...#410#1095742470", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "setCssRenamingMap", new String[]{"com.google.javascript.jscomp.CssRenamingMap"}, new String[]{"<sample:8>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "parse", "com.google.javascript.jscomp.JSSourceFile", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown source) line (unknown line) : (unknown colu.., getWarningCount...#342#-1303714041", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "parseTestCode", new String[]{"java.lang.String"}, new String[]{"--1"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "<sample:3>", "<sample:2>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BLOCK [sourcename:  [testcode] ] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourcePosition=-1, getString=!U...#410#1095742470", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=3, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#191970200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile", "com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:6>", "<null>", "<sample:1>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "getDefaultErrorReporter", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "parse", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_IN...#343#1429407841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSource", new String[]{"com.google.javascript.jscomp.JSModule"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "initInputsByNameMap", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "hasHaltingErrors", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown source) line (unknown line) : (unknown colu.., getWarningCount...#342#-1303714041", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "isIdeMode", new String[]{}, new String[]{}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getExternsForTesting", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "optimize", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "initCompilerOptionsIfTesting", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getLifeCycleStage", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "acceptEcmaScript5", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "report", "com.google.javascript.jscomp.JSError", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#341#1851425975", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getGlobalVarReferences", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "<sample:1>", "<sample:3>", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=0, getErrors=[], getMessages=[], getWarningCount=0, getWarnings=[], hasErrors=false, isIdeMode=false, isTy...#224#1611524252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getNodeForCodeInsertion", new String[]{"com.google.javascript.jscomp.JSModule"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.Compiler", "getExternsForTesting", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getSourceMap", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "getTypedScopeCreator", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown source) line (unknown line) : (unknown colu.., getWarningCount...#342#-1303714041", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "parseInputs", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_IN...#343#1429407841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getResult", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "reportCodeChange", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Compiler", "initOptions", "com.google.javascript.jscomp.CompilerOptions", "<sample:9>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[], getMessages=[], getWarningCount=0, getWarnings=[], hasErrors=false, isIdeMode=false, isTypeCheckingEnabled=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:2>", "<sample:1>", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getPassConfig", ""}, {"com.google.javascript.jscomp.Compiler", "createPassConfigInternal", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=3, getErrors=[JSC_DUPLICATE_EXTERN_INPUT. Duplicate extern input: a at (u.., getMessages=[JSC_DUPLICATE_EXTERN_INPUT. Duplicate extern input: a at (u.., getWarningCount...#281#-1383274548", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "endPass", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "setState", "com.google.javascript.jscomp.Compiler$IntermediateState", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "init", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSModule[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:2>", "<null>", "<sample:8>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "initOptions", new String[]{"com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.Compiler", "isTypeCheckingEnabled", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[], getMessages=[], getWarningCount=0, getWarnings=[], hasErrors=false, isIdeMode=false, isTypeCheckingEnabled=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "computeCFG", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "recordFunctionInformation", ""}, {"com.google.javascript.jscomp.Compiler", "getDefaultErrorReporter", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSourceArray", new String[]{"com.google.javascript.jscomp.JSModule"}, new String[]{"<sample:4>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown source) line (unknown line) : (unknown colu.., getWarningCount...#342#-1303714041", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getRoot", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=!NullPointerException, getErrors=!NullPointerException, getMessages=!NullPointerException, getWarningCount=!NullPointerException, getWarnings=!NullPointerException, has...#307#49963817", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile", "com.google.javascript.jscomp.JSSourceFile", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:2>", "<sample:0>", "<sample:2>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "getFunctionalInformationMap", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown ...#404#1789648253", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "parseTestCode", new String[]{"java.lang.String"}, new String[]{"1.5f1e1"}, false, 1, new String[][]{}), new String[][]{{"isLocalResultCall", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown source) line (unknown line) : (unknown colu.., getWarningCount...#342#-1303714041", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getWarningCount", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "parseSyntheticCode", new String[]{"java.lang.String"}, new String[]{"20200"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BLOCK [sourcename:  [synthetic] ] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourcePosition=-1, getString=!...#411#916135486", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "initCompilerOptionsIfTesting", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown source) line (unknown line) : (unknown colu.., getWarningCount...#342#-1303714041", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "stopTracer", new String[]{"com.google.javascript.jscomp.Tracer", "java.lang.String"}, new String[]{"<sample:0>", "<1.5null"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "parseInputs", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.Compiler", "areNodesEqualForInlining", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:10>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSourceArray", new String[]{"com.google.javascript.jscomp.JSModule"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSource", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:10>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.Compiler", "removeInput", "java.lang.String", "_ukl"}, {"com.google.javascript.jscomp.Compiler", "getLifeCycleStage", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"<a><b>t</b></a>\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compileModules", new String[]{"java.util.List", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:5>", "<null>", "<sample:7>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.Compiler", "removeChangeHandler", "com.google.javascript.jscomp.CodeChangeHandler", "<sample:5>"}, {"com.google.javascript.jscomp.Compiler", "setState", "com.google.javascript.jscomp.Compiler$IntermediateState", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "removeInput", new String[]{"java.lang.String"}, new String[]{"Tjtle"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown source) line (unknown line) : (unknown colu.., getWarningCount...#342#-1303714041", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSource", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.Compiler", "check", ""}, {"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "<sample:2>", "<sample:1>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile", "com.google.javascript.jscomp.JSModule[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:1>", "<sample:3>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getDefaultErrorReporter", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getInputsForTesting", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "setLifeCycleStage", "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage", "<sample:8>"}, {"com.google.javascript.jscomp.Compiler", "init", "com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "<sample:5>", "<sample:4>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=3, getErrors=[JSC_DUPLICATE_EXTERN_INPUT. Duplicate extern input: <a><b>t.., getMessages=[JSC_DUPLICATE_EXTERN_INPUT. Duplicate extern input: <a><b>t.., getWarningCount...#281#2044585152", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getWarnings", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("[Lcom.google.javascript.jscomp.JSError;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSourceArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.CompilerOptions", "<sample:6>", "<sample:10>", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSource", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.Compiler", "toSource", "com.google.javascript.jscomp.JSModule", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "acceptEcmaScript5", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "<sample:0>", "<sample:1>", "<sample:10>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=1, getErrors=[JSC_EMPTY_ROOT_MODULE_ERROR. Root module {0} must contain a.., getMessages=[JSC_EMPTY_ROOT_MODULE_ERROR. Root module {0} must contain a.., getWarningCount...#281#1479895548", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getPassConfig", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.Compiler", "getGlobalVarReferences", ""}, {"com.google.javascript.jscomp.Compiler", "startPass", "java.lang.String", "000"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.DefaultPassConfig", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "updateGlobalVarReferences", new String[]{"java.util.Map", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<sample:4>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "endPass", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "normalize", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown source) line (unknown line) : (unknown colu.., getWarningCount...#342#-1303714041", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "createPassConfigInternal", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.DefaultPassConfig", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown source) line (unknown line) : (unknown colu.., getWarningCount...#342#-1303714041", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:3>", "<sample:3>", "<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=3, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: <a><b>t</b></a> at (u.., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: <a><b>t</b></a> at (u.., getWarningCount...#281#-1059422024", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile", "com.google.javascript.jscomp.JSSourceFile", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:1>", "<sample:2>", "<null>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.Compiler", "stripCode", "java.util.Set,java.util.Set,java.util.Set,java.util.Set", "<sample:1>", "<sample:1>", "<sample:0>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "stopTracer", new String[]{"com.google.javascript.jscomp.Tracer", "java.lang.String"}, new String[]{"<sample:5>", "abctoSource"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "rebuildInputsFromModules", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown source) line (unknown line) : (unknown colu.., getWarningCount...#342#-1303714041", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getSourceRegion", new String[]{"java.lang.String", "int"}, new String[]{"null2147482648", "-1"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "getModuleGraph", ""}, {"com.google.javascript.jscomp.Compiler", "parse", "com.google.javascript.jscomp.JSSourceFile", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown source) line (unknown line) : (unknown colu.., getWarningCount...#342#-1303714041", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "newExternInput", new String[]{"java.lang.String"}, new String[]{"removeTryCatchFinaHlly"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "getMessages", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile", "com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:5>", "<sample:4>", "<sample:10>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.Compiler", "computeCFG", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=1, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#419191190", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSourceArray", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "toSource", "com.google.javascript.rhino.Node", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown source) line (unknown line) : (unknown colu.., getWarningCount...#342#-1303714041", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getUniqueNameIdSupplier", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "setHasRegExpGlobalReferences", "boolean", "true"}, {"com.google.javascript.jscomp.Compiler", "getOptions", ""}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "reportCodeChange", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.Compiler", "setLifeCycleStage", "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=!NullPointerException, getErrors=!NullPointerException, getMessages=!NullPointerException, getWarningCount=!NullPointerException, getWarnings=!NullPointerException, has...#307#49963817", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "stopTracer", new String[]{"com.google.javascript.jscomp.Tracer", "java.lang.String"}, new String[]{"<sample:4>", "urue2020-02-30T25:61:61"}, false, 3, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "<sample:7>", "<sample:5>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:9>", "<sample:3>", "<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getDefaultErrorReporter", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getSourceRegion", new String[]{"java.lang.String", "int"}, new String[]{"202-01-01", "1"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "addToDebugLog", "java.lang.String", "129:30:45"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "check", new String[]{}, new String[]{}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getExternsForTesting", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"clear", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown source) line (unknown line) : (unknown colu.., getWarningCount...#342#-1303714041", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "runCallableWithLargeStack", new String[]{"java.util.concurrent.Callable"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "init", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSModule[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:1>", "<sample:1>", "<sample:12>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "removeInput", "java.lang.String", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=3, getErrors=[JSC_DUPLICATE_EXTERN_INPUT. Duplicate extern input: a at (u.., getMessages=[JSC_DUPLICATE_EXTERN_INPUT. Duplicate extern input: a at (u.., getWarningCount...#281#-1383274548", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "createPassConfigInternal", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.DefaultPassConfig", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getWarningCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "setPassConfig", "com.google.javascript.jscomp.PassConfig", "<sample:8>"}, {"com.google.javascript.jscomp.Compiler", "processDefines", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown source) line (unknown line) : (unknown colu.., getWarningCount...#342#-1303714041", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "init", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSModule[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:4>", "<empty>", "<sample:6>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "getCodingConvention", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown source) line (unknown line) : (unknown colu.., getWarningCount...#342#-1303714041", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getRoot", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown source) line (unknown line) : (unknown colu.., getWarningCount...#342#-1303714041", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "report", new String[]{"com.google.javascript.jscomp.JSError"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getVariableMap", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "runCallable", new String[]{"java.util.concurrent.Callable", "boolean", "boolean"}, new String[]{"<sample:7>", "false", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "setCssRenamingMap", new String[]{"com.google.javascript.jscomp.CssRenamingMap"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "<sample:3>", "<empty>", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=3, getErrors=[JSC_EMPTY_MODULE_LIST_ERROR. At least one module must be pr.., getMessages=[JSC_EMPTY_MODULE_LIST_ERROR. At least one module must be pr.., getWarningCount...#281#-1134956750", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "resetUniqueNameId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "throwInternalError", "java.lang.String,java.lang.Exception", "2020-01-01", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "removeInput", new String[]{"java.lang.String"}, new String[]{"removeTryatchFinally"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "languageMode", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.CompilerOptions$LanguageMode", actual.getClass().getName());
  assertEquals("ECMASCRIPT3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSourceArray", new String[]{"com.google.javascript.jscomp.JSModule"}, new String[]{"<sample:5>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "setState", new String[]{"com.google.javascript.jscomp.Compiler$IntermediateState"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getModuleGraph", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile", "com.google.javascript.jscomp.JSModule[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:3>", "<sample:1>", "<sample:9>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "addToDebugLog", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSModule[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:1>", "<sample:3>", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getPassConfig", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=3, getErrors=[JSC_DUPLICATE_EXTERN_INPUT. Duplicate extern input: a at (u.., getMessages=[JSC_DUPLICATE_EXTERN_INPUT. Duplicate extern input: a at (u.., getWarningCount...#281#-1383274548", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile", "com.google.javascript.jscomp.JSSourceFile", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:4>", "<sample:4>", "<sample:8>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.Compiler", "removeInput", "java.lang.String", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=3, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: <a><b>t</b></a> at (u.., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: <a><b>t</b></a> at (u.., getWarningCount...#281#-1059422024", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSourceArray", new String[]{"com.google.javascript.jscomp.JSModule"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "updateGlobalVarReferences", "java.util.Map,com.google.javascript.rhino.Node", "<sample:1>", "<sample:4>"}, {"com.google.javascript.jscomp.Compiler", "getMessages", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getErrorCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "processDefines", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown source) line (unknown line) : (unknown colu.., getWarningCount...#342#-1303714041", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getUniqueNameIdSupplier", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "addChangeHandler", "com.google.javascript.jscomp.CodeChangeHandler", "<sample:2>"}, {"com.google.javascript.jscomp.Compiler", "createPassConfigInternal", ""}}, 1);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getTypeValidator", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "initOptions", "com.google.javascript.jscomp.CompilerOptions", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.TypeValidator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown source) line (unknown line) : (unknown colu.., getWarningCount...#342#-1303714041", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSourceArray", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown source) line (unknown line) : (unknown colu.., getWarningCount...#342#-1303714041", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "addToDebugLog", new String[]{"java.lang.String"}, new String[]{"-1.5I"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown source) line (unknown line) : (unknown colu.., getWarningCount...#342#-1303714041", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "parseTestCode", new String[]{"java.lang.String"}, new String[]{"-"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getWarnings", ""}, {"com.google.javascript.jscomp.Compiler", "getLifeCycleStage", ""}}), new String[][]{{"getProp", "int", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=3, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#191970200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSourceArray", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.Compiler", "stripCode", "java.util.Set,java.util.Set,java.util.Set,java.util.Set", "<null>", "<sample:0>", "<empty>", "<sample:0>"}, {"com.google.javascript.jscomp.Compiler", "getInputsInOrder", ""}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "runCallableWithLargeStack", new String[]{"java.util.concurrent.Callable"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getInput", new String[]{"java.lang.String"}, new String[]{"0xFGFFFFFF"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown source) line (unknown line) : (unknown colu.., getWarningCount...#342#-1303714041", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getPropertyMap", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "init", "com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.CompilerOptions", "<sample:3>", "<sample:2>", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=3, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: <a><b>t</b></a> at (u.., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: <a><b>t</b></a> at (u.., getWarningCount...#281#-1059422024", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getMessages", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lcom.google.javascript.jscomp.JSError;", actual.getClass().getName());
  assertEquals("[. a at (unknown source) line (unknown line) : (unknown column), . a at (unknown source) line (unknown line) : (unknown column), . a at (unknown source) line (unknown line) : (unknown column)]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown source) line (unknown line) : (unknown colu.., getWarningCount...#342#-1303714041", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "removeInput", new String[]{"java.lang.String"}, new String[]{"1.1234567890123456010"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "hasHaltingErrors", ""}, {"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "<sample:5>", "<sample:2>", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown ...#404#1789648253", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "newTracer", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "init", "java.util.List,java.util.List,com.google.javascript.jscomp.CompilerOptions", "<sample:5>", "<sample:3>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Tracer", actual.getClass().getName());
  assertEquals("[Compiler] ", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getInputsForTesting", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"get", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "parseSyntheticCode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0", "-0.0"}, false, 5, new String[][]{}), new String[][]{{"clonePropsFrom", "com.google.javascript.rhino.Node", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "setCssRenamingMap", new String[]{"com.google.javascript.jscomp.CssRenamingMap"}, new String[]{"<sample:6>"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown source) line (unknown line) : (unknown colu.., getWarningCount...#342#-1303714041", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "parseTestCode", new String[]{"java.lang.String"}, new String[]{"tanityCCeck"}, false), new String[][]{{"getAncestors", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$AncestorIterable", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getReverseAbstractInterpreter", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SemanticReverseAbstractInterpreter", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "hasHaltingErrors", new String[]{}, new String[]{}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
}
