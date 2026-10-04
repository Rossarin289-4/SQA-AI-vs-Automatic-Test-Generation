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
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MinimizeExitPoints", "com.google.javascript.jscomp.MinimizeExitPoints", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<null>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.MinimizeExitPoints", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MinimizeExitPoints", "com.google.javascript.jscomp.MinimizeExitPoints", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<sample:1>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.MinimizeExitPoints", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:3>", "<sample:5>"}, {"com.google.javascript.jscomp.MinimizeExitPoints", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:3>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MinimizeExitPoints", "com.google.javascript.jscomp.MinimizeExitPoints", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<sample:4>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.MinimizeExitPoints", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:3>", "<sample:5>"}, {"com.google.javascript.jscomp.MinimizeExitPoints", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:3>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MinimizeExitPoints", "com.google.javascript.jscomp.MinimizeExitPoints", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<sample:5>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MinimizeExitPoints", "com.google.javascript.jscomp.MinimizeExitPoints", "tryMinimizeExits", new String[]{"com.google.javascript.rhino.Node", "int", "java.lang.String"}, new String[]{"<sample:1>", "0", "1L"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MinimizeExitPoints", "com.google.javascript.jscomp.MinimizeExitPoints", "tryMinimizeExits", new String[]{"com.google.javascript.rhino.Node", "int", "java.lang.String"}, new String[]{"<sample:1>", "0", "1L"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MinimizeExitPoints", "tryMinimizeExits", "com.google.javascript.rhino.Node,int,java.lang.String", "<sample:7>", "-1", "Title"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MinimizeExitPoints", "com.google.javascript.jscomp.MinimizeExitPoints", "tryMinimizeExits", new String[]{"com.google.javascript.rhino.Node", "int", "java.lang.String"}, new String[]{"<sample:1>", "0", "1L12147483648"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MinimizeExitPoints", "tryMinimizeExits", "com.google.javascript.rhino.Node,int,java.lang.String", "<sample:7>", "-1", "Title"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MinimizeExitPoints", "com.google.javascript.jscomp.MinimizeExitPoints", "tryMinimizeExits", new String[]{"com.google.javascript.rhino.Node", "int", "java.lang.String"}, new String[]{"<sample:1>", "-64", "1L12147383648"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MinimizeExitPoints", "tryMinimizeExits", "com.google.javascript.rhino.Node,int,java.lang.String", "<sample:7>", "-1", "Title"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MinimizeExitPoints", "com.google.javascript.jscomp.MinimizeExitPoints", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<sample:6>", "<sample:4>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MinimizeExitPoints", "com.google.javascript.jscomp.MinimizeExitPoints", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<null>", "<sample:4>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.MinimizeExitPoints", "tryMinimizeExits", "com.google.javascript.rhino.Node,int,java.lang.String", "<sample:5>", "10", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MinimizeExitPoints", "com.google.javascript.jscomp.MinimizeExitPoints", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<sample:4>", "<sample:4>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.MinimizeExitPoints", "tryMinimizeExits", "com.google.javascript.rhino.Node,int,java.lang.String", "<sample:5>", "40", "<null>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MinimizeExitPoints", "com.google.javascript.jscomp.MinimizeExitPoints", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:6>", "<sample:4>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.MinimizeExitPoints", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:3>", "<sample:4>"}, {"com.google.javascript.jscomp.MinimizeExitPoints", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:4>", "<null>"}, {"com.google.javascript.jscomp.MinimizeExitPoints", "tryMinimizeExits", "com.google.javascript.rhino.Node,int,java.lang.String", "<sample:5>", "40", "<null>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MinimizeExitPoints", "com.google.javascript.jscomp.MinimizeExitPoints", "tryMinimizeExits", new String[]{"com.google.javascript.rhino.Node", "int", "java.lang.String"}, new String[]{"<sample:3>", "-2147483648", "123456789012345678901234567890"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MinimizeExitPoints", "com.google.javascript.jscomp.MinimizeExitPoints", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:9>", "<sample:1>", "<sample:2>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.MinimizeExitPoints", "tryMinimizeExits", "com.google.javascript.rhino.Node,int,java.lang.String", "<sample:3>", "160", "OU1H"}, {"com.google.javascript.jscomp.MinimizeExitPoints", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:7>"}, {"com.google.javascript.jscomp.MinimizeExitPoints", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:1>", "<sample:6>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MinimizeExitPoints", "com.google.javascript.jscomp.MinimizeExitPoints", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<null>", "<sample:0>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.MinimizeExitPoints", "tryMinimizeExits", "com.google.javascript.rhino.Node,int,java.lang.String", "<sample:2>", "160", "\t\t"}, {"com.google.javascript.jscomp.MinimizeExitPoints", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:0>", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MinimizeExitPoints", "com.google.javascript.jscomp.MinimizeExitPoints", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<sample:1>", "<sample:1>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.MinimizeExitPoints", "tryMinimizeExits", "com.google.javascript.rhino.Node,int,java.lang.String", "<sample:0>", "1", "1.5f"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MinimizeExitPoints", "com.google.javascript.jscomp.MinimizeExitPoints", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<sample:0>", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MinimizeExitPoints", "tryMinimizeExits", "com.google.javascript.rhino.Node,int,java.lang.String", "<null>", "0", "12:30:45"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MinimizeExitPoints", "com.google.javascript.jscomp.MinimizeExitPoints", "tryMinimizeExits", new String[]{"com.google.javascript.rhino.Node", "int", "java.lang.String"}, new String[]{"<null>", "1", "\t"}, false, 5, new String[][]{{"com.google.javascript.jscomp.MinimizeExitPoints", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:3>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MinimizeExitPoints", "com.google.javascript.jscomp.MinimizeExitPoints", "tryMinimizeExits", new String[]{"com.google.javascript.rhino.Node", "int", "java.lang.String"}, new String[]{"<sample:2>", "10", "1.1234567"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MinimizeExitPoints", "tryMinimizeExits", "com.google.javascript.rhino.Node,int,java.lang.String", "<sample:0>", "2147483647", "TITLE"}, {"com.google.javascript.jscomp.MinimizeExitPoints", "tryMinimizeExits", "com.google.javascript.rhino.Node,int,java.lang.String", "<sample:0>", "1", "0"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MinimizeExitPoints", "com.google.javascript.jscomp.MinimizeExitPoints", "tryMinimizeExits", new String[]{"com.google.javascript.rhino.Node", "int", "java.lang.String"}, new String[]{"<sample:8>", "-2147483648", "1.5n"}, false, 6, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MinimizeExitPoints", "com.google.javascript.jscomp.MinimizeExitPoints", "tryMinimizeExits", new String[]{"com.google.javascript.rhino.Node", "int", "java.lang.String"}, new String[]{"<sample:8>", "-2147483648", "hssp:/.examPe.col/a?b=chttp://example.com/a?b=c"}, false, 2, new String[][]{{"com.google.javascript.jscomp.MinimizeExitPoints", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:3>", "<sample:2>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MinimizeExitPoints", "com.google.javascript.jscomp.MinimizeExitPoints", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<null>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MinimizeExitPoints", "com.google.javascript.jscomp.MinimizeExitPoints", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<sample:6>", "<sample:5>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MinimizeExitPoints", "com.google.javascript.jscomp.MinimizeExitPoints", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:12>", "<null>"}, false, 14, new String[][]{{"com.google.javascript.jscomp.MinimizeExitPoints", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<null>", "<sample:1>"}, {"com.google.javascript.jscomp.MinimizeExitPoints", "tryMinimizeExits", "com.google.javascript.rhino.Node,int,java.lang.String", "<sample:3>", "122", "1<.5f+"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MinimizeExitPoints", "com.google.javascript.jscomp.MinimizeExitPoints", "tryMinimizeExits", new String[]{"com.google.javascript.rhino.Node", "int", "java.lang.String"}, new String[]{"<null>", "0", " "}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MinimizeExitPoints", "com.google.javascript.jscomp.MinimizeExitPoints", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<sample:3>", "<sample:3>"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MinimizeExitPoints", "com.google.javascript.jscomp.MinimizeExitPoints", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:8>", "<sample:0>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.MinimizeExitPoints", "tryMinimizeExits", "com.google.javascript.rhino.Node,int,java.lang.String", "<sample:8>", "-2147483648", "-11.1234567"}, {"com.google.javascript.jscomp.MinimizeExitPoints", "tryMinimizeExits", "com.google.javascript.rhino.Node,int,java.lang.String", "<sample:2>", "1", "[1,2]"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MinimizeExitPoints", "com.google.javascript.jscomp.MinimizeExitPoints", "tryMinimizeExits", new String[]{"com.google.javascript.rhino.Node", "int", "java.lang.String"}, new String[]{"<sample:14>", "-2147483648", "-1.55"}, false, 9, new String[][]{{"com.google.javascript.jscomp.MinimizeExitPoints", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:2>", "<sample:3>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MinimizeExitPoints", "com.google.javascript.jscomp.MinimizeExitPoints", "tryMinimizeExits", new String[]{"com.google.javascript.rhino.Node", "int", "java.lang.String"}, new String[]{"<sample:1>", "0", ".6"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MinimizeExitPoints", "tryMinimizeExits", "com.google.javascript.rhino.Node,int,java.lang.String", "<sample:9>", "20", "_"}, {"com.google.javascript.jscomp.MinimizeExitPoints", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:8>", "<sample:13>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MinimizeExitPoints", "com.google.javascript.jscomp.MinimizeExitPoints", "tryMinimizeExits", new String[]{"com.google.javascript.rhino.Node", "int", "java.lang.String"}, new String[]{"<null>", "10", "12:30<45"}, false, 6, new String[][]{{"com.google.javascript.jscomp.MinimizeExitPoints", "tryMinimizeExits", "com.google.javascript.rhino.Node,int,java.lang.String", "<sample:9>", "40", "`"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MinimizeExitPoints", "com.google.javascript.jscomp.MinimizeExitPoints", "tryMinimizeExits", new String[]{"com.google.javascript.rhino.Node", "int", "java.lang.String"}, new String[]{"<null>", "-1", "-0.02020-02-30T25-:61:61"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MinimizeExitPoints", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:5>", "<sample:2>"}, {"com.google.javascript.jscomp.MinimizeExitPoints", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:0>", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MinimizeExitPoints", "com.google.javascript.jscomp.MinimizeExitPoints", "tryMinimizeExits", new String[]{"com.google.javascript.rhino.Node", "int", "java.lang.String"}, new String[]{"<sample:3>", "2147483647", "*"}, false, 9, new String[][]{{"com.google.javascript.jscomp.MinimizeExitPoints", "tryMinimizeExits", "com.google.javascript.rhino.Node,int,java.lang.String", "<sample:1>", "2147483647", "5."}, {"com.google.javascript.jscomp.MinimizeExitPoints", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:6>", "<sample:0>"}, {"com.google.javascript.jscomp.MinimizeExitPoints", "tryMinimizeExits", "com.google.javascript.rhino.Node,int,java.lang.String", "<sample:2>", "-28", "Hello, World"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MinimizeExitPoints", "com.google.javascript.jscomp.MinimizeExitPoints", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:9>", "<null>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.MinimizeExitPoints", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:8>", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MinimizeExitPoints", "com.google.javascript.jscomp.MinimizeExitPoints", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<null>", "<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MinimizeExitPoints", "tryMinimizeExits", "com.google.javascript.rhino.Node,int,java.lang.String", "<sample:8>", "-2147483648", "0}wa233456789"}, {"com.google.javascript.jscomp.MinimizeExitPoints", "tryMinimizeExits", "com.google.javascript.rhino.Node,int,java.lang.String", "<sample:14>", "-2147483648", "C"}, {"com.google.javascript.jscomp.MinimizeExitPoints", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:2>", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MinimizeExitPoints", "com.google.javascript.jscomp.MinimizeExitPoints", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<sample:2>", "<sample:8>"}, false, 15, new String[][]{{"com.google.javascript.jscomp.MinimizeExitPoints", "tryMinimizeExits", "com.google.javascript.rhino.Node,int,java.lang.String", "<sample:8>", "-2147483648", "0}wa33350789"}, {"com.google.javascript.jscomp.MinimizeExitPoints", "tryMinimizeExits", "com.google.javascript.rhino.Node,int,java.lang.String", "<sample:14>", "-2147483648", "0.5"}, {"com.google.javascript.jscomp.MinimizeExitPoints", "tryMinimizeExits", "com.google.javascript.rhino.Node,int,java.lang.String", "<sample:3>", "2147483647", "<null>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.MinimizeExitPoints", "com.google.javascript.jscomp.MinimizeExitPoints", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.MinimizeExitPoints", "tryMinimizeExits", "com.google.javascript.rhino.Node,int,java.lang.String", "<sample:2>", "10", "1.1234567"}, {"com.google.javascript.jscomp.MinimizeExitPoints", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
}
