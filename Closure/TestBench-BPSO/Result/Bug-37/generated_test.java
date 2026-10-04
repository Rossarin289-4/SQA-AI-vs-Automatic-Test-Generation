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
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseRoots", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "com.google.javascript.jscomp.NodeTraversal$Callback", "com.google.javascript.rhino.Node[]"}, new String[]{"<sample:6>", "<sample:4>", "<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseInnerNode", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:1>", "<sample:9>", "<sample:0>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "getInputId", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:7>", "<sample:0>", "5-", "<sample:6>", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT [source_file: GeneratedTestInputProxy] [length: 1] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=1, getLineno=-1, getQualifiedName=null, getSideEffectFlags...#406#-1386465974", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseRoots", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "com.google.javascript.jscomp.NodeTraversal$Callback", "com.google.javascript.rhino.Node[]"}, new String[]{"<sample:5>", "<sample:4>", "<empty>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getEnclosingFunction", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "getCurrentNode", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:5>", "<sample:7>", "E1.\n5f", "<sample:9>", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT [source_file: GeneratedTestInputProxy] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourc...#391#2118570349", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseWithScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:7>", "<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "traverseInnerNode", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:4>", "<sample:2>", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getLineNumber=7, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseWithScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<null>", "<sample:2>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "getCurrentNode", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:4>", "<null>", ".5/* @", "<sample:7>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=2147483...#359#1926735730", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getControlFlowGraph", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "traverseInnerNode", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:4>", "<sample:9>", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseRoots", new String[]{"java.util.List"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "traverseAtScope", "com.google.javascript.jscomp.Scope", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getCompiler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "report", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.DiagnosticType,java.lang.String[]", "<sample:5>", "<sample:8>", "<empty>"}, {"com.google.javascript.jscomp.NodeTraversal", "makeError", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.DiagnosticType,java.lang.String[]", "<sample:8>", "<sample:4>", "<sample:1>"}}), new String[][]{{"buildKnownSymbolTable", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "makeError", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.DiagnosticType", "java.lang.String[]"}, new String[]{"<sample:6>", "<sample:3>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "traverse", "com.google.javascript.rhino.Node", "<sample:9>"}, {"com.google.javascript.jscomp.NodeTraversal", "traverse", "com.google.javascript.rhino.Node", "<null>"}}, 1), new String[][]{{"format", "com.google.javascript.jscomp.CheckLevel,com.google.javascript.jscomp.MessageFormatter", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getCompiler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "getCompiler", ""}}, 1), new String[][]{{"compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.CompilerOptions", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getCompiler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "getCompiler", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Compiler", actual.getClass().getName());
  assertEquals("{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown source) line (unknown line) : (unknown colu.., getProgress=0.0...#359#-561986277", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseRoots", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.util.List", "com.google.javascript.jscomp.NodeTraversal$Callback"}, new String[]{"<sample:11>", "<sample:3>", "<sample:3>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getControlFlowGraph", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverse", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "getScope", ""}, {"com.google.javascript.jscomp.NodeTraversal", "traverseInnerNode", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:0>", "<sample:8>", "<null>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseWithScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:8>", "<sample:0>"}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseWithScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:9>", "<sample:3>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getScope", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "inGlobalScope", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseInnerNode", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:5>", "<sample:8>", "<null>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverse", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:9>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getLineNumber=10, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:3>", "<sample:7>", "1L0", "<sample:6>", "<null>"}, true, 0, null, 3), new String[][]{{"getDouble", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getControlFlowGraph", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "getModule", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseWithScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:0>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "getScopeDepth", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverse", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "makeError", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.CheckLevel,com.google.javascript.jscomp.DiagnosticType,java.lang.String[]", "<sample:7>", "<sample:4>", "<sample:0>", "<sample:1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getLineNumber=7, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getCurrentNode", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "getScope", ""}, {"com.google.javascript.jscomp.NodeTraversal", "getInput", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseRoots", new String[]{"java.util.List"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "getScopeRoot", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getInput", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "getModule", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverse", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:11>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getLineNumber=32, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getSourceName", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "getInputId", ""}, {"com.google.javascript.jscomp.NodeTraversal", "getInput", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getLineNumber", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "hasScope", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getCurrentNode", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "getScopeRoot", ""}, {"com.google.javascript.jscomp.NodeTraversal", "getControlFlowGraph", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "hasScope", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "getCurrentNode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseAtScope", new String[]{"com.google.javascript.jscomp.Scope"}, new String[]{"<sample:0>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getEnclosingFunction", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "getCompiler", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getCompiler", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Compiler", actual.getClass().getName());
  assertEquals("{getAstDotGraph=, getErrorCount=1, getErrors=[JSC_EMPTY_ROOT_MODULE_ERROR. Root module {0} must contain a.., getMessages=[JSC_EMPTY_ROOT_MODULE_ERROR. Root module {0} must contain a.., getProgress=0.0...#298#1722060754", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseRoots", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.util.List", "com.google.javascript.jscomp.NodeTraversal$Callback"}, new String[]{"<sample:8>", "<sample:2>", "<sample:7>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseAtScope", new String[]{"com.google.javascript.jscomp.Scope"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "getScopeRoot", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getScopeRoot", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "makeError", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.CheckLevel,com.google.javascript.jscomp.DiagnosticType,java.lang.String[]", "<sample:7>", "<sample:5>", "<sample:8>", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseRoots", new String[]{"java.util.List"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "getScopeDepth", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getScopeRoot", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "getCompiler", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:4>", "<sample:2>", " 1.1234567890123456", "<sample:2>", "<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT [source_file: GeneratedTestInputProxy] [length: 1] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=1, getLineno=-1, getQualifiedName=null, getSideEffectFlags...#399#257413638", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getCompiler", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Compiler", actual.getClass().getName());
  assertEquals("{getAstDotGraph=, getErrorCount=2, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown source) line (unknown line) : (unknown colu.., getProgress=0.0...#358#-1088572758", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getEnclosingFunction", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "traverseRoots", "com.google.javascript.rhino.Node[]", "<empty>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:4>", "<sample:3>", "\rv", "<sample:3>", "<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT [source_file: GeneratedTestInputProxy] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourc...#391#1601328106", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getScope", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "inGlobalScope", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseRoots", new String[]{"com.google.javascript.rhino.Node[]"}, new String[]{"<sample:1>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "makeError", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CheckLevel", "com.google.javascript.jscomp.DiagnosticType", "java.lang.String[]"}, new String[]{"<sample:3>", "<sample:1>", "<sample:4>", "<sample:1>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.JSError", actual.getClass().getName());
  assertEquals(". a at (unknown source) line (unknown line) : (unknown column) {getCharno=-1, getNodeLength=0, getNodeSourceOffset=2147483647}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseRoots", new String[]{"java.util.List"}, new String[]{"<null>"}, false, 5, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<null>", "<sample:3>", "+1", "<sample:0>", "<sample:7>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:6>", "<sample:1>", "2-1.5", "<sample:4>", "<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT [source_file: GeneratedTestInputProxy] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourc...#387#248447652", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getCompiler", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "traverseRoots", "java.util.List", "<sample:2>"}}, 3), new String[][]{{"getInput", "com.google.javascript.rhino.InputId", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getCompiler", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "getModule", ""}}, 2), new String[][]{{"getRoot", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:6>", "<null>", "-", "<sample:8>", "<sample:6>"}, true, 0, null, 3), new String[][]{{"getLastSibling", "", "1"}, {"isComma", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getInput", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "report", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.DiagnosticType", "java.lang.String[]"}, new String[]{"<null>", "<sample:6>", "<sample:1>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "getControlFlowGraph", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getScope", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "getInputId", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseRoots", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "com.google.javascript.jscomp.NodeTraversal$Callback", "com.google.javascript.rhino.Node[]"}, new String[]{"<sample:8>", "<sample:3>", "<sample:2>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:4>", "<sample:1>", " ;", "<sample:3>", "<sample:7>"}, true, 0, null, 3), new String[][]{{"getExistingIntProp", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getSourceName", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "traverseWithScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:3>", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseWithScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:8>", "<sample:6>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "report", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.DiagnosticType,java.lang.String[]", "<sample:2>", "<sample:5>", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "makeError", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CheckLevel", "com.google.javascript.jscomp.DiagnosticType", "java.lang.String[]"}, new String[]{"<sample:9>", "<sample:11>", "<sample:3>", "<sample:1>"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.JSError", actual.getClass().getName());
  assertEquals(". a at (unknown source) line 10 : 11 {getCharno=11, getNodeLength=0, getNodeSourceOffset=-2147483637}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:1>", "<sample:5>", "--1JSC_NODE_TRAVERSAL_ERROR", "<sample:4>", "<sample:6>"}, true, 0, null, 1), new String[][]{{"isComma", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:9>", "<sample:6>", "0w1F", "<sample:6>", "<sample:1>"}, true, 0, null, 3), new String[][]{{"getAncestors", "", "1"}, {"iterator", "", "1"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getScopeDepth", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseRoots", new String[]{"com.google.javascript.rhino.Node[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "getSourceName", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "report", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.DiagnosticType", "java.lang.String[]"}, new String[]{"<null>", "<sample:2>", "<sample:0>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseInnerNode", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:3>", "<sample:4>", "<sample:9>"}, false, 7, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseRoots", new String[]{"java.util.List"}, new String[]{"<empty>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseRoots", new String[]{"com.google.javascript.rhino.Node[]"}, new String[]{"<null>"}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getInput", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseWithScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:10>", "<sample:7>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "traverseWithScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:4>", "<sample:1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverse", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:10>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "getSourceName", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "report", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.DiagnosticType", "java.lang.String[]"}, new String[]{"<null>", "<sample:2>", "<sample:0>"}, false, 7, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:6>", "<sample:0>", "", "<sample:0>", "<sample:0>"}, true, 0, null, 3), new String[][]{{"getAncestors", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$AncestorIterable", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getScopeRoot", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "getScopeRoot", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:7>", "<sample:4>", "", "<null>", "<sample:7>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:1>", "<null>", "nnull", "<sample:8>", "<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=2147483...#359#1926735730", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseWithScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:9>", "<sample:1>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getLineNumber=10, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:4>", "<null>", "--1-0.0", "<sample:6>", "<sample:3>"}, true, 0, null, 1), new String[][]{{"appendStringTree", "java.lang.Appendable", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT [length: 1] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=1, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOf...#371#-374859426", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:6>", "<sample:2>", "1.12345678901234567", "<sample:5>", "<sample:3>"}, true, 0, null, 1), new String[][]{{"getIntProp", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getCompiler", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "traverse", "com.google.javascript.rhino.Node", "<sample:8>"}}, 1), new String[][]{{"compile", "com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.CompilerOptions", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverse", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "getInput", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverse", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:11>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "traverseWithScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:1>", "<sample:6>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getLineNumber=32, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getCompiler", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2), new String[][]{{"optimize", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getCompiler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "makeError", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.CheckLevel,com.google.javascript.jscomp.DiagnosticType,java.lang.String[]", "<sample:11>", "<sample:5>", "<sample:5>", "<empty>"}, {"com.google.javascript.jscomp.NodeTraversal", "hasScope", ""}}, 3), new String[][]{{"toSource", "com.google.javascript.jscomp.Compiler$CodeBuilder,int,com.google.javascript.rhino.Node", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseAtScope", new String[]{"com.google.javascript.jscomp.Scope"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "getScope", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getCompiler", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Compiler", actual.getClass().getName());
  assertEquals("{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown source) line (unknown line) : (unknown colu.., getProgress=0.0...#359#-561986277", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "inGlobalScope", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getControlFlowGraph", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "getScopeDepth", ""}, {"com.google.javascript.jscomp.NodeTraversal", "getSourceName", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseRoots", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.util.List", "com.google.javascript.jscomp.NodeTraversal$Callback"}, new String[]{"<sample:7>", "<sample:3>", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getEnclosingFunction", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverse", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getCurrentNode", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "traverseWithScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:7>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getLineNumber=7, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverse", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "traverseRoots", "java.util.List", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseInnerNode", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:1>", "<sample:2>", "<sample:6>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getCurrentNode", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseAtScope", new String[]{"com.google.javascript.jscomp.Scope"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "traverseRoots", "java.util.List", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getLineNumber", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getModule", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseWithScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:3>", "<sample:1>"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getInput", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "makeError", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.DiagnosticType,java.lang.String[]", "<sample:5>", "<sample:0>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getScopeRoot", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "makeError", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.CheckLevel,com.google.javascript.jscomp.DiagnosticType,java.lang.String[]", "<sample:5>", "<sample:8>", "<sample:6>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverse", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "com.google.javascript.rhino.Node", "com.google.javascript.jscomp.NodeTraversal$Callback"}, new String[]{"<sample:8>", "<sample:1>", "<sample:0>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseRoots", new String[]{"com.google.javascript.rhino.Node[]"}, new String[]{"<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseRoots", new String[]{"java.util.List"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "traverseRoots", "java.util.List", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "makeError", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.DiagnosticType", "java.lang.String[]"}, new String[]{"<sample:8>", "<sample:6>", "<null>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.JSError", actual.getClass().getName());
  assertEquals(". a at (unknown source) line (unknown line) : (unknown column) {getCharno=-1, getNodeLength=0, getNodeSourceOffset=2147483647}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "makeError", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CheckLevel", "com.google.javascript.jscomp.DiagnosticType", "java.lang.String[]"}, new String[]{"<sample:0>", "<sample:5>", "<sample:4>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "traverseAtScope", "com.google.javascript.jscomp.Scope", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.JSError", actual.getClass().getName());
  assertEquals(". a at (unknown source) line (unknown line) : (unknown column) {getCharno=-1, getNodeLength=0, getNodeSourceOffset=2147483647}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverse", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "com.google.javascript.rhino.Node", "com.google.javascript.jscomp.NodeTraversal$Callback"}, new String[]{"<sample:6>", "<sample:3>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "report", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.DiagnosticType", "java.lang.String[]"}, new String[]{"<sample:0>", "<sample:2>", "<sample:0>"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseAtScope", new String[]{"com.google.javascript.jscomp.Scope"}, new String[]{"<null>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseRoots", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.util.List", "com.google.javascript.jscomp.NodeTraversal$Callback"}, new String[]{"<sample:8>", "<null>", "<sample:5>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseRoots", new String[]{"java.util.List"}, new String[]{"<empty>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "traverseAtScope", "com.google.javascript.jscomp.Scope", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getScope", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "getScopeDepth", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getScopeDepth", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "getScope", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:5>", "<sample:1>", "[souqce unkOown]", "<sample:4>", "<sample:1>"}, true), new String[][]{{"isAnd", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:5>", "<sample:4>", "0x31F", "<sample:1>", "<sample:7>"}, true), new String[][]{{"copyInformationFrom", "com.google.javascript.rhino.Node", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT [source_file: GeneratedTestInputProxy] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourc...#394#2002496861", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getCompiler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "getLineNumber", ""}}), new String[][]{{"toSource", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "makeError", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.DiagnosticType", "java.lang.String[]"}, new String[]{"<sample:7>", "<sample:3>", "<sample:2>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "traverseRoots", "com.google.javascript.rhino.Node[]", "<null>"}}), new String[][]{{"format", "com.google.javascript.jscomp.CheckLevel,com.google.javascript.jscomp.MessageFormatter", "7"}, {"getNodeSourceOffset", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483640", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverse", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:11>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "getCurrentNode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getLineNumber=32, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseWithScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:11>", "<sample:5>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "makeError", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.DiagnosticType,java.lang.String[]", "<sample:0>", "<sample:5>", "<sample:0>"}, {"com.google.javascript.jscomp.NodeTraversal", "hasScope", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getLineNumber=32, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseWithScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<null>", "<sample:3>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "traverseRoots", "java.util.List", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseRoots", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "com.google.javascript.jscomp.NodeTraversal$Callback", "com.google.javascript.rhino.Node[]"}, new String[]{"<null>", "<sample:4>", "<sample:4>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getCompiler", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"addNewScript", "com.google.javascript.jscomp.JsAst", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:2>", "<sample:5>", "I7", "<sample:3>", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT [source_file: GeneratedTestInputProxy] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourc...#386#815845992", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseRoots", new String[]{"com.google.javascript.rhino.Node[]"}, new String[]{"<empty>"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "makeError", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CheckLevel", "com.google.javascript.jscomp.DiagnosticType", "java.lang.String[]"}, new String[]{"<sample:1>", "<sample:8>", "<sample:7>", "<sample:0>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "inGlobalScope", ""}, {"com.google.javascript.jscomp.NodeTraversal", "traverseRoots", "java.util.List", "<sample:1>"}}), new String[][]{{"getNodeLength", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:6>", "<sample:4>", "0xFFFFFFF5F", "<sample:2>", "<sample:4>"}, true), new String[][]{{"getIndexOfChild", "com.google.javascript.rhino.Node", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseAtScope", new String[]{"com.google.javascript.jscomp.Scope"}, new String[]{"<sample:7>"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getSourceName", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "hasScope", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "getControlFlowGraph", ""}, {"com.google.javascript.jscomp.NodeTraversal", "getSourceName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "makeError", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CheckLevel", "com.google.javascript.jscomp.DiagnosticType", "java.lang.String[]"}, new String[]{"<sample:2>", "<sample:3>", "<sample:7>", "<sample:1>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "getControlFlowGraph", ""}}), new String[][]{{"format", "com.google.javascript.jscomp.CheckLevel,com.google.javascript.jscomp.MessageFormatter", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseRoots", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.util.List", "com.google.javascript.jscomp.NodeTraversal$Callback"}, new String[]{"<sample:8>", "<empty>", "<sample:1>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:2>", "<sample:2>", "i", "<null>", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseInnerNode", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:9>", "<sample:6>", "<sample:6>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "traverseRoots", "com.google.javascript.rhino.Node[]", "<empty>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getLineNumber=10, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:7>", "<sample:0>", "P`rent", "<sample:1>", "<sample:7>"}, true), new String[][]{{"getDouble", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseRoots", new String[]{"com.google.javascript.rhino.Node[]"}, new String[]{"<null>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverse", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:9>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getLineNumber=10, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "report", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.DiagnosticType", "java.lang.String[]"}, new String[]{"<sample:2>", "<null>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:2>", "<sample:1>", "0x12345678:", "<sample:2>", "<sample:7>"}, true), new String[][]{{"addSuppression", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT [jsdoc_info: JSDocInfo] [source_file: GeneratedTestInputProxy] [length: 1] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=1, getLineno=-1, getQualifiedName=...#423#-1477661479", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:0>", "<sample:3>", "unknown language mode", "<sample:9>", "<sample:4>"}, true), new String[][]{{"getSourceFileName", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getSourceName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "traverse", "com.google.javascript.rhino.Node", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLineNumber=7, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getCompiler", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "report", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.DiagnosticType,java.lang.String[]", "<sample:5>", "<sample:6>", "<null>"}}), new String[][]{{"compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.CompilerOptions", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:4>", "<sample:1>", "12345678901234567890134567890", "<sample:1>", "<sample:1>"}, true), new String[][]{{"getChildCount", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getScope", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "traverseWithScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:11>", "<sample:8>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getLineNumber=32, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverse", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "traverseWithScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:5>", "<sample:3>"}, {"com.google.javascript.jscomp.NodeTraversal", "traverseRoots", "java.util.List", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:3>", "<sample:1>", "123456789012345678901234567890", "<sample:4>", "<sample:2>"}, true), new String[][]{{"getAncestors", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$AncestorIterable", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getCompiler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "traverseInnerNode", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:7>", "<sample:3>", "<sample:10>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Compiler", actual.getClass().getName());
  assertEquals("{getAstDotGraph=, getErrorCount=0, getErrors=null, getMessages=null, getProgress=0.0, getWarningCount=0, getWarnings=null, hasErrors=false, isIdeMode=false, isTypeCheckingEnabled=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getLineNumber=7, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverse", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getLineNumber=7, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getCompiler", new String[]{}, new String[]{}, false), new String[][]{{"getErrorManager", "", "0"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getCurrentNode", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "traverseWithScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:8>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:8>", "<sample:0>", "emum", "<sample:7>", "<sample:1>"}, true), new String[][]{{"getDirectives", "", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getCompiler", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "getCompiler", ""}}), new String[][]{{"compileModules", "java.util.List,java.util.List,com.google.javascript.jscomp.CompilerOptions", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseRoots", new String[]{"java.util.List"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "makeError", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.DiagnosticType", "java.lang.String[]"}, new String[]{"<sample:6>", "<sample:0>", "<sample:2>"}, false), new String[][]{{"getNodeSourceOffset", "", "6"}, {"getNodeSourceOffset", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "makeError", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CheckLevel", "com.google.javascript.jscomp.DiagnosticType", "java.lang.String[]"}, new String[]{"<sample:3>", "<sample:5>", "<sample:6>", "<sample:2>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "getModule", ""}}), new String[][]{{"getType", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.DiagnosticType", actual.getClass().getName());
  assertEquals(": a", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "makeError", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CheckLevel", "com.google.javascript.jscomp.DiagnosticType", "java.lang.String[]"}, new String[]{"<sample:9>", "<sample:3>", "<sample:5>", "<null>"}, false, 2, new String[][]{}), new String[][]{{"getNodeSourceOffset", "", "7"}, {"getNodeSourceOffset", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483637", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getCompiler", new String[]{}, new String[]{}, false), new String[][]{{"toSource", "com.google.javascript.jscomp.Compiler$CodeBuilder,int,com.google.javascript.rhino.Node", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getCompiler", new String[]{}, new String[]{}, false), new String[][]{{"getReverseAbstractInterpreter", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SemanticReverseAbstractInterpreter", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getCompiler", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "getScopeDepth", ""}}), new String[][]{{"getSourceLine", "java.lang.String,int", "0"}, {"getState", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Compiler$IntermediateState", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getEnclosingFunction", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "traverseAtScope", "com.google.javascript.jscomp.Scope", "<sample:8>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getLineNumber=10, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "makeError", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CheckLevel", "com.google.javascript.jscomp.DiagnosticType", "java.lang.String[]"}, new String[]{"<sample:7>", "<null>", "<sample:10>", "<sample:4>"}, false, 5, new String[][]{}), new String[][]{{"getCharno", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseWithScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:9>", "<sample:10>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "getScopeDepth", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getLineNumber=10, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "makeError", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CheckLevel", "com.google.javascript.jscomp.DiagnosticType", "java.lang.String[]"}, new String[]{"<sample:9>", "<sample:4>", "<null>", "<sample:1>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getScope", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "getScopeDepth", ""}, {"com.google.javascript.jscomp.NodeTraversal", "traverse", "com.google.javascript.rhino.Node", "<sample:9>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getLineNumber=10, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "makeError", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CheckLevel", "com.google.javascript.jscomp.DiagnosticType", "java.lang.String[]"}, new String[]{"<sample:4>", "<sample:4>", "<sample:1>", "<empty>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "traverseAtScope", "com.google.javascript.jscomp.Scope", "<sample:5>"}}), new String[][]{{"getCharno", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "makeError", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.DiagnosticType", "java.lang.String[]"}, new String[]{"<sample:5>", "<sample:4>", "<sample:2>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "hasScope", ""}}), new String[][]{{"getCharno", "", "1"}, {"getType", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.DiagnosticType", actual.getClass().getName());
  assertEquals(": a", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "makeError", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CheckLevel", "com.google.javascript.jscomp.DiagnosticType", "java.lang.String[]"}, new String[]{"<sample:14>", "<sample:3>", "<sample:0>", "<sample:0>"}, false, 1, new String[][]{}, 2), new String[][]{{"getNodeLength", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "makeError", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CheckLevel", "com.google.javascript.jscomp.DiagnosticType", "java.lang.String[]"}, new String[]{"<sample:10>", "<sample:2>", "<sample:5>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "report", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.DiagnosticType,java.lang.String[]", "<sample:1>", "<sample:6>", "<null>"}}), new String[][]{{"getNodeSourceOffset", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "makeError", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.DiagnosticType", "java.lang.String[]"}, new String[]{"<null>", "<sample:6>", "<sample:0>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "getCurrentNode", ""}}, 3), new String[][]{{"format", "com.google.javascript.jscomp.CheckLevel,com.google.javascript.jscomp.MessageFormatter", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseInnerNode", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:7>", "<sample:8>", "<sample:7>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "traverseRoots", "com.google.javascript.rhino.Node[]", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getLineNumber=7, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "makeError", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.DiagnosticType", "java.lang.String[]"}, new String[]{"<sample:2>", "<sample:7>", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "traverseWithScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:4>", "<sample:3>"}}), new String[][]{{"getCharno", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:2>", "<sample:1>", "1.5e300", "<sample:0>", "<sample:3>"}, true, 0, null, 3), new String[][]{{"getQualifiedName", "", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "makeError", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CheckLevel", "com.google.javascript.jscomp.DiagnosticType", "java.lang.String[]"}, new String[]{"<sample:0>", "<sample:9>", "<sample:5>", "<sample:2>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "getScopeRoot", ""}}, 2), new String[][]{{"getType", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.DiagnosticType", actual.getClass().getName());
  assertEquals(": a", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "makeError", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CheckLevel", "com.google.javascript.jscomp.DiagnosticType", "java.lang.String[]"}, new String[]{"<sample:1>", "<sample:5>", "<sample:6>", "<sample:2>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "getCurrentNode", ""}}, 1), new String[][]{{"getCharno", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseInnerNode", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<null>", "<sample:4>", "<sample:6>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "traverseWithScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<null>", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseRoots", new String[]{"java.util.List"}, new String[]{"<sample:1>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getLineNumber", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getCompiler", new String[]{}, new String[]{}, false), new String[][]{{"getSourceMap", "", "2"}, {"compile", "com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getCompiler", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "traverseInnerNode", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:7>", "<sample:3>", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Compiler", actual.getClass().getName());
  assertEquals("{getAstDotGraph=, getErrorCount=1, getErrors=[JSC_EMPTY_ROOT_MODULE_ERROR. Root module {0} must contain a.., getMessages=[JSC_EMPTY_ROOT_MODULE_ERROR. Root module {0} must contain a.., getProgress=0.0...#298#1722060754", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getLineNumber=7, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getInputId", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseAtScope", new String[]{"com.google.javascript.jscomp.Scope"}, new String[]{"<sample:1>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "makeError", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CheckLevel", "com.google.javascript.jscomp.DiagnosticType", "java.lang.String[]"}, new String[]{"<sample:5>", "<sample:0>", "<sample:2>", "<empty>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "getScopeRoot", ""}, {"com.google.javascript.jscomp.NodeTraversal", "getScope", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.JSError", actual.getClass().getName());
  assertEquals(". a at (unknown source) line (unknown line) : (unknown column) {getCharno=-1, getNodeLength=0, getNodeSourceOffset=2147483647}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "makeError", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.DiagnosticType", "java.lang.String[]"}, new String[]{"<sample:4>", "<sample:8>", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "getCurrentNode", ""}}), new String[][]{{"getNodeSourceOffset", "", "4"}, {"getCharno", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseInnerNode", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:9>", "<sample:0>", "<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "report", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.DiagnosticType,java.lang.String[]", "<sample:1>", "<sample:8>", "<sample:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getLineNumber=10, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getLineNumber", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "inGlobalScope", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseWithScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:3>", "<sample:1>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "makeError", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.DiagnosticType,java.lang.String[]", "<sample:0>", "<sample:6>", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseWithScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:0>", "<sample:5>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "traverseRoots", "com.google.javascript.rhino.Node[]", "<sample:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getCurrentNode", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "traverseWithScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:0>", "<sample:7>"}}), new String[][]{{"isBreak", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getScopeDepth", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "traverseInnerNode", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:7>", "<sample:5>", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLineNumber=7, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getScopeDepth", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "getInputId", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<null>", "<sample:1>", "trveO", "<sample:9>", "<sample:7>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "hasScope", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getInputId", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "getCompiler", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getCurrentNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "traverseInnerNode", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:9>", "<sample:6>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getLineNumber=10, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "report", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.DiagnosticType", "java.lang.String[]"}, new String[]{"<sample:6>", "<sample:3>", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "traverseWithScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:9>", "<sample:7>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getLineNumber=10, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseAtScope", new String[]{"com.google.javascript.jscomp.Scope"}, new String[]{"<sample:8>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getLineNumber=10, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "makeError", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.DiagnosticType", "java.lang.String[]"}, new String[]{"<sample:8>", "<sample:8>", "<sample:1>"}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.JSError", actual.getClass().getName());
  assertEquals(". a at (unknown source) line (unknown line) : (unknown column) {getCharno=-1, getNodeLength=0, getNodeSourceOffset=2147483647}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getCompiler", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "getSourceName", ""}}, 1), new String[][]{{"init", "java.util.List,java.util.List,com.google.javascript.jscomp.CompilerOptions", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseRoots", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.util.List", "com.google.javascript.jscomp.NodeTraversal$Callback"}, new String[]{"<sample:1>", "<null>", "<sample:2>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getCurrentNode", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "report", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.DiagnosticType", "java.lang.String[]"}, new String[]{"<sample:3>", "<sample:1>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "traverseInnerNode", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:7>", "<sample:3>", "<sample:8>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getLineNumber=7, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseWithScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:11>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "getSourceName", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseWithScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:2>", "<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseWithScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:7>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "getScopeDepth", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getLineNumber=7, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseRoots", new String[]{"com.google.javascript.rhino.Node[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "makeError", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.DiagnosticType,java.lang.String[]", "<sample:6>", "<sample:2>", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseRoots", new String[]{"java.util.List"}, new String[]{"<empty>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "traverse", "com.google.javascript.rhino.Node", "<sample:7>"}, {"com.google.javascript.jscomp.NodeTraversal", "getCompiler", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getLineNumber=7, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseInnerNode", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<null>", "<sample:4>", "<sample:6>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "getModule", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getCurrentNode", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "traverse", "com.google.javascript.rhino.Node", "<sample:0>"}}), new String[][]{{"getSourceOffset", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseInnerNode", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<null>", "<sample:8>", "<sample:4>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "traverseInnerNode", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:0>", "<sample:3>", "<sample:8>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getCurrentNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "traverseInnerNode", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:3>", "<sample:4>", "<sample:1>"}}), new String[][]{{"getChildCount", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getModule", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverse", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "com.google.javascript.rhino.Node", "com.google.javascript.jscomp.NodeTraversal$Callback"}, new String[]{"<sample:0>", "<sample:1>", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getCompiler", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "traverseWithScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:3>", "<sample:9>"}, {"com.google.javascript.jscomp.NodeTraversal", "getCurrentNode", ""}}, 1), new String[][]{{"addNewScript", "com.google.javascript.jscomp.JsAst", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getCompiler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "traverseAtScope", "com.google.javascript.jscomp.Scope", "<sample:4>"}}, 1), new String[][]{{"acceptEcmaScript5", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "hasScope", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "traverseRoots", "java.util.List", "<empty>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "makeError", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.DiagnosticType", "java.lang.String[]"}, new String[]{"<sample:7>", "<sample:5>", "<sample:1>"}, false), new String[][]{{"format", "com.google.javascript.jscomp.CheckLevel,com.google.javascript.jscomp.MessageFormatter", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:7>", "<null>", "-1.5use strict", "<sample:7>", "<sample:1>"}, true, 0, null, 1), new String[][]{{"getParent", "", "6"}, {"getSourceOffset", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseRoots", new String[]{"java.util.List"}, new String[]{"<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseRoots", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.util.List", "com.google.javascript.jscomp.NodeTraversal$Callback"}, new String[]{"<sample:5>", "<null>", "<sample:2>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getSourceName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "getLineNumber", ""}, {"com.google.javascript.jscomp.NodeTraversal", "getLineNumber", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverse", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "com.google.javascript.rhino.Node", "com.google.javascript.jscomp.NodeTraversal$Callback"}, new String[]{"<sample:2>", "<sample:6>", "<sample:4>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "makeError", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CheckLevel", "com.google.javascript.jscomp.DiagnosticType", "java.lang.String[]"}, new String[]{"<sample:3>", "<sample:8>", "<sample:7>", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "getSourceName", ""}}, 1), new String[][]{{"getNodeLength", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getScope", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "traverseInnerNode", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:7>", "<sample:8>", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getLineNumber=7, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getScopeDepth", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "traverseWithScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:9>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLineNumber=10, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseRoots", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.util.List", "com.google.javascript.jscomp.NodeTraversal$Callback"}, new String[]{"<sample:5>", "<sample:0>", "<sample:0>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getCompiler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "getSourceName", ""}, {"com.google.javascript.jscomp.NodeTraversal", "traverseWithScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:10>", "<sample:3>"}}, 1), new String[][]{{"getErrorCount", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getCurrentNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "getModule", ""}, {"com.google.javascript.jscomp.NodeTraversal", "traverseAtScope", "com.google.javascript.jscomp.Scope", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseInnerNode", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:8>", "<null>", "<sample:7>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "getCompiler", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getEnclosingFunction", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "traverse", "com.google.javascript.rhino.Node", "<sample:7>"}, {"com.google.javascript.jscomp.NodeTraversal", "getInput", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getLineNumber=7, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getCompiler", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "traverseAtScope", "com.google.javascript.jscomp.Scope", "<sample:0>"}}, 1), new String[][]{{"check", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverse", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "traverse", "com.google.javascript.rhino.Node", "<sample:11>"}, {"com.google.javascript.jscomp.NodeTraversal", "getInputId", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getCurrentNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "traverse", "com.google.javascript.rhino.Node", "<sample:5>"}}), new String[][]{{"getLength", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getModule", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "report", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.DiagnosticType,java.lang.String[]", "<sample:3>", "<sample:4>", "<null>"}, {"com.google.javascript.jscomp.NodeTraversal", "traverseAtScope", "com.google.javascript.jscomp.Scope", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "makeError", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CheckLevel", "com.google.javascript.jscomp.DiagnosticType", "java.lang.String[]"}, new String[]{"<sample:5>", "<sample:4>", "<null>", "<empty>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "makeError", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.DiagnosticType,java.lang.String[]", "<sample:7>", "<sample:6>", "<null>"}, {"com.google.javascript.jscomp.NodeTraversal", "traverseWithScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:5>", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getCompiler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "getCompiler", ""}, {"com.google.javascript.jscomp.NodeTraversal", "makeError", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.CheckLevel,com.google.javascript.jscomp.DiagnosticType,java.lang.String[]", "<sample:0>", "<sample:5>", "<sample:2>", "<sample:4>"}}, 2), new String[][]{{"toSource", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "inGlobalScope", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "getInput", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getCompiler", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2), new String[][]{{"newExternInput", "java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:5>", "<null>", "abc", "<sample:2>", "<sample:10>"}, true, 0, null, 1), new String[][]{{"addChildrenToFront", "com.google.javascript.rhino.Node", "7"}, {"hasOneChild", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getCompiler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "traverseWithScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:9>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Compiler", actual.getClass().getName());
  assertEquals("{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : (unknown colu.., getMessages=[. a at (unknown source) line (unknown line) : (unknown colu.., getProgress=0.0...#359#-561986277", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getLineNumber=10, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getCompiler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "getScopeDepth", ""}, {"com.google.javascript.jscomp.NodeTraversal", "report", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.DiagnosticType,java.lang.String[]", "<sample:4>", "<sample:1>", "<sample:1>"}}, 2), new String[][]{{"getErrors", "", "3"}});
  assertNotNull(actual);
  assertEquals("[Lcom.google.javascript.jscomp.JSError;", actual.getClass().getName());
  assertEquals("[. a at (unknown source) line (unknown line) : (unknown column), . a at (unknown source) line (unknown line) : (unknown column), . a at (unknown source) line (unknown line) : (unknown column)]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseWithScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:7>", "<sample:5>"}, false, 6, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getLineNumber=7, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getCompiler", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "traverseAtScope", "com.google.javascript.jscomp.Scope", "<sample:1>"}, {"com.google.javascript.jscomp.NodeTraversal", "getCurrentNode", ""}}, 1), new String[][]{{"getAstDotGraph", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getScopeDepth", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getCurrentNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "getScopeDepth", ""}, {"com.google.javascript.jscomp.NodeTraversal", "traverseWithScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:7>", "<sample:4>"}}), new String[][]{{"isAdd", "", "2"}, {"detachFromParent", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getModule", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "traverseInnerNode", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:7>", "<sample:2>", "<sample:12>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseRoots", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "com.google.javascript.jscomp.NodeTraversal$Callback", "com.google.javascript.rhino.Node[]"}, new String[]{"<null>", "<sample:2>", "<sample:0>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getCompiler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "getEnclosingFunction", ""}}, 3), new String[][]{{"getProgress", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getCompiler", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3), new String[][]{{"getErrorCount", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getCompiler", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "getScope", ""}}, 3), new String[][]{{"acceptConstKeyword", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseAtScope", new String[]{"com.google.javascript.jscomp.Scope"}, new String[]{"<sample:3>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "makeError", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.DiagnosticType", "java.lang.String[]"}, new String[]{"<sample:3>", "<sample:8>", "<empty>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "traverseInnerNode", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:3>", "<sample:8>", "<sample:10>"}}, 2), new String[][]{{"getType", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.DiagnosticType", actual.getClass().getName());
  assertEquals(": a", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "makeError", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.DiagnosticType", "java.lang.String[]"}, new String[]{"<sample:0>", "<sample:6>", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "report", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.DiagnosticType,java.lang.String[]", "<sample:3>", "<sample:0>", "<sample:0>"}, {"com.google.javascript.jscomp.NodeTraversal", "makeError", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.CheckLevel,com.google.javascript.jscomp.DiagnosticType,java.lang.String[]", "<sample:1>", "<sample:2>", "<sample:2>", "<empty>"}}, 2), new String[][]{{"getType", "", "1"}, {"compareTo", "com.google.javascript.jscomp.DiagnosticType", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getSourceName", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "report", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.DiagnosticType,java.lang.String[]", "<sample:4>", "<sample:3>", "<sample:0>"}, {"com.google.javascript.jscomp.NodeTraversal", "traverse", "com.google.javascript.rhino.Node", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLineNumber=10, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getCompiler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "traverseInnerNode", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:6>", "<sample:5>", "<sample:0>"}}, 3), new String[][]{{"compile", "com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.CompilerOptions", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseInnerNode", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:5>", "<sample:7>", "<sample:5>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "traverseInnerNode", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:7>", "<sample:8>", "<sample:6>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseAtScope", new String[]{"com.google.javascript.jscomp.Scope"}, new String[]{"<sample:8>"}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getLineNumber=10, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "makeError", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.DiagnosticType", "java.lang.String[]"}, new String[]{"<sample:3>", "<sample:2>", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "getSourceName", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.JSError", actual.getClass().getName());
  assertEquals(". a at (unknown source) line (unknown line) : (unknown column) {getCharno=-1, getNodeLength=0, getNodeSourceOffset=2147483647}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "makeError", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.DiagnosticType", "java.lang.String[]"}, new String[]{"<null>", "<sample:4>", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "getInput", ""}}), new String[][]{{"format", "com.google.javascript.jscomp.CheckLevel,com.google.javascript.jscomp.MessageFormatter", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverse", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "com.google.javascript.rhino.Node", "com.google.javascript.jscomp.NodeTraversal$Callback"}, new String[]{"<sample:2>", "<sample:2>", "<sample:5>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getCompiler", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"getProgress", "", "2"}, {"isTypeCheckingEnabled", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getCompiler", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"getState", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Compiler$IntermediateState", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getInputId", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseRoots", new String[]{"java.util.List"}, new String[]{"<empty>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getCompiler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "getInput", ""}}, 2), new String[][]{{"init", "java.util.List,java.util.List,com.google.javascript.jscomp.CompilerOptions", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "makeError", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CheckLevel", "com.google.javascript.jscomp.DiagnosticType", "java.lang.String[]"}, new String[]{"<sample:3>", "<sample:7>", "<sample:0>", "<null>"}, false, 0, null, 1), new String[][]{{"getType", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.DiagnosticType", actual.getClass().getName());
  assertEquals(": a", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "makeError", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.DiagnosticType", "java.lang.String[]"}, new String[]{"<sample:5>", "<sample:2>", "<empty>"}, false, 0, null, 1), new String[][]{{"getNodeLength", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseRoots", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.util.List", "com.google.javascript.jscomp.NodeTraversal$Callback"}, new String[]{"<sample:2>", "<empty>", "<sample:5>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseRoots", new String[]{"com.google.javascript.rhino.Node[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "getScope", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "makeError", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.CheckLevel", "com.google.javascript.jscomp.DiagnosticType", "java.lang.String[]"}, new String[]{"<sample:1>", "<sample:10>", "<sample:4>", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "getEnclosingFunction", ""}}, 3), new String[][]{{"getNodeSourceOffset", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseAtScope", new String[]{"com.google.javascript.jscomp.Scope"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "getScopeRoot", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseWithScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:7>", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "traverseInnerNode", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:1>", "<sample:0>", "<null>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getLineNumber=7, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "makeError", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.DiagnosticType", "java.lang.String[]"}, new String[]{"<sample:1>", "<sample:6>", "<sample:0>"}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.JSError", actual.getClass().getName());
  assertEquals(". a at (unknown source) line (unknown line) : (unknown column) {getCharno=-1, getNodeLength=0, getNodeSourceOffset=2147483647}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "makeError", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.DiagnosticType", "java.lang.String[]"}, new String[]{"<sample:0>", "<sample:10>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "getInput", ""}}, 3), new String[][]{{"getNodeSourceOffset", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseWithScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:7>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "getScopeRoot", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverse", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "com.google.javascript.rhino.Node", "com.google.javascript.jscomp.NodeTraversal$Callback"}, new String[]{"<sample:5>", "<sample:4>", "<sample:0>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverse", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseAtScope", new String[]{"com.google.javascript.jscomp.Scope"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "getInput", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseWithScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:9>", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "inGlobalScope", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getLineNumber=10, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "makeError", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.DiagnosticType", "java.lang.String[]"}, new String[]{"<sample:2>", "<sample:8>", "<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "traverseInnerNode", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:9>", "<sample:2>", "<sample:3>"}, {"com.google.javascript.jscomp.NodeTraversal", "getInput", ""}}), new String[][]{{"getType", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.DiagnosticType", actual.getClass().getName());
  assertEquals(": a", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getLineNumber=10, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseAtScope", new String[]{"com.google.javascript.jscomp.Scope"}, new String[]{"<sample:8>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getLineNumber=10, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "getCurrentNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "traverse", "com.google.javascript.rhino.Node", "<sample:6>"}}), new String[][]{{"getSourcePosition", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "makeError", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.DiagnosticType", "java.lang.String[]"}, new String[]{"<sample:4>", "<sample:9>", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "traverseWithScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:9>", "<sample:3>"}}, 1), new String[][]{{"getNodeSourceOffset", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseRoots", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "com.google.javascript.jscomp.NodeTraversal$Callback", "com.google.javascript.rhino.Node[]"}, new String[]{"<sample:5>", "<sample:1>", "<sample:2>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverse", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "report", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.DiagnosticType,java.lang.String[]", "<sample:4>", "<sample:1>", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getLineNumber=10, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverse", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "com.google.javascript.rhino.Node", "com.google.javascript.jscomp.NodeTraversal$Callback"}, new String[]{"<sample:10>", "<null>", "<sample:6>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseAtScope", new String[]{"com.google.javascript.jscomp.Scope"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "traverseAtScope", "com.google.javascript.jscomp.Scope", "<sample:6>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:4>", "<sample:7>", "-0.0", "<sample:1>", "<sample:7>"}, true, 0, null, 2), new String[][]{{"isAnd", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseInnerNode", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:9>", "<sample:6>", "<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "traverseWithScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:6>", "<sample:6>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getLineNumber=10, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseAtScope", new String[]{"com.google.javascript.jscomp.Scope"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "hasScope", ""}, {"com.google.javascript.jscomp.NodeTraversal", "getControlFlowGraph", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getLineNumber=10, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:4>", "<sample:7>", "010", "<sample:2>", "<sample:8>"}, true, 0, null, 2), new String[][]{{"getProp", "int", "3"}, {"getProp", "int", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "inGlobalScope", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "traverse", "com.google.javascript.rhino.Node", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLineNumber=10, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverse", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "traverse", "com.google.javascript.rhino.Node", "<sample:9>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getLineNumber=7, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "makeError", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.DiagnosticType", "java.lang.String[]"}, new String[]{"<sample:0>", "<sample:4>", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "inGlobalScope", ""}}, 1), new String[][]{{"getNodeLength", "", "2"}, {"getType", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.DiagnosticType", actual.getClass().getName());
  assertEquals(": a", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseRoots", new String[]{"com.google.javascript.rhino.Node[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "traverse", "com.google.javascript.rhino.Node", "<sample:13>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "traverseRoots", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "com.google.javascript.jscomp.NodeTraversal$Callback", "com.google.javascript.rhino.Node[]"}, new String[]{"<sample:6>", "<sample:9>", "<sample:2>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.jscomp.NodeTraversal", "makeError", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.DiagnosticType", "java.lang.String[]"}, new String[]{"<sample:7>", "<sample:7>", "<empty>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.NodeTraversal", "getModule", ""}}, 2), new String[][]{{"getCharno", "", "6"}, {"getNodeSourceOffset", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483640", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getLineNumber=0, getSourceName=, hasScope=false}", SearchInputFactory_scaffolding.receiverState());
 }
}
