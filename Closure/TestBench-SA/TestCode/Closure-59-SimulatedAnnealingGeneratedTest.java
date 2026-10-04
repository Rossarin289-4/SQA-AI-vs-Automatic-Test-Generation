package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "reportCodeChange", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.CompilerOptions", "<sample:0>", "<sample:0>", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown ...#404#1789648253", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "reportCodeChange", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.CompilerOptions", "<sample:8>", "<sample:1>", "<sample:7>"}, {"com.google.javascript.jscomp.Compiler", "languageMode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown ...#404#1789648253", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "runCallable", new String[]{"java.util.concurrent.Callable", "boolean", "boolean"}, new String[]{"<empty>", "true", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "acceptEcmaScript5", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.Compiler", "removeChangeHandler", "com.google.javascript.jscomp.CodeChangeHandler", "<sample:3>"}, {"com.google.javascript.jscomp.Compiler", "precheck", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "endPass", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "removeExternInput", new String[]{"java.lang.String"}, new String[]{"2147483648"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "startPass", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getRoot", ""}, {"com.google.javascript.jscomp.Compiler", "getWarningCount", ""}, {"com.google.javascript.jscomp.Compiler", "toSource", "com.google.javascript.jscomp.Compiler$CodeBuilder,int,com.google.javascript.rhino.Node", "<sample:4>", "-16384", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "startPass", new String[]{"java.lang.String"}, new String[]{"1.5f-9i1"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "parse", ""}, {"com.google.javascript.jscomp.Compiler", "getSourceLine", "java.lang.String,int", "Bad module input: ", "1048576"}, {"com.google.javascript.jscomp.Compiler", "toSource", "com.google.javascript.jscomp.Compiler$CodeBuilder,int,com.google.javascript.rhino.Node", "<sample:3>", "0", "<sample:12>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown ...#404#1789648253", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getTypeValidator", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.CompilerOptions", "<sample:7>", "<empty>", "<sample:0>"}, {"com.google.javascript.jscomp.Compiler", "getSourceRegion", "java.lang.String,int", "2020-01-01", "-32768"}, {"com.google.javascript.jscomp.Compiler", "processDefines", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.TypeValidator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=3, getErrors=[JSC_PARSE_ERROR. Parse error. missing ; before statement at.., getMessages=[JSC_PARSE_ERROR....#343#235199642", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "runCallableWithLargeStack", new String[]{"java.util.concurrent.Callable"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "parse", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getTopScope", ""}, {"com.google.javascript.jscomp.Compiler", "setState", "com.google.javascript.jscomp.Compiler$IntermediateState", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getTypeValidator", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Compiler", "toSource", "com.google.javascript.rhino.Node", "<sample:6>"}, {"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.CompilerOptions", "<sample:8>", "<empty>", "<sample:0>"}, {"com.google.javascript.jscomp.Compiler", "setState", "com.google.javascript.jscomp.Compiler$IntermediateState", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.TypeValidator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[], getMessages=[], getWarningCount=1, getWarnings=[JSC_NAME_REFERENCE_IN_EXTERNS. accessing name a in externs .., hasErrors=false, isIdeMode=false, isType...#222#-1028815026", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "setLoggingLevel", new String[]{"java.util.logging.Level"}, new String[]{"<sample:2>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getReverseAbstractInterpreter", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getReverseAbstractInterpreter", ""}}), new String[][]{{"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope,boolean", "7"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "runCallable", new String[]{"java.util.concurrent.Callable", "boolean", "boolean"}, new String[]{"<null>", "false", "true"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getFunctionalInformationMap", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.Compiler", "getInput", "java.lang.String", "1.12345678901234567"}, {"com.google.javascript.jscomp.Compiler", "stripCode", "java.util.Set,java.util.Set,java.util.Set,java.util.Set", "<sample:3>", "<sample:0>", "<sample:0>", "<empty>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "setCssRenamingMap", new String[]{"com.google.javascript.jscomp.CssRenamingMap"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.Compiler", "newExternInput", "java.lang.String", "a"}, {"com.google.javascript.jscomp.Compiler", "getFunctionalInformationMap", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "isIdeMode", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "addIncrementalSourceAst", "com.google.javascript.jscomp.JsAst", "<sample:4>"}, {"com.google.javascript.jscomp.Compiler", "hasRegExpGlobalReferences", ""}, {"com.google.javascript.jscomp.Compiler", "areNodesEqualForInlining", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown source) line (unknown line) : (unknown colu.., getWarningCount...#342#-1303714041", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getSourceMap", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.google.javascript.jscomp.Compiler", "toSource", ""}, {"com.google.javascript.jscomp.Compiler", "getLifeCycleStage", ""}, {"com.google.javascript.jscomp.Compiler", "getErrorManager", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile", "com.google.javascript.jscomp.JSModule[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:7>", "<sample:0>", "<sample:1>"}, false, 10, new String[][]{{"com.google.javascript.jscomp.Compiler", "getCssRenamingMap", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=3, getErrors=[JSC_PARSE_ERROR. Parse error. missing ; before statement at.., getMessages=[JSC_PARSE_ERROR....#343#235199642", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "updateGlobalVarReferences", new String[]{"java.util.Map", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "setPassConfig", "com.google.javascript.jscomp.PassConfig", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getTopScope", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "newExternInput", "java.lang.String", "0"}, {"com.google.javascript.jscomp.Compiler", "removeExternInput", "java.lang.String", "a"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=5, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#-35250790", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "areNodesEqualForInlining", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:6>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.Compiler", "toSource", "com.google.javascript.jscomp.Compiler$CodeBuilder,int,com.google.javascript.rhino.Node", "<sample:3>", "2147483647", "<sample:6>"}, {"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.CompilerOptions", "<sample:1>", "<empty>", "<sample:7>"}, {"com.google.javascript.jscomp.Compiler", "parseInputs", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=5, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_IN...#343#1088576356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSModule[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:2>", "<sample:0>", "<sample:2>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "reportCodeChange", ""}, {"com.google.javascript.jscomp.Compiler", "addIncrementalSourceAst", "com.google.javascript.jscomp.JsAst", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSModule[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:2>", "<sample:0>", "<sample:11>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "parseInputs", ""}, {"com.google.javascript.jscomp.Compiler", "removeTryCatchFinally", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getReverseAbstractInterpreter", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.CompilerOptions", "<sample:3>", "<sample:6>", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SemanticReverseAbstractInterpreter", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=1, getErrors=[JSC_READ_ERROR. Cannot read: <a><b>t</b></a> at (unknown so.., getMessages=[JSC_READ_ERROR. ...#343#1200699148", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "setHasRegExpGlobalReferences", new String[]{"boolean"}, new String[]{"true"}, false, 7, new String[][]{{"com.google.javascript.jscomp.Compiler", "getCssRenamingMap", ""}, {"com.google.javascript.jscomp.Compiler", "setCssRenamingMap", "com.google.javascript.jscomp.CssRenamingMap", "<sample:6>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getSourceRegion", new String[]{"java.lang.String", "int"}, new String[]{"[", "1048576"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "getVariableMap", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown source) line (unknown line) : (unknown colu.., getWarningCount...#342#-1303714041", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "replaceIncrementalSourceAst", new String[]{"com.google.javascript.jscomp.JsAst"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "toSource", "com.google.javascript.jscomp.Compiler$CodeBuilder,int,com.google.javascript.rhino.Node", "<sample:1>", "0", "<sample:1>"}, {"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.CompilerOptions", "<sample:10>", "<sample:8>", "<sample:4>"}, {"com.google.javascript.jscomp.Compiler", "getPropertyMap", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown ...#404#1789648253", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "replaceIncrementalSourceAst", new String[]{"com.google.javascript.jscomp.JsAst"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "toSource", "com.google.javascript.jscomp.Compiler$CodeBuilder,int,com.google.javascript.rhino.Node", "<sample:7>", "1048576", "<sample:0>"}, {"com.google.javascript.jscomp.Compiler", "throwInternalError", "java.lang.String,java.lang.Exception", "1E-5", "<sample:1>"}, {"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.CompilerOptions", "<sample:2>", "<sample:8>", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown ...#404#1789648253", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getInputsForTesting", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.Compiler", "getGlobalVarReferences", ""}, {"com.google.javascript.jscomp.Compiler", "getOptions", ""}}), new String[][]{{"retainAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getUniqueNameIdSupplier", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.google.javascript.jscomp.Compiler", "getReverseAbstractInterpreter", ""}, {"com.google.javascript.jscomp.Compiler", "recordFunctionInformation", ""}, {"com.google.javascript.jscomp.Compiler", "recordFunctionInformation", ""}}), new String[][]{{"get", "", "7"}, {"get", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getUniqueNameIdSupplier", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Compiler", "getExternsForTesting", ""}, {"com.google.javascript.jscomp.Compiler", "parseSyntheticCode", "java.lang.String,java.lang.String", "i", "1.12345678"}, {"com.google.javascript.jscomp.Compiler", "getNodeForCodeInsertion", "com.google.javascript.jscomp.JSModule", "<sample:1>"}}), new String[][]{{"get", "", "1"}, {"get", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[], getMessages=[], getWarningCount=0, getWarnings=[], hasErrors=false, isIdeMode=false, isTypeCheckingEnabled=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSource", new String[]{"com.google.javascript.jscomp.JSModule"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getExternsInOrder", ""}, {"com.google.javascript.jscomp.Compiler", "disableThreads", ""}, {"com.google.javascript.jscomp.Compiler", "isInliningForbidden", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "parseSyntheticCode", new String[]{"java.lang.String"}, new String[]{"010"}, false, 6, new String[][]{{"com.google.javascript.jscomp.Compiler", "parseTestCode", "java.lang.String", "0xFFFFFFF"}, {"com.google.javascript.jscomp.Compiler", "processDefines", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT 1 [synthetic: 1] [source_file:  [synthetic] ] {getCharno=0, getChildCount=1, getDouble=!UnsupportedOperationException, getLength=0, getLineno=1, getQualifiedName=null, getSideEffectFlags=0, get...#414#11099481", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[], getMessages=[], getWarningCount=0, getWarnings=[], hasErrors=false, isIdeMode=false, isTypeCheckingEnabled=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSourceArray", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.google.javascript.jscomp.Compiler", "resetUniqueNameId", ""}, {"com.google.javascript.jscomp.Compiler", "compile", "java.util.List,java.util.List,com.google.javascript.jscomp.CompilerOptions", "<sample:1>", "<empty>", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSourceArray", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.google.javascript.jscomp.Compiler", "report", "com.google.javascript.jscomp.JSError", "<sample:6>"}, {"com.google.javascript.jscomp.Compiler", "stopTracer", "com.google.javascript.jscomp.Tracer,java.lang.String", "<sample:3>", "%ello, World"}, {"com.google.javascript.jscomp.Compiler", "compile", "java.util.List,java.util.List,com.google.javascript.jscomp.CompilerOptions", "<empty>", "<empty>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=0, getErrors=[], getMessages=[], getWarningCount=0, getWarnings=[], hasErrors=false, isIdeMode=false, isTy...#224#1611524252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSourceArray", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "java.util.List,java.util.List,com.google.javascript.jscomp.CompilerOptions", "<empty>", "<empty>", "<sample:1>"}, {"com.google.javascript.jscomp.Compiler", "parse", ""}, {"com.google.javascript.jscomp.Compiler", "recordFunctionInformation", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=0, getErrors=[], getMessages=[], getWarningCount=0, getWarnings=[], hasErrors=false, isIdeMode=false, isTy...#224#1611524252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getErrorManager", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getDefaultErrorReporter", ""}, {"com.google.javascript.jscomp.Compiler", "throwInternalError", "java.lang.String,java.lang.Exception", "2020-01-01", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.LoggerErrorManager", actual.getClass().getName());
  assertEquals("{getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getTypedPercent=0.0, getWarningCount=0, getWarnings=[]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile", "com.google.javascript.jscomp.JSModule[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:10>", "<empty>", "<sample:11>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "toSourceArray", "com.google.javascript.jscomp.JSModule", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=3, getErrors=[JSC_EMPTY_MODULE_LIST_ERROR. At least one module must be pr.., getMessages=[JSC_EMPTY_MODULE_LIST_ERROR. At least one module must be pr.., getWarningCount...#281#-1134956750", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "precheck", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.google.javascript.jscomp.Compiler", "ensureDefaultPassConfig", ""}, {"com.google.javascript.jscomp.Compiler", "setPassConfig", "com.google.javascript.jscomp.PassConfig", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getTypeValidator", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getTypeValidator", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.TypeValidator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getNodeForCodeInsertion", new String[]{"com.google.javascript.jscomp.JSModule"}, new String[]{"<sample:0>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "reportCodeChange", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "buildKnownSymbolTable", ""}, {"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.CompilerOptions", "<sample:11>", "<sample:6>", "<sample:7>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown ...#404#1789648253", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "reportCodeChange", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.Compiler", "buildKnownSymbolTable", ""}, {"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.CompilerOptions", "<sample:11>", "<sample:6>", "<sample:7>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "reportCodeChange", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Compiler", "buildKnownSymbolTable", ""}, {"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.CompilerOptions", "<sample:11>", "<sample:6>", "<sample:7>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=3, getErrors=[JSC_PARSE_ERROR. Parse error. il manque ';' avant une instr.., getMessages=[JSC_PARSE_ERROR....#343#47994640", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "reportCodeChange", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Compiler", "buildKnownSymbolTable", ""}, {"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.CompilerOptions", "<sample:11>", "<null>", "<sample:7>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=!NullPointerException, getErrors=!NullPointerException, getMessages=!NullPointerException, getWarningCount=!NullPointerException, getWarnings=!NullPointerException, has...#307#49963817", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getParserConfig", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "rebuildInputsFromModules", ""}, {"com.google.javascript.jscomp.Compiler", "getErrorLevel", "com.google.javascript.jscomp.JSError", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.parsing.Config", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "reportCodeChange", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.google.javascript.jscomp.Compiler", "removeChangeHandler", "com.google.javascript.jscomp.CodeChangeHandler", "<sample:7>"}, {"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.CompilerOptions", "<sample:11>", "<sample:6>", "<sample:3>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=3, getErrors=[JSC_PARSE_ERROR. Parse error. missing ; before statement at.., getMessages=[JSC_PARSE_ERROR....#343#235199642", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "reportCodeChange", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.google.javascript.jscomp.Compiler", "removeChangeHandler", "com.google.javascript.jscomp.CodeChangeHandler", "<sample:7>"}, {"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.CompilerOptions", "<sample:0>", "<sample:6>", "<sample:3>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "reportCodeChange", new String[]{}, new String[]{}, false, 10, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=!NullPointerException, getErrors=!NullPointerException, getMessages=!NullPointerException, getWarningCount=!NullPointerException, getWarnings=!NullPointerException, has...#307#49963817", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "reportCodeChange", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.google.javascript.jscomp.Compiler", "getErrorManager", ""}, {"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.CompilerOptions", "<sample:0>", "<sample:6>", "<sample:5>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "addChangeHandler", new String[]{"com.google.javascript.jscomp.CodeChangeHandler"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "getErrorManager", ""}, {"com.google.javascript.jscomp.Compiler", "getGlobalVarReferences", ""}, {"com.google.javascript.jscomp.Compiler", "toSourceArray", "com.google.javascript.jscomp.JSModule", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown source) line (unknown line) : (unknown colu.., getWarningCount...#342#-1303714041", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "startPass", new String[]{"java.lang.String"}, new String[]{"0xWFIFFFF"}, false, 3, new String[][]{{"com.google.javascript.jscomp.Compiler", "getModuleGraph", ""}, {"com.google.javascript.jscomp.Compiler", "toSource", "com.google.javascript.jscomp.Compiler$CodeBuilder,int,com.google.javascript.rhino.Node", "<sample:6>", "-16384", "<sample:6>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "startPass", new String[]{"java.lang.String"}, new String[]{""}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "addIncrementalSourceAst", "com.google.javascript.jscomp.JsAst", "<sample:1>"}, {"com.google.javascript.jscomp.Compiler", "parse", ""}, {"com.google.javascript.jscomp.Compiler", "toSource", "com.google.javascript.jscomp.Compiler$CodeBuilder,int,com.google.javascript.rhino.Node", "<sample:4>", "-32768", "<sample:9>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown ...#404#1789648253", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "startPass", new String[]{"java.lang.String"}, new String[]{"1.5d"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "addIncrementalSourceAst", "com.google.javascript.jscomp.JsAst", "<sample:1>"}, {"com.google.javascript.jscomp.Compiler", "toSource", "com.google.javascript.jscomp.Compiler$CodeBuilder,int,com.google.javascript.rhino.Node", "<sample:7>", "-32768", "<sample:9>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown source) line (unknown line) : (unknown colu.., getWarningCount...#342#-1303714041", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "startPass", new String[]{"java.lang.String"}, new String[]{"1.5d"}, false, 12, new String[][]{{"com.google.javascript.jscomp.Compiler", "addIncrementalSourceAst", "com.google.javascript.jscomp.JsAst", "<sample:1>"}, {"com.google.javascript.jscomp.Compiler", "parse", ""}, {"com.google.javascript.jscomp.Compiler", "toSource", "com.google.javascript.jscomp.Compiler$CodeBuilder,int,com.google.javascript.rhino.Node", "<sample:7>", "-32768", "<sample:9>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "startPass", new String[]{"java.lang.String"}, new String[]{"1.5d"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "addIncrementalSourceAst", "com.google.javascript.jscomp.JsAst", "<sample:0>"}, {"com.google.javascript.jscomp.Compiler", "parse", ""}, {"com.google.javascript.jscomp.Compiler", "toSource", "com.google.javascript.jscomp.Compiler$CodeBuilder,int,com.google.javascript.rhino.Node", "<sample:7>", "-32768", "<sample:9>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_IN...#343#1429407841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "startPass", new String[]{"java.lang.String"}, new String[]{"15d"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "parse", ""}, {"com.google.javascript.jscomp.Compiler", "toSource", "com.google.javascript.jscomp.Compiler$CodeBuilder,int,com.google.javascript.rhino.Node", "<sample:7>", "-32768", "<sample:9>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown ...#404#1789648253", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "startPass", new String[]{"java.lang.String"}, new String[]{"15+"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "toSource", "com.google.javascript.jscomp.Compiler$CodeBuilder,int,com.google.javascript.rhino.Node", "<sample:7>", "-32768", "<sample:9>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown source) line (unknown line) : (unknown colu.., getWarningCount...#342#-1303714041", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "startPass", new String[]{"java.lang.String"}, new String[]{"5,"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "parse", ""}, {"com.google.javascript.jscomp.Compiler", "toSource", "com.google.javascript.jscomp.Compiler$CodeBuilder,int,com.google.javascript.rhino.Node", "<sample:7>", "-32768", "<sample:9>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_IN...#343#1429407841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "startPass", new String[]{"java.lang.String"}, new String[]{"5-!P"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "recordFunctionInformation", ""}, {"com.google.javascript.jscomp.Compiler", "parse", ""}, {"com.google.javascript.jscomp.Compiler", "toSource", "com.google.javascript.jscomp.Compiler$CodeBuilder,int,com.google.javascript.rhino.Node", "<sample:7>", "0", "<sample:9>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "startPass", new String[]{"java.lang.String"}, new String[]{"toSour8e"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "parse", ""}, {"com.google.javascript.jscomp.Compiler", "initInputsByNameMap", ""}, {"com.google.javascript.jscomp.Compiler", "toSource", "com.google.javascript.jscomp.Compiler$CodeBuilder,int,com.google.javascript.rhino.Node", "<sample:3>", "0", "<sample:12>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown ...#404#1789648253", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getExternsForTesting", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.Compiler", "disableThreads", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "endPass", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "initInputsByNameMap", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSourceArray", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.Compiler", "parse", ""}, {"com.google.javascript.jscomp.Compiler", "check", ""}, {"com.google.javascript.jscomp.Compiler", "acceptEcmaScript5", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_IN...#343#1429407841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSourceArray", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.Compiler", "parse", ""}, {"com.google.javascript.jscomp.Compiler", "check", ""}, {"com.google.javascript.jscomp.Compiler", "acceptEcmaScript5", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_IN...#343#1429407841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSourceArray", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.google.javascript.jscomp.Compiler", "parse", ""}, {"com.google.javascript.jscomp.Compiler", "check", ""}, {"com.google.javascript.jscomp.Compiler", "acceptEcmaScript5", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSourceArray", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.Compiler", "check", ""}, {"com.google.javascript.jscomp.Compiler", "acceptEcmaScript5", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSourceArray", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.Compiler", "parse", ""}, {"com.google.javascript.jscomp.Compiler", "getSourceMap", ""}, {"com.google.javascript.jscomp.Compiler", "check", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_IN...#343#1429407841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getState", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.Compiler", "endPass", ""}, {"com.google.javascript.jscomp.Compiler", "parseSyntheticCode", "java.lang.String,java.lang.String", "-1", "-1"}, {"com.google.javascript.jscomp.Compiler", "hasHaltingErrors", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Compiler$IntermediateState", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getState", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.Compiler", "endPass", ""}, {"com.google.javascript.jscomp.Compiler", "parseSyntheticCode", "java.lang.String,java.lang.String", "-1", "]"}, {"com.google.javascript.jscomp.Compiler", "hasHaltingErrors", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Compiler$IntermediateState", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=3, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#191970200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getReverseAbstractInterpreter", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "addToDebugLog", "java.lang.String", "geneqateReport"}, {"com.google.javascript.jscomp.Compiler", "recordFunctionInformation", ""}}, 1), new String[][]{{"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope,boolean", "6"}, {"getParentScope", "", "4"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown source) line (unknown line) : (unknown colu.., getWarningCount...#342#-1303714041", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "replaceIncrementalSourceAst", new String[]{"com.google.javascript.jscomp.JsAst"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.Compiler", "compileModules", "java.util.List,java.util.List,com.google.javascript.jscomp.CompilerOptions", "<sample:1>", "<empty>", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "replaceIncrementalSourceAst", new String[]{"com.google.javascript.jscomp.JsAst"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "compileModules", "java.util.List,java.util.List,com.google.javascript.jscomp.CompilerOptions", "<sample:1>", "<empty>", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "replaceIncrementalSourceAst", new String[]{"com.google.javascript.jscomp.JsAst"}, new String[]{"<sample:7>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.Compiler", "setState", "com.google.javascript.jscomp.Compiler$IntermediateState", "<null>"}, {"com.google.javascript.jscomp.Compiler", "parse", "com.google.javascript.jscomp.JSSourceFile", "<sample:1>"}, {"com.google.javascript.jscomp.Compiler", "compileModules", "java.util.List,java.util.List,com.google.javascript.jscomp.CompilerOptions", "<sample:0>", "<empty>", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getCssRenamingMap", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.Compiler", "addToDebugLog", "java.lang.String", "1.5f-9i1"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getCssRenamingMap", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Compiler", "addToDebugLog", "java.lang.String", "1.5f-9i1"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getState", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "getErrorLevel", "com.google.javascript.jscomp.JSError", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Compiler$IntermediateState", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown source) line (unknown line) : (unknown colu.., getWarningCount...#342#-1303714041", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getState", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "getErrorLevel", "com.google.javascript.jscomp.JSError", "<sample:6>"}, {"com.google.javascript.jscomp.Compiler", "getInputsInOrder", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Compiler$IntermediateState", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown source) line (unknown line) : (unknown colu.., getWarningCount...#342#-1303714041", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getState", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Compiler", "getErrorLevel", "com.google.javascript.jscomp.JSError", "<sample:2>"}, {"com.google.javascript.jscomp.Compiler", "getInputsInOrder", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Compiler$IntermediateState", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=!NullPointerException, getErrors=!NullPointerException, getMessages=!NullPointerException, getWarningCount=!NullPointerException, getWarnings=!NullPointerException, has...#307#49963817", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getState", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Compiler", "initCompilerOptionsIfTesting", ""}, {"com.google.javascript.jscomp.Compiler", "getInputsInOrder", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Compiler$IntermediateState", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[], getMessages=[], getWarningCount=0, getWarnings=[], hasErrors=false, isIdeMode=false, isTypeCheckingEnabled=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getTypeValidator", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.TypeValidator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getTypeValidator", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.CompilerOptions", "<null>", "<empty>", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.TypeValidator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[], getMessages=[], getWarningCount=0, getWarnings=[], hasErrors=false, isIdeMode=false, isTypeCheckingEnabled=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getTypeValidator", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.CompilerOptions", "<sample:7>", "<empty>", "<sample:0>"}, {"com.google.javascript.jscomp.Compiler", "init", "com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.CompilerOptions", "<sample:0>", "<empty>", "<sample:1>"}, {"com.google.javascript.jscomp.Compiler", "processDefines", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.TypeValidator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=3, getErrors=[JSC_PARSE_ERROR. Parse error. missing ; before statement at.., getMessages=[JSC_PARSE_ERROR....#343#235199642", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getTypeValidator", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.CompilerOptions", "<sample:7>", "<empty>", "<sample:0>"}, {"com.google.javascript.jscomp.Compiler", "processDefines", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.TypeValidator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=3, getErrors=[JSC_PARSE_ERROR. Parse error. missing ; before statement at.., getMessages=[JSC_PARSE_ERROR....#343#235199642", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getTypeValidator", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.CompilerOptions", "<sample:7>", "<empty>", "<sample:0>"}, {"com.google.javascript.jscomp.Compiler", "processDefines", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.TypeValidator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=3, getErrors=[JSC_PARSE_ERROR. Parse error. il manque ';' avant une instr.., getMessages=[JSC_PARSE_ERROR....#343#47994640", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getTypeValidator", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Compiler", "processDefines", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getTypeValidator", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.CompilerOptions", "<sample:7>", "<sample:2>", "<sample:0>"}, {"com.google.javascript.jscomp.Compiler", "processDefines", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.TypeValidator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=1, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#419191190", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getTypeValidator", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.CompilerOptions", "<sample:8>", "<empty>", "<sample:0>"}, {"com.google.javascript.jscomp.Compiler", "setState", "com.google.javascript.jscomp.Compiler$IntermediateState", "<sample:5>"}, {"com.google.javascript.jscomp.Compiler", "processDefines", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.TypeValidator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[], getMessages=[], getWarningCount=1, getWarnings=[JSC_NAME_REFERENCE_IN_EXTERNS. accessing name a in externs .., hasErrors=false, isIdeMode=false, isType...#222#-1028815026", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getTypeValidator", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.CompilerOptions", "<sample:8>", "<empty>", "<sample:0>"}, {"com.google.javascript.jscomp.Compiler", "setState", "com.google.javascript.jscomp.Compiler$IntermediateState", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.TypeValidator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getTypeValidator", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Compiler", "toSource", "com.google.javascript.rhino.Node", "<sample:2>"}, {"com.google.javascript.jscomp.Compiler", "setState", "com.google.javascript.jscomp.Compiler$IntermediateState", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.TypeValidator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[], getMessages=[], getWarningCount=0, getWarnings=[], hasErrors=false, isIdeMode=false, isTypeCheckingEnabled=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getTypeValidator", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Compiler", "toSource", "com.google.javascript.rhino.Node", "<sample:2>"}, {"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.CompilerOptions", "<sample:9>", "<empty>", "<sample:0>"}, {"com.google.javascript.jscomp.Compiler", "setState", "com.google.javascript.jscomp.Compiler$IntermediateState", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.TypeValidator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=3, getErrors=[JSC_PARSE_ERROR. Parse error. il manque ';' avant une instr.., getMessages=[JSC_PARSE_ERROR. Parse error. il manque ';' avant une instr.., getWarningCount...#281#-1075832506", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getTypeValidator", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.Compiler", "toSource", "com.google.javascript.rhino.Node", "<sample:0>"}, {"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.CompilerOptions", "<sample:8>", "<empty>", "<sample:9>"}, {"com.google.javascript.jscomp.Compiler", "setState", "com.google.javascript.jscomp.Compiler$IntermediateState", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.TypeValidator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[], getMessages=[], getWarningCount=1, getWarnings=[JSC_NAME_REFERENCE_IN_EXTERNS. accessing name a in externs .., hasErrors=false, isIdeMode=false, isType...#222#-1028815026", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getTypeValidator", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.Compiler", "toSource", "com.google.javascript.rhino.Node", "<sample:7>"}, {"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.CompilerOptions", "<sample:8>", "<empty>", "<sample:9>"}, {"com.google.javascript.jscomp.Compiler", "setState", "com.google.javascript.jscomp.Compiler$IntermediateState", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.TypeValidator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[], getMessages=[], getWarningCount=1, getWarnings=[JSC_NAME_REFERENCE_IN_EXTERNS. accessing name a in externs .., hasErrors=false, isIdeMode=false, isType...#222#-1028815026", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getTypeValidator", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "toSource", "com.google.javascript.rhino.Node", "<sample:10>"}, {"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.CompilerOptions", "<sample:8>", "<empty>", "<sample:3>"}, {"com.google.javascript.jscomp.Compiler", "getReverseAbstractInterpreter", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.TypeValidator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown ...#404#1789648253", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getTypeValidator", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.Compiler", "toSource", "com.google.javascript.rhino.Node", "<sample:12>"}, {"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.CompilerOptions", "<sample:8>", "<empty>", "<sample:7>"}, {"com.google.javascript.jscomp.Compiler", "getReverseAbstractInterpreter", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.TypeValidator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "normalize", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getTypeValidator", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "toSource", "com.google.javascript.rhino.Node", "<sample:11>"}, {"com.google.javascript.jscomp.Compiler", "getReverseAbstractInterpreter", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.TypeValidator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown source) line (unknown line) : (unknown colu.., getWarningCount...#342#-1303714041", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "addChangeHandler", new String[]{"com.google.javascript.jscomp.CodeChangeHandler"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "setErrorManager", "com.google.javascript.jscomp.ErrorManager", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown source) line (unknown line) : (unknown colu.., getWarningCount...#342#-1303714041", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "report", new String[]{"com.google.javascript.jscomp.JSError"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "getCssRenamingMap", ""}, {"com.google.javascript.jscomp.Compiler", "toSource", "com.google.javascript.jscomp.JSModule", "<sample:7>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown source) line (unknown line) : (unknown colu.., getWarningCount...#342#-1303714041", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getErrors", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Lcom.google.javascript.jscomp.JSError;", actual.getClass().getName());
  assertEquals("[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source) line (unknown line) : (unknown column), JSC_EMPTY_ROOT_MODULE_ERROR. Root module {0} must contain at least one source code input at (unknow...#249#-1638554167", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "acceptEcmaScript5", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "newTracer", new String[]{"java.lang.String"}, new String[]{"-0.0"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Tracer", actual.getClass().getName());
  assertEquals("[Compiler] -0.0", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "stopTracer", new String[]{"com.google.javascript.jscomp.Tracer", "java.lang.String"}, new String[]{"<sample:6>", "stripCode"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "setCssRenamingMap", new String[]{"com.google.javascript.jscomp.CssRenamingMap"}, new String[]{"<null>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:2>", "<sample:0>", "<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "recordFunctionInformation", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=3, getErrors=[JSC_DUPLICATE_EXTERN_INPUT. Duplicate extern input: a at (u.., getMessages=[JSC_DUPLICATE_EXTERN_INPUT. Duplicate extern input: a at (u.., getWarningCount...#281#-1383274548", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "initModules", new String[]{"java.util.List", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:2>", "<sample:1>", "<sample:5>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "isTypeCheckingEnabled", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "updateGlobalVarReferences", "java.util.Map,com.google.javascript.rhino.Node", "<sample:0>", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "init", new String[]{"java.util.List", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<empty>", "<sample:0>", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.CompilerOptions", "<sample:11>", "<sample:7>", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSource", new String[]{"com.google.javascript.jscomp.JSModule"}, new String[]{"<sample:5>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "acceptConstKeyword", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "processDefines", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "init", new String[]{"java.util.List", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:2>", "<sample:0>", "<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getNodeForCodeInsertion", new String[]{"com.google.javascript.jscomp.JSModule"}, new String[]{"<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "reportCodeChange", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.CompilerOptions", "<sample:0>", "<sample:0>", "<sample:7>"}, {"com.google.javascript.jscomp.Compiler", "getAstDotGraph", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "reportCodeChange", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.CompilerOptions", "<sample:0>", "<sample:0>", "<sample:7>"}, {"com.google.javascript.jscomp.Compiler", "getAstDotGraph", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown ...#404#1789648253", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "reportCodeChange", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.CompilerOptions", "<sample:0>", "<sample:0>", "<sample:7>"}, {"com.google.javascript.jscomp.Compiler", "getAstDotGraph", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSource", new String[]{"com.google.javascript.jscomp.Compiler$CodeBuilder", "int", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "1048577", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "reportCodeChange", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.CompilerOptions", "<sample:8>", "<sample:1>", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown ...#404#1789648253", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "reportCodeChange", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown source) line (unknown line) : (unknown colu.., getWarningCount...#342#-1303714041", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "reportCodeChange", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "ensureDefaultPassConfig", ""}, {"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.CompilerOptions", "<sample:11>", "<sample:1>", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown ...#404#1789648253", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "reportCodeChange", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "buildKnownSymbolTable", ""}, {"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.CompilerOptions", "<sample:11>", "<sample:6>", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown ...#404#1789648253", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "reportCodeChange", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "buildKnownSymbolTable", ""}, {"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.CompilerOptions", "<sample:11>", "<sample:6>", "<sample:7>"}, {"com.google.javascript.jscomp.Compiler", "getExternsInOrder", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown ...#404#1789648253", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "rebuildInputsFromModules", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "getModuleGraph", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown source) line (unknown line) : (unknown colu.., getWarningCount...#342#-1303714041", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "acceptConstKeyword", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "java.util.List,java.util.List,com.google.javascript.jscomp.CompilerOptions", "<sample:1>", "<sample:2>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getInputsForTesting", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "addChangeHandler", new String[]{"com.google.javascript.jscomp.CodeChangeHandler"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getErrorManager", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "addChangeHandler", new String[]{"com.google.javascript.jscomp.CodeChangeHandler"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getErrorManager", ""}, {"com.google.javascript.jscomp.Compiler", "toSourceArray", "com.google.javascript.jscomp.JSModule", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "addChangeHandler", new String[]{"com.google.javascript.jscomp.CodeChangeHandler"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getErrorManager", ""}, {"com.google.javascript.jscomp.Compiler", "getGlobalVarReferences", ""}, {"com.google.javascript.jscomp.Compiler", "toSourceArray", "com.google.javascript.jscomp.JSModule", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "addChangeHandler", new String[]{"com.google.javascript.jscomp.CodeChangeHandler"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "getErrorManager", ""}, {"com.google.javascript.jscomp.Compiler", "getGlobalVarReferences", ""}, {"com.google.javascript.jscomp.Compiler", "toSourceArray", "com.google.javascript.jscomp.JSModule", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown source) line (unknown line) : (unknown colu.., getWarningCount...#342#-1303714041", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "startPass", new String[]{"java.lang.String"}, new String[]{"0x123456789"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "startPass", new String[]{"java.lang.String"}, new String[]{"0x123456789"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "setHasRegExpGlobalReferences", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "startPass", new String[]{"java.lang.String"}, new String[]{"0xu123456789"}, false, 7, new String[][]{{"com.google.javascript.jscomp.Compiler", "toSource", "com.google.javascript.jscomp.Compiler$CodeBuilder,int,com.google.javascript.rhino.Node", "<sample:5>", "0", "<sample:5>"}, {"com.google.javascript.jscomp.Compiler", "setState", "com.google.javascript.jscomp.Compiler$IntermediateState", "<null>"}, {"com.google.javascript.jscomp.Compiler", "setHasRegExpGlobalReferences", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "startPass", new String[]{"java.lang.String"}, new String[]{" "}, false, 7, new String[][]{{"com.google.javascript.jscomp.Compiler", "toSource", "com.google.javascript.jscomp.Compiler$CodeBuilder,int,com.google.javascript.rhino.Node", "<sample:5>", "0", "<sample:5>"}, {"com.google.javascript.jscomp.Compiler", "setState", "com.google.javascript.jscomp.Compiler$IntermediateState", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "startPass", new String[]{"java.lang.String"}, new String[]{" "}, false, 6, new String[][]{{"com.google.javascript.jscomp.Compiler", "toSource", "com.google.javascript.jscomp.Compiler$CodeBuilder,int,com.google.javascript.rhino.Node", "<sample:5>", "0", "<sample:5>"}, {"com.google.javascript.jscomp.Compiler", "setState", "com.google.javascript.jscomp.Compiler$IntermediateState", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "startPass", new String[]{"java.lang.String"}, new String[]{"e"}, false, 7, new String[][]{{"com.google.javascript.jscomp.Compiler", "toSource", "com.google.javascript.jscomp.Compiler$CodeBuilder,int,com.google.javascript.rhino.Node", "<sample:5>", "0", "<sample:5>"}, {"com.google.javascript.jscomp.Compiler", "setState", "com.google.javascript.jscomp.Compiler$IntermediateState", "<sample:0>"}, {"com.google.javascript.jscomp.Compiler", "toSource", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "startPass", new String[]{"java.lang.String"}, new String[]{"1-1.12345678901234560"}, false, 7, new String[][]{{"com.google.javascript.jscomp.Compiler", "toSource", "com.google.javascript.jscomp.Compiler$CodeBuilder,int,com.google.javascript.rhino.Node", "<sample:5>", "0", "<sample:4>"}, {"com.google.javascript.jscomp.Compiler", "setState", "com.google.javascript.jscomp.Compiler$IntermediateState", "<sample:0>"}, {"com.google.javascript.jscomp.Compiler", "getMessages", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getCodingConvention", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getParserConfig", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.ClosureCodingConvention", actual.getClass().getName());
  assertEquals("{getAbstractMethodName=goog.abstractMethod, getDelegateSuperclassName=null, getExportPropertyFunction=goog.exportProperty, getExportSymbolFunction=goog.exportSymbol, getGlobalObject=goog.global}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getResult", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "reportCodeChange", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "replaceIncrementalSourceAst", new String[]{"com.google.javascript.jscomp.JsAst"}, new String[]{"<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "addToDebugLog", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getCssRenamingMap", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "startPass", new String[]{"java.lang.String"}, new String[]{">e/t"}, false, 2, new String[][]{{"com.google.javascript.jscomp.Compiler", "parseSyntheticCode", "java.lang.String", " on recently changed AST"}, {"com.google.javascript.jscomp.Compiler", "getModuleGraph", ""}, {"com.google.javascript.jscomp.Compiler", "toSource", "com.google.javascript.jscomp.Compiler$CodeBuilder,int,com.google.javascript.rhino.Node", "<sample:4>", "-16384", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=3, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#191970200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "prepareAst", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getSourceRegion", "java.lang.String,int", "1.25", "2147483647"}, {"com.google.javascript.jscomp.Compiler", "toSource", "com.google.javascript.rhino.Node", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "startPass", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFF"}, false, 3, new String[][]{{"com.google.javascript.jscomp.Compiler", "getModuleGraph", ""}, {"com.google.javascript.jscomp.Compiler", "toSource", "com.google.javascript.jscomp.Compiler$CodeBuilder,int,com.google.javascript.rhino.Node", "<sample:6>", "-16384", "<sample:6>"}, {"com.google.javascript.jscomp.Compiler", "areNodesEqualForInlining", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile", "com.google.javascript.jscomp.JSModule[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:0>", "<null>", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "startPass", new String[]{"java.lang.String"}, new String[]{"-TITE"}, false, 3, new String[][]{{"com.google.javascript.jscomp.Compiler", "getModuleGraph", ""}, {"com.google.javascript.jscomp.Compiler", "parse", ""}, {"com.google.javascript.jscomp.Compiler", "toSource", "com.google.javascript.jscomp.Compiler$CodeBuilder,int,com.google.javascript.rhino.Node", "<sample:6>", "-16384", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_IN...#343#1429407841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "startPass", new String[]{"java.lang.String"}, new String[]{",qTITE"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "getModuleGraph", ""}, {"com.google.javascript.jscomp.Compiler", "parse", ""}, {"com.google.javascript.jscomp.Compiler", "toSource", "com.google.javascript.jscomp.Compiler$CodeBuilder,int,com.google.javascript.rhino.Node", "<sample:6>", "-16384", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown ...#404#1789648253", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "startPass", new String[]{"java.lang.String"}, new String[]{",qTITE"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "getModuleGraph", ""}, {"com.google.javascript.jscomp.Compiler", "toSource", "com.google.javascript.jscomp.Compiler$CodeBuilder,int,com.google.javascript.rhino.Node", "<sample:6>", "-16384", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown source) line (unknown line) : (unknown colu.., getWarningCount...#342#-1303714041", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "init", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:0>", "<sample:1>", "<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "areNodesEqualForInlining", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<null>", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"java.util.List", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<empty>", "<null>", "<sample:7>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.Compiler", "getFunctionalInformationMap", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getTypeRegistry", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSTypeRegistry", actual.getClass().getName());
  assertEquals("{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "init", new String[]{"java.util.List", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:1>", "<null>", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "startPass", new String[]{"java.lang.String"}, new String[]{"20n0-001,/1"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "addIncrementalSourceAst", "com.google.javascript.jscomp.JsAst", "<sample:1>"}, {"com.google.javascript.jscomp.Compiler", "parse", ""}, {"com.google.javascript.jscomp.Compiler", "toSource", "com.google.javascript.jscomp.Compiler$CodeBuilder,int,com.google.javascript.rhino.Node", "<sample:4>", "-32768", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown ...#404#1789648253", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getDefaultErrorReporter", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.Compiler", "acceptEcmaScript5", ""}, {"com.google.javascript.jscomp.Compiler", "compile", "java.util.List,java.util.List,com.google.javascript.jscomp.CompilerOptions", "<sample:3>", "<sample:3>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.RhinoErrorReporter$NewRhinoErrorReporter", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "processDefines", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.Compiler", "compileModules", "java.util.List,java.util.List,com.google.javascript.jscomp.CompilerOptions", "<null>", "<sample:1>", "<sample:6>"}, {"com.google.javascript.jscomp.Compiler", "setCssRenamingMap", "com.google.javascript.jscomp.CssRenamingMap", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "stripCode", new String[]{"java.util.Set", "java.util.Set", "java.util.Set", "java.util.Set"}, new String[]{"<empty>", "<empty>", "<empty>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSource", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getTypedScopeCreator", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.Compiler", "getTypedScopeCreator", ""}, {"com.google.javascript.jscomp.Compiler", "removeChangeHandler", "com.google.javascript.jscomp.CodeChangeHandler", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=!NullPointerException, getErrors=!NullPointerException, getMessages=!NullPointerException, getWarningCount=!NullPointerException, getWarnings=!NullPointerException, has...#307#49963817", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "optimize", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getErrorManager", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getErrorManager", ""}, {"com.google.javascript.jscomp.Compiler", "getExternsInOrder", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.LoggerErrorManager", actual.getClass().getName());
  assertEquals("{getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getTypedPercent=0.0, getWarningCount=0, getWarnings=[]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getInputsForTesting", new String[]{}, new String[]{}, false), new String[][]{{"containsAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "setCssRenamingMap", new String[]{"com.google.javascript.jscomp.CssRenamingMap"}, new String[]{"<sample:6>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "removeTryCatchFinally", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.Compiler", "initModules", "java.util.List,java.util.List,com.google.javascript.jscomp.CompilerOptions", "<sample:3>", "<sample:1>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "createPassConfigInternal", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getOptions", ""}, {"com.google.javascript.jscomp.Compiler", "getAstDotGraph", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.DefaultPassConfig", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSourceArray", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSourceArray", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "getErrorLevel", "com.google.javascript.jscomp.JSError", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown source) line (unknown line) : (unknown colu.., getWarningCount...#342#-1303714041", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSourceArray", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.google.javascript.jscomp.Compiler", "check", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSourceArray", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.Compiler", "parse", ""}, {"com.google.javascript.jscomp.Compiler", "check", ""}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_IN...#343#1429407841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "isIdeMode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "buildKnownSymbolTable", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SymbolTable", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "newTracer", new String[]{"java.lang.String"}, new String[]{"0x123456789"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Tracer", actual.getClass().getName());
  assertEquals("[Compiler] 0x123456789", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:2>", "<sample:2>", "<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=4, getErrors=[JSC_DUPLICATE_EXTERN_INPUT. Duplicate extern input: a at (u.., getMessages=[JSC_DUPLICATE_EXTERN_INPUT. Duplicate extern input: a at (u.., getWarningCount...#281#-1496885043", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "isInliningForbidden", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "addIncrementalSourceAst", new String[]{"com.google.javascript.jscomp.JsAst"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getState", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "endPass", ""}, {"com.google.javascript.jscomp.Compiler", "parseSyntheticCode", "java.lang.String,java.lang.String", "-1", "-1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Compiler$IntermediateState", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getState", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "endPass", ""}, {"com.google.javascript.jscomp.Compiler", "parseSyntheticCode", "java.lang.String,java.lang.String", "-1", "-1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Compiler$IntermediateState", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown source) line (unknown line) : (unknown colu.., getWarningCount...#342#-1303714041", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getState", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Compiler", "endPass", ""}, {"com.google.javascript.jscomp.Compiler", "parseSyntheticCode", "java.lang.String,java.lang.String", "-1", "-1"}, {"com.google.javascript.jscomp.Compiler", "hasHaltingErrors", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Compiler$IntermediateState", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[], getMessages=[], getWarningCount=0, getWarnings=[], hasErrors=false, isIdeMode=false, isTypeCheckingEnabled=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getState", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.Compiler", "endPass", ""}, {"com.google.javascript.jscomp.Compiler", "parseSyntheticCode", "java.lang.String,java.lang.String", "-1", "]"}, {"com.google.javascript.jscomp.Compiler", "hasHaltingErrors", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Compiler$IntermediateState", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=3, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#191970200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getState", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Compiler", "endPass", ""}, {"com.google.javascript.jscomp.Compiler", "parseSyntheticCode", "java.lang.String,java.lang.String", "-1", "]"}, {"com.google.javascript.jscomp.Compiler", "hasHaltingErrors", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Compiler$IntermediateState", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=1, getErrors=[JSC_PARSE_ERROR. Parse error. syntax error at -1 line 1 : 1.., getMessages=[JSC_PARSE_ERROR. Parse error. syntax error at -1 line 1 : 1.., getWarningCount...#281#1142428138", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getReverseAbstractInterpreter", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "addToDebugLog", "java.lang.String", "generateReport"}, {"com.google.javascript.jscomp.Compiler", "compile", "java.util.List,java.util.List,com.google.javascript.jscomp.CompilerOptions", "<null>", "<sample:1>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SemanticReverseAbstractInterpreter", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getReverseAbstractInterpreter", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "addToDebugLog", "java.lang.String", "generateReport"}, {"com.google.javascript.jscomp.Compiler", "compile", "java.util.List,java.util.List,com.google.javascript.jscomp.CompilerOptions", "<null>", "<sample:1>", "<sample:2>"}, {"com.google.javascript.jscomp.Compiler", "getState", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SemanticReverseAbstractInterpreter", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown source) line (unknown line) : (unknown colu.., getWarningCount...#342#-1303714041", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getReverseAbstractInterpreter", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "addToDebugLog", "java.lang.String", "generateReport"}, {"com.google.javascript.jscomp.Compiler", "recordFunctionInformation", ""}, {"com.google.javascript.jscomp.Compiler", "getState", ""}}), new String[][]{{"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope,boolean", "6"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown source) line (unknown line) : (unknown colu.., getWarningCount...#342#-1303714041", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getReverseAbstractInterpreter", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Compiler", "addToDebugLog", "java.lang.String", "geneqateReport"}, {"com.google.javascript.jscomp.Compiler", "recordFunctionInformation", ""}, {"com.google.javascript.jscomp.Compiler", "getState", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "init", new String[]{"java.util.List", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<null>", "<empty>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getReverseAbstractInterpreter", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Compiler", "addToDebugLog", "java.lang.String", "feneqateReport"}, {"com.google.javascript.jscomp.Compiler", "recordFunctionInformation", ""}, {"com.google.javascript.jscomp.Compiler", "parseSyntheticCode", "java.lang.String,java.lang.String", "-1.5", "e"}}), new String[][]{{"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope,boolean", "6"}, {"getParentScope", "", "4"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[], getMessages=[], getWarningCount=0, getWarnings=[], hasErrors=false, isIdeMode=false, isTypeCheckingEnabled=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getReverseAbstractInterpreter", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.Compiler", "addToDebugLog", "java.lang.String", "feneqateReport"}, {"com.google.javascript.jscomp.Compiler", "recordFunctionInformation", ""}, {"com.google.javascript.jscomp.Compiler", "parseSyntheticCode", "java.lang.String,java.lang.String", "-1.5", "e"}}), new String[][]{{"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope,boolean", "6"}, {"getParentScope", "", "4"}, {"getRootNode", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("GOTO 7 {getCharno=8, getChildCount=1, getDouble=!UnsupportedOperationException, getLength=0, getLineno=7, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourcePosition=28680, ...#357#935270699", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "replaceIncrementalSourceAst", new String[]{"com.google.javascript.jscomp.JsAst"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.Compiler", "compileModules", "java.util.List,java.util.List,com.google.javascript.jscomp.CompilerOptions", "<sample:1>", "<empty>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "replaceIncrementalSourceAst", new String[]{"com.google.javascript.jscomp.JsAst"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.Compiler", "compileModules", "java.util.List,java.util.List,com.google.javascript.jscomp.CompilerOptions", "<sample:1>", "<empty>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getPropertyMap", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getPropertyMap", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown source) line (unknown line) : (unknown colu.., getWarningCount...#342#-1303714041", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getPropertyMap", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=!NullPointerException, getErrors=!NullPointerException, getMessages=!NullPointerException, getWarningCount=!NullPointerException, getWarnings=!NullPointerException, has...#307#49963817", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getPropertyMap", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.google.javascript.jscomp.Compiler", "initCompilerOptionsIfTesting", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[], getMessages=[], getWarningCount=0, getWarnings=[], hasErrors=false, isIdeMode=false, isTypeCheckingEnabled=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getCssRenamingMap", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getCssRenamingMap", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown source) line (unknown line) : (unknown colu.., getWarningCount...#342#-1303714041", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getDefaultErrorReporter", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "getAstDotGraph", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.RhinoErrorReporter$NewRhinoErrorReporter", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown source) line (unknown line) : (unknown colu.., getWarningCount...#342#-1303714041", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getDefaultErrorReporter", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Compiler", "getAstDotGraph", ""}, {"com.google.javascript.jscomp.Compiler", "setCssRenamingMap", "com.google.javascript.jscomp.CssRenamingMap", "<sample:5>"}, {"com.google.javascript.jscomp.Compiler", "stopTracer", "com.google.javascript.jscomp.Tracer,java.lang.String", "<sample:2>", " "}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.RhinoErrorReporter$NewRhinoErrorReporter", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=!NullPointerException, getErrors=!NullPointerException, getMessages=!NullPointerException, getWarningCount=!NullPointerException, getWarnings=!NullPointerException, has...#307#49963817", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getTypeValidator", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.TypeValidator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getTypeValidator", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.TypeValidator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown source) line (unknown line) : (unknown colu.., getWarningCount...#342#-1303714041", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getTypeValidator", new String[]{}, new String[]{}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "init", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:1>", "<sample:1>", "<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "setLifeCycleStage", "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=3, getErrors=[JSC_DUPLICATE_EXTERN_INPUT. Duplicate extern input: a at (u.., getMessages=[JSC_DUPLICATE_EXTERN_INPUT. Duplicate extern input: a at (u.., getWarningCount...#281#-1383274548", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getTypeValidator", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.CompilerOptions", "<sample:7>", "<empty>", "<sample:0>"}, {"com.google.javascript.jscomp.Compiler", "processDefines", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.TypeValidator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=0, getErrors=[], getMessages=[], getWarningCount=0, getWarnings=[], hasErrors=false, isIdeMode=false, isTy...#224#1611524252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getSourceMap", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.Compiler", "precheck", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getMessages", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "<sample:2>", "<sample:2>", "<sample:5>"}, {"com.google.javascript.jscomp.Compiler", "getErrors", ""}});
  assertNotNull(actual);
  assertEquals("[Lcom.google.javascript.jscomp.JSError;", actual.getClass().getName());
  assertEquals("[JSC_DUPLICATE_EXTERN_INPUT. Duplicate extern input: a at (unknown source) line (unknown line) : (unknown column), JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source) line (unknown line) : (un...#363#817031698", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=3, getErrors=[JSC_DUPLICATE_EXTERN_INPUT. Duplicate extern input: a at (u.., getMessages=[JSC_DUPLICATE_EXTERN_INPUT. Duplicate extern input: a at (u.., getWarningCount...#281#-1383274548", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getTypeValidator", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.CompilerOptions", "<sample:7>", "<sample:0>", "<sample:0>"}, {"com.google.javascript.jscomp.Compiler", "processDefines", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.TypeValidator", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=1, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#419191190", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "init", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<null>", "<sample:2>", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getInput", "java.lang.String", "1L"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "parseTestCode", new String[]{"java.lang.String"}, new String[]{"jscompiler"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BLOCK [source_file:  [testcode] ] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName= [...#395#-1838423406", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getOptions", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getWarnings", ""}, {"com.google.javascript.jscomp.Compiler", "parseSyntheticCode", "java.lang.String,java.lang.String", "1-1.12345678901234560", "010"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.CompilerOptions", actual.getClass().getName());
  assertEquals("{getInferTypes=false, getLanguageIn=ECMASCRIPT3, getLanguageOut=null, getTweakProcessing=OFF, isAssumeStrictThis=false, isExternExportsEnabled=false, shouldColorizeErrorOutput=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "rebuildInputsFromModules", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "parseSyntheticCode", new String[]{"java.lang.String"}, new String[]{"["}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BLOCK [source_file:  [synthetic] ] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName= ...#397#1969545046", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getAstDotGraph", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "initOptions", "com.google.javascript.jscomp.CompilerOptions", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getInputsInOrder", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getExternsInOrder", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[a, a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "languageMode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.CompilerOptions$LanguageMode", actual.getClass().getName());
  assertEquals("ECMASCRIPT3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getWarningCount", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.Compiler", "getPropertyMap", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getPassConfig", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "endPass", ""}, {"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.CompilerOptions", "<sample:0>", "<sample:2>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.DefaultPassConfig", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "disableThreads", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSource", new String[]{"com.google.javascript.jscomp.Compiler$CodeBuilder", "int", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "0", "<sample:6>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "initModules", new String[]{"java.util.List", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:0>", "<sample:2>", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "ensureDefaultPassConfig", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getInput", new String[]{"java.lang.String"}, new String[]{"12:30:45"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "hasRegExpGlobalReferences", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "endPass", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSource", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "areNodesEqualForInlining", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:12>", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "isIdeMode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "areNodesEqualForInlining", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:9>", "<sample:7>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.CompilerOptions", "<sample:1>", "<sample:11>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=digraph AST {\n  node [color=lightblue2, style=filled];\n  nod.., getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown ...#404#1789648253", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "setHasRegExpGlobalReferences", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "newTracer", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFF"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Tracer", actual.getClass().getName());
  assertEquals("[Compiler] 0xFFFFFFFF", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "resetUniqueNameId", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getParserConfig", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.parsing.Config", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getVariableMap", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "setLifeCycleStage", new String[]{"com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage"}, new String[]{"<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getMessages", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("[Lcom.google.javascript.jscomp.JSError;", actual.getClass().getName());
  assertEquals("[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source) line (unknown line) : (unknown column), JSC_EMPTY_ROOT_MODULE_ERROR. Root module {0} must contain at least one source code input at (unknow...#249#-1638554167", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getSourceLine", new String[]{"java.lang.String", "int"}, new String[]{"0xu123456789", "-1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compileModules", new String[]{"java.util.List", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:3>", "<sample:2>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getLifeCycleStage", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.Compiler", "getOptions", ""}, {"com.google.javascript.jscomp.Compiler", "toSourceArray", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage", actual.getClass().getName());
  assertEquals("RAW", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getErrorCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getSourceRegion", "java.lang.String,int", "toSourceArray", "1"}, {"com.google.javascript.jscomp.Compiler", "toSource", "com.google.javascript.rhino.Node", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "newExternInput", new String[]{"java.lang.String"}, new String[]{"5."}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "setHasRegExpGlobalReferences", "boolean", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getSourceRegion", new String[]{"java.lang.String", "int"}, new String[]{"123456789012345678901234567890", "1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "stopTracer", new String[]{"com.google.javascript.jscomp.Tracer", "java.lang.String"}, new String[]{"<sample:7>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "setCssRenamingMap", "com.google.javascript.jscomp.CssRenamingMap", "<sample:3>"}, {"com.google.javascript.jscomp.Compiler", "removeTryCatchFinally", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSourceArray", new String[]{"com.google.javascript.jscomp.JSModule"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile", "com.google.javascript.jscomp.JSModule[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:4>", "<sample:1>", "<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "languageMode", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "initOptions", "com.google.javascript.jscomp.CompilerOptions", "<sample:2>"}, {"com.google.javascript.jscomp.Compiler", "updateGlobalVarReferences", "java.util.Map,com.google.javascript.rhino.Node", "<sample:3>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.CompilerOptions$LanguageMode", actual.getClass().getName());
  assertEquals("ECMASCRIPT3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "runCallableWithLargeStack", new String[]{"java.util.concurrent.Callable"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"java.util.List", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:3>", "<sample:1>", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "isInliningForbidden", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getErrors", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("[Lcom.google.javascript.jscomp.JSError;", actual.getClass().getName());
  assertEquals("[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source) line (unknown line) : (unknown column), JSC_EMPTY_ROOT_MODULE_ERROR. Root module {0} must contain at least one source code input at (unknow...#249#-1638554167", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getTypedScopeCreator", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getGlobalVarReferences", ""}, {"com.google.javascript.jscomp.Compiler", "computeCFG", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "runCallableWithLargeStack", new String[]{"java.util.concurrent.Callable"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getWarnings", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("[Lcom.google.javascript.jscomp.JSError;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "check", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getSourceMap", ""}, {"com.google.javascript.jscomp.Compiler", "newTracer", "java.lang.String", "1L"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<null>", "<sample:2>", "<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "initOptions", "com.google.javascript.jscomp.CompilerOptions", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "parseSyntheticCode", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"e", "runCustomPasses"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BLOCK [source_file: e] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=e, getSourceP...#373#-450761898", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "parseTestCode", new String[]{"java.lang.String"}, new String[]{" "}, false), new String[][]{{"getLength", "", "1"}, {"isEquivalentToTyped", "com.google.javascript.rhino.Node", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getExternsForTesting", new String[]{}, new String[]{}, false), new String[][]{{"clone", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getErrorLevel", new String[]{"com.google.javascript.jscomp.JSError"}, new String[]{"<sample:6>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "setErrorManager", new String[]{"com.google.javascript.jscomp.ErrorManager"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "removeTryCatchFinally", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown source) line (unknown line) : (unknown colu.., getWarningCount...#341#-1798978302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compileModules", new String[]{"java.util.List", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:3>", "<sample:1>", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "parse", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "setState", new String[]{"com.google.javascript.jscomp.Compiler$IntermediateState"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getErrorLevel", "com.google.javascript.jscomp.JSError", "<sample:1>"}, {"com.google.javascript.jscomp.Compiler", "getVariableMap", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "parse", new String[]{"com.google.javascript.jscomp.JSSourceFile"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getTypeRegistry", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.Compiler", "check", ""}}), new String[][]{{"createFunctionTypeWithNewThisType", "com.google.javascript.rhino.jstype.FunctionType,com.google.javascript.rhino.jstype.ObjectType", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile", "com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:5>", "<sample:2>", "<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "throwInternalError", new String[]{"java.lang.String", "java.lang.Exception"}, new String[]{"1.5", "<empty>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getInput", "java.lang.String", "externExports"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "toSource", new String[]{"com.google.javascript.jscomp.JSModule"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "setLifeCycleStage", new String[]{"com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "init", "java.util.List,java.util.List,com.google.javascript.jscomp.CompilerOptions", "<null>", "<empty>", "<sample:0>"}, {"com.google.javascript.jscomp.Compiler", "parseTestCode", "java.lang.String", "2020-02-30T25:61:61"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=3, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#191970200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "init", new String[]{"java.util.List", "java.util.List", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:1>", "<empty>", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "init", "com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "<sample:0>", "<sample:0>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "ensureDefaultPassConfig", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getErrors", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.DefaultPassConfig", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getLifeCycleStage", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "parseSyntheticCode", "java.lang.String", ";"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage", actual.getClass().getName());
  assertEquals("RAW", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "recordFunctionInformation", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "ensureDefaultPassConfig", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.DefaultPassConfig", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "process", new String[]{"com.google.javascript.jscomp.CompilerPass"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getTopScope", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "hasHaltingErrors", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile", "com.google.javascript.jscomp.JSSourceFile", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:7>", "<sample:8>", "<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getExternsInOrder", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Compiler", "setState", "com.google.javascript.jscomp.Compiler$IntermediateState", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "removeTryCatchFinally", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "getDiagnosticGroups", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getInput", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Compiler", "hasRegExpGlobalReferences", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "precheck", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.Compiler", "getReverseAbstractInterpreter", ""}, {"com.google.javascript.jscomp.Compiler", "getTypeValidator", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getTypeValidator", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.google.javascript.jscomp.Compiler", "toSource", "com.google.javascript.rhino.Node", "<sample:6>"}, {"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.CompilerOptions", "<sample:8>", "<empty>", "<null>"}, {"com.google.javascript.jscomp.Compiler", "getReverseAbstractInterpreter", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getPassConfig", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Compiler", "toSource", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.DefaultPassConfig", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=!NullPointerException, getErrors=!NullPointerException, getMessages=!NullPointerException, getWarningCount=!NullPointerException, getWarnings=!NullPointerException, has...#307#49963817", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getFunctionalInformationMap", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Compiler", "getLifeCycleStage", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=!NullPointerException, getErrors=!NullPointerException, getMessages=!NullPointerException, getWarningCount=!NullPointerException, getWarnings=!NullPointerException, has...#307#49963817", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "setCssRenamingMap", new String[]{"com.google.javascript.jscomp.CssRenamingMap"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.Compiler", "getUniqueNameIdSupplier", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "disableThreads", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "getInputsInOrder", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.Compiler", "compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.CompilerOptions", "<sample:0>", "<sample:8>", "<sample:7>"}, {"com.google.javascript.jscomp.Compiler", "ensureDefaultPassConfig", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[<a><b>t</b></a>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "compile", new String[]{"com.google.javascript.jscomp.JSSourceFile", "com.google.javascript.jscomp.JSSourceFile[]", "com.google.javascript.jscomp.CompilerOptions"}, new String[]{"<sample:8>", "<sample:2>", "<sample:3>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.Compiler", "hasErrors", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=3, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: <a><b>t</b></a> at (u.., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: <a><b>t</b></a> at (u.., getWarningCount...#281#-1059422024", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Compiler", "com.google.javascript.jscomp.Compiler", "setHasRegExpGlobalReferences", new String[]{"boolean"}, new String[]{"false"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAstDotGraph=, getErrorCount=2, getErrors=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getMessages=[JSC_DUPLICATE_INPUT. Duplicate input: a at (unknown source).., getWarningCount...#281#305580695", SearchInputFactory_scaffolding.receiverState());
 }
}
