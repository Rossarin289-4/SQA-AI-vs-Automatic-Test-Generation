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
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<null>", "<empty>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<empty>", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:0>", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"abc", "<sample:4>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"abc", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"abc", "<sample:3>"}, true), new String[][]{{"add", "org.jsoup.nodes.Element", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<null>", "<sample:1>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"1E-5", "<sample:7>"}, true), new String[][]{{"attr", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"cE.-5", "<sample:3>"}, true), new String[][]{{"attr", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"\u00e9", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"11", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"b", "<sample:3>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"cE.-5", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"cE.-5", "<empty>"}, true, 0, null, 3), new String[][]{{"hasClass", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<empty>", "<null>"}, true), new String[][]{{"after", "java.lang.String", "5"}, {"size", "", "4"}, {"contains", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<empty>", "<null>"}, true), new String[][]{{"after", "java.lang.String", "5"}, {"size", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<empty>", "<sample:3>"}, true, 0, null, 3), new String[][]{{"after", "java.lang.String", "5"}, {"size", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:2>", "<sample:2>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"1.1234567", "<sample:2>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"5.", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"1.1234567", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"1.5e300", "<sample:3>"}, true, 0, null, 2), new String[][]{{"removeClass", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"1.4e4/", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jsoup.select.Selector$SelectorParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"1.4e4/", "<sample:5>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jsoup.select.Selector$SelectorParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"91.4e~/", "<sample:5>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jsoup.select.Selector$SelectorParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{":containsOwn(", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"010", "<sample:3>"}, true, 0, null, 3), new String[][]{{"removeClass", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:0>", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"-1", "<sample:2>"}, true), new String[][]{{"empty", "", "4"}, {"subList", "int,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"-12147483648", "<sample:4>"}, true, 0, null, 2), new String[][]{{"empty", "", "4"}, {"subList", "int,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{":contains(", "<empty>"}, true), new String[][]{{"hasClass", "java.lang.String", "3"}, {"add", "org.jsoup.nodes.Element", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"t*u-,", "<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"\t", "<sample:2>"}, true, 0, null, 1), new String[][]{{"isEmpty", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"X", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"~", "<sample:5>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"~", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"2147483648", "<sample:5>"}, true, 0, null, 3), new String[][]{{"after", "java.lang.String", "2"}, {"set", "int,org.jsoup.nodes.Element", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"+14+748648", "<sample:2>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"+14+748648", "<sample:7>"}, true, 0, null, 3), new String[][]{{"after", "java.lang.String", "2"}, {"set", "int,org.jsoup.nodes.Element", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{",", "<sample:10>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"-1", "<sample:1>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{":matchesOwn(", "<sample:5>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{",:.", "<sample:5>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"a1x", "<sample:3>"}, true), new String[][]{{"subList", "int,int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"a1x", "<sample:1>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"`1x", "<sample:1>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jsoup.select.Selector$SelectorParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<empty>", "<empty>"}, true), new String[][]{{"append", "java.lang.String", "1"}, {"addAll", "int,java.util.Collection", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<empty>", "<sample:0>"}, true), new String[][]{{"lastIndexOf", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"PS", "<sample:2>"}, true), new String[][]{{"contains", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"2020-02-30T25961:61", "<sample:0>"}, true), new String[][]{{"add", "org.jsoup.nodes.Element", "1"}, {"attr", "java.lang.String,java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"a", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"9\\22Tiule-0.0", "<sample:0>"}, true, 0, null, 3), new String[][]{{"val", "", "7"}, {"removeAll", "java.util.Collection", "2"}, {"addAll", "int,java.util.Collection", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{":not(", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{":not(,", "<sample:6>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{":not(,", "<sample:3>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"0x1F", "<sample:5>"}, true, 0, null, 2), new String[][]{{"get", "int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<null>", "<sample:0>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{":matchesOwn(123456789012345678901234567890", "<sample:8>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{":matchesOwn(1234567890123456789", "<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{":match;sOwn(1234578901134567890x1F", "<empty>"}, true, 0, null, 1), new String[][]{{"prepend", "java.lang.String", "6"}, {"parents", "", "6"}, {"isEmpty", "", "1"}, {"contains", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"#", "<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<empty>", "<sample:1>"}, true), new String[][]{{"add", "org.jsoup.nodes.Element", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<empty>", "<sample:1>"}, true, 0, null, 3), new String[][]{{"add", "org.jsoup.nodes.Element", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<null>", "<sample:2>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"*", "<sample:6>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"Hello, World", "<sample:0>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"Iello, Worgd", "<sample:3>"}, true, 0, null, 1), new String[][]{{"contains", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"991.4e~/", "<sample:3>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jsoup.select.Selector$SelectorParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{":not(", "<sample:5>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{":eq(", "<sample:5>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"[", "<sample:10>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<empty>", "<null>"}, true, 0, null, 3), new String[][]{{"html", "", "3"}, {"hasText", "", "5"}, {"addAll", "int,java.util.Collection", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{",", "<sample:2>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"[1,2]", "<sample:8>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"[1,2]", "<sample:3>"}, true, 0, null, 1), new String[][]{{"contains", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"[1,\\", "<sample:3>"}, true), new String[][]{{"contains", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{">", "<sample:4>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{":contains(", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"+1", "<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"+14+748648", "<sample:3>"}, true, 0, null, 1), new String[][]{{"remove", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"+44#74848", "<sample:7>"}, true, 0, null, 2), new String[][]{{"remove", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"+44#73848", "<sample:5>"}, true, 0, null, 2), new String[][]{{"iterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{">|X", "<sample:7>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jsoup.select.Selector$SelectorParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{":contains(2020-01-01", "<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{".5", "<sample:3>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"-1", "<sample:2>"}, true, 0, null, 2), new String[][]{{"before", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<empty>", "<sample:5>"}, true), new String[][]{{"html", "", "4"}, {"attr", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"1.12345677901234\n56", "<sample:2>"}, true, 0, null, 2), new String[][]{{"containsAll", "java.util.Collection", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{":matches(", "<sample:7>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<empty>", "<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:3>", "<sample:3>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<empty>", "<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<empty>", "<sample:2>"}, true, 0, null, 1), new String[][]{{"removeAll", "java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"1.[5e", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"0xFFFFFFFF", "<empty>"}, true), new String[][]{{"last", "", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"0x1F", "<sample:0>"}, true, 0, null, 2), new String[][]{{"last", "", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"21474863|648", "<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"*", "<sample:3>"}, true, 0, null, 2), new String[][]{{"append", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[\n<<a><b>t</b></a> comment=\"a\">\n a\n</<a><b>t</b></a>>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"++Vf", "<sample:2>"}, true, 0, null, 1), new String[][]{{"attr", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"1.12345678901234567", "<sample:3>"}, true, 0, null, 3), new String[][]{{"add", "org.jsoup.nodes.Element", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"1E-51.25", "<empty>"}, true), new String[][]{{"before", "java.lang.String", "7"}, {"add", "int,org.jsoup.nodes.Element", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[null]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<empty>", "<empty>"}, true, 0, null, 3), new String[][]{{"outerHtml", "", "0"}, {"append", "java.lang.String", "6"}, {"containsAll", "java.util.Collection", "1"}, {"lastIndexOf", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<empty>", "<sample:3>"}, true, 0, null, 3), new String[][]{{"outerHtml", "", "0"}, {"append", "java.lang.String", "6"}, {"containsAll", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"1.1234567110", "<sample:5>"}, true, 0, null, 3), new String[][]{{"outerHtml", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{">1P.12345711", "<sample:5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"1.1234566890123456", "<sample:7>"}, true, 0, null, 2), new String[][]{{"containsAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"I\nello, Worgd", "<sample:5>"}, true, 0, null, 1), new String[][]{{"empty", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"I~eolof, WPorge", "<sample:5>"}, true), new String[][]{{"contains", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"I~eolof, WPorge", "<sample:7>"}, true), new String[][]{{"contains", "java.lang.Object", "1"}, {"size", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{";f(#", "<sample:0>"}, true), new String[][]{{"val", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"+q4*#73848", "<sample:7>"}, true), new String[][]{{"after", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"+44*#7384711.5d", "<sample:7>"}, true), new String[][]{{"removeClass", "java.lang.String", "5"}, {"first", "", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"+34*#73bO4812.gd", "<sample:3>"}, true, 0, null, 1), new String[][]{{"removeClass", "java.lang.String", "5"}, {"first", "", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"0xFFFFFFFF", "<sample:3>"}, true, 0, null, 3), new String[][]{{"iterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{":lt(", "<sample:7>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"++1B", "<sample:2>"}, true, 0, null, 2), new String[][]{{"removeClass", "java.lang.String", "6"}, {"before", "java.lang.String", "6"}, {"size", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"0x1F", "<sample:6>"}, true, 0, null, 1), new String[][]{{"removeClass", "java.lang.String", "6"}, {"hasAttr", "java.lang.String", "3"}, {"listIterator", "int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<empty>", "<sample:2>"}, true, 0, null, 1), new String[][]{{"removeAll", "java.util.Collection", "0"}, {"eq", "int", "7"}, {"attr", "java.lang.String,java.lang.String", "0"}, {"first", "", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"k", "<sample:2>"}, true, 0, null, 3), new String[][]{{"remove", "", "4"}, {"outerHtml", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"+3*#73848", "<sample:9>"}, true, 0, null, 1), new String[][]{{"removeAttr", "java.lang.String", "6"}, {"attr", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{":gt(", "<sample:5>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"gWW[3fUllR2lF2\014qmFEX74)]b35aaD 919FF*m9_EDl2q5i>21.5e3/0+1+1:not(i", "<sample:5>"}, true), new String[][]{{"addAll", "int,java.util.Collection", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<empty>", "<sample:1>"}, true, 0, null, 2), new String[][]{{"eq", "int", "5"}, {"is", "java.lang.String", "2"}, {"contains", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{":has(", "<sample:5>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"g6#V[+lf<T5\nrlQ4a=H~\035\013Lqllrn.9F>YoI]25ED00aD (xFU$k8*:-D1288qes>/P583/,1+0:not(i", "<sample:7>"}, true, 0, null, 1), new String[][]{{"first", "", "2"}, {"add", "int,org.jsoup.nodes.Element", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{":has(abc", "<sample:5>"}, true), new String[][]{{"attr", "java.lang.String,java.lang.String", "2"}, {"listIterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<empty>", "<empty>"}, true), new String[][]{{"containsAll", "java.util.Collection", "7"}, {"select", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"0x1F", "<empty>"}, true, 0, null, 1), new String[][]{{"containsAll", "java.util.Collection", "2"}, {"iterator", "", "5"}, {"next", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"Tnn[n 51Utd_hd\037r,f2o1a:gtB9PE=\rl ;]+#hkkfDD\0363C.+*~q7.A-er>mO85*[3.+1+0:not(i11.2", "<sample:5>"}, true, 0, null, 3), new String[][]{{"html", "java.lang.String", "4"}, {"indexOf", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"uuT|m[o!xtc`g0;/U,gh2>>o68ft8bFr<r7m\0378]U,#g_jA\037Hdlq[.hCer>JO+8~**q[.1+0:not(i11.", "<sample:3>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"Snn[ 1Ut_hd\036qq-f20b9gtBQ*=l u_*;],#gj2f,DD\036\0363C+*~q7-frr>nmN844\\.+1+0:not(i11.2", "<sample:3>"}, true, 0, null, 3), new String[][]{{"contains", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<empty>", "<empty>"}, true, 0, null, 2), new String[][]{{"removeClass", "java.lang.String", "6"}, {"listIterator", "int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<empty>", "<sample:0>"}, true, 0, null, 2), new String[][]{{"last", "", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<empty>", "<empty>"}, true), new String[][]{{"iterator", "", "4"}, {"next", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<empty>", "<empty>"}, true, 0, null, 1), new String[][]{{"add", "int,org.jsoup.nodes.Element", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<empty>", "<empty>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"Snn[ 1Ut_hd\036qq-f20b9ggtBQ*=l u_*;],#gj2f,DD\036\0363C+*~q7-frr>nmN844\\.+1+0:not(i11.2", "<sample:2>"}, true, 0, null, 2), new String[][]{{"add", "org.jsoup.nodes.Element", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"I~eolof, WP_rge", "<sample:2>"}, true, 0, null, 3), new String[][]{{"add", "org.jsoup.nodes.Element", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{":matches(2020-01-01", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{":matches(202001-01", "<sample:3>"}, true, 0, null, 2), new String[][]{{"retainAll", "java.util.Collection", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"2120-0551c-01", "<empty>"}, true, 0, null, 3), new String[][]{{"add", "org.jsoup.nodes.Element", "5"}, {"hasClass", "java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"ku_Uk[o!c`f.JA/0_g?:dFo,87bHr<s6mmdm5h8]e_fs\036I7Blq>-shCers`o~*+[.1+0:not(iHel1.", "<sample:7>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<empty>", "<empty>"}, true, 0, null, 2), new String[][]{{"addAll", "java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"Ti", "<sample:0>"}, true, 0, null, 3), new String[][]{{"html", "", "6"}, {"first", "", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<empty>", "<sample:1>"}, true, 0, null, 1), new String[][]{{"hasClass", "java.lang.String", "2"}, {"size", "", "6"}, {"attr", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<empty>", "<sample:0>"}, true, 0, null, 2), new String[][]{{"html", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<empty>", "<sample:3>"}, true, 0, null, 1), new String[][]{{"isEmpty", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{":containsOwn(1.1234567", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{":containsOwn(1.1234567", "<sample:3>"}, true), new String[][]{{"html", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"+*", "<sample:5>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"g6#V[+lf<T5\nrlQ4~=H~\035\013Lqllrn.9F>YoI]25ED00aD (xFU$k8*:-D1288qes>/P583/,1+0:not(i", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{":eq(5", "<sample:10>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{":eq(5", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"~*", "<sample:5>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"+q4#73848:gt(010", "<sample:5>"}, true), new String[][]{{"is", "java.lang.String", "3"}, {"after", "java.lang.String", "4"}, {"eq", "int", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
}
