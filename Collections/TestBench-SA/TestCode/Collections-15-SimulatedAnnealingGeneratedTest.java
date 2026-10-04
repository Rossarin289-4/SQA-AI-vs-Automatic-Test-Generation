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
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.SetUniqueList", "org.apache.commons.collections.list.SetUniqueList", "decorate", new String[]{"java.util.List"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.SetUniqueList", "org.apache.commons.collections.list.SetUniqueList", "decorate", new String[]{"java.util.List"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.SetUniqueList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.SetUniqueList", "org.apache.commons.collections.list.SetUniqueList", "decorate", new String[]{"java.util.List"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.SetUniqueList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.SetUniqueList", "org.apache.commons.collections.list.SetUniqueList", "decorate", new String[]{"java.util.List"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.SetUniqueList", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.SetUniqueList", "org.apache.commons.collections.list.SetUniqueList", "decorate", new String[]{"java.util.List"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.SetUniqueList", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.SetUniqueList", "org.apache.commons.collections.list.SetUniqueList", "decorate", new String[]{"java.util.List"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.SetUniqueList", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.SetUniqueList", "org.apache.commons.collections.list.SetUniqueList", "decorate", new String[]{"java.util.List"}, new String[]{"<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.SetUniqueList", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.SetUniqueList", "org.apache.commons.collections.list.SetUniqueList", "decorate", new String[]{"java.util.List"}, new String[]{"<sample:4>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.SetUniqueList", actual.getClass().getName());
  assertEquals("[, a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.SetUniqueList", "org.apache.commons.collections.list.SetUniqueList", "decorate", new String[]{"java.util.List"}, new String[]{"<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.SetUniqueList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.SetUniqueList", "org.apache.commons.collections.list.SetUniqueList", "decorate", new String[]{"java.util.List"}, new String[]{"<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.SetUniqueList", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.SetUniqueList", "org.apache.commons.collections.list.SetUniqueList", "decorate", new String[]{"java.util.List"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.SetUniqueList", "org.apache.commons.collections.list.SetUniqueList", "decorate", new String[]{"java.util.List"}, new String[]{"<sample:1>"}, true), new String[][]{{"clear", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.SetUniqueList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.SetUniqueList", "org.apache.commons.collections.list.SetUniqueList", "decorate", new String[]{"java.util.List"}, new String[]{"<sample:1>"}, true), new String[][]{{"listIterator", "int", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.SetUniqueList$SetListListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.SetUniqueList", "org.apache.commons.collections.list.SetUniqueList", "decorate", new String[]{"java.util.List"}, new String[]{"<sample:3>"}, true), new String[][]{{"listIterator", "int", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.SetUniqueList$SetListListIterator", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.SetUniqueList", "org.apache.commons.collections.list.SetUniqueList", "decorate", new String[]{"java.util.List"}, new String[]{"<empty>"}, true), new String[][]{{"listIterator", "int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.SetUniqueList", "org.apache.commons.collections.list.SetUniqueList", "decorate", new String[]{"java.util.List"}, new String[]{"<sample:0>"}, true), new String[][]{{"removeAll", "java.util.Collection", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.SetUniqueList", "org.apache.commons.collections.list.SetUniqueList", "decorate", new String[]{"java.util.List"}, new String[]{"<sample:2>"}, true), new String[][]{{"addAll", "int,java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.SetUniqueList", "org.apache.commons.collections.list.SetUniqueList", "decorate", new String[]{"java.util.List"}, new String[]{"<sample:3>"}, true), new String[][]{{"removeAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.SetUniqueList", "org.apache.commons.collections.list.SetUniqueList", "decorate", new String[]{"java.util.List"}, new String[]{"<sample:3>"}, true), new String[][]{{"containsAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.SetUniqueList", "org.apache.commons.collections.list.SetUniqueList", "decorate", new String[]{"java.util.List"}, new String[]{"<sample:2>"}, true), new String[][]{{"contains", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.SetUniqueList", "org.apache.commons.collections.list.SetUniqueList", "decorate", new String[]{"java.util.List"}, new String[]{"<sample:1>"}, true, 0, null, 3), new String[][]{{"contains", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.SetUniqueList", "org.apache.commons.collections.list.SetUniqueList", "decorate", new String[]{"java.util.List"}, new String[]{"<sample:4>"}, true, 0, null, 3), new String[][]{{"contains", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.SetUniqueList", "org.apache.commons.collections.list.SetUniqueList", "decorate", new String[]{"java.util.List"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.SetUniqueList", "org.apache.commons.collections.list.SetUniqueList", "decorate", new String[]{"java.util.List"}, new String[]{"<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.SetUniqueList", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.SetUniqueList", "org.apache.commons.collections.list.SetUniqueList", "decorate", new String[]{"java.util.List"}, new String[]{"<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.SetUniqueList", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.SetUniqueList", "org.apache.commons.collections.list.SetUniqueList", "decorate", new String[]{"java.util.List"}, new String[]{"<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.SetUniqueList", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.SetUniqueList", "org.apache.commons.collections.list.SetUniqueList", "decorate", new String[]{"java.util.List"}, new String[]{"<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.SetUniqueList", actual.getClass().getName());
  assertEquals("[, a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.SetUniqueList", "org.apache.commons.collections.list.SetUniqueList", "decorate", new String[]{"java.util.List"}, new String[]{"<sample:6>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.SetUniqueList", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.SetUniqueList", "org.apache.commons.collections.list.SetUniqueList", "decorate", new String[]{"java.util.List"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.SetUniqueList", actual.getClass().getName());
  assertEquals("[a, 0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.SetUniqueList", "org.apache.commons.collections.list.SetUniqueList", "decorate", new String[]{"java.util.List"}, new String[]{"<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.SetUniqueList", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.SetUniqueList", "org.apache.commons.collections.list.SetUniqueList", "decorate", new String[]{"java.util.List"}, new String[]{"<sample:10>"}, true), new String[][]{{"set", "int,java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.SetUniqueList", "org.apache.commons.collections.list.SetUniqueList", "decorate", new String[]{"java.util.List"}, new String[]{"<sample:5>"}, true), new String[][]{{"asSet", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.set.UnmodifiableSet", actual.getClass().getName());
  assertEquals("[0, a, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.SetUniqueList", "org.apache.commons.collections.list.SetUniqueList", "decorate", new String[]{"java.util.List"}, new String[]{"<sample:1>"}, true, 0, null, 2), new String[][]{{"isEmpty", "", "4"}, {"listIterator", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.SetUniqueList", "org.apache.commons.collections.list.SetUniqueList", "decorate", new String[]{"java.util.List"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.SetUniqueList", "org.apache.commons.collections.list.SetUniqueList", "decorate", new String[]{"java.util.List"}, new String[]{"<sample:2>"}, true), new String[][]{{"isEmpty", "", "1"}, {"remove", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.SetUniqueList", "org.apache.commons.collections.list.SetUniqueList", "decorate", new String[]{"java.util.List"}, new String[]{"<sample:12>"}, true, 0, null, 1), new String[][]{{"isEmpty", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.SetUniqueList", "org.apache.commons.collections.list.SetUniqueList", "decorate", new String[]{"java.util.List"}, new String[]{"<sample:7>"}, true), new String[][]{{"add", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.SetUniqueList", "org.apache.commons.collections.list.SetUniqueList", "decorate", new String[]{"java.util.List"}, new String[]{"<sample:6>"}, true), new String[][]{{"add", "java.lang.Object", "7"}, {"addAll", "int,java.util.Collection", "2"}, {"remove", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.SetUniqueList", "org.apache.commons.collections.list.SetUniqueList", "decorate", new String[]{"java.util.List"}, new String[]{"<empty>"}, true), new String[][]{{"listIterator", "", "3"}, {"next", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.SetUniqueList", "org.apache.commons.collections.list.SetUniqueList", "decorate", new String[]{"java.util.List"}, new String[]{"<sample:3>"}, true), new String[][]{{"listIterator", "", "3"}, {"next", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.SetUniqueList", "org.apache.commons.collections.list.SetUniqueList", "decorate", new String[]{"java.util.List"}, new String[]{"<sample:6>"}, true, 0, null, 1), new String[][]{{"listIterator", "", "3"}, {"next", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.SetUniqueList", "org.apache.commons.collections.list.SetUniqueList", "decorate", new String[]{"java.util.List"}, new String[]{"<sample:9>"}, true, 0, null, 1), new String[][]{{"listIterator", "", "3"}, {"next", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.SetUniqueList", "org.apache.commons.collections.list.SetUniqueList", "decorate", new String[]{"java.util.List"}, new String[]{"<sample:0>"}, true, 0, null, 2), new String[][]{{"listIterator", "", "3"}, {"next", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.SetUniqueList", "org.apache.commons.collections.list.SetUniqueList", "decorate", new String[]{"java.util.List"}, new String[]{"<sample:1>"}, true, 0, null, 2), new String[][]{{"listIterator", "", "3"}, {"next", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.SetUniqueList", "org.apache.commons.collections.list.SetUniqueList", "decorate", new String[]{"java.util.List"}, new String[]{"<sample:2>"}, true, 0, null, 2), new String[][]{{"listIterator", "", "3"}, {"next", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.SetUniqueList", "org.apache.commons.collections.list.SetUniqueList", "decorate", new String[]{"java.util.List"}, new String[]{"<sample:2>"}, true, 0, null, 2), new String[][]{{"listIterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.SetUniqueList$SetListListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.SetUniqueList", "org.apache.commons.collections.list.SetUniqueList", "decorate", new String[]{"java.util.List"}, new String[]{"<sample:3>"}, true, 0, null, 2), new String[][]{{"listIterator", "", "4"}, {"hasPrevious", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.SetUniqueList", "org.apache.commons.collections.list.SetUniqueList", "decorate", new String[]{"java.util.List"}, new String[]{"<sample:6>"}, true, 0, null, 2), new String[][]{{"addAll", "int,java.util.Collection", "3"}, {"lastIndexOf", "java.lang.Object", "2"}, {"add", "int,java.lang.Object", "5"}, {"indexOf", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.SetUniqueList", "org.apache.commons.collections.list.SetUniqueList", "decorate", new String[]{"java.util.List"}, new String[]{"<sample:2>"}, true, 0, null, 2), new String[][]{{"addAll", "int,java.util.Collection", "1"}, {"set", "int,java.lang.Object", "2"}, {"add", "int,java.lang.Object", "5"}, {"indexOf", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.SetUniqueList", "org.apache.commons.collections.list.SetUniqueList", "decorate", new String[]{"java.util.List"}, new String[]{"<sample:5>"}, true, 0, null, 1), new String[][]{{"listIterator", "", "1"}, {"set", "java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.SetUniqueList", "org.apache.commons.collections.list.SetUniqueList", "decorate", new String[]{"java.util.List"}, new String[]{"<sample:10>"}, true), new String[][]{{"listIterator", "int", "5"}, {"previous", "", "1"}, {"nextIndex", "", "0"}, {"previousIndex", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.SetUniqueList", "org.apache.commons.collections.list.SetUniqueList", "decorate", new String[]{"java.util.List"}, new String[]{"<sample:7>"}, true, 0, null, 1), new String[][]{{"subList", "int,int", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.SetUniqueList", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.SetUniqueList", "org.apache.commons.collections.list.SetUniqueList", "decorate", new String[]{"java.util.List"}, new String[]{"<sample:5>"}, true), new String[][]{{"retainAll", "java.util.Collection", "3"}, {"addAll", "int,java.util.Collection", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.SetUniqueList", "org.apache.commons.collections.list.SetUniqueList", "decorate", new String[]{"java.util.List"}, new String[]{"<sample:5>"}, true, 0, null, 3), new String[][]{{"indexOf", "java.lang.Object", "1"}, {"lastIndexOf", "java.lang.Object", "7"}, {"add", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.SetUniqueList", "org.apache.commons.collections.list.SetUniqueList", "decorate", new String[]{"java.util.List"}, new String[]{"<sample:5>"}, true), new String[][]{{"addAll", "int,java.util.Collection", "0"}, {"listIterator", "int", "2"}, {"add", "java.lang.Object", "1"}, {"previousIndex", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.SetUniqueList", "org.apache.commons.collections.list.SetUniqueList", "decorate", new String[]{"java.util.List"}, new String[]{"<sample:9>"}, true), new String[][]{{"listIterator", "", "7"}, {"add", "java.lang.Object", "0"}, {"add", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.SetUniqueList$SetListListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.SetUniqueList", "org.apache.commons.collections.list.SetUniqueList", "decorate", new String[]{"java.util.List"}, new String[]{"<sample:2>"}, true, 0, null, 2), new String[][]{{"set", "int,java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.SetUniqueList", "org.apache.commons.collections.list.SetUniqueList", "decorate", new String[]{"java.util.List"}, new String[]{"<sample:0>"}, true, 0, null, 1), new String[][]{{"size", "", "7"}, {"add", "int,java.lang.Object", "2"}, {"add", "java.lang.Object", "2"}, {"set", "int,java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.SetUniqueList", "org.apache.commons.collections.list.SetUniqueList", "decorate", new String[]{"java.util.List"}, new String[]{"<sample:5>"}, true, 0, null, 2), new String[][]{{"lastIndexOf", "java.lang.Object", "6"}, {"iterator", "", "3"}, {"next", "", "0"}, {"remove", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.SetUniqueList$SetListIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.list.SetUniqueList", "org.apache.commons.collections.list.SetUniqueList", "decorate", new String[]{"java.util.List"}, new String[]{"<sample:7>"}, true), new String[][]{{"removeAll", "java.util.Collection", "0"}, {"listIterator", "", "1"}, {"next", "", "5"}, {"remove", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.list.SetUniqueList$SetListListIterator", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
}
