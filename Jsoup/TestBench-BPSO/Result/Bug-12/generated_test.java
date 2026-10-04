package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:0>", "<empty>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"|\"a\":1}", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:0>", "<empty>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"+", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<empty>", "<sample:4>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<null>", "<sample:4>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"null", "<sample:5>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"a b", "<sample:3>"}, true, 0, null, 3), new String[][]{{"addAll", "int,java.util.Collection", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:5>", "<sample:3>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{":F", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"/a/b", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jsoup.select.Selector$SelectorParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<sample:2>", "<sample:4>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"!", "<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"TITLEE", "<sample:7>"}, true), new String[][]{{"attr", "java.lang.String,java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"1", "<sample:7>"}, true), new String[][]{{"removeAttr", "java.lang.String", "3"}, {"listIterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{":gt(", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"`bc", "<sample:2>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jsoup.select.Selector$SelectorParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"1.5", "<sample:0>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{":has(", "<sample:5>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"0x123456789", "<sample:0>"}, true), new String[][]{{"clear", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"0.5e300", "<sample:2>"}, true), new String[][]{{"attr", "java.lang.String,java.lang.String", "0"}, {"attr", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<null>", "<sample:6>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"/a/b", "<sample:3>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"aaaaaaIaaaaaaaaaaaaaaaaaaaaaaaa", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<null>", "<sample:2>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"1.5e300", "<sample:5>"}, true), new String[][]{{"size", "", "1"}, {"addAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"1.6e300", "<sample:3>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{",1.", "<sample:4>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<empty>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"aa,b,c", "<sample:6>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"#", "<sample:7>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{":lt(", "<sample:1>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"[1,2]", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"51,2]", "<sample:1>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<empty>", "<null>"}, true, 0, null, 3), new String[][]{{"before", "java.lang.String", "5"}, {"remove", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"|0x1F", "<sample:3>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jsoup.select.Selector$SelectorParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"{\"a\":1}", "<sample:7>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jsoup.select.Selector$SelectorParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<empty>", "<sample:2>"}, true), new String[][]{{"set", "int,org.jsoup.nodes.Element", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"t+1", "<sample:9>"}, true), new String[][]{{"addClass", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{":not(9", "<sample:0>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"-1", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"2020-01-01Title", "<sample:0>"}, true), new String[][]{{"get", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<null>", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"Hello, World", "<sample:5>"}, true), new String[][]{{"hasText", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<empty>", "<sample:1>"}, true, 0, null, 3), new String[][]{{"indexOf", "java.lang.Object", "0"}, {"parents", "", "6"}, {"add", "int,org.jsoup.nodes.Element", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[null]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"1.5f", "<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"*", "<sample:9>"}, true), new String[][]{{"after", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"1E-5", "<sample:6>"}, true, 0, null, 3), new String[][]{{"containsAll", "java.util.Collection", "1"}, {"html", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"1", "<sample:9>"}, true, 0, null, 2), new String[][]{{"addAll", "int,java.util.Collection", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"Unkmown combinator: i", "<sample:9>"}, true, 0, null, 1), new String[][]{{"is", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"t+1", "<sample:3>"}, true, 0, null, 1), new String[][]{{"containsAll", "java.util.Collection", "0"}, {"attr", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"Unknown combinator: :containsOwn(", "<sample:9>"}, true), new String[][]{{"addClass", "java.lang.String", "1"}, {"attr", "java.lang.String,java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"0", "<sample:7>"}, true), new String[][]{{"addClass", "java.lang.String", "3"}, {"indexOf", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"+1", "<sample:3>"}, true), new String[][]{{"add", "int,org.jsoup.nodes.Element", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"1|", "<sample:2>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"0xFFFFFFFF", "<sample:9>"}, true), new String[][]{{"html", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"1E-5", "<sample:6>"}, true), new String[][]{{"retainAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"t+12147483648", "<sample:3>"}, true), new String[][]{{"clone", "", "4"}, {"iterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{":eq(1.1234567890123456", "<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"null:containsOwn(", "<sample:5>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"1}", "<sample:4>"}, true, 0, null, 2), new String[][]{{"clone", "", "5"}, {"clone", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{":contains(", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<empty>", "<sample:0>"}, true), new String[][]{{"val", "java.lang.String", "2"}, {"indexOf", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{":matches(1L", "<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{":matchesOwn(", "<sample:6>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{",", "<sample:8>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"110", "<sample:9>"}, true, 0, null, 3), new String[][]{{"addAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"2020-01-01", "<sample:0>"}, true), new String[][]{{"add", "org.jsoup.nodes.Element", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"000", "<sample:5>"}, true, 0, null, 3), new String[][]{{"eq", "int", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"[d", "<sample:5>"}, true), new String[][]{{"addAll", "java.util.Collection", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"1.25", "<sample:7>"}, true, 0, null, 3), new String[][]{{"hasText", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"a,b,c0x123456789", "<sample:3>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"c", "<sample:5>"}, true, 0, null, 2), new String[][]{{"parents", "", "1"}, {"attr", "java.lang.String,java.lang.String", "7"}, {"html", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<empty>", "<sample:0>"}, true), new String[][]{{"last", "", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{":conta", "<sample:0>"}, true, 0, null, 1), new String[][]{{"clear", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{":has(Unknown combinator: ", "<sample:3>"}, true), new String[][]{{"hasClass", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<empty>", "<sample:0>"}, true, 0, null, 3), new String[][]{{"first", "", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<empty>", "<sample:2>"}, true, 0, null, 1), new String[][]{{"addAll", "int,java.util.Collection", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"trkue>", "<sample:3>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<empty>", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"\t,", "<sample:2>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{":matches(1L", "<sample:3>"}, true, 0, null, 1), new String[][]{{"addAll", "int,java.util.Collection", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<empty>", "<sample:3>"}, true), new String[][]{{"html", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"#i", "<sample:6>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"0x1F1.e300", "<sample:2>"}, true), new String[][]{{"iterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{",1.", "<sample:0>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<empty>", "<empty>"}, true), new String[][]{{"removeAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<empty>", "<sample:4>"}, true, 0, null, 1), new String[][]{{"indexOf", "java.lang.Object", "4"}, {"val", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"1.35i", "<sample:7>"}, true), new String[][]{{"first", "", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"i", "<sample:5>"}, true, 0, null, 3), new String[][]{{"indexOf", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{":containsOwn(:matchesOwn(", "<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"2020-01-01", "<sample:4>"}, true, 0, null, 3), new String[][]{{"addAll", "int,java.util.Collection", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"2020-*1-01", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"0", "<sample:3>"}, true), new String[][]{{"iterator", "", "4"}, {"next", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{":containsOwn(:matchesOwn(:has(", "<sample:5>"}, true, 0, null, 1), new String[][]{{"addClass", "java.lang.String", "0"}, {"remove", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"1.57f", "<sample:3>"}, true, 0, null, 2), new String[][]{{"empty", "", "7"}, {"remove", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"0xFFFFFFFF|", "<sample:0>"}, true), new String[][]{{"last", "", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"0xFFFFFFFF", "<sample:5>"}, true, 0, null, 1), new String[][]{{"first", "", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<empty>", "<sample:1>"}, true, 0, null, 2), new String[][]{{"addAll", "int,java.util.Collection", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"12147483648", "<sample:9>"}, true, 0, null, 1), new String[][]{{"addAll", "java.util.Collection", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"1.24", "<sample:0>"}, true, 0, null, 3), new String[][]{{"add", "org.jsoup.nodes.Element", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<empty>", "<sample:5>"}, true, 0, null, 3), new String[][]{{"hasText", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<empty>", "<sample:1>"}, true, 0, null, 1), new String[][]{{"size", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"Unknown combinator: ]", "<sample:2>"}, true, 0, null, 1), new String[][]{{"set", "int,org.jsoup.nodes.Element", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"#a,b,c", "<sample:9>"}, true), new String[][]{{"remove", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<empty>", "<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"1.225", "<sample:3>"}, true, 0, null, 1), new String[][]{{"addAll", "java.util.Collection", "4"}, {"val", "java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<empty>", "<sample:0>"}, true, 0, null, 1), new String[][]{{"indexOf", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{":not(9", "<sample:3>"}, true), new String[][]{{"indexOf", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{":matchesOwn(-1.5", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"", "<sample:0>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"0x1F", "<sample:4>"}, true, 0, null, 3), new String[][]{{"contains", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{":contains(-1", "<sample:4>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"~", "<sample:10>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<empty>", "<sample:2>"}, true, 0, null, 1), new String[][]{{"remove", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{":has(*", "<sample:7>"}, true), new String[][]{{"remove", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"1e10", "<sample:2>"}, true, 0, null, 3), new String[][]{{"add", "org.jsoup.nodes.Element", "3"}, {"lastIndexOf", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"20D0-*1-01", "<sample:7>"}, true, 0, null, 2), new String[][]{{"isEmpty", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"~0.1234567", "<sample:9>"}, true), new String[][]{{"iterator", "", "2"}, {"hasNext", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{":eq(2147483648", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"tre", "<sample:0>"}, true, 0, null, 2), new String[][]{{"size", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{",[", "<sample:3>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{":contains(-1", "<sample:3>"}, true), new String[][]{{"addAll", "java.util.Collection", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"**", "<sample:0>"}, true, 0, null, 1), new String[][]{{"last", "", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<empty>", "<sample:1>"}, true, 0, null, 3), new String[][]{{"iterator", "", "4"}, {"next", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<empty>", "<sample:3>"}, true, 0, null, 2), new String[][]{{"last", "", "2"}, {"indexOf", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"0x0F", "<sample:3>"}, true, 0, null, 2), new String[][]{{"last", "", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<empty>", "<sample:1>"}, true, 0, null, 3), new String[][]{{"outerHtml", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{">010", "<sample:5>"}, true), new String[][]{{"first", "", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"abc0x1F", "<sample:0>"}, true, 0, null, 1), new String[][]{{"removeAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"a b-1.5", "<sample:0>"}, true, 0, null, 2), new String[][]{{"contains", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{":gt(010", "<sample:10>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"5-", "<sample:2>"}, true, 0, null, 2), new String[][]{{"lastIndexOf", "java.lang.Object", "2"}, {"add", "org.jsoup.nodes.Element", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<empty>", "<sample:7>"}, true, 0, null, 2), new String[][]{{"add", "org.jsoup.nodes.Element", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{":eq(2146483648", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"J", "<sample:0>"}, true, 0, null, 1), new String[][]{{"add", "org.jsoup.nodes.Element", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{"tT+1", "<sample:8>"}, true, 0, null, 2), new String[][]{{"set", "int,org.jsoup.nodes.Element", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{".", "<sample:2>"}, true, 0, null, 1), new String[][]{{"html", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{":gt(010", "<sample:5>"}, true), new String[][]{{"wrap", "java.lang.String", "5"}, {"set", "int,org.jsoup.nodes.Element", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<empty>", "<sample:0>"}, true, 0, null, 2), new String[][]{{"attr", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<empty>", "<sample:2>"}, true, 0, null, 2), new String[][]{{"removeAttr", "java.lang.String", "2"}, {"clone", "", "4"}, {"contains", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "java.lang.Iterable"}, new String[]{":eq(21483648", "<sample:0>"}, true, 0, null, 2), new String[][]{{"val", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "filterOut", new String[]{"java.util.Collection", "java.util.Collection"}, new String[]{"<empty>", "<sample:3>"}, true, 0, null, 2), new String[][]{{"last", "", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"**", "<sample:7>"}, true), new String[][]{{"hasText", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"+*", "<sample:5>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"t+*", "<sample:5>"}, true, 0, null, 2), new String[][]{{"isEmpty", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"[ttp://example.com/a?b=c", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{":lt(1", "<sample:9>"}, true), new String[][]{{"removeAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"[^", "<sample:6>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"[^.51.12345678901234567", "<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{">*", "<sample:7>"}, true), new String[][]{{"clone", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"~*", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"s~*", "<sample:9>"}, true, 0, null, 2), new String[][]{{"html", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{"*\r*", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.select.Selector", "org.jsoup.select.Selector", "select", new String[]{"java.lang.String", "org.jsoup.nodes.Element"}, new String[]{":not(*", "<sample:9>"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
}
