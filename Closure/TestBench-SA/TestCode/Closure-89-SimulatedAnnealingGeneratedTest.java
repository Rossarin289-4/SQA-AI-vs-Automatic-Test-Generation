package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameForest", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameForest", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameForest", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set"}, new String[]{"<sample:4>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", "com.google.javascript.jscomp.Scope,java.util.Set", "<sample:6>", "<empty>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set"}, new String[]{"<sample:6>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set"}, new String[]{"<sample:5>", "<sample:2>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set"}, new String[]{"<sample:2>", "<sample:0>"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set"}, new String[]{"<sample:3>", "<sample:0>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CollapseProperties", "com.google.javascript.jscomp.CollapseProperties", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:3>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameForest", new String[]{}, new String[]{}, false), new String[][]{{"remove", "int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CollapseProperties", "com.google.javascript.jscomp.CollapseProperties", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<sample:0>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.CollapseProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:2>"}, {"com.google.javascript.jscomp.CollapseProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<null>", "<sample:7>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CollapseProperties", "com.google.javascript.jscomp.CollapseProperties", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<sample:0>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.CollapseProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:2>"}, {"com.google.javascript.jscomp.CollapseProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<null>", "<sample:7>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CollapseProperties", "com.google.javascript.jscomp.CollapseProperties", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<null>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.CollapseProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<null>", "<sample:3>"}, {"com.google.javascript.jscomp.CollapseProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:2>"}, {"com.google.javascript.jscomp.CollapseProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:8>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CollapseProperties", "com.google.javascript.jscomp.CollapseProperties", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:9>", "<sample:6>"}, false, 5, new String[][]{}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CollapseProperties", "com.google.javascript.jscomp.CollapseProperties", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:8>", "<sample:10>"}, false, 13, new String[][]{{"com.google.javascript.jscomp.CollapseProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:2>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CollapseProperties", "com.google.javascript.jscomp.CollapseProperties", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<sample:5>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.CollapseProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:1>"}, {"com.google.javascript.jscomp.CollapseProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:4>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CollapseProperties", "com.google.javascript.jscomp.CollapseProperties", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:8>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CollapseProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:9>", "<sample:6>"}, {"com.google.javascript.jscomp.CollapseProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:8>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set"}, new String[]{"<sample:4>", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", "com.google.javascript.jscomp.Scope,java.util.Set", "<sample:2>", "<sample:3>"}, {"com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", ""}, {"com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", "com.google.javascript.jscomp.Scope,java.util.Set", "<sample:0>", "<sample:2>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set"}, new String[]{"<sample:3>", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", "com.google.javascript.jscomp.Scope,java.util.Set", "<sample:2>", "<sample:3>"}, {"com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", ""}, {"com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", "com.google.javascript.jscomp.Scope,java.util.Set", "<sample:2>", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set"}, new String[]{"<null>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getNameForest", ""}, {"com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", "com.google.javascript.jscomp.Scope,java.util.Set", "<sample:6>", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", ""}, {"com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", "com.google.javascript.jscomp.Scope,java.util.Set", "<sample:6>", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CollapseProperties", "com.google.javascript.jscomp.CollapseProperties", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<null>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.CollapseProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:8>"}, {"com.google.javascript.jscomp.CollapseProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:9>", "<sample:9>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CollapseProperties", "com.google.javascript.jscomp.CollapseProperties", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:10>", "<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameForest", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"removeAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameForest", new String[]{}, new String[]{}, false), new String[][]{{"contains", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", ""}, {"com.google.javascript.jscomp.GlobalNamespace", "getNameForest", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CollapseProperties", "com.google.javascript.jscomp.CollapseProperties", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:8>", "<sample:10>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.CollapseProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:2>"}, {"com.google.javascript.jscomp.CollapseProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:3>"}, {"com.google.javascript.jscomp.CollapseProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:9>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set"}, new String[]{"<sample:6>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getNameForest", ""}, {"com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameForest", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"listIterator", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", new String[]{}, new String[]{}, false), new String[][]{{"putAll", "java.util.Map", "5"}, {"values", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$Values", actual.getClass().getName());
  assertEquals("[0, sample, a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", ""}}), new String[][]{{"isEmpty", "", "4"}, {"remove", "java.lang.Object", "5"}, {"containsValue", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameForest", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set"}, new String[]{"<null>", "<empty>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getNameForest", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getNameForest", ""}, {"com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", ""}}), new String[][]{{"values", "", "0"}, {"addAll", "java.util.Collection", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getNameForest", ""}, {"com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", ""}}, 2), new String[][]{{"values", "", "0"}, {"addAll", "java.util.Collection", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", ""}}), new String[][]{{"replace", "java.lang.Object,java.lang.Object", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", "com.google.javascript.jscomp.Scope,java.util.Set", "<sample:3>", "<sample:3>"}}), new String[][]{{"isEmpty", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", "com.google.javascript.jscomp.Scope,java.util.Set", "<sample:0>", "<empty>"}, {"com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", ""}}), new String[][]{{"isEmpty", "", "2"}, {"values", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$Values", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", ""}}), new String[][]{{"entrySet", "", "6"}, {"isEmpty", "", "1"}, {"size", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getNameForest", ""}}, 1), new String[][]{{"isEmpty", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", "com.google.javascript.jscomp.Scope,java.util.Set", "<sample:1>", "<sample:3>"}}, 2), new String[][]{{"putAll", "java.util.Map", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{key0=sample}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", "com.google.javascript.jscomp.Scope,java.util.Set", "<sample:0>", "<empty>"}}, 1), new String[][]{{"putAll", "java.util.Map", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{key0=sample}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", "com.google.javascript.jscomp.Scope,java.util.Set", "<sample:0>", "<empty>"}}, 1), new String[][]{{"putAll", "java.util.Map", "3"}, {"putAll", "java.util.Map", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getNameForest", ""}, {"com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", "com.google.javascript.jscomp.Scope,java.util.Set", "<sample:1>", "<empty>"}}, 3), new String[][]{{"putAll", "java.util.Map", "3"}, {"putAll", "java.util.Map", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", new String[]{}, new String[]{}, false, 22, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getNameForest", ""}}, 1), new String[][]{{"getOrDefault", "java.lang.Object,java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameForest", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", ""}, {"com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", ""}}, 3), new String[][]{{"add", "java.lang.Object", "3"}, {"ensureCapacity", "int", "3"}, {"contains", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"putAll", "java.util.Map", "0"}, {"replace", "java.lang.Object,java.lang.Object", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"putAll", "java.util.Map", "0"}, {"replace", "java.lang.Object,java.lang.Object", "7"}, {"clone", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{key0=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameForest", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameForest", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2), new String[][]{{"lastIndexOf", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameForest", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2), new String[][]{{"add", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameForest", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", ""}}), new String[][]{{"indexOf", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameForest", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", "com.google.javascript.jscomp.Scope,java.util.Set", "<sample:6>", "<null>"}}, 2), new String[][]{{"remove", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameForest", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getNameForest", ""}, {"com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", "com.google.javascript.jscomp.Scope,java.util.Set", "<sample:7>", "<sample:3>"}}, 3), new String[][]{{"lastIndexOf", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameForest", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", "com.google.javascript.jscomp.Scope,java.util.Set", "<sample:3>", "<sample:3>"}, {"com.google.javascript.jscomp.GlobalNamespace", "getNameForest", ""}}, 3), new String[][]{{"addAll", "int,java.util.Collection", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"containsKey", "java.lang.Object", "0"}, {"getOrDefault", "java.lang.Object,java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getNameForest", ""}, {"com.google.javascript.jscomp.GlobalNamespace", "getNameForest", ""}}, 2), new String[][]{{"replace", "java.lang.Object,java.lang.Object", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", ""}}, 3), new String[][]{{"put", "java.lang.Object,java.lang.Object", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", ""}, {"com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", ""}}, 3), new String[][]{{"replace", "java.lang.Object,java.lang.Object,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameForest", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getNameForest", ""}}), new String[][]{{"add", "int,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[2]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameForest", new String[]{}, new String[]{}, false, 10, new String[][]{}), new String[][]{{"isEmpty", "", "6"}, {"remove", "java.lang.Object", "7"}, {"listIterator", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameForest", new String[]{}, new String[]{}, false, 10, new String[][]{}, 3), new String[][]{{"listIterator", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getNameForest", ""}}, 3), new String[][]{{"remove", "java.lang.Object", "4"}, {"get", "java.lang.Object", "3"}, {"keySet", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getNameForest", ""}, {"com.google.javascript.jscomp.GlobalNamespace", "getNameForest", ""}}, 3), new String[][]{{"remove", "java.lang.Object", "4"}, {"get", "java.lang.Object", "3"}, {"keySet", "", "0"}, {"add", "java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getNameForest", ""}, {"com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", ""}}, 2), new String[][]{{"containsValue", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getNameForest", ""}, {"com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", ""}}, 2), new String[][]{{"containsValue", "java.lang.Object", "2"}, {"isEmpty", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameForest", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", "com.google.javascript.jscomp.Scope,java.util.Set", "<sample:1>", "<empty>"}}), new String[][]{{"indexOf", "java.lang.Object", "0"}, {"size", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameForest", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", "com.google.javascript.jscomp.Scope,java.util.Set", "<sample:7>", "<null>"}, {"com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", ""}}, 1), new String[][]{{"lastIndexOf", "java.lang.Object", "6"}, {"lastIndexOf", "java.lang.Object", "7"}, {"retainAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameForest", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", ""}}), new String[][]{{"iterator", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameForest", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", ""}}), new String[][]{{"iterator", "", "2"}, {"remove", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set"}, new String[]{"<null>", "<sample:1>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", "com.google.javascript.jscomp.Scope,java.util.Set", "<sample:4>", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameForest", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1), new String[][]{{"set", "int,java.lang.Object", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", "com.google.javascript.jscomp.Scope,java.util.Set", "<sample:3>", "<empty>"}}, 3), new String[][]{{"entrySet", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$EntrySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameForest", new String[]{}, new String[]{}, false, 21, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", ""}}, 1), new String[][]{{"add", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"values", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$Values", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set"}, new String[]{"<null>", "<sample:3>"}, false, 8, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", ""}, {"com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getNameForest", ""}}, 3), new String[][]{{"putIfAbsent", "java.lang.Object,java.lang.Object", "4"}, {"size", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameForest", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", "com.google.javascript.jscomp.Scope,java.util.Set", "<sample:5>", "<null>"}}, 3), new String[][]{{"addAll", "java.util.Collection", "3"}, {"clone", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameForest", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getNameForest", ""}}, 1), new String[][]{{"iterator", "", "4"}, {"hasNext", "", "1"}, {"next", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameForest", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getNameForest", ""}}, 2), new String[][]{{"size", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameForest", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"addAll", "java.util.Collection", "4"}, {"ensureCapacity", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[, a]", SearchInputFactory_scaffolding.observe(actual));
 }
}
