package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilderState", "org.jsoup.parser.HtmlTreeBuilderState$1", "values", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.parser.HtmlTreeBuilderState;", actual.getClass().getName());
  assertEquals("[Initial, BeforeHtml, BeforeHead, InHead, InHeadNoscript, AfterHead, InBody, Text, InTable, InTableText, InCaption, InColumnGroup, InTableBody, InRow, InCell, InSelect, InSelectInTable, AfterBody, InF...#275#355538594", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:2>", "<sample:5>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:3>", "<sample:7>"}, false, 1, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "generateImpliedEndTags", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:1>", "<sample:3>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "resetInsertionMode", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "pop", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "getBaseUri", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getPendingTableCharacters", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "setFormElement", "org.jsoup.nodes.FormElement", "<sample:1>"}, {"org.jsoup.parser.HtmlTreeBuilder", "transition", "org.jsoup.parser.HtmlTreeBuilderState", "<sample:7>"}, {"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token", "<sample:1>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getPendingTableCharacters", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "getActiveFormattingElement", "java.lang.String", "1.12346l890123456"}, {"org.jsoup.parser.HtmlTreeBuilder", "transition", "org.jsoup.parser.HtmlTreeBuilderState", "<sample:4>"}, {"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token", "<sample:2>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getPendingTableCharacters", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "getActiveFormattingElement", "java.lang.String", "1.5"}, {"org.jsoup.parser.HtmlTreeBuilder", "transition", "org.jsoup.parser.HtmlTreeBuilderState", "<sample:4>"}, {"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token", "<sample:3>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getPendingTableCharacters", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "transition", "org.jsoup.parser.HtmlTreeBuilderState", "<sample:2>"}, {"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token", "<sample:2>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getPendingTableCharacters", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "transition", "org.jsoup.parser.HtmlTreeBuilderState", "<sample:1>"}, {"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "", "<sample:5>", "2147483648", "<sample:0>", "<null>"}, {"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token", "<sample:2>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getPendingTableCharacters", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "transition", "org.jsoup.parser.HtmlTreeBuilderState", "<sample:0>"}, {"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "", "<sample:5>", "2147483648", "<sample:0>", "<null>"}, {"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token", "<sample:2>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getPendingTableCharacters", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "transition", "org.jsoup.parser.HtmlTreeBuilderState", "<sample:2>"}, {"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token", "<sample:4>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:6>", "1L", "<null>", "<sample:0>"}, false, 6, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "generateImpliedEndTags", ""}}, 2), new String[][]{{"append", "java.lang.String", "7"}, {"getElementsByIndexEquals", "int", "4"}, {"prepend", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:2>", "<sample:8>"}, false, 4, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "popStackToBefore", "java.lang.String", "112257T["}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilderState", "org.jsoup.parser.HtmlTreeBuilderState$1", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilder"}, new String[]{"<sample:4>", "<sample:4>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilderState", "process", "org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilder", "<sample:4>", "<sample:3>"}, {"org.jsoup.parser.HtmlTreeBuilderState", "process", "org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilder", "<sample:1>", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inSelectScope", new String[]{"java.lang.String"}, new String[]{"Title"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilderState", "<sample:4>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insertOnStackAfter", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:2>", "<sample:2>"}, false, 14, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "o8b", "<sample:7>", "", "<null>", "<sample:1>"}, {"org.jsoup.parser.HtmlTreeBuilder", "insertStartTag", "java.lang.String", "\u00e8"}, {"org.jsoup.parser.HtmlTreeBuilder", "clearStackToTableBodyContext", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insertOnStackAfter", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:3>", "<sample:11>"}, false, 11, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "ob", "<sample:7>", "1.5", "<null>", "<sample:0>"}, {"org.jsoup.parser.HtmlTreeBuilder", "processStartTag", "java.lang.String,org.jsoup.nodes.Attributes", "010", "<sample:0>"}, {"org.jsoup.parser.HtmlTreeBuilder", "generateImpliedEndTags", "java.lang.String", "1.12346l790123456"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insertOnStackAfter", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:2>", "<sample:2>"}, false, 14, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "o", "<sample:7>", "2.6l", "<null>", "<sample:0>"}, {"org.jsoup.parser.HtmlTreeBuilder", "processStartTag", "java.lang.String,org.jsoup.nodes.Attributes", "title", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insertOnStackAfter", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:3>", "<sample:1>"}, false, 10, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "", "<sample:10>", "2.6l0", "<null>", "<sample:8>"}, {"org.jsoup.parser.HtmlTreeBuilder", "inListItemScope", "java.lang.String", "-1.5"}, {"org.jsoup.parser.HtmlTreeBuilder", "processStartTag", "java.lang.String,org.jsoup.nodes.Attributes", "2020-d2-3/T25:6p1:61", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insertOnStackAfter", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:7>", "<sample:5>"}, false, 4, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "", "<sample:15>", "<a>b</ar", "<null>", "<sample:2>"}, {"org.jsoup.parser.HtmlTreeBuilder", "pushActiveFormattingElements", "org.jsoup.nodes.Element", "<sample:7>"}, {"org.jsoup.parser.HtmlTreeBuilder", "processStartTag", "java.lang.String,org.jsoup.nodes.Attributes", "textarea", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insertOnStackAfter", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:9>", "<sample:0>"}, false, 12, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "\n", "<sample:4>", "<;>b</ar", "<null>", "<sample:13>"}, {"org.jsoup.parser.HtmlTreeBuilder", "pushActiveFormattingElements", "org.jsoup.nodes.Element", "<sample:1>"}, {"org.jsoup.parser.HtmlTreeBuilder", "processStartTag", "java.lang.String,org.jsoup.nodes.Attributes", "o8l", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insertOnStackAfter", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:8>", "<sample:5>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "\t", "<sample:10>", ";;>t;/tbq", "<null>", "<sample:4>"}, {"org.jsoup.parser.HtmlTreeBuilder", "pushActiveFormattingElements", "org.jsoup.nodes.Element", "<sample:9>"}, {"org.jsoup.parser.HtmlTreeBuilder", "processStartTag", "java.lang.String,org.jsoup.nodes.Attributes", "a", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$StartTag"}, new String[]{"<null>"}, false, 7, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "getDocument", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "getHeadElement", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "onStack", "org.jsoup.nodes.Element", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "transition", new String[]{"org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilderState", "<sample:3>", "<sample:10>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:1>", "<sample:1>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"href", "<null>", "<a>b</a>", "<null>", "<sample:1>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "getFormElement", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[<html>\n <head></head>\n <body>\n  href\n </body>\n</html>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"\t", "<null>", "xmp", "<null>", "<sample:0>"}, false, 1, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "insertMarkerToFormattingElements", ""}}), new String[][]{{"add", "java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processEndTag", new String[]{"java.lang.String"}, new String[]{"table"}, false, 5, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "transition", "org.jsoup.parser.HtmlTreeBuilderState", "<sample:8>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"--1null", "<sample:5>", "a", "<null>", "<sample:5>"}, false, 12, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "currentElement", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "getFormElement", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilderState", "<sample:5>", "<sample:11>"}}, 3), new String[][]{{"listIterator", "", "4"}, {"previousIndex", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"b6_<aad>5./brnos", "<sample:4>", "nof`mfsB.1233n5670EE-5", "<null>", "<sample:8>"}, false, 10, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilderState", "<sample:5>", "<sample:8>"}}), new String[][]{{"isEmpty", "", "0"}, {"size", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"66_<ba]d>5.o.uf7;xnnesUa[itle25d512345l67089p34557890012{Hello, World", "<sample:4>", "<a?b<7a>", "<null>", "<sample:4>"}, false, 14, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "transition", "org.jsoup.parser.HtmlTreeBuilderState", "<sample:10>"}, {"org.jsoup.parser.HtmlTreeBuilder", "maybeSetBaseUri", "org.jsoup.nodes.Element", "<sample:2>"}, {"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilderState", "<sample:3>", "<sample:5>"}}), new String[][]{{"size", "", "0"}, {"iterator", "", "0"}, {"next", "", "5"}, {"after", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.TextNode", actual.getClass().getName());
  assertEquals("\n66_ {getWholeText=66_, hasParent=true, isBlank=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "replaceActiveFormattingElement", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:4>", "<sample:5>"}, false, 6, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "2020-01-01", "<sample:2>", "table", "<null>", "<sample:8>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:7>", "<sample:13>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<empty>", "http://example.com/a?b=c", "<null>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<!---->, state=InBody, currentElement=<body>\n <!---->\n</body>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "push", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:10>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<sample:0>", "1.12345678", "<null>", "<sample:3>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:6>", "", "<null>", "<sample:6>"}, false, 2, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "setPendingTableCharacters", "java.util.List", "<empty>"}, {"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilderState", "<sample:1>", "<sample:9>"}, {"org.jsoup.parser.HtmlTreeBuilder", "insertForm", "org.jsoup.parser.Token$StartTag,boolean", "<sample:4>", "false"}}, 2), new String[][]{{"getElementsByIndexLessThan", "int", "6"}, {"prepend", "java.lang.String", "6"}, {"attr", "java.lang.String", "1"}, {"addAll", "java.util.Collection", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:6>", "T\rIL", "<null>", "<sample:2>"}, false, 11, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilderState", "<sample:5>", "<sample:13>"}, {"org.jsoup.parser.HtmlTreeBuilder", "insertForm", "org.jsoup.parser.Token$StartTag,boolean", "<sample:2>", "true"}, {"org.jsoup.parser.HtmlTreeBuilder", "processStartTag", "java.lang.String", ".H?dxEq"}}, 2), new String[][]{{"getElementsByIndexLessThan", "int", "4"}, {"prepend", "java.lang.String", "1"}, {"tagName", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<0>\n <head></head>\n <body>\n  a\n </body>\n <0>\n  a\n </0>\n <0>\n  a\n  <0>\n   a\n   <0>\n    at\n   </0>\n  </0>\n </0>\n</0>, <0>\n a\n</0>, <0>\n a\n <0>\n  a\n  <0>\n   at\n  </0>\n </0>\n</0>, <0>\n a\n <0>\n  at\n </0>\n...#219#-152960490", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:6>", "SIKrekect2m7483648", "<null>", "<sample:10>"}, false, 10, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilderState", "<sample:6>", "<sample:15>"}, {"org.jsoup.parser.HtmlTreeBuilder", "toString", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "processStartTag", "java.lang.String", "6dtemplte"}}, 3), new String[][]{{"getElementsByIndexLessThan", "int", "4"}, {"prepend", "java.lang.String", "7"}, {"subList", "int,int", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$SubList", actual.getClass().getName());
  assertEquals("[<b>samplet</b>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:6>", "u\013\n\nlbX13-11ee0_InpraXdsHelko, Wnoframesxmpabc", "<null>", "<sample:7>"}, false, 7, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilderState", "<sample:5>", "<sample:12>"}, {"org.jsoup.parser.HtmlTreeBuilder", "isSpecial", "org.jsoup.nodes.Element", "<sample:5>"}, {"org.jsoup.parser.HtmlTreeBuilder", "processStartTag", "java.lang.String", "6dte9qlte2020-02--30T25:61:61"}}, 3), new String[][]{{"getElementsByIndexLessThan", "int", "4"}, {"prepend", "java.lang.String", "7"}, {"after", "java.lang.String", "6"}, {"eachAttr", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "removeFromActiveFormattingElements", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "initialiseParse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<sample:1>", "<a>b</ar", "<null>", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=null, state=Initial, currentElement=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:6>", "1\n12257T[", "<null>", "<sample:2>"}, false, 10, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilderState", "<sample:6>", "<sample:7>"}, {"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilderState", "<sample:4>", "<sample:12>"}, {"org.jsoup.parser.HtmlTreeBuilder", "processStartTag", "java.lang.String", "e"}}, 1), new String[][]{{"getElementsByIndexLessThan", "int", "7"}, {"prepend", "java.lang.String", "0"}, {"add", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getStack", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilderState", "<sample:4>", "<sample:13>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insertMarkerToFormattingElements", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "2.6l0", "<sample:15>", "<;>b</ar", "<null>", "<sample:11>"}, {"org.jsoup.parser.HtmlTreeBuilder", "insertStartTag", "java.lang.String", "2020-02-30T25:61:61"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=null, state=Initial, currentElement=<2020-02-30t25:61:61></2020-02-30t25:61:61>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:4>", "<sample:11>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:6>", "qKKsrtabl9e", "<null>", "<sample:14>"}, false, 5, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "processEndTag", "java.lang.String", "tq"}, {"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilderState", "<sample:4>", "<sample:14>"}, {"org.jsoup.parser.HtmlTreeBuilder", "popStackToClose", "java.lang.String", "tr"}}), new String[][]{{"elementSiblingIndex", "", "1"}, {"appendTo", "org.jsoup.nodes.Element", "6"}, {"before", "java.lang.String", "1"}, {"absUrl", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:6>", "nB7a", "<null>", "<sample:9>"}, false, 2, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "u\013\n\nlbX13-11ee0_InpraXdsHelko, Wnoframesxmpabc", "<sample:11>", "a b", "<null>", "<sample:11>"}, {"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilderState", "<sample:3>", "<sample:3>"}, {"org.jsoup.parser.HtmlTreeBuilder", "transition", "org.jsoup.parser.HtmlTreeBuilderState", "<sample:5>"}}, 2), new String[][]{{"dataset", "", "0"}, {"clear", "", "1"}, {"getOrDefault", "java.lang.Object,java.lang.Object", "7"}, {"keySet", "", "7"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:6>", "oB7a", "<null>", "<sample:9>"}, false, 2, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "u\013\n\nlbX13-11ee0_InpraXdsHelko, Wnoframesxmpabc", "<sample:1>", "a b", "<null>", "<sample:1>"}, {"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilderState", "<sample:3>", "<sample:15>"}, {"org.jsoup.parser.HtmlTreeBuilder", "transition", "org.jsoup.parser.HtmlTreeBuilderState", "<sample:5>"}}, 2), new String[][]{{"dataset", "", "0"}, {"clear", "", "1"}, {"getOrDefault", "java.lang.Object,java.lang.Object", "7"}, {"keySet", "", "7"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:6>", "oB7a\u00e9", "<null>", "<sample:9>"}, false, 14, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "u\013\n\nlbX13-11ee0_InpraXdsHelko, Wnoframesxmpabc", "<sample:1>", "a\037b1.5f", "<null>", "<sample:1>"}, {"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilderState", "<sample:3>", "<sample:2>"}, {"org.jsoup.parser.HtmlTreeBuilder", "clearStackToTableRowContext", ""}}), new String[][]{{"dataset", "", "0"}, {"clear", "", "1"}, {"getOrDefault", "java.lang.Object,java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:6>", ";;C/12:30:45", "<null>", "<sample:0>"}, false, 2, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "1t.4", "<sample:4>", "b\036D1.5if", "<null>", "<sample:1>"}, {"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilderState", "<sample:3>", "<sample:3>"}, {"org.jsoup.parser.HtmlTreeBuilder", "inScope", "java.lang.String[]", "<sample:0>"}}), new String[][]{{"dataset", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:6>", "+;;C/12:3", "<null>", "<sample:11>"}, false, 3, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "1t.4", "<sample:3>", "b\036D1.5if", "<null>", "<sample:4>"}, {"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilderState", "<sample:3>", "<sample:12>"}}, 3), new String[][]{{"dataNodes", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:6>", "a,bb,c", "<null>", "<sample:3>"}, false, 1, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "1/5", "<sample:10>", "nof`m6sB.123425670EE-4", "<null>", "<sample:3>"}, {"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilderState", "<sample:1>", "<sample:4>"}, {"org.jsoup.parser.HtmlTreeBuilder", "clearStackToTableContext", ""}}), new String[][]{{"hasSameValue", "java.lang.Object", "7"}, {"attr", "java.lang.String", "7"}, {"classNames", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:6>", "abplLi", "<null>", "<sample:8>"}, false, 1, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "-1.5", "<sample:10>", "nof`m6sB/123425670EE-4", "<null>", "<sample:11>"}, {"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilderState", "<sample:1>", "<sample:15>"}, {"org.jsoup.parser.HtmlTreeBuilder", "clearStackToTableContext", ""}}, 3), new String[][]{{"elementSiblingIndex", "", "7"}, {"attr", "java.lang.String", "7"}, {"classNames", "", "5"}, {"addAll", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:6>", "abpmmLit", "<null>", "<sample:0>"}, false, 7, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "-1.5", "<sample:10>", "nof`m6sB/123425670EE-4", "<null>", "<sample:11>"}, {"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilderState", "<sample:1>", "<sample:11>"}, {"org.jsoup.parser.HtmlTreeBuilder", "clearStackToTableContext", ""}}, 3), new String[][]{{"elementSiblingIndex", "", "7"}, {"attr", "java.lang.String", "1"}, {"classNames", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:6>", "}:", "<null>", "<sample:11>"}, false, 3, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "-1.5Temlate+1", "<sample:11>", "noe`m6sB/123425670EE-4", "<null>", "<sample:11>"}, {"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilderState", "<sample:0>", "<sample:12>"}, {"org.jsoup.parser.HtmlTreeBuilder", "clearStackToTableContext", ""}}, 3), new String[][]{{"elementSiblingIndex", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:6>", ",\u00e9", "<null>", "<sample:13>"}, false, 11, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "-1.5TePlate+1", "<sample:12>", "noe`m6sB/12342567/E-4", "<null>", "<sample:0>"}, {"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilderState", "<sample:6>", "<sample:7>"}}), new String[][]{{"hasSameValue", "java.lang.Object", "3"}, {"appendElement", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<sample></sample> {hasParent=true, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:6>", "1/55", "<null>", "<sample:10>"}, false, 12, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "\013\013\n\nlbX13-11e0__npraXesHelko, Worldnoscript", "<sample:12>", "noe`m6sB/12342567/E-\t4", "<null>", "<sample:1>"}, {"org.jsoup.parser.HtmlTreeBuilder", "inSelectScope", "java.lang.String", ";;C/12:30:45"}, {"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilderState", "<sample:7>", "<sample:12>"}}, 1), new String[][]{{"hasSameValue", "java.lang.Object", "2"}, {"getElementsMatchingOwnText", "java.util.regex.Pattern", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<html>\n <head></head>\n <body>\n  <a><b>t</b></a>\n </body>\n</html>, <html>\n <head></head>\n <body>\n  <a><b>t</b></a>\n </body>\n</html>, <head></head>, <body>\n <a><b>t</b></a>\n</body>, <a><b>t</b></a>, <b...#207#1880971451", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:6>", "1/55", "<null>", "<sample:8>"}, false, 12, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "\013\013\n\nlbX13-11e0__npraXesHelko, Worldnoscript", "<sample:12>", "noe`m6sB/12342567/E-\t4", "<null>", "<sample:1>"}, {"org.jsoup.parser.HtmlTreeBuilder", "inSelectScope", "java.lang.String", ";;C/12:3E0:45"}, {"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilderState", "<sample:7>", "<sample:14>"}}, 1), new String[][]{{"getElementsByAttributeValueEnding", "java.lang.String,java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:6>", "/a/b", "<null>", "<sample:8>"}, false, 13, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "\013\013\n\nlbX13-11e0__npsaXesHelko, Worldnoscript", "<sample:12>", "noe`m6sB/12342567/E-\t4", "<null>", "<sample:1>"}, {"org.jsoup.parser.HtmlTreeBuilder", "inSelectScope", "java.lang.String", ";;C/12:3E0:45tfoot"}, {"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilderState", "<sample:7>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  <a><b>t</b></a>\n </body>\n</html> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:6>", "712345668901234567890123456789", "<null>", "<sample:11>"}, false, 15, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "\013\013\n.\nlbX13-c11e0^_npsaXesHelko\\ Worldnoscriptselect", "<sample:7>", "2020_-d2-3/T25:6p1:61", "<null>", "<sample:8>"}, {"org.jsoup.parser.HtmlTreeBuilder", "inSelectScope", "java.lang.String", "title"}, {"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilderState", "<sample:1>", "<sample:5>"}}, 1), new String[][]{{"attr", "java.lang.String,java.lang.String", "6"}, {"before", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:6>", "712345668901234657890123456789 ", "<null>", "<sample:8>"}, false, 6, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "nB7ai", "<sample:8>", "2020_-d2-3/T25:6p1:61", "<null>", "<sample:8>"}, {"org.jsoup.parser.HtmlTreeBuilder", "inSelectScope", "java.lang.String", "title"}, {"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilderState", "<sample:1>", "<sample:2>"}}), new String[][]{{"attr", "java.lang.String,java.lang.String", "5"}, {"before", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:5>", "<sample:14>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "getFromStack", "java.lang.String", "+1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "removeLastFormattingElement", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilderState", "<sample:5>", "<sample:16>"}, {"org.jsoup.parser.HtmlTreeBuilder", "clearFormattingElementsToLastMarker", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "getFromStack", "java.lang.String", "abpmmLit"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "newPendingTableCharacters", new String[]{}, new String[]{}, false, 32, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "te ", "<sample:12>", "202;f-d2-3/T25:6p1:61true", "<null>", "<sample:10>"}, {"org.jsoup.parser.HtmlTreeBuilder", "toString", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "isInActiveFormattingElements", "org.jsoup.nodes.Element", "<sample:5>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "clearStackToTableContext", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilderState", "<sample:7>", "<sample:18>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "clearStackToTableContext", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilderState", "<sample:7>", "<sample:17>"}, {"org.jsoup.parser.HtmlTreeBuilder", "popStackToBefore", "java.lang.String", "2020-02-30T25:61:61"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:3>", "<sample:17>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:3>", "<sample:18>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:3>", "<sample:19>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:3>", "<sample:22>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:7>", "<sample:20>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "insertStartTag", "java.lang.String", "nofr`me"}, {"org.jsoup.parser.HtmlTreeBuilder", "removeLastFormattingElement", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:7>", "<sample:19>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "insertStartTag", "java.lang.String", "nofr`me"}, {"org.jsoup.parser.HtmlTreeBuilder", "removeLastFormattingElement", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:2>", "<sample:19>"}, false, 4, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "insertStartTag", "java.lang.String", "2147483648"}, {"org.jsoup.parser.HtmlTreeBuilder", "removeFromActiveFormattingElements", "org.jsoup.nodes.Element", "<sample:12>"}, {"org.jsoup.parser.HtmlTreeBuilder", "removeLastFormattingElement", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:2>", "<sample:21>"}, false, 4, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "insertStartTag", "java.lang.String", "2147483648"}, {"org.jsoup.parser.HtmlTreeBuilder", "removeFromActiveFormattingElements", "org.jsoup.nodes.Element", "<sample:12>"}, {"org.jsoup.parser.HtmlTreeBuilder", "removeLastFormattingElement", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String", "org.jsoup.nodes.Attributes"}, new String[]{"my", "<sample:3>"}, false, 6, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "n", "<sample:10>", "-0.0", "<null>", "<sample:17>"}, {"org.jsoup.parser.HtmlTreeBuilder", "setFosterInserts", "boolean", "true"}, {"org.jsoup.parser.HtmlTreeBuilder", "framesetOk", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<my>, state=InBody, currentElement=<my></my>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:2>", "<sample:18>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "insert", "org.jsoup.parser.Token$Character", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String", "org.jsoup.nodes.Attributes"}, new String[]{"!", "<sample:2>"}, false, 13, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "rn2147483648", "<sample:9>", "-..0", "<null>", "<sample:10>"}, {"org.jsoup.parser.HtmlTreeBuilder", "removeFromStack", "org.jsoup.nodes.Element", "<sample:3>"}, {"org.jsoup.parser.HtmlTreeBuilder", "popStackToClose", "java.lang.String[]", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<!>, state=InBody, currentElement=<!></!>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String", "org.jsoup.nodes.Attributes"}, new String[]{"ile", "<sample:6>"}, false, 8, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "rn2147483638", "<sample:8>", "-..0html", "<null>", "<sample:13>"}, {"org.jsoup.parser.HtmlTreeBuilder", "popStackToClose", "java.lang.String", "1.1234567"}, {"org.jsoup.parser.HtmlTreeBuilder", "popStackToClose", "java.lang.String[]", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<ile  #comment=\"a\">, state=InBody, currentElement=<ile #comment=\"a\"></ile>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String", "org.jsoup.nodes.Attributes"}, new String[]{"noembed", "<sample:4>"}, false, 10, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "P1H", "<sample:12>", "--.0iml", "<null>", "<sample:16>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<noembed  #comment=\"a\">, state=Text, currentElement=<noembed #comment=\"a\"></noembed>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String", "org.jsoup.nodes.Attributes"}, new String[]{"xmp", "<sample:0>"}, false, 10, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "H", "<sample:1>", "a,bbCc", "<null>", "<sample:5>"}, {"org.jsoup.parser.HtmlTreeBuilder", "insert", "org.jsoup.parser.Token$StartTag", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<xmp>, state=Text, currentElement=<xmp></xmp>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String", "org.jsoup.nodes.Attributes"}, new String[]{"ol", "<sample:0>"}, false, 15, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "inButtonScope", "java.lang.String", ";C/12:30;44"}, {"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "J0xFFFFFFF1.17234567", "<sample:15>", "2020-02-30T25:61:1", "<null>", "<sample:4>"}, {"org.jsoup.parser.HtmlTreeBuilder", "insertOnStackAfter", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:10>", "<sample:12>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<ol>, state=InBody, currentElement=<ol></ol>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String", "org.jsoup.nodes.Attributes"}, new String[]{"o1nsoll`bc1.5d", "<sample:1>"}, false, 6, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "getPendingTableCharacters", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "I0x1.1123456789013456thead", "<sample:7>", "bx", "<null>", "<sample:9>"}, {"org.jsoup.parser.HtmlTreeBuilder", "processEndTag", "java.lang.String", "a"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<o1nsoll`bc1.5d>, state=InBody, currentElement=<o1nsoll`bc1.5d></o1nsoll`bc1.5d>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String", "org.jsoup.nodes.Attributes"}, new String[]{"nof_mfsB.123325670EE-4-1", "<sample:5>"}, false, 15, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "I0x1.11234566789013456theadselect", "<sample:7>", "bbx16.5", "<null>", "<sample:12>"}, {"org.jsoup.parser.HtmlTreeBuilder", "framesetOk", "boolean", "false"}, {"org.jsoup.parser.HtmlTreeBuilder", "processEndTag", "java.lang.String", "ol"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<nof_mfsB.123325670EE-4-1>, state=InBody, currentElement=<nof_mfsB.123325670EE-4-1></nof_mfsB.123325670EE-4-1>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String", "org.jsoup.nodes.Attributes"}, new String[]{"3030XdH-,/T35::E6p16-1", "<sample:6>"}, false, 15, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "I0x1.11234566789013456theadselect", "<sample:7>", "bbx16.6", "<null>", "<sample:12>"}, {"org.jsoup.parser.HtmlTreeBuilder", "popStackToBefore", "java.lang.String", "noe`m6sB/12342567/E-4"}, {"org.jsoup.parser.HtmlTreeBuilder", "processEndTag", "java.lang.String", "abplLhi"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<3030XdH-,/T35::E6p16-1  #comment=\"a\">, state=InBody, currentElement=<3030XdH-,/T35::E6p16-1 #comment=\"a\"></3030XdH-,/T35::E6p16-1>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String", "org.jsoup.nodes.Attributes"}, new String[]{"iframe", "<null>"}, false, 7, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "nCe`", "<sample:2>", "oB7a\u00e9", "<null>", "<sample:2>"}, {"org.jsoup.parser.HtmlTreeBuilder", "processEndTag", "java.lang.String", "onsollabc1.5d"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String", "org.jsoup.nodes.Attributes"}, new String[]{"-1/./ht\nml", "<sample:6>"}, false, 9, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "Ce`", "<sample:2>", "oB6a\u00e9", "<null>", "<sample:4>"}, {"org.jsoup.parser.HtmlTreeBuilder", "inTableScope", "java.lang.String", "ol"}, {"org.jsoup.parser.HtmlTreeBuilder", "processEndTag", "java.lang.String", "ipnllaabc<.5:202/-01-001"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<-1/./ht\nml  #comment=\"a\">, state=InBody, currentElement=<-1/./ht\nml #comment=\"a\"></-1/./ht\nml>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:3>", "<sample:20>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:2>", "<sample:17>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String", "org.jsoup.nodes.Attributes"}, new String[]{"script", "<sample:1>"}, false, 9, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "a\037b1.5f", "<sample:3>", "abc", "<null>", "<sample:6>"}, {"org.jsoup.parser.HtmlTreeBuilder", "clearFormattingElementsToLastMarker", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "processEndTag", "java.lang.String", "1..1234568901233"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<script>, state=Text, currentElement=<script></script>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String", "org.jsoup.nodes.Attributes"}, new String[]{"noframes", "<sample:7>"}, false, 6, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "a\037b1.5f1.1294567td", "<sample:3>", "`bc", "<null>", "<sample:8>"}, {"org.jsoup.parser.HtmlTreeBuilder", "processEndTag", "java.lang.String", "5ktle"}, {"org.jsoup.parser.HtmlTreeBuilder", "clearStackToTableBodyContext", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<noframes>, state=Text, currentElement=<noframes></noframes>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String", "org.jsoup.nodes.Attributes"}, new String[]{"plaintext", "<sample:6>"}, false, 6, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "1..123456890133", "<sample:3>", "`b2020-01-01", "<null>", "<sample:1>"}, {"org.jsoup.parser.HtmlTreeBuilder", "insert", "org.jsoup.nodes.Element", "<sample:7>"}, {"org.jsoup.parser.HtmlTreeBuilder", "processEndTag", "java.lang.String", "raybcCc\036H"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<plaintext  #comment=\"a\">, state=InBody, currentElement=<plaintext #comment=\"a\"></plaintext>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String", "org.jsoup.nodes.Attributes"}, new String[]{"html", "<sample:2>"}, false, 11, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "`gl2020-01-01", "<sample:5>", "`be", "<null>", "<sample:15>"}, {"org.jsoup.parser.HtmlTreeBuilder", "removeLastFormattingElement", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "processEndTag", "java.lang.String", "http://e;xample.com/Ta7?b=ci"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String", "org.jsoup.nodes.Attributes"}, new String[]{"select", "<null>"}, false, 3, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "`gl2020T-01-011E-5", "<sample:4>", "table", "<null>", "<sample:15>"}, {"org.jsoup.parser.HtmlTreeBuilder", "removeLastFormattingElement", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "processEndTag", "java.lang.String", "h-1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<select>, state=InSelect, currentElement=<select></select>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:4>", "<sample:5>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:4>", "<sample:16>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inSelectScope", new String[]{"java.lang.String"}, new String[]{"template"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilderState", "<sample:5>", "<sample:18>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inButtonScope", new String[]{"java.lang.String"}, new String[]{""}, false, 8, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilderState", "<sample:7>", "<sample:21>"}, {"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilderState", "<sample:6>", "<sample:13>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "clearFormattingElementsToLastMarker", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<sample:1>", "a\037b1.53f2.1294567t\n", "<null>", "<sample:7>"}, {"org.jsoup.parser.HtmlTreeBuilder", "setHeadElement", "org.jsoup.nodes.Element", "<sample:11>"}, {"org.jsoup.parser.HtmlTreeBuilder", "aboveOnStack", "org.jsoup.nodes.Element", "<sample:15>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "clearFormattingElementsToLastMarker", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<sample:8>", "o8l", "<null>", "<sample:14>"}, {"org.jsoup.parser.HtmlTreeBuilder", "resetInsertionMode", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "pushActiveFormattingElements", "org.jsoup.nodes.Element", "<sample:1>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "clearFormattingElementsToLastMarker", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<sample:6>", "}", "<null>", "<sample:10>"}, {"org.jsoup.parser.HtmlTreeBuilder", "resetInsertionMode", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "pushActiveFormattingElements", "org.jsoup.nodes.Element", "<null>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "clearFormattingElementsToLastMarker", new String[]{}, new String[]{}, false, 44, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<sample:6>", "HH", "<null>", "<sample:4>"}, {"org.jsoup.parser.HtmlTreeBuilder", "resetInsertionMode", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "processEndTag", "java.lang.String", "p"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=</p>, state=InBody, currentElement=<body>\n <a><b>t</b></a>\n</body>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "clearFormattingElementsToLastMarker", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<sample:6>", "-,1,nnulkTitl", "<null>", "<sample:8>"}, {"org.jsoup.parser.HtmlTreeBuilder", "resetInsertionMode", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "processEndTag", "java.lang.String", "html"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=</html>, state=AfterAfterBody, currentElement=<body>\n <a><b>t</b></a>\n</body>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$Character"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "lastFormattingElement", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "defaultSettings", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "insert", "org.jsoup.parser.Token$Character", "<sample:6>"}, {"org.jsoup.parser.HtmlTreeBuilder", "isFosterInserts", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.ParseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insertEmpty", new String[]{"org.jsoup.parser.Token$StartTag"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "getPendingTableCharacters", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "processStartTag", "java.lang.String", "i"}, {"org.jsoup.parser.HtmlTreeBuilder", "processStartTag", "java.lang.String", "\n"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getHeadElement", new String[]{}, new String[]{}, false, 18, new String[][]{}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getHeadElement", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "insert", "org.jsoup.parser.Token$Comment", "<sample:7>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:3>", "<sample:5>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:6>", "<sample:5>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:3>", "<sample:5>"}, false, 1, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "generateImpliedEndTags", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:3>", "<sample:8>"}, false, 1, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "generateImpliedEndTags", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String", "org.jsoup.nodes.Attributes"}, new String[]{" ", "<sample:6>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "removeLastFormattingElement", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insertInFosterParent", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "inButtonScope", "java.lang.String", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "removeFromActiveFormattingElements", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "insert", "org.jsoup.parser.Token$StartTag", "<sample:5>"}, {"org.jsoup.parser.HtmlTreeBuilder", "removeLastFormattingElement", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "removeFromActiveFormattingElements", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "insert", "org.jsoup.parser.Token$StartTag", "<sample:6>"}, {"org.jsoup.parser.HtmlTreeBuilder", "removeLastFormattingElement", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "isSpecial", "org.jsoup.nodes.Element", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getActiveFormattingElement", new String[]{"java.lang.String"}, new String[]{"1.5e300"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "clearStackToTableContext", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "insert", "org.jsoup.nodes.Element", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getFormElement", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "popStackToClose", new String[]{"java.lang.String"}, new String[]{"1.123456?7abc"}, false, 3, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "pop", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "popStackToClose", new String[]{"java.lang.String"}, new String[]{"nul"}, false, 3, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "replaceOnStack", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:5>", "<sample:4>"}, {"org.jsoup.parser.HtmlTreeBuilder", "inSelectScope", "java.lang.String", "5."}, {"org.jsoup.parser.HtmlTreeBuilder", "pop", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getFromStack", new String[]{"java.lang.String"}, new String[]{"t\u00e9ue010"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "maybeSetBaseUri", "org.jsoup.nodes.Element", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getFromStack", new String[]{"java.lang.String"}, new String[]{"{\"I0w\u00e9F2W"}, false, 13, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "defaultSettings", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "newPendingTableCharacters", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "clearStackToTableContext", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "maybeSetBaseUri", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:7>"}, false, 5, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "getBaseUri", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "resetInsertionMode", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "maybeSetBaseUri", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "getBaseUri", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "resetInsertionMode", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insertOnStackAfter", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:5>", "<sample:4>"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "originalState", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "popStackToClose", new String[]{"java.lang.String[]"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "runParser", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "getActiveFormattingElement", "java.lang.String", "noframes"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inScope", new String[]{"java.lang.String[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "error", "org.jsoup.parser.HtmlTreeBuilderState", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inScope", new String[]{"java.lang.String[]"}, new String[]{"<sample:0>"}, false, 12, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "inTableScope", "java.lang.String", "t"}, {"org.jsoup.parser.HtmlTreeBuilder", "clearStackToTableRowContext", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "clearFormattingElementsToLastMarker", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "replaceActiveFormattingElement", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:6>", "<sample:4>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "popStackToClose", "java.lang.String[]", "<sample:2>"}, {"org.jsoup.parser.HtmlTreeBuilder", "runParser", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "removeFromStack", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "popStackToClose", "java.lang.String", "{\"a\":1}"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "onStack", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:7>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "onStack", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:3>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getPendingTableCharacters", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token", "<sample:1>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getPendingTableCharacters", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token", "<sample:1>"}, {"org.jsoup.parser.HtmlTreeBuilder", "getStack", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getPendingTableCharacters", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "setFormElement", "org.jsoup.nodes.FormElement", "<sample:1>"}, {"org.jsoup.parser.HtmlTreeBuilder", "transition", "org.jsoup.parser.HtmlTreeBuilderState", "<sample:5>"}, {"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token", "<sample:1>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getPendingTableCharacters", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "setFormElement", "org.jsoup.nodes.FormElement", "<sample:2>"}, {"org.jsoup.parser.HtmlTreeBuilder", "transition", "org.jsoup.parser.HtmlTreeBuilderState", "<sample:4>"}, {"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token", "<sample:1>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "popStackToBefore", new String[]{"java.lang.String"}, new String[]{"tfoot"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getPendingTableCharacters", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "getActiveFormattingElement", "java.lang.String", "1.5"}, {"org.jsoup.parser.HtmlTreeBuilder", "transition", "org.jsoup.parser.HtmlTreeBuilderState", "<sample:4>"}, {"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token", "<sample:3>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getPendingTableCharacters", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "getActiveFormattingElement", "java.lang.String", " "}, {"org.jsoup.parser.HtmlTreeBuilder", "transition", "org.jsoup.parser.HtmlTreeBuilderState", "<sample:6>"}, {"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token", "<sample:3>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getPendingTableCharacters", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "transition", "org.jsoup.parser.HtmlTreeBuilderState", "<sample:2>"}, {"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token", "<sample:3>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getPendingTableCharacters", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "transition", "org.jsoup.parser.HtmlTreeBuilderState", "<sample:2>"}, {"org.jsoup.parser.HtmlTreeBuilder", "processStartTag", "java.lang.String", ".5"}, {"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token", "<sample:3>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getPendingTableCharacters", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "transition", "org.jsoup.parser.HtmlTreeBuilderState", "<sample:1>"}, {"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "", "<sample:5>", "2147483648", "<sample:0>", "<null>"}, {"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token", "<sample:3>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getPendingTableCharacters", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "transition", "org.jsoup.parser.HtmlTreeBuilderState", "<sample:0>"}, {"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "", "<sample:5>", "2147483648", "<sample:0>", "<null>"}, {"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token", "<sample:3>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insertMarkerToFormattingElements", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "inTableScope", "java.lang.String", "1.5f"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "popStackToClose", new String[]{"java.lang.String[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "inScope", "java.lang.String,java.lang.String[]", "-0.0", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$StartTag"}, new String[]{"<sample:0>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "newPendingTableCharacters", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "xmp", "<sample:6>", "title", "<null>", "<sample:1>"}, {"org.jsoup.parser.HtmlTreeBuilder", "insert", "org.jsoup.parser.Token$StartTag", "<sample:1>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "newPendingTableCharacters", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "xmp", "<sample:6>", "title", "<null>", "<sample:1>"}, {"org.jsoup.parser.HtmlTreeBuilder", "insert", "org.jsoup.parser.Token$StartTag", "<sample:1>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "newPendingTableCharacters", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "xmp", "<sample:6>", "title", "<null>", "<sample:1>"}, {"org.jsoup.parser.HtmlTreeBuilder", "insert", "org.jsoup.nodes.Element", "<sample:7>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inSelectScope", new String[]{"java.lang.String"}, new String[]{"--1"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "newPendingTableCharacters", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "xtp", "<sample:6>", "itle1L", "<null>", "<sample:1>"}, {"org.jsoup.parser.HtmlTreeBuilder", "removeFromStack", "org.jsoup.nodes.Element", "<sample:1>"}, {"org.jsoup.parser.HtmlTreeBuilder", "insert", "org.jsoup.nodes.Element", "<sample:7>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "runParser", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "push", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:5>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:3>", "f`  a010202-02-30T2m5:61:61", "<null>", "<sample:2>"}, false, 9, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "isFosterInserts", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "newPendingTableCharacters", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  a b \n </body>\n</html> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:2>", "thead", "<null>", "<sample:3>"}, false, 10, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "insert", "org.jsoup.nodes.Element", "<null>"}}, 2), new String[][]{{"clearAttributes", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  a b\n </body>\n</html> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:2>", "thea", "<null>", "<sample:7>"}, false, 8, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "insert", "org.jsoup.nodes.Element", "<sample:2>"}, {"org.jsoup.parser.HtmlTreeBuilder", "popStackToClose", "java.lang.String[]", "<sample:0>"}, {"org.jsoup.parser.HtmlTreeBuilder", "inSelectScope", "java.lang.String", "Hello, World"}}, 3), new String[][]{{"clearAttributes", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  a b\n </body>\n</html> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<null>", "thea", "<null>", "<sample:7>"}, false, 8, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "insert", "org.jsoup.nodes.Element", "<sample:2>"}, {"org.jsoup.parser.HtmlTreeBuilder", "popStackToClose", "java.lang.String[]", "<sample:0>"}, {"org.jsoup.parser.HtmlTreeBuilder", "inSelectScope", "java.lang.String", "Hello, World"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:3>", "t ea", "<null>", "<sample:10>"}, false, 5, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "insert", "org.jsoup.nodes.Element", "<sample:2>"}, {"org.jsoup.parser.HtmlTreeBuilder", "popStackToClose", "java.lang.String[]", "<null>"}, {"org.jsoup.parser.HtmlTreeBuilder", "inSelectScope", "java.lang.String", "Hello,World"}}, 3), new String[][]{{"clearAttributes", "", "2"}, {"getElementsMatchingOwnText", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inButtonScope", new String[]{"java.lang.String"}, new String[]{"1L"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "getHeadElement", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "removeFromActiveFormattingElements", "org.jsoup.nodes.Element", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:3>", "pscriAt", "<null>", "<sample:14>"}, false, 4, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "isInActiveFormattingElements", "org.jsoup.nodes.Element", "<sample:6>"}}, 3), new String[][]{{"data", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:1>", "hu]l", "<null>", "<sample:0>"}, false, 1, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "insert", "org.jsoup.nodes.Element", "<sample:7>"}}, 2), new String[][]{{"appendText", "java.lang.String", "6"}, {"getElementsContainingOwnText", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<html>\n <head></head>\n <body>\n  a\n </body>\n</html>0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:1>", ":h", "<null>", "<sample:7>"}, false, 10, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "setPendingTableCharacters", "java.util.List", "<sample:0>"}, {"org.jsoup.parser.HtmlTreeBuilder", "popStackToBefore", "java.lang.String", "<a>b</a>"}}, 2), new String[][]{{"appendText", "java.lang.String", "6"}, {"getElementsContainingOwnText", "java.lang.String", "2"}, {"after", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "setFosterInserts", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "removeFromStack", "org.jsoup.nodes.Element", "<sample:3>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:2>", "1.12345678901234", "<null>", "<sample:10>"}, false, 10, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "inScope", "java.lang.String[]", "<sample:0>"}}, 2), new String[][]{{"createElement", "java.lang.String", "1"}, {"empty", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:2>", ".5", "<null>", "<sample:10>"}, false, 7, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "isSpecial", "org.jsoup.nodes.Element", "<sample:6>"}, {"org.jsoup.parser.HtmlTreeBuilder", "inScope", "java.lang.String[]", "<sample:0>"}}, 2), new String[][]{{"createElement", "java.lang.String", "6"}, {"empty", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<0></0> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:1>", ".5", "<null>", "<sample:9>"}, false, 8, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "isSpecial", "org.jsoup.nodes.Element", "<sample:6>"}, {"org.jsoup.parser.HtmlTreeBuilder", "inScope", "java.lang.String[]", "<sample:0>"}}, 2), new String[][]{{"absUrl", "java.lang.String", "6"}, {"data", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:4>", "", "<null>", "<sample:8>"}, false, 5, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "isSpecial", "org.jsoup.nodes.Element", "<sample:5>"}}, 1), new String[][]{{"append", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  a b\n </body>\n</html>0 {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:4>", "", "<null>", "<sample:8>"}, false, 5, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "isInActiveFormattingElements", "org.jsoup.nodes.Element", "<null>"}, {"org.jsoup.parser.HtmlTreeBuilder", "isSpecial", "org.jsoup.nodes.Element", "<sample:8>"}, {"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<sample:1>", "table", "<sample:0>", "<sample:2>"}}, 1), new String[][]{{"append", "java.lang.String", "2"}, {"childNodeSize", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:0>", "\\", "<null>", "<sample:7>"}, false, 2, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "initialiseParse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<empty>", "1.1234567890123456", "<sample:5>", "<sample:4>"}, {"org.jsoup.parser.HtmlTreeBuilder", "generateImpliedEndTags", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "inScope", "java.lang.String", "tbooxy"}}, 1), new String[][]{{"append", "java.lang.String", "7"}, {"getElementsByAttributeValueContaining", "java.lang.String,java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:1>", "]ez", "<null>", "<sample:8>"}, false, 3, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "inScope", "java.lang.String[]", "<sample:0>"}, {"org.jsoup.parser.HtmlTreeBuilder", "generateImpliedEndTags", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "insertInFosterParent", "org.jsoup.nodes.Node", "<sample:1>"}}, 2), new String[][]{{"append", "java.lang.String", "7"}, {"createElement", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<sample></sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:1>", "z", "<null>", "<null>"}, false, 5, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "inScope", "java.lang.String[]", "<sample:0>"}, {"org.jsoup.parser.HtmlTreeBuilder", "generateImpliedEndTags", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "insertInFosterParent", "org.jsoup.nodes.Node", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$Character"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "insert", "org.jsoup.parser.Token$StartTag", "<sample:1>"}, {"org.jsoup.parser.HtmlTreeBuilder", "clearStackToTableBodyContext", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:6>", "112267T[", "<null>", "<sample:5>"}, false, 1, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "pop", ""}}, 1), new String[][]{{"append", "java.lang.String", "1"}, {"attr", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "markInsertionMode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "insertEmpty", "org.jsoup.parser.Token$StartTag", "<null>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "removeFromStack", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String"}, new String[]{"/a/b"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String"}, new String[]{"/a/b"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "initialiseParse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<sample:1>", "\t", "<sample:5>", "<sample:3>"}, {"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<sample:0>", "--1", "<sample:3>", "<sample:2>"}, {"org.jsoup.parser.HtmlTreeBuilder", "aboveOnStack", "org.jsoup.nodes.Element", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$Character"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inTableScope", new String[]{"java.lang.String"}, new String[]{"0x1F"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "popStackToClose", "java.lang.String[]", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inTableScope", new String[]{"java.lang.String"}, new String[]{"1.12346l890123456"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "transition", "org.jsoup.parser.HtmlTreeBuilderState", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inTableScope", new String[]{"java.lang.String"}, new String[]{"1.12346l790123456"}, false, 11, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "isFosterInserts", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inTableScope", new String[]{"java.lang.String"}, new String[]{"1.12346l7901I3456"}, false, 11, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "state", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "isFosterInserts", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "defaultSettings", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "clearFormattingElementsToLastMarker", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "clearStackToTableContext", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.ParseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "defaultSettings", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "clearFormattingElementsToLastMarker", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "resetInsertionMode", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "clearStackToTableContext", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.ParseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "initialiseParse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<sample:2>", "1.5", "<sample:1>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "initialiseParse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<sample:2>", "1.5", "<sample:1>", "<sample:7>"}, {"org.jsoup.parser.HtmlTreeBuilder", "inListItemScope", "java.lang.String", "title"}, {"org.jsoup.parser.HtmlTreeBuilder", "setFosterInserts", "boolean", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilderState", "org.jsoup.parser.HtmlTreeBuilderState$1", "valueOf", new String[]{"java.lang.String"}, new String[]{"1.1234567890123456"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insertEmpty", new String[]{"org.jsoup.parser.Token$StartTag"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "processStartTag", "java.lang.String", "noscript"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insertEmpty", new String[]{"org.jsoup.parser.Token$StartTag"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "getPendingTableCharacters", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "processStartTag", "java.lang.String", "i"}, {"org.jsoup.parser.HtmlTreeBuilder", "processStartTag", "java.lang.String", "\n"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getHeadElement", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "framesetOk", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String", "org.jsoup.nodes.Attributes"}, new String[]{" ", "<sample:4>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "removeLastFormattingElement", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insertInFosterParent", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "generateImpliedEndTags", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getFormElement", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:1>", "<sample:2>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "resetInsertionMode", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "removeFromStack", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "isFragmentParsing", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "isFragmentParsing", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "removeFromActiveFormattingElements", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "insert", "org.jsoup.parser.Token$StartTag", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "aboveOnStack", "org.jsoup.nodes.Element", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getActiveFormattingElement", new String[]{"java.lang.String"}, new String[]{"1.5e300"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "markInsertionMode", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "isFragmentParsing", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "setHeadElement", "org.jsoup.nodes.Element", "<sample:6>"}, {"org.jsoup.parser.HtmlTreeBuilder", "pushActiveFormattingElements", "org.jsoup.nodes.Element", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "generateImpliedEndTags", new String[]{"java.lang.String"}, new String[]{"1.5"}, false, 1, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "popStackToClose", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "pop", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "originalState", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "setFormElement", new String[]{"org.jsoup.nodes.FormElement"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "originalState", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inScope", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"td", "<null>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "onStack", "org.jsoup.nodes.Element", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getFromStack", new String[]{"java.lang.String"}, new String[]{" "}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "clearStackToTableContext", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "insert", "org.jsoup.nodes.Element", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "removeLastFormattingElement", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "popStackToClose", new String[]{"java.lang.String"}, new String[]{"xmp"}, false, 4, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "pop", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "setPendingTableCharacters", "java.util.List", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getFromStack", new String[]{"java.lang.String"}, new String[]{"--1"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "maybeSetBaseUri", "org.jsoup.nodes.Element", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insertMarkerToFormattingElements", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "setPendingTableCharacters", new String[]{"java.util.List"}, new String[]{"<null>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "maybeSetBaseUri", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:5>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "clearStackToTableBodyContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "onStack", "org.jsoup.nodes.Element", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilderState", "org.jsoup.parser.HtmlTreeBuilderState$1", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilder"}, new String[]{"<sample:0>", "<sample:4>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilderState", "process", "org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilder", "<null>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insertForm", new String[]{"org.jsoup.parser.Token$StartTag", "boolean"}, new String[]{"<sample:1>", "false"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insertOnStackAfter", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:6>", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "originalState", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "popStackToBefore", new String[]{"java.lang.String"}, new String[]{"iframe"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "removeLastFormattingElement", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "popStackToClose", new String[]{"java.lang.String[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "getActiveFormattingElement", "java.lang.String", "noframes"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inScope", new String[]{"java.lang.String[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "error", "org.jsoup.parser.HtmlTreeBuilderState", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "clearFormattingElementsToLastMarker", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inSelectScope", new String[]{"java.lang.String"}, new String[]{"1.5e300"}, false, 2, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "setFosterInserts", "boolean", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "replaceActiveFormattingElement", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:4>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "pushActiveFormattingElements", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "currentElement", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insertStartTag", new String[]{"java.lang.String"}, new String[]{"1.5f"}, false, 1, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "inScope", "java.lang.String,java.lang.String[]", "table", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "replaceOnStack", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:6>", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "onStack", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "resetInsertionMode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "insert", "org.jsoup.parser.Token$StartTag", "<sample:1>"}, {"org.jsoup.parser.HtmlTreeBuilder", "pushActiveFormattingElements", "org.jsoup.nodes.Element", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "reconstructFormattingElements", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "resetInsertionMode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "insert", "org.jsoup.parser.Token$StartTag", "<sample:0>"}, {"org.jsoup.parser.HtmlTreeBuilder", "getDocument", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "pushActiveFormattingElements", "org.jsoup.nodes.Element", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insert", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getPendingTableCharacters", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token", "<sample:1>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insertStartTag", new String[]{"java.lang.String"}, new String[]{"plaintext"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "popStackToClose", "java.lang.String[]", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getPendingTableCharacters", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "transition", "org.jsoup.parser.HtmlTreeBuilderState", "<sample:3>"}, {"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token", "<sample:3>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getPendingTableCharacters", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "transition", "org.jsoup.parser.HtmlTreeBuilderState", "<sample:2>"}, {"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token", "<sample:3>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getPendingTableCharacters", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "transition", "org.jsoup.parser.HtmlTreeBuilderState", "<sample:5>"}, {"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token", "<sample:3>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "transition", new String[]{"org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "generateImpliedEndTags", "java.lang.String", "1.12345678901234567"}, {"org.jsoup.parser.HtmlTreeBuilder", "setFosterInserts", "boolean", "false"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "isFosterInserts", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "framesetOk", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "toString", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "newPendingTableCharacters", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "maybeSetBaseUri", "org.jsoup.nodes.Element", "<null>"}, {"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "xmp", "<sample:6>", "title", "<null>", "<sample:1>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$Comment"}, new String[]{"<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "newPendingTableCharacters", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "xmp", "<sample:6>", "title", "<null>", "<sample:1>"}, {"org.jsoup.parser.HtmlTreeBuilder", "insert", "org.jsoup.parser.Token$StartTag", "<sample:0>"}, {"org.jsoup.parser.HtmlTreeBuilder", "insert", "org.jsoup.nodes.Element", "<sample:7>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "newPendingTableCharacters", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "xtp", "<sample:6>", "itle", "<null>", "<sample:1>"}, {"org.jsoup.parser.HtmlTreeBuilder", "insert", "org.jsoup.nodes.Element", "<sample:7>"}, {"org.jsoup.parser.HtmlTreeBuilder", "pop", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "clearStackToTableRowContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "setFormElement", "org.jsoup.nodes.FormElement", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "isSpecial", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "runParser", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "initialiseParse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<sample:1>", "abc", "<sample:3>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "aboveOnStack", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processEndTag", new String[]{"java.lang.String"}, new String[]{"Hello, World"}, false, 6, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "removeFromStack", "org.jsoup.nodes.Element", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:1>", "a b", "<null>", "<sample:7>"}, false, 2, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "currentElement", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<sample:1>", "1e10", "<sample:6>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  a\n </body>\n</html> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<null>", "fa b", "<null>", "<sample:7>"}, false, 2, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "error", "org.jsoup.parser.HtmlTreeBuilderState", "<sample:4>"}, {"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<sample:1>", "iframe", "<sample:6>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:1>", "fa b", "<null>", "<sample:7>"}, false, 1, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "isFosterInserts", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<sample:1>", "iframe", "<sample:5>", "<sample:6>"}}), new String[][]{{"childNode", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:1>", "fa b", "<null>", "<sample:7>"}, false, 1, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "isFosterInserts", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<null>", "iframe", "<sample:5>", "<sample:6>"}}), new String[][]{{"getAllElements", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<html>\n <head></head>\n <body>\n  a\n </body>\n</html>, <html>\n <head></head>\n <body>\n  a\n </body>\n</html>, <head></head>, <body>\n a\n</body>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:4>", "f`  a010202-02-30T25:61:61", "<null>", "<sample:2>"}, false, 9, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "setFosterInserts", "boolean", "true"}, {"org.jsoup.parser.HtmlTreeBuilder", "isFosterInserts", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "newPendingTableCharacters", ""}}), new String[][]{{"childNodeSize", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:3>", "f`  a010202-02-30T2m5:61:611.5f", "<null>", "<sample:2>"}, false, 9, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "isFosterInserts", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "newPendingTableCharacters", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "maybeSetBaseUri", "org.jsoup.nodes.Element", "<null>"}}), new String[][]{{"hasClass", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "setHeadElement", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "1.5d", "<sample:4>", "Title", "<sample:3>", "<sample:5>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:2>", "seemplate", "<null>", "<null>"}, false, 8, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "isFosterInserts", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "newPendingTableCharacters", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "maybeSetBaseUri", "org.jsoup.nodes.Element", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:2>", "seemplate", "<null>", "<sample:1>"}, false, 8, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "isFosterInserts", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "newPendingTableCharacters", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "maybeSetBaseUri", "org.jsoup.nodes.Element", "<null>"}}), new String[][]{{"getElementsContainingText", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "push", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "error", new String[]{"org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "setHeadElement", "org.jsoup.nodes.Element", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:1>", "ht]l", "<null>", "<sample:4>"}, false, 4, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "insert", "org.jsoup.nodes.Element", "<sample:5>"}}), new String[][]{{"appendText", "java.lang.String", "6"}, {"getElementsContainingOwnText", "java.lang.String", "6"}, {"retainAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:6>", "<sample:8>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inListItemScope", new String[]{"java.lang.String"}, new String[]{"select"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "removeFromActiveFormattingElements", "org.jsoup.nodes.Element", "<sample:4>"}, {"org.jsoup.parser.HtmlTreeBuilder", "insert", "org.jsoup.parser.Token$Comment", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$StartTag"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "processStartTag", "java.lang.String", "PT1H"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "state", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "insertInFosterParent", "org.jsoup.nodes.Node", "<sample:1>"}, {"org.jsoup.parser.HtmlTreeBuilder", "removeFromActiveFormattingElements", "org.jsoup.nodes.Element", "<sample:0>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilderState", "org.jsoup.parser.HtmlTreeBuilderState$1", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilder"}, new String[]{"<sample:5>", "<sample:4>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilderState", "process", "org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilder", "<null>", "<sample:0>"}, {"org.jsoup.parser.HtmlTreeBuilderState", "process", "org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilder", "<sample:4>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:6>", "112257T[", "<null>", "<sample:8>"}, false, 13, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "pushActiveFormattingElements", "org.jsoup.nodes.Element", "<sample:6>"}, {"org.jsoup.parser.HtmlTreeBuilder", "generateImpliedEndTags", ""}}), new String[][]{{"getElementsByAttributeValueNot", "java.lang.String,java.lang.String", "1"}, {"clone", "", "4"}, {"add", "int,java.lang.Object", "5"}, {"append", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:8>", "21258T[", "<null>", "<sample:5>"}, false, 14, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "lastFormattingElement", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "pushActiveFormattingElements", "org.jsoup.nodes.Element", "<sample:7>"}}), new String[][]{{"append", "java.lang.String", "4"}, {"hasSameValue", "java.lang.Object", "4"}, {"addClass", "java.lang.String", "5"}, {"appendElement", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a></a> {hasParent=true, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getDocument", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insertOnStackAfter", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:0>", "<sample:0>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "runParser", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:6>", "\\", "<null>", "<sample:1>"}, false, 5, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "getDocument", ""}}, 1), new String[][]{{"append", "java.lang.String", "2"}, {"hasSameValue", "java.lang.Object", "4"}, {"getElementsMatchingText", "java.util.regex.Pattern", "1"}, {"size", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:6>", "\u00e9", "<null>", "<sample:1>"}, false, 5, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "getDocument", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "isInActiveFormattingElements", "org.jsoup.nodes.Element", "<sample:2>"}, {"org.jsoup.parser.HtmlTreeBuilder", "getActiveFormattingElement", "java.lang.String", "style"}}, 3), new String[][]{{"append", "java.lang.String", "2"}, {"hasSameValue", "java.lang.Object", "4"}, {"getElementsMatchingText", "java.util.regex.Pattern", "1"}, {"size", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:9>", "\u00e9\u00ea", "<null>", "<sample:1>"}, false, 6, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "getDocument", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "isInActiveFormattingElements", "org.jsoup.nodes.Element", "<sample:1>"}, {"org.jsoup.parser.HtmlTreeBuilder", "getActiveFormattingElement", "java.lang.String", "0x123456789"}}, 3), new String[][]{{"append", "java.lang.String", "2"}, {"hasSameValue", "java.lang.Object", "4"}, {"getElementsMatchingText", "java.util.regex.Pattern", "1"}, {"size", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:6>", "\u00e9e\u00ea", "<null>", "<sample:1>"}, false, 6, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "isInActiveFormattingElements", "org.jsoup.nodes.Element", "<sample:1>"}}, 3), new String[][]{{"append", "java.lang.String", "2"}, {"hasSameValue", "java.lang.Object", "4"}, {"getElementsMatchingText", "java.util.regex.Pattern", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<html>\n <head></head>\n <body>\n  <a><b>t</b></a>\n </body>\n</html>0, <html>\n <head></head>\n <body>\n  <a><b>t</b></a>\n </body>\n</html>, <head></head>, <body>\n <a><b>t</b></a>\n</body>, <a><b>t</b></a>, <...#208#-331502309", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:6>", "\u00e9e\u00ea", "<null>", "<sample:1>"}, false, 6, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "getActiveFormattingElement", "java.lang.String", "{\"a\":1}1.12?34567890123456"}, {"org.jsoup.parser.HtmlTreeBuilder", "isInActiveFormattingElements", "org.jsoup.nodes.Element", "<sample:0>"}}, 3), new String[][]{{"append", "java.lang.String", "2"}, {"hasSameValue", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "isInActiveFormattingElements", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "insertMarkerToFormattingElements", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inScope", new String[]{"java.lang.String"}, new String[]{"1.5d"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getStack", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "setFosterInserts", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "lastFormattingElement", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getBaseUri", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "inScope", "java.lang.String[]", "<empty>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "removeFromActiveFormattingElements", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:1>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getDocument", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilderState", "org.jsoup.parser.HtmlTreeBuilderState$1", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilder"}, new String[]{"<sample:1>", "<sample:1>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilderState", "process", "org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilder", "<sample:1>", "<sample:4>"}, {"org.jsoup.parser.HtmlTreeBuilderState", "process", "org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilder", "<null>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "maybeSetBaseUri", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getStack", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:6>", "1/s4/2020-0l1-30TTh45:61:6120d20-00-01mul<labc0100xFFFFFF>Fhref-1.5", "<null>", "<sample:3>"}, false, 5, new String[][]{}, 1), new String[][]{{"append", "java.lang.String", "7"}, {"attr", "java.lang.String", "4"}, {"getElementsMatchingText", "java.lang.String", "4"}, {"empty", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[, <html></html>, <head></head>, <body></body>, <a></a>, <b></b>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilderState", "org.jsoup.parser.HtmlTreeBuilderState$1", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilder"}, new String[]{"<sample:0>", "<sample:7>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilderState", "process", "org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilder", "<sample:6>", "<sample:3>"}, {"org.jsoup.parser.HtmlTreeBuilderState", "process", "org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilder", "<sample:2>", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:6>", "0ik", "<null>", "<sample:5>"}, false, 15, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "processStartTag", "java.lang.String,org.jsoup.nodes.Attributes", "1L", "<sample:4>"}, {"org.jsoup.parser.HtmlTreeBuilder", "generateImpliedEndTags", ""}}, 1), new String[][]{{"append", "java.lang.String", "7"}, {"childNodes", "", "3"}, {"set", "int,java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:6>", "0ik", "<null>", "<sample:2>"}, false, 11, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "processStartTag", "java.lang.String,org.jsoup.nodes.Attributes", "1LHello, World", "<sample:4>"}, {"org.jsoup.parser.HtmlTreeBuilder", "generateImpliedEndTags", ""}}, 1), new String[][]{{"append", "java.lang.String", "7"}, {"childNodes", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[<html>\n <head></head>\n <body>\n  <a><b>t</b></a>\n </body>\n</html>, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inListItemScope", new String[]{"java.lang.String"}, new String[]{"I"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$Character"}, new String[]{"<sample:2>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "pushActiveFormattingElements", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "currentElement", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "isFosterInserts", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "clearStackToTableBodyContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "newPendingTableCharacters", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "insert", "org.jsoup.nodes.Element", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
}
