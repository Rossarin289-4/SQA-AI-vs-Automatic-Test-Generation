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
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"true", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"true", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"true", "<sample:4>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"D", "<sample:7>"}, true), new String[][]{{"after", "java.lang.String", "1"}, {"attr", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"]", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"^", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"-:matches(", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jsoup.select.Selector$SelectorParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"[", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"'-", "<sample:1>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jsoup.select.Selector$SelectorParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:2>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:2>", "<sample:1>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{":has(", "<sample:0>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"1.12345678901234567", "<sample:3>"}, true), new String[][]{{"outerHtml", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"+1", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{",2", "<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"+2", "<sample:7>"}, true), new String[][]{{"size", "", "4"}, {"attr", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"+5400.---1", "<sample:3>"}, true), new String[][]{{"size", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"0a,a,c", "<sample:3>"}, true), new String[][]{{"size", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{" 0b,b,c01", "<sample:4>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{",2", "<sample:4>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"--1", "<sample:4>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jsoup.select.Selector$SelectorParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{":matches(", "<sample:7>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"sr[e", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"abc", "<sample:3>"}, true), new String[][]{{"append", "java.lang.String", "0"}, {"hasText", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"*", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{":has(", "<sample:7>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{":has(1.12345678901234567", "<sample:7>"}, true, 0, null, 3), new String[][]{{"lastIndexOf", "java.lang.Object", "2"}, {"hasText", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:3>", "<empty>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<null>", "<sample:0>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:0>", "<empty>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<empty>", "<empty>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"T*ii", "<sample:9>"}, true), new String[][]{{"get", "int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"20[0-02-30T26:6:60", "<sample:3>"}, true, 0, null, 1), new String[][]{{"retainAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<null>", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"F.5", "<sample:9>"}, true), new String[][]{{"listIterator", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"F.5", "<sample:9>"}, true), new String[][]{{"listIterator", "int", "2"}, {"previousIndex", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"*2Unknown combinator: ", "<sample:9>"}, true), new String[][]{{"listIterator", "int", "2"}, {"previousIndex", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"*2Unknown combinator: ", "<sample:5>"}, true, 0, null, 1), new String[][]{{"listIterator", "int", "2"}, {"previousIndex", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"*2Unknown comfbinator: ", "<sample:3>"}, true), new String[][]{{"listIterator", "int", "2"}, {"previousIndex", "", "7"}, {"next", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"0xTFUnknoxn combinator: abc", "<sample:9>"}, true), new String[][]{{"addAll", "int,java.util.Collection", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"0wTFUgPnown c21404483648", "<sample:7>"}, true, 0, null, 2), new String[][]{{"addAll", "int,java.util.Collection", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"0wTFUhPnow c21404483648 ", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"12:30:45", "<sample:1>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"12:30:45", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"12:30:45", "<sample:5>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jsoup.select.Selector$SelectorParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<empty>", "<null>"}, true), new String[][]{{"clear", "", "0"}, {"clear", "", "4"}, {"text", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"Title", "<empty>"}, true, 0, null, 3), new String[][]{{"add", "int,org.jsoup.nodes.Element", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<empty>", "<empty>"}, true), new String[][]{{"addAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<null>", "<sample:3>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<empty>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<empty>", "<sample:0>"}, true), new String[][]{{"is", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<empty>", "<sample:0>"}, true, 0, null, 3), new String[][]{{"is", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{",", "<sample:2>"}, true), new String[][]{{"lastIndexOf", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{",", "<sample:0>"}, true), new String[][]{{"lastIndexOf", "java.lang.Object", "1"}, {"attr", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"s", "<sample:0>"}, true, 0, null, 1), new String[][]{{"eq", "int", "4"}, {"val", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"ss", "<sample:3>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{":contains(", "<sample:5>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"a b", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"a b", "<sample:1>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"1w3TI", "<sample:0>"}, true, 0, null, 1), new String[][]{{"remove", "", "0"}, {"lastIndexOf", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{":containsOwn(", "<sample:4>"}, true, 0, null, 1), new String[][]{{"remove", "", "0"}, {"lastIndexOf", "java.lang.Object", "2"}, {"attr", "java.lang.String,java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"`bc", "<sample:2>"}, true), new String[][]{{"listIterator", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"*2Unknown combinator: ", "<sample:5>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"o*2Unkno-n combbinator:, I", "<sample:5>"}, true, 0, null, 2), new String[][]{{"attr", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"o*2Unkno-n combbinator:, I:lt(", "<sample:5>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"u", "<sample:4>"}, true), new String[][]{{"add", "org.jsoup.nodes.Element", "4"}, {"html", "java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"u", "<sample:4>"}, true), new String[][]{{"add", "org.jsoup.nodes.Element", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"\010", "<empty>"}, true), new String[][]{{"last", "", "2"}, {"addAll", "java.util.Collection", "1"}, {"containsAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<null>", "<sample:3>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"Bs[E|[", "<sample:7>"}, true, 0, null, 3), new String[][]{{"html", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"f+1", "<sample:9>"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<empty>", "<sample:4>"}, true), new String[][]{{"text", "", "5"}, {"add", "org.jsoup.nodes.Element", "2"}, {"addAll", "int,java.util.Collection", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"\037:containsOwn(", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"1|", "<sample:7>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"1|", "<sample:7>"}, true, 0, null, 3), new String[][]{{"add", "org.jsoup.nodes.Element", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"T|#", "<sample:9>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"e+11E->5", "<sample:9>"}, true, 0, null, 1), new String[][]{{"removeAll", "java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"e+11E->551E-5", "<sample:9>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{":not(", "<sample:1>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"2147483648", "<sample:7>"}, true), new String[][]{{"addClass", "java.lang.String", "2"}, {"append", "java.lang.String", "3"}, {"addAll", "int,java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<empty>", "<sample:0>"}, true), new String[][]{{"select", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<empty>", "<sample:0>"}, true, 0, null, 2), new String[][]{{"select", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{",", "<sample:2>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{":gt(", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<empty>", "<sample:3>"}, true, 0, null, 1), new String[][]{{"not", "java.lang.String", "2"}, {"lastIndexOf", "java.lang.Object", "3"}, {"contains", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"Ba,bc,c", "<sample:2>"}, true, 0, null, 3), new String[][]{{"containsAll", "java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"0x123456789", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<empty>", "<sample:2>"}, true, 0, null, 2), new String[][]{{"addClass", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<empty>", "<sample:1>"}, true, 0, null, 2), new String[][]{{"add", "org.jsoup.nodes.Element", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"E:contains(-1.5", "<sample:7>"}, true), new String[][]{{"outerHtml", "", "6"}, {"retainAll", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"1.12345678", "<sample:7>"}, true, 0, null, 1), new String[][]{{"isEmpty", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"null", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<empty>", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{".0.0", "<sample:4>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"9contains(", "<empty>"}, true, 0, null, 3), new String[][]{{"addAll", "java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"]", "<sample:0>"}, true, 0, null, 2), new String[][]{{"get", "int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"^", "<sample:3>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"^", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"166s", "<empty>"}, true, 0, null, 3), new String[][]{{"text", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"i", "<sample:2>"}, true, 0, null, 1), new String[][]{{"remove", "java.lang.Object", "2"}, {"add", "org.jsoup.nodes.Element", "4"}, {"contains", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{":eq(", "<sample:8>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{":has(k.113.45567*9012>1234567O8:matches(", "<sample:9>"}, true), new String[][]{{"remove", "java.lang.Object", "1"}, {"parents", "", "0"}, {"retainAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{":has(k1D13.546667*9012>1234527O8abc", "<sample:9>"}, true, 0, null, 2), new String[][]{{"remove", "java.lang.Object", "1"}, {"parents", "", "0"}, {"retainAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<empty>", "<sample:6>"}, true), new String[][]{{"size", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{".", "<sample:2>"}, true), new String[][]{{"first", "", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"1.5f", "<sample:0>"}, true, 0, null, 3), new String[][]{{"first", "", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{":matchesOwn(", "<sample:7>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{",", "<sample:5>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<empty>", "<sample:0>"}, true, 0, null, 2), new String[][]{{"indexOf", "java.lang.Object", "4"}, {"get", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<empty>", "<sample:1>"}, true, 0, null, 3), new String[][]{{"attr", "java.lang.String,java.lang.String", "5"}, {"iterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"T|#0x1F", "<sample:7>"}, true), new String[][]{{"attr", "java.lang.String,java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<empty>", "<null>"}, true, 0, null, 1), new String[][]{{"before", "java.lang.String", "0"}, {"outerHtml", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"0a,a,c1.12345678990123456", "<empty>"}, true, 0, null, 2), new String[][]{{"is", "java.lang.String", "2"}, {"addAll", "int,java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"1.l4", "<sample:5>"}, true, 0, null, 3), new String[][]{{"listIterator", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<empty>", "<sample:6>"}, true, 0, null, 3), new String[][]{{"size", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<empty>", "<sample:2>"}, true, 0, null, 1), new String[][]{{"size", "", "1"}, {"add", "org.jsoup.nodes.Element", "6"}, {"removeAll", "java.util.Collection", "3"}, {"get", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"R-00", "<sample:0>"}, true, 0, null, 1), new String[][]{{"add", "org.jsoup.nodes.Element", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{":containsOwn(", "<sample:6>"}, true, 0, null, 2), new String[][]{{"parents", "", "6"}, {"removeAll", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{":conta1.1234567", "<empty>"}, true, 0, null, 2), new String[][]{{"hasText", "", "1"}, {"first", "", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"32", "<sample:0>"}, true, 0, null, 2), new String[][]{{"attr", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{":containsOwn(1.5", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"[1,2]*", "<sample:3>"}, true, 0, null, 3), new String[][]{{"empty", "", "3"}, {"removeAll", "java.util.Collection", "7"}, {"first", "", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"[:,2]1", "<sample:5>"}, true, 0, null, 3), new String[][]{{"empty", "", "3"}, {"size", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"e+11->50bxFFEEFFFd3F", "<sample:9>"}, true, 0, null, 3), new String[][]{{"attr", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{":has(Bc4k4,5-DPwg6o#p#YD1xn88-o+D[F\rj 5 B77h3|@\tkl1wi>Esr4\n)m*C_2rE*4:contains(0", "<sample:5>"}, true, 0, null, 2), new String[][]{{"first", "", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{":has(85cbee,P.podCap#Dgwp+A[D9EOCb  lir5\tL.6XA_\n=nsL#D\"+,>t)kkgs+a:contains(0", "<sample:9>"}, true), new String[][]{{"parents", "", "7"}, {"addAll", "int,java.util.Collection", "2"}, {"attr", "java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<empty>", "<null>"}, true, 0, null, 3), new String[][]{{"add", "int,org.jsoup.nodes.Element", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<empty>", "<sample:3>"}, true, 0, null, 2), new String[][]{{"iterator", "", "0"}, {"remove", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<empty>", "<sample:0>"}, true, 0, null, 3), new String[][]{{"remove", "", "7"}, {"attr", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"1/5300", "<sample:4>"}, true, 0, null, 1), new String[][]{{"remove", "int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<empty>", "<null>"}, true, 0, null, 2), new String[][]{{"text", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{":matches(null", "<sample:7>"}, true, 0, null, 3), new String[][]{{"listIterator", "int", "2"}, {"next", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<empty>", "<sample:2>"}, true, 0, null, 3), new String[][]{{"add", "org.jsoup.nodes.Element", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<empty>", "<sample:0>"}, true, 0, null, 1), new String[][]{{"first", "", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<empty>", "<empty>"}, true, 0, null, 1), new String[][]{{"lastIndexOf", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"**", "<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[\n<x \t y comment=\"a\"></x \t y>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{":has(1.12345678901234567:matchesOwn(PT1H", "<sample:7>"}, true, 0, null, 2), new String[][]{{"wrap", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"o*2Unknho-n combbinator:, I:lt(2", "<sample:3>"}, true), new String[][]{{"listIterator", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{":not(1.12345678", "<sample:5>"}, true), new String[][]{{"prepend", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[\n<{\"a\":1} comment=\"a\"></{\"a\":1}>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"+**", "<sample:9>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"~..+", "<sample:6>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"~.b+", "<sample:9>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{">*>b;/a>a", "<sample:9>"}, true, 0, null, 2), new String[][]{{"clear", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"u+*+1", "<sample:7>"}, true), new String[][]{{"html", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{":has(*", "<sample:9>"}, true), new String[][]{{"remove", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"61,b[^", "<sample:7>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"61,b[^b", "<sample:9>"}, true, 0, null, 2), new String[][]{{"subList", "int,int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"po~*", "<sample:3>"}, true), new String[][]{{"subList", "int,int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"*:not(*", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
}
