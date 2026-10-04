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
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:5>", "<sample:0>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "getPendingTableCharacters", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "framesetOk", "boolean", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "reconstructFormattingElements", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "removeFromStack", "org.jsoup.nodes.Element", "<sample:0>"}, {"org.jsoup.parser.HtmlTreeBuilder", "getDocument", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getStack", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "newPendingTableCharacters", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "generateImpliedEndTags", "java.lang.String", "/a/b"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "isFragmentParsing", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "state", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "state", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "isSpecial", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "setPendingTableCharacters", "java.util.List", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "setFormElement", new String[]{"org.jsoup.nodes.FormElement"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "processEndTag", "java.lang.String", "1.5f"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "framesetOk", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "getStack", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "1.251L", "<sample:5>", ",0.", "<null>", "<sample:7>"}, {"org.jsoup.parser.HtmlTreeBuilder", "insertOnStackAfter", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:1>", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "framesetOk", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "1.241L", "<sample:5>", ",00.", "<null>", "<sample:6>"}, {"org.jsoup.parser.HtmlTreeBuilder", "inTableScope", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, {"org.jsoup.parser.HtmlTreeBuilder", "defaultSettings", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "setFosterInserts", new String[]{"boolean"}, new String[]{"true"}, false, 1, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "getHeadElement", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inButtonScope", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:6]:61"}, false, 13, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<sample:3>", "*mp", "<null>", "<sample:7>"}, {"org.jsoup.parser.HtmlTreeBuilder", "isInActiveFormattingElements", "org.jsoup.nodes.Element", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inButtonScope", new String[]{"java.lang.String"}, new String[]{"html"}, false, 15, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<sample:7>", "**mptd", "<null>", "<sample:15>"}, {"org.jsoup.parser.HtmlTreeBuilder", "popStackToBefore", "java.lang.String", ",070."}, {"org.jsoup.parser.HtmlTreeBuilder", "insert", "org.jsoup.parser.Token$Comment", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inButtonScope", new String[]{"java.lang.String"}, new String[]{"template"}, false, 4, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<sample:7>", "", "<null>", "<sample:3>"}, {"org.jsoup.parser.HtmlTreeBuilder", "popStackToClose", "java.lang.String[]", "<sample:2>"}, {"org.jsoup.parser.HtmlTreeBuilder", "popStackToBefore", "java.lang.String", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:9>", "<sample:6>"}, false, 15, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "reconstructFormattingElements", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "getFormElement", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "inSelectScope", "java.lang.String", "-,-1e10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"-0.0rcript", "<null>", "-/ /bstyld", "<null>", "<sample:11>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "t", "<sample:2>", "20x1", "<null>", "<sample:0>"}, {"org.jsoup.parser.HtmlTreeBuilder", "onStack", "org.jsoup.nodes.Element", "<sample:5>"}}, 2), new String[][]{{"add", "int,java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:6>", "hrnm", "<null>", "<sample:10>"}, false, 1, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "maybeSetBaseUri", "org.jsoup.nodes.Element", "<sample:1>"}, {"org.jsoup.parser.HtmlTreeBuilder", "initialiseParse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<sample:7>", "thead", "<null>", "<sample:3>"}, {"org.jsoup.parser.HtmlTreeBuilder", "clearStackToTableContext", ""}}, 3), new String[][]{{"getElementsByIndexLessThan", "int", "4"}, {"traverse", "org.jsoup.select.NodeVisitor", "4"}, {"prepend", "java.lang.String", "3"}, {"listIterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "markInsertionMode", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<sample:6>", "semec<t", "<null>", "<sample:8>"}, {"org.jsoup.parser.HtmlTreeBuilder", "insert", "org.jsoup.parser.Token$StartTag", "<sample:2>"}, {"org.jsoup.parser.HtmlTreeBuilder", "inSelectScope", "java.lang.String", "title"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getBaseUri", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "initialiseParse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<sample:0>", "1.1234567890123456", "<null>", "<sample:12>"}, {"org.jsoup.parser.HtmlTreeBuilder", "clearFormattingElementsToLastMarker", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.1234567890123456", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=null, state=Initial, currentElement=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insertEmpty", new String[]{"org.jsoup.parser.Token$StartTag"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "H", "<null>", "AnT;n", "<null>", "<sample:4>"}, {"org.jsoup.parser.HtmlTreeBuilder", "clearStackToTableBodyContext", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "insertInFosterParent", "org.jsoup.nodes.Node", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "aboveOnStack", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "initialiseParse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<sample:9>", "null", "<null>", "<sample:2>"}, {"org.jsoup.parser.HtmlTreeBuilder", "markInsertionMode", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "processStartTag", "java.lang.String,org.jsoup.nodes.Attributes", "plaintext", "<sample:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<plaintext>, state=InBody, currentElement=<plaintext></plaintext>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "removeFromStack", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:2>"}, false, 8, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "generateImpliedEndTags", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", ",1.0x-FFFFFFF", "<sample:8>", "\n/ttp://example.com/a?b=c", "<null>", "<sample:12>"}, {"org.jsoup.parser.HtmlTreeBuilder", "removeLastFormattingElement", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "removeFromStack", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:10>"}, false, 8, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "Titll", "<sample:9>", "td", "<null>", "<sample:12>"}, {"org.jsoup.parser.HtmlTreeBuilder", "generateImpliedEndTags", "java.lang.String", "010"}, {"org.jsoup.parser.HtmlTreeBuilder", "replaceActiveFormattingElement", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:4>", "<sample:8>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "removeFromActiveFormattingElements", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "originalState", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<sample:2>", "I", "<null>", "<sample:0>"}, {"org.jsoup.parser.HtmlTreeBuilder", "inListItemScope", "java.lang.String", "tdxsarea"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "removeFromActiveFormattingElements", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<sample:1>", "I", "<null>", "<sample:0>"}, {"org.jsoup.parser.HtmlTreeBuilder", "push", "org.jsoup.nodes.Element", "<sample:6>"}, {"org.jsoup.parser.HtmlTreeBuilder", "inListItemScope", "java.lang.String", "tdxsarea"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "removeFromActiveFormattingElements", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:1>"}, false, 10, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<sample:6>", "KdHello,, World", "<null>", "<sample:7>"}, {"org.jsoup.parser.HtmlTreeBuilder", "clearStackToTableContext", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "popStackToClose", "java.lang.String", "xmp"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:2>", "<sample:7>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:6>", "<sample:7>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:6>", "<sample:7>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "framesetOk", "boolean", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:5>", "<sample:0>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "framesetOk", "boolean", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "popStackToClose", new String[]{"java.lang.String"}, new String[]{"abc"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "transition", new String[]{"org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:10>"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insertInFosterParent", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilderState", "<sample:2>", "<sample:4>"}, {"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "0x1F", "<sample:2>", "<null>", "<sample:5>", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "popStackToBefore", new String[]{"java.lang.String"}, new String[]{"i"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "maybeSetBaseUri", "org.jsoup.nodes.Element", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "pop", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "runParser", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "insert", "org.jsoup.parser.Token$Character", "<sample:7>"}, {"org.jsoup.parser.HtmlTreeBuilder", "popStackToBefore", "java.lang.String", "/a/bHello, Word"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "generateImpliedEndTags", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "clearStackToTableBodyContext", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:1>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "isSpecial", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:7>"}, false, 15, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "inScope", "java.lang.String[]", "<null>"}, {"org.jsoup.parser.HtmlTreeBuilder", "transition", "org.jsoup.parser.HtmlTreeBuilderState", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$Character"}, new String[]{"<sample:6>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "framesetOk", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "insertInFosterParent", "org.jsoup.nodes.Node", "<sample:4>"}, {"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "1.25", "<sample:3>", ",0.", "<null>", "<sample:4>"}, {"org.jsoup.parser.HtmlTreeBuilder", "getFormElement", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "framesetOk", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "1.251L", "<sample:5>", ",00.", "<null>", "<sample:6>"}, {"org.jsoup.parser.HtmlTreeBuilder", "defaultSettings", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "framesetOk", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "1.241L", "<sample:8>", ",070.", "<null>", "<sample:6>"}, {"org.jsoup.parser.HtmlTreeBuilder", "inTableScope", "java.lang.String", "b"}, {"org.jsoup.parser.HtmlTreeBuilder", "removeLastFormattingElement", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "framesetOk", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "1.241L", "<sample:8>", ",0700.", "<null>", "<sample:6>"}, {"org.jsoup.parser.HtmlTreeBuilder", "removeLastFormattingElement", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "framesetOk", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "setFosterInserts", "boolean", "true"}, {"org.jsoup.parser.HtmlTreeBuilder", "insertMarkerToFormattingElements", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "1.2\n1L", "<sample:8>", ",0700.", "<null>", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inScope", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{",00.", "<sample:2>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaabaaaatitle", "<sample:4>", "10=0", "<null>", "<sample:3>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "isFragmentParsing", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[\naaaaaaaaaaaaaaaaaaaaaaaaabaaaatitle]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"aaaaaaaaaaabaaaaaaaaaaaaabaaaatitle", "<sample:4>", "10=0", "<null>", "<sample:3>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "isFragmentParsing", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[\naaaaaaaaaaabaaaaaaaaaaaaabaaaatitle]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{",071.", "<sample:4>", ",1.", "<null>", "<sample:3>"}, false, 6, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "aboveOnStack", "org.jsoup.nodes.Element", "<sample:0>"}, {"org.jsoup.parser.HtmlTreeBuilder", "getHeadElement", ""}}, 1), new String[][]{{"subList", "int,int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"\n", "<sample:3>", "table010", "<null>", "<sample:5>"}, false, 7, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "getActiveFormattingElement", "java.lang.String", "-1.51.5d"}, {"org.jsoup.parser.HtmlTreeBuilder", "insertEmpty", "org.jsoup.parser.Token$StartTag", "<sample:3>"}, {"org.jsoup.parser.HtmlTreeBuilder", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[ ]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"\n", "<sample:3>", "table0110_", "<null>", "<sample:4>"}, false, 7, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "getActiveFormattingElement", "java.lang.String", "-1.51.5d"}, {"org.jsoup.parser.HtmlTreeBuilder", "insertEmpty", "org.jsoup.parser.Token$StartTag", "<sample:3>"}, {"org.jsoup.parser.HtmlTreeBuilder", "toString", ""}}, 1), new String[][]{{"listIterator", "", "5"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"i", "<sample:4>", "[1,2]", "<null>", "<sample:3>"}, false, 7, new String[][]{}, 1), new String[][]{{"listIterator", "", "5"}, {"nextIndex", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "<sample:6>", "http://example.com/a?b=c", "<null>", "<sample:2>"}, false, 7, new String[][]{}, 2), new String[][]{{"listIterator", "", "5"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "<sample:6>", "http://dxample.com/a?b=c", "<null>", "<sample:4>"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaa]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"2020-01-01", "<sample:6>", "http://dxample.com/a?b=cnoembed", "<null>", "<sample:4>"}, false, 7, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "popStackToBefore", "java.lang.String", "xmp"}, {"org.jsoup.parser.HtmlTreeBuilder", "replaceOnStack", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<null>", "<sample:7>"}, {"org.jsoup.parser.HtmlTreeBuilder", "insertOnStackAfter", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:4>", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[\n2020-01-01]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"2020-01-01", "<sample:6>", "http://dxample.com/a?b=cnoembed", "<null>", "<sample:4>"}, false, 7, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "popStackToBefore", "java.lang.String", "xmp"}, {"org.jsoup.parser.HtmlTreeBuilder", "replaceOnStack", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<null>", "<sample:7>"}}, 2), new String[][]{{"addAll", "int,java.util.Collection", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"2020-01-01", "<sample:1>", "http:/.example.com/a?b=cnoembed", "<null>", "<sample:4>"}, false, 4, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "popStackToBefore", "java.lang.String", "xmp"}, {"org.jsoup.parser.HtmlTreeBuilder", "generateImpliedEndTags", ""}}, 2), new String[][]{{"lastIndexOf", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insertInFosterParent", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:6>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"2020-01-011.12345671", "<sample:0>", "http:/.example.com/a?b=cnoembed", "<null>", "<sample:3>"}, false, 11, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "getHeadElement", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "popStackToBefore", "java.lang.String", "1.234567990123456"}, {"org.jsoup.parser.HtmlTreeBuilder", "generateImpliedEndTags", ""}}, 2), new String[][]{{"lastIndexOf", "java.lang.Object", "1"}, {"lastIndexOf", "java.lang.Object", "0"}, {"contains", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"212/2/1", "<sample:2>", "g", "<null>", "<sample:4>"}, false, 6, new String[][]{}, 1), new String[][]{{"lastIndexOf", "java.lang.Object", "1"}, {"lastIndexOf", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"1..5", "<sample:2>", "1h.25", "<null>", "<sample:4>"}, false, 3, new String[][]{}, 1), new String[][]{{"lastIndexOf", "java.lang.Object", "3"}, {"set", "int,java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"select", "<sample:11>", "1h.2", "<null>", "<sample:2>"}, false, 2, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "insert", "org.jsoup.parser.Token$StartTag", "<sample:5>"}, {"org.jsoup.parser.HtmlTreeBuilder", "newPendingTableCharacters", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "newPendingTableCharacters", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "insert", "org.jsoup.parser.Token$StartTag", "<sample:5>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "runParser", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "popStackToBefore", "java.lang.String", "1.5d"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getStack", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"ptlaite5yt1.5cxmp", "<sample:7>", "ifrbme", "<null>", "<sample:2>"}, false, 18, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "getFromStack", "java.lang.String", "{\"a!:1}12:30:45"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[\nptlaite5yt1.5cxmp]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "framesetOk", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "push", "org.jsoup.nodes.Element", "<sample:5>"}, {"org.jsoup.parser.HtmlTreeBuilder", "inTableScope", "java.lang.String", "1e10"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"1\u00e9\u00e9.151L", "<sample:5>", "ttyle", "<null>", "<sample:4>"}, false, 7, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "clearStackToTableBodyContext", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "removeLastFormattingElement", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "generateImpliedEndTags", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[\n1\u00e9\u00e9.151L]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "popStackToClose", new String[]{"java.lang.String[]"}, new String[]{"<sample:2>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"1\u00e9t\u00e9.151L:", "<sample:5>", "ttyletrue", "<null>", "<sample:4>"}, false, 1, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "insert", "org.jsoup.parser.Token$StartTag", "<sample:5>"}, {"org.jsoup.parser.HtmlTreeBuilder", "generateImpliedEndTags", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[\n1\u00e9t\u00e9.151L:]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getPendingTableCharacters", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "replaceActiveFormattingElement", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:2>", "<null>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inScope", new String[]{"java.lang.String"}, new String[]{"1L"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"--,:111.12345675.", "<sample:4>", "806", "<null>", "<sample:7>"}, false, 15, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "pushActiveFormattingElements", "org.jsoup.nodes.Element", "<sample:7>"}, {"org.jsoup.parser.HtmlTreeBuilder", "toString", ""}}, 3), new String[][]{{"listIterator", "", "6"}, {"set", "java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "newPendingTableCharacters", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{".5-0-0", "<sample:1>", "_,tml5.", "<null>", "<sample:5>"}, false, 7, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "inScope", "java.lang.String", "nof"}, {"org.jsoup.parser.HtmlTreeBuilder", "clearStackToTableContext", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[\n.5-0-0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"tfxtarea", "<sample:0>", "_>,vml5.", "<null>", "<sample:0>"}, false, 1, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "setFormElement", "org.jsoup.nodes.FormElement", "<sample:2>"}, {"org.jsoup.parser.HtmlTreeBuilder", "framesetOk", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[\ntfxtarea]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insertEmpty", new String[]{"org.jsoup.parser.Token$StartTag"}, new String[]{"<sample:2>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "originalState", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"tii", "<sample:5>", "Titdmull", "<null>", "<sample:8>"}, false, 14, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "getFormElement", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token", "<sample:4>"}, {"org.jsoup.parser.HtmlTreeBuilder", "aboveOnStack", "org.jsoup.nodes.Element", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[\ntii]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"tii-1.5", "<sample:5>", "Titdmull", "<null>", "<sample:8>"}, false, 15, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "getFormElement", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "aboveOnStack", "org.jsoup.nodes.Element", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[\ntii-1.5]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"tji", "<sample:5>", "Titdmull", "<null>", "<sample:8>"}, false, 15, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "getFormElement", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "aboveOnStack", "org.jsoup.nodes.Element", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[\ntji]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insertOnStackAfter", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<null>", "<sample:1>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "error", new String[]{"org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:5>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "setFosterInserts", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "removeFromStack", "org.jsoup.nodes.Element", "<sample:2>"}, {"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", ",0700.", "<sample:5>", "0x0F", "<sample:3>", "<null>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processEndTag", new String[]{"java.lang.String"}, new String[]{"1.e200a/cstyle"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "isInActiveFormattingElements", "org.jsoup.nodes.Element", "<sample:4>"}, {"org.jsoup.parser.HtmlTreeBuilder", "transition", "org.jsoup.parser.HtmlTreeBuilderState", "<sample:2>"}, {"org.jsoup.parser.HtmlTreeBuilder", "generateImpliedEndTags", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "onStack", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "setFormElement", "org.jsoup.nodes.FormElement", "<sample:5>"}, {"org.jsoup.parser.HtmlTreeBuilder", "markInsertionMode", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "replaceOnStack", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:3>", "<sample:8>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$Character"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "setHeadElement", "org.jsoup.nodes.Element", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String"}, new String[]{"\"\".82\n1K"}, false, 1, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "isFosterInserts", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "generateImpliedEndTags", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "state", new String[]{}, new String[]{}, false, 10, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "markInsertionMode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "inSelectScope", "java.lang.String", "0xFFFFFFFFtr"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "pop", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "isSpecial", "org.jsoup.nodes.Element", "<sample:0>"}, {"org.jsoup.parser.HtmlTreeBuilder", "generateImpliedEndTags", "java.lang.String", "12:30:45"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getHeadElement", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "setPendingTableCharacters", "java.util.List", "<sample:3>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getHeadElement", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "initialiseParse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<sample:3>", "1E-5", "<null>", "<sample:6>"}, {"org.jsoup.parser.HtmlTreeBuilder", "setPendingTableCharacters", "java.util.List", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=null, state=Initial, currentElement=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getHeadElement", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "initialiseParse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<sample:3>", "1E-5", "<null>", "<sample:6>"}, {"org.jsoup.parser.HtmlTreeBuilder", "replaceOnStack", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:5>", "<sample:6>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=null, state=Initial, currentElement=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inButtonScope", new String[]{"java.lang.String"}, new String[]{"1251L"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "generateImpliedEndTags", new String[]{"java.lang.String"}, new String[]{"C1"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inSelectScope", new String[]{"java.lang.String"}, new String[]{"0LP"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:2>", "<sample:5>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:5>", "<sample:7>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inScope", new String[]{"java.lang.String[]"}, new String[]{"<sample:1>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "resetInsertionMode", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "reconstructFormattingElements", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "removeFromStack", "org.jsoup.nodes.Element", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "transition", new String[]{"org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:7>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insertStartTag", new String[]{"java.lang.String"}, new String[]{"xmp"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "removeLastFormattingElement", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "removeLastFormattingElement", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "inScope", "java.lang.String,java.lang.String[]", "iframe", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insertInFosterParent", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insertOnStackAfter", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:4>", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "lastFormattingElement", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "removeFromStack", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getStack", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "newPendingTableCharacters", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "generateImpliedEndTags", "java.lang.String", ",/a/bstyle"}, {"org.jsoup.parser.HtmlTreeBuilder", "originalState", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "pop", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "popStackToBefore", "java.lang.String", "/a/b"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "generateImpliedEndTags", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "clearStackToTableBodyContext", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insert", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getHeadElement", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "pushActiveFormattingElements", "org.jsoup.nodes.Element", "<sample:1>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$Character"}, new String[]{"<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insertMarkerToFormattingElements", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "framesetOk", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "+1", "<sample:2>", "-1.5", "<null>", "<sample:5>"}, {"org.jsoup.parser.HtmlTreeBuilder", "setPendingTableCharacters", "java.util.List", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "clearStackToTableContext", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "framesetOk", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "+1", "<sample:2>", "-1.5", "<null>", "<sample:5>"}, {"org.jsoup.parser.HtmlTreeBuilder", "inScope", "java.lang.String,java.lang.String[]", "title", "<sample:2>"}, {"org.jsoup.parser.HtmlTreeBuilder", "setPendingTableCharacters", "java.util.List", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String", "org.jsoup.nodes.Attributes"}, new String[]{"1.5e300", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"noscript", "<sample:0>", "1e10", "<null>", "<sample:1>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "insert", "org.jsoup.parser.Token$Character", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[\nnoscript]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inButtonScope", new String[]{"java.lang.String"}, new String[]{"a,b,c"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "framesetOk", "boolean", "true"}, {"org.jsoup.parser.HtmlTreeBuilder", "getFromStack", "java.lang.String", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "framesetOk", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "", "<sample:2>", ",1.5", "<null>", "<sample:4>"}, {"org.jsoup.parser.HtmlTreeBuilder", "originalState", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "inScope", "java.lang.String,java.lang.String[]", "tiit", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "setPendingTableCharacters", new String[]{"java.util.List"}, new String[]{"<sample:3>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "framesetOk", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "html", "<sample:2>", ",1.", "<null>", "<sample:4>"}, {"org.jsoup.parser.HtmlTreeBuilder", "getFormElement", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "inScope", "java.lang.String,java.lang.String[]", "tii", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inTableScope", new String[]{"java.lang.String"}, new String[]{"1.12345678901234567"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "processStartTag", "java.lang.String", "href"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "clearFormattingElementsToLastMarker", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "removeLastFormattingElement", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "originalState", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "push", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "popStackToBefore", "java.lang.String", "style"}, {"org.jsoup.parser.HtmlTreeBuilder", "isFosterInserts", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String"}, new String[]{"\u00e9"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "framesetOk", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "setHeadElement", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<null>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processEndTag", new String[]{"java.lang.String"}, new String[]{"010"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "reconstructFormattingElements", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "popStackToClose", new String[]{"java.lang.String"}, new String[]{"xmp"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getActiveFormattingElement", new String[]{"java.lang.String"}, new String[]{"1e10"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "replaceActiveFormattingElement", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:0>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insertForm", new String[]{"org.jsoup.parser.Token$StartTag", "boolean"}, new String[]{"<sample:0>", "true"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "framesetOk", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "1.251L", "<sample:5>", ",00.", "<null>", "<sample:6>"}, {"org.jsoup.parser.HtmlTreeBuilder", "defaultSettings", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "maybeSetBaseUri", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "framesetOk", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "1.241L", "<sample:5>", ",00.", "<null>", "<sample:6>"}, {"org.jsoup.parser.HtmlTreeBuilder", "markInsertionMode", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "defaultSettings", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "isFosterInserts", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inScope", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"a", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getBaseUri", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "insert", "org.jsoup.nodes.Element", "<sample:5>"}, {"org.jsoup.parser.HtmlTreeBuilder", "inScope", "java.lang.String,java.lang.String[]", "\u00e9", "<sample:0>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$Comment"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "clearStackToTableRowContext", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "processStartTag", "java.lang.String,org.jsoup.nodes.Attributes", "1.25", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$StartTag"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "isSpecial", "org.jsoup.nodes.Element", "<sample:7>"}, {"org.jsoup.parser.HtmlTreeBuilder", "insertOnStackAfter", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:5>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insertEmpty", new String[]{"org.jsoup.parser.Token$StartTag"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "insert", "org.jsoup.nodes.Element", "<sample:0>"}, {"org.jsoup.parser.HtmlTreeBuilder", "insertOnStackAfter", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:6>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "popStackToBefore", new String[]{"java.lang.String"}, new String[]{"1.5"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "setPendingTableCharacters", "java.util.List", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "generateImpliedEndTags", new String[]{"java.lang.String"}, new String[]{"\u00e9"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "isInActiveFormattingElements", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "markInsertionMode", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "framesetOk", "boolean", "true"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insertEmpty", new String[]{"org.jsoup.parser.Token$StartTag"}, new String[]{"<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "error", new String[]{"org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "insertStartTag", "java.lang.String", "123456789012345678901234567890"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "<sample:1>", "100", "<null>", "<sample:3>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "isFragmentParsing", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaa]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaabaaaatitle", "<sample:4>", "109=0", "<null>", "<sample:3>"}, false), new String[][]{{"remove", "int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaabaaaatitle", "<sample:4>", "109=0", "<null>", "<sample:3>"}, false), new String[][]{{"subList", "int,int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaabaaaatitle", "<sample:5>", "1", "<null>", "<sample:3>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "aboveOnStack", "org.jsoup.nodes.Element", "<sample:6>"}}), new String[][]{{"subList", "int,int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "onStack", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "lastFormattingElement", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "maybeSetBaseUri", "org.jsoup.nodes.Element", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "pushActiveFormattingElements", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "clearStackToTableBodyContext", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"\t", "<sample:8>", "table", "<null>", "<sample:4>"}, false, 6, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "getActiveFormattingElement", "java.lang.String", "-1.5"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[ ]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"\n", "<null>", "table010", "<null>", "<sample:5>"}, false, 7, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "getActiveFormattingElement", "java.lang.String", "-1.51.5d"}, {"org.jsoup.parser.HtmlTreeBuilder", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[<html>\n <head></head>\n <body></body>\n</html>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "<sample:6>", "http://example.com/a?b=c", "<null>", "<sample:2>"}, false, 7, new String[][]{}), new String[][]{{"listIterator", "", "5"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insertForm", new String[]{"org.jsoup.parser.Token$StartTag", "boolean"}, new String[]{"<null>", "false"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"2020-01-011.12345671", "<sample:0>", "http:/.example.com/a?b=cnoembed", "<null>", "<sample:3>"}, false, 11, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "popStackToBefore", "java.lang.String", "1.234567990123456"}, {"org.jsoup.parser.HtmlTreeBuilder", "generateImpliedEndTags", ""}}), new String[][]{{"lastIndexOf", "java.lang.Object", "1"}, {"lastIndexOf", "java.lang.Object", "0"}, {"contains", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"2020-/1-011.12345671", "<sample:0>", "http:/.example.com/a?b=cnoembed", "<null>", "<sample:3>"}, false, 11, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "inListItemScope", "java.lang.String", "<null>"}, {"org.jsoup.parser.HtmlTreeBuilder", "popStackToBefore", "java.lang.String", "1.234567990123456"}, {"org.jsoup.parser.HtmlTreeBuilder", "generateImpliedEndTags", ""}}), new String[][]{{"lastIndexOf", "java.lang.Object", "1"}, {"lastIndexOf", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inSelectScope", new String[]{"java.lang.String"}, new String[]{"1.5e300"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "setFormElement", "org.jsoup.nodes.FormElement", "<sample:5>"}, {"org.jsoup.parser.HtmlTreeBuilder", "insert", "org.jsoup.parser.Token$Comment", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "removeFromActiveFormattingElements", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "popStackToClose", new String[]{"java.lang.String[]"}, new String[]{"<empty>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "clearStackToTableBodyContext", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "runParser", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "clearStackToTableRowContext", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "state", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "setFosterInserts", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inScope", new String[]{"java.lang.String[]"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inListItemScope", new String[]{"java.lang.String"}, new String[]{"1.5d"}, false, 6, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "framesetOk", "boolean", "false"}, {"org.jsoup.parser.HtmlTreeBuilder", "insertStartTag", "java.lang.String", "1.25"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$StartTag"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inScope", new String[]{"java.lang.String"}, new String[]{"1.1234567890123456"}, false, 3, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "error", "org.jsoup.parser.HtmlTreeBuilderState", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "processEndTag", "java.lang.String", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "defaultSettings", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.ParseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "originalState", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "replaceActiveFormattingElement", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:8>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getDocument", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "markInsertionMode", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "clearStackToTableRowContext", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "aboveOnStack", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "newPendingTableCharacters", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "inScope", "java.lang.String[]", "<sample:2>"}, {"org.jsoup.parser.HtmlTreeBuilder", "aboveOnStack", "org.jsoup.nodes.Element", "<sample:0>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getFromStack", new String[]{"java.lang.String"}, new String[]{"true"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<null>", "<sample:6>", "tr", "<sample:7>", "<sample:0>"}, {"org.jsoup.parser.HtmlTreeBuilder", "transition", "org.jsoup.parser.HtmlTreeBuilderState", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<null>", "<null>"}, false, 4, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "initialiseParse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<sample:3>", "123456789012345678901234567890", "<sample:7>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getFormElement", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "isFragmentParsing", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "initialiseParse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<sample:2>", "1.241L", "<sample:4>", "<sample:6>"}, {"org.jsoup.parser.HtmlTreeBuilder", "lastFormattingElement", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "replaceOnStack", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:0>", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getHeadElement", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "initialiseParse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<sample:3>", "1E-5", "<null>", "<sample:6>"}, {"org.jsoup.parser.HtmlTreeBuilder", "replaceOnStack", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:5>", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=null, state=Initial, currentElement=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getPendingTableCharacters", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "defaultSettings", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.ParseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "generateImpliedEndTags", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String", "org.jsoup.nodes.Attributes"}, new String[]{"1.f", "<sample:4>"}, false, 5, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "insert", "org.jsoup.parser.Token$Character", "<null>"}, {"org.jsoup.parser.HtmlTreeBuilder", "popStackToBefore", "java.lang.String", ",1.table"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "framesetOk", new String[]{"boolean"}, new String[]{"false"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insertMarkerToFormattingElements", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getDocument", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "popStackToBefore", "java.lang.String", "td"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getDocument", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "popStackToBefore", "java.lang.String", "td"}, {"org.jsoup.parser.HtmlTreeBuilder", "getBaseUri", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$Comment"}, new String[]{"<sample:0>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inListItemScope", new String[]{"java.lang.String"}, new String[]{"select"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "setHeadElement", "org.jsoup.nodes.Element", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "resetInsertionMode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "pop", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "onStack", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "inListItemScope", "java.lang.String", "PT1Hx"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inTableScope", new String[]{"java.lang.String"}, new String[]{"seledt"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "generateImpliedEndTags", "java.lang.String", ",0."}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$Comment"}, new String[]{"<sample:8>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$Comment"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "markInsertionMode", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "markInsertionMode", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "removeFromStack", "org.jsoup.nodes.Element", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "generateImpliedEndTags", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "lastFormattingElement", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "removeFromActiveFormattingElements", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:3>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:3>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insertStartTag", new String[]{"java.lang.String"}, new String[]{"tfoot"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insertStartTag", new String[]{"java.lang.String"}, new String[]{"Iplin2text"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token", "<sample:5>"}, {"org.jsoup.parser.HtmlTreeBuilder", "popStackToBefore", "java.lang.String", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insertStartTag", new String[]{"java.lang.String"}, new String[]{"a"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token", "<sample:7>"}, {"org.jsoup.parser.HtmlTreeBuilder", "popStackToBefore", "java.lang.String", "-1"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "clearStackToTableContext", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "clearStackToTableBodyContext", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "replaceActiveFormattingElement", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:0>", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getPendingTableCharacters", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "popStackToBefore", "java.lang.String", "ifframe"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insertForm", new String[]{"org.jsoup.parser.Token$StartTag", "boolean"}, new String[]{"<sample:2>", "false"}, false, 1, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "newPendingTableCharacters", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "insertOnStackAfter", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:1>", "<sample:9>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "maybeSetBaseUri", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:11>"}, false, 1, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "defaultSettings", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inScope", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"tablee010", "<empty>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "aboveOnStack", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:3>"}, false, 8, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "markInsertionMode", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "initialiseParse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<sample:3>", "12:30:45", "<null>", "<sample:6>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=null, state=Initial, currentElement=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getBaseUri", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "setPendingTableCharacters", "java.util.List", "<sample:1>"}, {"org.jsoup.parser.HtmlTreeBuilder", "getFormElement", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "setHeadElement", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:7>"}, false, 2, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "resetInsertionMode", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "insertEmpty", "org.jsoup.parser.Token$StartTag", "<sample:10>"}, {"org.jsoup.parser.HtmlTreeBuilder", "runParser", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "setHeadElement", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "resetInsertionMode", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "generateImpliedEndTags", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getFromStack", new String[]{"java.lang.String"}, new String[]{"p~"}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insertStartTag", new String[]{"java.lang.String"}, new String[]{"t;"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "isFosterInserts", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "maybeSetBaseUri", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "inScope", "java.lang.String", "TITLE0x1F0xFFFFFFFF"}, {"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "+1", "<sample:8>", "select", "<sample:6>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getHeadElement", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "inSelectScope", "java.lang.String", "thead"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "popStackToClose", new String[]{"java.lang.String"}, new String[]{"-1.51.5d"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inScope", new String[]{"java.lang.String"}, new String[]{"-1.5"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "clearStackToTableContext", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "maybeSetBaseUri", "org.jsoup.nodes.Element", "<sample:2>"}, {"org.jsoup.parser.HtmlTreeBuilder", "removeFromStack", "org.jsoup.nodes.Element", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String"}, new String[]{"1.5e30"}, false, 14, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "framesetOk", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$StartTag"}, new String[]{"<sample:7>"}, false, 8, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "insert", "org.jsoup.nodes.Element", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "transition", new String[]{"org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "getFormElement", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "framesetOk", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "framesetOk", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "setFosterInserts", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "isFosterInserts", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getHeadElement", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "insert", "org.jsoup.parser.Token$Character", "<sample:6>"}, {"org.jsoup.parser.HtmlTreeBuilder", "insert", "org.jsoup.nodes.Element", "<null>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "isFragmentParsing", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "clearStackToTableContext", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "popStackToBefore", new String[]{"java.lang.String"}, new String[]{"11.5e3002020-02-30T25:61I:61"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "originalState", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "defaultSettings", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "clearStackToTableRowContext", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "runParser", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "setHeadElement", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "insert", "org.jsoup.parser.Token$Character", "<null>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insertMarkerToFormattingElements", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "insert", "org.jsoup.parser.Token$StartTag", "<sample:4>"}, {"org.jsoup.parser.HtmlTreeBuilder", "toString", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "aboveOnStack", "org.jsoup.nodes.Element", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "replaceActiveFormattingElement", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:5>", "<null>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "setPendingTableCharacters", "java.util.List", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "replaceActiveFormattingElement", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:0>", "<sample:5>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "setPendingTableCharacters", "java.util.List", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processEndTag", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "aboveOnStack", "org.jsoup.nodes.Element", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inTableScope", new String[]{"java.lang.String"}, new String[]{"[1,2]"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "isInActiveFormattingElements", "org.jsoup.nodes.Element", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getFromStack", new String[]{"java.lang.String"}, new String[]{" T1P"}, false, 7, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "setFosterInserts", "boolean", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "newPendingTableCharacters", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "insertMarkerToFormattingElements", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "resetInsertionMode", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "resetInsertionMode", new String[]{}, new String[]{}, false, 15, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "toString", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "getStack", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "isInActiveFormattingElements", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:4>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insertOnStackAfter", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<null>", "<sample:4>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "inTableScope", "java.lang.String", "2020-01-e1"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insertInFosterParent", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "insertStartTag", "java.lang.String", "7c"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inSelectScope", new String[]{"java.lang.String"}, new String[]{"select"}, false, 7, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "framesetOk", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insertForm", new String[]{"org.jsoup.parser.Token$StartTag", "boolean"}, new String[]{"<null>", "true"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "inScope", "java.lang.String", "http://example.com/a?b=c"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getActiveFormattingElement", new String[]{"java.lang.String"}, new String[]{"nnscript"}, false, 1, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "popStackToClose", "java.lang.String", "1.5"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insert", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "removeFromActiveFormattingElements", "org.jsoup.nodes.Element", "<sample:5>"}, {"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "[1,2]", "<sample:5>", "thead", "<sample:2>", "<sample:3>"}, {"org.jsoup.parser.HtmlTreeBuilder", "setPendingTableCharacters", "java.util.List", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inButtonScope", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFF"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "inButtonScope", "java.lang.String", ",0."}, {"org.jsoup.parser.HtmlTreeBuilder", "onStack", "org.jsoup.nodes.Element", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inButtonScope", new String[]{"java.lang.String"}, new String[]{"-,-"}, false, 12, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "inScope", "java.lang.String", "tbodytrue"}, {"org.jsoup.parser.HtmlTreeBuilder", "replaceOnStack", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:5>", "<sample:1>"}, {"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<empty>", "template", "<null>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inButtonScope", new String[]{"java.lang.String"}, new String[]{"xmp"}, false, 12, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "replaceOnStack", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:5>", "<sample:1>"}, {"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<sample:3>", "template", "<null>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inButtonScope", new String[]{"java.lang.String"}, new String[]{"xmpTITLnE"}, false, 12, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<sample:3>", "template", "<null>", "<sample:1>"}, {"org.jsoup.parser.HtmlTreeBuilder", "inListItemScope", "java.lang.String", ",070."}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inButtonScope", new String[]{"java.lang.String"}, new String[]{"3x5].{sF.5ebf0"}, false, 9, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "originalState", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<sample:3>", "template", "<null>", "<sample:6>"}, {"org.jsoup.parser.HtmlTreeBuilder", "isFragmentParsing", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inButtonScope", new String[]{"java.lang.String"}, new String[]{":"}, false, 13, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "pop", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "isInActiveFormattingElements", "org.jsoup.nodes.Element", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inButtonScope", new String[]{"java.lang.String"}, new String[]{"::"}, false, 13, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "pop", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<sample:3>", "*mp", "<null>", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inButtonScope", new String[]{"java.lang.String"}, new String[]{"1.5d"}, false, 13, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<sample:3>", "*mp", "<null>", "<sample:7>"}, {"org.jsoup.parser.HtmlTreeBuilder", "setFormElement", "org.jsoup.nodes.FormElement", "<null>"}, {"org.jsoup.parser.HtmlTreeBuilder", "processStartTag", "java.lang.String,org.jsoup.nodes.Attributes", "--1", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<--1>, state=InBody, currentElement=<--1></--1>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insertForm", new String[]{"org.jsoup.parser.Token$StartTag", "boolean"}, new String[]{"<sample:2>", "true"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "removeLastFormattingElement", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inButtonScope", new String[]{"java.lang.String"}, new String[]{"}13"}, false, 2, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<sample:7>", "*mptd", "<null>", "<sample:12>"}, {"org.jsoup.parser.HtmlTreeBuilder", "insert", "org.jsoup.parser.Token$Comment", "<sample:2>"}, {"org.jsoup.parser.HtmlTreeBuilder", "isSpecial", "org.jsoup.nodes.Element", "<sample:8>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inButtonScope", new String[]{"java.lang.String"}, new String[]{"1.2241L"}, false, 15, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<sample:7>", "*mptd", "<null>", "<sample:12>"}, {"org.jsoup.parser.HtmlTreeBuilder", "insert", "org.jsoup.parser.Token$Comment", "<sample:6>"}, {"org.jsoup.parser.HtmlTreeBuilder", "processStartTag", "java.lang.String,org.jsoup.nodes.Attributes", "null", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<null>, state=InBody, currentElement=<null></null>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inButtonScope", new String[]{"java.lang.String"}, new String[]{"1.2241L"}, false, 15, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<sample:7>", "*mptd", "<null>", "<null>"}, {"org.jsoup.parser.HtmlTreeBuilder", "insert", "org.jsoup.parser.Token$Comment", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<head>, state=BeforeHead, currentElement=<html>\n <!---->\n</html>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inButtonScope", new String[]{"java.lang.String"}, new String[]{"html"}, false, 15, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<sample:7>", "**mptd", "<null>", "<sample:15>"}, {"org.jsoup.parser.HtmlTreeBuilder", "insert", "org.jsoup.parser.Token$Comment", "<sample:5>"}, {"org.jsoup.parser.HtmlTreeBuilder", "originalState", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inButtonScope", new String[]{"java.lang.String"}, new String[]{"-0.0"}, false, 4, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "insertOnStackAfter", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:6>", "<sample:1>"}, {"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<sample:7>", "", "<null>", "<null>"}, {"org.jsoup.parser.HtmlTreeBuilder", "popStackToBefore", "java.lang.String", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<head>, state=BeforeHead, currentElement=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inButtonScope", new String[]{"java.lang.String"}, new String[]{"table010"}, false, 14, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<sample:7>", "", "<null>", "<sample:0>"}, {"org.jsoup.parser.HtmlTreeBuilder", "popStackToClose", "java.lang.String[]", "<sample:1>"}, {"org.jsoup.parser.HtmlTreeBuilder", "aboveOnStack", "org.jsoup.nodes.Element", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inButtonScope", new String[]{"java.lang.String"}, new String[]{"1.2"}, false, 15, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<sample:6>", "", "<null>", "<sample:7>"}, {"org.jsoup.parser.HtmlTreeBuilder", "popStackToClose", "java.lang.String[]", "<sample:2>"}, {"org.jsoup.parser.HtmlTreeBuilder", "aboveOnStack", "org.jsoup.nodes.Element", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inButtonScope", new String[]{"java.lang.String"}, new String[]{"X"}, false, 12, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<sample:6>", "2020-02-30T25:61:61", "<null>", "<sample:7>"}, {"org.jsoup.parser.HtmlTreeBuilder", "aboveOnStack", "org.jsoup.nodes.Element", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getDocument", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inButtonScope", new String[]{"java.lang.String"}, new String[]{"0.2r41"}, false, 2, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings", "<sample:6>", "sscript", "<null>", "<sample:2>"}, {"org.jsoup.parser.HtmlTreeBuilder", "processStartTag", "java.lang.String", "-1.51.5d"}, {"org.jsoup.parser.HtmlTreeBuilder", "aboveOnStack", "org.jsoup.nodes.Element", "<sample:9>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<-1.51.5d>, state=InBody, currentElement=<-1.51.5d></-1.51.5d>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.ParseErrorList", "org.jsoup.parser.ParseSettings"}, new String[]{"<null>", "", "<null>", "<sample:1>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "setFormElement", "org.jsoup.nodes.FormElement", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getStack", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "pop", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "generateImpliedEndTags", new String[]{"java.lang.String"}, new String[]{"1.2"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getHeadElement", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "setHeadElement", "org.jsoup.nodes.Element", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<sample></sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getHeadElement", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "setHeadElement", "org.jsoup.nodes.Element", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<{\"a\":1}></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "removeLastFormattingElement", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "inTableScope", "java.lang.String", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "originalState", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "transition", new String[]{"org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "clearStackToTableContext", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getBaseUri", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "setFormElement", new String[]{"org.jsoup.nodes.FormElement"}, new String[]{"<sample:6>"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "runParser", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insertForm", new String[]{"org.jsoup.parser.Token$StartTag", "boolean"}, new String[]{"<sample:4>", "false"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "reconstructFormattingElements", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "clearFormattingElementsToLastMarker", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "removeFromStack", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:3>"}, false, 14, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "getActiveFormattingElement", "java.lang.String", "-1"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inScope", new String[]{"java.lang.String[]"}, new String[]{"<empty>"}, false, 1, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "removeFromStack", "org.jsoup.nodes.Element", "<sample:0>"}, {"org.jsoup.parser.HtmlTreeBuilder", "getActiveFormattingElement", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaabaaaatitle"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "maybeSetBaseUri", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "popStackToClose", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaabaaaatitle"}, {"org.jsoup.parser.HtmlTreeBuilder", "getBaseUri", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "getDocument", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "lastFormattingElement", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "getFromStack", "java.lang.String", "\u00e9theadtable"}, {"org.jsoup.parser.HtmlTreeBuilder", "originalState", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
}
