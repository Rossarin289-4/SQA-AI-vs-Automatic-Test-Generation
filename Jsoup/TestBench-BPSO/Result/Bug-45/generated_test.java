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
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "popStackToBefore", new String[]{"java.lang.String"}, new String[]{"12345678901234678901234567890"}, false, 3, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "removeLastFormattingElement", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "originalState", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilderState", "<sample:9>", "<sample:6>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "setPendingTableCharacters", new String[]{"java.util.List"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "newPendingTableCharacters", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "generateImpliedEndTags", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "getHeadElement", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "isFragmentParsing", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getBaseUri", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "getHeadElement", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "replaceActiveFormattingElement", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:7>", "<sample:0>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processEndTag", new String[]{"java.lang.String"}, new String[]{"1.35"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "state", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "removeFromActiveFormattingElements", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "isInActiveFormattingElements", "org.jsoup.nodes.Element", "<sample:7>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "clearStackToTableContext", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "-10", "{\"a\":1}1.5thtitle"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "+12020-02-30T25:61:61"}, false, 6, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "setFosterInserts", "boolean", "true"}, {"org.jsoup.parser.HtmlTreeBuilder", "insertInFosterParent", "org.jsoup.nodes.Node", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inScope", new String[]{"java.lang.String[]"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "!", "noscript"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "popStackToClose", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "a,bb,c", "p.1235678"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "clearStackToTableRowContext", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "tfo", "1.123456789/1234567"}, {"org.jsoup.parser.HtmlTreeBuilder", "getFromStack", "java.lang.String", "2020-02-30T24:61:610"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getPendingTableCharacters", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "thtr", "tr"}, {"org.jsoup.parser.HtmlTreeBuilder", "popStackToBefore", "java.lang.String", "thead"}}), new String[][]{{"ensureCapacity", "int", "1"}, {"remove", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inTableScope", new String[]{"java.lang.String"}, new String[]{"5."}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "2020-01-01", "d"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "clearFormattingElementsToLastMarker", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "1E-5", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, {"org.jsoup.parser.HtmlTreeBuilder", "inButtonScope", "java.lang.String", "noframees"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insertOnStackAfter", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<null>", "<sample:7>"}, false, 5, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "hefTitle", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "reconstructFormattingElements", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "!", "1.35"}, {"org.jsoup.parser.HtmlTreeBuilder", "inListItemScope", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getActiveFormattingElement", new String[]{"java.lang.String"}, new String[]{"-0"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "setPendingTableCharacters", "java.util.List", "<sample:6>"}, {"org.jsoup.parser.HtmlTreeBuilder", "insertMarkerToFormattingElements", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "popStackToClose", new String[]{"java.lang.String[]"}, new String[]{"<empty>"}, false, 4, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "select", "2020-02-30T24:61:61"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "pop", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "{\"a\":1}1.5--1", "e.5"}, {"org.jsoup.parser.HtmlTreeBuilder", "processStartTag", "java.lang.String,org.jsoup.nodes.Attributes", "s8tr", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<s8tr></s8tr> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<s8tr>, state=InBody, currentElement=<body>\n {\"a\":1}1.5--1\n <s8tr></s8tr>\n</body>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "generateImpliedEndTags", new String[]{"java.lang.String"}, new String[]{"5."}, false, 5, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList", "p.1235678", "textarea1.12345678", "<null>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "markInsertionMode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "maybeSetBaseUri", "org.jsoup.nodes.Element", "<sample:5>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "java.lang.String", "org.jsoup.parser.ParseErrorList"}, new String[]{"1.1234t567", "<null>", "hstyle", "<null>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "insert", "org.jsoup.parser.Token$Character", "<sample:0>"}}), new String[][]{{"indexOf", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inSelectScope", new String[]{"java.lang.String"}, new String[]{"TITLE1.1234567890123456"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "Hello, Worlc", "a-b,d"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "clearFormattingElementsToLastMarker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "insertMarkerToFormattingElements", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "clearFormattingElementsToLastMarker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "pushActiveFormattingElements", "org.jsoup.nodes.Element", "<sample:3>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getDocument", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "0\"1F12:30:45", "\u00e9"}, {"org.jsoup.parser.HtmlTreeBuilder", "aboveOnStack", "org.jsoup.nodes.Element", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  0\"1F12:30:45\n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "push", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "1.5e300", "12:30:45"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "removeFromStack", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:9>"}, false, 1, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "resetInsertionMode", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "styylle", "0x12346789"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "removeFromActiveFormattingElements", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "insertMarkerToFormattingElements", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<a>b</a>noembfd", "s"}, false), new String[][]{{"append", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  <a>b</a>noembfd\n </body>\n</html>a {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<b>b<b>", "1.12345678901234577thead"}, false), new String[][]{{"appendElement", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "pushActiveFormattingElements", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:10>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "insertMarkerToFormattingElements", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<a?b</>", "txmp"}, false), new String[][]{{"getAllElements", "", "6"}, {"prepend", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[sample\n<html>\n <head></head>\n <body>\n  sample\n </body>\n <head>\n  sample\n </head>\n <body>\n  sample\n  <a?b<>\n   sample\n  </a?b<>\n </body>\n</html>, <html>\n <head></head>\n <body>\n  sample\n </body>\n <head...#381#438828618", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "clearStackToTableBodyContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "initialiseParse", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList", "1.12345678901234567thead", "http:f//example.com/a?b=c", "<null>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=null, state=null, currentElement=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<a\r?a</>", "\titlf"}, false), new String[][]{{"getAllElements", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<html>\n <head></head>\n <body>\n  <a ?a<></a>\n </body>\n</html>, <html>\n <head></head>\n <body>\n  <a ?a<></a>\n </body>\n</html>, <head></head>, <body>\n <a ?a<></a>\n</body>, <a ?a<></a>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<a>bB</br>", ".10"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "inButtonScope", "java.lang.String", "<a?b</>1.12345678901234567"}, {"org.jsoup.parser.HtmlTreeBuilder", "popStackToClose", "java.lang.String", "tfoot"}}), new String[][]{{"html", "java.lang.String", "7"}, {"getElementsMatchingOwnText", "java.lang.String", "1"}, {"add", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "resetInsertionMode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "insert", "org.jsoup.parser.Token$Comment", "<sample:0>"}, {"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "<a>b</b>", "hrreftextarea"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<>b<//a0xFFFFFFFF", "b/b"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "<a>b<b>", "<>b<//a>"}}), new String[][]{{"hasAttr", "java.lang.String", "5"}, {"getElementsMatchingOwnText", "java.util.regex.Pattern", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<html>\n <head></head>\n <body>\n  <a><b>&lt;&gt;b\n    <!--/a0xFFFFFFFF--></b></a>\n </body>\n</html>, <html>\n <head></head>\n <body>\n  <a><b>&lt;&gt;b\n    <!--/a0xFFFFFFFF--></b></a>\n </body>\n</html>, <he...#361#653248625", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getFormElement", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "setFormElement", "org.jsoup.nodes.FormElement", "<sample:9>"}}), new String[][]{{"html", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.FormElement", actual.getClass().getName());
  assertEquals("<line1\n\nline3 comment=\"a\"></line1\n\nline3> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "pushActiveFormattingElements", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:5>"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$Character"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "insert", "org.jsoup.parser.Token$Character", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getBaseUri", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "getHeadElement", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:6>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"plaintext", "{\"a\":1}1.5"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "inScope", "java.lang.String", "a"}, {"org.jsoup.parser.HtmlTreeBuilder", "processStartTag", "java.lang.String", "thtr"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  plaintext\n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getStack", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "push", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "processStartTag", "java.lang.String,org.jsoup.nodes.Attributes", "1-12345678", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inScope", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"tbody", "<sample:4>"}, false, 1, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "insert", "org.jsoup.parser.Token$Comment", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "onStack", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "clearStackToTableRowContext", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "initialiseParse", "java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList", "\t2147493648", "title", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insertMarkerToFormattingElements", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "getActiveFormattingElement", "java.lang.String", "rue"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "isFragmentParsing", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "replaceActiveFormattingElement", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:0>", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getFromStack", new String[]{"java.lang.String"}, new String[]{"1.25"}, false, 1, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "currentElement", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insertInFosterParent", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "insert", "org.jsoup.nodes.Element", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getHeadElement", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "popStackToBefore", new String[]{"java.lang.String"}, new String[]{"1.5"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "inScope", "java.lang.String", "2020-01-01"}, {"org.jsoup.parser.HtmlTreeBuilder", "inSelectScope", "java.lang.String", "xmp"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "pop", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "maybeSetBaseUri", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "currentElement", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "replaceOnStack", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:1>", "<sample:3>"}, false, 6, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "setFosterInserts", "boolean", "true"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$Comment"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "setPendingTableCharacters", "java.util.List", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "replaceActiveFormattingElement", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:2>", "<sample:8>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "pop", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "lastFormattingElement", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inScope", new String[]{"java.lang.String[]"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "setFormElement", "org.jsoup.nodes.FormElement", "<sample:9>"}, {"org.jsoup.parser.HtmlTreeBuilder", "insertForm", "org.jsoup.parser.Token$StartTag,boolean", "<sample:5>", "true"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "maybeSetBaseUri", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:8>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getFormElement", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "popStackToClose", "java.lang.String", "1.12345671e10"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "isFosterInserts", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "popStackToClose", "java.lang.String[]", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "originalState", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "maybeSetBaseUri", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "insertStartTag", "java.lang.String", "\n"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"null1L", "Hello, Wosld0"}, false, 5, new String[][]{}, 3), new String[][]{{"childNodesCopy", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[<html>\n <head></head>\n <body>\n  null1L\n </body>\n</html>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insertEmpty", new String[]{"org.jsoup.parser.Token$StartTag"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "insert", "org.jsoup.parser.Token$Comment", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getActiveFormattingElement", new String[]{"java.lang.String"}, new String[]{"1.5e300"}, false, 2, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "push", "org.jsoup.nodes.Element", "<sample:9>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "maybeSetBaseUri", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:2>"}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "markInsertionMode", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "state", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"iframestyle", "tbodynoe"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "insert", "org.jsoup.parser.Token$Comment", "<sample:2>"}}, 1), new String[][]{{"charset", "", "2"}});
  assertNotNull(actual);
  assertEquals("sun.nio.cs.UTF_8", actual.getClass().getName());
  assertEquals("UTF-8 {canEncode=true, isRegistered=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "generateImpliedEndTags", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "resetInsertionMode", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "isFosterInserts", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getPendingTableCharacters", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "isSpecial", "org.jsoup.nodes.Element", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inButtonScope", new String[]{"java.lang.String"}, new String[]{"PPT1H"}, false, 6, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "processStartTag", "java.lang.String", "1.35"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getDocument", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inScope", new String[]{"java.lang.String"}, new String[]{"e5"}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$StartTag"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "insert", "org.jsoup.nodes.Element", "<sample:3>"}, {"org.jsoup.parser.HtmlTreeBuilder", "push", "org.jsoup.nodes.Element", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insertOnStackAfter", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<null>", "<sample:3>"}, false, 6, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "framesetOk", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insertStartTag", new String[]{"java.lang.String"}, new String[]{"1AE-5"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "clearStackToTableContext", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "state", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "lastFormattingElement", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token", "<sample:7>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insertMarkerToFormattingElements", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "clearStackToTableBodyContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "popStackToBefore", "java.lang.String", "href1.5e300"}, {"org.jsoup.parser.HtmlTreeBuilder", "popStackToClose", "java.lang.String[]", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "framesetOk", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "isInActiveFormattingElements", "org.jsoup.nodes.Element", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "pushActiveFormattingElements", "org.jsoup.nodes.Element", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insertEmpty", new String[]{"org.jsoup.parser.Token$StartTag"}, new String[]{"<sample:6>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "popStackToBefore", new String[]{"java.lang.String"}, new String[]{""}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inTableScope", new String[]{"java.lang.String"}, new String[]{"tr"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "transition", "org.jsoup.parser.HtmlTreeBuilderState", "<sample:2>"}, {"org.jsoup.parser.HtmlTreeBuilder", "getFormElement", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "setHeadElement", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "getStack", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insertStartTag", new String[]{"java.lang.String"}, new String[]{"/bb"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "clearFormattingElementsToLastMarker", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "onStack", "org.jsoup.nodes.Element", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "replaceOnStack", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:0>", "<sample:9>"}, false, 7, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "push", "org.jsoup.nodes.Element", "<sample:8>"}, {"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilderState", "<sample:11>", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "framesetOk", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "insertEmpty", "org.jsoup.parser.Token$StartTag", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insertOnStackAfter", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:4>", "<sample:6>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "inScope", "java.lang.String[]", "<sample:2>"}, {"org.jsoup.parser.HtmlTreeBuilder", "reconstructFormattingElements", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "resetInsertionMode", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "isInActiveFormattingElements", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "aboveOnStack", "org.jsoup.nodes.Element", "<sample:10>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$Comment"}, new String[]{"<sample:4>"}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insert", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "getStack", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "aboveOnStack", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "transition", "org.jsoup.parser.HtmlTreeBuilderState", "<sample:8>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getPendingTableCharacters", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "clearStackToTableBodyContext", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insertMarkerToFormattingElements", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "push", "org.jsoup.nodes.Element", "<sample:6>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$Character"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "inScope", "java.lang.String[]", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "transition", new String[]{"org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "setFormElement", "org.jsoup.nodes.FormElement", "<sample:4>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "transition", new String[]{"org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:1>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$Comment"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "replaceOnStack", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:0>", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "clearStackToTableContext", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "inScope", "java.lang.String[]", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "setHeadElement", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "clearStackToTableContext", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "clearStackToTableBodyContext", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "1.1235678", "1.35"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inListItemScope", new String[]{"java.lang.String"}, new String[]{"tb"}, false, 7, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "resetInsertionMode", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getFromStack", new String[]{"java.lang.String"}, new String[]{"12:20>:45"}, false, 7, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "getActiveFormattingElement", "java.lang.String", "asb"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "clearStackToTableBodyContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "reconstructFormattingElements", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "framesetOk", new String[]{"boolean"}, new String[]{"false"}, false, 4, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "isFosterInserts", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "generateImpliedEndTags", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "onStack", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "lastFormattingElement", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inButtonScope", new String[]{"java.lang.String"}, new String[]{"Hello, World"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "setPendingTableCharacters", "java.util.List", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "isFragmentParsing", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insertInFosterParent", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "markInsertionMode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "insertEmpty", "org.jsoup.parser.Token$StartTag", "<sample:5>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "clearStackToTableContext", new String[]{}, new String[]{}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getFromStack", new String[]{"java.lang.String"}, new String[]{"ifame"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "push", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:2>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "toString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$Comment"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "framesetOk", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "replaceOnStack", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:2>", "<sample:8>"}, false, 1, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "newPendingTableCharacters", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "setHeadElement", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:6>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String"}, new String[]{"1"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "popStackToClose", "java.lang.String[]", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "isInActiveFormattingElements", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:8>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$Character"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "popStackToClose", "java.lang.String", "\u00e9-1.5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$StartTag"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "isFosterInserts", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "reconstructFormattingElements", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inScope", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"textarea", "<sample:0>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "inScope", "java.lang.String[]", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "pop", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inListItemScope", new String[]{"java.lang.String"}, new String[]{"html"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "getPendingTableCharacters", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getStack", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getActiveFormattingElement", new String[]{"java.lang.String"}, new String[]{"sable"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "popStackToBefore", "java.lang.String", "1.123456712:30:45"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:3>", "<sample:7>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "getActiveFormattingElement", "java.lang.String", "1iframe"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"noframes", "000x1F"}, false, 6, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "isInActiveFormattingElements", "org.jsoup.nodes.Element", "<sample:6>"}}), new String[][]{{"after", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "onStack", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "getDocument", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inScope", new String[]{"java.lang.String[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "getStack", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "popStackToBefore", new String[]{"java.lang.String"}, new String[]{"i"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "clearStackToTableRowContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "isInActiveFormattingElements", "org.jsoup.nodes.Element", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String", "org.jsoup.nodes.Attributes"}, new String[]{"1e100xFFFFFFFF", "<sample:6>"}, false, 5, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "framesetOk", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "popStackToClose", new String[]{"java.lang.String[]"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "clearFormattingElementsToLastMarker", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insertOnStackAfter", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:1>", "<sample:3>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "replaceOnStack", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:4>", "<sample:9>"}, {"org.jsoup.parser.HtmlTreeBuilder", "lastFormattingElement", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "newPendingTableCharacters", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.ParseErrorList", "title", "<sample:8>", "Hello+ World", "<sample:1>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getActiveFormattingElement", new String[]{"java.lang.String"}, new String[]{"-00"}, false, 6, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "isSpecial", "org.jsoup.nodes.Element", "<sample:3>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "clearFormattingElementsToLastMarker", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "setPendingTableCharacters", "java.util.List", "<sample:4>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getDocument", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "lastFormattingElement", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "removeFromStack", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:0>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getFormElement", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "error", "org.jsoup.parser.HtmlTreeBuilderState", "<sample:3>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getPendingTableCharacters", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "inScope", "java.lang.String", "1.511.5e300"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insert", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "/x1F", "1E-5null+1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getPendingTableCharacters", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "getStack", ""}}), new String[][]{{"containsAll", "java.util.Collection", "7"}, {"containsAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"select", "+ofsames"}, false, 3, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "clearStackToTableBodyContext", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "push", "org.jsoup.nodes.Element", "<sample:7>"}}), new String[][]{{"getElementsContainingOwnText", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processEndTag", new String[]{"java.lang.String"}, new String[]{"[1,2]"}, false, 2, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "insert", "org.jsoup.nodes.Element", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String"}, new String[]{"[0,2]"}, false, 6, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "OT1H", "scBript"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<[0,2]>, state=InBody, currentElement=<[0,2]></[0,2]>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "lastFormattingElement", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "removeFromActiveFormattingElements", "org.jsoup.nodes.Element", "<sample:2>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "maybeSetBaseUri", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "resetInsertionMode", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insert", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:2>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2020-02-30T25:61:61title", "1L"}, false), new String[][]{{"createElement", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<sample></sample> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inTableScope", new String[]{"java.lang.String"}, new String[]{"1.25"}, false, 2, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "insert", "org.jsoup.parser.Token$Comment", "<sample:3>"}, {"org.jsoup.parser.HtmlTreeBuilder", "resetInsertionMode", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getHeadElement", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "generateImpliedEndTags", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "popStackToBefore", "java.lang.String", "PT1H"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"noscript", "II"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "insertOnStackAfter", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:0>", "<sample:2>"}, {"org.jsoup.parser.HtmlTreeBuilder", "setHeadElement", "org.jsoup.nodes.Element", "<sample:4>"}}), new String[][]{{"createElement", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<0></0> {hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$Comment"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "insert", "org.jsoup.parser.Token$Comment", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "state", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "isFosterInserts", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "isFosterInserts", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "generateImpliedEndTags", "java.lang.String", "{\"a\":1}1.5thtitle"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "framesetOk", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "aboveOnStack", "org.jsoup.nodes.Element", "<sample:1>"}, {"org.jsoup.parser.HtmlTreeBuilder", "insert", "org.jsoup.parser.Token$StartTag", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inScope", new String[]{"java.lang.String"}, new String[]{"iframe-1.5"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "state", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insertEmpty", new String[]{"org.jsoup.parser.Token$StartTag"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "removeFromActiveFormattingElements", "org.jsoup.nodes.Element", "<sample:10>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "maybeSetBaseUri", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "isFosterInserts", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "setHeadElement", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "2020-01-01", "7"}, {"org.jsoup.parser.HtmlTreeBuilder", "resetInsertionMode", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "resetInsertionMode", new String[]{}, new String[]{}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "pushActiveFormattingElements", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "maybeSetBaseUri", "org.jsoup.nodes.Element", "<sample:4>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "setFormElement", new String[]{"org.jsoup.nodes.FormElement"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "processEndTag", "java.lang.String", "1.5300"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "clearStackToTableBodyContext", new String[]{}, new String[]{}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"a,bb,c", "hqef"}, false, 7, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "clearStackToTableContext", ""}}), new String[][]{{"getElementById", "java.lang.String", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "isInActiveFormattingElements", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "insert", "org.jsoup.nodes.Element", "<sample:2>"}, {"org.jsoup.parser.HtmlTreeBuilder", "insertMarkerToFormattingElements", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "replaceActiveFormattingElement", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:8>", "<sample:5>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "runParser", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getPendingTableCharacters", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"listIterator", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.ParseErrorList", "noscript", "<sample:3>", "a,b,cselct", "<sample:5>"}, {"org.jsoup.parser.HtmlTreeBuilder", "push", "org.jsoup.nodes.Element", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "setFosterInserts", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilderState", "<sample:6>", "<sample:2>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "runParser", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "replaceActiveFormattingElement", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<null>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inSelectScope", new String[]{"java.lang.String"}, new String[]{"pru"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "transition", new String[]{"org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:3>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "popStackToClose", new String[]{"java.lang.String"}, new String[]{"iframe"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "framesetOk", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "110", "1p12345678"}, {"org.jsoup.parser.HtmlTreeBuilder", "onStack", "org.jsoup.nodes.Element", "<sample:5>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insertMarkerToFormattingElements", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "clearStackToTableContext", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "push", "org.jsoup.nodes.Element", "<sample:7>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inScope", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"--1010", "<sample:1>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "1.1234567table", "table"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:5>", "<sample:4>"}, false, 7, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "setHeadElement", "org.jsoup.nodes.Element", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "resetInsertionMode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "<>b</a>", "0xFFFFFFFF"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inScope", new String[]{"java.lang.String"}, new String[]{"+1"}, false, 7, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "i", "d1.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "123456789012345578901234567890", "thead"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<body>\n 123456789012345578901234567890\n</body> {hasText=true, isBlock=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "initialiseParse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList"}, new String[]{"titleTITLE", "1.1234567tablehrf", "<null>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "processStartTag", "java.lang.String", "-11"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<-11>, state=null, currentElement=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "error", new String[]{"org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:4>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "generateImpliedEndTags", new String[]{"java.lang.String"}, new String[]{"Hello, World"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "state", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getBaseUri", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "123", "{\"a\":1}"}, {"org.jsoup.parser.HtmlTreeBuilder", "generateImpliedEndTags", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":1}", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-1-1.5", "+1"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "setFormElement", "org.jsoup.nodes.FormElement", "<sample:4>"}}), new String[][]{{"baseUri", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("+1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getBaseUri", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "-10-1", "5."}, {"org.jsoup.parser.HtmlTreeBuilder", "processEndTag", "java.lang.String", "1p1234578"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5.", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=</1p1234578>, state=InBody, currentElement=<body>\n -10-1\n</body>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "isInActiveFormattingElements", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "insertMarkerToFormattingElements", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insertOnStackAfter", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<null>", "<sample:2>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "transition", "org.jsoup.parser.HtmlTreeBuilderState", "<sample:1>"}, {"org.jsoup.parser.HtmlTreeBuilder", "processEndTag", "java.lang.String", "plaintext1.1234567"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$StartTag"}, new String[]{"<sample:2>"}, false, 5, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getPendingTableCharacters", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "setFosterInserts", "boolean", "false"}}), new String[][]{{"addAll", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "aboveOnStack", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:1>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "initialiseParse", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.ParseErrorList"}, new String[]{"1.5d-1.5", "noemb8d", "<null>"}, false, 6, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "insert", "org.jsoup.nodes.Element", "<sample:8>"}, {"org.jsoup.parser.HtmlTreeBuilder", "state", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=null, state=null, currentElement=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "removeFromStack", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "onStack", "org.jsoup.nodes.Element", "<sample:5>"}, {"org.jsoup.parser.HtmlTreeBuilder", "currentElement", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inSelectScope", new String[]{"java.lang.String"}, new String[]{"{\"a\"91}"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "clearFormattingElementsToLastMarker", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "originalState", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "removeLastFormattingElement", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "clearStackToTableRowContext", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"tr1.1234567", "1e10"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "generateImpliedEndTags", "java.lang.String", "a=b"}}), new String[][]{{"baseUri", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1e10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1", "uc"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "isInActiveFormattingElements", "org.jsoup.nodes.Element", "<sample:0>"}}, 2), new String[][]{{"classNames", "java.util.Set", "0"}, {"getElementsByAttributeValueNot", "java.lang.String,java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insertForm", new String[]{"org.jsoup.parser.Token$StartTag", "boolean"}, new String[]{"<sample:7>", "true"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilderState", "<sample:5>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "isSpecial", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:6>"}, false, 7, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "popStackToBefore", "java.lang.String", "Titl\r1.5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "generateImpliedEndTags", new String[]{"java.lang.String"}, new String[]{"-0.00"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilderState", "<sample:9>", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insert", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "inScope", "java.lang.String", "a btitle"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "resetInsertionMode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "setHeadElement", "org.jsoup.nodes.Element", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inScope", new String[]{"java.lang.String"}, new String[]{"010"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getActiveFormattingElement", new String[]{"java.lang.String"}, new String[]{"1.5d123456789012345678901234567890"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "maybeSetBaseUri", "org.jsoup.nodes.Element", "<sample:7>"}, {"org.jsoup.parser.HtmlTreeBuilder", "getHeadElement", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.5fHello, World", "a b"}, false, 5, new String[][]{}), new String[][]{{"charset", "java.nio.charset.Charset", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head>\n  <meta charset=\"UTF-8\">\n </head>\n <body>\n  1.5fHello, World\n </body>\n</html> {hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaPT1H", "ubodyI"}, false, 0, null, 3), new String[][]{{"absUrl", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insertStartTag", new String[]{"java.lang.String"}, new String[]{"i1.12345678"}, false, 7, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "newPendingTableCharacters", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insert", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<null>"}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "runParser", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getDocument", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "processStartTag", "java.lang.String", "\u00e912:30:45"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getStack", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "setFormElement", new String[]{"org.jsoup.nodes.FormElement"}, new String[]{"<sample:5>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getDocument", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "pop", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "framesetOk", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "1.1234568901234567", "1.1235678"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.5f", "110-1"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "popStackToBefore", "java.lang.String", "paintextnoframes"}}, 3), new String[][]{{"appendText", "java.lang.String", "4"}, {"getElementsByAttributeValueEnding", "java.lang.String,java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inSelectScope", new String[]{"java.lang.String"}, new String[]{"Hello, World"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getBaseUri", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "clearStackToTableContext", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "setFosterInserts", new String[]{"boolean"}, new String[]{"false"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inTableScope", new String[]{"java.lang.String"}, new String[]{"a b"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String", "org.jsoup.nodes.Attributes"}, new String[]{"{\"a\":22}", "<sample:0>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "lastFormattingElement", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insertEmpty", new String[]{"org.jsoup.parser.Token$StartTag"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "X5", "-00"}, {"org.jsoup.parser.HtmlTreeBuilder", "reconstructFormattingElements", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "setHeadElement", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "getActiveFormattingElement", "java.lang.String", "td"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "state", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "ableiframe", "-1"}, {"org.jsoup.parser.HtmlTreeBuilder", "getPendingTableCharacters", ""}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getFormElement", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "processStartTag", "java.lang.String", "1"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "replaceOnStack", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:1>", "<sample:5>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "processStartTag", "java.lang.String", "td1Hello, World"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "replaceOnStack", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<null>", "<sample:1>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "nofamfs", "titde"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "resetInsertionMode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "resetInsertionMode", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "replaceActiveFormattingElement", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:8>", "<sample:8>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "state", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "isSpecial", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "insertMarkerToFormattingElements", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inButtonScope", new String[]{"java.lang.String"}, new String[]{"Ia"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "getFormElement", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "push", "org.jsoup.nodes.Element", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "java.lang.String", "org.jsoup.parser.ParseErrorList"}, new String[]{"*1", "<sample:0>", "1.1235679t", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "state", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "inButtonScope", "java.lang.String", "1L"}, {"org.jsoup.parser.HtmlTreeBuilder", "push", "org.jsoup.nodes.Element", "<sample:5>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String", "org.jsoup.nodes.Attributes"}, new String[]{"xmp", "<sample:0>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "inScope", "java.lang.String[]", "<sample:3>"}, {"org.jsoup.parser.HtmlTreeBuilder", "popStackToClose", "java.lang.String[]", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getFromStack", new String[]{"java.lang.String"}, new String[]{"010"}, false, 3, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "TITLEl", "script"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getFromStack", new String[]{"java.lang.String"}, new String[]{"0xx1F"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inButtonScope", new String[]{"java.lang.String"}, new String[]{"plaintext"}, false, 6, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "insert", "org.jsoup.parser.Token$Comment", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "runParser", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "TIULE", "true010"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "error", new String[]{"org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "setHeadElement", "org.jsoup.nodes.Element", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-.5", "noscript"}, false, 0, null, 2), new String[][]{{"getElementsByClass", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "setPendingTableCharacters", new String[]{"java.util.List"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "currentElement", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getBaseUri", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "getDocument", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$StartTag"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "maybeSetBaseUri", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:3>"}, false, 3, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "clearFormattingElementsToLastMarker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "generateImpliedEndTags", "java.lang.String", "abc1.5fiframe"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "clearStackToTableContext", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "markInsertionMode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "popStackToClose", "java.lang.String[]", "<sample:5>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "isSpecial", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "insertForm", "org.jsoup.parser.Token$StartTag,boolean", "<sample:5>", "true"}, {"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilderState", "<sample:0>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getBaseUri", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "tc", "{\"a\":1}1.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":1}1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:8>", "<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "replaceActiveFormattingElement", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:5>", "<sample:3>"}, false, 6, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "framesetOk", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilderState", "<sample:6>", "<null>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inListItemScope", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "framesetOk", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "isInActiveFormattingElements", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "insertOnStackAfter", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:9>", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "error", new String[]{"org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:5>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inScope", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"--1", "<sample:2>"}, false, 6, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "a,bb,c", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "setPendingTableCharacters", new String[]{"java.util.List"}, new String[]{"<empty>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "onStack", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:3>"}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "{\"a\"1}", "thtr"}}), new String[][]{{"className", "", "1"}, {"before", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<body>\n {\"a\"1}\n</body> {hasText=true, isBlock=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "transition", new String[]{"org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "<>b<//a>", "12345678901234678901234567890"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "clearStackToTableBodyContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "1.12345671e10", " "}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "reconstructFormattingElements", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "removeLastFormattingElement", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "generateImpliedEndTags", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getHeadElement", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "pushActiveFormattingElements", "org.jsoup.nodes.Element", "<sample:6>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "clearFormattingElementsToLastMarker", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "processStartTag", "java.lang.String", "1"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "push", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "framesetOk", "boolean", "true"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inScope", new String[]{"java.lang.String[]"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "getStack", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "acc", "+1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<body>\n acc\n</body> {hasText=true, isBlock=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "reconstructFormattingElements", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "/", "thbhead"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getPendingTableCharacters", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "clearStackToTableContext", ""}}), new String[][]{{"indexOf", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insertForm", new String[]{"org.jsoup.parser.Token$StartTag", "boolean"}, new String[]{"<sample:7>", "false"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inScope", new String[]{"java.lang.String[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "tcody1.5f", "oscript"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "getActiveFormattingElement", "java.lang.String", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "getActiveFormattingElement", "java.lang.String", "<>b</a>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "isFosterInserts", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "inListItemScope", "java.lang.String", "a,bb,cscript"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insertInFosterParent", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:2>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "generateImpliedEndTags", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "getActiveFormattingElement", "java.lang.String", "iframe"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "lastFormattingElement", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "currentElement", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "insertEmpty", "org.jsoup.parser.Token$StartTag", "<sample:4>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "clearStackToTableContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "<a>b<//a>", ""}});
  assertNull(actual);
 }
}
