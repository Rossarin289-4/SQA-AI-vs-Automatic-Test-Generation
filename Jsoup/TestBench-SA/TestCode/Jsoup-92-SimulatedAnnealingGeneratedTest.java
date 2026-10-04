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
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "processStartTag", new String[]{"java.lang.String", "org.jsoup.nodes.Attributes"}, new String[]{"5.", "<sample:5>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "process", "org.jsoup.parser.Token", "<sample:3>"}, {"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$StartTag", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getActiveFormattingElement", new String[]{"java.lang.String"}, new String[]{"Ttextarea"}, false, 6, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "popStackToClose", "java.lang.String[]", "<sample:0>"}, {"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser", "plaintextnoframes", "<sample:5>", "npembed", "<sample:3>"}, {"org.jsoup.parser.HtmlTreeBuilder", "removeFromStack", "org.jsoup.nodes.Element", "<sample:3>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "boolean"}, new String[]{"iframe", "false"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" {isEmpty=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {isEmpty=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getActiveFormattingElement", new String[]{"java.lang.String"}, new String[]{"12H4567"}, false, 4, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser", "plaintextnoframes", "<sample:4>", "npemmbed", "<sample:8>"}, {"org.jsoup.parser.HtmlTreeBuilder", "popStackToBefore", "java.lang.String", "2020-01-01"}, {"org.jsoup.parser.HtmlTreeBuilder", "removeFromStack", "org.jsoup.nodes.Element", "<sample:7>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "isFragmentParsing", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "isSpecial", "org.jsoup.nodes.Element", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getActiveFormattingElement", new String[]{"java.lang.String"}, new String[]{"T"}, false, 6, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser", "0x123456789", "<sample:2>", "npemlbed", "<sample:2>"}, {"org.jsoup.parser.HtmlTreeBuilder", "generateImpliedEndTags", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "push", "org.jsoup.nodes.Element", "<sample:3>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$CData", "reset", new String[]{"java.lang.StringBuilder"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getActiveFormattingElement", new String[]{"java.lang.String"}, new String[]{"nnDemlbedo1.1234567890123456"}, false, 4, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser", "e]= s+rrC.WW]ptPU\u00e92H", "<null>", "1.5", "<sample:6>"}, {"org.jsoup.parser.HtmlTreeBuilder", "getFormElement", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "clearStackToTableContext", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "originalState", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "newPendingTableCharacters", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:5>", "<sample:0>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "state", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getActiveFormattingElement", new String[]{"java.lang.String"}, new String[]{"2.5fsexxtaeabctml2020-02-30T25:61:611.5f-1"}, false, 15, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser", "1.5ftexxtaeacc", "<null>", "2020-01-01", "<sample:3>"}, {"org.jsoup.parser.HtmlTreeBuilder", "insertMarkerToFormattingElements", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getActiveFormattingElement", new String[]{"java.lang.String"}, new String[]{"[0FTG0eey8114"}, false, 3, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser", "1.5ftexxtaeacc", "<null>", "202001-02", "<sample:3>"}, {"org.jsoup.parser.HtmlTreeBuilder", "generateImpliedEndTags", "java.lang.String", "{\"a\":1}"}, {"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser", "`c", "<sample:8>", "i@", "<sample:8>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getActiveFormattingElement", new String[]{"java.lang.String"}, new String[]{"11e/5.25-1.51e10"}, false, 12, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser", "1.5ftexxtaeacb", "<null>", "2", "<sample:4>"}, {"org.jsoup.parser.HtmlTreeBuilder", "removeFromActiveFormattingElements", "org.jsoup.nodes.Element", "<sample:5>"}, {"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser", "`b", "<sample:8>", "i", "<sample:6>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$CData", "isEOF", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.parser.Token", "asCharacter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[0]]>", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$CData", "isComment", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.Token", "tokenType", ""}, {"org.jsoup.parser.Token", "asCharacter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[a]]>", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "error", "java.lang.String", "\u00e9"}, {"org.jsoup.parser.XmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "h", "01fF1Pn212:551[789012434,5=68902123457789/1-25table1.5c3002947483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inListItemScope", new String[]{"java.lang.String"}, new String[]{"mnDemlbedo1.1234567890123456"}, false, 13, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser", "`", "<sample:2>", "2.5fsexxtaoeabctml2020-02-3T25:6", "<sample:3>"}, {"org.jsoup.parser.HtmlTreeBuilder", "markInsertionMode", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "inButtonScope", "java.lang.String", "thast"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inListItemScope", new String[]{"java.lang.String"}, new String[]{"if"}, false, 11, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "replaceActiveFormattingElement", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:6>", "<sample:0>"}, {"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser", "222\n+1hrehpfP21H", "<sample:5>", "2.5rexxtapearbctmlp23020--h2-2T26:63", "<sample:10>"}, {"org.jsoup.parser.HtmlTreeBuilder", "insertOnStackAfter", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:11>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "removeIgnoreCase", new String[]{"java.lang.String"}, new String[]{"\u00e9DTIE"}, false, 3, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,java.lang.String", "\u00e9DTIE", "12:30:45"}, {"org.jsoup.nodes.Attributes", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {isEmpty=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inListItemScope", new String[]{"java.lang.String"}, new String[]{"1.542"}, false, 14, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "<sample:2>", "\t", "<sample:1>"}, {"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token", "<sample:7>"}, {"org.jsoup.parser.HtmlTreeBuilder", "insertInFosterParent", "org.jsoup.nodes.Node", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<![CDATA[0]]>, state=InBody, currentElement=<html>\n aaaaaaaaaaaaaaaaaaaaaaaaaaaaa<![CDATA[0]]><![CDATA[]]>\n</html>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inListItemScope", new String[]{"java.lang.String"}, new String[]{"nAll"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser", "aaaaaaaaaaaaaaaaa2aaaaaaaaaaa", "<sample:2>", "\t", "<sample:1>"}, {"org.jsoup.parser.HtmlTreeBuilder", "inTableScope", "java.lang.String", "plaintext"}, {"org.jsoup.parser.HtmlTreeBuilder", "insertInFosterParent", "org.jsoup.nodes.Node", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"T", "<sample:6>", "1.1234567", "<sample:7>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parseFragment", "java.lang.String,java.lang.String,org.jsoup.parser.Parser", "h", "a b", "<sample:10>"}, {"org.jsoup.parser.XmlTreeBuilder", "processStartTag", "java.lang.String,org.jsoup.nodes.Attributes", ".5", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[\nT]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inListItemScope", new String[]{"java.lang.String"}, new String[]{"ifr,me"}, false, 7, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser", "Cpq", "<sample:5>", "c9", "<sample:1>"}, {"org.jsoup.parser.HtmlTreeBuilder", "push", "org.jsoup.nodes.Element", "<sample:6>"}, {"org.jsoup.parser.HtmlTreeBuilder", "processStartTag", "java.lang.String,org.jsoup.nodes.Attributes", "plaitextnorames", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<plaitextnorames>, state=InBody, currentElement=<sample></sample>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inListItemScope", new String[]{"java.lang.String"}, new String[]{"<C>b</a>HelmI, World"}, false, 7, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser", "D<X1/1o}45k66t:evtareanoframes", "<sample:8>", "Tuetasea", "<sample:4>"}, {"org.jsoup.parser.HtmlTreeBuilder", "pushActiveFormattingElements", "org.jsoup.nodes.Element", "<sample:5>"}, {"org.jsoup.parser.HtmlTreeBuilder", "processStartTag", "java.lang.String,org.jsoup.nodes.Attributes", "212\n,1href2020-02-30T25:6:61", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<212\n,1href2020-02-30T25:6:61  #cdata=\"a\">, state=InBody, currentElement=<212\n,1href2020-02-30t25:6:61 #cdata=\"a\"></212\n,1href2020-02-30t25:6:61>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "add", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Cpq", "2147483648"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "remove", "java.lang.String", "true"}}), new String[][]{{"clone", "", "3"}, {"add", "java.lang.String,java.lang.String", "6"}, {"get", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", " Cpq=\"2147483648\" {isEmpty=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inListItemScope", new String[]{"java.lang.String"}, new String[]{"1.5ftextaeac-0.0"}, false, 3, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser", "D<XB/2p}44k66teXtare1.2345678Hello, Workd1.5d", "<sample:6>", "1.542", "<sample:8>"}, {"org.jsoup.parser.HtmlTreeBuilder", "pushActiveFormattingElements", "org.jsoup.nodes.Element", "<sample:5>"}, {"org.jsoup.parser.HtmlTreeBuilder", "processStartTag", "java.lang.String,org.jsoup.nodes.Attributes", "", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:6>", "a", "<sample:3>"}, false, 2, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.lang.String,java.lang.String", "1e10", "h"}, {"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Comment", "<sample:0>"}, {"org.jsoup.parser.XmlTreeBuilder", "processEndTag", "java.lang.String", "1.5ftexxtareaabc"}}), new String[][]{{"charset", "java.nio.charset.Charset", "0"}, {"getElementById", "java.lang.String", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "popStackToClose", new String[]{"java.lang.String"}, new String[]{"212\n,1ref2020-02-30TT25:6:512020-01-01y"}, false, 11, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser", "http://example.com/a?b=c", "<sample:6>", "aaaaaaaaaaaaaaaaa2aaaaaaaaaaa", "<sample:0>"}, {"org.jsoup.parser.HtmlTreeBuilder", "getHeadElement", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.ParseSettings", "org.jsoup.parser.ParseSettings", "preserveTagCase", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.parser.ParseSettings", "normalizeAttribute", "java.lang.String", "Ttextarea"}, {"org.jsoup.parser.ParseSettings", "preserveAttributeCase", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inScope", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"2.5rfx\nwtapearbctml23020--h2-2T26:630xFFFFhFFFF", "<null>"}, false, 11, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser", "qlaint_xtno", "<sample:5>", "2.5f", "<sample:14>"}, {"org.jsoup.parser.HtmlTreeBuilder", "replaceOnStack", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:7>", "<sample:2>"}, {"org.jsoup.parser.HtmlTreeBuilder", "processStartTag", "java.lang.String,org.jsoup.nodes.Attributes", "\n2\u00e9C", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<\n2\u00e9C>, state=InBody, currentElement=<2\u00e9C></2\u00e9C>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inScope", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{",", "<sample:1>"}, false, 13, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser", "q`in", "<sample:6>", "100", "<sample:11>"}, {"org.jsoup.parser.HtmlTreeBuilder", "markInsertionMode", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "insert", "org.jsoup.nodes.Element", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"/a/b", "<sample:4>", "aaaaaaaaaaaaaaaa2\r2aaaa", "<sample:1>"}, false, 2, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser", "nAll", "<sample:2>", "npembed", "<sample:7>"}, {"org.jsoup.parser.HtmlTreeBuilder", "popStackToClose", "java.lang.String[]", "<sample:0>"}, {"org.jsoup.parser.HtmlTreeBuilder", "inScope", "java.lang.String[]", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[\n/a/b]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "removeIgnoreCase", new String[]{"java.lang.String"}, new String[]{"1.1234567890123456"}, false, 6, new String[][]{{"org.jsoup.nodes.Attributes", "equals", "java.lang.Object", "<i:-1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " #cdata=\"a\" {isEmpty=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parseFragment", "java.lang.String,java.lang.String,org.jsoup.parser.Parser", "Tuetasea", "Hell\n\t, AWorl1.5", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:1>", "<sample:1>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "generateImpliedEndTags", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "normalize", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "addAll", "org.jsoup.nodes.Attributes", "<sample:8>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " #cdata=\"a\" {isEmpty=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "size", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "D<X1/2p}44k66t:eXta3e1.2345678Hello, World", "true"}, {"org.jsoup.nodes.Attributes", "equals", "java.lang.Object", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", " D<X1/2p}44k66t:eXta3e1.2345678Hello, World {isEmpty=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "clone", ""}, {"org.jsoup.nodes.Attributes", "asList", ""}, {"org.jsoup.nodes.Attributes", "get", "java.lang.String", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-367465224", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" {isEmpty=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "clearStackToTableRowContext", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "insertInFosterParent", "org.jsoup.nodes.Node", "<sample:0>"}, {"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:2>", "2.5fs_xxtaoeabctml2020-02-3T25:6", "<sample:8>"}, {"org.jsoup.parser.HtmlTreeBuilder", "aboveOnStack", "org.jsoup.nodes.Element", "<sample:2>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"1.12345578901234561.5dnoembed", "<sample:4>", "dtta", "<sample:4>"}, false, 1, new String[][]{}, 3), new String[][]{{"get", "int", "2"}, {"wrap", "java.lang.String", "5"}, {"after", "java.lang.String", "5"}, {"outerHtml", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n1.12345578901234561.5dnoembed", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"D7<X1/2q}44xj67t:edXtare2.=23456678Hel.lo,< Word", "<sample:12>", "u0FTTG17e11914b", "<sample:4>"}, false, 1, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "setFormElement", "org.jsoup.nodes.FormElement", "<sample:0>"}}, 3), new String[][]{{"get", "int", "2"}, {"before", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.TextNode", actual.getClass().getName());
  assertEquals("D7 {getWholeText=D7, hasParent=true, isBlank=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"D<X1/2q}43xj67s:edXtare.=23,567888Hel.lo,<,Wosd0x1-2234567i59style0noscript", "<sample:12>", "2-5r_xxttapaacrml2020-02-3T25L:6tabl4noemaed5.noscript", "<sample:3>"}, false, 13, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "isSpecial", "org.jsoup.nodes.Element", "<sample:1>"}, {"org.jsoup.parser.HtmlTreeBuilder", "getBaseUri", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "getPendingTableCharacters", ""}}, 1), new String[][]{{"get", "int", "2"}, {"before", "java.lang.String", "2"}, {"before", "org.jsoup.nodes.Node", "5"}, {"clearAttributes", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.TextNode", actual.getClass().getName());
  assertEquals(" {getWholeText=, hasParent=true, isBlank=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:5>"}, false, 11, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<empty>", "2.5rfx\nwtapearbctml23020--h2-2T26:630xFFFFhFFFF", "<sample:6>"}, {"org.jsoup.parser.HtmlTreeBuilder", "isInActiveFormattingElements", "org.jsoup.nodes.Element", "<sample:12>"}, {"org.jsoup.parser.HtmlTreeBuilder", "isSpecial", "org.jsoup.nodes.Element", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "clearStackToTableBodyContext", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "maybeSetBaseUri", "org.jsoup.nodes.Element", "<sample:8>"}, {"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:3>", "4-;ell+\t", "<sample:11>"}, {"org.jsoup.parser.HtmlTreeBuilder", "inSelectScope", "java.lang.String", "\n2CC"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "add", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2.5fsfxxtaTabctmll11020-02-30T25:61:611.f-1", "bble"}, false, 1, new String[][]{{"org.jsoup.nodes.Attributes", "add", "java.lang.String,java.lang.String", "]oembei0", "D<X1/2q}43xj67s:edXtare.=23,567888Hel.lo,<,Wosd0x1-2234567i59style0noscript"}}), new String[][]{{"remove", "java.lang.String", "1"}, {"put", "java.lang.String,boolean", "4"}, {"hasKeyIgnoreCase", "java.lang.String", "4"}, {"put", "java.lang.String,boolean", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" ]oembei0=\"D<X1/2q}43xj67s:edXtare.=23,567888Hel.lo,<,Wosd0x1-2234567i59style0noscript\" 2.5fsfxxtaTabctmll11020-02-30T25:61:611.f-1=\"bble\"  {isEmpty=false, size=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " ]oembei0=\"D<X1/2q}43xj67s:edXtare.=23,567888Hel.lo,<,Wosd0x1-2234567i59style0noscript\" 2.5fsfxxtaTabctmll11020-02-30T25:61:611.f-1=\"bble\"  {isEmpty=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "asList", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Attributes", "addAll", "org.jsoup.nodes.Attributes", "<sample:7>"}, {"org.jsoup.nodes.Attributes", "put", "java.lang.String,boolean", "D<X1/2p}44k66t:eXta3e1.2345678Hello, World", "true"}}, 3), new String[][]{{"add", "java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:6>", "D7IX1/3q}44xj67t:eedXtare2.=2345667Iel.mA,< Word", "<sample:2>"}, false, 8, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser", "22\n+p1ihrettheH`d E-51.12345678901234567", "<sample:9>", ".5|texxuCtaqfaabbc1.50xFFFFFGFF0x123456789PT1H", "<sample:8>"}, {"org.jsoup.parser.HtmlTreeBuilder", "clearFormattingElementsToLastMarker", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "clearStackToTableBodyContext", ""}}, 3), new String[][]{{"dataset", "", "7"}, {"putAll", "java.util.Map", "1"}, {"entrySet", "", "4"}, {"clear", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset$EntrySet", actual.getClass().getName());
  assertEquals("[key1=\"0\"]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"org.jsoup.nodes.Attribute"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,java.lang.String", "`c", "TIT LF"}, {"org.jsoup.nodes.Attributes", "equals", "java.lang.Object", "<i:-102>"}}, 3), new String[][]{{"add", "java.lang.String,java.lang.String", "4"}, {"hasKey", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " `c=\"TIT LF\" 0=\"sample\" =\"a\" {isEmpty=false, size=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "isSpecial", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser", "I<X0/2n}c53yj607s:edXsare-.<3,56798\"8Hell2.lao,<_< od0x022actextareatfoot", "<sample:3>", "", "<sample:0>"}, {"org.jsoup.parser.HtmlTreeBuilder", "processEndTag", "java.lang.String", "1.1234567null"}, {"org.jsoup.parser.HtmlTreeBuilder", "clearStackToTableContext", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=</1.1234567null>, state=InBody, currentElement=<html>\n I\n</html>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "isSpecial", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:6>"}, false, 8, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser", "I<X0/2n/c53yj607t:edXsare->.<3,55797m8Hfll2+anthead", "<sample:2>", "\014", "<sample:13>"}, {"org.jsoup.parser.HtmlTreeBuilder", "insertInFosterParent", "org.jsoup.nodes.Node", "<sample:7>"}, {"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilderState", "<sample:3>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "isSpecial", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:7>"}, false, 7, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser", "I<X0/1n/c53yj607t:edXsare->.=3,55797m8Hfll2+anthead", "<sample:12>", "u", "<sample:4>"}, {"org.jsoup.parser.HtmlTreeBuilder", "insertInFosterParent", "org.jsoup.nodes.Node", "<sample:3>"}, {"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilderState", "<sample:2>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<!---->, state=InBody, currentElement=<x0 1n c53yj607t:edxsare->\n .=3,55797m8Hfll2+anthead\n <!---->\n</x0>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:9>"}, false, 1, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.io.Reader,java.lang.String", "<sample:0>", "T"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"I<X0/2n/c53yj607t:edXsare->.<3,55797m8Hfll2+anthead", "=extareaaHello, Wor-ld"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("I\n<X0 2n=\"\" c53yj607t:edXsare-=\"\">\n .&lt;3,55797m8Hfll2+anthead\n</X0> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"c{IIZCH<iRn4g+\t{A/4{H.=8---{i]xxEosngramu1LireXf22l45l780223\n559Duplicate attrib", "<null>", "PTc1H1.12345678901234567", "<sample:6>"}, false, 1, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "getBaseUri", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "setFosterInserts", "boolean", "false"}, {"org.jsoup.parser.HtmlTreeBuilder", "getPendingTableCharacters", ""}}), new String[][]{{"iterator", "", "6"}, {"hasNext", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"c<zIIcYC4<RRRmn3+\t{\nB0nb\n4H.>s>2..52020-01,010EFFGFFFFstxke12;3H:45TITLE5.41e10", "<sample:2>", "0x1F", "<sample:8>"}, false, 8, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "initialiseParse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:0>", "Tuedasfa", "<sample:3>"}, {"org.jsoup.parser.HtmlTreeBuilder", "resetInsertionMode", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "replaceActiveFormattingElement", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:4>", "<sample:3>"}}), new String[][]{{"add", "int,java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 26, new String[][]{{"org.jsoup.nodes.Attributes", "equals", "java.lang.Object", "<s:`>"}, {"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:7>"}, {"org.jsoup.nodes.Attributes", "toString", ""}}, 2), new String[][]{{"putAll", "java.util.Map", "5"}, {"remove", "java.lang.Object,java.lang.Object", "3"}, {"getOrDefault", "java.lang.Object,java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" data-key0=\"a\" data-key1=\"0\" data-key2=\"sample\" {isEmpty=false, size=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "removeLastFormattingElement", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "setHeadElement", "org.jsoup.nodes.Element", "<sample:3>"}, {"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser", "e]= s+rprC.WXptPT\u00e92H", "<sample:11>", "1.542", "<sample:6>"}, {"org.jsoup.parser.HtmlTreeBuilder", "clearStackToTableRowContext", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=null, state=Initial, currentElement=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilderState", "<sample:4>", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "push", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:4>"}, false, 11, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "popStackToClose", "java.lang.String[]", "<null>"}, {"org.jsoup.parser.HtmlTreeBuilder", "maybeSetBaseUri", "org.jsoup.nodes.Element", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "push", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:4>"}, false, 11, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "defaultSettings", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "popStackToClose", "java.lang.String[]", "<null>"}, {"org.jsoup.parser.HtmlTreeBuilder", "maybeSetBaseUri", "org.jsoup.nodes.Element", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "push", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:1>"}, false, 9, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "maybeSetBaseUri", "org.jsoup.nodes.Element", "<sample:2>"}, {"org.jsoup.parser.HtmlTreeBuilder", "setFormElement", "org.jsoup.nodes.FormElement", "<sample:4>"}, {"org.jsoup.parser.HtmlTreeBuilder", "maybeSetBaseUri", "org.jsoup.nodes.Element", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "push", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:1>"}, false, 9, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "isSpecial", "org.jsoup.nodes.Element", "<sample:8>"}, {"org.jsoup.parser.HtmlTreeBuilder", "maybeSetBaseUri", "org.jsoup.nodes.Element", "<sample:2>"}, {"org.jsoup.parser.HtmlTreeBuilder", "setFormElement", "org.jsoup.nodes.FormElement", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "push", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:6>"}, false, 9, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "maybeSetBaseUri", "org.jsoup.nodes.Element", "<sample:5>"}, {"org.jsoup.parser.HtmlTreeBuilder", "setFormElement", "org.jsoup.nodes.FormElement", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "get", new String[]{"java.lang.String"}, new String[]{"iframe"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "putIgnoreCase", "java.lang.String,java.lang.String", "abc", "Title"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " abc=\"Title\" {isEmpty=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "get", new String[]{"java.lang.String"}, new String[]{"0xFF"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "get", new String[]{"java.lang.String"}, new String[]{"-"}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "iterator", ""}, {"org.jsoup.nodes.Attributes", "toString", ""}, {"org.jsoup.nodes.Attributes", "deduplicate", "org.jsoup.parser.ParseSettings", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" {isEmpty=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "get", new String[]{"java.lang.String"}, new String[]{":1.5e300"}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "iterator", ""}, {"org.jsoup.nodes.Attributes", "removeIgnoreCase", "java.lang.String", "12:30:45"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" {isEmpty=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "get", new String[]{"java.lang.String"}, new String[]{"null"}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "iterator", ""}, {"org.jsoup.nodes.Attributes", "removeIgnoreCase", "java.lang.String", "12:30:45"}, {"org.jsoup.nodes.Attributes", "asList", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" {isEmpty=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "get", new String[]{"java.lang.String"}, new String[]{"Hell\t, World"}, false, 13, new String[][]{{"org.jsoup.nodes.Attributes", "iterator", ""}, {"org.jsoup.nodes.Attributes", "removeIgnoreCase", "java.lang.String", "0x1F"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "get", new String[]{"java.lang.String"}, new String[]{"Hell\t, World"}, false, 13, new String[][]{{"org.jsoup.nodes.Attributes", "clone", ""}, {"org.jsoup.nodes.Attributes", "iterator", ""}, {"org.jsoup.nodes.Attributes", "removeIgnoreCase", "java.lang.String", "0x1F"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "get", new String[]{"java.lang.String"}, new String[]{"Hell\n\t, AWorl1.5"}, false, 1, new String[][]{{"org.jsoup.nodes.Attributes", "clone", ""}, {"org.jsoup.nodes.Attributes", "removeIgnoreCase", "java.lang.String", "0x1F"}, {"org.jsoup.nodes.Attributes", "normalize", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "html", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "html", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" #cdata=\"a\"", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" {isEmpty=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "html", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jsoup.nodes.Attributes", "html", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insertOnStackAfter", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:8>", "<sample:0>"}, false, 10, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "lastFormattingElement", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getActiveFormattingElement", new String[]{"java.lang.String"}, new String[]{"pxm "}, false, 8, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser", "plaintext", "<sample:6>", "\t", "<sample:4>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getActiveFormattingElement", new String[]{"java.lang.String"}, new String[]{"Hel\n\t, AWorl.5"}, false, 8, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser", "plaintextnoframes", "<sample:6>", "\t", "<sample:4>"}, {"org.jsoup.parser.HtmlTreeBuilder", "resetInsertionMode", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getActiveFormattingElement", new String[]{"java.lang.String"}, new String[]{"http:/example.com/a?b=c"}, false, 9, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser", "plaintextnoframes", "<sample:6>", "\t", "<sample:4>"}, {"org.jsoup.parser.HtmlTreeBuilder", "resetInsertionMode", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getActiveFormattingElement", new String[]{"java.lang.String"}, new String[]{"nogrames12:30:45"}, false, 2, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser", "plaintextnoframes", "<sample:6>", "\n", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getActiveFormattingElement", new String[]{"java.lang.String"}, new String[]{"\tt"}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getActiveFormattingElement", new String[]{"java.lang.String"}, new String[]{"\tuplaintext"}, false, 7, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser", "plaintextnoframes", "<sample:1>", "yabch", "<sample:0>"}, {"org.jsoup.parser.HtmlTreeBuilder", "initialiseParse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:2>", "1e10", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=null, state=Initial, currentElement=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getActiveFormattingElement", new String[]{"java.lang.String"}, new String[]{"e]= s+rrC.WXptPT\u00e92H"}, false, 4, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "initialiseParse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<empty>", "1L", "<sample:7>"}, {"org.jsoup.parser.HtmlTreeBuilder", "replaceOnStack", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:3>", "<sample:4>"}, {"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser", "plaintextnoframes", "<sample:0>", "yaFbch", "<sample:0>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getActiveFormattingElement", new String[]{"java.lang.String"}, new String[]{"-T.5"}, false, 4, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "initialiseParse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<empty>", "1L", "<sample:7>"}, {"org.jsoup.parser.HtmlTreeBuilder", "replaceOnStack", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:7>", "<sample:4>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=null, state=Initial, currentElement=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getActiveFormattingElement", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "popStackToClose", "java.lang.String[]", "<null>"}, {"org.jsoup.parser.HtmlTreeBuilder", "setFosterInserts", "boolean", "false"}, {"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser", "plaintextnoframes", "<sample:5>", "noembed", "<sample:0>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getActiveFormattingElement", new String[]{"java.lang.String"}, new String[]{"abc2A2"}, false, 6, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "popStackToClose", "java.lang.String[]", "<sample:0>"}, {"org.jsoup.parser.HtmlTreeBuilder", "removeFromStack", "org.jsoup.nodes.Element", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getActiveFormattingElement", new String[]{"java.lang.String"}, new String[]{"2.222234577"}, false, 2, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser", "0A12456789", "<sample:3>", "npemmlbed", "<sample:8>"}, {"org.jsoup.parser.HtmlTreeBuilder", "clearStackToTableContext", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "setHeadElement", "org.jsoup.nodes.Element", "<sample:4>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "push", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:2>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getFormElement", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "normalize", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", " {isEmpty=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$StartTag"}, new String[]{"<sample:7>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "reconstructFormattingElements", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilderState", "<sample:4>", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getActiveFormattingElement", new String[]{"java.lang.String"}, new String[]{"01fF1Pn212:551[789012434,5=68902123457789/1-25table1.5c3002947483648"}, false, 15, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser", "1.5ftexxtaeabc", "<null>", "222\n+1hrehpfP21H", "<sample:3>"}, {"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser", "j", "<sample:8>", "@", "<sample:6>"}, {"org.jsoup.parser.HtmlTreeBuilder", "processEndTag", "java.lang.String", "0x123456789"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=</0x123456789>, state=InBody, currentElement=<html>\n j\n</html>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getActiveFormattingElement", new String[]{"java.lang.String"}, new String[]{"01fF1Pn212:51[789011434,5=68902123457789/1-25table1.5c3002947483648"}, false, 16, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser", "1.5ftexxtaeacc", "<null>", "222\n+1hrehpfP21H", "<sample:3>"}, {"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser", "j", "<sample:8>", "@", "<sample:6>"}, {"org.jsoup.parser.HtmlTreeBuilder", "processEndTag", "java.lang.String", "0x123X456789"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=</0x123X456789>, state=InBody, currentElement=<html>\n j\n</html>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getActiveFormattingElement", new String[]{"java.lang.String"}, new String[]{"01fF1Pn212:51[789011434,5=6890212457789/1-25table1.5c3002947"}, false, 15, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser", "1.5ftexxtaeacc", "<null>", "222\n+1hrehpfP21H", "<sample:3>"}, {"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser", "abc", "<sample:8>", "@", "<sample:6>"}, {"org.jsoup.parser.HtmlTreeBuilder", "processEndTag", "java.lang.String", "0x123X456789"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=</0x123X456789>, state=InBody, currentElement=<html>\n abc\n</html>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getActiveFormattingElement", new String[]{"java.lang.String"}, new String[]{"01fF1Pn212:51[789011434,5=6890212457789/1-25table1.5c3002947"}, false, 15, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser", "1.5ftexxtaeacc", "<null>", "222\n+1hrehpfP21H", "<sample:3>"}, {"org.jsoup.parser.HtmlTreeBuilder", "processEndTag", "java.lang.String", "0x123X456789"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=</0x123X456789>, state=InBody, currentElement=<body>\n 1.5ftexxtaeacc\n</body>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getActiveFormattingElement", new String[]{"java.lang.String"}, new String[]{"thast"}, false, 15, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser", "1.5ftexxtaeacc", "<null>", "222\n+1hrehpfP21H", "<sample:3>"}, {"org.jsoup.parser.HtmlTreeBuilder", "insertMarkerToFormattingElements", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser", "`bc", "<sample:8>", "@", "<sample:6>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "error", new String[]{"java.lang.String"}, new String[]{"222\n+1hrehpfP21H"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"`b", "<sample:7>", "thast", "<sample:4>"}, false, 0, null, 1), new String[][]{{"indexOf", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inListItemScope", new String[]{"java.lang.String"}, new String[]{"i@"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$CData", "asCharacter", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$CData", actual.getClass().getName());
  assertEquals("<![CDATA[a]]>", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<![CDATA[a]]>", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Attributes", "indexOfKey", "java.lang.String", "a b"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {isEmpty=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getActiveFormattingElement", new String[]{"java.lang.String"}, new String[]{"Xpc"}, false, 2, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser", "-+b", "<null>", "href", "<sample:8>"}, {"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser", "[[0,", "<sample:11>", "i2993", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=null, state=Initial, currentElement=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "removeLastFormattingElement", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$CData", "asComment", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.Token", "isDoctype", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$CData", "asCharacter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.Token", "reset", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Token$CData", actual.getClass().getName());
  assertEquals("<![CDATA[null]]>", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<![CDATA[null]]>", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"npemmlbed", "iframe"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "process", "org.jsoup.parser.Token", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("npemmlbed {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "initialiseParse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:1>", "1L", "<sample:3>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.io.Reader,java.lang.String", "<sample:3>", "http://example.com/a?b=c"}, {"org.jsoup.parser.XmlTreeBuilder", "processStartTag", "java.lang.String", "1.25"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "normalize", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {isEmpty=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "iterator", ""}, {"org.jsoup.nodes.Attributes", "normalize", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("32", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "runParser", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parseFragment", "java.lang.String,java.lang.String,org.jsoup.parser.Parser", "npemmbed", "/a/b", "<sample:8>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "clearStackToTableBodyContext", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "setHeadElement", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "getFromStack", "java.lang.String", "2.5fsexxtaeabctml2020-02-30T25:61:611.5f-1"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String"}, new String[]{"<null>", "yaFbch"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Doctype", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$CData", "asDoctype", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:,a_d>"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inListItemScope", new String[]{"java.lang.String"}, new String[]{"F\u00eam"}, false, 4, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "popStackToClose", "java.lang.String[]", "<null>"}, {"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser", "1.1234567890123456", "<sample:1>", "", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inListItemScope", new String[]{"java.lang.String"}, new String[]{"1"}, false, 4, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "popStackToClose", "java.lang.String[]", "<null>"}, {"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:0>", "npemmlbed", "<sample:8>"}, {"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser", "0.1234567890123456", "<sample:1>", "", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inListItemScope", new String[]{"java.lang.String"}, new String[]{"1+11.6head123456"}, false, 4, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "isInActiveFormattingElements", "org.jsoup.nodes.Element", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inListItemScope", new String[]{"java.lang.String"}, new String[]{"1+11.6hcad123456"}, false, 4, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "isInActiveFormattingElements", "org.jsoup.nodes.Element", "<sample:0>"}, {"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser", "0.12345567890123456", "<sample:1>", "2.5fsexxtapeabctml2020-02-30T25:61:611.5f-1", "<sample:1>"}, {"org.jsoup.parser.HtmlTreeBuilder", "processEndTag", "java.lang.String", "1.5f"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=</1.5f>, state=InBody, currentElement=<html>\n 0.12345567890123456\n</html>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inListItemScope", new String[]{"java.lang.String"}, new String[]{"1-5d"}, false, 9, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "isInActiveFormattingElements", "org.jsoup.nodes.Element", "<sample:4>"}, {"org.jsoup.parser.HtmlTreeBuilder", "popStackToClose", "java.lang.String", "I"}, {"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser", "0.12345567890123456", "<sample:1>", "2.5fsexxtapeabctml2020-02-30T25:61:611.5f-1", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inListItemScope", new String[]{"java.lang.String"}, new String[]{"\"bc1e10"}, false, 9, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "isInActiveFormattingElements", "org.jsoup.nodes.Element", "<sample:3>"}, {"org.jsoup.parser.HtmlTreeBuilder", "state", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$CData", "isCharacter", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[a]]>", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getPendingTableCharacters", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "pop", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inListItemScope", new String[]{"java.lang.String"}, new String[]{"ifdr`me"}, false, 11, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser", "", "<sample:5>", "2.5fsexxtapeabctml2020--02-3T25:6", "<sample:1>"}, {"org.jsoup.parser.HtmlTreeBuilder", "insertInFosterParent", "org.jsoup.nodes.Node", "<sample:6>"}, {"org.jsoup.parser.HtmlTreeBuilder", "framesetOk", "boolean", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$CData", "isCharacter", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[a]]>", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inListItemScope", new String[]{"java.lang.String"}, new String[]{"uvI9"}, false, 12, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilderState", "<sample:9>", "<sample:7>"}, {"org.jsoup.parser.HtmlTreeBuilder", "replaceActiveFormattingElement", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<null>", "<sample:2>"}, {"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser", "222\n+1hrehpfP21H", "<sample:6>", "2.5rexxtapearbctml23020--h2-2T26:63", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "setFormElement", new String[]{"org.jsoup.nodes.FormElement"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token", "<sample:2>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "processStartTag", new String[]{"java.lang.String"}, new String[]{"x pripthryff"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "error", "java.lang.String", "0"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inListItemScope", new String[]{"java.lang.String"}, new String[]{"rqiipt"}, false, 5, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser", "221XX+1h9epfP21H", "<sample:0>", "-112345678901_234567\n8901234567890", "<sample:0>"}, {"org.jsoup.parser.HtmlTreeBuilder", "initialiseParse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:3>", "textarea", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=null, state=Initial, currentElement=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inListItemScope", new String[]{"java.lang.String"}, new String[]{"rqiipt"}, false, 5, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser", "221XX+1h9epfP21H", "<sample:0>", "-112345678902_234567\n8901234567890", "<sample:0>"}, {"org.jsoup.parser.HtmlTreeBuilder", "initialiseParse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:3>", "textarea", "<sample:2>"}, {"org.jsoup.parser.HtmlTreeBuilder", "transition", "org.jsoup.parser.HtmlTreeBuilderState", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=null, state=Text, currentElement=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "push", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "setFormElement", new String[]{"org.jsoup.nodes.FormElement"}, new String[]{"<sample:7>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "push", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:6>"}, false, 8, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "push", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:8>"}, false, 8, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "html", new String[]{"java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:3>", "<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {isEmpty=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "push", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:8>"}, false, 8, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "inListItemScope", "java.lang.String", "tbody"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "push", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:4>"}, false, 9, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "maybeSetBaseUri", "org.jsoup.nodes.Element", "<sample:8>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "push", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:4>"}, false, 9, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "maybeSetBaseUri", "org.jsoup.nodes.Element", "<sample:8>"}, {"org.jsoup.parser.HtmlTreeBuilder", "newPendingTableCharacters", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getDocument", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "html", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "runParser", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "pushActiveFormattingElements", "org.jsoup.nodes.Element", "<sample:7>"}, {"org.jsoup.parser.HtmlTreeBuilder", "state", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "pop", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "get", new String[]{"java.lang.String"}, new String[]{"1.251.1234567890123456"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "putIgnoreCase", "java.lang.String,java.lang.String", "abc", "Title"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " abc=\"Title\" {isEmpty=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "get", new String[]{"java.lang.String"}, new String[]{"0xFbF1e10"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "putIgnoreCase", "java.lang.String,java.lang.String", "abc2020-01-01", "Title"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " abc2020-01-01=\"Title\" {isEmpty=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$CData", "isStartTag", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.parser.Token", "isCharacter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[]]>", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "get", new String[]{"java.lang.String"}, new String[]{"0FTTG1ee114"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "toString", ""}, {"org.jsoup.nodes.Attributes", "deduplicate", "org.jsoup.parser.ParseSettings", "<null>"}, {"org.jsoup.nodes.Attributes", "putIgnoreCase", "java.lang.String,java.lang.String", "abc2020-01-01", "Title"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " abc2020-01-01=\"Title\" {isEmpty=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "get", new String[]{"java.lang.String"}, new String[]{"0uFTSG11ee115nocri+ptTitleplaintext"}, false, 1, new String[][]{{"org.jsoup.nodes.Attributes", "toString", ""}, {"org.jsoup.nodes.Attributes", "deduplicate", "org.jsoup.parser.ParseSettings", "<sample:3>"}, {"org.jsoup.nodes.Attributes", "putIgnoreCase", "java.lang.String,java.lang.String", "abc2020-01-01", "Titl2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " abc2020-01-01=\"Titl2\" {isEmpty=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "get", new String[]{"java.lang.String"}, new String[]{"0uGTSG11ed115nocriAqtTitleplintex.Duplicate attribute"}, false, 1, new String[][]{{"org.jsoup.nodes.Attributes", "toString", ""}, {"org.jsoup.nodes.Attributes", "deduplicate", "org.jsoup.parser.ParseSettings", "<sample:7>"}, {"org.jsoup.nodes.Attributes", "putIgnoreCase", "java.lang.String,java.lang.String", "abc2020-011-01", "Titl2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " abc2020-011-01=\"Titl2\" {isEmpty=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "get", new String[]{"java.lang.String"}, new String[]{"0uGTSG11ed115nocriAqtTitleqlintex.Dup"}, false, 5, new String[][]{{"org.jsoup.nodes.Attributes", "toString", ""}, {"org.jsoup.nodes.Attributes", "deduplicate", "org.jsoup.parser.ParseSettings", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "get", new String[]{"java.lang.String"}, new String[]{"0uGTSG11ed115nohcriAqtTitleqlintex.Dup"}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "iterator", ""}, {"org.jsoup.nodes.Attributes", "toString", ""}, {"org.jsoup.nodes.Attributes", "deduplicate", "org.jsoup.parser.ParseSettings", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" {isEmpty=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "get", new String[]{"java.lang.String"}, new String[]{"-1.5"}, false, 4, new String[][]{{"org.jsoup.nodes.Attributes", "iterator", ""}, {"org.jsoup.nodes.Attributes", "removeIgnoreCase", "java.lang.String", "12:30:45"}, {"org.jsoup.nodes.Attributes", "deduplicate", "org.jsoup.parser.ParseSettings", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" {isEmpty=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$Comment"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inScope", new String[]{"java.lang.String[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "state", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insertOnStackAfter", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:3>", "<sample:2>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "pop", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "clearStackToTableRowContext", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "clearFormattingElementsToLastMarker", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "getIgnoreCase", new String[]{"java.lang.String"}, new String[]{"table"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "deduplicate", "org.jsoup.parser.ParseSettings", "<sample:5>"}, {"org.jsoup.nodes.Attributes", "normalize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insertStartTag", new String[]{"java.lang.String"}, new String[]{".5"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "inButtonScope", "java.lang.String", "0x1F"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "html", new String[]{}, new String[]{}, false, 8, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" #cdata=\"a\"", String.valueOf(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" {isEmpty=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processEndTag", new String[]{"java.lang.String"}, new String[]{"PT1H"}, false, 4, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "inScope", "java.lang.String,java.lang.String[]", "{\"a\":1}", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insertOnStackAfter", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:8>", "<sample:3>"}, false, 2, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "framesetOk", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "aboveOnStack", "org.jsoup.nodes.Element", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "iterator", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("receiver state after the call", " {isEmpty=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insertOnStackAfter", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:5>", "<sample:1>"}, false, 11, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "lastFormattingElement", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "setHeadElement", "org.jsoup.nodes.Element", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$Comment"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Comment", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$Comment"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Comment", "<sample:7>"}, {"org.jsoup.parser.XmlTreeBuilder", "initialiseParse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:3>", "a b", "<sample:7>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getActiveFormattingElement", new String[]{"java.lang.String"}, new String[]{"xmp"}, false, 5, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser", "plaintext", "<sample:6>", "\t", "<sample:4>"}, {"org.jsoup.parser.HtmlTreeBuilder", "setFormElement", "org.jsoup.nodes.FormElement", "<sample:3>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$CData", "isEndTag", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.Token", "isCharacter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[a]]>", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insertStartTag", new String[]{"java.lang.String"}, new String[]{"a"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "removeLastFormattingElement", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "clearStackToTableContext", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getActiveFormattingElement", new String[]{"java.lang.String"}, new String[]{""}, false, 10, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser", "plaintextnoframes", "<sample:6>", "\t", "<sample:4>"}, {"org.jsoup.parser.HtmlTreeBuilder", "resetInsertionMode", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "error", "org.jsoup.parser.HtmlTreeBuilderState", "<sample:4>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$Character"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$StartTag", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "equals", "java.lang.Object", "<sample:0>"}, {"org.jsoup.nodes.Attributes", "deduplicate", "org.jsoup.parser.ParseSettings", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" {isEmpty=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {isEmpty=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "aboveOnStack", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$CData", "asEndTag", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "processStartTag", new String[]{"java.lang.String", "org.jsoup.nodes.Attributes"}, new String[]{"html", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.ParseSettings", "org.jsoup.parser.ParseSettings", "normalizeAttribute", new String[]{"java.lang.String"}, new String[]{"1e10"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1e10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inListItemScope", new String[]{"java.lang.String"}, new String[]{"null"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getActiveFormattingElement", new String[]{"java.lang.String"}, new String[]{"e]"}, false, 3, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "replaceOnStack", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:3>", "<sample:4>"}, {"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser", "plaintextnoframes", "<sample:0>", "yabch", "<sample:0>"}, {"org.jsoup.parser.HtmlTreeBuilder", "initialiseParse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:2>", "1\ne10", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=null, state=Initial, currentElement=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.ParseSettings", "org.jsoup.parser.ParseSettings", "normalizeTag", new String[]{"java.lang.String"}, new String[]{"I"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("I", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$CData", "asDoctype", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "isSpecial", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "newPendingTableCharacters", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getActiveFormattingElement", new String[]{"java.lang.String"}, new String[]{"e]=\"scrD.ptPT1H"}, false, 4, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "getStack", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "replaceOnStack", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:3>", "<sample:4>"}, {"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser", "plaintextnoframes", "<sample:0>", "yaFbch", "<sample:0>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getActiveFormattingElement", new String[]{"java.lang.String"}, new String[]{"e]=\"scrD.ptPT1H"}, false, 4, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "getStack", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "replaceOnStack", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:3>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insertForm", new String[]{"org.jsoup.parser.Token$StartTag", "boolean"}, new String[]{"<sample:0>", "true"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$Doctype"}, new String[]{"<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getActiveFormattingElement", new String[]{"java.lang.String"}, new String[]{"222\n+1"}, false, 11, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "generateImpliedEndTags", "java.lang.String", "-0.0"}, {"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser", "plaintextnoframes", "<sample:3>", "noembed", "<sample:1>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "html", new String[]{"java.lang.Appendable", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:2>", "<sample:0>"}, false, 1, new String[][]{{"org.jsoup.nodes.Attributes", "put", "org.jsoup.nodes.Attribute", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " a=\"0\" {isEmpty=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.ParseSettings", "org.jsoup.parser.ParseSettings", "normalizeTag", new String[]{"java.lang.String"}, new String[]{"=\""}, false, 0, new String[][]{{"org.jsoup.parser.ParseSettings", "normalizeAttributes", "org.jsoup.nodes.Attributes", "<sample:2>"}, {"org.jsoup.parser.ParseSettings", "normalizeAttributes", "org.jsoup.nodes.Attributes", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("=\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "popStackToClose", new String[]{"java.lang.String"}, new String[]{"0x123456789"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "setFormElement", "org.jsoup.nodes.FormElement", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getActiveFormattingElement", new String[]{"java.lang.String"}, new String[]{"x pripthryff"}, false, 12, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "getPendingTableCharacters", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser", "0x123456789", "<sample:4>", "npemlbed", "<sample:5>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getActiveFormattingElement", new String[]{"java.lang.String"}, new String[]{"rqiipt"}, false, 1, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "markInsertionMode", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser", "0x123456789", "<sample:2>", "npemlbed", "<sample:6>"}, {"org.jsoup.parser.HtmlTreeBuilder", "replaceOnStack", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:5>", "<sample:4>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "asList", ""}, {"org.jsoup.nodes.Attributes", "add", "java.lang.String,java.lang.String", "rqiipt", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" rqiipt {isEmpty=false, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " rqiipt {isEmpty=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getActiveFormattingElement", new String[]{"java.lang.String"}, new String[]{"[[1,2W-11.5d"}, false, 15, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "markInsertionMode", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser", "0x123456789", "<sample:2>", "npemlbed", "<sample:6>"}, {"org.jsoup.parser.HtmlTreeBuilder", "push", "org.jsoup.nodes.Element", "<sample:0>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String"}, new String[]{"npemmbed"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getStack", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "insert", "org.jsoup.parser.Token$StartTag", "<sample:2>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "defaultSettings", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.ParseSettings", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "toString", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inScope", new String[]{"java.lang.String"}, new String[]{"Hell\n\t, AWorl1.5"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getFromStack", new String[]{"java.lang.String"}, new String[]{"e]= s+rrC.WXptPT\u00e92H"}, false, 5, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "markInsertionMode", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "error", new String[]{"java.lang.String"}, new String[]{"textarea"}, false, 1, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "inSelectScope", "java.lang.String", "Duplicate attribute"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Comment", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "onStack", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inSelectScope", new String[]{"java.lang.String"}, new String[]{"html"}, false, 1, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "originalState", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getActiveFormattingElement", new String[]{"java.lang.String"}, new String[]{"h"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser", "e]= s+rrC.WXptPT\u00e92H", "<null>", "npemmlbedtextarea2147483648", "<sample:7>"}, {"org.jsoup.parser.HtmlTreeBuilder", "isSpecial", "org.jsoup.nodes.Element", "<sample:5>"}, {"org.jsoup.parser.HtmlTreeBuilder", "clearStackToTableContext", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "addAll", new String[]{"org.jsoup.nodes.Attributes"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "hasKey", "java.lang.String", "010"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {isEmpty=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "framesetOk", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "insertOnStackAfter", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:0>", "<sample:1>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "isFragmentParsing", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "pushActiveFormattingElements", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<null>", "1.1234567890123456", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "markInsertionMode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "insertOnStackAfter", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:1>", "<sample:5>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insertInFosterParent", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "processStartTag", new String[]{"java.lang.String"}, new String[]{".5"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "processStartTag", "java.lang.String", "title"}, {"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Doctype", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"e]= s+rrC.WXptPT\u00e92H", "<sample:0>", "0x123456789", "<sample:8>"}, false);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[\ne]= s+rrC.WXptPT\u00e92H]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "isInActiveFormattingElements", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "aboveOnStack", "org.jsoup.nodes.Element", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "initialiseParse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:1>", "\n", "<null>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "getFormElement", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"data-", "1.12345678", "<sample:1>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "defaultSettings", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[\ndata-]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$StartTag"}, new String[]{"<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "clearStackToTableContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "runParser", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {isEmpty=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"org.jsoup.nodes.Attribute"}, new String[]{"<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "error", "org.jsoup.parser.HtmlTreeBuilderState", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "initialiseParse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:3>", "a,b,c", "<sample:6>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "inButtonScope", "java.lang.String", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=null, state=Initial, currentElement=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.ParseSettings", "org.jsoup.parser.ParseSettings", "normalizeTag", new String[]{"java.lang.String"}, new String[]{"x pripthryff"}, false, 1, new String[][]{{"org.jsoup.parser.ParseSettings", "normalizeAttribute", "java.lang.String", "222\n+1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("x pripthryff", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "deduplicate", new String[]{"org.jsoup.parser.ParseSettings"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getActiveFormattingElement", new String[]{"java.lang.String"}, new String[]{"uvH9"}, false, 9, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser", "1.5ftexxtareaabc", "<null>", "222\n+1href", "<sample:1>"}, {"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser", "j", "<sample:11>", "@", "<sample:7>"}, {"org.jsoup.parser.HtmlTreeBuilder", "clearStackToTableContext", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=null, state=Initial, currentElement=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<empty>", "2020-01-01", "<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body></body>\n</html> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$Comment"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "getHeadElement", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "setFosterInserts", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getActiveFormattingElement", new String[]{"java.lang.String"}, new String[]{"01fF1Pn112:51[789011434,5=u89021245778\r/1-25table1.5c3002947"}, false, 15, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser", "1.5ftexxtaeacc", "<null>", "222\n+1hrehpfP21H", "<sample:3>"}, {"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser", "`bc", "<sample:8>", "@", "<sample:6>"}, {"org.jsoup.parser.HtmlTreeBuilder", "processEndTag", "java.lang.String", "0x123X456789"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=</0x123X456789>, state=InBody, currentElement=<html>\n `bc\n</html>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "initialiseParse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<empty>", "1", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$Character"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "getFromStack", "java.lang.String", "010"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "clearStackToTableRowContext", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "size", ""}}), new String[][]{{"putIfAbsent", "java.lang.Object,java.lang.Object", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "hasKey", new String[]{"java.lang.String"}, new String[]{"xmp"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "iterator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "indexOfKey", new String[]{"java.lang.String"}, new String[]{"Hell\t, World"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "runParser", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:2>", "tbody", "<sample:5>"}, {"org.jsoup.parser.XmlTreeBuilder", "processStartTag", "java.lang.String", "222\n+1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getPendingTableCharacters", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "insert", "org.jsoup.parser.Token$Comment", "<sample:3>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$CData", "isStartTag", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[a]]>", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:2>", "data-", "<sample:5>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "setFormElement", "org.jsoup.nodes.FormElement", "<sample:1>"}}), new String[][]{{"getElementsContainingText", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "addAll", new String[]{"org.jsoup.nodes.Attributes"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "hashCode", ""}, {"org.jsoup.nodes.Attributes", "getIgnoreCase", "java.lang.String", ".5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {isEmpty=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "processEndTag", new String[]{"java.lang.String"}, new String[]{"12:30:45"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$CData", "asStartTag", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "error", new String[]{"java.lang.String"}, new String[]{"script"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$StartTag", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$CData", "isCData", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.Token", "reset", ""}, {"org.jsoup.parser.Token", "asStartTag", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[null]]>", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "error", new String[]{"java.lang.String"}, new String[]{"PT1H"}, false, 3, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:1>", "null", "<sample:1>"}, {"org.jsoup.parser.XmlTreeBuilder", "defaultSettings", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "lastFormattingElement", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$CData", "isComment", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[a]]>", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"table", "222\n+1href"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("table {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "error", new String[]{"org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:6>"}, false, 7, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "removeFromActiveFormattingElements", "org.jsoup.nodes.Element", "<sample:1>"}, {"org.jsoup.parser.HtmlTreeBuilder", "currentElement", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.ParseSettings", "org.jsoup.parser.ParseSettings", "preserveTagCase", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.ParseSettings", "preserveAttributeCase", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getBaseUri", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "hasKeyIgnoreCase", new String[]{"java.lang.String"}, new String[]{"Ttextarea"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$CData", "isCharacter", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[a]]>", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "removeFromStack", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "insert", "org.jsoup.parser.Token$Character", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.ParseSettings", "org.jsoup.parser.ParseSettings", "normalizeTag", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}"}, false, 0, new String[][]{{"org.jsoup.parser.ParseSettings", "preserveTagCase", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":1}", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"template", "<sample:5>", "0x123456789", "<sample:0>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "setHeadElement", "org.jsoup.nodes.Element", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[\ntemplate]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "isFosterInserts", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.25", "npemlbed"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("1.25 {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "originalState", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "asList", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "equals", "java.lang.Object", "<i:2>"}, {"org.jsoup.nodes.Attributes", "clone", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {isEmpty=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "initialiseParse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:0>", "1.5ftexxtareaabc", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:4>", "<sample:0>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "insert", "org.jsoup.parser.Token$StartTag", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$Doctype"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "initialiseParse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:3>", "\t", "<sample:4>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "replaceActiveFormattingElement", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<null>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String"}, new String[]{"<empty>", "npembed"}, false, 7, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$StartTag", "<sample:3>"}, {"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Character", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals(" {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "normalize", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {isEmpty=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inTableScope", new String[]{"java.lang.String"}, new String[]{"rqiipt"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "initialiseParse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:3>", "2020-02-30T25:61:61", "<sample:3>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "maybeSetBaseUri", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:2>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inButtonScope", new String[]{"java.lang.String"}, new String[]{"tfoot"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "dataset", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Attributes", "clone", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " #cdata=\"a\" {isEmpty=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.ParseSettings", "org.jsoup.parser.ParseSettings", "normalizeAttribute", new String[]{"java.lang.String"}, new String[]{"iframe"}, false, 0, new String[][]{{"org.jsoup.parser.ParseSettings", "preserveTagCase", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("iframe", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "currentElement", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "initialiseParse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<null>", "1.5d", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "popStackToBefore", new String[]{"java.lang.String"}, new String[]{"1.1234567"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getFormElement", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "setHeadElement", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:7>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$CData", "isDoctype", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[a]]>", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "runParser", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Character", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.ParseSettings", "org.jsoup.parser.ParseSettings", "preserveAttributeCase", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.parser.ParseSettings", "normalizeAttributes", "org.jsoup.nodes.Attributes", "<sample:1>"}, {"org.jsoup.parser.ParseSettings", "normalizeAttribute", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "remove", new String[]{"java.lang.String"}, new String[]{"-0.0"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "equals", "java.lang.Object", "<s:>"}, {"org.jsoup.nodes.Attributes", "add", "java.lang.String,java.lang.String", "1.1234567890123456", "`b"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " 1.1234567890123456=\"`b\" {isEmpty=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.XmlTreeBuilder", "org.jsoup.parser.XmlTreeBuilder", "parseFragment", new String[]{"java.lang.String", "org.jsoup.nodes.Element", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"1.1234567", "<sample:11>", "i@", "<sample:2>"}, false, 0, new String[][]{{"org.jsoup.parser.XmlTreeBuilder", "insert", "org.jsoup.parser.Token$Doctype", "<sample:0>"}, {"org.jsoup.parser.XmlTreeBuilder", "processStartTag", "java.lang.String", "-1"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[\n1.1234567]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$CData", "isCData", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.parser.Token", "asComment", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[a]]>", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "isEmpty", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "isSpecial", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:11>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "state", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.ParseSettings", "org.jsoup.parser.ParseSettings", "normalizeTag", new String[]{"java.lang.String"}, new String[]{"222\n+1"}, false, 0, new String[][]{{"org.jsoup.parser.ParseSettings", "preserveAttributeCase", ""}, {"org.jsoup.parser.ParseSettings", "normalizeTag", "java.lang.String", "0A12456789"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("222\n+1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.ParseSettings", "org.jsoup.parser.ParseSettings", "preserveTagCase", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.parser.ParseSettings", "normalizeAttributes", "org.jsoup.nodes.Attributes", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"--1", "[[1,2W-11.5d"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "dataset", ""}, {"org.jsoup.nodes.Attributes", "getIgnoreCase", "java.lang.String", "abc"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" --1=\"[[1,2W-11.5d\" {isEmpty=false, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " --1=\"[[1,2W-11.5d\" {isEmpty=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "remove", new String[]{"java.lang.String"}, new String[]{"textarea"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", " {isEmpty=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$CData", "asComment", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.Token", "tokenType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Token", "org.jsoup.parser.Token$CData", "tokenType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("CData", String.valueOf(actual));
  assertEquals("receiver state after the call", "<![CDATA[a]]>", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "removeFromActiveFormattingElements", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getHeadElement", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "getActiveFormattingElement", "java.lang.String", "abc"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "size", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "put", "java.lang.String,java.lang.String", "222\n+1href", "`c"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", " 222\n+1href=\"`c\" {isEmpty=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "clone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("32", String.valueOf(actual));
  assertEquals("receiver state after the call", " {isEmpty=true, size=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Attributes", "org.jsoup.nodes.Attributes", "put", new String[]{"java.lang.String", "boolean"}, new String[]{"+1", "false"}, false, 0, new String[][]{{"org.jsoup.nodes.Attributes", "hashCode", ""}}), new String[][]{{"put", "java.lang.String,java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes", actual.getClass().getName());
  assertEquals(" a=\"0\" {isEmpty=false, size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " a=\"0\" {isEmpty=false, size=1}", SearchInputFactory_scaffolding.receiverState());
 }
}
