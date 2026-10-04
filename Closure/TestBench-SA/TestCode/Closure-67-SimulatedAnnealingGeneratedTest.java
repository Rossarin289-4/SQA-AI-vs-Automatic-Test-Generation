package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<sample:6>"}, false, 13, new String[][]{{"com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<sample:8>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", ""}, {"com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<sample:9>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", ""}, {"com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:9>", "<sample:1>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:9>", "<sample:1>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", ""}, {"com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[valueOf, length, toString]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", ""}, {"com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:4>"}}), new String[][]{{"set", "int,java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.AnalyzePrototypeProperties$NameInfo", actual.getClass().getName());
  assertEquals("length", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", ""}, {"com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", new String[]{}, new String[]{}, false), new String[][]{{"clear", "", "7"}, {"ensureCapacity", "int", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", new String[]{}, new String[]{}, false), new String[][]{{"listIterator", "", "1"}, {"set", "java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:9>", "<sample:7>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:9>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:6>"}, {"com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:9>", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", ""}, {"com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[valueOf, length, toString]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", ""}}), new String[][]{{"containsAll", "java.util.Collection", "3"}, {"add", "int,java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[valueOf, key, length, toString]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:5>"}, {"com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:5>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<sample:1>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:5>"}, {"com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[valueOf, length, toString]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<sample:9>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:9>"}, {"com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", ""}, {"com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:3>"}, {"com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[valueOf, length, toString]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:3>"}, {"com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:3>"}, {"com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:2>"}, {"com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", ""}}, 3), new String[][]{{"iterator", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:3>"}, {"com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:2>"}, {"com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", ""}}, 3), new String[][]{{"add", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:3>"}, {"com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:2>"}, {"com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", ""}}, 3), new String[][]{{"listIterator", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:3>"}, {"com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:2>"}, {"com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", ""}}), new String[][]{{"listIterator", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", ""}, {"com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:3>"}, {"com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:3>"}}, 1), new String[][]{{"listIterator", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", ""}, {"com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:3>"}, {"com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", ""}, {"com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", ""}, {"com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", ""}}), new String[][]{{"get", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", ""}, {"com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:7>"}}, 2), new String[][]{{"containsAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", ""}, {"com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<null>", "<sample:7>"}}, 2), new String[][]{{"indexOf", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", new String[]{}, new String[]{}, false), new String[][]{{"remove", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", ""}, {"com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:7>"}, {"com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", ""}}, 3), new String[][]{{"get", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:12>", "<sample:9>"}, {"com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:9>", "<sample:7>"}}, 2), new String[][]{{"get", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:7>"}}, 1), new String[][]{{"containsAll", "java.util.Collection", "1"}, {"subList", "int,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:9>", "<sample:5>"}}, 3), new String[][]{{"containsAll", "java.util.Collection", "7"}, {"subList", "int,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<null>", "<sample:3>"}, {"com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:9>"}, {"com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:9>", "<sample:5>"}}, 1), new String[][]{{"add", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<null>", "<sample:6>"}, {"com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", ""}, {"com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:9>", "<sample:5>"}}, 3), new String[][]{{"add", "java.lang.Object", "7"}, {"clone", "", "0"}, {"get", "int", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.AnalyzePrototypeProperties$NameInfo", actual.getClass().getName());
  assertEquals("toString", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", ""}, {"com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:12>", "<sample:5>"}, {"com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", ""}}, 2), new String[][]{{"add", "java.lang.Object", "7"}, {"iterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:3>"}, {"com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:9>", "<sample:9>"}}, 2), new String[][]{{"iterator", "", "2"}, {"hasNext", "", "7"}, {"next", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.AnalyzePrototypeProperties$NameInfo", actual.getClass().getName());
  assertEquals("valueOf", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:3>"}, {"com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:9>"}}, 1), new String[][]{{"contains", "java.lang.Object", "6"}, {"iterator", "", "0"}, {"next", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.AnalyzePrototypeProperties$NameInfo", actual.getClass().getName());
  assertEquals("valueOf", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:3>"}, {"com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:9>"}, {"com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<null>", "<sample:10>"}}, 1), new String[][]{{"contains", "java.lang.Object", "6"}, {"iterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:3>"}, {"com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:9>"}, {"com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:3>"}}, 1), new String[][]{{"clear", "", "6"}, {"iterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:9>", "<sample:5>"}, {"com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:9>"}, {"com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:3>"}}, 2), new String[][]{{"clear", "", "6"}, {"iterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<sample:9>"}, false, 13, new String[][]{{"com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
}
