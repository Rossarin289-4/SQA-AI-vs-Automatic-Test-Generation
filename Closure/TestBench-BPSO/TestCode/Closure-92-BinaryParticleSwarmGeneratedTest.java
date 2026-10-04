package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessClosurePrimitives", "com.google.javascript.jscomp.ProcessClosurePrimitives", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:2>"}, false, 4, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessClosurePrimitives", "com.google.javascript.jscomp.ProcessClosurePrimitives", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:1>", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ProcessClosurePrimitives", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:7>", "<sample:7>"}, {"com.google.javascript.jscomp.ProcessClosurePrimitives", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:2>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessClosurePrimitives", "com.google.javascript.jscomp.ProcessClosurePrimitives", "getExportedVariableNames", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.ProcessClosurePrimitives", "getExportedVariableNames", ""}, {"com.google.javascript.jscomp.ProcessClosurePrimitives", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.util.HashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessClosurePrimitives", "com.google.javascript.jscomp.ProcessClosurePrimitives", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:4>", "<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessClosurePrimitives", "com.google.javascript.jscomp.ProcessClosurePrimitives", "getExportedVariableNames", new String[]{}, new String[]{}, false), new String[][]{{"add", "java.lang.Object", "2"}, {"removeAll", "java.util.Collection", "6"}, {"size", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessClosurePrimitives", "com.google.javascript.jscomp.ProcessClosurePrimitives", "getExportedVariableNames", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.ProcessClosurePrimitives", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:7>"}}), new String[][]{{"addAll", "java.util.Collection", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessClosurePrimitives", "com.google.javascript.jscomp.ProcessClosurePrimitives", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<sample:2>"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessClosurePrimitives", "com.google.javascript.jscomp.ProcessClosurePrimitives", "getExportedVariableNames", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1), new String[][]{{"remove", "java.lang.Object", "4"}, {"size", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessClosurePrimitives", "com.google.javascript.jscomp.ProcessClosurePrimitives", "getExportedVariableNames", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"remove", "java.lang.Object", "6"}, {"containsAll", "java.util.Collection", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessClosurePrimitives", "com.google.javascript.jscomp.ProcessClosurePrimitives", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:5>", "<sample:10>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessClosurePrimitives", "com.google.javascript.jscomp.ProcessClosurePrimitives", "getExportedVariableNames", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.ProcessClosurePrimitives", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:0>"}}, 1), new String[][]{{"clone", "", "2"}, {"clear", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.HashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessClosurePrimitives", "com.google.javascript.jscomp.ProcessClosurePrimitives", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<sample:2>"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessClosurePrimitives", "com.google.javascript.jscomp.ProcessClosurePrimitives", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:2>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ProcessClosurePrimitives", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<null>"}, {"com.google.javascript.jscomp.ProcessClosurePrimitives", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<null>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessClosurePrimitives", "com.google.javascript.jscomp.ProcessClosurePrimitives", "getExportedVariableNames", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.ProcessClosurePrimitives", "getExportedVariableNames", ""}, {"com.google.javascript.jscomp.ProcessClosurePrimitives", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:8>"}}), new String[][]{{"add", "java.lang.Object", "3"}, {"clone", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.HashSet", actual.getClass().getName());
  assertEquals("[2]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessClosurePrimitives", "com.google.javascript.jscomp.ProcessClosurePrimitives", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<null>", "<sample:3>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.ProcessClosurePrimitives", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessClosurePrimitives", "com.google.javascript.jscomp.ProcessClosurePrimitives", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:4>", "<sample:6>"}, false, 3, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessClosurePrimitives", "com.google.javascript.jscomp.ProcessClosurePrimitives", "getExportedVariableNames", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.ProcessClosurePrimitives", "getExportedVariableNames", ""}, {"com.google.javascript.jscomp.ProcessClosurePrimitives", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:1>", "<sample:5>"}}), new String[][]{{"iterator", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessClosurePrimitives", "com.google.javascript.jscomp.ProcessClosurePrimitives", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<sample:5>", "<null>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.ProcessClosurePrimitives", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:6>", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessClosurePrimitives", "com.google.javascript.jscomp.ProcessClosurePrimitives", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<sample:7>"}, false, 6, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessClosurePrimitives", "com.google.javascript.jscomp.ProcessClosurePrimitives", "getExportedVariableNames", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.ProcessClosurePrimitives", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:8>"}}, 2), new String[][]{{"remove", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessClosurePrimitives", "com.google.javascript.jscomp.ProcessClosurePrimitives", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:4>", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ProcessClosurePrimitives", "getExportedVariableNames", ""}, {"com.google.javascript.jscomp.ProcessClosurePrimitives", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessClosurePrimitives", "com.google.javascript.jscomp.ProcessClosurePrimitives", "getExportedVariableNames", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.ProcessClosurePrimitives", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:2>", "<sample:2>"}, {"com.google.javascript.jscomp.ProcessClosurePrimitives", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:5>", "<sample:0>"}}), new String[][]{{"size", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessClosurePrimitives", "com.google.javascript.jscomp.ProcessClosurePrimitives", "getExportedVariableNames", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.ProcessClosurePrimitives", "getExportedVariableNames", ""}}, 2), new String[][]{{"iterator", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessClosurePrimitives", "com.google.javascript.jscomp.ProcessClosurePrimitives", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:5>", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ProcessClosurePrimitives", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:5>"}, {"com.google.javascript.jscomp.ProcessClosurePrimitives", "getExportedVariableNames", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessClosurePrimitives", "com.google.javascript.jscomp.ProcessClosurePrimitives", "getExportedVariableNames", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"retainAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessClosurePrimitives", "com.google.javascript.jscomp.ProcessClosurePrimitives", "getExportedVariableNames", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.ProcessClosurePrimitives", "getExportedVariableNames", ""}}), new String[][]{{"iterator", "", "7"}, {"remove", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessClosurePrimitives", "com.google.javascript.jscomp.ProcessClosurePrimitives", "getExportedVariableNames", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.ProcessClosurePrimitives", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:3>", "<sample:5>"}, {"com.google.javascript.jscomp.ProcessClosurePrimitives", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:6>", "<sample:4>"}}, 3), new String[][]{{"clear", "", "3"}, {"iterator", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessClosurePrimitives", "com.google.javascript.jscomp.ProcessClosurePrimitives", "getExportedVariableNames", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.ProcessClosurePrimitives", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:1>"}}, 1), new String[][]{{"addAll", "java.util.Collection", "7"}, {"clone", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.HashSet", actual.getClass().getName());
  assertEquals("[, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessClosurePrimitives", "com.google.javascript.jscomp.ProcessClosurePrimitives", "getExportedVariableNames", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.ProcessClosurePrimitives", "getExportedVariableNames", ""}}, 2), new String[][]{{"clear", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.HashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessClosurePrimitives", "com.google.javascript.jscomp.ProcessClosurePrimitives", "getExportedVariableNames", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2), new String[][]{{"add", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessClosurePrimitives", "com.google.javascript.jscomp.ProcessClosurePrimitives", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ProcessClosurePrimitives", "getExportedVariableNames", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessClosurePrimitives", "com.google.javascript.jscomp.ProcessClosurePrimitives", "getExportedVariableNames", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"isEmpty", "", "6"}, {"add", "java.lang.Object", "2"}, {"clone", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.HashSet", actual.getClass().getName());
  assertEquals("[b]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessClosurePrimitives", "com.google.javascript.jscomp.ProcessClosurePrimitives", "getExportedVariableNames", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.ProcessClosurePrimitives", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:6>"}}, 3), new String[][]{{"isEmpty", "", "7"}, {"clone", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.HashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessClosurePrimitives", "com.google.javascript.jscomp.ProcessClosurePrimitives", "getExportedVariableNames", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.ProcessClosurePrimitives", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:0>"}}), new String[][]{{"add", "java.lang.Object", "0"}, {"iterator", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessClosurePrimitives", "com.google.javascript.jscomp.ProcessClosurePrimitives", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessClosurePrimitives", "com.google.javascript.jscomp.ProcessClosurePrimitives", "getExportedVariableNames", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.ProcessClosurePrimitives", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<null>", "<sample:6>", "<sample:3>"}}, 3), new String[][]{{"removeAll", "java.util.Collection", "7"}, {"size", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessClosurePrimitives", "com.google.javascript.jscomp.ProcessClosurePrimitives", "getExportedVariableNames", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.ProcessClosurePrimitives", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:1>", "<sample:5>"}}, 2), new String[][]{{"size", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessClosurePrimitives", "com.google.javascript.jscomp.ProcessClosurePrimitives", "getExportedVariableNames", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.ProcessClosurePrimitives", "getExportedVariableNames", ""}}, 2), new String[][]{{"addAll", "java.util.Collection", "1"}, {"clone", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.HashSet", actual.getClass().getName());
  assertEquals("[0, a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessClosurePrimitives", "com.google.javascript.jscomp.ProcessClosurePrimitives", "getExportedVariableNames", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"isEmpty", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessClosurePrimitives", "com.google.javascript.jscomp.ProcessClosurePrimitives", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<null>"}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessClosurePrimitives", "com.google.javascript.jscomp.ProcessClosurePrimitives", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<null>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.ProcessClosurePrimitives", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:0>", "<sample:9>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessClosurePrimitives", "com.google.javascript.jscomp.ProcessClosurePrimitives", "getExportedVariableNames", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.ProcessClosurePrimitives", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:6>"}}, 1), new String[][]{{"clone", "", "5"}, {"addAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessClosurePrimitives", "com.google.javascript.jscomp.ProcessClosurePrimitives", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<null>", "<sample:3>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.ProcessClosurePrimitives", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:6>", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessClosurePrimitives", "com.google.javascript.jscomp.ProcessClosurePrimitives", "getExportedVariableNames", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.ProcessClosurePrimitives", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:6>"}}, 1), new String[][]{{"contains", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessClosurePrimitives", "com.google.javascript.jscomp.ProcessClosurePrimitives", "getExportedVariableNames", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2), new String[][]{{"iterator", "", "1"}, {"remove", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessClosurePrimitives", "com.google.javascript.jscomp.ProcessClosurePrimitives", "getExportedVariableNames", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.ProcessClosurePrimitives", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:4>", "<sample:3>"}, {"com.google.javascript.jscomp.ProcessClosurePrimitives", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:4>", "<sample:3>"}}, 3), new String[][]{{"addAll", "java.util.Collection", "1"}, {"remove", "java.lang.Object", "7"}, {"size", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessClosurePrimitives", "com.google.javascript.jscomp.ProcessClosurePrimitives", "getExportedVariableNames", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.ProcessClosurePrimitives", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:1>", "<sample:1>"}}, 1), new String[][]{{"clone", "", "0"}, {"addAll", "java.util.Collection", "3"}, {"size", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessClosurePrimitives", "com.google.javascript.jscomp.ProcessClosurePrimitives", "getExportedVariableNames", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"removeAll", "java.util.Collection", "0"}, {"iterator", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessClosurePrimitives", "com.google.javascript.jscomp.ProcessClosurePrimitives", "getExportedVariableNames", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"add", "java.lang.Object", "7"}, {"clone", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.HashSet", actual.getClass().getName());
  assertEquals("[true]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessClosurePrimitives", "com.google.javascript.jscomp.ProcessClosurePrimitives", "getExportedVariableNames", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.ProcessClosurePrimitives", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:3>"}}, 1), new String[][]{{"iterator", "", "2"}, {"next", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessClosurePrimitives", "com.google.javascript.jscomp.ProcessClosurePrimitives", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<null>", "<sample:5>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessClosurePrimitives", "com.google.javascript.jscomp.ProcessClosurePrimitives", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<null>", "<sample:1>"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ProcessClosurePrimitives", "com.google.javascript.jscomp.ProcessClosurePrimitives", "getExportedVariableNames", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.ProcessClosurePrimitives", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<null>"}}, 3), new String[][]{{"add", "java.lang.Object", "5"}, {"clone", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.HashSet", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
 }
}
