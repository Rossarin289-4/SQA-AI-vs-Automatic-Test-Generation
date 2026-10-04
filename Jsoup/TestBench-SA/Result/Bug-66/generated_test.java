package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingText", new String[]{"java.lang.String"}, new String[]{"1.1234567"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByClass", new String[]{"java.lang.String"}, new String[]{"#root"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "getElementsContainingText", "java.lang.String", "010"}, {"org.jsoup.nodes.Element", "val", "java.lang.String", "2020-01-01"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a value=\"2020-01-01\"></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByClass", new String[]{"java.lang.String"}, new String[]{"--f"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "getElementsContainingText", "java.lang.String", "111"}, {"org.jsoup.nodes.Element", "val", "java.lang.String", "2020-01-01"}, {"org.jsoup.nodes.Element", "classNames", "java.util.Set", "<sample:1>"}}, 2), new String[][]{{"removeClass", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a value=\"2020-01-01\" class=\"a 0\"></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "html", new String[]{"java.lang.String"}, new String[]{"[0,2]"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "hasParent", ""}}), new String[][]{{"getElementsByAttributeValue", "java.lang.String,java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a>[0,2]</a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "textNodes", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "append", "java.lang.String", "<a>b</a>"}, {"org.jsoup.nodes.Element", "replaceChild", "org.jsoup.nodes.Node,org.jsoup.nodes.Node", "<sample:5>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y>\n <a>b</a>\n</x \t y> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:3>"}, false), new String[][]{{"getElementsContainingOwnText", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a><!DOCTYPE a PUBLIC \"0\" \"sample\"></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "text", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.nodes.Element", "appendText", "java.lang.String", "=/2020-01-01"}, {"org.jsoup.nodes.Element", "getElementsByIndexEquals", "int", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("=/2020-01-01", String.valueOf(actual));
  assertEquals("receiver state after the call", "<sample>\n =/2020-01-01\n</sample> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "childNodes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "is", "java.lang.String", "1E-5"}, {"org.jsoup.nodes.Element", "val", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueStarting", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"220/1-021.1234567", "01(01x123456789"}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValueMatching", "java.lang.String,java.lang.String", "+1", "+1"}, {"org.jsoup.nodes.Element", "dataNodes", ""}, {"org.jsoup.nodes.Element", "doSetBaseUri", "java.lang.String", "111o1"}}), new String[][]{{"addClass", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a>></<a><b>t</b></a>> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "toggleClass", new String[]{"java.lang.String"}, new String[]{"?0"}, false, 4, new String[][]{{"org.jsoup.nodes.Element", "append", "java.lang.String", "1.1234y567890123456"}, {"org.jsoup.nodes.Element", "textNodes", ""}, {"org.jsoup.nodes.Element", "before", "org.jsoup.nodes.Node", "<sample:2>"}}, 2), new String[][]{{"cssSelector", "", "7"}, {"getElementsByIndexLessThan", "int", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a class=\"?0\">1.1234y567890123456</a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nextSibling", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "textNodes", ""}, {"org.jsoup.nodes.Element", "insertChildren", "int,org.jsoup.nodes.Node[]", "-2147483648", "<empty>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nextSibling", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "textNodes", ""}, {"org.jsoup.nodes.Element", "insertChildren", "int,org.jsoup.nodes.Node[]", "2147483647", "<empty>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendText", new String[]{"java.lang.String"}, new String[]{"ta+"}, false, 1, new String[][]{{"org.jsoup.nodes.Element", "attr", "java.lang.String,boolean", "123456789012345668901234567890", "false"}, {"org.jsoup.nodes.Element", "getElementsByAttributeStarting", "java.lang.String", "trveeTITLE"}, {"org.jsoup.nodes.Element", "getElementsByTag", "java.lang.String", ":nth-c"}}, 1), new String[][]{{"dataNodes", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<0>\n ta+\n</0> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependText", new String[]{"java.lang.String"}, new String[]{"clasTitle"}, false, 4, new String[][]{{"org.jsoup.nodes.Element", "root", ""}, {"org.jsoup.nodes.Element", "appendElement", "java.lang.String", "http://example.com/a?b=c"}, {"org.jsoup.nodes.Element", "append", "java.lang.String", "12:+30:45a b"}}), new String[][]{{"getElementById", "java.lang.String", "2"}, {"getElementsContainingOwnText", "java.lang.String", "3"}, {"attr", "java.lang.String,java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a>clasTitle\n <http://example.com/a?b=c></http://example.com/a?b=c>12:+30:45a b</a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependText", new String[]{"java.lang.String"}, new String[]{"}\r"}, false, 14, new String[][]{{"org.jsoup.nodes.Element", "appendElement", "java.lang.String", "T_xHTFEOT0H"}, {"org.jsoup.nodes.Element", "setParentNode", "org.jsoup.nodes.Node", "<sample:3>"}, {"org.jsoup.nodes.Element", "removeChild", "org.jsoup.nodes.Node", "<sample:0>"}}), new String[][]{{"childNodesCopy", "", "7"}, {"contains", "java.lang.Object", "3"}, {"iterator", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueEnding", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0xFFFFFFFF", "2147483648"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "clone", ""}, {"org.jsoup.nodes.Element", "hasParent", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "filter", new String[]{"org.jsoup.select.NodeFilter"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "toggleClass", "java.lang.String", "aq"}, {"org.jsoup.nodes.Element", "hasClass", "java.lang.String", "0x123456789"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a class=\"aq\"></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a class=\"aq\"></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "preserveWhitespace", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "data", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.nodes.Element", "appendText", "java.lang.String", "1e10"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<sample>\n 1e10\n</sample> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "insertChildren", new String[]{"int", "org.jsoup.nodes.Node[]"}, new String[]{"-1", "<sample:1>"}, false, 1, new String[][]{{"org.jsoup.nodes.Element", "attr", "java.lang.String,java.lang.String", "12:+30:45a b", "1.1234y567890123456"}, {"org.jsoup.nodes.Element", "children", ""}, {"org.jsoup.nodes.Element", "parentNode", ""}}, 3), new String[][]{{"getElementsMatchingText", "java.util.regex.Pattern", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[<0 12:+30:45a b=\"1.1234y567890123456\">\n <#root></#root><!DOCTYPE a PUBLIC \"0\" \"sample\">\n</0>, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<0 12:+30:45a b=\"1.1234y567890123456\">\n <#root></#root><!DOCTYPE a PUBLIC \"0\" \"sample\">\n</0> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "html", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "insertChildren", "int,java.util.Collection", "0", "<sample:6>"}, {"org.jsoup.nodes.Element", "previousElementSibling", ""}, {"org.jsoup.nodes.Element", "appendElement", "java.lang.String", "01()01x1234567689"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<01()01x1234567689></01()01x1234567689>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y>\n <01()01x1234567689></01()01x1234567689>\n</x \t y> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendElement", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}."}, false, 12, new String[][]{{"org.jsoup.nodes.Element", "replaceWith", "org.jsoup.nodes.Node", "<sample:2>"}, {"org.jsoup.nodes.Element", "getElementsByAttributeValueContaining", "java.lang.String,java.lang.String", ".", "111TITLE"}, {"org.jsoup.nodes.Element", "val", "java.lang.String", "null"}}, 2), new String[][]{{"attr", "java.lang.String,boolean", "0"}, {"appendElement", "java.lang.String", "1"}, {"hasAttr", "java.lang.String", "0"}, {"after", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a></a> {hasParent=true, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a value=\"null\">\n <{\"a\":1}. >\n  <a></a>sample\n </{\"a\":1}.></a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingOwnText", new String[]{"java.lang.String"}, new String[]{"[0,2]"}, false, 2, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValueMatching", "java.lang.String,java.lang.String", "class", "bq"}}), new String[][]{{"isEmpty", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<sample></sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "cssSelector", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "appendChild", "org.jsoup.nodes.Node", "<sample:1>"}, {"org.jsoup.nodes.Element", "appendTo", "org.jsoup.nodes.Element", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a > a", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a>a</a> {hasParent=true, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendElement", new String[]{"java.lang.String"}, new String[]{"i"}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "clone", ""}, {"org.jsoup.nodes.Element", "cssSelector", ""}, {"org.jsoup.nodes.Element", "before", "java.lang.String", "c323456689012345678901} 34567890-0.0"}}, 2), new String[][]{{"hasParent", "", "7"}, {"appendElement", "java.lang.String", "5"}, {"attr", "java.lang.String,java.lang.String", "3"}, {"before", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a sample=\"\"></a> {hasParent=true, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a>>\n <i>a<a sample=\"\"></a></i>\n</<a><b>t</b></a>> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendElement", new String[]{"java.lang.String"}, new String[]{"[2,2]{\"a\":1}i"}, false, 8, new String[][]{{"org.jsoup.nodes.Element", "text", "java.lang.String", "2123456789012345678901234567890"}, {"org.jsoup.nodes.Element", "select", "java.lang.String", "Title"}}), new String[][]{{"hasParent", "", "7"}, {"appendElement", "java.lang.String", "2"}, {"attr", "java.lang.String,java.lang.String", "2"}, {"after", "org.jsoup.nodes.Node", "1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<0 0=\"sample\"></0> {hasParent=true, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a>2123456789012345678901234567890\n <[2,2]{\"a\":1}i>\n  <0 0=\"sample\"></0>a\n </[2,2]{\"a\":1}i></a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendElement", new String[]{"java.lang.String"}, new String[]{"IIlI1.12345v7990E1234t67"}, false, 4, new String[][]{{"org.jsoup.nodes.Element", "prependChild", "org.jsoup.nodes.Node", "<sample:2>"}, {"org.jsoup.nodes.Element", "prependChild", "org.jsoup.nodes.Node", "<sample:6>"}, {"org.jsoup.nodes.Element", "data", ""}}, 2), new String[][]{{"getElementsByAttributeValueNot", "java.lang.String,java.lang.String", "5"}, {"prev", "", "6"}, {"nextAll", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a>\n <!--a-->\n <#root></#root>\n <IIlI1.12345v7990E1234t67></IIlI1.12345v7990E1234t67></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendElement", new String[]{"java.lang.String"}, new String[]{"III+I1.345v798\t.\t2020-02-30T25:61:61"}, false, 8, new String[][]{{"org.jsoup.nodes.Element", "prependChild", "org.jsoup.nodes.Node", "<sample:2>"}, {"org.jsoup.nodes.Element", "prependChild", "org.jsoup.nodes.Node", "<sample:9>"}, {"org.jsoup.nodes.Element", "data", ""}}), new String[][]{{"getElementsByAttributeValueNot", "java.lang.String,java.lang.String", "5"}, {"prev", "", "6"}, {"nextAll", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a>0\n <#root></#root>\n <III+I1.345v798\t.\t2020-02-30T25:61:61></III+I1.345v798\t.\t2020-02-30T25:61:61></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "preserveWhitespace", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "dataset", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "insertChildren", "int,java.util.Collection", "2147483647", "<sample:2>"}}, 3), new String[][]{{"keySet", "", "5"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "doClone", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "after", "java.lang.String", "1.123\r4567"}, {"org.jsoup.nodes.Element", "absUrl", "java.lang.String", "a,b,c"}, {"org.jsoup.nodes.Element", "appendTo", "org.jsoup.nodes.Element", "<sample:0>"}}), new String[][]{{"html", "", "0"}, {"cssSelector", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=true, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "previousSibling", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Element", "prependElement", "java.lang.String", "[0,2]"}, {"org.jsoup.nodes.Element", "html", "java.lang.Appendable", "<sample:2>"}, {"org.jsoup.nodes.Element", "getElementsContainingText", "java.lang.String", "1.1234567"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<a>\n <[0,2]></[0,2]></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "baseUri", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.nodes.Element", "tagName", "java.lang.String", "[2,2]{\"a\":1}i"}, {"org.jsoup.nodes.Element", "getElementsByAttribute", "java.lang.String", "aaaaaaaaaaaaaaaDaaaaaaaaaa`aaaa-0.0 > textarea."}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<[2,2]{\"a\":1}i></[2,2]{\"a\":1}i> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prepend", new String[]{"java.lang.String"}, new String[]{"><a2D>b</0b"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "appendElement", "java.lang.String", "br"}, {"org.jsoup.nodes.Element", "appendTo", "org.jsoup.nodes.Element", "<sample:4>"}, {"org.jsoup.nodes.Element", "lastElementSibling", ""}}, 3), new String[][]{{"getElementsByAttributeValueNot", "java.lang.String,java.lang.String", "6"}, {"text", "", "0"}, {"text", "", "7"}, {"prev", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a>&gt;\n <a2d>\n  b\n  <!--0b-->\n </a2d><br></a> {hasParent=true, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prepend", new String[]{"java.lang.String"}, new String[]{"<<t5E,L//F(>?0"}, false, 4, new String[][]{{"org.jsoup.nodes.Element", "appendElement", "java.lang.String", "br"}, {"org.jsoup.nodes.Element", "appendTo", "org.jsoup.nodes.Element", "<sample:5>"}, {"org.jsoup.nodes.Element", "lastElementSibling", ""}}), new String[][]{{"getElementsMatchingOwnText", "java.lang.String", "6"}, {"text", "", "7"}, {"text", "", "5"}, {"prev", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a>&lt;\n <t5e,l f(>\n  ?0\n </t5e,l><br></a> {hasParent=true, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "previousElementSibling", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "getElementsMatchingText", "java.lang.String", "?0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prepend", new String[]{"java.lang.String"}, new String[]{";<kt4E500/>e\r"}, false, 8, new String[][]{{"org.jsoup.nodes.Element", "appendElement", "java.lang.String", "br"}, {"org.jsoup.nodes.Element", "appendTo", "org.jsoup.nodes.Element", "<sample:9>"}, {"org.jsoup.nodes.Element", "lastElementSibling", ""}}, 1), new String[][]{{"getAllElements", "", "0"}, {"text", "", "7"}, {"removeClass", "java.lang.String", "5"}, {"prev", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a class=\"\">;\n <kt4e500 class=\"\" />e <br class=\"\"></a> {hasParent=true, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "before", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "selectFirst", "java.lang.String", "a,b,c"}, {"org.jsoup.nodes.Element", "appendTo", "org.jsoup.nodes.Element", "<sample:9>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a></a> {hasParent=true, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=true, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "toggleClass", new String[]{"java.lang.String"}, new String[]{"{\n"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "cssSelector", ""}, {"org.jsoup.nodes.Element", "traverse", "org.jsoup.select.NodeVisitor", "<sample:4>"}, {"org.jsoup.nodes.Element", "getElementsMatchingText", "java.util.regex.Pattern", "<null>"}}, 1), new String[][]{{"getElementsByClass", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a class=\"{\n\"></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "toggleClass", new String[]{"java.lang.String"}, new String[]{" />"}, false, 4, new String[][]{{"org.jsoup.nodes.Element", "root", ""}, {"org.jsoup.nodes.Element", "text", "java.lang.String", "a"}, {"org.jsoup.nodes.Element", "traverse", "org.jsoup.select.NodeVisitor", "<sample:5>"}}), new String[][]{{"getElementsByClass", "java.lang.String", "2"}, {"toggleClass", "java.lang.String", "7"}, {"after", "java.lang.String", "1"}, {"attr", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a class=\" />\">a</a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "toggleClass", new String[]{"java.lang.String"}, new String[]{"h /"}, false, 4, new String[][]{{"org.jsoup.nodes.Element", "addClass", "java.lang.String", "</1e10"}, {"org.jsoup.nodes.Element", "text", "java.lang.String", ""}, {"org.jsoup.nodes.Element", "traverse", "org.jsoup.select.NodeVisitor", "<sample:7>"}}, 3), new String[][]{{"getElementsByClass", "java.lang.String", "2"}, {"remove", "", "7"}, {"after", "java.lang.String", "7"}, {"attr", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a class=\"</1e10 h /\"></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependElement", new String[]{"java.lang.String"}, new String[]{"00(01xc384578r"}, false, 12, new String[][]{{"org.jsoup.nodes.Element", "getElementsByIndexLessThan", "int", "-1"}, {"org.jsoup.nodes.Element", "absUrl", "java.lang.String", "111"}}), new String[][]{{"hasAttr", "java.lang.String", "1"}, {"firstElementSibling", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<a>\n <00(01xc384578r></00(01xc384578r></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByIndexLessThan", new String[]{"int"}, new String[]{"2147483647"}, false, 8, new String[][]{{"org.jsoup.nodes.Element", "prependText", "java.lang.String", "[1-2]"}, {"org.jsoup.nodes.Element", "getElementsMatchingOwnText", "java.lang.String", "{\013L"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a>[1-2]</a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "toggleClass", new String[]{"java.lang.String"}, new String[]{"lc"}, false, 4, new String[][]{{"org.jsoup.nodes.Element", "prependElement", "java.lang.String", "."}, {"org.jsoup.nodes.Element", "append", "java.lang.String", "<<mb>\u00e9b22B\r4dE0:44fh>L\u00e9\u00e9ida b1e1012:0:45,13.26aac"}, {"org.jsoup.nodes.Element", "siblingElements", ""}}, 3), new String[][]{{"filter", "org.jsoup.select.NodeFilter", "3"}, {"getElementsByIndexGreaterThan", "int", "0"}, {"prevAll", "", "3"}, {"text", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a class=\"lc\">\n <.></.>&lt;\n <mb>\n  \u00e9b22B 4dE0:44fh&gt;L\u00e9\u00e9ida b1e1012:0:45,13.26aac\n </mb></a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nextElementSibling", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "insertChildren", "int,java.util.Collection", "0", "<empty>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nextElementSibling", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "insertChildren", "int,java.util.Collection", "-50", "<empty>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "<<a><b>t</b></a>></<a><b>t</b></a>> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "childNodesAsArray", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<sample></sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "childNodesAsArray", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a>></<a><b>t</b></a>> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "childNodesAsArray", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "childNodesAsArray", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "classNames", "java.util.Set", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1}></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "childNodesAsArray", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "classNames", "java.util.Set", "<null>"}, {"org.jsoup.nodes.Element", "val", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1}></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "childNodesAsArray", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "classNames", "java.util.Set", "<sample:1>"}, {"org.jsoup.nodes.Element", "val", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} class=\"a 0\"></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "id", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jsoup.nodes.Element", "remove", ""}, {"org.jsoup.nodes.Element", "text", "java.lang.String", "1.1234567"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "id", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.jsoup.nodes.Element", "remove", ""}, {"org.jsoup.nodes.Element", "text", "java.lang.String", "1.123\r4567"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a>1.123 4567</a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "id", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jsoup.nodes.Element", "remove", ""}, {"org.jsoup.nodes.Element", "text", "java.lang.String", "1.123\r4567"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<0>\n 1.123 4567\n</0> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "id", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jsoup.nodes.Element", "remove", ""}, {"org.jsoup.nodes.Element", "text", "java.lang.String", "1.123\r4567"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<sample>\n 1.123 4567\n</sample> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "id", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jsoup.nodes.Element", "remove", ""}, {"org.jsoup.nodes.Element", "attr", "java.lang.String,boolean", "\t", "true"}, {"org.jsoup.nodes.Element", "text", "java.lang.String", "1.123\r4567"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<sample \t>\n 1.123 4567\n</sample> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "html", new String[]{"java.lang.Appendable"}, new String[]{"<sample:1>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByClass", new String[]{"java.lang.String"}, new String[]{"#root"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "getElementsContainingText", "java.lang.String", "value"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByClass", new String[]{"java.lang.String"}, new String[]{"-1"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "getElementsContainingText", "java.lang.String", "111"}, {"org.jsoup.nodes.Element", "val", "java.lang.String", "2020-01-01"}, {"org.jsoup.nodes.Element", "classNames", "java.util.Set", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a value=\"2020-01-01\" class=\"sample\"></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByClass", new String[]{"java.lang.String"}, new String[]{"-f"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "getElementsContainingText", "java.lang.String", "111"}, {"org.jsoup.nodes.Element", "val", "java.lang.String", "2020-01-01"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a value=\"2020-01-01\"></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByClass", new String[]{"java.lang.String"}, new String[]{"-f"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "getElementsContainingText", "java.lang.String", "111"}, {"org.jsoup.nodes.Element", "classNames", "java.util.Set", "<sample:3>"}}, 2), new String[][]{{"removeClass", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a class=\"sample\"></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByClass", new String[]{"java.lang.String"}, new String[]{"-f"}, false, 10, new String[][]{{"org.jsoup.nodes.Element", "getElementsContainingText", "java.lang.String", "111"}, {"org.jsoup.nodes.Element", "val", "java.lang.String", "2020-01-01"}, {"org.jsoup.nodes.Element", "classNames", "java.util.Set", "<sample:3>"}}, 2), new String[][]{{"removeClass", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<sample value=\"2020-01-01\" class=\"sample\"></sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByClass", new String[]{"java.lang.String"}, new String[]{"-f"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "getElementsContainingText", "java.lang.String", "111"}, {"org.jsoup.nodes.Element", "val", "java.lang.String", "2020-01-01"}, {"org.jsoup.nodes.Element", "classNames", "java.util.Set", "<sample:1>"}}, 2), new String[][]{{"removeClass", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a value=\"2020-01-01\" class=\"a 0\"></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByClass", new String[]{"java.lang.String"}, new String[]{"-f"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "classNames", "java.util.Set", "<sample:1>"}}, 2), new String[][]{{"removeClass", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a class=\"a 0\"></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByClass", new String[]{"java.lang.String"}, new String[]{"d\u00ea"}, false, 10, new String[][]{{"org.jsoup.nodes.Element", "doSetBaseUri", "java.lang.String", "B"}}, 2), new String[][]{{"prevAll", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jsoup.select.Selector$SelectorParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByClass", new String[]{"java.lang.String"}, new String[]{"dd\u00e8WTTs5H"}, false, 8, new String[][]{{"org.jsoup.nodes.Element", "children", ""}, {"org.jsoup.nodes.Element", "data", ""}, {"org.jsoup.nodes.Element", "doSetBaseUri", "java.lang.String", ""}}, 2), new String[][]{{"indexOf", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependElement", new String[]{"java.lang.String"}, new String[]{"+1"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<+1></+1> {hasParent=true, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a>\n <+1></+1></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependElement", new String[]{"java.lang.String"}, new String[]{"1"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<1></1> {hasParent=true, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a>\n <1></1></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependElement", new String[]{"java.lang.String"}, new String[]{"n1.123\r4567"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<n1.123\r4567></n1.123\r4567> {hasParent=true, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a>\n <n1.123\r4567></n1.123\r4567></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependElement", new String[]{"java.lang.String"}, new String[]{"n1.123\r4"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<n1.123\r4></n1.123\r4> {hasParent=true, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a>\n <n1.123\r4></n1.123\r4></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependElement", new String[]{"java.lang.String"}, new String[]{"n11.123\r4"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<n11.123\r4></n11.123\r4> {hasParent=true, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a>\n <n11.123\r4></n11.123\r4></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependElement", new String[]{"java.lang.String"}, new String[]{"nn11.123\r4"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<nn11.123\r4></nn11.123\r4> {hasParent=true, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a>\n <nn11.123\r4></nn11.123\r4></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependElement", new String[]{"java.lang.String"}, new String[]{"nn+11.123\r3"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<nn+11.123\r3></nn+11.123\r3> {hasParent=true, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a>\n <nn+11.123\r3></nn+11.123\r3></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependElement", new String[]{"java.lang.String"}, new String[]{"\t"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "nodelistChanged", ""}, {"org.jsoup.nodes.Element", "children", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependElement", new String[]{"java.lang.String"}, new String[]{"1.5"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "nodelistChanged", ""}, {"org.jsoup.nodes.Element", "children", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<1.5></1.5> {hasParent=true, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a>\n <1.5></1.5></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependElement", new String[]{"java.lang.String"}, new String[]{"1.5"}, false, 1, new String[][]{{"org.jsoup.nodes.Element", "nodelistChanged", ""}, {"org.jsoup.nodes.Element", "children", ""}, {"org.jsoup.nodes.Element", "html", "java.lang.Appendable", "<sample:2>"}}, 2), new String[][]{{"clearAttributes", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<1.5></1.5> {hasParent=true, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<0>\n <1.5></1.5>\n</0> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependElement", new String[]{"java.lang.String"}, new String[]{"1-5"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "children", ""}, {"org.jsoup.nodes.Element", "html", "java.lang.Appendable", "<sample:2>"}}, 2), new String[][]{{"clearAttributes", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<1-5></1-5> {hasParent=true, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a>\n <1-5></1-5></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependElement", new String[]{"java.lang.String"}, new String[]{"1-5123456789012345678901234567890"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "children", ""}, {"org.jsoup.nodes.Element", "html", "java.lang.Appendable", "<sample:2>"}}, 2), new String[][]{{"clearAttributes", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<1-5123456789012345678901234567890></1-5123456789012345678901234567890> {hasParent=true, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a>\n <1-5123456789012345678901234567890></1-5123456789012345678901234567890></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependElement", new String[]{"java.lang.String"}, new String[]{"1-5123456789e02345678901234567890"}, false, 0, null, 2), new String[][]{{"getElementsMatchingText", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a>\n <1-5123456789e02345678901234567890></1-5123456789e02345678901234567890></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependElement", new String[]{"java.lang.String"}, new String[]{"a4,c1.5f\u00e9"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "firstElementSibling", ""}}, 2), new String[][]{{"appendChild", "org.jsoup.nodes.Node", "3"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a4,c1.5f\u00e9><!DOCTYPE a PUBLIC \"0\" \"sample\">\n</a4,c1.5f\u00e9> {hasParent=true, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a>\n <a4,c1.5f\u00e9><!DOCTYPE a PUBLIC \"0\" \"sample\">\n </a4,c1.5f\u00e9></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttribute", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}\t"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "text", ""}, {"org.jsoup.nodes.Element", "cssSelector", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttribute", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}\t"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "text", ""}, {"org.jsoup.nodes.Element", "cssSelector", ""}}, 1), new String[][]{{"add", "int,java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "cssSelector", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Element", "html", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "<sample></sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "cssSelector", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "baseUri", ""}, {"org.jsoup.nodes.Element", "html", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a>></<a><b>t</b></a>> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "cssSelector", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Element", "baseUri", ""}, {"org.jsoup.nodes.Element", "html", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "cssSelector", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "baseUri", ""}, {"org.jsoup.nodes.Element", "html", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\"|1}", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1}></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "cssSelector", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "baseUri", ""}, {"org.jsoup.nodes.Element", "html", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("x \t y", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y></x \t y> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "cssSelector", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.Element", "baseUri", ""}, {"org.jsoup.nodes.Element", "html", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<0></0> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "cssSelector", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jsoup.nodes.Element", "baseUri", ""}, {"org.jsoup.nodes.Element", "html", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "cssSelector", new String[]{}, new String[]{}, false, 17, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a #comment=\"a\"></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "cssSelector", new String[]{}, new String[]{}, false, 19, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a\nb", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a\nb></a\nb> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "cssSelector", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.jsoup.nodes.Element", "appendChild", "org.jsoup.nodes.Node", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a\nb", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a\nb>\n <!--a-->\n</a\nb> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hasClass", new String[]{"java.lang.String"}, new String[]{"aqq"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hasClass", new String[]{"java.lang.String"}, new String[]{"aqq"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<0></0> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "before", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:1>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:2>"}, false, 6, new String[][]{}, 3), new String[][]{{"getElementsByIndexLessThan", "int", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<sample>\n <#root></#root>\n</sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:1>"}, false, 6, new String[][]{}, 3), new String[][]{{"getElementsByIndexLessThan", "int", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<sample>a\n</sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:2>"}, false, 6, new String[][]{}, 3), new String[][]{{"getElementsByIndexLessThan", "int", "7"}, {"not", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:6>"}, false, 6, new String[][]{}, 3), new String[][]{{"getElementsByIndexLessThan", "int", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<sample>\n <!--a-->\n</sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"org.jsoup.nodes.Element", "insertChildren", "int,java.util.Collection", "10", "<sample:2>"}}, 3), new String[][]{{"getElementsByIndexLessThan", "int", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<sample>\n <#root></#root>\n</sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "insertChildren", "int,java.util.Collection", "10", "<sample:2>"}}, 3), new String[][]{{"getElementsByIndexLessThan", "int", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y>\n <#root></#root>\n</x \t y> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:2>"}, false, 8, new String[][]{{"org.jsoup.nodes.Element", "insertChildren", "int,java.util.Collection", "10", "<sample:2>"}}, 3), new String[][]{{"getElementsByIndexLessThan", "int", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a>\n <#root></#root></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:2>"}, false, 10, new String[][]{{"org.jsoup.nodes.Element", "childNodesCopy", ""}, {"org.jsoup.nodes.Element", "insertChildren", "int,java.util.Collection", "524302", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<sample>\n <#root></#root>\n</sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<sample>\n <#root></#root>\n</sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hasParent", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "appendText", "java.lang.String", "5"}, {"org.jsoup.nodes.Element", "childNode", "int", "20"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y>\n 5\n</x \t y> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "data", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "data", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<0></0> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "data", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<sample></sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "data", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a>></<a><b>t</b></a>> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "data", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1}></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "text", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, false, 1, new String[][]{{"org.jsoup.nodes.Element", "getElementsContainingOwnText", "java.lang.String", " "}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<0>\n http://example.com/a?b=c\n</0> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<0>\n http://example.com/a?b=c\n</0> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "text", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, false, 1, new String[][]{{"org.jsoup.nodes.Element", "getElementsContainingOwnText", "java.lang.String", " "}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<0>\n 2020-01-01\n</0> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<0>\n 2020-01-01\n</0> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "text", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, false, 2, new String[][]{{"org.jsoup.nodes.Element", "getElementsContainingOwnText", "java.lang.String", " "}, {"org.jsoup.nodes.Element", "nodelistChanged", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<sample>\n 2020-01-01\n</sample> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<sample>\n 2020-01-01\n</sample> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByTag", new String[]{"java.lang.String"}, new String[]{"bp"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "getElementById", "java.lang.String", "-1"}, {"org.jsoup.nodes.Element", "hasSameValue", "java.lang.Object", "<i:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "reparentChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"org.jsoup.nodes.Element", "tagName", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "<sample></sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "reparentChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "tagName", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "reparentChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:2>"}, false, 5, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "<{\"a\":1}></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValueContaining", "java.lang.String,java.lang.String", "\t", "-1.5"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<{\"a\":1}>a\n</{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValueContaining", "java.lang.String,java.lang.String", "\t", "-0.5"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "<{\"a\":1}>\n <#root></#root><!DOCTYPE a PUBLIC \"0\" \"sample\">\n</{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueEnding", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0x1F", "110"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "getElementsMatchingOwnText", "java.lang.String", "2147483648"}, {"org.jsoup.nodes.Element", "hasAttributes", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "childNodes", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Element", "is", "java.lang.String", "1E-5"}, {"org.jsoup.nodes.Element", "val", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<0></0> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "childNodesAsArray", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "childNodesAsArray", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<0></0> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "before", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "removeAttr", "java.lang.String", "."}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "childNodesAsArray", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lorg.jsoup.nodes.Node;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<sample></sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"5.", "0xFFFFFFFF"}, false, 4, new String[][]{{"org.jsoup.nodes.Element", "id", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a 5.=\"0xFFFFFFFF\"></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a 5.=\"0xFFFFFFFF\"></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.12345678", "0xFFFFFFFF"}, false, 4, new String[][]{{"org.jsoup.nodes.Element", "id", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a 1.12345678=\"0xFFFFFFFF\"></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a 1.12345678=\"0xFFFFFFFF\"></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.12345678", "0xF.FFFFFFF"}, false, 4, new String[][]{{"org.jsoup.nodes.Element", "id", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a 1.12345678=\"0xF.FFFFFFF\"></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a 1.12345678=\"0xF.FFFFFFF\"></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "attr", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"11.12345678", "0xF.FFFFFFF"}, false, 4, new String[][]{{"org.jsoup.nodes.Element", "id", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a 11.12345678=\"0xF.FFFFFFF\"></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a 11.12345678=\"0xF.FFFFFFF\"></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "setParentNode", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:1>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueMatching", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<null>", "123456789012345678901234567890"}, false, 1, new String[][]{{"org.jsoup.nodes.Element", "prependText", "java.lang.String", "1.5f"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueMatching", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"{\"a\":1}", "123456789012345678901234567890"}, false, 1, new String[][]{{"org.jsoup.nodes.Element", "prependText", "java.lang.String", "1.5f"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<0>\n 1.5f\n</0> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueMatching", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"{\"a\":1}", "123456789012345678901234567890"}, false, 1, new String[][]{{"org.jsoup.nodes.Element", "prependText", "java.lang.String", "1.5f"}}), new String[][]{{"listIterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<0>\n 1.5f\n</0> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueMatching", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"{\"a\":1}", "123456789012345678901234567890"}, false, 1, new String[][]{}), new String[][]{{"listIterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<0></0> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueMatching", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"{3a\":1}-1.5", "1234567890123456789012345678890"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "prependText", "java.lang.String", "1.5f"}}), new String[][]{{"listIterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a>1.5f</a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValueMatching", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"{3a\":1}-1.5", "1234567890123456789012345678890"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "prependText", "java.lang.String", "1.6f"}}), new String[][]{{"listIterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a>1.6f</a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "setBaseUri", new String[]{"java.lang.String"}, new String[]{" />"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "setBaseUri", new String[]{"java.lang.String"}, new String[]{".n.>12:30:45"}, false, 10, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<sample></sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "setBaseUri", new String[]{"java.lang.String"}, new String[]{".n.>12:30:45"}, false, 9, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<0></0> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "id", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "childNodesCopy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1}></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "id", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Element", "childNodesCopy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<sample></sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "id", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "childNodesCopy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y></x \t y> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "id", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.nodes.Element", "childNodesCopy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "id", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jsoup.nodes.Element", "childNodesCopy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<0></0> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "id", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "childNodesCopy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a>></<a><b>t</b></a>> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "id", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.nodes.Element", "text", "java.lang.String", "1.1234567"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a>1.1234567</a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "parents", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "parents", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<0></0> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "attr", new String[]{"java.lang.String", "boolean"}, new String[]{"1.5e300", "false"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "before", "org.jsoup.nodes.Node", "<sample:5>"}, {"org.jsoup.nodes.Element", "getElementsMatchingOwnText", "java.util.regex.Pattern", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "attr", new String[]{"java.lang.String", "boolean"}, new String[]{"1.5e300", "true"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "before", "org.jsoup.nodes.Node", "<sample:5>"}, {"org.jsoup.nodes.Element", "getElementsMatchingOwnText", "java.util.regex.Pattern", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a 1.5e300></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a 1.5e300></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "attr", new String[]{"java.lang.String", "boolean"}, new String[]{"1.5e30\"", "true"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "before", "org.jsoup.nodes.Node", "<sample:5>"}, {"org.jsoup.nodes.Element", "getElementsMatchingOwnText", "java.util.regex.Pattern", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a 1.5e30\"></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a 1.5e30\"></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "attr", new String[]{"java.lang.String", "boolean"}, new String[]{"1.5e30\"", "true"}, false, 1, new String[][]{{"org.jsoup.nodes.Element", "before", "org.jsoup.nodes.Node", "<sample:5>"}, {"org.jsoup.nodes.Element", "getElementsMatchingOwnText", "java.util.regex.Pattern", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<0 1.5e30\"></0> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<0 1.5e30\"></0> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "text", new String[]{"java.lang.String"}, new String[]{"textarea"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a>textarea</a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a>textarea</a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "text", new String[]{"java.lang.String"}, new String[]{"textarea"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "val", "java.lang.String", "-0.0"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a value=\"-0.0\">textarea</a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a value=\"-0.0\">textarea</a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "text", new String[]{"java.lang.String"}, new String[]{"textarea-0.0"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a>textarea-0.0</a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a>textarea-0.0</a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "text", new String[]{"java.lang.String"}, new String[]{"textare-0.0"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "parent", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a>textare-0.0</a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a>textare-0.0</a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "text", new String[]{"java.lang.String"}, new String[]{"tfxtare-0.0"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "parent", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a>tfxtare-0.0</a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a>tfxtare-0.0</a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "text", new String[]{"java.lang.String"}, new String[]{"tfxtare-0-0"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "parent", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a>tfxtare-0-0</a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a>tfxtare-0-0</a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "id", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Element", "tagName", "java.lang.String", "-0.0"}, {"org.jsoup.nodes.Element", "data", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<-0.0></-0.0> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "text", new String[]{"java.lang.String"}, new String[]{"tfx"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "parent", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a>tfx</a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a>tfx</a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "text", new String[]{"java.lang.String"}, new String[]{"tffx"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "parent", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a>tffx</a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a>tffx</a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "text", new String[]{"java.lang.String"}, new String[]{"tffx"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "parent", ""}}), new String[][]{{"hasText", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a>tffx</a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "text", new String[]{"java.lang.String"}, new String[]{"true"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "parent", ""}}), new String[][]{{"hasText", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a>true</a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nextSibling", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nextSibling", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<0></0> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hasText", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "outerHtml", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hasText", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Element", "outerHtml", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<0></0> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hasText", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Element", "outerHtml", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<sample></sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hasText", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "outerHtml", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a>></<a><b>t</b></a>> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hasText", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "outerHtml", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1}></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "parents", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<sample></sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "parents", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"attr", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<sample></sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "parents", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"attr", "java.lang.String", "5"}, {"addAll", "int,java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<sample></sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "parents", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "childNode", "int", "-1"}}), new String[][]{{"attr", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a>></<a><b>t</b></a>> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "parents", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "childNode", "int", "-1"}}), new String[][]{{"attr", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1}></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "parents", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "classNames", ""}, {"org.jsoup.nodes.Element", "childNode", "int", "-1"}}), new String[][]{{"attr", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y></x \t y> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "parents", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "classNames", ""}, {"org.jsoup.nodes.Element", "childNode", "int", "-1"}}), new String[][]{{"attr", "java.lang.String", "5"}, {"prev", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jsoup.select.Selector$SelectorParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingText", new String[]{"java.lang.String"}, new String[]{"1.1234557"}, false, 1, new String[][]{{"org.jsoup.nodes.Element", "tagName", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<0></0> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsMatchingText", new String[]{"java.lang.String"}, new String[]{"1.1234557\\s+"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "tagName", ""}}), new String[][]{{"last", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByClass", new String[]{"java.lang.String"}, new String[]{"#root"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "getElementsContainingText", "java.lang.String", "value"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByClass", new String[]{"java.lang.String"}, new String[]{"#root"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "getElementsContainingText", "java.lang.String", "110"}, {"org.jsoup.nodes.Element", "val", "java.lang.String", "2020-01-01"}, {"org.jsoup.nodes.Element", "classNames", "java.util.Set", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a value=\"2020-01-01\" class=\"sample\"></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tagName", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "className", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a>></<a><b>t</b></a>> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "outerHtml", new String[]{"java.lang.Appendable"}, new String[]{"<empty>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByClass", new String[]{"java.lang.String"}, new String[]{"dd\u00e9--T1H"}, false, 6, new String[][]{{"org.jsoup.nodes.Element", "ensureChildNodes", ""}, {"org.jsoup.nodes.Element", "doSetBaseUri", "java.lang.String", ""}}), new String[][]{{"nextAll", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<sample></sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByClass", new String[]{"java.lang.String"}, new String[]{"dd\u00e8WTTs5H"}, false, 8, new String[][]{{"org.jsoup.nodes.Element", "data", ""}, {"org.jsoup.nodes.Element", "doSetBaseUri", "java.lang.String", ""}}), new String[][]{{"indexOf", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByClass", new String[]{"java.lang.String"}, new String[]{"dd\u00e8WTTs5H"}, false, 8, new String[][]{{"org.jsoup.nodes.Element", "children", ""}, {"org.jsoup.nodes.Element", "data", ""}, {"org.jsoup.nodes.Element", "doSetBaseUri", "java.lang.String", ""}}), new String[][]{{"indexOf", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "unwrap", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "child", "int", "-2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nextElementSibling", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "childNodes", ""}, {"org.jsoup.nodes.Element", "tagName", "java.lang.String", "{3a\":1}-1.5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<{3a\":1}-1.5></{3a\":1}-1.5> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nextElementSibling", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "childNodes", ""}, {"org.jsoup.nodes.Element", "tagName", "java.lang.String", "{3a\":1}-0.5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<{3a\":1}-0.5></{3a\":1}-0.5> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nextElementSibling", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Element", "tagName", "java.lang.String", "{3a\":1}-0.51.25"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<{3a\":1}-0.51.25></{3a\":1}-0.51.25> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nextElementSibling", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Element", "prependText", "java.lang.String", "{3a\":1}-1.5"}, {"org.jsoup.nodes.Element", "tagName", "java.lang.String", "{3a\":1}-0.51.25"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<{3a\":1}-0.51.25>\n {3a\":1}-1.5\n</{3a\":1}-0.51.25> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "nextElementSibling", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "prependText", "java.lang.String", "1"}, {"org.jsoup.nodes.Element", "tagName", "java.lang.String", "{3a\":1}-0.51.25"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<{3a\":1}-0.51.25>\n 1\n</{3a\":1}-0.51.25> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttribute", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "text", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttribute", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "text", ""}, {"org.jsoup.nodes.Element", "cssSelector", ""}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttribute", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "text", ""}, {"org.jsoup.nodes.Element", "cssSelector", ""}}), new String[][]{{"iterator", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttribute", new String[]{"java.lang.String"}, new String[]{"{a\":1}T\t"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "text", ""}, {"org.jsoup.nodes.Element", "cssSelector", ""}}), new String[][]{{"attr", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttribute", new String[]{"java.lang.String"}, new String[]{"3aa\":1~-1.5</"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "text", ""}, {"org.jsoup.nodes.Element", "cssSelector", ""}}), new String[][]{{"last", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "cssSelector", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "val", "java.lang.String", "Pattern syntax error: "}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> value=\"Pattern syntax error: \"></<a><b>t</b></a>> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "child", new String[]{"int"}, new String[]{"10"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "tagName", "java.lang.String", "<a>b</a>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "cssSelector", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "val", "java.lang.String", "Pattern syntax error: a,b,c"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a> value=\"Pattern syntax error: a,b,c\"></<a><b>t</b></a>> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "cssSelector", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Element", "val", "java.lang.String", "Pattern syntax error: a,b,c"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a value=\"Pattern syntax error: a,b,c\"></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "cssSelector", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "val", "java.lang.String", "Pattern\037syntax error: a,b,c"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a value=\"Pattern\037syntax error: a,b,c\"></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "cssSelector", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "val", "java.lang.String", "Pattern\037syntax e"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a value=\"Pattern\037syntax e\"></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "cssSelector", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "cssSelector", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "<0></0> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "cssSelector", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "<sample></sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "cssSelector", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Element", "html", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "<sample></sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "childNodesCopy", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "childNodesCopy", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"trimToSize", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<0></0> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "childNodesCopy", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"trimToSize", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<sample></sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "childNodesCopy", new String[]{}, new String[]{}, false, 15, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "childNodesCopy", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "data", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a>></<a><b>t</b></a>> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "childNodesCopy", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "data", ""}}), new String[][]{{"listIterator", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "select", new String[]{"java.lang.String"}, new String[]{"</"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jsoup.select.Selector$SelectorParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "childNodesCopy", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "data", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<{\"a\":1}></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "childNodesCopy", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "data", ""}}), new String[][]{{"iterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y></x \t y> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "childNodesCopy", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jsoup.nodes.Element", "wrap", "java.lang.String", "br"}}), new String[][]{{"iterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<sample></sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "tagName", new String[]{"java.lang.String"}, new String[]{"i"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<i></i> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<i></i> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "childNodesCopy", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jsoup.nodes.Element", "wrap", "java.lang.String", "bq"}, {"org.jsoup.nodes.Element", "dataNodes", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "childNodesCopy", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.jsoup.nodes.Element", "wrap", "java.lang.String", "aq"}, {"org.jsoup.nodes.Element", "dataNodes", ""}}), new String[][]{{"iterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "hasClass", "java.lang.String", "null"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<a>\n <#root></#root><!DOCTYPE a PUBLIC \"0\" \"sample\"></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hasClass", new String[]{"java.lang.String"}, new String[]{"Pattern syntax error: "}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "val", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "val", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<0></0> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "data", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "data", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<0></0> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "data", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<sample></sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "html", new String[]{"java.lang.String"}, new String[]{"-1.5"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a>-1.5</a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a>-1.5</a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "html", new String[]{"java.lang.String"}, new String[]{"[1,2]"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a>[1,2]</a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a>[1,2]</a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "html", new String[]{"java.lang.String"}, new String[]{"[0,2]"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a>[0,2]</a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a>[0,2]</a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hasAttributes", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "classNames", "java.util.Set", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1}></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hasAttributes", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "classNames", "java.util.Set", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<{\"a\":1} class=\"a 0\"></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hasAttributes", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jsoup.nodes.Element", "getElementsMatchingText", "java.lang.String", "1.5f"}, {"org.jsoup.nodes.Element", "classNames", "java.util.Set", "<sample:1>"}, {"org.jsoup.nodes.Element", "unwrap", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<sample class=\"a 0\"></sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hasAttributes", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jsoup.nodes.Element", "getElementsMatchingText", "java.lang.String", "1.25"}, {"org.jsoup.nodes.Element", "classNames", "java.util.Set", "<sample:1>"}, {"org.jsoup.nodes.Element", "unwrap", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y class=\"a 0\"></x \t y> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hasAttributes", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.nodes.Element", "getElementsMatchingText", "java.lang.String", "1.25"}, {"org.jsoup.nodes.Element", "classNames", "java.util.Set", "<sample:1>"}, {"org.jsoup.nodes.Element", "unwrap", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a class=\"a 0\"></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hasAttributes", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jsoup.nodes.Element", "getElementsMatchingText", "java.lang.String", "l11.25"}, {"org.jsoup.nodes.Element", "unwrap", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hasAttributes", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jsoup.nodes.Element", "getElementsMatchingText", "java.lang.String", "l11.257"}, {"org.jsoup.nodes.Element", "appendTo", "org.jsoup.nodes.Element", "<sample:1>"}, {"org.jsoup.nodes.Element", "unwrap", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "<sample></sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"org.jsoup.nodes.Element", "equals", "java.lang.Object", "<i:-1>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<sample><?a?>\n</sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<sample><?a?>\n</sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"org.jsoup.nodes.Element", "equals", "java.lang.Object", "<i:-1>"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<sample>a\n</sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<sample>a\n</sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:4>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<sample>\n <!--a-->\n</sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<sample>\n <!--a-->\n</sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:9>"}, false, 6, new String[][]{{"org.jsoup.nodes.Element", "getElementsByClass", "java.lang.String", "null"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<sample>0\n</sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<sample>0\n</sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"org.jsoup.nodes.Element", "getElementsByClass", "java.lang.String", "null"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<sample><!DOCTYPE a PUBLIC \"0\" \"sample\">\n</sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<sample><!DOCTYPE a PUBLIC \"0\" \"sample\">\n</sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"org.jsoup.nodes.Element", "getElementsByClass", "java.lang.String", "null"}}), new String[][]{{"getElementsByIndexLessThan", "int", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<sample><!DOCTYPE a PUBLIC \"0\" \"sample\">\n</sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:2>"}, false, 6, new String[][]{}), new String[][]{{"getElementsByIndexLessThan", "int", "7"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<sample>\n <#root></#root>\n</sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "childNode", new String[]{"int"}, new String[]{"0"}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "toString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:0>"}, false, 11, new String[][]{{"org.jsoup.nodes.Element", "insertChildren", "int,java.util.Collection", "524287", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:0>"}, false, 12, new String[][]{{"org.jsoup.nodes.Element", "insertChildren", "int,java.util.Collection", "524287", "<sample:2>"}}), new String[][]{{"filter", "org.jsoup.select.NodeFilter", "6"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a>\n <!--a--></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a>\n <!--a--></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:1>"}, false, 12, new String[][]{{"org.jsoup.nodes.Element", "insertChildren", "int,java.util.Collection", "524287", "<sample:2>"}}), new String[][]{{"filter", "org.jsoup.select.NodeFilter", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a>a</a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a>a</a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "appendChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:5>"}, false, 10, new String[][]{{"org.jsoup.nodes.Element", "insertChildren", "int,java.util.Collection", "524287", "<sample:2>"}}), new String[][]{{"filter", "org.jsoup.select.NodeFilter", "4"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<sample>\n a\n</sample> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<sample>\n a\n</sample> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "textNodes", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "textNodes", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<0></0> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "textNodes", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<sample></sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "textNodes", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<x \t y></x \t y> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "textNodes", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.nodes.Element", "append", "java.lang.String", "<a>b</a>"}, {"org.jsoup.nodes.Element", "replaceChild", "org.jsoup.nodes.Node,org.jsoup.nodes.Node", "<sample:5>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a><a>b</a></a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "textNodes", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.nodes.Element", "append", "java.lang.String", "<a>b</a>"}, {"org.jsoup.nodes.Element", "replaceChild", "org.jsoup.nodes.Node,org.jsoup.nodes.Node", "<sample:5>", "<sample:4>"}}), new String[][]{{"lastIndexOf", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a><a>b</a></a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "textNodes", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jsoup.nodes.Element", "append", "java.lang.String", "<a>b</a>"}, {"org.jsoup.nodes.Element", "replaceChild", "org.jsoup.nodes.Node,org.jsoup.nodes.Node", "<sample:5>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "textNodes", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.nodes.Element", "append", "java.lang.String", ""}, {"org.jsoup.nodes.Element", "doClone", "org.jsoup.nodes.Node", "<sample:5>"}, {"org.jsoup.nodes.Element", "replaceChild", "org.jsoup.nodes.Node,org.jsoup.nodes.Node", "<sample:5>", "<sample:4>"}}), new String[][]{{"lastIndexOf", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "textNodes", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jsoup.nodes.Element", "append", "java.lang.String", ""}, {"org.jsoup.nodes.Element", "doClone", "org.jsoup.nodes.Node", "<sample:5>"}, {"org.jsoup.nodes.Element", "replaceChild", "org.jsoup.nodes.Node,org.jsoup.nodes.Node", "<sample:5>", "<sample:4>"}}), new String[][]{{"add", "java.lang.Object", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "dataNodes", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a>\n <!--a--></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a>\n <!--a--></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a><!DOCTYPE a PUBLIC \"0\" \"sample\"></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a><!DOCTYPE a PUBLIC \"0\" \"sample\"></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "prependChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:1>"}, false), new String[][]{{"getElementsContainingOwnText", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a>a</a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hasParent", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Element", "appendText", "java.lang.String", ".5"}, {"org.jsoup.nodes.Element", "addChildren", "int,org.jsoup.nodes.Node[]", "2147483647", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<0>\n .5\n</0> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hasParent", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Element", "appendText", "java.lang.String", ".5"}, {"org.jsoup.nodes.Element", "addChildren", "int,org.jsoup.nodes.Node[]", "2147483647", "<empty>"}, {"org.jsoup.nodes.Element", "previousElementSibling", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<0>\n .5\n</0> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hasParent", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Element", "appendText", "java.lang.String", ".5"}, {"org.jsoup.nodes.Element", "addChildren", "int,org.jsoup.nodes.Node[]", "2147483647", "<empty>"}, {"org.jsoup.nodes.Element", "previousElementSibling", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<sample>\n .5\n</sample> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hasParent", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Element", "appendText", "java.lang.String", "1.12345678"}, {"org.jsoup.nodes.Element", "addChildren", "int,org.jsoup.nodes.Node[]", "2147483647", "<empty>"}, {"org.jsoup.nodes.Element", "previousElementSibling", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<sample>\n 1.12345678\n</sample> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hasParent", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "appendText", "java.lang.String", "1.12345678"}, {"org.jsoup.nodes.Element", "addChildren", "int,org.jsoup.nodes.Node[]", "2147483647", "<empty>"}, {"org.jsoup.nodes.Element", "previousElementSibling", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a>>\n 1.12345678\n</<a><b>t</b></a>> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hasParent", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "appendText", "java.lang.String", ""}, {"org.jsoup.nodes.Element", "previousElementSibling", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a>>\n</<a><b>t</b></a>> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "hasParent", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jsoup.nodes.Element", "filter", "org.jsoup.select.NodeFilter", "<sample:6>"}, {"org.jsoup.nodes.Element", "appendText", "java.lang.String", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "parent", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "outerHtml", "java.lang.Appendable", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<<a><b>t</b></a>></<a><b>t</b></a>> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "baseUri", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "cssSelector", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValueNot", "java.lang.String,java.lang.String", "PT1H", " />"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "<sample></sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByAttributeValue", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1E-5", "/a/b"}, false, 3, new String[][]{{"org.jsoup.nodes.Element", "childNodeSize", ""}, {"org.jsoup.nodes.Element", "getElementsByAttributeStarting", "java.lang.String", "1E-5"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<<a><b>t</b></a>></<a><b>t</b></a>> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "ownerDocument", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "data", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "<x \t y></x \t y> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "data", new String[]{}, new String[]{}, false, 11, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "doSetBaseUri", new String[]{"java.lang.String"}, new String[]{"1.25"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByClass", new String[]{"java.lang.String"}, new String[]{"0x123456789"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "getElementsByClass", "java.lang.String", "a"}}), new String[][]{{"hasText", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "text", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, false, 1, new String[][]{{"org.jsoup.nodes.Element", "getElementsContainingOwnText", "java.lang.String", " "}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<0>\n http://example.com/a?b=c\n</0> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<0>\n http://example.com/a?b=c\n</0> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "addClass", new String[]{"java.lang.String"}, new String[]{"-f"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "text", "java.lang.String", "1234567890123456789012345678890"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a class=\"-f\">1234567890123456789012345678890</a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a class=\"-f\">1234567890123456789012345678890</a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "addClass", new String[]{"java.lang.String"}, new String[]{"-5."}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "text", "java.lang.String", "1234567890123456789012345678890"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a class=\"-5.\">1234567890123456789012345678890</a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a class=\"-5.\">1234567890123456789012345678890</a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "addClass", new String[]{"java.lang.String"}, new String[]{",5."}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "text", "java.lang.String", "1234567890123456789012345678890"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a class=\",5.\">1234567890123456789012345678890</a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a class=\",5.\">1234567890123456789012345678890</a> {hasParent=false, hasText=true, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByTag", new String[]{"java.lang.String"}, new String[]{"bq"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "getElementById", "java.lang.String", "-1"}});
  assertNotNull(actual);
  assertEquals("org.jsoup.select.Elements", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "getElementsByTag", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "getElementById", "java.lang.String", "-1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "reparentChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "tagName", ""}, {"org.jsoup.nodes.Element", "after", "org.jsoup.nodes.Node", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "reparentChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"org.jsoup.nodes.Element", "tagName", ""}, {"org.jsoup.nodes.Element", "after", "org.jsoup.nodes.Node", "<sample:6>"}, {"org.jsoup.nodes.Element", "classNames", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<0></0> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "reparentChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.jsoup.nodes.Element", "tagName", ""}, {"org.jsoup.nodes.Element", "after", "org.jsoup.nodes.Node", "<sample:6>"}, {"org.jsoup.nodes.Element", "classNames", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "reparentChild", new String[]{"org.jsoup.nodes.Node"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"org.jsoup.nodes.Element", "tagName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<sample></sample> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "traverse", new String[]{"org.jsoup.select.NodeVisitor"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("org.jsoup.nodes.Element", actual.getClass().getName());
  assertEquals("<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "traverse", new String[]{"org.jsoup.select.NodeVisitor"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "hasSameValue", "java.lang.Object", "<s:a>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<{\"a\":1}>a\n</{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "hasSameValue", "java.lang.Object", "<s:a>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<{\"a\":1}>\n <#root></#root><!DOCTYPE a PUBLIC \"0\" \"sample\">\n</{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<empty>"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "hasSameValue", "java.lang.Object", "<s:a>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<{\"a\":1}></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<null>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "addChildren", new String[]{"org.jsoup.nodes.Node[]"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.jsoup.nodes.Element", "getElementsByAttributeValueContaining", "java.lang.String,java.lang.String", "\t", "-1.5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<{\"a\":1}>a\n</{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "previousSibling", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jsoup.nodes.Element", "is", "java.lang.String", "#root"}, {"org.jsoup.nodes.Element", "siblingElements", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "previousSibling", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jsoup.nodes.Element", "is", "java.lang.String", "#root"}, {"org.jsoup.nodes.Element", "siblingElements", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "<0></0> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "indent", new String[]{"java.lang.Appendable", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:0>", "10", "<sample:6>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "<a></a> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Element", "org.jsoup.nodes.Element", "indent", new String[]{"java.lang.Appendable", "int", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<sample:5>", "10", "<sample:1>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "<{\"a\":1}></{\"a\":1}> {hasParent=false, hasText=false, isBlock=false}", SearchInputFactory_scaffolding.receiverState());
 }
}
