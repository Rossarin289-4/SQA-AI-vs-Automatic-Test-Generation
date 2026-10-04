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
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Compiler", actual.getClass().getName());
  assertEquals("{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : 0, . a at (un.., getMessages=[. a at (unknown source) line (unknown line) : 0, . a at (un.., getProgress=0.0...#359#-313364259", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeOptimizationsPass", "visit", "com.google.javascript.rhino.Node", "<sample:2>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Compiler", actual.getClass().getName());
  assertEquals("{getAstDotGraph=, getErrorCount=1, getErrors=[JSC_EMPTY_ROOT_MODULE_ERROR. Root module {0} must contain a.., getMessages=[JSC_EMPTY_ROOT_MODULE_ERROR. Root module {0} must contain a.., getProgress=0.0...#298#1722060754", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Compiler", actual.getClass().getName());
  assertEquals("{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : 0, . a at (un.., getMessages=[. a at (unknown source) line (unknown line) : 0, . a at (un.., getProgress=0.0...#359#-313364259", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"getAstDotGraph", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "visit", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"acceptEcmaScript5", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeOptimizationsPass", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Compiler", actual.getClass().getName());
  assertEquals("{getAstDotGraph=, getErrorCount=0, getErrors=[. a at (unknown source) line (unknown line) : 0, . a at (un.., getMessages=[. a at (unknown source) line (unknown line) : 0, . a at (un.., getProgress=0.0...#359#-313364259", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "visit", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.PeepholeOptimizationsPass", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:3>"}, {"com.google.javascript.jscomp.PeepholeOptimizationsPass", "visit", "com.google.javascript.rhino.Node", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeOptimizationsPass", "visit", "com.google.javascript.rhino.Node", "<sample:0>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<sample:3>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.PeepholeOptimizationsPass", "visit", "com.google.javascript.rhino.Node", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:5>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"hasErrors", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"getErrorLevel", "com.google.javascript.jscomp.JSError", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.PeepholeOptimizationsPass", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:1>"}}), new String[][]{{"getErrorManager", "", "2"}, {"generateReport", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.LoggerErrorManager", actual.getClass().getName());
  assertEquals("{getErrorCount=1, getErrors=[JSC_EMPTY_ROOT_MODULE_ERROR. Root module {0} must contain a.., getTypedPercent=0.0, getWarningCount=0, getWarnings=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", ""}}, 2), new String[][]{{"acceptEcmaScript5", "", "6"}, {"init", "java.util.List,java.util.List,com.google.javascript.jscomp.CompilerOptions", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeOptimizationsPass", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:1>"}, {"com.google.javascript.jscomp.PeepholeOptimizationsPass", "visit", "com.google.javascript.rhino.Node", "<sample:4>"}}, 2), new String[][]{{"acceptConstKeyword", "", "6"}, {"newExternInput", "java.lang.String", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"getSourceLine", "java.lang.String,int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<sample:4>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.PeepholeOptimizationsPass", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:9>"}, {"com.google.javascript.jscomp.PeepholeOptimizationsPass", "visit", "com.google.javascript.rhino.Node", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"getResult", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.PeepholeOptimizationsPass", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:0>"}, {"com.google.javascript.jscomp.PeepholeOptimizationsPass", "visit", "com.google.javascript.rhino.Node", "<sample:3>"}}, 3), new String[][]{{"getErrorCount", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<sample:8>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "visit", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeOptimizationsPass", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:1>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:11>", "<sample:6>"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.PeepholeOptimizationsPass", "visit", "com.google.javascript.rhino.Node", "<sample:9>"}}), new String[][]{{"getProgress", "", "3"}, {"compile", "com.google.javascript.jscomp.JSSourceFile,com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.PeepholeOptimizationsPass", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:0>"}}), new String[][]{{"getTypeRegistry", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSTypeRegistry", actual.getClass().getName());
  assertEquals("{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.PeepholeOptimizationsPass", "visit", "com.google.javascript.rhino.Node", "<sample:4>"}}, 3), new String[][]{{"getErrors", "", "5"}});
  assertNotNull(actual);
  assertEquals("[Lcom.google.javascript.jscomp.JSError;", actual.getClass().getName());
  assertEquals("[JSC_EMPTY_ROOT_MODULE_ERROR. Root module {0} must contain at least one source code input at (unknown source) line (unknown line) : (unknown column)]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "visit", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<sample:7>"}, false, 5, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeOptimizationsPass", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:4>"}, {"com.google.javascript.jscomp.PeepholeOptimizationsPass", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:9>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", ""}}, 3), new String[][]{{"processDefines", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.PeepholeOptimizationsPass", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:1>"}}, 1), new String[][]{{"getErrors", "", "6"}});
  assertNotNull(actual);
  assertEquals("[Lcom.google.javascript.jscomp.JSError;", actual.getClass().getName());
  assertEquals("[JSC_EMPTY_ROOT_MODULE_ERROR. Root module {0} must contain at least one source code input at (unknown source) line (unknown line) : (unknown column)]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "visit", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", ""}}, 2), new String[][]{{"optimize", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.PeepholeOptimizationsPass", "visit", "com.google.javascript.rhino.Node", "<sample:3>"}}, 1), new String[][]{{"acceptConstKeyword", "", "5"}, {"getResult", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeOptimizationsPass", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3), new String[][]{{"getErrorManager", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.PrintStreamErrorManager", actual.getClass().getName());
  assertEquals("{getErrorCount=1, getErrors=[JSC_EMPTY_ROOT_MODULE_ERROR. Root module {0} must contain a.., getTypedPercent=0.0, getWarningCount=0, getWarnings=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.PeepholeOptimizationsPass", "visit", "com.google.javascript.rhino.Node", "<sample:1>"}}, 1), new String[][]{{"getTypedScopeCreator", "", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "visit", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "visit", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<sample:3>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3), new String[][]{{"getWarnings", "", "4"}});
  assertNotNull(actual);
  assertEquals("[Lcom.google.javascript.jscomp.JSError;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"rebuildInputsFromModules", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.PeepholeOptimizationsPass", "visit", "com.google.javascript.rhino.Node", "<sample:4>"}, {"com.google.javascript.jscomp.PeepholeOptimizationsPass", "visit", "com.google.javascript.rhino.Node", "<sample:5>"}}, 1), new String[][]{{"newExternInput", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"languageMode", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.CompilerOptions$LanguageMode", actual.getClass().getName());
  assertEquals("ECMASCRIPT3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1), new String[][]{{"init", "java.util.List,java.util.List,com.google.javascript.jscomp.CompilerOptions", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", ""}}, 2), new String[][]{{"init", "com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.JSModule[],com.google.javascript.jscomp.CompilerOptions", "2"}, {"getSourceRegion", "java.lang.String,int", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"hasErrors", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2), new String[][]{{"getErrorManager", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.PrintStreamErrorManager", actual.getClass().getName());
  assertEquals("{getErrorCount=1, getErrors=[JSC_EMPTY_ROOT_MODULE_ERROR. Root module {0} must contain a.., getTypedPercent=0.0, getWarningCount=0, getWarnings=[]}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.PeepholeOptimizationsPass", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:5>"}}, 1), new String[][]{{"getWarnings", "", "0"}});
  assertNotNull(actual);
  assertEquals("[Lcom.google.javascript.jscomp.JSError;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "visit", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeOptimizationsPass", "com.google.javascript.jscomp.PeepholeOptimizationsPass", "getCompiler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeOptimizationsPass", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:3>"}}), new String[][]{{"reportCodeChange", "", "4"}, {"compile", "com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.JSSourceFile[],com.google.javascript.jscomp.CompilerOptions", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Result", actual.getClass().getName());
 }
}
