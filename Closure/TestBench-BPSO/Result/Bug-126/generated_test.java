package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MinimizeExitPoints", "com.google.javascript.jscomp.MinimizeExitPoints", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<sample:4>", "<sample:5>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.MinimizeExitPoints", "tryMinimizeExits", "com.google.javascript.rhino.Node,int,java.lang.String", "<sample:3>", "1073741824", "a,b,c"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MinimizeExitPoints", "com.google.javascript.jscomp.MinimizeExitPoints", "tryMinimizeExits", new String[]{"com.google.javascript.rhino.Node", "int", "java.lang.String"}, new String[]{"<sample:1>", "-2139090944", "1E-5"}, false, 5, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MinimizeExitPoints", "com.google.javascript.jscomp.MinimizeExitPoints", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:6>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MinimizeExitPoints", "com.google.javascript.jscomp.MinimizeExitPoints", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:7>", "<sample:2>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.MinimizeExitPoints", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:6>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MinimizeExitPoints", "com.google.javascript.jscomp.MinimizeExitPoints", "tryMinimizeExits", new String[]{"com.google.javascript.rhino.Node", "int", "java.lang.String"}, new String[]{"<sample:1>", "2147483647", "b,c"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MinimizeExitPoints", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:7>", "<sample:1>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MinimizeExitPoints", "com.google.javascript.jscomp.MinimizeExitPoints", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MinimizeExitPoints", "com.google.javascript.jscomp.MinimizeExitPoints", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<sample:1>"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MinimizeExitPoints", "com.google.javascript.jscomp.MinimizeExitPoints", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<sample:0>", "<sample:1>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MinimizeExitPoints", "com.google.javascript.jscomp.MinimizeExitPoints", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<sample:1>", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MinimizeExitPoints", "tryMinimizeExits", "com.google.javascript.rhino.Node,int,java.lang.String", "<sample:6>", "2147483647", "1.5f-0[.0"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MinimizeExitPoints", "com.google.javascript.jscomp.MinimizeExitPoints", "tryMinimizeExits", new String[]{"com.google.javascript.rhino.Node", "int", "java.lang.String"}, new String[]{"<sample:2>", "2147483647", "2.5"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MinimizeExitPoints", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:8>", "<sample:5>", "<sample:7>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MinimizeExitPoints", "com.google.javascript.jscomp.MinimizeExitPoints", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<sample:2>"}, false, 5, new String[][]{}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MinimizeExitPoints", "com.google.javascript.jscomp.MinimizeExitPoints", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<sample:3>"}, false, 5, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MinimizeExitPoints", "com.google.javascript.jscomp.MinimizeExitPoints", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:9>", "<null>", "<sample:7>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MinimizeExitPoints", "com.google.javascript.jscomp.MinimizeExitPoints", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<sample:2>", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MinimizeExitPoints", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:6>", "<sample:7>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MinimizeExitPoints", "com.google.javascript.jscomp.MinimizeExitPoints", "tryMinimizeExits", new String[]{"com.google.javascript.rhino.Node", "int", "java.lang.String"}, new String[]{"<sample:11>", "-6", "--1.5"}, false, 6, new String[][]{{"com.google.javascript.jscomp.MinimizeExitPoints", "tryMinimizeExits", "com.google.javascript.rhino.Node,int,java.lang.String", "<sample:5>", "10", "SITLE"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MinimizeExitPoints", "com.google.javascript.jscomp.MinimizeExitPoints", "tryMinimizeExits", new String[]{"com.google.javascript.rhino.Node", "int", "java.lang.String"}, new String[]{"<sample:3>", "2147483647", "Hello, World"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MinimizeExitPoints", "com.google.javascript.jscomp.MinimizeExitPoints", "tryMinimizeExits", new String[]{"com.google.javascript.rhino.Node", "int", "java.lang.String"}, new String[]{"<sample:0>", "-1", "true1.25"}, false, 3, new String[][]{{"com.google.javascript.jscomp.MinimizeExitPoints", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:5>"}, {"com.google.javascript.jscomp.MinimizeExitPoints", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:3>", "<sample:4>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MinimizeExitPoints", "com.google.javascript.jscomp.MinimizeExitPoints", "tryMinimizeExits", new String[]{"com.google.javascript.rhino.Node", "int", "java.lang.String"}, new String[]{"<null>", "-2", "1.5d1.1234567890123456"}, false, 1, new String[][]{{"com.google.javascript.jscomp.MinimizeExitPoints", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<null>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MinimizeExitPoints", "com.google.javascript.jscomp.MinimizeExitPoints", "tryMinimizeExits", new String[]{"com.google.javascript.rhino.Node", "int", "java.lang.String"}, new String[]{"<null>", "524289", "\n"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MinimizeExitPoints", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:7>", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MinimizeExitPoints", "com.google.javascript.jscomp.MinimizeExitPoints", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<sample:3>", "<sample:6>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.MinimizeExitPoints", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:7>", "<sample:7>"}, {"com.google.javascript.jscomp.MinimizeExitPoints", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:0>", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MinimizeExitPoints", "com.google.javascript.jscomp.MinimizeExitPoints", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MinimizeExitPoints", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:2>", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MinimizeExitPoints", "com.google.javascript.jscomp.MinimizeExitPoints", "tryMinimizeExits", new String[]{"com.google.javascript.rhino.Node", "int", "java.lang.String"}, new String[]{"<null>", "2147483647", "010a,b,c[1,2]"}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MinimizeExitPoints", "com.google.javascript.jscomp.MinimizeExitPoints", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<sample:1>", "<sample:6>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.MinimizeExitPoints", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:1>", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MinimizeExitPoints", "com.google.javascript.jscomp.MinimizeExitPoints", "tryMinimizeExits", new String[]{"com.google.javascript.rhino.Node", "int", "java.lang.String"}, new String[]{"<sample:1>", "0", "1E-6"}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MinimizeExitPoints", "com.google.javascript.jscomp.MinimizeExitPoints", "tryMinimizeExits", new String[]{"com.google.javascript.rhino.Node", "int", "java.lang.String"}, new String[]{"<sample:3>", "2147483647", "a 2b"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MinimizeExitPoints", "com.google.javascript.jscomp.MinimizeExitPoints", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<null>", "<sample:4>"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MinimizeExitPoints", "com.google.javascript.jscomp.MinimizeExitPoints", "tryMinimizeExits", new String[]{"com.google.javascript.rhino.Node", "int", "java.lang.String"}, new String[]{"<null>", "2147483647", "TT1H"}, false, 3, new String[][]{{"com.google.javascript.jscomp.MinimizeExitPoints", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MinimizeExitPoints", "com.google.javascript.jscomp.MinimizeExitPoints", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<null>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.MinimizeExitPoints", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<null>", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MinimizeExitPoints", "com.google.javascript.jscomp.MinimizeExitPoints", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<null>", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MinimizeExitPoints", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:2>", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MinimizeExitPoints", "com.google.javascript.jscomp.MinimizeExitPoints", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<null>", "<sample:1>"}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MinimizeExitPoints", "com.google.javascript.jscomp.MinimizeExitPoints", "tryMinimizeExits", new String[]{"com.google.javascript.rhino.Node", "int", "java.lang.String"}, new String[]{"<sample:1>", "0", "1.1234567a0x1F"}, false, 4, new String[][]{{"com.google.javascript.jscomp.MinimizeExitPoints", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MinimizeExitPoints", "com.google.javascript.jscomp.MinimizeExitPoints", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<null>", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MinimizeExitPoints", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:5>"}, {"com.google.javascript.jscomp.MinimizeExitPoints", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:6>", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MinimizeExitPoints", "com.google.javascript.jscomp.MinimizeExitPoints", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MinimizeExitPoints", "tryMinimizeExits", "com.google.javascript.rhino.Node,int,java.lang.String", "<sample:5>", "60", "-1"}, {"com.google.javascript.jscomp.MinimizeExitPoints", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:5>", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MinimizeExitPoints", "com.google.javascript.jscomp.MinimizeExitPoints", "tryMinimizeExits", new String[]{"com.google.javascript.rhino.Node", "int", "java.lang.String"}, new String[]{"<sample:3>", "2147483647", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MinimizeExitPoints", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:6>"}, {"com.google.javascript.jscomp.MinimizeExitPoints", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:3>", "<sample:4>"}});
  assertNull(actual);
 }
}
