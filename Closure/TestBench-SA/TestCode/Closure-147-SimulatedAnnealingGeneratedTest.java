package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RuntimeTypeCheck", "com.google.javascript.jscomp.RuntimeTypeCheck", "getBoilerplateCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String"}, new String[]{"<sample:1>", ""}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BLOCK [sourcename:  [synthetic] ] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getString=!UnsupportedOperationException, getType=125, ...#402#1502236983", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RuntimeTypeCheck", "com.google.javascript.jscomp.RuntimeTypeCheck", "getBoilerplateCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String"}, new String[]{"<null>", "1L"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CheckGlobalThis", "com.google.javascript.jscomp.CheckGlobalThis", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:4>", "<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CheckGlobalThis", "com.google.javascript.jscomp.CheckGlobalThis", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:1>", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CheckGlobalThis", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:4>", "<sample:3>"}, {"com.google.javascript.jscomp.CheckGlobalThis", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<null>", "<sample:7>", "<sample:0>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RuntimeTypeCheck", "com.google.javascript.jscomp.RuntimeTypeCheck", "getBoilerplateCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String"}, new String[]{"<sample:7>", "true"}, true), new String[][]{{"getProp", "int", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RuntimeTypeCheck", "com.google.javascript.jscomp.RuntimeTypeCheck", "getBoilerplateCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String"}, new String[]{"<sample:1>", "true"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT 1 [sourcename:  [synthetic] ] [jsdoc_info: JSDocInfo] [synthetic: 1] [sourcefile:  [synthetic] ] {getCharno=0, getChildCount=35, getDouble=!UnsupportedOperationException, getLineno=1, getQualif...#469#2005817914", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RuntimeTypeCheck", "com.google.javascript.jscomp.RuntimeTypeCheck", "getBoilerplateCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String"}, new String[]{"<sample:1>", "true"}, true), new String[][]{{"removeFirstChild", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("VAR 25 [sourcefile:  [synthetic] ] {getCharno=0, getChildCount=1, getDouble=!UnsupportedOperationException, getLineno=25, getQualifiedName=null, getString=!UnsupportedOperationException, getType=118, ...#400#1231456417", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RuntimeTypeCheck", "com.google.javascript.jscomp.RuntimeTypeCheck", "getBoilerplateCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String"}, new String[]{"<sample:6>", "EtDue1.5e300"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RuntimeTypeCheck", "com.google.javascript.jscomp.RuntimeTypeCheck", "getBoilerplateCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String"}, new String[]{"<sample:3>", "\n"}, true, 0, null, 1), new String[][]{{"putBooleanProp", "int,boolean", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BLOCK [sourcename:  [synthetic] ] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getString=!UnsupportedOperationException, getType=125, ...#402#1502236983", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RuntimeTypeCheck", "com.google.javascript.jscomp.RuntimeTypeCheck", "getBoilerplateCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String"}, new String[]{"<sample:3>", "<null>"}, true, 0, null, 1), new String[][]{{"putBooleanProp", "int,boolean", "3"}, {"addChildrenToFront", "com.google.javascript.rhino.Node", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BLOCK [sourcename:  [synthetic] ] {getCharno=-1, getChildCount=1, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getString=!UnsupportedOperationException, getType=125, ...#400#-448947988", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CheckGlobalThis", "com.google.javascript.jscomp.CheckGlobalThis", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:5>", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CheckGlobalThis", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:7>", "<sample:4>"}, {"com.google.javascript.jscomp.CheckGlobalThis", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:0>", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RuntimeTypeCheck", "com.google.javascript.jscomp.RuntimeTypeCheck", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RuntimeTypeCheck", "com.google.javascript.jscomp.RuntimeTypeCheck", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RuntimeTypeCheck", "com.google.javascript.jscomp.RuntimeTypeCheck", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<sample:3>"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CheckGlobalThis", "com.google.javascript.jscomp.CheckGlobalThis", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:7>", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CheckGlobalThis", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:5>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CheckGlobalThis", "com.google.javascript.jscomp.CheckGlobalThis", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<null>", "<sample:5>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.CheckGlobalThis", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:1>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RuntimeTypeCheck", "com.google.javascript.jscomp.RuntimeTypeCheck", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<sample:1>"}, false, 10, new String[][]{{"com.google.javascript.jscomp.RuntimeTypeCheck", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:5>"}, {"com.google.javascript.jscomp.RuntimeTypeCheck", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:11>", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RuntimeTypeCheck", "com.google.javascript.jscomp.RuntimeTypeCheck", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<sample:3>"}, false, 10, new String[][]{{"com.google.javascript.jscomp.RuntimeTypeCheck", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:5>"}, {"com.google.javascript.jscomp.RuntimeTypeCheck", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:11>", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RuntimeTypeCheck", "com.google.javascript.jscomp.RuntimeTypeCheck", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<sample:6>"}, false, 10, new String[][]{{"com.google.javascript.jscomp.RuntimeTypeCheck", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CheckGlobalThis", "com.google.javascript.jscomp.CheckGlobalThis", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<sample:4>", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CheckGlobalThis", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:6>", "<sample:6>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RuntimeTypeCheck", "com.google.javascript.jscomp.RuntimeTypeCheck", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:2>"}, false, 15, new String[][]{{"com.google.javascript.jscomp.RuntimeTypeCheck", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:0>"}, {"com.google.javascript.jscomp.RuntimeTypeCheck", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CheckGlobalThis", "com.google.javascript.jscomp.CheckGlobalThis", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<sample:2>", "<sample:3>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.CheckGlobalThis", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<null>", "<null>", "<sample:6>"}, {"com.google.javascript.jscomp.CheckGlobalThis", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:1>", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RuntimeTypeCheck", "com.google.javascript.jscomp.RuntimeTypeCheck", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<sample:2>"}, false, 15, new String[][]{{"com.google.javascript.jscomp.RuntimeTypeCheck", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:1>"}, {"com.google.javascript.jscomp.RuntimeTypeCheck", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:3>"}, {"com.google.javascript.jscomp.RuntimeTypeCheck", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RuntimeTypeCheck", "com.google.javascript.jscomp.RuntimeTypeCheck", "getBoilerplateCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String"}, new String[]{"<sample:2>", "1L"}, true, 0, null, 1), new String[][]{{"putIntProp", "int,int", "5"}, {"getBooleanProp", "int", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RuntimeTypeCheck", "com.google.javascript.jscomp.RuntimeTypeCheck", "getBoilerplateCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String"}, new String[]{"<sample:2>", "Title"}, true), new String[][]{{"children", "", "5"}, {"add", "java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RuntimeTypeCheck", "com.google.javascript.jscomp.RuntimeTypeCheck", "getBoilerplateCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String"}, new String[]{"<sample:2>", "1.5f"}, true), new String[][]{{"removeChildren", "", "2"}, {"hasSideEffects", "", "3"}, {"isQualifiedName", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CheckGlobalThis", "com.google.javascript.jscomp.CheckGlobalThis", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<null>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CheckGlobalThis", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<null>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CheckGlobalThis", "com.google.javascript.jscomp.CheckGlobalThis", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<sample:5>", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CheckGlobalThis", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<null>", "<sample:0>", "<sample:0>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CheckGlobalThis", "com.google.javascript.jscomp.CheckGlobalThis", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<sample:5>", "<sample:2>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CheckGlobalThis", "com.google.javascript.jscomp.CheckGlobalThis", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<null>", "<sample:7>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.CheckGlobalThis", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<null>", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CheckGlobalThis", "com.google.javascript.jscomp.CheckGlobalThis", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:6>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CheckGlobalThis", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:2>", "<sample:4>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CheckGlobalThis", "com.google.javascript.jscomp.CheckGlobalThis", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<null>", "<sample:5>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.CheckGlobalThis", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<null>", "<sample:6>", "<sample:6>"}, {"com.google.javascript.jscomp.CheckGlobalThis", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:5>", "<sample:6>"}, {"com.google.javascript.jscomp.CheckGlobalThis", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:7>", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RuntimeTypeCheck", "com.google.javascript.jscomp.RuntimeTypeCheck", "getBoilerplateCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String"}, new String[]{"<sample:1>", "1.5e300"}, true), new String[][]{{"isSyntheticBlock", "", "4"}, {"getAncestors", "", "7"}, {"iterator", "", "4"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RuntimeTypeCheck", "com.google.javascript.jscomp.RuntimeTypeCheck", "getBoilerplateCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String"}, new String[]{"<sample:2>", "2030-02-30T25:6:610xFFFFFFFF"}, true), new String[][]{{"getExistingIntProp", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CheckGlobalThis", "com.google.javascript.jscomp.CheckGlobalThis", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<null>", "<sample:5>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RuntimeTypeCheck", "com.google.javascript.jscomp.RuntimeTypeCheck", "getBoilerplateCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String"}, new String[]{"<null>", "-1.5"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CheckGlobalThis", "com.google.javascript.jscomp.CheckGlobalThis", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<null>", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CheckGlobalThis", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:6>", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RuntimeTypeCheck", "com.google.javascript.jscomp.RuntimeTypeCheck", "getBoilerplateCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String"}, new String[]{"<sample:3>", "1.5e300"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BLOCK [sourcename:  [synthetic] ] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getString=!UnsupportedOperationException, getType=125, ...#402#1502236983", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RuntimeTypeCheck", "com.google.javascript.jscomp.RuntimeTypeCheck", "getBoilerplateCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String"}, new String[]{"<sample:1>", "xsCbv-o"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT 1 [sourcename:  [synthetic] ] [jsdoc_info: JSDocInfo] [synthetic: 1] [sourcefile:  [synthetic] ] {getCharno=0, getChildCount=35, getDouble=!UnsupportedOperationException, getLineno=1, getQualif...#469#2005817914", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CheckGlobalThis", "com.google.javascript.jscomp.CheckGlobalThis", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<null>", "<sample:6>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.CheckGlobalThis", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:2>", "<null>"}, {"com.google.javascript.jscomp.CheckGlobalThis", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:0>", "<sample:5>"}, {"com.google.javascript.jscomp.CheckGlobalThis", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<null>", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RuntimeTypeCheck", "com.google.javascript.jscomp.RuntimeTypeCheck", "getBoilerplateCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String"}, new String[]{"<sample:2>", "PT1H"}, true, 0, null, 1), new String[][]{{"getAncestor", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RuntimeTypeCheck", "com.google.javascript.jscomp.RuntimeTypeCheck", "getBoilerplateCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String"}, new String[]{"<sample:1>", "[1,2]"}, true, 0, null, 1), new String[][]{{"getFirstChild", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("VAR 25 [sourcefile:  [synthetic] ] {getCharno=0, getChildCount=1, getDouble=!UnsupportedOperationException, getLineno=25, getQualifiedName=null, getString=!UnsupportedOperationException, getType=118, ...#400#1231456417", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RuntimeTypeCheck", "com.google.javascript.jscomp.RuntimeTypeCheck", "getBoilerplateCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String"}, new String[]{"<sample:1>", "[1,2]"}, true, 0, null, 1), new String[][]{{"appendStringTree", "java.lang.Appendable", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT 1 [sourcename:  [synthetic] ] [jsdoc_info: JSDocInfo] [synthetic: 1] [sourcefile:  [synthetic] ] {getCharno=0, getChildCount=35, getDouble=!UnsupportedOperationException, getLineno=1, getQualif...#469#2005817914", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RuntimeTypeCheck", "com.google.javascript.jscomp.RuntimeTypeCheck", "getBoilerplateCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String"}, new String[]{"<sample:6>", "checkType"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RuntimeTypeCheck", "com.google.javascript.jscomp.RuntimeTypeCheck", "getBoilerplateCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String"}, new String[]{"<sample:3>", "checkType"}, true, 0, null, 3), new String[][]{{"removeProp", "int", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BLOCK [sourcename:  [synthetic] ] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getString=!UnsupportedOperationException, getType=125, ...#402#1502236983", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RuntimeTypeCheck", "com.google.javascript.jscomp.RuntimeTypeCheck", "getBoilerplateCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String"}, new String[]{"<sample:0>", "checkType"}, true, 0, null, 3), new String[][]{{"getFirstChild", "", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RuntimeTypeCheck", "com.google.javascript.jscomp.RuntimeTypeCheck", "getBoilerplateCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String"}, new String[]{"<sample:1>", "jtconip"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT 1 [sourcename:  [synthetic] ] [jsdoc_info: JSDocInfo] [synthetic: 1] [sourcefile:  [synthetic] ] {getCharno=0, getChildCount=35, getDouble=!UnsupportedOperationException, getLineno=1, getQualif...#469#2005817914", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RuntimeTypeCheck", "com.google.javascript.jscomp.RuntimeTypeCheck", "getBoilerplateCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String"}, new String[]{"<sample:0>", " 1.12345678"}, true, 0, null, 3), new String[][]{{"isQuotedString", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RuntimeTypeCheck", "com.google.javascript.jscomp.RuntimeTypeCheck", "getBoilerplateCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String"}, new String[]{"<sample:7>", "--1"}, true, 0, null, 3), new String[][]{{"putProp", "int,java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BLOCK [enum: c] [sourcename:  [synthetic] ] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getString=!UnsupportedOperationException, get...#412#-1496885445", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CheckGlobalThis", "com.google.javascript.jscomp.CheckGlobalThis", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<null>", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CheckGlobalThis", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:4>", "<null>"}, {"com.google.javascript.jscomp.CheckGlobalThis", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:1>", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RuntimeTypeCheck", "com.google.javascript.jscomp.RuntimeTypeCheck", "getBoilerplateCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String"}, new String[]{"<sample:5>", "jsco\rp_rumtmeTypeCheck_"}, true, 0, null, 2), new String[][]{{"getChildCount", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RuntimeTypeCheck", "com.google.javascript.jscomp.RuntimeTypeCheck", "getBoilerplateCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String"}, new String[]{"<sample:2>", "-1.5"}, true, 0, null, 2), new String[][]{{"isQuotedString", "", "4"}, {"hasChildren", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RuntimeTypeCheck", "com.google.javascript.jscomp.RuntimeTypeCheck", "getBoilerplateCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String"}, new String[]{"<sample:2>", "0"}, true, 0, null, 2), new String[][]{{"isEquivalentTo", "com.google.javascript.rhino.Node", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RuntimeTypeCheck", "com.google.javascript.jscomp.RuntimeTypeCheck", "getBoilerplateCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String"}, new String[]{"<sample:1>", "0"}, true, 0, null, 2), new String[][]{{"isEquivalentTo", "com.google.javascript.rhino.Node", "5"}, {"putProp", "int,java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RuntimeTypeCheck", "com.google.javascript.jscomp.RuntimeTypeCheck", "getBoilerplateCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String"}, new String[]{"<sample:1>", "PT1H"}, true, 0, null, 2), new String[][]{{"getChildAtIndex", "int", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("EXPR_RESULT 55 [sourcefile:  [synthetic] ] {getCharno=0, getChildCount=1, getDouble=!UnsupportedOperationException, getLineno=55, getQualifiedName=null, getString=!UnsupportedOperationException, getTy...#408#461257777", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.RuntimeTypeCheck", "com.google.javascript.jscomp.RuntimeTypeCheck", "getBoilerplateCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String"}, new String[]{"<sample:2>", ".611,2T]\t"}, true, 0, null, 3), new String[][]{{"detachFromParent", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
}
