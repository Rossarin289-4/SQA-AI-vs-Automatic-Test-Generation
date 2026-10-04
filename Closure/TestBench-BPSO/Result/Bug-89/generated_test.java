package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CollapseProperties", "com.google.javascript.jscomp.CollapseProperties", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CollapseProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<null>", "<sample:5>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameForest", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set"}, new String[]{"<sample:8>", "<empty>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", "com.google.javascript.jscomp.Scope,java.util.Set", "<sample:4>", "<sample:3>"}, {"com.google.javascript.jscomp.GlobalNamespace", "getNameForest", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", new String[]{}, new String[]{}, false), new String[][]{{"getOrDefault", "java.lang.Object,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameForest", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", "com.google.javascript.jscomp.Scope,java.util.Set", "<sample:4>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", ""}}, 1), new String[][]{{"getOrDefault", "java.lang.Object,java.lang.Object", "0"}, {"remove", "java.lang.Object,java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameForest", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getNameForest", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set"}, new String[]{"<null>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameForest", new String[]{}, new String[]{}, false), new String[][]{{"addAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameForest", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", ""}, {"com.google.javascript.jscomp.GlobalNamespace", "getNameForest", ""}}), new String[][]{{"iterator", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"put", "java.lang.Object,java.lang.Object", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CollapseProperties", "com.google.javascript.jscomp.CollapseProperties", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:3>"}, false, 5, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"values", "", "6"}, {"addAll", "java.util.Collection", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameForest", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", "com.google.javascript.jscomp.Scope,java.util.Set", "<sample:5>", "<sample:3>"}}, 2), new String[][]{{"add", "java.lang.Object", "6"}, {"isEmpty", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameForest", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"listIterator", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", new String[]{}, new String[]{}, false), new String[][]{{"remove", "java.lang.Object", "2"}, {"containsValue", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getNameForest", ""}}), new String[][]{{"isEmpty", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CollapseProperties", "com.google.javascript.jscomp.CollapseProperties", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameForest", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getNameForest", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set"}, new String[]{"<sample:0>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", "com.google.javascript.jscomp.Scope,java.util.Set", "<sample:4>", "<sample:1>"}}), new String[][]{{"getOrDefault", "java.lang.Object,java.lang.Object", "4"}, {"entrySet", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$EntrySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getNameForest", ""}}), new String[][]{{"values", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$Values", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", ""}}, 2), new String[][]{{"containsValue", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CollapseProperties", "com.google.javascript.jscomp.CollapseProperties", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:8>", "<sample:8>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.CollapseProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:9>", "<sample:5>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameForest", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", ""}}), new String[][]{{"remove", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CollapseProperties", "com.google.javascript.jscomp.CollapseProperties", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<sample:5>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.CollapseProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:3>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", "com.google.javascript.jscomp.Scope,java.util.Set", "<sample:7>", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameForest", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", ""}, {"com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", ""}}, 2), new String[][]{{"add", "java.lang.Object", "2"}, {"indexOf", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CollapseProperties", "com.google.javascript.jscomp.CollapseProperties", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:7>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.CollapseProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:4>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", "com.google.javascript.jscomp.Scope,java.util.Set", "<sample:3>", "<sample:4>"}}), new String[][]{{"keySet", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameForest", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getNameForest", ""}}), new String[][]{{"set", "int,java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameForest", new String[]{}, new String[]{}, false), new String[][]{{"listIterator", "", "2"}, {"next", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getNameForest", ""}}, 2), new String[][]{{"putIfAbsent", "java.lang.Object,java.lang.Object", "2"}, {"putIfAbsent", "java.lang.Object,java.lang.Object", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set"}, new String[]{"<sample:6>", "<sample:1>"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameForest", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"addAll", "int,java.util.Collection", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameForest", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", "com.google.javascript.jscomp.Scope,java.util.Set", "<null>", "<sample:2>"}}), new String[][]{{"listIterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameForest", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"addAll", "int,java.util.Collection", "2"}, {"subList", "int,int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set"}, new String[]{"<sample:3>", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", "com.google.javascript.jscomp.Scope,java.util.Set", "<sample:3>", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameForest", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getNameForest", ""}}), new String[][]{{"lastIndexOf", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getNameForest", ""}}, 3), new String[][]{{"getOrDefault", "java.lang.Object,java.lang.Object", "2"}, {"containsKey", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameForest", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"indexOf", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", "com.google.javascript.jscomp.Scope,java.util.Set", "<sample:5>", "<null>"}}, 1), new String[][]{{"isEmpty", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", "com.google.javascript.jscomp.Scope,java.util.Set", "<sample:5>", "<sample:1>"}}, 2), new String[][]{{"putAll", "java.util.Map", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{key0=a, key1=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set"}, new String[]{"<sample:4>", "<sample:6>"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set"}, new String[]{"<sample:2>", "<sample:0>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", "com.google.javascript.jscomp.Scope,java.util.Set", "<sample:3>", "<sample:6>"}, {"com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", "com.google.javascript.jscomp.Scope,java.util.Set", "<sample:3>", "<null>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameForest", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", ""}, {"com.google.javascript.jscomp.GlobalNamespace", "getNameForest", ""}}, 1), new String[][]{{"add", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CollapseProperties", "com.google.javascript.jscomp.CollapseProperties", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<null>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.CollapseProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<null>", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameForest", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", ""}}, 2), new String[][]{{"indexOf", "java.lang.Object", "3"}, {"iterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CollapseProperties", "com.google.javascript.jscomp.CollapseProperties", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<null>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.CollapseProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:6>"}, {"com.google.javascript.jscomp.CollapseProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", "com.google.javascript.jscomp.Scope,java.util.Set", "<sample:4>", "<sample:0>"}}, 1), new String[][]{{"replace", "java.lang.Object,java.lang.Object,java.lang.Object", "5"}, {"put", "java.lang.Object,java.lang.Object", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set"}, new String[]{"<null>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getNameForest", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameForest", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2), new String[][]{{"addAll", "int,java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getNameForest", ""}, {"com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", ""}}, 2), new String[][]{{"getOrDefault", "java.lang.Object,java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", "com.google.javascript.jscomp.Scope,java.util.Set", "<sample:9>", "<sample:1>"}}, 2), new String[][]{{"replace", "java.lang.Object,java.lang.Object,java.lang.Object", "0"}, {"getOrDefault", "java.lang.Object,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3), new String[][]{{"entrySet", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$EntrySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getNameForest", ""}}, 2), new String[][]{{"getOrDefault", "java.lang.Object,java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameForest", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", ""}}, 1), new String[][]{{"clear", "", "3"}, {"remove", "int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set"}, new String[]{"<sample:6>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getNameForest", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", ""}, {"com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", ""}}, 1), new String[][]{{"keySet", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameForest", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", "com.google.javascript.jscomp.Scope,java.util.Set", "<null>", "<sample:3>"}, {"com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", "com.google.javascript.jscomp.Scope,java.util.Set", "<sample:2>", "<sample:4>"}}, 1), new String[][]{{"remove", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", ""}, {"com.google.javascript.jscomp.GlobalNamespace", "getNameForest", ""}}, 2), new String[][]{{"putIfAbsent", "java.lang.Object,java.lang.Object", "6"}, {"clone", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", ""}}, 3), new String[][]{{"clone", "", "2"}, {"isEmpty", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameForest", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", "com.google.javascript.jscomp.Scope,java.util.Set", "<sample:2>", "<sample:5>"}, {"com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", "com.google.javascript.jscomp.Scope,java.util.Set", "<sample:0>", "<empty>"}}, 3), new String[][]{{"isEmpty", "", "3"}, {"add", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"entrySet", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$EntrySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getNameForest", ""}}, 3), new String[][]{{"keySet", "", "4"}, {"add", "java.lang.Object", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set"}, new String[]{"<sample:2>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", ""}}, 1), new String[][]{{"get", "java.lang.Object", "4"}, {"values", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$Values", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", "com.google.javascript.jscomp.Scope,java.util.Set", "<sample:9>", "<null>"}, {"com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", ""}}, 3), new String[][]{{"replace", "java.lang.Object,java.lang.Object", "1"}, {"getOrDefault", "java.lang.Object,java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", ""}, {"com.google.javascript.jscomp.GlobalNamespace", "getNameForest", ""}}, 3), new String[][]{{"values", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$Values", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"getOrDefault", "java.lang.Object,java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameForest", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", ""}}, 2), new String[][]{{"listIterator", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set"}, new String[]{"<null>", "<empty>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameForest", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", ""}}, 3), new String[][]{{"listIterator", "", "4"}, {"hasPrevious", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set"}, new String[]{"<null>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getNameForest", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameForest", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", ""}, {"com.google.javascript.jscomp.GlobalNamespace", "getNameForest", ""}}, 1), new String[][]{{"iterator", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameForest", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "scanNewNodes", "com.google.javascript.jscomp.Scope,java.util.Set", "<sample:7>", "<sample:4>"}}, 2), new String[][]{{"iterator", "", "3"}, {"hasNext", "", "7"}, {"next", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameForest", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"indexOf", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CollapseProperties", "com.google.javascript.jscomp.CollapseProperties", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CollapseProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:5>"}, {"com.google.javascript.jscomp.CollapseProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameForest", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", ""}}, 3), new String[][]{{"iterator", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameForest", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"listIterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameForest", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"addAll", "int,java.util.Collection", "2"}, {"listIterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameIndex", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"values", "", "2"}, {"iterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$ValueIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.GlobalNamespace", "com.google.javascript.jscomp.GlobalNamespace", "getNameForest", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"listIterator", "", "3"}, {"remove", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
}
