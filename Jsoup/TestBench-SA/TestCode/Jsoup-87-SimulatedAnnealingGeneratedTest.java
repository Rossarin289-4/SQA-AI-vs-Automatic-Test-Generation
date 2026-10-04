package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "val", new String[]{"java.lang.String"}, new String[]{".5"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "getAllElements", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a value=\".5\"></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a value=\".5\"></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValue", "java.lang.String,java.lang.String", "1", "1e10"}, {"org.jsoup.nodes.Element", "after", "java.lang.String", "u010\u00e9"}}, 1), new String[][]{{"attr", "java.lang.String,boolean", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getBaseUri", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValueStarting", "java.lang.String,java.lang.String", "0", "Hello, World"}, {"org.jsoup.nodes.Element", "getElementsContainingText", "java.lang.String", "0x1Eifram"}, {"org.jsoup.nodes.Element", "getElementsByAttributeValue", "java.lang.String,java.lang.String", "\u00ea", "0x123456789"}}, 2), new String[][]{{"classNames", "java.util.Set", "6"}, {"dataset", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a class=\"0\"></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.jsoup.nodes.Element", "appendElement", "java.lang.String", "I"}, {"org.jsoup.nodes.Element", "attr", "java.lang.String", "J"}, {"org.jsoup.nodes.Element", "append", "java.lang.String", " >!"}}, 3), new String[][]{{"classNames", "java.util.Set", "3"}, {"getElementsByClass", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a class=\"sample\"><i></i> &gt;!</a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.jsoup.nodes.Element", "attr", "java.lang.String", "2020-02-30T25:61:61"}, {"org.jsoup.nodes.Element", "append", "java.lang.String", "-1;.5"}}), new String[][]{{"classNames", "java.util.Set", "6"}, {"getElementsByClass", "java.lang.String", "1"}, {"addAll", "int,java.util.Collection", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.jsoup.nodes.Element", "insertChildren", "int,org.jsoup.nodes.Node[]", "-2147483648", "<sample:2>"}, {"org.jsoup.nodes.Element", "getElementsByAttributeValueEnding", "java.lang.String,java.lang.String", "1.12345678901234567", " > "}}), new String[][]{{"getElementsMatchingOwnText", "java.util.regex.Pattern", "3"}, {"parents", "", "0"}, {"prev", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<sample></sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "setHeadElement", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:3>", " > ", "<sample:6>"}, {"org.jsoup.parser.HtmlTreeBuilder", "clearStackToTableContext", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "childNode", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "insertChildren", "int,java.util.Collection", "10", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nextElementSiblings", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "addChildren", "int,org.jsoup.nodes.Node[]", "2147483647", "<sample:2>"}, {"org.jsoup.nodes.Element", "equals", "java.lang.Object", "<s:b>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inListItemScope", new String[]{"java.lang.String"}, new String[]{"\u00e9"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilderState", "<sample:0>", "<sample:2>"}, {"org.jsoup.parser.HtmlTreeBuilder", "inScope", "java.lang.String,java.lang.String[]", "1.5e300", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "selectFirst", new String[]{"java.lang.String"}, new String[]{"noframes"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "getElementsMatchingText", "java.lang.String", "iframe"}, {"org.jsoup.nodes.Element", "getElementsByAttribute", "java.lang.String", "TITLE"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tag", "org.jsoup.parser.Tag", "isKnownTag", new String[]{"java.lang.String"}, new String[]{"0x123456789"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tag", "org.jsoup.parser.Tag", "isFormListed", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.Tag", "equals", "java.lang.Object", "<s:b>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {canContainBlock=false, getName=null, isBlock=false, isData=true, isEmpty=false, isFormListed=false, isFormSubmittable=false, isInline=true, isKnownTag=false, isSelfClosing=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.jsoup.nodes.Element", "prependElement", "java.lang.String", "aaaaaaaaaaaaaaEaaaaaaaaaaaaaaaa"}, {"org.jsoup.nodes.Element", "tagName", "java.lang.String", "5."}, {"org.jsoup.nodes.Element", "getElementsMatchingOwnText", "java.util.regex.Pattern", "<empty>"}}, 1), new String[][]{{"clone", "", "6"}, {"data", "", "6"}, {"addClass", "java.lang.String", "6"}, {"cssSelector", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5..0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<5.>\n <aaaaaaaaaaaaaaeaaaaaaaaaaaaaaaa></aaaaaaaaaaaaaaeaaaaaaaaaaaaaaaa>\n</5.> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.jsoup.nodes.Element", "prependElement", "java.lang.String", "1.25ox1235r6789"}, {"org.jsoup.nodes.Element", "getElementsByIndexGreaterThan", "int", "10"}, {"org.jsoup.nodes.Element", "prepend", "java.lang.String", "2020-01-01."}}, 3), new String[][]{{"hasClass", "java.lang.String", "1"}, {"data", "", "2"}, {"attr", "java.lang.String", "6"}, {"cssSelector", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "<sample>\n 2020-01-01.\n <1.25ox1235r6789></1.25ox1235r6789>\n</sample> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.jsoup.nodes.Element", "prependElement", "java.lang.String", "br"}, {"org.jsoup.nodes.Element", "getElementsByIndexGreaterThan", "int", "-1"}, {"org.jsoup.nodes.Element", "prepend", "java.lang.String", "/9xs-0.0"}}), new String[][]{{"hasClass", "java.lang.String", "1"}, {"data", "", "7"}, {"getElementsMatchingOwnText", "java.lang.String", "2"}, {"hasText", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<sample>\n /9xs-0.0\n <br>\n</sample> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.jsoup.nodes.Element", "unwrap", ""}, {"org.jsoup.nodes.Element", "prepend", "java.lang.String", "123o668:90"}, {"org.jsoup.nodes.Element", "hasParent", ""}}), new String[][]{{"hasClass", "java.lang.String", "1"}, {"data", "", "4"}, {"getElementsByIndexLessThan", "int", "3"}, {"tagName", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<sample>\n 123o668:90\n</sample> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tag", "org.jsoup.parser.Tag", "valueOf", new String[]{"java.lang.String", "org.jsoup.parser.ParseSettings"}, new String[]{"br", "<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("org.jsoup.parser.Tag", actual.getClass().getName());
  assertEquals("br {canContainBlock=false, getName=br, isBlock=false, isData=false, isEmpty=true, isFormListed=false, isFormSubmittable=false, isInline=true, isKnownTag=true, isSelfClosing=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "siblingIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "is", "java.lang.String", "0x1F"}, {"org.jsoup.nodes.Element", "prependText", "java.lang.String", "Title"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a>Title</a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "insertChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"0", "<sample:1>"}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValueMatching", "java.lang.String,java.lang.String", "1.250x1235r6789", "Pattern syotax erqor: "}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<x \t y>a\n <#root></#root>\n</x \t y> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y>a\n <#root></#root>\n</x \t y> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$StartTag"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "setFosterInserts", "boolean", "true"}, {"org.jsoup.parser.HtmlTreeBuilder", "popStackToBefore", "java.lang.String", ",1.5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "maybeSetBaseUri", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "getHeadElement", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.jsoup.nodes.Element", "getElementById", "java.lang.String", "0"}, {"org.jsoup.nodes.Element", "text", "java.lang.String", ""}, {"org.jsoup.nodes.Element", "getElementsContainingText", "java.lang.String", "c"}}, 2), new String[][]{{"dataNodes", "", "7"}, {"indexOf", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "<sample>\n</sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tag", "org.jsoup.parser.Tag", "getName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.Tag", "setSelfClosing", ""}, {"org.jsoup.parser.Tag", "isEmpty", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "null {canContainBlock=false, getName=null, isBlock=false, isData=true, isEmpty=false, isFormListed=false, isFormSubmittable=false, isInline=true, isKnownTag=false, isSelfClosing=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "preserveWhitespace", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "outerHtml", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "getElementsByIndexEquals", "int", "2147483647"}, {"org.jsoup.nodes.Element", "shallowClone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<{\"a\":1} #cdata=\"a\"></{\"a\":1}>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} #cdata=\"a\"></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "childNodesCopy", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Element", "appendElement", "java.lang.String", "1.12s345678"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[<1.12s345678></1.12s345678>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a>\n <1.12s345678></1.12s345678></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:2>", "1", "<sample:6>"}, false, 10, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser", "0x1Eifram", "<sample:0>", "http://example.com/a?b=c", "<sample:3>"}, {"org.jsoup.parser.HtmlTreeBuilder", "isInActiveFormattingElements", "org.jsoup.nodes.Element", "<sample:6>"}, {"org.jsoup.parser.HtmlTreeBuilder", "replaceOnStack", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:4>", "<sample:3>"}}, 3), new String[][]{{"append", "java.lang.String", "7"}, {"getElementsMatchingOwnText", "java.lang.String", "1"}, {"next", "java.lang.String", "3"}, {"select", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "html", new String[]{"java.lang.String"}, new String[]{"\n"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "insertChildren", "int,org.jsoup.nodes.Node[]", "2147483647", "<sample:0>"}, {"org.jsoup.nodes.Element", "setSiblingIndex", "int", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a> </a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a> </a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:6>", "ht", "<sample:7>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "initialiseParse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:1>", "1.12345678", "<sample:6>"}, {"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token", "<sample:5>"}, {"org.jsoup.parser.HtmlTreeBuilder", "generateImpliedEndTags", "java.lang.String", "Patttern sTotax erqor: "}}), new String[][]{{"charset", "java.nio.charset.Charset", "1"}, {"getElementById", "java.lang.String", "5"}, {"getElementsByAttributeValueNot", "java.lang.String,java.lang.String", "6"}, {"removeClass", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<html>\n <head>\n  <meta charset=\"UTF-8\">\n </head>\n <body>\n  <a><b>t</b></a>\n </body>\n</html>, <html>\n <head>\n  <meta charset=\"UTF-8\">\n </head>\n <body>\n  <a><b>t</b></a>\n </body>\n</html>, <head>\n <meta...#310#-1907864505", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:6>", "Paute_rn szotw er{qor: TiLtleTitle", "<sample:12>"}, false, 8, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "lastFormattingElement", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "initialiseParse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:1>", "1", "<sample:7>"}, {"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token", "<sample:10>"}}), new String[][]{{"clone", "", "4"}, {"getElementsMatchingOwnText", "java.util.regex.Pattern", "0"}, {"html", "java.lang.String", "1"}, {"eachText", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, a, a, a, a, a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:6>", "Paute^rn szotx er{q or: Tistyle", "<sample:1>"}, false, 7, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "initialiseParse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:1>", "1", "<sample:9>"}, {"org.jsoup.parser.HtmlTreeBuilder", "insertInFosterParent", "org.jsoup.nodes.Node", "<sample:1>"}, {"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token", "<sample:9>"}}, 1), new String[][]{{"appendChild", "org.jsoup.nodes.Node", "4"}, {"getElementsMatchingOwnText", "java.util.regex.Pattern", "0"}, {"html", "java.lang.String", "1"}, {"next", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:6>", "0xFFFFFFFF", "<sample:12>"}, false, 7, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "replaceActiveFormattingElement", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:6>", "<sample:6>"}, {"org.jsoup.parser.HtmlTreeBuilder", "initialiseParse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:6>", "-10xFFFFFFFF", "<sample:12>"}, {"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token", "<sample:10>"}}), new String[][]{{"appendTo", "org.jsoup.nodes.Element", "4"}, {"getElementsMatchingOwnText", "java.util.regex.Pattern", "3"}, {"html", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[, <html>\n <head></head>\n <body></body>\n</html>, <head></head>, <body></body>, <a></a>, <b></b>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueMatching", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-0.0", "+1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:6>", "1e105.", "<sample:12>"}, false, 3, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "initialiseParse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<empty>", "Pattern synax eror: ", "<sample:6>"}, {"org.jsoup.parser.HtmlTreeBuilder", "clearStackToTableRowContext", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token", "<sample:12>"}}), new String[][]{{"attr", "java.lang.String,boolean", "4"}, {"getElementsMatchingOwnText", "java.util.regex.Pattern", "0"}, {"prev", "java.lang.String", "2"}, {"tagName", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "textNodes", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Element", "val", ""}, {"org.jsoup.nodes.Element", "appendText", "java.lang.String", "#root"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[#root]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a>#root</a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "clearAttributes", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Element", "prependChild", "org.jsoup.nodes.Node", "<sample:1>"}, {"org.jsoup.nodes.Element", "id", ""}}), new String[][]{{"getElementsMatchingText", "java.util.regex.Pattern", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<sample>\n <!--a-->\n</sample>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<sample>\n <!--a-->\n</sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "doSetBaseUri", new String[]{"java.lang.String"}, new String[]{"value"}, false, 2, new String[][]{{"org.jsoup.nodes.Element", "attributes", ""}, {"org.jsoup.nodes.Element", "siblingElements", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<sample></sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:3>", "1TUt", "<sample:9>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:2>", "/a/b", "<sample:6>"}, {"org.jsoup.parser.HtmlTreeBuilder", "insertMarkerToFormattingElements", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  a b \n </body>\n</html> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getFormElement", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "setFormElement", "org.jsoup.nodes.FormElement", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.FormElement", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "append", new String[]{"java.lang.String"}, new String[]{"Paute^rn szotx er{q or: Tistxlestyle"}, false, 2, new String[][]{{"org.jsoup.nodes.Element", "lastElementSibling", ""}, {"org.jsoup.nodes.Element", "getElementsByAttributeValueContaining", "java.lang.String,java.lang.String", "Title", "15"}, {"org.jsoup.nodes.Element", "previousElementSiblings", ""}}, 2), new String[][]{{"getElementsMatchingText", "java.util.regex.Pattern", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<sample>\n Paute^rn szotx er{q or: Tistxlestyle\n</sample>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<sample>\n Paute^rn szotx er{q or: Tistxlestyle\n</sample> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingText", new String[]{"java.lang.String"}, new String[]{"1F-(5"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tag", "org.jsoup.parser.Tag", "formatAsBlock", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.parser.Tag", "isSelfClosing", ""}, {"org.jsoup.parser.Tag", "hashCode", ""}, {"org.jsoup.parser.Tag", "isBlock", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\"a\":1} {canContainBlock=false, getName={\"a\":1}, isBlock=false, isData=false, isEmpty=false, isFormListed=false, isFormSubmittable=false, isInline=true, isKnownTag=false, isSelfClosing=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingOwnText", new String[]{"java.lang.String"}, new String[]{"1F-(5"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "traverse", "org.jsoup.select.NodeVisitor", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.jsoup.nodes.Element", "html", "java.lang.String", "\u00e9"}}, 1), new String[][]{{"appendTo", "org.jsoup.nodes.Element", "0"}, {"before", "java.lang.String", "6"}, {"childNodes", "", "6"}, {"removeAll", "java.util.Collection", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.jsoup.nodes.Element", "prependElement", "java.lang.String", "bbaaaa"}, {"org.jsoup.nodes.Element", "prepend", "java.lang.String", "null\\s+2020-02-30T25:61:51"}, {"org.jsoup.nodes.Element", "dataNodes", ""}}), new String[][]{{"getElementsContainingText", "java.lang.String", "1"}, {"html", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a>null\\s+2020-02-30T25:61:51\n <bbaaaa></bbaaaa></a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inTableScope", new String[]{"java.lang.String"}, new String[]{"123o66+8:901"}, false, 6, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "initialiseParse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<empty>", "123456789012345678901234567890", "<sample:5>"}, {"org.jsoup.parser.HtmlTreeBuilder", "setHeadElement", "org.jsoup.nodes.Element", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=null, state=Initial, currentElement=null}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.jsoup.nodes.Element", "prependElement", "java.lang.String", "a,b+bc"}, {"org.jsoup.nodes.Element", "insertChildren", "int,java.util.Collection", "1", "<empty>"}, {"org.jsoup.nodes.Element", "dataNodes", ""}}, 3), new String[][]{{"data", "", "6"}, {"cssSelector", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a>\n <a,b+bc></a,b+bc></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.jsoup.nodes.Element", "prependElement", "java.lang.String", "^5"}, {"org.jsoup.nodes.Element", "insertChildren", "int,java.util.Collection", "-65", "<sample:2>"}, {"org.jsoup.nodes.Element", "dataNodes", ""}}, 1), new String[][]{{"data", "", "7"}, {"elementSiblingIndex", "", "6"}, {"appendElement", "java.lang.String", "6"}, {"before", "org.jsoup.nodes.Node", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<0></0> {hasParent=true, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a>\n <^5></^5>\n <#root></#root>\n <0></0></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "childNodesAsArray", new String[]{}, new String[]{}, false, 26, new String[][]{{"org.jsoup.nodes.Element", "appendTo", "org.jsoup.nodes.Element", "<sample:6>"}, {"org.jsoup.nodes.Element", "cssSelector", ""}});
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<sample></sample> {hasParent=true, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "childNodesAsArray", new String[]{}, new String[]{}, false, 28, new String[][]{{"org.jsoup.nodes.Element", "appendTo", "org.jsoup.nodes.Element", "<sample:2>"}, {"org.jsoup.nodes.Element", "firstElementSibling", ""}, {"org.jsoup.nodes.Element", "val", "java.lang.String", "0"}}, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a value=\"0\"></a> {hasParent=true, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "cssSelector", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.jsoup.nodes.Element", "setParentNode", "org.jsoup.nodes.Node", "<sample:3>"}, {"org.jsoup.nodes.Element", "siblingNodes", ""}, {"org.jsoup.nodes.Element", "hasText", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "<sample></sample> {hasParent=true, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:10>", "=1.5", "<sample:7>"}, false, 12, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser", "<a>b</a>0xFFFFFFFF", "<sample:3>", "trvf", "<sample:3>"}, {"org.jsoup.parser.HtmlTreeBuilder", "insertInFosterParent", "org.jsoup.nodes.Node", "<sample:2>"}, {"org.jsoup.parser.HtmlTreeBuilder", "popStackToClose", "java.lang.String[]", "<sample:7>"}}, 2), new String[][]{{"classNames", "java.util.Set", "6"}, {"childNodeSize", "", "1"}, {"before", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:2>", ".", "<sample:1>"}, false, 10, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser", "<a?b</a>", "<sample:3>", "trv", "<sample:7>"}, {"org.jsoup.parser.HtmlTreeBuilder", "resetInsertionMode", ""}}, 2), new String[][]{{"classNames", "java.util.Set", "6"}, {"data", "", "1"}, {"clone", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Document", actual.getClass().getName());
  assertEquals("<html>\n <head></head>\n <body>\n  a b\n </body>\n</html> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:10>", "1F-(5", "<sample:13>"}, false, 7, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser", "<a?b</a>", "<sample:6>", "<T>b</a>00yFFFFFFG", "<sample:6>"}, {"org.jsoup.parser.HtmlTreeBuilder", "generateImpliedEndTags", "java.lang.String", "1F-(5"}, {"org.jsoup.parser.HtmlTreeBuilder", "aboveOnStack", "org.jsoup.nodes.Element", "<sample:2>"}}, 1), new String[][]{{"clearAttributes", "", "4"}, {"getElementsByAttributeValueMatching", "java.lang.String,java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:2>", "(0", "<sample:15>"}, false, 1, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser", "<a?b</a>", "<sample:2>", "<S>4</a>00yFFFFFFG", "<sample:6>"}, {"org.jsoup.parser.HtmlTreeBuilder", "removeFromStack", "org.jsoup.nodes.Element", "<sample:0>"}, {"org.jsoup.parser.HtmlTreeBuilder", "state", ""}}, 1), new String[][]{{"getElementsByAttributeValueMatching", "java.lang.String,java.lang.String", "6"}, {"after", "java.lang.String", "5"}, {"hasAttr", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:6>", "1.250x1235r6789", "<sample:7>"}, false, 4, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "lastFormattingElement", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser", "/?b</a>1.122457789", "<sample:5>", "<S>4</Da>03yFFEFFFGciitlebr", "<sample:5>"}, {"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilderState", "<sample:0>", "<sample:2>"}}, 2), new String[][]{{"getElementsContainingOwnText", "java.lang.String", "3"}, {"after", "java.lang.String", "3"}, {"add", "java.lang.Object", "0"}, {"addAll", "java.util.Collection", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:6>", "1.250x1235r6789", "<sample:7>"}, false, 4, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "lastFormattingElement", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser", "/?b</a>1.122457789", "<sample:5>", "<S>4</Da>03yFFEFFFGciitlebr", "<sample:5>"}, {"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilderState", "<sample:2>", "<sample:2>"}}, 2), new String[][]{{"getElementsContainingOwnText", "java.lang.String", "3"}, {"after", "java.lang.String", "3"}, {"add", "java.lang.Object", "0"}, {"addAll", "java.util.Collection", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:6>", "-", "<sample:13>"}, false, 15, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser", "/?b</a>1.122457789", "<sample:3>", "<S>4</Da>03yFFEFFFGciitle", "<sample:5>"}, {"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token", "<sample:12>"}, {"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilderState", "<sample:0>", "<sample:4>"}}), new String[][]{{"getElementsContainingOwnText", "java.lang.String", "3"}, {"containsAll", "java.util.Collection", "4"}, {"add", "java.lang.Object", "0"}, {"last", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:6>", "2020t-2011011L", "<sample:7>"}, false, 12, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser", "/?b</a>1.122457789", "<null>", "\t", "<sample:6>"}, {"org.jsoup.parser.HtmlTreeBuilder", "currentElement", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilderState", "<sample:3>", "<sample:4>"}}, 1), new String[][]{{"getElementsByAttributeValue", "java.lang.String,java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:6>", "2020t-20i11011L", "<sample:6>"}, false, 8, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser", "/?b</a>1.122457789", "<sample:5>", "\t", "<sample:2>"}, {"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilderState", "<sample:0>", "<sample:7>"}}), new String[][]{{"getElementsByAttributeValue", "java.lang.String,java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:6>", "-1E-5", "<sample:1>"}, false, 9, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser", "=1.5", "<sample:5>", "\tid", "<sample:2>"}, {"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilderState", "<sample:2>", "<sample:4>"}, {"org.jsoup.parser.HtmlTreeBuilder", "isFosterInserts", ""}}), new String[][]{{"getElementsByAttributeValue", "java.lang.String,java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:6>", "-1E-5", "<sample:1>"}, false, 9, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser", "=1.5", "<sample:5>", "\tid", "<sample:2>"}, {"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilderState", "<sample:1>", "<sample:4>"}, {"org.jsoup.parser.HtmlTreeBuilder", "isFosterInserts", ""}}), new String[][]{{"getElementsByAttributeValue", "java.lang.String,java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:6>", "urf", "<sample:8>"}, false, 12, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser", "=1.5", "<sample:5>", "\tie", "<sample:2>"}, {"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilderState", "<sample:0>", "<sample:5>"}, {"org.jsoup.parser.HtmlTreeBuilder", "isFosterInserts", ""}}, 3), new String[][]{{"getElementsByTag", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:6>", "1.12345678", "<sample:8>"}, false, 15, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser", "<S>4</a>00yFFFAFFFG", "<null>", "1.25ox1235r6789", "<sample:12>"}, {"org.jsoup.parser.HtmlTreeBuilder", "inListItemScope", "java.lang.String", "!textarea"}, {"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilderState", "<sample:0>", "<sample:5>"}}), new String[][]{{"clone", "", "0"}, {"getElementsByTag", "java.lang.String", "1"}, {"html", "java.lang.String", "4"}, {"prevAll", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:6>", "atiten syntax2!erqn:!", "<sample:12>"}, false, 15, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser", "<S>4</a>00yFFFAFFFG", "<sample:0>", "1.25ox1235r5789", "<sample:12>"}, {"org.jsoup.parser.HtmlTreeBuilder", "inListItemScope", "java.lang.String", "!textarea0xFFFFFFFF"}, {"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilderState", "<sample:0>", "<sample:5>"}}, 2), new String[][]{{"clone", "", "7"}, {"getElementsByTag", "java.lang.String", "1"}, {"html", "java.lang.String", "6"}, {"prevAll", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:6>", "20(0t-0i1\nb011L", "<sample:12>"}, false, 8, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser", "<S>4</a>00yFFFAFFFFG", "<sample:5>", "1.25ox1335r5789", "<sample:12>"}, {"org.jsoup.parser.HtmlTreeBuilder", "inListItemScope", "java.lang.String", "He"}, {"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilderState", "<sample:0>", "<sample:8>"}}, 1), new String[][]{{"clone", "", "7"}, {"getElementsByTag", "java.lang.String", "1"}, {"after", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<a><b>t</b></a>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "parse", new String[]{"java.io.Reader", "java.lang.String", "org.jsoup.parser.Parser"}, new String[]{"<sample:6>", "Hello, World", "<sample:1>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parseFragment", "java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser", "<S>4</a>00yFFFAFFFFG", "<sample:5>", "1.225ox1335r", "<sample:12>"}, {"org.jsoup.parser.HtmlTreeBuilder", "inListItemScope", "java.lang.String", "IHHd"}, {"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilderState", "<sample:12>", "<sample:8>"}}, 1), new String[][]{{"clone", "", "7"}, {"getElementsByTag", "java.lang.String", "1"}, {"after", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<a><b>t</b></a>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insertOnStackAfter", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:7>", "<sample:2>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "initialiseParse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:2>", "m0.X25+1", "<sample:0>"}, {"org.jsoup.parser.HtmlTreeBuilder", "push", "org.jsoup.nodes.Element", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:5>", "<sample:5>"}, false, 1, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "popStackToClose", "java.lang.String", "c"}, {"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:6>", "ullabc", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:13>", "<sample:9>"}, false, 14, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "popStackToClose", "java.lang.String", "cHello, World"}, {"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:6>", "ullabc", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:13>", "<sample:8>"}, false, 14, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "reconstructFormattingElements", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:6>", "ullabc", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:16>", "<sample:6>"}, false, 14, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "reconstructFormattingElements", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "process", "org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilderState", "<sample:3>", "<sample:7>"}, {"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:6>", "ullabc", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<!---->, state=InBody, currentElement=<body>\n <a><b>t</b></a>\n <!---->\n</body>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:3>", "<sample:3>"}, false, 14, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:6>", "ullabc", "<sample:5>"}, {"org.jsoup.parser.HtmlTreeBuilder", "reconstructFormattingElements", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:12>", "<sample:2>"}, false, 15, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "processStartTag", "java.lang.String", "!textarea0xFFFFFFFF"}, {"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:6>", "ullabc", "<sample:5>"}, {"org.jsoup.parser.HtmlTreeBuilder", "reconstructFormattingElements", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:2>", "<sample:8>"}, false, 15, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "isFragmentParsing", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:6>", "ullabc", "<sample:5>"}, {"org.jsoup.parser.HtmlTreeBuilder", "reconstructFormattingElements", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<!---->, state=InBody, currentElement=<body>\n <a><b>t</b></a>\n <!---->\n</body>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:3>", "<sample:8>"}, false, 15, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "isFragmentParsing", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:6>", "ullabc", "<sample:5>"}, {"org.jsoup.parser.HtmlTreeBuilder", "reconstructFormattingElements", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:3>", "<sample:5>"}, false, 5, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "isFragmentParsing", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:6>", "ullabc", "<sample:12>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:8>", "<sample:1>"}, false, 4, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:6>", "ullabc", "<sample:14>"}, {"org.jsoup.parser.HtmlTreeBuilder", "processEndTag", "java.lang.String", "1.5"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=null, state=InBody, currentElement=<body>\n <a><b>t</b></a>\n</body>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:7>", "<sample:10>"}, false, 3, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:6>", "ullabctextarea", "<sample:15>"}, {"org.jsoup.parser.HtmlTreeBuilder", "processEndTag", "java.lang.String", "1.5"}, {"org.jsoup.parser.HtmlTreeBuilder", "removeLastFormattingElement", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<![CDATA[0]]>, state=InBody, currentElement=<body>\n <a><b>t</b></a><![CDATA[0]]>\n</body>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:13>", "<sample:11>"}, false, 3, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "isSpecial", "org.jsoup.nodes.Element", "<sample:7>"}, {"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:6>", "ullabctextarea", "<sample:15>"}, {"org.jsoup.parser.HtmlTreeBuilder", "processEndTag", "java.lang.String", "1.5"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:6>", "<sample:10>"}, false, 3, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "isSpecial", "org.jsoup.nodes.Element", "<sample:7>"}, {"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:6>", "ullabctextarea", "<sample:15>"}, {"org.jsoup.parser.HtmlTreeBuilder", "processEndTag", "java.lang.String", "1.5"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:4>", "<sample:8>"}, false, 1, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "insert", "org.jsoup.nodes.Element", "<sample:0>"}, {"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:6>", "ullabctextarea", "<sample:15>"}, {"org.jsoup.parser.HtmlTreeBuilder", "processEndTag", "java.lang.String", "1.4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:16>", "<sample:11>"}, false, 13, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:6>", "ullabctextarea", "<sample:15>"}, {"org.jsoup.parser.HtmlTreeBuilder", "processEndTag", "java.lang.String", "1-4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<!---->, state=InBody, currentElement=<body>\n <a><b>t</b></a>\n <!---->\n</body>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:1>", "<sample:11>"}, false, 13, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:6>", "ullabctextarea", "<sample:15>"}, {"org.jsoup.parser.HtmlTreeBuilder", "processEndTag", "java.lang.String", "1-4"}, {"org.jsoup.parser.HtmlTreeBuilder", "isInActiveFormattingElements", "org.jsoup.nodes.Element", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:1>", "<sample:2>"}, false, 13, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:6>", "ullabctextarea", "<sample:15>"}, {"org.jsoup.parser.HtmlTreeBuilder", "processEndTag", "java.lang.String", "1-4"}, {"org.jsoup.parser.HtmlTreeBuilder", "isInActiveFormattingElements", "org.jsoup.nodes.Element", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=null, state=InBody, currentElement=<body>\n <a><b>t</b></a>\n</body>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:3>", "<sample:2>"}, false, 3, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:6>", "ullbbctextarfaiframe", "<sample:14>"}, {"org.jsoup.parser.HtmlTreeBuilder", "aboveOnStack", "org.jsoup.nodes.Element", "<sample:6>"}, {"org.jsoup.parser.HtmlTreeBuilder", "processEndTag", "java.lang.String", "-0xFEFFFFFF."}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:9>", "<sample:1>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:6>", "trv", "<sample:12>"}, {"org.jsoup.parser.HtmlTreeBuilder", "aboveOnStack", "org.jsoup.nodes.Element", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<!---->, state=InBody, currentElement=<body>\n <a><b>t</b></a>\n <!---->\n</body>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:9>", "<sample:5>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:6>", "trv", "<sample:12>"}, {"org.jsoup.parser.HtmlTreeBuilder", "aboveOnStack", "org.jsoup.nodes.Element", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<!---->, state=InBody, currentElement=<body>\n <a><b>t</b></a>\n <!---->\n</body>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:5>", "<sample:12>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:6>", "trv", "<sample:8>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:1>", "<sample:5>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:6>", "Patternr :synax eror: ", "<sample:5>"}, {"org.jsoup.parser.HtmlTreeBuilder", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:5>", "<sample:13>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:6>", "Patternr :synax eror: ", "<sample:5>"}, {"org.jsoup.parser.HtmlTreeBuilder", "toString", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:6>", "<sample:13>"}, false, 1, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:6>", "Patternr :synax eror: ", "<sample:5>"}, {"org.jsoup.parser.HtmlTreeBuilder", "toString", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:7>", "<sample:12>"}, false, 10, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:6>", "Patternr :synax eror: ", "<sample:6>"}, {"org.jsoup.parser.HtmlTreeBuilder", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<![CDATA[0]]>, state=InTableText, currentElement=<body>\n <a><b>t</b></a>\n</body>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:7>", "<sample:14>"}, false, 10, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:6>", "Patternr :synax eror: ", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<![CDATA[0]]>, state=InBody, currentElement=<body>\n <a><b>t</b></a><![CDATA[0]]>\n</body>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:5>", "<sample:11>"}, false, 8, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:6>", "Patternr :synax eror: ", "<sample:6>"}, {"org.jsoup.parser.HtmlTreeBuilder", "push", "org.jsoup.nodes.Element", "<sample:5>"}, {"org.jsoup.parser.HtmlTreeBuilder", "pop", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:4>", "<sample:13>"}, false, 8, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:6>", "1.225ox1335r", "<sample:6>"}, {"org.jsoup.parser.HtmlTreeBuilder", "pop", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:0>", "<sample:16>"}, false, 9, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:6>", "1.225ox1335r1.5f", "<sample:6>"}, {"org.jsoup.parser.HtmlTreeBuilder", "pop", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<![CDATA[a]]>, state=InBody, currentElement=<html>\n <head></head>\n <body>\n  <a><b>t</b></a>\n </body><![CDATA[a]]>\n</html>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:6>", "<sample:16>"}, false, 9, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:6>", "1.225ox1335r1.5f", "<sample:6>"}, {"org.jsoup.parser.HtmlTreeBuilder", "pop", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:5>", "<sample:16>"}, false, 5, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:6>", "2020-01-01.", "<sample:6>"}, {"org.jsoup.parser.HtmlTreeBuilder", "pop", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "insertStartTag", "java.lang.String", "1-4"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:3>", "<sample:16>"}, false, 5, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:6>", "2020-01-01.", "<sample:6>"}, {"org.jsoup.parser.HtmlTreeBuilder", "pop", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "insertStartTag", "java.lang.String", "1-4"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:2>", "<sample:16>"}, false, 5, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:6>", "2020-01-01.", "<sample:6>"}, {"org.jsoup.parser.HtmlTreeBuilder", "insertStartTag", "java.lang.String", "14"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<!---->, state=InBody, currentElement=<14>\n <!---->\n</14>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:4>", "<sample:16>"}, false, 5, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:6>", "2020-01-01.", "<sample:6>"}, {"org.jsoup.parser.HtmlTreeBuilder", "insertStartTag", "java.lang.String", "14"}, {"org.jsoup.parser.HtmlTreeBuilder", "removeFromActiveFormattingElements", "org.jsoup.nodes.Element", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:4>", "<sample:19>"}, false, 12, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "replaceOnStack", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:0>", "<sample:1>"}, {"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:6>", "2020-01-01C.", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:4>", "<sample:20>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "replaceOnStack", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:0>", "<sample:1>"}, {"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:6>", "2020-01-01C.", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:8>", "<sample:19>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "replaceOnStack", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:0>", "<sample:1>"}, {"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:6>", "2020-01-01C.", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:4>", "<sample:18>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "replaceOnStack", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:0>", "<sample:1>"}, {"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:6>", "2020-01-01C.", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:10>", "<sample:18>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "replaceOnStack", "org.jsoup.nodes.Element,org.jsoup.nodes.Element", "<sample:0>", "<sample:1>"}, {"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:6>", "2020-01-01C.", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:4>", "<sample:17>"}, false, 1, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:6>", "2020-01-01C.", "<sample:6>"}, {"org.jsoup.parser.HtmlTreeBuilder", "generateImpliedEndTags", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:6>", "<sample:18>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:6>", "2021-01-1C/1.5e300", "<sample:7>"}, {"org.jsoup.parser.HtmlTreeBuilder", "inScope", "java.lang.String", "-o10xGFFFFFF"}, {"org.jsoup.parser.HtmlTreeBuilder", "generateImpliedEndTags", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:14>", "<sample:19>"}, false, 6, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<empty>", "Pattern synax eror: ", "<sample:5>"}, {"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:6>", "2021-01-1C/1.5e300", "<sample:9>"}, {"org.jsoup.parser.HtmlTreeBuilder", "inScope", "java.lang.String", "<a?b</a>1E-5"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<![CDATA[sample]]>, state=InBody, currentElement=<body>\n <a><b>t</b></a>\n</body>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:14>", "<sample:18>"}, false, 7, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "transition", "org.jsoup.parser.HtmlTreeBuilderState", "<sample:3>"}, {"org.jsoup.parser.HtmlTreeBuilder", "insert", "org.jsoup.nodes.Element", "<sample:2>"}, {"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:6>", "2021-001-1C/1.;5e300", "<sample:12>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<![CDATA[sample]]>, state=InBody, currentElement=<body>\n <a><b>t</b></a>\n</body>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:2>", "<sample:18>"}, false, 7, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "transition", "org.jsoup.parser.HtmlTreeBuilderState", "<sample:19>"}, {"org.jsoup.parser.HtmlTreeBuilder", "insert", "org.jsoup.nodes.Element", "<sample:2>"}, {"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:6>", "2021-001-1C/1.;5e300", "<sample:12>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<!---->, state=InBody, currentElement=<body>\n <a><b>t</b></a>\n <!---->\n</body>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:13>", "<sample:14>"}, false, 7, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "transition", "org.jsoup.parser.HtmlTreeBuilderState", "<sample:20>"}, {"org.jsoup.parser.HtmlTreeBuilder", "insert", "org.jsoup.nodes.Element", "<sample:2>"}, {"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:6>", "2021-001-1C/1.;5e300", "<sample:12>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:14>", "<sample:20>"}, false, 8, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "transition", "org.jsoup.parser.HtmlTreeBuilderState", "<sample:19>"}, {"org.jsoup.parser.HtmlTreeBuilder", "insert", "org.jsoup.nodes.Element", "<sample:1>"}, {"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:6>", "2021-001-1C/1.;5e300", "<sample:14>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<![CDATA[sample]]>, state=InBody, currentElement=<body>\n <a><b>t</b></a><![CDATA[sample]]>\n</body>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:10>", "<sample:20>"}, false, 8, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "transition", "org.jsoup.parser.HtmlTreeBuilderState", "<sample:18>"}, {"org.jsoup.parser.HtmlTreeBuilder", "insert", "org.jsoup.nodes.Element", "<sample:1>"}, {"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:6>", "2021-001-1C/1.;5e300", "<sample:14>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:10>", "<sample:22>"}, false, 8, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "insert", "org.jsoup.nodes.Element", "<sample:6>"}, {"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:6>", "2021-001-1C/1.;5e300", "<sample:14>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:10>", "<sample:19>"}, false, 8, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:6>", "2021-001-1C/1.;ye300", "<sample:14>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:10>", "<sample:21>"}, false, 8, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:6>", "2021-001-1C/1.;ye300", "<sample:14>"}, {"org.jsoup.parser.HtmlTreeBuilder", "inSelectScope", "java.lang.String", "2020-01-01"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:11>", "<sample:21>"}, false, 8, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:6>", "2021-001-1C/1.;ye300", "<sample:14>"}, {"org.jsoup.parser.HtmlTreeBuilder", "inSelectScope", "java.lang.String", "2020-01-01"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:12>", "<sample:21>"}, false, 6, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "insert", "org.jsoup.parser.Token$Character", "<sample:3>"}, {"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:6>", "2021-001-1C/1.;ye300", "<sample:14>"}, {"org.jsoup.parser.HtmlTreeBuilder", "inSelectScope", "java.lang.String", "2020,01-01"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:15>", "<sample:21>"}, false, 15, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "insert", "org.jsoup.parser.Token$Character", "<sample:3>"}, {"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:6>", "2021-001-1C/1.;ye300", "<sample:14>"}, {"org.jsoup.parser.HtmlTreeBuilder", "inSelectScope", "java.lang.String", "2020,01-01"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:15>", "<sample:20>"}, false, 4, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "insert", "org.jsoup.parser.Token$Character", "<sample:3>"}, {"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:6>", "2021-001-1C/1.;ye300", "<sample:14>"}, {"org.jsoup.parser.HtmlTreeBuilder", "inSelectScope", "java.lang.String", "2020,01-01"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:13>", "<sample:12>"}, false, 5, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "toString", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:6>", "2021-0)01-1C/1.;ye300", "<sample:14>"}, {"org.jsoup.parser.HtmlTreeBuilder", "framesetOk", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:12>", "<sample:7>"}, false, 3, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:6>", "1021-0)01-2C/1y.;ye300textarea", "<sample:8>"}, {"org.jsoup.parser.HtmlTreeBuilder", "pushActiveFormattingElements", "org.jsoup.nodes.Element", "<sample:4>"}, {"org.jsoup.parser.HtmlTreeBuilder", "processStartTag", "java.lang.String,org.jsoup.nodes.Attributes", "<a?c</a>", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:3>", "<sample:1>"}, false, 3, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:6>", "1021-0)01-2C/1y.;ye300textarea", "<sample:10>"}, {"org.jsoup.parser.HtmlTreeBuilder", "pushActiveFormattingElements", "org.jsoup.nodes.Element", "<sample:4>"}, {"org.jsoup.parser.HtmlTreeBuilder", "processStartTag", "java.lang.String,org.jsoup.nodes.Attributes", "<a?c</a>Title", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:9>", "<sample:17>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:6>", "1021-0)01-2C/1y.;ye00textarea", "<sample:10>"}, {"org.jsoup.parser.HtmlTreeBuilder", "pushActiveFormattingElements", "org.jsoup.nodes.Element", "<sample:4>"}, {"org.jsoup.parser.HtmlTreeBuilder", "processStartTag", "java.lang.String,org.jsoup.nodes.Attributes", "<a?c</a>Title", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<!---->, state=InBody, currentElement=<<a?c</a>Title>\n <!---->\n</<a?c</a>Title>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:17>", "<sample:17>"}, false, 13, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:6>", "1021-\n)01-2C/1y.;ye00textarea", "<sample:10>"}, {"org.jsoup.parser.HtmlTreeBuilder", "pushActiveFormattingElements", "org.jsoup.nodes.Element", "<sample:4>"}, {"org.jsoup.parser.HtmlTreeBuilder", "processStartTag", "java.lang.String,org.jsoup.nodes.Attributes", "<a?c</a>Title", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:0>", "<sample:17>"}, false, 13, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:6>", "1021-\n)01-2C/1y.;ye00textarea", "<sample:10>"}, {"org.jsoup.parser.HtmlTreeBuilder", "pushActiveFormattingElements", "org.jsoup.nodes.Element", "<sample:4>"}, {"org.jsoup.parser.HtmlTreeBuilder", "processStartTag", "java.lang.String,org.jsoup.nodes.Attributes", "<a?c</a>Title", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<![CDATA[a]]>, state=InBody, currentElement=<<a?c</a>Title><![CDATA[a]]>\n</<a?c</a>Title>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:9>", "<sample:19>"}, false, 8, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:6>", "1021-\n)01-2C/1y.;ye00textarea", "<sample:9>"}, {"org.jsoup.parser.HtmlTreeBuilder", "pushActiveFormattingElements", "org.jsoup.nodes.Element", "<sample:0>"}, {"org.jsoup.parser.HtmlTreeBuilder", "processStartTag", "java.lang.String,org.jsoup.nodes.Attributes", "<null>", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<!---->, state=InBody, currentElement=<a>\n <!----></a>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:0>", "<sample:11>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:6>", "1.1234567s890123456.5", "<sample:0>"}, {"org.jsoup.parser.HtmlTreeBuilder", "popStackToClose", "java.lang.String", "idPT1H"}, {"org.jsoup.parser.HtmlTreeBuilder", "processStartTag", "java.lang.String,org.jsoup.nodes.Attributes", "214749368", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<![CDATA[a]]>, state=InBody, currentElement=<214749368><![CDATA[a]]>\n</214749368>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:10>", "<sample:11>"}, false, 14, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:6>", "0xFFFFFFFF", "<sample:3>"}, {"org.jsoup.parser.HtmlTreeBuilder", "processStartTag", "java.lang.String,org.jsoup.nodes.Attributes", "214749368Gello, ", "<sample:7>"}, {"org.jsoup.parser.HtmlTreeBuilder", "isFosterInserts", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:8>", "<sample:18>"}, false, 6, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:6>", "!%>\"V>tiitIe", "<sample:9>"}, {"org.jsoup.parser.HtmlTreeBuilder", "processStartTag", "java.lang.String", "style"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=null, state=Text, currentElement=<style>null</style>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:11>", "<sample:2>"}, false, 5, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:6>", "!%>\"V>tiitIe", "<sample:9>"}, {"org.jsoup.parser.HtmlTreeBuilder", "newPendingTableCharacters", ""}, {"org.jsoup.parser.HtmlTreeBuilder", "processStartTag", "java.lang.String", "style"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:12>", "<sample:14>"}, false, 12, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:6>", "\"$/-1", "<sample:4>"}, {"org.jsoup.parser.HtmlTreeBuilder", "inScope", "java.lang.String[]", "<sample:2>"}, {"org.jsoup.parser.HtmlTreeBuilder", "processStartTag", "java.lang.String,org.jsoup.nodes.Attributes", "#", "<sample:9>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:18>", "<sample:11>"}, false, 7, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:6>", "1021-\n)01-2C/1y.;ye00texarea", "<sample:3>"}, {"org.jsoup.parser.HtmlTreeBuilder", "processStartTag", "java.lang.String,org.jsoup.nodes.Attributes", "", "<sample:0>"}, {"org.jsoup.parser.HtmlTreeBuilder", "isInActiveFormattingElements", "org.jsoup.nodes.Element", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=</colgroup>, state=InBody, currentElement=<body>\n <a><b>t</b></a>\n</body>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:21>", "<sample:17>"}, false, 9, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:6>", "1021-\n)01-2C/1y.;ye00texaarea", "<sample:3>"}, {"org.jsoup.parser.HtmlTreeBuilder", "processStartTag", "java.lang.String,org.jsoup.nodes.Attributes", "", "<sample:0>"}, {"org.jsoup.parser.HtmlTreeBuilder", "isInActiveFormattingElements", "org.jsoup.nodes.Element", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<![CDATA[]]>, state=InBody, currentElement=<body>\n <a><b>t</b></a><![CDATA[]]>\n</body>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilderState"}, new String[]{"<sample:2>", "<sample:21>"}, false, 1, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "parse", "java.io.Reader,java.lang.String,org.jsoup.parser.Parser", "<sample:6>", "1021-\n)01-2C/1y.;ye00texaarea</1.5e300", "<sample:3>"}, {"org.jsoup.parser.HtmlTreeBuilder", "resetInsertionMode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "TreeBuilder{currentToken=<!---->, state=InBody, currentElement=<body>\n <a><b>t</b></a>\n <!---->\n</body>}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "processStartTag", new String[]{"java.lang.String"}, new String[]{"12:30:45"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "transition", "org.jsoup.parser.HtmlTreeBuilderState", "<sample:21>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "replaceActiveFormattingElement", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<null>", "<sample:1>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "removeFromActiveFormattingElements", "org.jsoup.nodes.Element", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<0></0> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<0></0> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<sample></sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<sample></sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<x \t y></x \t y> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y></x \t y> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1), new String[][]{{"attr", "java.lang.String,boolean", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<x \t y></x \t y> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y></x \t y> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 11, new String[][]{}, 1), new String[][]{{"attr", "java.lang.String,boolean", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValue", "java.lang.String,java.lang.String", "1", "1e10"}, {"org.jsoup.nodes.Element", "after", "java.lang.String", "u010\u00e9"}}, 1), new String[][]{{"attr", "java.lang.String,boolean", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValue", "java.lang.String,java.lang.String", "1", "1e10"}, {"org.jsoup.nodes.Element", "after", "java.lang.String", "u010\u00e9"}}, 1), new String[][]{{"attr", "java.lang.String,boolean", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a #cdata=\"a\"></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a #cdata=\"a\"></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValue", "java.lang.String,java.lang.String", "1", "1e10"}, {"org.jsoup.nodes.Element", "after", "java.lang.String", "u010\u00e9"}}, 1), new String[][]{{"attr", "java.lang.String,boolean", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a\nb></a\nb> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a\nb></a\nb> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 20, new String[][]{}, 2), new String[][]{{"attr", "java.lang.String,boolean", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.jsoup.nodes.Element", "ownerDocument", ""}, {"org.jsoup.nodes.Element", "before", "java.lang.String", "1.250x123456789"}}, 3), new String[][]{{"attr", "java.lang.String,boolean", "1"}, {"hasText", "", "6"}, {"getElementsByAttributeValueNot", "java.lang.String,java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.jsoup.nodes.Element", "ownerDocument", ""}, {"org.jsoup.nodes.Element", "html", "java.lang.String", "value"}, {"org.jsoup.nodes.Element", "before", "java.lang.String", "1.250x1235r6789"}}, 3), new String[][]{{"attr", "java.lang.String,boolean", "1"}, {"hasText", "", "6"}, {"getElementsByAttributeValueNot", "java.lang.String,java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.jsoup.nodes.Element", "ownerDocument", ""}, {"org.jsoup.nodes.Element", "html", "java.lang.String", "value"}}, 3), new String[][]{{"attr", "java.lang.String,boolean", "1"}, {"hasText", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a>value</a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.jsoup.nodes.Element", "ownerDocument", ""}, {"org.jsoup.nodes.Element", "html", "java.lang.String", "value"}}, 3), new String[][]{{"attr", "java.lang.String,boolean", "1"}, {"hasText", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<0>\n value\n</0> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.jsoup.nodes.Element", "ownerDocument", ""}, {"org.jsoup.nodes.Element", "html", "java.lang.String", "value"}}, 3), new String[][]{{"attr", "java.lang.String,boolean", "1"}, {"hasText", "", "6"}, {"getElementsByClass", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a>value</a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.jsoup.nodes.Element", "ownerDocument", ""}, {"org.jsoup.nodes.Element", "html", "java.lang.String", "value"}, {"org.jsoup.nodes.Element", "indent", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<sample:2>", "2147483647", "<sample:4>"}}, 3), new String[][]{{"appendChild", "org.jsoup.nodes.Node", "1"}, {"hasText", "", "6"}, {"getElementsByClass", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a>value\n <!--a--></a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.jsoup.nodes.Element", "ownerDocument", ""}, {"org.jsoup.nodes.Element", "html", "java.lang.String", "value"}, {"org.jsoup.nodes.Element", "indent", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<sample:2>", "2147483615", "<sample:3>"}}, 3), new String[][]{{"appendChild", "org.jsoup.nodes.Node", "1"}, {"hasText", "", "6"}, {"getElementsByClass", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<0>\n value\n <!--a-->\n</0> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.jsoup.nodes.Element", "ownerDocument", ""}, {"org.jsoup.nodes.Element", "html", "java.lang.String", "value"}, {"org.jsoup.nodes.Element", "indent", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<sample:2>", "2147483615", "<sample:3>"}}, 3), new String[][]{{"appendChild", "org.jsoup.nodes.Node", "1"}, {"hasText", "", "6"}, {"getElementsByClass", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a\nb>\n value\n <!--a-->\n</a\nb> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.jsoup.nodes.Element", "ownerDocument", ""}, {"org.jsoup.nodes.Element", "html", "java.lang.String", "valu"}, {"org.jsoup.nodes.Element", "indent", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<sample:2>", "2147483615", "<sample:3>"}}, 3), new String[][]{{"appendChild", "org.jsoup.nodes.Node", "1"}, {"hasText", "", "6"}, {"getElementsByClass", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a>valu\n <!--a--></a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.jsoup.nodes.Element", "ownerDocument", ""}, {"org.jsoup.nodes.Element", "html", "java.lang.String", "valv"}, {"org.jsoup.nodes.Element", "indent", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<sample:2>", "2147483615", "<sample:3>"}}, 3), new String[][]{{"appendChild", "org.jsoup.nodes.Node", "1"}, {"dataset", "", "6"}, {"remove", "java.lang.Object", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<a>valv\n <!--a--></a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.jsoup.nodes.Element", "ownerDocument", ""}, {"org.jsoup.nodes.Element", "html", "java.lang.String", "valv"}}, 3), new String[][]{{"appendChild", "org.jsoup.nodes.Node", "1"}, {"dataset", "", "6"}, {"remove", "java.lang.Object", "1"}, {"clear", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a>valv\n <!--a--></a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.Tag", "org.jsoup.parser.Tag", "hashCode", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.jsoup.nodes.Element", "html", "java.lang.String", "5.--10x123456789"}, {"org.jsoup.nodes.Element", "select", "java.lang.String", ",1.5"}}, 3), new String[][]{{"appendChild", "org.jsoup.nodes.Node", "1"}, {"dataset", "", "6"}, {"clear", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a>5.--10x123456789\n <!--a--></a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.jsoup.nodes.Element", "tagName", ""}, {"org.jsoup.nodes.Element", "select", "java.lang.String", ",1.5"}}, 3), new String[][]{{"appendChild", "org.jsoup.nodes.Node", "1"}, {"dataset", "", "6"}, {"clear", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a>\n <!--a--></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.jsoup.nodes.Element", "getElementsContainingText", "java.lang.String", "0x1F"}, {"org.jsoup.nodes.Element", "removeChild", "org.jsoup.nodes.Node", "<sample:7>"}, {"org.jsoup.nodes.Element", "select", "java.lang.String", "=1.5"}}, 3), new String[][]{{"appendChild", "org.jsoup.nodes.Node", "1"}, {"dataset", "", "6"}, {"clear", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a>\n <!--a--></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.jsoup.nodes.Element", "getElementsContainingText", "java.lang.String", "0x1Fiframe"}, {"org.jsoup.nodes.Element", "removeChild", "org.jsoup.nodes.Node", "<sample:7>"}, {"org.jsoup.nodes.Element", "select", "java.lang.String", "null"}}, 2), new String[][]{{"appendChild", "org.jsoup.nodes.Node", "1"}, {"dataset", "", "6"}, {"clear", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a>\n <!--a--></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.jsoup.nodes.Element", "getElementsContainingText", "java.lang.String", "0x2Fiframe"}, {"org.jsoup.nodes.Element", "removeChild", "org.jsoup.nodes.Node", "<sample:7>"}, {"org.jsoup.nodes.Element", "select", "java.lang.String", "null"}}, 2), new String[][]{{"appendChild", "org.jsoup.nodes.Node", "1"}, {"dataset", "", "6"}, {"clear", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<0>\n <!--a-->\n</0> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.jsoup.nodes.Element", "previousSibling", ""}, {"org.jsoup.nodes.Element", "getElementsContainingText", "java.lang.String", "0x1Eifram"}, {"org.jsoup.nodes.Element", "getElementsByAttributeValue", "java.lang.String,java.lang.String", "\u00e9", "0x123456789"}}, 2), new String[][]{{"classNames", "java.util.Set", "6"}, {"dataset", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a class=\"0\"></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValueStarting", "java.lang.String,java.lang.String", "0", "Hello, World"}, {"org.jsoup.nodes.Element", "getElementsContainingText", "java.lang.String", "0x1Eifram"}, {"org.jsoup.nodes.Element", "getElementsByAttributeValue", "java.lang.String,java.lang.String", "\u00ea", "0x123456789"}}, 2), new String[][]{{"classNames", "java.util.Set", "6"}, {"dataset", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<0 class=\"0\"></0> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValueStarting", "java.lang.String,java.lang.String", "0", "Hello, World"}, {"org.jsoup.nodes.Element", "getElementsContainingText", "java.lang.String", "0x1Eifram"}}, 2), new String[][]{{"classNames", "java.util.Set", "6"}, {"dataset", "", "6"}, {"getOrDefault", "java.lang.Object,java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a class=\"0\"></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValueStarting", "java.lang.String,java.lang.String", "0", "Hello, World"}, {"org.jsoup.nodes.Element", "baseUri", ""}, {"org.jsoup.nodes.Element", "getElementsContainingText", "java.lang.String", "0x1Eifram"}}, 2), new String[][]{{"classNames", "java.util.Set", "5"}, {"dataset", "", "6"}, {"getOrDefault", "java.lang.Object,java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a class=\"a 0 sample\"></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValueStarting", "java.lang.String,java.lang.String", "0", "Hello, World"}, {"org.jsoup.nodes.Element", "baseUri", ""}, {"org.jsoup.nodes.Element", "getElementsContainingText", "java.lang.String", "0x1Eifram"}}, 2), new String[][]{{"classNames", "java.util.Set", "5"}, {"dataset", "", "6"}, {"getOrDefault", "java.lang.Object,java.lang.Object", "5"}, {"remove", "java.lang.Object", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<a class=\"a 0 sample\"></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.jsoup.nodes.Element", "appendElement", "java.lang.String", "#"}, {"org.jsoup.nodes.Element", "getElementsByAttributeValueStarting", "java.lang.String,java.lang.String", "0", "tello, World"}, {"org.jsoup.nodes.Element", "baseUri", ""}}, 2), new String[][]{{"classNames", "java.util.Set", "5"}, {"dataset", "", "6"}, {"replace", "java.lang.Object,java.lang.Object,java.lang.Object", "2"}, {"remove", "java.lang.Object", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<a class=\"a 0 sample\">\n <#></#></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.jsoup.nodes.Element", "appendElement", "java.lang.String", "#"}, {"org.jsoup.nodes.Element", "baseUri", ""}}, 2), new String[][]{{"classNames", "java.util.Set", "5"}, {"dataset", "", "6"}, {"replace", "java.lang.Object,java.lang.Object,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a class=\"a 0 sample\">\n <#></#></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.jsoup.nodes.Element", "appendElement", "java.lang.String", "##"}, {"org.jsoup.nodes.Element", "attr", "java.lang.String", "title"}}, 2), new String[][]{{"classNames", "java.util.Set", "5"}, {"dataset", "", "6"}, {"replace", "java.lang.Object,java.lang.Object,java.lang.Object", "2"}, {"putAll", "java.util.Map", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{key0=a, key1=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a class=\"a 0 sample\" data-key0=\"a\" data-key1=\"0\">\n <##></##></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.jsoup.nodes.Element", "appendElement", "java.lang.String", "1"}, {"org.jsoup.nodes.Element", "attr", "java.lang.String", "syle"}}, 3), new String[][]{{"classNames", "java.util.Set", "3"}, {"dataset", "", "1"}, {"replace", "java.lang.Object,java.lang.Object,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a class=\"sample\">\n <1></1></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.jsoup.nodes.Element", "appendElement", "java.lang.String", "2"}, {"org.jsoup.nodes.Element", "attr", "java.lang.String", "syle"}}, 3), new String[][]{{"classNames", "java.util.Set", "3"}, {"dataset", "", "1"}, {"replace", "java.lang.Object,java.lang.Object,java.lang.Object", "2"}, {"size", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a class=\"sample\">\n <2></2></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.jsoup.nodes.Element", "appendElement", "java.lang.String", "I"}, {"org.jsoup.nodes.Element", "attr", "java.lang.String", "I"}, {"org.jsoup.nodes.Element", "append", "java.lang.String", " > "}}, 3), new String[][]{{"classNames", "java.util.Set", "3"}, {"dataset", "", "1"}, {"replace", "java.lang.Object,java.lang.Object,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a class=\"sample\"><i></i> &gt; </a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.jsoup.nodes.Element", "appendElement", "java.lang.String", "I"}, {"org.jsoup.nodes.Element", "attr", "java.lang.String", "J"}, {"org.jsoup.nodes.Element", "append", "java.lang.String", " >!"}}, 3), new String[][]{{"classNames", "java.util.Set", "3"}, {"getElementsByClass", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<0 class=\"sample\">\n <i></i> &gt;!\n</0> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jsoup.nodes.Element", "attr", "java.lang.String", "2020-02-30T25:61:61"}, {"org.jsoup.nodes.Element", "append", "java.lang.String", " >!"}}, 3), new String[][]{{"classNames", "java.util.Set", "3"}, {"getElementsByClass", "java.lang.String", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.jsoup.nodes.Element", "attr", "java.lang.String", "2020-02-30T25:61:61"}, {"org.jsoup.nodes.Element", "append", "java.lang.String", "-1;.5"}}, 3), new String[][]{{"classNames", "java.util.Set", "3"}, {"getElementsByClass", "java.lang.String", "1"}, {"addAll", "int,java.util.Collection", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.jsoup.nodes.Element", "id", ""}, {"org.jsoup.nodes.Element", "attr", "java.lang.String", "2020-02-30T2561:61"}}, 1), new String[][]{{"getElementsMatchingOwnText", "java.util.regex.Pattern", "3"}, {"prevAll", "", "1"}, {"addAll", "int,java.util.Collection", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.jsoup.nodes.Element", "attr", "java.lang.String", "2020-02-30T2561:61-1.5"}}, 1), new String[][]{{"getElementsMatchingOwnText", "java.util.regex.Pattern", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.jsoup.nodes.Element", "outerHtml", ""}, {"org.jsoup.nodes.Element", "attr", "java.lang.String", "2020,02-30T2561:61-1.5"}}, 1), new String[][]{{"getElementsMatchingOwnText", "java.util.regex.Pattern", "3"}, {"prevAll", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<sample></sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.jsoup.nodes.Element", "outerHtml", ""}, {"org.jsoup.nodes.Element", "attr", "java.lang.String", "2020,02-30T2561:61-1.5"}}, 1), new String[][]{{"getElementsMatchingOwnText", "java.util.regex.Pattern", "3"}, {"prevAll", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a\rb #cdata=\"a\"></a\rb> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.jsoup.nodes.Element", "previousSibling", ""}, {"org.jsoup.nodes.Element", "baseUri", ""}, {"org.jsoup.nodes.Element", "nextElementSibling", ""}}, 3), new String[][]{{"getElementsMatchingOwnText", "java.util.regex.Pattern", "3"}, {"prevAll", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<sample></sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.jsoup.nodes.Element", "dataNodes", ""}, {"org.jsoup.nodes.Element", "nextElementSibling", ""}}, 3), new String[][]{{"getElementsMatchingOwnText", "java.util.regex.Pattern", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<sample></sample>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<sample></sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "dataNodes", ""}, {"org.jsoup.nodes.Element", "previousElementSibling", ""}, {"org.jsoup.nodes.Element", "getElementsByIndexGreaterThan", "int", "99"}}, 1), new String[][]{{"attr", "java.lang.String", "3"}, {"getElementsByAttributeValueMatching", "java.lang.String,java.lang.String", "5"}, {"attr", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} #cdata=\"a\"></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.jsoup.nodes.Element", "dataNodes", ""}, {"org.jsoup.nodes.Element", "doSetBaseUri", "java.lang.String", "u010\u00e9"}, {"org.jsoup.nodes.Element", "select", "java.lang.String", "ull"}}, 1), new String[][]{{"attr", "java.lang.String", "7"}, {"childNode", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.jsoup.nodes.Element", "before", "java.lang.String", "<a>b</a>"}, {"org.jsoup.nodes.Element", "dataNodes", ""}}, 1), new String[][]{{"attr", "java.lang.String", "7"}, {"appendChild", "org.jsoup.nodes.Node", "7"}, {"html", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<sample>\n a\n</sample> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<sample>\n a\n</sample> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.jsoup.nodes.Element", "before", "java.lang.String", "<a>b</a>"}, {"org.jsoup.nodes.Element", "dataNodes", ""}}, 1), new String[][]{{"attr", "java.lang.String", "7"}, {"appendChild", "org.jsoup.nodes.Node", "7"}, {"html", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a\rb #cdata=\"a\">\n a\n</a\rb> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a\rb #cdata=\"a\">\n a\n</a\rb> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.jsoup.nodes.Element", "prepend", "java.lang.String", "noframes"}}, 1), new String[][]{{"getElementsContainingText", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<sample>\n noframes\n</sample>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<sample>\n noframes\n</sample> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.jsoup.nodes.Element", "appendText", "java.lang.String", "\\s+"}, {"org.jsoup.nodes.Element", "prepend", "java.lang.String", "noframes"}}, 1), new String[][]{{"getElementsContainingText", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<sample>\n noframes\\s+\n</sample>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<sample>\n noframes\\s+\n</sample> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.jsoup.nodes.Element", "nextElementSiblings", ""}, {"org.jsoup.nodes.Element", "prependElement", "java.lang.String", "5.--10x123456789"}}, 2), new String[][]{{"append", "java.lang.String", "3"}, {"hasText", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<sample>\n <5.--10x123456789></5.--10x123456789>sample\n</sample> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getStack", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.jsoup.nodes.Element", "appendChild", "org.jsoup.nodes.Node", "<sample:4>"}, {"org.jsoup.nodes.Element", "nextElementSiblings", ""}}, 3), new String[][]{{"append", "java.lang.String", "3"}, {"hasText", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<sample><![CDATA[]]>sample\n</sample> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "replaceOnStack", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:7>", "<sample:7>"}, false, 3, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "inTableScope", "java.lang.String", "I"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.jsoup.nodes.Element", "textNodes", ""}, {"org.jsoup.nodes.Element", "dataNodes", ""}}, 2), new String[][]{{"append", "java.lang.String", "4"}, {"html", "", "0"}, {"child", "int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.jsoup.nodes.Element", "toggleClass", "java.lang.String", "2020-01-01"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<sample class=\"2020-01-01\"></sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<sample class=\"2020-01-01\"></sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.jsoup.nodes.Element", "text", "java.lang.String", "1.12345678"}, {"org.jsoup.nodes.Element", "toggleClass", "java.lang.String", "noframes"}}, 2), new String[][]{{"hasAttr", "java.lang.String", "5"}, {"getElementsContainingOwnText", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<sample class=\"noframes\">\n 1.12345678\n</sample> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "removeClass", new String[]{"java.lang.String"}, new String[]{"a,b,c"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.jsoup.nodes.Element", "removeChild", "org.jsoup.nodes.Node", "<sample:0>"}, {"org.jsoup.nodes.Element", "append", "java.lang.String", "\n"}, {"org.jsoup.nodes.Element", "doClone", "org.jsoup.nodes.Node", "<sample:1>"}}, 2), new String[][]{{"after", "org.jsoup.nodes.Node", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "siblingElements", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"addClass", "java.lang.String", "2"}, {"containsAll", "java.util.Collection", "2"}, {"forms", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insertInFosterParent", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "getHeadElement", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insert", new String[]{"org.jsoup.parser.Token$Comment"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "maybeSetBaseUri", "org.jsoup.nodes.Element", "<sample:0>"}, {"org.jsoup.parser.HtmlTreeBuilder", "inTableScope", "java.lang.String", "style"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tag", "org.jsoup.parser.Tag", "isFormSubmittable", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {canContainBlock=false, getName=null, isBlock=false, isData=true, isEmpty=false, isFormListed=false, isFormSubmittable=false, isInline=true, isKnownTag=false, isSelfClosing=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.jsoup.nodes.Element", "siblingNodes", ""}, {"org.jsoup.nodes.Element", "prepend", "java.lang.String", "true"}}, 2), new String[][]{{"hasText", "", "0"}, {"getElementsByAttributeValueContaining", "java.lang.String,java.lang.String", "2"}, {"add", "int,java.lang.Object", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insertMarkerToFormattingElements", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "maybeSetBaseUri", "org.jsoup.nodes.Element", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.jsoup.nodes.Element", "prepend", "java.lang.String", "Pattern syntax erqor: "}, {"org.jsoup.nodes.Element", "val", ""}}, 1), new String[][]{{"hasText", "", "0"}, {"data", "", "1"}, {"addClass", "java.lang.String", "6"}, {"hasClass", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<sample class=\"0\">\n Pattern syntax erqor: \n</sample> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.jsoup.nodes.Element", "prepend", "java.lang.String", "Pattern syotax erqor: "}, {"org.jsoup.nodes.Element", "cssSelector", ""}}, 1), new String[][]{{"hasText", "", "0"}, {"data", "", "1"}, {"addClass", "java.lang.String", "6"}, {"hasClass", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<sample class=\"0\">\n Pattern syotax erqor: \n</sample> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "insertChildren", new String[]{"int", "java.util.Collection"}, new String[]{"1", "<sample:0>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "popStackToClose", new String[]{"java.lang.String"}, new String[]{"1.5f"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "inScope", "java.lang.String[]", "<empty>"}, {"org.jsoup.parser.HtmlTreeBuilder", "isInActiveFormattingElements", "org.jsoup.nodes.Element", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.jsoup.nodes.Element", "prependElement", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, {"org.jsoup.nodes.Element", "setParentNode", "org.jsoup.nodes.Node", "<sample:6>"}, {"org.jsoup.nodes.Element", "getElementsMatchingOwnText", "java.util.regex.Pattern", "<sample:2>"}}, 1), new String[][]{{"root", "", "1"}, {"siblingIndex", "", "7"}, {"after", "org.jsoup.nodes.Node", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.jsoup.nodes.Element", "prependElement", "java.lang.String", "aaaaaaaaaaaaaaEaaaaaaaaaaaaaaaa"}, {"org.jsoup.nodes.Element", "tagName", "java.lang.String", "5."}, {"org.jsoup.nodes.Element", "getElementsMatchingOwnText", "java.util.regex.Pattern", "<empty>"}}, 1), new String[][]{{"clone", "", "6"}, {"data", "", "6"}, {"addClass", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<5. class=\"0\">\n <aaaaaaaaaaaaaaeaaaaaaaaaaaaaaaa></aaaaaaaaaaaaaaeaaaaaaaaaaaaaaaa>\n</5.> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<5.>\n <aaaaaaaaaaaaaaeaaaaaaaaaaaaaaaa></aaaaaaaaaaaaaaeaaaaaaaaaaaaaaaa>\n</5.> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "val", new String[]{"java.lang.String"}, new String[]{"-5"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a value=\"-5\"></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a value=\"-5\"></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "val", new String[]{"java.lang.String"}, new String[]{".5"}, false), new String[][]{{"getElementsContainingOwnText", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a value=\".5\"></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "val", new String[]{"java.lang.String"}, new String[]{"value"}, false), new String[][]{{"getElementsContainingOwnText", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a value=\"value\"></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inTableScope", new String[]{"java.lang.String"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 21, new String[][]{}), new String[][]{{"attr", "java.lang.String,boolean", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<0></0> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<0></0> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "childNodeSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "elementSiblingIndex", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 20, new String[][]{}), new String[][]{{"attr", "java.lang.String,boolean", "3"}, {"dataset", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "siblingElements", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "removeClass", "java.lang.String", "1L"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inButtonScope", new String[]{"java.lang.String"}, new String[]{"Title"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "inScope", "java.lang.String,java.lang.String[]", "2020-01-01", "<null>"}, {"org.jsoup.parser.HtmlTreeBuilder", "generateImpliedEndTags", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 20, new String[][]{}), new String[][]{{"classNames", "java.util.Set", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a class=\"0\"></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a class=\"0\"></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValueMatching", "java.lang.String,java.lang.String", "-1", "#root"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.jsoup.nodes.Element", "is", "java.lang.String", "0xFFFFFFFF"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 19, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a\nb></a\nb> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a\nb></a\nb> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "outerHtmlHead", new String[]{"java.lang.Appendable", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:0>", "10", "<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.jsoup.nodes.Element", "empty", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.jsoup.nodes.Element", "getElementsByIndexEquals", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByIndexGreaterThan", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "getElementsByTag", "java.lang.String", "1.1234567890123456"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.jsoup.nodes.Element", "ownerDocument", ""}, {"org.jsoup.nodes.Element", "before", "java.lang.String", "1.250x123456789"}}), new String[][]{{"attr", "java.lang.String,boolean", "1"}, {"hasText", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.jsoup.nodes.Element", "ownerDocument", ""}, {"org.jsoup.nodes.Element", "before", "java.lang.String", "1.250x123456789"}}), new String[][]{{"childNodes", "", "1"}, {"size", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.jsoup.nodes.Element", "ownerDocument", ""}, {"org.jsoup.nodes.Element", "before", "java.lang.String", "1.250x123456789"}}), new String[][]{{"attr", "java.lang.String,boolean", "1"}, {"hasText", "", "6"}, {"getElementsByAttributeValueNot", "java.lang.String,java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "after", new String[]{"java.lang.String"}, new String[]{"+1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.jsoup.nodes.Element", "ownerDocument", ""}, {"org.jsoup.nodes.Element", "html", "java.lang.String", "value"}}), new String[][]{{"attr", "java.lang.String,boolean", "1"}, {"hasText", "", "6"}, {"getElementsByClass", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a>value</a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tag", "org.jsoup.parser.Tag", "isBlock", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {canContainBlock=false, getName=null, isBlock=false, isData=true, isEmpty=false, isFormListed=false, isFormSubmittable=false, isInline=true, isKnownTag=false, isSelfClosing=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "after", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"org.jsoup.nodes.Element", "html", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "getDocument", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "isInActiveFormattingElements", "org.jsoup.nodes.Element", "<sample:5>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hasAttr", new String[]{"java.lang.String"}, new String[]{"1E-5"}, false, 4, new String[][]{{"org.jsoup.nodes.Element", "addChildren", "int,org.jsoup.nodes.Node[]", "-1", "<sample:2>"}, {"org.jsoup.nodes.Element", "normalName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "child", new String[]{"int"}, new String[]{"-1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.jsoup.nodes.Element", "getElementsContainingText", "java.lang.String", "0x1F"}, {"org.jsoup.nodes.Element", "removeChild", "org.jsoup.nodes.Node", "<sample:7>"}, {"org.jsoup.nodes.Element", "select", "java.lang.String", "=1.5"}}), new String[][]{{"appendChild", "org.jsoup.nodes.Node", "1"}, {"dataset", "", "6"}, {"clear", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a>\n <!--a--></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.jsoup.nodes.Element", "getElementsContainingText", "java.lang.String", "0x1Fiframe"}, {"org.jsoup.nodes.Element", "removeChild", "org.jsoup.nodes.Node", "<sample:7>"}, {"org.jsoup.nodes.Element", "select", "java.lang.String", "null"}}), new String[][]{{"appendChild", "org.jsoup.nodes.Node", "1"}, {"dataset", "", "6"}, {"clear", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<0>\n <!--a-->\n</0> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.jsoup.nodes.Element", "insertChildren", "int,org.jsoup.nodes.Node[]", "99", "<null>"}, {"org.jsoup.nodes.Element", "getElementsContainingText", "java.lang.String", "0x2Fifram"}, {"org.jsoup.nodes.Element", "removeChild", "org.jsoup.nodes.Node", "<sample:7>"}}), new String[][]{{"appendChild", "org.jsoup.nodes.Node", "1"}, {"dataset", "", "6"}, {"entrySet", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset$EntrySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a>\n <!--a--></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "parentNode", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "getElementsContainingText", "java.lang.String", "0x2Fifram"}, {"org.jsoup.nodes.Element", "removeChild", "org.jsoup.nodes.Node", "<sample:7>"}}), new String[][]{{"appendChild", "org.jsoup.nodes.Node", "1"}, {"dataset", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a>>\n <!--a-->\n</<a><b>t</b></a>> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.jsoup.nodes.Element", "getElementsContainingText", "java.lang.String", "0x1Eifram"}, {"org.jsoup.nodes.Element", "removeChild", "org.jsoup.nodes.Node", "<sample:7>"}, {"org.jsoup.nodes.Element", "html", "java.lang.Appendable", "<null>"}}), new String[][]{{"appendChild", "org.jsoup.nodes.Node", "1"}, {"dataset", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Attributes$Dataset", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a\nb>\n <!--a-->\n</a\nb> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tag", "org.jsoup.parser.Tag", "canContainBlock", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {canContainBlock=false, getName=null, isBlock=false, isData=true, isEmpty=false, isFormListed=false, isFormSubmittable=false, isInline=true, isKnownTag=false, isSelfClosing=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "wrap", new String[]{"java.lang.String"}, new String[]{"[1,2]"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "siblingNodes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "absUrl", "java.lang.String", "\\s+"}, {"org.jsoup.nodes.Element", "className", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "isBlock", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "nextSibling", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tagName", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "wholeText", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "resetInsertionMode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "defaultSettings", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "replaceWith", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilderState", "org.jsoup.parser.HtmlTreeBuilderState$1", "process", new String[]{"org.jsoup.parser.Token", "org.jsoup.parser.HtmlTreeBuilder"}, new String[]{"<sample:6>", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "classNames", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingText", new String[]{"java.util.regex.Pattern"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "getElementsByClass", "java.lang.String", "1.250x1235r6789"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<a></a>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.jsoup.nodes.Element", "id", ""}, {"org.jsoup.nodes.Element", "attr", "java.lang.String", "2020-02-30T25:61:61"}}), new String[][]{{"getElementsByAttributeValueMatching", "java.lang.String,java.lang.String", "3"}, {"prevAll", "", "1"}, {"addAll", "int,java.util.Collection", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.jsoup.nodes.Element", "id", ""}, {"org.jsoup.nodes.Element", "attr", "java.lang.String", "2020-02-30T25:61:61"}}), new String[][]{{"getElementsMatchingOwnText", "java.util.regex.Pattern", "3"}, {"prevAll", "", "1"}, {"addAll", "int,java.util.Collection", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tag", "org.jsoup.parser.Tag", "getName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.Tag", "isSelfClosing", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "null {canContainBlock=false, getName=null, isBlock=false, isData=true, isEmpty=false, isFormListed=false, isFormSubmittable=false, isInline=true, isKnownTag=false, isSelfClosing=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependElement", new String[]{"java.lang.String"}, new String[]{"100"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<100></100> {hasParent=true, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a>\n <100></100></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.jsoup.nodes.Element", "dataNodes", ""}, {"org.jsoup.nodes.Element", "previousSibling", ""}, {"org.jsoup.nodes.Element", "nextElementSibling", ""}}), new String[][]{{"getElementsMatchingOwnText", "java.util.regex.Pattern", "3"}, {"prevAll", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<sample></sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insertOnStackAfter", new String[]{"org.jsoup.nodes.Element", "org.jsoup.nodes.Element"}, new String[]{"<sample:1>", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "setHeadElement", new String[]{"org.jsoup.nodes.Element"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "setHeadElement", "org.jsoup.nodes.Element", "<sample:1>"}, {"org.jsoup.parser.HtmlTreeBuilder", "setHeadElement", "org.jsoup.nodes.Element", "<sample:0>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.jsoup.nodes.Element", "dataNodes", ""}, {"org.jsoup.nodes.Element", "insertChildren", "int,org.jsoup.nodes.Node[]", "-2147483648", "<sample:2>"}, {"org.jsoup.nodes.Element", "nextElementSibling", ""}}), new String[][]{{"getElementsMatchingOwnText", "java.util.regex.Pattern", "3"}, {"parents", "", "0"}, {"prev", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<sample></sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "outerHtml", new String[]{"java.lang.Appendable"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "before", new String[]{"java.lang.String"}, new String[]{"5."}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "elementSiblingIndex", ""}, {"org.jsoup.nodes.Element", "siblingIndex", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inScope", new String[]{"java.lang.String[]"}, new String[]{"<empty>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "is", new String[]{"org.jsoup.select.Evaluator"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "outerHtmlHead", "java.lang.Appendable,int,org.jsoup.nodes.Document$OutputSettings", "<sample:1>", "-1", "<sample:2>"}, {"org.jsoup.nodes.Element", "getElementsMatchingOwnText", "java.lang.String", "1.12345678"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tag", "org.jsoup.parser.Tag", "preserveWhitespace", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.Tag", "isData", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {canContainBlock=false, getName=null, isBlock=false, isData=true, isEmpty=false, isFormListed=false, isFormSubmittable=false, isInline=true, isKnownTag=false, isSelfClosing=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "clearAttributes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "prependText", "java.lang.String", "\u00e9"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a>\u00e9</a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a>\u00e9</a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "children", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "getElementById", "java.lang.String", "value"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "indent", new String[]{"java.lang.Appendable", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:1>", "0", "<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "traverse", new String[]{"org.jsoup.select.NodeVisitor"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "insertChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"-2147483648", "<empty>"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "nextSibling", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "append", new String[]{"java.lang.String"}, new String[]{".5"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "prependChild", "org.jsoup.nodes.Node", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a>.5</a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a>.5</a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.jsoup.nodes.Element", "dataNodes", ""}, {"org.jsoup.nodes.Element", "getElementsByTag", "java.lang.String", "1E-5"}}), new String[][]{{"attr", "java.lang.String", "0"}, {"appendChild", "org.jsoup.nodes.Node", "7"}, {"getElementsMatchingText", "java.util.regex.Pattern", "5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<sample>\n a\n</sample>]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<sample>\n a\n</sample> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "attr", new String[]{"java.lang.String"}, new String[]{"1.5f"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsContainingOwnText", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tag", "org.jsoup.parser.Tag", "normalName", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "null {canContainBlock=false, getName=null, isBlock=false, isData=true, isEmpty=false, isFormListed=false, isFormSubmittable=false, isInline=true, isKnownTag=false, isSelfClosing=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "text", new String[]{"java.lang.String"}, new String[]{"iframe"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a>iframe</a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a>iframe</a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.jsoup.nodes.Element", "is", "org.jsoup.select.Evaluator", "<sample:2>"}, {"org.jsoup.nodes.Element", "dataNodes", ""}, {"org.jsoup.nodes.Element", "getElementsByTag", "java.lang.String", "http://exampld.com/a?b=c"}}), new String[][]{{"attr", "java.lang.String", "0"}, {"appendChild", "org.jsoup.nodes.Node", "7"}, {"html", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "<sample>\n a\n</sample> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "inScope", new String[]{"java.lang.String", "java.lang.String[]"}, new String[]{"2020-02-30T25:61:61", "<sample:1>"}, false, 3, new String[][]{{"org.jsoup.parser.HtmlTreeBuilder", "inScope", "java.lang.String", "123456789012345678901234567890"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "toString", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependElement", new String[]{"java.lang.String"}, new String[]{"0x123456789"}, false), new String[][]{{"firstElementSibling", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<a>\n <0x123456789></0x123456789></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "runParser", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "textNodes", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "elementSiblingIndex", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "removeClass", new String[]{"java.lang.String"}, new String[]{" />"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.parser.Tag", "org.jsoup.parser.Tag", "isKnownTag", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.parser.Tag", "isData", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "null {canContainBlock=false, getName=null, isBlock=false, isData=true, isEmpty=false, isFormListed=false, isFormSubmittable=false, isInline=true, isKnownTag=false, isSelfClosing=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "root", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.jsoup.nodes.Element", "clone", ""}, {"org.jsoup.nodes.Element", "nextElementSiblings", ""}}), new String[][]{{"append", "java.lang.String", "3"}, {"hasText", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<sample>\n sample\n</sample> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "previousSibling", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.parser.HtmlTreeBuilder", "org.jsoup.parser.HtmlTreeBuilder", "insertInFosterParent", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
}
