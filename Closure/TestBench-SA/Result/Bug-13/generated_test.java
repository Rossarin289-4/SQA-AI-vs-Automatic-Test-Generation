package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "visit", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "visit", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "visit", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<sample:1>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:0>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.PeepholeOptimizationsPass", "visit", "com.google.javascript.rhino.Node", "<sample:0>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<sample:5>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<null>"}, false, 8, new String[][]{{"com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", ""}, {"com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.PeepholeOptimizationsPass", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Compiler", actual.getClass().getName());
  assertEquals("{getAstDotGraph=, getErrorCount=1, getErrors=[JSC_EMPTY_ROOT_MODULE_ERROR. Root module {0} must contain a.., getMessages=[JSC_EMPTY_ROOT_MODULE_ERROR. Root module {0} must contain a.., getProgress=0.0...#298#1722060754", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.PeepholeOptimizationsPass", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:5>"}}), new String[][]{{"getErrorLevel", "com.google.javascript.jscomp.JSError", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeOptimizationsPass", "visit", "com.google.javascript.rhino.Node", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeOptimizationsPass", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:5>"}, {"com.google.javascript.jscomp.PeepholeOptimizationsPass", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:3>"}}), new String[][]{{"init", "java.util.List,java.util.List,com.google.javascript.jscomp.CompilerOptions", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"parse", "com.google.javascript.jscomp.SourceFile", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeOptimizationsPass", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<null>", "<sample:0>"}, {"com.google.javascript.jscomp.PeepholeOptimizationsPass", "visit", "com.google.javascript.rhino.Node", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeOptimizationsPass", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<null>", "<sample:0>"}, {"com.google.javascript.jscomp.PeepholeOptimizationsPass", "visit", "com.google.javascript.rhino.Node", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:1>"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:9>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeOptimizationsPass", "visit", "com.google.javascript.rhino.Node", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeOptimizationsPass", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:5>"}}), new String[][]{{"toSourceArray", "com.google.javascript.jscomp.JSModule", "5"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeOptimizationsPass", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:6>"}, {"com.google.javascript.jscomp.PeepholeOptimizationsPass", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:4>"}}, 2), new String[][]{{"toSourceArray", "com.google.javascript.jscomp.JSModule", "6"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "visit", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", new String[]{}, new String[]{}, false), new String[][]{{"getResult", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeOptimizationsPass", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:4>"}}, 1), new String[][]{{"getCodingConvention", "", "1"}, {"getGlobalObject", "", "1"}, {"getDelegateRelationship", "com.google.javascript.rhino.Node", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", ""}, {"com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", ""}}), new String[][]{{"getRoot", "", "6"}, {"replaceScript", "com.google.javascript.jscomp.JsAst", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "visit", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.PeepholeOptimizationsPass", "visit", "com.google.javascript.rhino.Node", "<sample:1>"}, {"com.google.javascript.jscomp.PeepholeOptimizationsPass", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:0>"}}), new String[][]{{"buildKnownSymbolTable", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.PeepholeOptimizationsPass", "visit", "com.google.javascript.rhino.Node", "<sample:1>"}, {"com.google.javascript.jscomp.PeepholeOptimizationsPass", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:0>"}}, 1), new String[][]{{"buildKnownSymbolTable", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.PeepholeOptimizationsPass", "visit", "com.google.javascript.rhino.Node", "<sample:1>"}, {"com.google.javascript.jscomp.PeepholeOptimizationsPass", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:0>"}}, 1), new String[][]{{"newExternInput", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:1>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.PeepholeOptimizationsPass", "visit", "com.google.javascript.rhino.Node", "<sample:7>"}, {"com.google.javascript.jscomp.PeepholeOptimizationsPass", "visit", "com.google.javascript.rhino.Node", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:1>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", ""}, {"com.google.javascript.jscomp.PeepholeOptimizationsPass", "visit", "com.google.javascript.rhino.Node", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Compiler", actual.getClass().getName());
  assertEquals("{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : 0, . a at (un.., getMessages=[. a at (unknown source) line (unknown line) : 0, . a at (un.., getProgress=0.0...#359#-313364259", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "visit", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.PeepholeOptimizationsPass", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<null>"}, {"com.google.javascript.jscomp.PeepholeOptimizationsPass", "visit", "com.google.javascript.rhino.Node", "<null>"}, {"com.google.javascript.jscomp.PeepholeOptimizationsPass", "visit", "com.google.javascript.rhino.Node", "<sample:3>"}}, 1), new String[][]{{"getErrors", "", "1"}});
  assertNotNull(actual);
  assertEquals("[Lcom.google.javascript.jscomp.JSError;", actual.getClass().getName());
  assertEquals("[JSC_EMPTY_ROOT_MODULE_ERROR. Root module {0} must contain at least one source code input at (unknown source) line (unknown line) : (unknown column)]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.PeepholeOptimizationsPass", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<null>"}, {"com.google.javascript.jscomp.PeepholeOptimizationsPass", "visit", "com.google.javascript.rhino.Node", "<sample:7>"}, {"com.google.javascript.jscomp.PeepholeOptimizationsPass", "visit", "com.google.javascript.rhino.Node", "<sample:3>"}}, 1), new String[][]{{"getErrors", "", "1"}});
  assertNotNull(actual);
  assertEquals("[Lcom.google.javascript.jscomp.JSError;", actual.getClass().getName());
  assertEquals("[. a at (unknown source) line (unknown line) : 0, . a at (unknown source) line (unknown line) : 0, . a at (unknown source) line (unknown line) : 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"compileModules", "java.util.List,java.util.List,com.google.javascript.jscomp.CompilerOptions", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Compiler", actual.getClass().getName());
  assertEquals("{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : 0, . a at (un.., getMessages=[. a at (unknown source) line (unknown line) : 0, . a at (un.., getProgress=0.0...#359#-313364259", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeOptimizationsPass", "visit", "com.google.javascript.rhino.Node", "<sample:2>"}, {"com.google.javascript.jscomp.PeepholeOptimizationsPass", "visit", "com.google.javascript.rhino.Node", "<sample:5>"}}, 2), new String[][]{{"getErrorLevel", "com.google.javascript.jscomp.JSError", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.PeepholeOptimizationsPass", "visit", "com.google.javascript.rhino.Node", "<sample:2>"}, {"com.google.javascript.jscomp.PeepholeOptimizationsPass", "visit", "com.google.javascript.rhino.Node", "<sample:5>"}, {"com.google.javascript.jscomp.PeepholeOptimizationsPass", "visit", "com.google.javascript.rhino.Node", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Compiler", actual.getClass().getName());
  assertEquals("{getAstDotGraph=, getErrorCount=2, getErrors=[. a at (unknown source) line (unknown line) : 0, . a at (un.., getMessages=[. a at (unknown source) line (unknown line) : 0, . a at (un.., getProgress=0.0...#358#-110721368", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.PeepholeOptimizationsPass", "visit", "com.google.javascript.rhino.Node", "<sample:2>"}, {"com.google.javascript.jscomp.PeepholeOptimizationsPass", "visit", "com.google.javascript.rhino.Node", "<sample:0>"}, {"com.google.javascript.jscomp.PeepholeOptimizationsPass", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:2>"}}, 2), new String[][]{{"getInput", "com.google.javascript.rhino.InputId", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.google.javascript.jscomp.PeepholeOptimizationsPass", "visit", "com.google.javascript.rhino.Node", "<sample:7>"}, {"com.google.javascript.jscomp.PeepholeOptimizationsPass", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:1>"}}, 3), new String[][]{{"getInput", "com.google.javascript.rhino.InputId", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", new String[]{}, new String[]{}, false, 28, new String[][]{{"com.google.javascript.jscomp.PeepholeOptimizationsPass", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:7>"}, {"com.google.javascript.jscomp.PeepholeOptimizationsPass", "visit", "com.google.javascript.rhino.Node", "<sample:0>"}}, 1), new String[][]{{"getRoot", "", "7"}, {"getWarnings", "", "2"}});
  assertNotNull(actual);
  assertEquals("[Lcom.google.javascript.jscomp.JSError;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.google.javascript.jscomp.PeepholeOptimizationsPass", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:7>"}, {"com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", ""}}, 1), new String[][]{{"isIdeMode", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", new String[]{}, new String[]{}, false, 22, new String[][]{{"com.google.javascript.jscomp.PeepholeOptimizationsPass", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:7>"}, {"com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", ""}}, 2), new String[][]{{"isIdeMode", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", new String[]{}, new String[]{}, false, 27, new String[][]{{"com.google.javascript.jscomp.PeepholeOptimizationsPass", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:7>"}, {"com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", ""}}, 2), new String[][]{{"isIdeMode", "", "4"}, {"parse", "com.google.javascript.jscomp.SourceFile", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", new String[]{}, new String[]{}, false, 38, new String[][]{{"com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", ""}, {"com.google.javascript.jscomp.PeepholeOptimizationsPass", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:5>"}, {"com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", ""}}, 3), new String[][]{{"toSourceArray", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "visit", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeOptimizationsPass", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:2>"}, {"com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "visit", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.PeepholeOptimizationsPass", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:9>", "<sample:7>"}, {"com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", ""}, {"com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", ""}}, 3), new String[][]{{"toSourceArray", "com.google.javascript.jscomp.JSModule", "1"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.PeepholeOptimizationsPass", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<null>"}}, 3), new String[][]{{"reportCodeChange", "", "3"}, {"toSource", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.google.javascript.jscomp.PeepholeOptimizationsPass", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:7>"}, {"com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", ""}, {"com.google.javascript.jscomp.PeepholeOptimizationsPass", "visit", "com.google.javascript.rhino.Node", "<sample:1>"}}, 3), new String[][]{{"check", "", "4"}, {"getProgress", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.PeepholeOptimizationsPass", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<null>", "<sample:3>"}, {"com.google.javascript.jscomp.PeepholeOptimizationsPass", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:3>"}}, 3), new String[][]{{"getTopScope", "", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.PeepholeOptimizationsPass", "visit", "com.google.javascript.rhino.Node", "<sample:6>"}, {"com.google.javascript.jscomp.PeepholeOptimizationsPass", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:3>"}, {"com.google.javascript.jscomp.PeepholeOptimizationsPass", "visit", "com.google.javascript.rhino.Node", "<sample:4>"}}, 3), new String[][]{{"getWarningCount", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", ""}, {"com.google.javascript.jscomp.PeepholeOptimizationsPass", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:4>"}, {"com.google.javascript.jscomp.PeepholeOptimizationsPass", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:5>"}}, 3), new String[][]{{"init", "java.util.List,java.util.List,com.google.javascript.jscomp.CompilerOptions", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
}
