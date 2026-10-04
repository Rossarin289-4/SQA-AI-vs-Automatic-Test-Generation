package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[valueOf, length, toString]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CrossModuleMethodMotion", "com.google.javascript.jscomp.CrossModuleMethodMotion", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<sample:4>"}, false, 5, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<sample:6>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:1>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CrossModuleMethodMotion", "com.google.javascript.jscomp.CrossModuleMethodMotion", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<sample:7>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.CrossModuleMethodMotion", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:11>", "<sample:10>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:1>"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[valueOf, length, toString]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<sample:9>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", ""}, {"com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:11>", "<sample:2>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<sample:7>"}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", new String[]{}, new String[]{}, false), new String[][]{{"clear", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:11>", "<sample:0>"}}), new String[][]{{"add", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", new String[]{}, new String[]{}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[valueOf, length, toString]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", ""}}), new String[][]{{"remove", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:9>", "<sample:2>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", new String[]{}, new String[]{}, false), new String[][]{{"remove", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:11>", "<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:4>"}, {"com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:11>", "<sample:10>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", new String[]{}, new String[]{}, false), new String[][]{{"size", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"size", "", "1"}, {"listIterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", new String[]{}, new String[]{}, false), new String[][]{{"listIterator", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<sample:9>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", ""}, {"com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:8>", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", ""}}), new String[][]{{"get", "int", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.AnalyzePrototypeProperties$NameInfo", actual.getClass().getName());
  assertEquals("length", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:10>"}}, 2), new String[][]{{"get", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:9>", "<sample:6>"}}, 3), new String[][]{{"retainAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CrossModuleMethodMotion", "com.google.javascript.jscomp.CrossModuleMethodMotion", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CrossModuleMethodMotion", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:7>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:8>", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:9>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:0>"}, {"com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"lastIndexOf", "java.lang.Object", "0"}, {"remove", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"retainAll", "java.util.Collection", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:0>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:9>", "<null>"}, {"com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:8>", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", ""}}, 3), new String[][]{{"ensureCapacity", "int", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[valueOf, length, toString]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:9>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:2>"}, {"com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", ""}}, 1), new String[][]{{"isEmpty", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"subList", "int,int", "2"}, {"containsAll", "java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3), new String[][]{{"contains", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:2>"}, {"com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:11>", "<sample:4>"}}, 1), new String[][]{{"listIterator", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:8>", "<sample:5>"}}, 2), new String[][]{{"get", "int", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.AnalyzePrototypeProperties$NameInfo", actual.getClass().getName());
  assertEquals("valueOf", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:0>"}}, 2), new String[][]{{"set", "int,java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.AnalyzePrototypeProperties$NameInfo", actual.getClass().getName());
  assertEquals("toString", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:6>"}, {"com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:7>"}}, 3), new String[][]{{"listIterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CrossModuleMethodMotion", "com.google.javascript.jscomp.CrossModuleMethodMotion", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<null>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.CrossModuleMethodMotion", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:13>", "<sample:5>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:12>"}}, 3), new String[][]{{"lastIndexOf", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:6>"}, {"com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", ""}}, 3), new String[][]{{"iterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.AnalyzePrototypeProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:11>"}}, 1), new String[][]{{"iterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"retainAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", ""}}, 1), new String[][]{{"size", "", "1"}, {"indexOf", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AnalyzePrototypeProperties", "com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.AnalyzePrototypeProperties", "getAllNameInfo", ""}}, 1), new String[][]{{"listIterator", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
}
